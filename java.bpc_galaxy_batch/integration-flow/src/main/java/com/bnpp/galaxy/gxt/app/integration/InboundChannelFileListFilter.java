package com.bnpp.galaxy.gxt.app.integration;

import org.springframework.integration.file.filters.AcceptOnceFileListFilter;
import org.springframework.integration.file.filters.ChainFileListFilter;
import org.springframework.integration.file.filters.LastModifiedFileListFilter;
import org.springframework.integration.file.filters.RegexPatternFileListFilter;
import org.springframework.util.StringUtils;

import java.io.File;
import java.util.function.Predicate;

/**
 * Filter definition for inbound channels. It applies predefined filters on
 * inbound files and is resettable.
 *
 * @implSpec Applies following filters:
 *           <ul>
 *           <li>Regex filter on filename: based on a given pattern</li>
 *           <li>File age filter: based on given minimum age in seconds</li>
 *           <li>Accept once: files will only be accepted once, then rejected
 *           until that filter is reset</li>
 *           </ul>
 */
public final class InboundChannelFileListFilter extends ChainFileListFilter<File> implements AutoCloseable {
	public InboundChannelFileListFilter(String inputFilenameFilter, Long inputFileAgeFilter,
			Predicate<File> predicate) {
		if (StringUtils.hasText(inputFilenameFilter)) {
			addFilter(new RegexPatternFileListFilter(inputFilenameFilter.trim()));
		}

		if (inputFileAgeFilter != null) {
			addFilter(new LastModifiedFileListFilter(inputFileAgeFilter));
		}

		if (predicate != null) {
			addFilter(new EOFFilter(predicate));
		}

		addFilter(new AcceptOnceFileListFilter<>());
	}

}
