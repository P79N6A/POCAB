package com.bnpp.galaxy.gxt.app.integration;

import com.bnpp.galaxy.gxt.app.common.utils.Constants;
import com.bnpp.galaxy.services.partnership.PartnershipSettings;
import org.junit.Test;
import org.springframework.integration.support.MutableMessageHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class HeadersReaderTest {

    @Test
    public void testFactoryMethodEquivalence() {
        Message<?> message = MessageBuilder.withPayload(new Object()).build();
        HeadersReader fromMessage = HeadersReader.of(message);
        HeadersReader fromHeaders = HeadersReader.of(message.getHeaders());

        assertThat(fromMessage.getRawHeaders() == fromHeaders.getRawHeaders()).isTrue();
    }

    @Test
    public void testSimpleHeaderValues() {
        MessageHeaders headers = new MutableMessageHeaders(null);
        HeadersReader r = HeadersReader.of(headers);
        PartnershipSettings partnership = mock(PartnershipSettings.class);
        Path outputFile = Paths.get("./mock");

        headers.put(Constants.INPUT_ID_HEADER, "mockid");
        headers.put(Constants.INPUT_TS_HEADER, 0L);
        headers.put(Constants.CONTENT_TYPE_HEADER, "mockcontenttype");
        headers.put(Constants.PARTNERSHIP_HEADER, partnership);
        headers.put(Constants.OUTPUT_FILENAME_HEADER, outputFile);

        assertThat(r.getInputId()).isEqualTo("mockid");
        assertThat(r.getTimestamp().toEpochMilli()).isEqualTo(0L);
        assertThat(r.getContentType()).isEqualTo("mockcontenttype");
        assertThat(r.getPartnership()).isSameAs(partnership);
        assertThat(r.getOutputFile()).isSameAs(outputFile);
    }

    @Test
    public void testBooleanHeaderValues() {
        MessageHeaders headers = new MutableMessageHeaders(null);
        HeadersReader r = HeadersReader.of(headers);

        headers.put(Constants.VACATION_HEADER, true);
        assertThat(r.isVacation()).isTrue();

        headers.put(Constants.VACATION_HEADER, false);
        assertThat(r.isVacation()).isFalse();

        headers.put(Constants.VACATION_HEADER, null);
        assertThat(r.isVacation()).isFalse();

        headers.remove(Constants.VACATION_HEADER);
        assertThat(r.isVacation()).isFalse();
    }

    @SafeVarargs
    private final <T> Iterator<T> mockIterator(T... values) {
        List<T> mockList = Arrays.asList(values);

        return mockList.iterator();
    }

    @Test
    public void testCollectionHeaderValues() {
        MessageHeaders headers = new MutableMessageHeaders(null);
        HeadersReader r = HeadersReader.of(headers);
        Collection<Path> inputFiles = Collections.emptyList();
        Path p1 = Paths.get("mock1");
        Path p2 = Paths.get("mock2");
        Path p3 = Paths.get("mock3");

        headers.put(Constants.INPUT_FILENAMES_HEADER, inputFiles);
        assertThat(r.getInputFiles()).isSameAs(inputFiles);

        headers.put(Constants.INPUT_FILENAMES_HEADER, Arrays.asList(p1, p2));
        assertThat(r.getInputFiles()).hasSize(2);
        assertThat(r.getInputFiles()).contains(p1, p2);

        headers.put(Constants.INPUT_FILENAMES_HEADER, (Iterable<Path>) () -> mockIterator(p1, p2, p3));
        assertThat(r.getInputFiles()).hasSize(3);
        assertThat(r.getInputFiles()).contains(p1, p2, p3);

        headers.put(Constants.INPUT_FILENAMES_HEADER, null);
        assertThat(r.getInputFiles()).isEmpty();

        headers.put(Constants.INPUT_FILENAMES_HEADER, p1);
        assertThat(r.getInputFiles()).hasSize(1);
        assertThat(r.getInputFiles()).contains(p1);
    }

}
