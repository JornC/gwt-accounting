package nl.yogh.accounting.main.ui.core;

import com.google.gwt.place.shared.Place;

import nl.yogh.accounting.main.widget.menu.SimpleMenuItem;

public abstract class ApplicationMenuItem extends SimpleMenuItem {
  public ApplicationMenuItem(final String name, final ApplicationViewType color) {
    super(name, color.getColor());
  }

  public abstract Place getPlace();
}
