package nl.yogh.accounting.client;

import com.google.inject.Inject;

import nl.yogh.accounting.client.ui.ApplicationMenu;

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
