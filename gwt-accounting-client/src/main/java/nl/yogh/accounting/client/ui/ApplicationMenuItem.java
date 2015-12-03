package nl.yogh.accounting.client.ui;

import com.google.gwt.place.shared.Place;

import nl.yogh.accounting.client.widget.menu.SimpleMenuItem;

public abstract class ApplicationMenuItem extends SimpleMenuItem {
  public ApplicationMenuItem(final String name, final String color) {
    super(name, color);
  }

  public abstract Place getPlace();
}
