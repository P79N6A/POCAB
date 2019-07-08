package com.bnpp.galaxy.gxt.app.common.utils;

import org.springframework.messaging.MessageHeaders;

public class Constants {
    //Integration Constants
    public static final String INPUT_ID_HEADER        = "gxt_message_id";
    public static final String INPUT_TS_HEADER        = "gxt_message_ts";
    public static final String INPUT_FILENAMES_HEADER = "gxt_input_filenames";
    public static final String OUTPUT_FILENAME_HEADER = "gxt_output_filename";
    public static final String PARTNERSHIP_HEADER     = "gxt_partnership";
    public static final String CONTENT_TYPE_HEADER    = MessageHeaders.CONTENT_TYPE;
    public static final String VACATION_HEADER        = "gxt_vacation";

    //Common Constants
    public static final String In_MEMORY_BATCH_STORE  = "gxt_in_memory_store";
    public static final String BATCH_CURRENT_RESOURCE = "currentResource";

    private Constants() {
        throw new UnsupportedOperationException();
    }

}
