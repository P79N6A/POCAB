package com.bnpp.galaxy.gxt.app.vacation;

import com.bnpp.galaxy.config.properties.IntegrationProperties;
import com.bnpp.galaxy.services.partnership.PartnershipService;
import com.bnpp.galaxy.services.partnership.PartnershipSettings;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.integration.support.DefaultMessageBuilderFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class VacationQuartzJobTest {
    private static final Pattern MATCH_ALL_PATTERN = Pattern.compile(".+");
    private static final String MOCK_PARTNERSHIP_NAME = "doesnotmatter";

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    private MockChannel createMockChannel() {
        return spy(new MockChannel());
    }

    private PartnershipSettings createMockPartnership() {
        PartnershipSettings mock = mock(PartnershipSettings.class);

        when(mock.getName()).thenReturn(VacationQuartzJobTest.MOCK_PARTNERSHIP_NAME);
        when(mock.getInputFilenamePattern()).thenReturn(MATCH_ALL_PATTERN);

        return mock;
    }

    private IntegrationProperties createMockProperties() {
        IntegrationProperties mock = new IntegrationProperties();

        mock.getIn().getVacation().setAutoCreateDirectory(true);
        try {
            mock.getIn().getVacation().setDirectory(temporaryFolder.newFolder().toPath());
        } catch (IOException e) {
            fail("Unable to create temp vacation directory", e);
        }

        return mock;
    }

    private PartnershipService createMockPartnershipService() {
        PartnershipService mock = mock(PartnershipService.class);
        PartnershipSettings mockPartnership = createMockPartnership();

        when(mock.findPartnershipSettingsByName(VacationQuartzJobTest.MOCK_PARTNERSHIP_NAME))
                .thenReturn(mockPartnership);

        return mock;
    }

    private VacationQuartzJob createTestableJob(IntegrationProperties props, MessageChannel channel) {
        VacationQuartzJob mock = new VacationQuartzJob();

        mock.setMessageBuilderFactory(new DefaultMessageBuilderFactory());
        mock.setChannel(channel);
        mock.setFileListFilter(Arrays::asList);
        mock.setPartnershipService(createMockPartnershipService());
        mock.setIntegrationProperties(props);

        return mock;
    }

    private JobExecutionContext createMockJobContext() {
        JobExecutionContext mock = mock(JobExecutionContext.class);
        JobDataMap mockDataMap = mock(JobDataMap.class);

        when(mock.getMergedJobDataMap()).thenReturn(mockDataMap);
        when(mockDataMap.getString(VacationQuartzJob.PARAM_PARTNERSHIP_NAME))
                .thenReturn(VacationQuartzJobTest.MOCK_PARTNERSHIP_NAME);

        return mock;
    }

    private <E extends Exception> void runQuartzJob(ThrowingConsumer<IntegrationProperties, E> prepare, BiConsumer<MockChannel, IntegrationProperties> test) throws JobExecutionException, E {
        MockChannel channel = createMockChannel();
        IntegrationProperties props = createMockProperties();
        JobExecutionContext ctx = createMockJobContext();
        VacationQuartzJob job = createTestableJob(props, channel);

        prepare.accept(props);

        job.execute(ctx);

        test.accept(channel, props);
    }

    @Test
    public void testMessageSent() {
        try {
            runQuartzJob(props -> {
                // Create a temporary file
                Path tempFile = props.getIn().getVacation().getDirectory().resolve("tempfile.tmp");
                Files.createFile(tempFile);
            }, (channel, props) -> {
                verify(channel, times(1)).send(any(Message.class));
                assertThat(channel.getLastMessage()).isNotNull();
            });
        } catch (IOException | JobExecutionException e) {
            fail("Failed to test job", e);
        }
    }

    @Test
    public void testMessageNotSent() {
        try {
            runQuartzJob(props -> {
                // Do not create any temporary file
            }, (channel, props) -> {
                verify(channel, never()).send(any(Message.class));
                assertThat(channel.getLastMessage()).isNull();
            });
        } catch (JobExecutionException e) {
            fail("Failed to test job", e);
        }
    }

    @Test
    public void testDirectoryCreated() {
        try {
            runQuartzJob(props -> {
                Path tempDirectory = temporaryFolder.newFolder().toPath();
                Path vacationDirectory = tempDirectory.resolve("unexisting_directory_" + UUID.randomUUID());

                if (Files.isDirectory(vacationDirectory)) {
                    throw new AssertionError("Directory should not exist");
                }

                props.getIn().getVacation().setDirectory(vacationDirectory);
                props.getIn().getVacation().setAutoCreateDirectory(true);
            }, (channel, props) -> {
                Path vacationDirectory = props.getIn().getVacation().getDirectory();

                assertThat(Files.isDirectory(vacationDirectory)).isTrue();
                verify(channel, never()).send(any(Message.class));
            });
        } catch (IOException | JobExecutionException e) {
            fail("Failed to test job", e);
        }
    }

    @Test
    public void testDirectoryNotCreated() {
        try {
            runQuartzJob(props -> {
                Path tempDirectory = temporaryFolder.newFolder().toPath();
                Path vacationDirectory = tempDirectory.resolve("unexisting_directory_" + UUID.randomUUID());

                if (Files.isDirectory(vacationDirectory)) {
                    throw new AssertionError("Directory should not exist");
                }

                props.getIn().getVacation().setDirectory(vacationDirectory);
                props.getIn().getVacation().setAutoCreateDirectory(false);
            }, (channel, props) -> {
                Path vacationDirectory = props.getIn().getVacation().getDirectory();

                assertThat(Files.isDirectory(vacationDirectory)).isFalse();
                verify(channel, never()).send(any(Message.class));
            });
        } catch (IOException | JobExecutionException e) {
            fail("Failed to test job", e);
        }
    }

    @Test
    public void testMessageWithSingleFile() {
        try {
            runQuartzJob(props -> {
                // Create a temporary file
                Path tempFile = props.getIn().getVacation().getDirectory().resolve("tempfile.tmp");
                Files.createFile(tempFile);
            }, (channel, props) -> {
                assertThat(channel.getLastMessage().getPayload()).hasSize(1);
            });
        } catch (IOException | JobExecutionException e) {
            fail("Failed to test job", e);
        }
    }

    @Test
    public void testMessageWithTwoFiles() {
        try {
            runQuartzJob(props -> {
                // Create a temporary file
                Path tempFile = props.getIn().getVacation().getDirectory().resolve("tempfile.tmp");
                Path tempFile2 = props.getIn().getVacation().getDirectory().resolve("tempfile2.tmp");
                Files.createFile(tempFile);
                Files.createFile(tempFile2);
            }, (channel, props) -> {
                assertThat(channel.getLastMessage().getPayload()).hasSize(2);
            });
        } catch (IOException | JobExecutionException e) {
            fail("Failed to test job", e);
        }
    }

    @FunctionalInterface
    private interface ThrowingConsumer<T, E extends Exception> {
        void accept(T arg) throws E;
    }

    private static class MockChannel implements MessageChannel {

        private Message<?> lastMessage;

        @Override
        public boolean send(Message<?> message) {
            lastMessage = message;
            return true;
        }

        @Override
        public boolean send(Message<?> message, long timeout) {
            lastMessage = message;
            return true;
        }

        @SuppressWarnings("unchecked")
        Message<Collection<Path>> getLastMessage() {
            return (Message<Collection<Path>>) lastMessage;
        }
    }

}
