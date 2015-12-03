package nl.yogh.accounting.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.binder.EventBinder;
import com.google.web.bindery.event.shared.binder.EventHandler;

import nl.yogh.accounting.client.ApplicationDisplay;
import nl.yogh.accounting.client.event.PlaceChangeEvent;
import nl.yogh.accounting.client.util.ColorUtil;

public class ApplicationRootView extends Composite implements ApplicationDisplay {
  interface ApplicationRootViewUiBinder extends UiBinder<Widget, ApplicationRootView> {}

  private static final ApplicationRootViewUiBinder UI_BINDER = GWT.create(ApplicationRootViewUiBinder.class);

  interface ApplicationRootViewEventBinder extends EventBinder<ApplicationRootView> {}

  private final ApplicationRootViewEventBinder EVENT_BINDER = GWT.create(ApplicationRootViewEventBinder.class);

  @UiField(provided = true) ApplicationMenu menu;
  @UiField FlowPanel navBar;

  @UiField SimplePanel contentPanel;

  @Inject
  public ApplicationRootView(final ApplicationMenu menu, EventBus eventBus) {
    this.menu = menu;

    initWidget(UI_BINDER.createAndBindUi(this)); 
    EVENT_BINDER.bindEventHandlers(this, eventBus);
  }

  @EventHandler
  public void onPlaceChange(final PlaceChangeEvent e) {
    navBar.getElement().getStyle().setBackgroundColor(ColorUtil.webColor(e.getValue().getColor()));
  }

  @Override
  public void setWidget(final IsWidget w) {
    contentPanel.setWidget(w);
  }
}
