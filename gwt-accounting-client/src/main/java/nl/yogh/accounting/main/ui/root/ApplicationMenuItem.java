package nl.yogh.accounting.main.ui.root;

import com.google.gwt.place.shared.Place;

import nl.yogh.accounting.main.widget.menu.SimpleMenuItem;

public abstract class ApplicationMenuItem extends SimpleMenuItem {
  public ApplicationMenuItem(final String name, final String color) {
    super(name, color);
  }

  public abstract Place getPlace();
}
