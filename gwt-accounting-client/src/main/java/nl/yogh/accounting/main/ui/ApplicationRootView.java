package nl.yogh.accounting.main.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

import nl.yogh.accounting.main.ui.core.ApplicationMenu;
import nl.yogh.accounting.main.ui.core.ApplicationNavBar;

public class ApplicationRootView extends Composite implements ApplicationDisplay {
  interface ApplicationRootViewUiBinder extends UiBinder<Widget, ApplicationRootView> {}

  private static final ApplicationRootViewUiBinder UI_BINDER = GWT.create(ApplicationRootViewUiBinder.class);

  @UiField(provided = true) ApplicationMenu menu;
  @UiField(provided = true) ApplicationNavBar navBar;

  @UiField SimplePanel contentPanel;

  @Inject
  public ApplicationRootView(final ApplicationMenu menu, final ApplicationNavBar navBar, final EventBus eventBus) {
    this.menu = menu;
    this.navBar = navBar;

    initWidget(UI_BINDER.createAndBindUi(this));
  }

  @Override
  public void setWidget(final IsWidget w) {
    contentPanel.setWidget(w);
  }
}
