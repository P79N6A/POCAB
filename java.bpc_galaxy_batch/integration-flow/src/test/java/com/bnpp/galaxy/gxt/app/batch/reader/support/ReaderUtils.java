package com.bnpp.galaxy.gxt.app.batch.reader.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemStreamReader;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.mapping.PassThroughFieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.core.io.ByteArrayResource;

import com.bnpp.galaxy.gxt.app.batch.reader.support.AbstractTransformingFileItemReader;

import static org.mockito.Mockito.mock;

final class ReaderUtils {

    private ReaderUtils() {
        throw new UnsupportedOperationException();
    }

    static <I, T extends AbstractTransformingFileItemReader<I>> void configureHeaderGroupedFileItemReader(T reader,
                                                                                                          FieldSetMapper<I> fsm,
                                                                                                          String colDelimiter,
                                                                                                          String... resourceLines) {
        byte[] resourceBytes = String.join("\n", resourceLines).getBytes();

        reader.setDelegate(createDelegate(colDelimiter));
        reader.setFieldSetMapper(fsm);
        reader.setResource(new ByteArrayResource(resourceBytes));

        try {
            reader.afterPropertiesSet();
        } catch (Exception e) {
            throw new AssertionError("Should not happen", e);
        }
    }

    private static ItemReader<FieldSet> createDelegate(String colDelimiter) {
        FlatFileItemReader<FieldSet> delegate = new FlatFileItemReader<>();
        DefaultLineMapper<FieldSet> lineMapper = new DefaultLineMapper<>();

        lineMapper.setLineTokenizer(new DelimitedLineTokenizer(colDelimiter));
        lineMapper.setFieldSetMapper(new PassThroughFieldSetMapper());
        delegate.setLineMapper(lineMapper);

        return delegate;
    }

    static <T> List<T> collect(ItemStreamReader<T> r) throws Exception {
        List<T> items = new ArrayList<>();
        T item;

        try {
            r.open(mock(ExecutionContext.class));

            do {
                item = r.read();

                if (item != null) {
                    items.add(item);
                }
            } while (item != null);

        } finally {
            r.close();
        }

        return items;
    }

}
