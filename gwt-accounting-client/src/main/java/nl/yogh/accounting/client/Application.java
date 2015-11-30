package nl.yogh.accounting.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

import nl.yogh.accounting.client.di.ApplicationGinjector;
import nl.yogh.accounting.client.resources.R;

public class Application implements EntryPoint {
  @Override
  public void onModuleLoad() {
    ApplicationGinjector.INSTANCE.inject(this);

    R.init();

    RootPanel.get().add(ApplicationGinjector.INSTANCE.getApplicationRootView());
  }
}
