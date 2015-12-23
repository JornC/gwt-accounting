package nl.yogh.accounting.main.place;

import com.google.gwt.place.shared.Place;

import nl.yogh.accounting.main.ui.core.ApplicationViewType;

public abstract class ApplicationPlace extends Place {
  private final ApplicationViewType type;

  public ApplicationPlace() {
    this(ApplicationViewType.OVERVIEW);
  }

  public ApplicationPlace(final ApplicationViewType type) {
    this.type = type;
  }

  public ApplicationViewType getType() {
    return type;
  }
}