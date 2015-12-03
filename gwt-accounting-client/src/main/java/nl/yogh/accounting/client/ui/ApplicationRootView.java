package nl.yogh.accounting.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;

import nl.yogh.accounting.client.ApplicationDisplay;

public class ApplicationRootView extends Composite implements ApplicationDisplay {
  interface ApplicationRootViewUiBinder extends UiBinder<Widget, ApplicationRootView> {}

  private static final ApplicationRootViewUiBinder UI_BINDER = GWT.create(ApplicationRootViewUiBinder.class);

  @UiField(provided = true) ApplicationMenu menu;

  @UiField SimplePanel contentPanel;

  @Inject
  public ApplicationRootView(final ApplicationMenu menu) {
    this.menu = menu;

    initWidget(UI_BINDER.createAndBindUi(this));
  }

  @Override
  public void setWidget(final IsWidget w) {
    contentPanel.setWidget(w);
  }
}
