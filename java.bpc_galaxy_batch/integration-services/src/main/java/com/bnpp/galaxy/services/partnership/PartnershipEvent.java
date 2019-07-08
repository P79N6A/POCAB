package com.bnpp.galaxy.services.partnership;

import com.bnpp.galaxy.entities.Partnership;
import com.bnpp.galaxy.event.CancellableEvent;
import org.springframework.context.ApplicationEvent;

import java.util.List;

/**
 * Event related to a partnership(s) subject.
 *
 * @param <T> The subject type
 */
public abstract class PartnershipEvent<T> extends ApplicationEvent {

    private final T subject;

    PartnershipEvent(PartnershipService source, T subject) {
        super(source);
        this.subject = subject;
    }

    public T getSubject() {
        return subject;
    }

    @Override
    public PartnershipService getSource() {
        return (PartnershipService) super.getSource();
    }

    /**
     * Cancellable event related to a partnership(s) subject.
     *
     * @param <T> The subject type
     */
    public static abstract class Cancellable<T> extends CancellableEvent {

        private final T subject;

        Cancellable(PartnershipService source, T subject) {
            super(source);
            this.subject = subject;
        }

        public T getSubject() {
            return subject;
        }

        @Override
        public PartnershipService getSource() {
            return (PartnershipService) super.getSource();
        }
    }

    public static class BeforeSave extends Cancellable<Partnership> {

        BeforeSave(PartnershipService source, Partnership subject) {
            super(source, subject);
        }
    }

    public static class AfterSave extends PartnershipEvent<List<Partnership>> {

        AfterSave(PartnershipService source, List<Partnership> subject) {
            super(source, subject);
        }
    }

    public static class BeforeDelete extends Cancellable<Partnership> {

        BeforeDelete(PartnershipService source, Partnership subject) {
            super(source, subject);
        }
    }

    public static class AfterDelete extends PartnershipEvent<List<Partnership>> {

        AfterDelete(PartnershipService source, List<Partnership> subject) {
            super(source, subject);
        }
    }
}
