package com.bnpp.galaxy.gxt.app.batch.reader.support;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.file.transform.DefaultFieldSetFactory;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.batch.item.file.transform.FieldSetFactory;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * Decorator for {@link ItemReader}s allowing to flatten items from delegate, using "pivot columns".
 * <p/>
 * Below is a sample for a CSV file (typically read using {@link org.springframework.batch.item.file.FlatFileItemReader
 * FlatFileItemReader}):
 * <pre>
 * VAL_1A;VAL_1B;VAL_1C;VAL_1D
 * VAL_2A;VAL_2B;VAL_2C;VAL_2D
 * </pre>
 * Such a reader having pivot column indexes set to [0, 1] will produces 4 items:
 * <pre>
 * VAL_1A;VAL_1B;VAL_1C
 * VAL_1A;VAL_1B;VAL_1D
 * VAL_2A;VAL_2B;VAL_2C
 * VAL_2A;VAL_2B;VAL_2D
 * </pre>
 *
 * @param <T>
 */
public class ColumnFlatteningFileItemReader<T> extends AbstractTransformingFileItemReader<T> {

    private FieldSetFactory fieldSetFactory = new DefaultFieldSetFactory();
    private int[]           pivotColumnsIndexes;

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(pivotColumnsIndexes, "pivotColumnsIndexes is required");

        super.afterPropertiesSet();
    }

    @Override
    protected List<FieldSet> transform(FieldSet fieldSet) {
        String[] valuesToDispatch = extractNonPivots(fieldSet.getValues());
        String[] namesToDispatch = fieldSet.hasNames() ? extractNonPivots(fieldSet.getNames()) : null;

        // Only pivot columns are to be used, no dispatchable columns.
        // Just return input fieldset as-is, encapsulated in a singleton list
        if (valuesToDispatch.length == 0) {
            FieldSet clone = fieldSet.hasNames()
                    ? fieldSetFactory.create(fieldSet.getValues(), fieldSet.getNames())
                    : fieldSetFactory.create(fieldSet.getValues());

            return Collections.singletonList(clone);
        }

        List<FieldSet> fieldSets = new ArrayList<>();
        String[] values = extractPivots(fieldSet.getValues());
        String[] names = fieldSet.hasNames() ? extractPivots(fieldSet.getNames()) : null;

        for (int i = 0; i < valuesToDispatch.length; i++) {
            String[] newValues = StringUtils.addStringToArray(values, valuesToDispatch[i]);

            if (namesToDispatch == null) {
                fieldSets.add(fieldSetFactory.create(newValues));
            } else {
                String[] newNames = StringUtils.addStringToArray(names, namesToDispatch[i]);

                fieldSets.add(fieldSetFactory.create(newValues, newNames));
            }
        }

        return fieldSets;
    }

    private String[] extractNonPivots(String[] src) {
        String[] nonPivots = new String[src.length - pivotColumnsIndexes.length];

        for (int i = 0, k = 0; i < src.length; i++) {
            if (!isPivotIndex(i)) {
                nonPivots[k++] = src[i];
            }
        }

        return nonPivots;
    }

    private String[] extractPivots(String[] src) {
        String[] pivots = new String[pivotColumnsIndexes.length];

        for (int i = 0; i < pivotColumnsIndexes.length; i++) {
            int index = pivotColumnsIndexes[i];

            pivots[i] = src[index];
        }

        return pivots;
    }

    private boolean isPivotIndex(int index) {
        for (int pivotColumnsIndex : pivotColumnsIndexes) {
            if (index == pivotColumnsIndex) {
                return true;
            }
        }

        return false;
    }

    public void setFieldSetFactory(FieldSetFactory fieldSetFactory) {
        this.fieldSetFactory = fieldSetFactory;
    }

    public void setPivotColumnsIndexes(int[] pivotColumnsIndexes) {
        this.pivotColumnsIndexes = pivotColumnsIndexes;
    }

}
