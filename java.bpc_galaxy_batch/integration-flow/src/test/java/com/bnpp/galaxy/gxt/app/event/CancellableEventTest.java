package com.bnpp.galaxy.gxt.app.event;

import com.bnpp.galaxy.event.CancellableEvent;
import com.bnpp.galaxy.event.NotCancellableEventException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CancellableEventTest {

    @Test
    public void testNotCancelledWithoutExplicitCall() {
        CancellableEvent event = new CancellableEvent(this);

        assertThat(event.isCancelled()).isFalse();
    }

    @Test
    public void testCancel() {
        CancellableEvent event = new CancellableEvent(this);

        event.cancel();

        assertThat(event.isCancelled()).isTrue();
    }

    @Test
    public void testCancel2() {
        CancellableEvent event = new CancellableEvent(this);

        event.tryCancel();

        assertThat(event.isCancelled()).isTrue();
    }

    @Test
    public void testCancellable() {
        CancellableEvent event = new CancellableEvent(this);

        assertThat(event.isCancellable()).isTrue();

        event.isCancelled(false);

        assertThat(event.isCancellable()).isTrue();
    }

    @Test
    public void testNotCancellable() {
        CancellableEvent event = new CancellableEvent(this);

        event.preventCancel();

        assertThat(event.isCancellable()).isFalse();
    }

    @Test(expected = NotCancellableEventException.class)
    public void testNotCancellable2() {
        CancellableEvent event = new CancellableEvent(this);

        event.isCancelled(true);

        assertThat(event.isCancellable()).isFalse();
        assertThat(event.tryCancel()).isFalse();

        event.cancel(); // Should throw
    }

}
