package com.bnpp.galaxy.gxt.app.batch.reader.support;

import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.junit.Test;

import org.springframework.batch.item.file.transform.FieldSet;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

public class HeaderGroupedFileItemReaderTest {

    @Test
    public void testDelimiter() throws Exception {
        List<MyItem> items;

        items = read(";", "AAA;BBB", "0");
        assertThat(items).hasSize(1);

        items = read(",", "AAA,BBB,0");
        assertThat(items).isEmpty();
    }

    private static List<MyItem> read(String colDelimiter, String... resourceLines) throws Exception {
        HeaderConcatenatingFileItemReader<MyItem> reader = new HeaderConcatenatingFileItemReader<>();

        ReaderUtils.configureHeaderGroupedFileItemReader(
                reader,
                MyItem::new,
                colDelimiter,
                resourceLines
        );

        return ReaderUtils.collect(reader);
    }

    @Test
    public void testHeaderOnlyItem() throws Exception {
        List<MyItem> items = read(";", "AAA;BBB;0");

        assertThat(items).isEmpty();
    }

    @Test
    public void testSingleItem() throws Exception {
        List<MyItem> items = read(";", "HEADER", "AAA;BBB");

        assertThat(items).hasSize(1);
        assertThat(items).containsExactly(new MyItem("AAA", "BBB", "HEADER"));
    }

    @Test
    public void testMultipleItem() throws Exception {
        List<MyItem> items = read(";", "HEADER", "AAA;BBB", "CCC;DDD", "EEE;FFF");

        assertThat(items).hasSize(3);
        assertThat(items).containsExactly(
                new MyItem("AAA", "BBB", "HEADER"),
                new MyItem("CCC", "DDD", "HEADER"),
                new MyItem("EEE", "FFF", "HEADER")
        );
    }

    @Data
    @EqualsAndHashCode
    static class MyItem {
        String fieldA;
        String fieldB;
        String fieldC;

        MyItem(String fieldA) {
            this.fieldA = fieldA;
        }

        MyItem(String fieldA, String fieldB, String fieldC) {
            this.fieldA = fieldA;
            this.fieldB = fieldB;
            this.fieldC = fieldC;
        }

        MyItem(FieldSet fieldSet) {
            if (fieldSet.getFieldCount() == 3) {
                fieldA = fieldSet.readString(0);
                fieldB = fieldSet.readString(1);
                fieldC = fieldSet.readString(2);
            } else if (fieldSet.getFieldCount() == 1) {
                fieldA = fieldSet.readString(0);
            } else {
                fail("Invalid field set, expected field count of 1 or 3, given: %s", fieldSet);
            }
        }

    }

}
