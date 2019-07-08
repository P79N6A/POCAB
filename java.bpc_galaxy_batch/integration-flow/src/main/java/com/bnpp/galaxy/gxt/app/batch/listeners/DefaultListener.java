package com.bnpp.galaxy.gxt.app.batch.listeners;

import com.bnpp.galaxy.gxt.app.generatedxml.QuotationType;
import net.sophis.quotation.QuotationsByInstrument;
import org.apache.log4j.Logger;
import org.springframework.batch.core.listener.ItemListenerSupport;

import java.util.List;

public class DefaultListener extends ItemListenerSupport<QuotationType, QuotationsByInstrument> {

    private final Logger logger = Logger.getLogger(getClass());

    @Override
    public void afterProcess(QuotationType item, QuotationsByInstrument result) {
        logger.warn("AFTER PROCESS: [item] " + item.getClass() + " / " + item);
        logger.warn("AFTER PROCESS: [result] " + result.getClass() + " / " + result);
    }

    @Override
    public void onProcessError(QuotationType item, Exception e) {
        logger.warn("PROCESS ERROR: [item] " + item.getClass() + " / " + item);
        logger.warn("PROCESS ERROR: [exception]", e);
    }

    @Override
    public void afterWrite(List<? extends QuotationsByInstrument> items) {
        logger.warn("AFTER WRITE: [items] " + items);
        // TODO Build job report?
    }

    @Override
    public void onWriteError(Exception ex, List<? extends QuotationsByInstrument> items) {
        logger.warn("WRITE ERROR: [items] " + items);
        logger.warn("WRITE ERROR: [exception]", ex);
        // TODO Build job report?
    }

}
