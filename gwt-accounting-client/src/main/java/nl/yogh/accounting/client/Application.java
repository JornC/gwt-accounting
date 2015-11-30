package nl.yogh.accounting.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import nl.yogh.accounting.client.di.ApplicationGinjector;

public class Application implements EntryPoint {
  @Override
  public void onModuleLoad() {
    ApplicationGinjector.INSTANCE.inject(this);

    RootPanel.get().add(ApplicationGinjector.INSTANCE.getApplicationRootView());
  }
}
