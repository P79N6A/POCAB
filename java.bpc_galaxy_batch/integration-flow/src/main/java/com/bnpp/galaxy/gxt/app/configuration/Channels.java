package com.bnpp.galaxy.gxt.app.configuration;

// @formatter:off
/**
 * Channel names for routing.
 *
 * Bridge         -> INBOUND_CHANNEL
 * End                 -> ENRICHER_END_CHANNEL
 * Transformation    -> TRANSFORMATION_XLS_CHANNEL
 * End                 -> TRANSFORMATION_END_CHANNEL
 * Bridge          -> FILTER_ENTRY_CHANNEL
 * Filter            -> FILTER_XML_CHANNEL
 * Filter            -> FILTER_CSV_CHANNEL
 * Filter            -> FILTER_XLS_CHANNEL
 * End                 -> FILTER_END_CHANNEL
 * Bridge          -> JOB_CHANNEL
 */
// @formatter:on
public final class Channels {

    // Inbound channel for messages from file source reading message source
    public static final String INBOUND_CHANNEL = "watcherInboundChannel";

    // Route join after all enrichment
    public static final String ENRICHER_END_CHANNEL = "enricherEndChannel";

    // Route connecting enricher to transformation operations
    public static final String TRANSFORMATION_ENTRY_CHANNEL = "transformationEntryChannel";

    // Route channel for XLS/XLSX transformation operations
    public static final String TRANSFORMATION_XLS_CHANNEL = "transformationXlsChannel";

    // Route join after all transformations
    public static final String TRANSFORMATION_END_CHANNEL = "transformationEndChannel";

    // Route connecting transformation to filter operations
    public static final String FILTER_ENTRY_CHANNEL = "filterEntryChannel";

    // Route channel for XML filter operations
    public static final String FILTER_XML_CHANNEL = "filterXmlChannel";

    // Route channel for CSV filter operations
    public static final String FILTER_CSV_CHANNEL = "filterCsvChannel";

    // Route channel for XLS filter operations
    public static final String FILTER_XLS_CHANNEL = "filterXlsChannel";

    // Route join after all filters
    public static final String FILTER_END_CHANNEL = "filterEndChannel";

    // Route connecting filter to job operations
    public static final String JOB_CHANNEL = "jobChannel";

    private Channels() {
        throw new UnsupportedOperationException();
    }
}
