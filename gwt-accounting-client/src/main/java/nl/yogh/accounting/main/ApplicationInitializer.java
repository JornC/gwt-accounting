package nl.yogh.accounting.main;

import com.google.inject.Inject;

import nl.yogh.accounting.main.ui.root.ApplicationMenu;

public class ApplicationInitializer {
  private final ApplicationMenu menu;

  @Inject
  public ApplicationInitializer(final ApplicationMenu menu) {
    this.menu = menu;
  }

  public void init() {
    menu.init();
  }
}
