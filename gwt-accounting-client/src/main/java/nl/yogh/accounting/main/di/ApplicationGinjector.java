package nl.yogh.accounting.main.di;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;

import nl.yogh.accounting.main.Application;
import nl.yogh.accounting.main.ui.root.ApplicationRootView;

@GinModules(value = ApplicationClientModule.class)
public interface ApplicationGinjector extends Ginjector {
  ApplicationGinjector INSTANCE = GWT.create(ApplicationGinjector.class);

  void inject(Application application);

  ApplicationRootView getApplicationRootView();
}
