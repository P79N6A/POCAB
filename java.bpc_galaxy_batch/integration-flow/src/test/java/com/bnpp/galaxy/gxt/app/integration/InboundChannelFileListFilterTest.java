package com.bnpp.galaxy.gxt.app.integration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;

public class InboundChannelFileListFilterTest {

	@Test
	public void testAcceptOnce() throws IOException {
		InboundChannelFileListFilter filter = new InboundChannelFileListFilter(".+", 0L, null);
		List<File> result;

		result = filter.filterFiles(new File[] { new File("./test") });
		assertThat(result).hasSize(1);
		assertThat(result).contains(new File("./test"));

		result = filter.filterFiles(new File[] { new File("./test") });
		assertThat(result).isEmpty();

		result = filter.filterFiles(new File[] { new File("./test"), new File("./test2") });
		assertThat(result).hasSize(1);
		assertThat(result).contains(new File("./test2"));
		filter.close();
	}

	@Test
	public void testPattern() throws IOException {
		InboundChannelFileListFilter filter = new InboundChannelFileListFilter(".+\\.testA", 0L, null);
		List<File> result;

		result = filter.filterFiles(new File[] { new File("./test") });
		assertThat(result).isEmpty();

		result = filter.filterFiles(new File[] { new File("./test.testA") });
		assertThat(result).hasSize(1);
		assertThat(result).contains(new File("./test.testA"));

		result = filter.filterFiles(new File[] { new File("./test1.testA"), new File("./test2.testA") });
		assertThat(result).hasSize(2);
		assertThat(result).contains(new File("./test1.testA"), new File("./test2.testA"));
		filter.close();
	}

	@Test
	public void testAge() throws IOException {
		InboundChannelFileListFilter filter;
		File file = spy(new File("./test"));
		List<File> result;

		filter = new InboundChannelFileListFilter(".+", 60L, null);
		when(file.lastModified()).thenReturn(System.currentTimeMillis());
		result = filter.filterFiles(new File[] { file });
		assertThat(result).isEmpty();
		filter.close();

		filter = new InboundChannelFileListFilter(".+", 60L, null);
		when(file.lastModified()).thenReturn(System.currentTimeMillis() - 60000);
		result = filter.filterFiles(new File[] { file });
		assertThat(result).hasSize(1);
		assertThat(result).contains(file);
		filter.close();

		filter = new InboundChannelFileListFilter(".+", 60L, null);
		when(file.lastModified()).thenReturn(System.currentTimeMillis() + 60000);
		result = filter.filterFiles(new File[] { file });
		assertThat(result).isEmpty();
		filter.close();

		filter = new InboundChannelFileListFilter(".+", 60L, null);
		when(file.lastModified()).thenReturn(System.currentTimeMillis() - 120000);
		result = filter.filterFiles(new File[] { file });
		assertThat(result).hasSize(1);
		assertThat(result).contains(file);
		filter.close();

	}

}
