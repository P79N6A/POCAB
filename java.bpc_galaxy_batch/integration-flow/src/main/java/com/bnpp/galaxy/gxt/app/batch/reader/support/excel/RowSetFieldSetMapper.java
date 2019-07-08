package com.bnpp.galaxy.gxt.app.batch.reader.support.excel;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;
import org.springframework.batch.item.file.transform.DefaultFieldSetFactory;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.batch.item.file.transform.FieldSetFactory;

/**
 * Adapter that may be used as {@link RowSet} for {@link org.springframework.batch.item.excel.AbstractExcelItemReader
 * Excel readers} to produce standard Spring {@link FieldSet}s.
 */
public class RowSetFieldSetMapper implements RowMapper<FieldSet> {

    private boolean         strict          = true;
    private FieldSetFactory fieldSetFactory = new DefaultFieldSetFactory();

    /**
     * If set to <code>false</code>, then column names will not be mapped if they are not all known. If
     * <code>true</code> (the default), column names will be mapped if at least one is known ; in such case an
     * exception will be thrown if not all columns are named.
     *
     * @param strict Whether to enable/disable strict behavior
     */
    public void setStrict(boolean strict) {
        this.strict = strict;
    }

    public void setFieldSetFactory(FieldSetFactory fieldSetFactory) {
        this.fieldSetFactory = fieldSetFactory;
    }

    @Override
    public FieldSet mapRow(RowSet rs) {
        String[] values = rs.getCurrentRow();
        String[] names = rs.getMetaData().getColumnNames();
        boolean hasNames = names != null && names.length != 0;

        if (hasNames && (strict || names.length == values.length)) {
            // Will throw an exception if not all columns have names
            return fieldSetFactory.create(values, names);
        } else {
            return fieldSetFactory.create(values);
        }
    }

}
