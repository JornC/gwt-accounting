package nl.yogh.accounting.client.event;

import com.google.gwt.place.shared.Place;

/**
 * Wrapper for the {@link com.google.gwt.place.shared.PlaceChangeEvent} to make
 * it possible to use place changes events in combination with the gwt event library.
 * The application will fire this event when an actual place event is received.
 */
public class PlaceChangeEvent extends SimpleGenericEvent<Place> {

  public PlaceChangeEvent(final Place obj) {
    super(obj);
  }
}