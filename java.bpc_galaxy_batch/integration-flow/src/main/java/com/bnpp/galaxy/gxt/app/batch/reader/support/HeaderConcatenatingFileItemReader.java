package com.bnpp.galaxy.gxt.app.batch.reader.support;

import java.util.Collections;
import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemStreamException;
import org.springframework.batch.item.file.transform.DefaultFieldSetFactory;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.batch.item.file.transform.FieldSetFactory;
import org.springframework.batch.item.support.AbstractItemCountingItemStreamItemReader;
import org.springframework.util.Assert;

/**
 * Decorator for {@link org.springframework.batch.item.ItemReader ItemReader}s allowing to concatenate a header line to
 * all following lines of the file. Header line does not produce an item. Optionaly, a subset of the header line may be
 * used (see {@link HeaderConcatenatingFileItemReader#setHeaderColumns(int[])}. Header line is not required to have the
 * same structure as other lines and has no structure requirement at all.
 * <p>
 * Below is a sample for a CSV file (typically read using {@link org.springframework.batch.item.file.FlatFileItemReader
 * FlatFileItemReader}):
 * <pre>
 * VAL_1A;VAL_1B;VAL_1D
 * VAL_2A;VAL_2B;VAL_2C;VAL_2D
 * VAL_3A;VAL_3B;VAL_3C;VAL_3D
 * </pre>
 * Such a reader having header column indexes set to [1, 2] will produces 2 items:
 * <pre>
 * VAL_2A;VAL_2B;VAL_2C;VAL_2D;VAL_1B;VAL_1D
 * VAL_3A;VAL_3B;VAL_3C;VAL_3D;VAL_1B;VAL_1D
 * </pre>
 *
 * @param <T>
 */
public class HeaderConcatenatingFileItemReader<T> extends AbstractTransformingFileItemReader<T> {

    private static final String GROUP_READ_HEADER_VALUES = "group_read.header.values";
    private static final String GROUP_READ_HEADER_NAMES  = "group_read.header.names";

    private FieldSetFactory fieldSetFactory = new DefaultFieldSetFactory();
    private int[]           headerColumns;
    private String[]        headerValues;
    private String[]        headerNames;

    public void setFieldSetFactory(FieldSetFactory fieldSetFactory) {
        this.fieldSetFactory = fieldSetFactory;
    }

    public void setHeaderColumns(int[] headerColumns) {
        this.headerColumns = headerColumns;
    }

    @Override
    protected FieldSet readDelegate() throws Exception {
        if (headerValues == null) {
            FieldSet header = super.readDelegate();

            if (header == null) {
                return null;
            }

            storeHeader(header);
        }

        return super.readDelegate();
    }

    private void storeHeader(FieldSet header) {
        String[] srcValues = header.getValues();
        String[] srcNames = header.hasNames() ? header.getNames() : null;

        if (headerColumns == null) {
            headerValues = srcValues;
            headerNames = srcNames;
        } else {
            String[] values = new String[headerColumns.length];
            String[] names = new String[headerColumns.length];

            for (int i = 0; i < headerColumns.length; i++) {
                values[i] = srcValues[headerColumns[i]];

                if (srcNames != null) {
                    names[i] = srcNames[headerColumns[i]];
                }
            }

            headerValues = values;
            headerNames = names;
        }
    }

    @Override
    protected List<FieldSet> transform(FieldSet fieldSet) {
        FieldSet result;
        String[] values = fieldSet.getValues();
        String[] newValues = new String[values.length + headerValues.length];

        System.arraycopy(values, 0, newValues, 0, values.length);
        System.arraycopy(headerValues, 0, newValues, values.length, headerValues.length);

        if (fieldSet.hasNames() && headerNames != null) {
            String[] names = fieldSet.getNames();
            String[] newNames = new String[names.length + headerNames.length];

            System.arraycopy(names, 0, newNames, 0, names.length);
            System.arraycopy(headerNames, 0, newNames, names.length, headerNames.length);

            result = fieldSetFactory.create(newValues, newNames);
        } else {
            result = fieldSetFactory.create(newValues);
        }

        return Collections.singletonList(result);
    }

    @Override
    public void open(ExecutionContext executionContext) throws ItemStreamException {
        super.open(executionContext);

        if (isSaveState()) {
            AbstractItemCountingItemStreamItemReader<?> d = (AbstractItemCountingItemStreamItemReader<?>) getDelegate();

            if (executionContext.containsKey(d.getExecutionContextKey(GROUP_READ_HEADER_VALUES))) {
                headerValues = (String[]) executionContext.get(d.getExecutionContextKey(GROUP_READ_HEADER_VALUES));
                headerNames = (String[]) executionContext.get(d.getExecutionContextKey(GROUP_READ_HEADER_NAMES));
            }
        }
    }

    @Override
    public void update(ExecutionContext executionContext) throws ItemStreamException {
        super.update(executionContext);

        if (isSaveState()) {
            AbstractItemCountingItemStreamItemReader<?> d = (AbstractItemCountingItemStreamItemReader<?>) getDelegate();
            Assert.notNull(executionContext, "ExecutionContext must not be null");
            executionContext.put(d.getExecutionContextKey(GROUP_READ_HEADER_VALUES), headerValues);
            executionContext.put(d.getExecutionContextKey(GROUP_READ_HEADER_NAMES), headerNames);
        }
    }

}
