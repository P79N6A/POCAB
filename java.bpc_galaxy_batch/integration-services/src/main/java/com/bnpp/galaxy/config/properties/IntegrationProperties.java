package com.bnpp.galaxy.config.properties;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.function.Predicate;

@ConfigurationProperties("gxt.integration")
@Data
public class IntegrationProperties {
	private Purge purge = new Purge();
	private In in = new In();
	private Out out = new Out();
	private Archive archive = new Archive();

	@Data
	public static class Purge {

		/**
		 * Set to 'none' to disable purge, 'manual' for programmatically-only purge
		 * calls or 'automatic' to enable manual as well as automatic (at the end of
		 * integration flow) purge - Default is 'none'.
		 */
		private PurgeMode mode = PurgeMode.NONE;

		/**
		 * Whether to reset inbound channels filter on purge - Default is true (Has no
		 * effect if mode is set to 'none')
		 */
		private boolean resetInboundFilter = true;

		public enum PurgeMode {
			AUTO, NONE, MANUAL
		}
	}

	@Data
	public static class In {
		private Push push = new Push();
		private Vacation vacation = new Vacation();

		@Data
		public static class Push {
			/** Input directory for integration watcher (push file mode) */
			private Path directory;
			/** Whether to create input directory if it does not exist */
			private boolean autoCreateDirectory = true;
			/** Whether to ignore input files if they have vacation scheduled */
			private IgnoreIfVacation ignoreIfVacation = IgnoreIfVacation.AUTO;
			private Filter filter = new Filter();
			private Poller poller = new Poller();

			public enum IgnoreIfVacation {
				/**
				 * Always ignore input files if the corresponding partnership has vacation
				 * scheduled
				 */
				ALWAYS,
				/**
				 * Never ignore, always process input files, no matter for scheduled vacation
				 */
				NEVER,
				/**
				 * Ignore input files if the corresponding partnership has vacation scheduled
				 * AND vacation input directory is the same as push input directory
				 */
				AUTO
			}

			@Data
			public static class Poller {
				public static final String DELAY_SPEL = "${gxt.integration.in.push.poller.delay:1000}";

				/** Polling period in milliseconds */
				private Long delay = 5000L;
			}
		}

		@Data
		public static class Vacation {
			/** Input directory for integration watcher (vacation file mode) */
			private Path directory;
			/** Whether to create input directory if it does not exist */
			private boolean autoCreateDirectory = true;
			private Filter filter = new Filter();
		}

	}

	/**
	 * TODO Maybe delete those properties, as the destination directory will
	 * possibly depend on the Partnership
	 */
	@Data
	public static class Out {
		/** Output directory */
		private Path directory;
	}

	@Data
	public static class Archive {
		/** Base archive directory */
		private Path directory;
		/**
		 * If true, a directory sub-tree will be created based on current date - If
		 * false, base directory is used directly for flat archiving.
		 */
		private boolean timestampTree;
		/** Zone ID to use for timestamp-tree - Defaults to ZoneId.systemDefault() */
		private String timestampTreeZone;
	}

	@Data
	@Slf4j
	public static class Filter {
		/** Regex filter applied on filenames */
		private String filename;
		/** Minimal age for input files in seconds */
		private Long age = 5L;

		private Predicate<File> isEndOfFile = file -> {
			try (Scanner scanner = new Scanner(file)) {
				return scanner.hasNextLine();
			} catch (FileNotFoundException e) {
				log.error(e.getMessage());
			}
			return false;
		};
	}
}
