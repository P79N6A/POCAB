package com.bnpp.galaxy.gxt.app.batch.reader.support;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.junit.Test;

import org.springframework.batch.item.file.transform.FieldSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class ColumnGroupedFileItemReaderTest {

    @Test
    public void testDelimiter() throws Exception {
        List<MyItem> items;

        items = read(";", new int[]{0, 1}, "AAA;BBB;0;1;2;3");
        assertThat(items).hasSize(4);

        items = read(",", new int[]{0, 1}, "AAA,BBB,0,1,2,3");
        assertThat(items).hasSize(4);

        items = read("$", new int[]{0, 1}, "AAA$BBB$3", "CCC$DDD$3");
        assertThat(items).hasSize(2);
    }

    private static List<MyItem> read(String colDelimiter, int[] pivots, String... resourceLines) throws Exception {
        ColumnFlatteningFileItemReader<MyItem> reader = new ColumnFlatteningFileItemReader<>();

        reader.setPivotColumnsIndexes(pivots);

        ReaderUtils.configureHeaderGroupedFileItemReader(
                reader,
                MyItem::new,
                colDelimiter,
                resourceLines
        );

        return ReaderUtils.collect(reader);
    }

    @Test
    public void testSingleItem() throws Exception {
        List<MyItem> items = read(";", new int[]{0, 1}, "AAA;BBB;0;1;2;3");

        assertThat(items).hasSize(4);
        assertThat(items).containsExactly(
                new MyItem("AAA", "BBB", 0),
                new MyItem("AAA", "BBB", 1),
                new MyItem("AAA", "BBB", 2),
                new MyItem("AAA", "BBB", 3)
        );
    }

    @Test
    public void testMultipleItem() throws Exception {
        List<MyItem> items = read(";", new int[]{0, 1},
                                  "AAA;BBB;0;1;2;3", "CCC;DDD;4;5;6", "EEE;FFF;7;8;9;10;11");

        assertThat(items).hasSize(12);
        assertThat(items).containsExactly(
                new MyItem("AAA", "BBB", 0),
                new MyItem("AAA", "BBB", 1),
                new MyItem("AAA", "BBB", 2),
                new MyItem("AAA", "BBB", 3),
                new MyItem("CCC", "DDD", 4),
                new MyItem("CCC", "DDD", 5),
                new MyItem("CCC", "DDD", 6),
                new MyItem("EEE", "FFF", 7),
                new MyItem("EEE", "FFF", 8),
                new MyItem("EEE", "FFF", 9),
                new MyItem("EEE", "FFF", 10),
                new MyItem("EEE", "FFF", 11)
        );
    }

    @Test
    public void testPivotOnlyItem() throws Exception {
        List<MyItem> items = read(";", new int[]{0, 1, 2}, "AAA;BBB;0", "AAA;BBB;1");

        assertThat(items).hasSize(2);
        assertThat(items).containsExactly(
                new MyItem("AAA", "BBB", 0),
                new MyItem("AAA", "BBB", 1)
        );
    }

    @Test
    public void testNoPivotItem() throws Exception {
        List<MyItem> items = read(";", new int[0], "AAA;BBB;0", "CCC;DDD;1");

        assertThat(items).hasSize(6);
        assertThat(items).containsExactly(
                new MyItem("AAA"),
                new MyItem("BBB"),
                new MyItem("0"),
                new MyItem("CCC"),
                new MyItem("DDD"),
                new MyItem("1")
        );
    }

    @Data
    @EqualsAndHashCode
    static class MyItem {
        String fieldA;
        String fieldB;
        int    fieldC;

        MyItem(String fieldA) {
            this.fieldA = fieldA;
        }

        MyItem(String fieldA, String fieldB, int fieldC) {
            this.fieldA = fieldA;
            this.fieldB = fieldB;
            this.fieldC = fieldC;
        }

        MyItem(FieldSet fieldSet) {
            if (fieldSet.getFieldCount() == 3) {
                fieldA = fieldSet.readString(0);
                fieldB = fieldSet.readString(1);
                fieldC = fieldSet.readInt(2);
            } else if (fieldSet.getFieldCount() == 1) {
                fieldA = fieldSet.readString(0);
            } else {
                fail("Invalid field set, expected field count of 1 or 3, given: %s", fieldSet);
            }
        }

    }

}
