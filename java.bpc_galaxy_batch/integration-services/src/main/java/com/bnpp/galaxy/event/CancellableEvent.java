package com.bnpp.galaxy.event;

import org.springframework.context.ApplicationEvent;

/**
 * Extends Spring's basic {@link ApplicationEvent} by providing ability to <em>cancel</em> that event. The meaning of
 * <em>cancelling</em> an event is specific to the event emitter (and may be specific to the event type).
 * <p>
 * A cancellable event may be <em>locked</em> at a moment (see {@link #preventCancel()} and {@link
 * #isCancelled(boolean)}) to prevent any further {@link #cancel()} call (that will throw a {@link
 * NotCancellableEventException}).
 * <p>
 * Note that all methods of that class are synchronized. A {@link CancellableEvent} may typically be locked when the
 * publisher cares about the {@link #isCancelled() cancelled} marker only in its own thread (eg. just after the event
 * has been synchronously emitted and synchronous listeners have been called and have been given a chance to cancel the
 * event).
 */
public class CancellableEvent extends ApplicationEvent {

    private boolean cancelled;
    private boolean cancellable = true;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public CancellableEvent(Object source) {
        super(source);
    }

    /**
     * Whether that event may be cancelled, or not.
     *
     * @return <code>true</code> if that event may be cancelled, <code>false</code> otherwise
     */
    public synchronized boolean isCancellable() {
        return cancellable;
    }

    /**
     * Prevent further {@link #cancel()} call.
     */
    public synchronized void preventCancel() {
        cancellable = false;
    }

    /**
     * Try to cancel the event if it is still {@link #isCancellable() cancellable}, otherwise failing silently.
     */
    public synchronized boolean tryCancel() {
        if (cancellable) {
            cancel();
        }

        return cancelled;
    }

    /**
     * Cancel the operation that triggers this event. This will not prevent other listeners to be called.
     * <p>
     * A runtime exception will be thrown if this event is not {@link #isCancellable() cancellable}.
     *
     * @throws NotCancellableEventException if that event is no more cancellable
     */
    public synchronized void cancel() throws NotCancellableEventException {
        if (!cancellable) {
            throw new NotCancellableEventException("Event is not cancellable anymore");
        }

        cancelled = true;
    }

    /**
     * Indicates whether the event is prevented.
     *
     * @return <code>true</code> if the default operation is prevented, <code>false</code> otherwise
     */
    public synchronized boolean isCancelled() {
        return cancelled;
    }

    /**
     * Indicates whether the event is prevented and allow to immediately sets the {@link #isCancellable() cancellable}
     * marker to <code>false</code>.
     * <p>
     * Note that setting the preventFurtherCancel argument to <code>false</code> is effectively equivalent as calling
     * {@link #isCancelled()} without argument.
     *
     * @return <code>true</code> if the default operation is prevented, <code>false</code> otherwise
     */
    public synchronized boolean isCancelled(boolean preventFurtherCancel) {
        if (preventFurtherCancel) {
            preventCancel();
        }

        return isCancelled();
    }

}
