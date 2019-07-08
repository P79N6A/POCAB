package com.bnpp.galaxy.services.partnership;

public interface XlsPartnershipSettings extends PartnershipSettings {

    /**
     * Number of rows to be skipped before the first business row in the XLS file
     * @return the number of rows to skip for this partner
     */
    int getRowOffset();

    /**
     * Number of columns to be skipped before the first business cell in the XLS file
     * @return the number of columns to skip for this partner
     */
    int getColumnOffset();

}
