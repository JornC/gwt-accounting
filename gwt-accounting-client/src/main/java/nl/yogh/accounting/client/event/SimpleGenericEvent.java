package nl.yogh.accounting.client.event;

import com.google.web.bindery.event.shared.binder.GenericEvent;

/**
 * Simple event, encapsulating a generically typed object.
 *
 * @param <E> The object type this event is wrapping
 */
public abstract class SimpleGenericEvent<E> extends GenericEvent {
  private final E object;

  /**
   * Create a {@link SimpleGenericEvent} with the given object.
   *
   * @param obj
   *          object to encapsulate
   */
  public SimpleGenericEvent(final E obj) {
    this.object = obj;
  }

  public E getValue() {
    return object;
  }
}