package com.bnpp.galaxy.gxt.app.batch.reader.support;

import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStream;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.file.ResourceAwareItemReaderItemStream;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.batch.item.support.AbstractItemCountingItemStreamItemReader;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.core.io.Resource;
import org.springframework.util.Assert;

/**
 * Abstract base class for item readers able to transform items from a delegate reader instance.
 * <p/>
 * May typically be used to flatten a flat file (often CSV), an Excel file or any other file type.
 *
 * @param <T>
 */
public abstract class AbstractTransformingFileItemReader<T> implements ResourceAwareItemReaderItemStream<T>, InitializingBean {

    private static final String GROUP_READ_COUNT = "group_read.count";

    private ItemReader<FieldSet> delegate;
    private FieldSetMapper<T>    fieldSetMapper;
    private List<FieldSet>       currentFieldSet   = null;
    private int                  currentGroupIndex = 0;

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(delegate, "delegate is required");
        Assert.notNull(fieldSetMapper, "FieldSetMapper is required");

        if (delegate instanceof InitializingBean) {
            ((InitializingBean) delegate).afterPropertiesSet();
        }
    }

    protected ItemReader<FieldSet> getDelegate() {
        return delegate;
    }

    /**
     * The the mandatory delegate reader from which source items will be read.
     * <p>
     * That reader is required to produce {@link FieldSet}s as items. See the provided adapters to easily configure
     * readers to produce {@link FieldSet}.
     *
     * @param delegate The delegate reader
     * @see com.bnpp.galaxy.gxt.app.batch.reader.support.excel.RowSetFieldSetMapper RowSetFieldSetMapper
     */
    public void setDelegate(ItemReader<FieldSet> delegate) {
        this.delegate = delegate;
    }

    /**
     * Set the mapper that will map final items into custom objects
     *
     * @param fieldSetMapper The mapper
     */
    public void setFieldSetMapper(FieldSetMapper<T> fieldSetMapper) {
        this.fieldSetMapper = fieldSetMapper;
    }

    @Override
    public T read() throws Exception {
        if (currentFieldSet == null) {
            FieldSet newValue = readDelegate();

            if (newValue == null) {
                return null;
            }

            List<FieldSet> newList = transform(newValue);

            if (newList == null) {
                return null;
            }

            currentFieldSet = newList;
        }

        FieldSet item = currentFieldSet.get(currentGroupIndex++);

        if (currentGroupIndex > currentFieldSet.size() - 1) {
            currentGroupIndex = 0;
            currentFieldSet = null;
        }

        return fieldSetMapper.mapFieldSet(item);
    }

    protected FieldSet readDelegate() throws Exception {
        return delegate.read();
    }

    abstract protected List<FieldSet> transform(FieldSet fieldSet);

    @Override
    public void setResource(Resource resource) {
        if (delegate instanceof ResourceAwareItemReaderItemStream) {
            ((ResourceAwareItemReaderItemStream) delegate).setResource(resource);
        }
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        if (delegate instanceof ItemStream) {
            ((ItemStream) delegate).open(executionContext);
        }

        if (isSaveState()) {
            AbstractItemCountingItemStreamItemReader<?> d = (AbstractItemCountingItemStreamItemReader<?>) delegate;

            if (executionContext.containsKey(d.getExecutionContextKey(GROUP_READ_COUNT))) {
                currentGroupIndex = executionContext.getInt(d.getExecutionContextKey(GROUP_READ_COUNT));
            }
        }
    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {
        if (delegate instanceof ItemStream) {
            ((ItemStream) delegate).update(executionContext);
        }

        if (isSaveState()) {
            AbstractItemCountingItemStreamItemReader<?> d = (AbstractItemCountingItemStreamItemReader<?>) delegate;
            Assert.notNull(executionContext, "ExecutionContext must not be null");
            executionContext.putInt(d.getExecutionContextKey(GROUP_READ_COUNT), currentGroupIndex);
        }
    }

    @Override
    public void close() throws ItemStreamException {
        if (delegate instanceof ItemStream) {
            ((ItemStream) delegate).close();
        }

        currentGroupIndex = 0;
    }

    protected boolean isSaveState() {
        if (delegate instanceof AbstractItemCountingItemStreamItemReader) {
            AbstractItemCountingItemStreamItemReader<?> d = (AbstractItemCountingItemStreamItemReader<?>) delegate;

            return d.isSaveState();
        }

        return false;
    }

}
