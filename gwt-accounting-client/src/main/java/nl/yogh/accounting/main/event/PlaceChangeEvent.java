package nl.yogh.accounting.main.event;

import nl.yogh.accounting.main.place.ApplicationPlace;

/**
 * Wrapper for the {@link com.google.gwt.place.shared.PlaceChangeEvent} to make
 * it possible to use place changes events in combination with the gwt event library.
 * The application will fire this event when an actual place event is received.
 */
public class PlaceChangeEvent extends SimpleGenericEvent<ApplicationPlace> {

  public PlaceChangeEvent(final ApplicationPlace obj) {
    super(obj);
  }
}