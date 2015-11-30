package nl.yogh.accounting.client.di;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

import nl.yogh.accounting.client.Application;
import nl.yogh.accounting.client.ApplicationRootView;

@GinModules(value = ApplicationClientModule.class)
public interface ApplicationGinjector extends Ginjector {
  ApplicationGinjector INSTANCE = GWT.create(ApplicationGinjector.class);

  void inject(Application application);

  ApplicationRootView getApplicationRootView();
}
