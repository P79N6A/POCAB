package com.bnpp.galaxy.services.partnership;

import com.bnpp.galaxy.entities.Partnership;

import java.util.List;

/**
 * Provides static methods factory to create {@link PartnershipEvent} objects.
 * <p>
 * May also be used to retrieve a static factory that auto-provide a given source (see {@link
 * #forSource(PartnershipService)}).
 */
public final class PartnershipEvents {

    private PartnershipEvents() {
        throw new UnsupportedOperationException();
    }

    /**
     * Create a "before save" event
     *
     * @param partnership The partnership about to be saved
     * @param source      The source caller
     * @return a new cancellable event object
     */
    public static PartnershipEvent.BeforeSave beforeSave(Partnership partnership, PartnershipService source) {
        return new PartnershipEvent.BeforeSave(source, partnership);
    }

    /**
     * Create a "after save" event
     *
     * @param partnerships The partnerships having been saved
     * @param source       The source caller
     * @return a new event object
     */
    public static PartnershipEvent.AfterSave afterSave(List<Partnership> partnerships, PartnershipService source) {
        return new PartnershipEvent.AfterSave(source, partnerships);
    }

    /**
     * Create a "before delete" event
     *
     * @param partnership The partnership about to be deleted
     * @param source      The source caller
     * @return a new cancellable event object
     */
    public static PartnershipEvent.BeforeDelete beforeDelete(Partnership partnership, PartnershipService source) {
        return new PartnershipEvent.BeforeDelete(source, partnership);
    }

    /**
     * Create a "after delete" event
     *
     * @param partnerships The partnerships having been deleted
     * @param source       The source caller
     * @return a new event object
     */
    public static PartnershipEvent.AfterDelete afterDelete(List<Partnership> partnerships, PartnershipService source) {
        return new PartnershipEvent.AfterDelete(source, partnerships);
    }

    /**
     * Get a factory used to create event using the given static source object
     * <p>
     * That factory defines methods similar to {@link PartnershipEvents} just without the source argument.
     *
     * @param source The event source object
     * @return the factory
     */
    public static Factory forSource(PartnershipService source) {
        return new Factory(source);
    }

    /**
     * Helper class that create events using provided source object.
     */
    public static class Factory {

        private final PartnershipService source;

        private Factory(PartnershipService source) {
            this.source = source;
        }

        /**
         * Create a "before save" event
         *
         * @param partnership The partnership about to be saved
         * @return a new cancellable event object
         */
        public PartnershipEvent.BeforeSave beforeSave(Partnership partnership) {
            return PartnershipEvents.beforeSave(partnership, source);
        }

        /**
         * Create a "after save" event
         *
         * @param partnerships The partnerships having been saved
         * @return a new event object
         */
        public PartnershipEvent.AfterSave afterSave(List<Partnership> partnerships) {
            return PartnershipEvents.afterSave(partnerships, source);
        }

        /**
         * Create a "before delete" event
         *
         * @param partnership The partnership about to be deleted
         * @return a new cancellable event object
         */
        public PartnershipEvent.BeforeDelete beforeDelete(Partnership partnership) {
            return PartnershipEvents.beforeDelete(partnership, source);
        }

        /**
         * Create a "after delete" event
         *
         * @param partnerships The partnerships having been deleted
         * @return a new event object
         */
        public PartnershipEvent.AfterDelete afterDelete(List<Partnership> partnerships) {
            return PartnershipEvents.afterDelete(partnerships, source);
        }
    }
}
