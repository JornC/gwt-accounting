package nl.yogh.accounting.main.ui.core;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.binder.EventBinder;
import com.google.web.bindery.event.shared.binder.EventHandler;

import nl.yogh.accounting.main.place.PlaceChangeEvent;
import nl.yogh.accounting.main.widget.menu.FloatingMenu;
import nl.yogh.accounting.main.widget.menu.MenuItemFactory;

@Singleton
public class ApplicationMenu extends Composite {
  interface ApplicationMenuUiBinder extends UiBinder<Widget, ApplicationMenu> {}

  private static final ApplicationMenuUiBinder UI_BINDER = GWT.create(ApplicationMenuUiBinder.class);

  interface ApplicationMenuEventBinder extends EventBinder<ApplicationMenu> {}

  private final ApplicationMenuEventBinder EVENT_BINDER = GWT.create(ApplicationMenuEventBinder.class);

  @UiField(provided = true) FloatingMenu<ApplicationMenuItem> menu;

  @Inject PlaceController placeController;

  @Inject
  public ApplicationMenu(final EventBus eventBus, final ApplicationNavigationHandler handler) {
    menu = new FloatingMenu<ApplicationMenuItem>(new MenuItemFactory<ApplicationMenuItem>(handler));

    initWidget(UI_BINDER.createAndBindUi(this));
    EVENT_BINDER.bindEventHandlers(this, eventBus);
  }

  @EventHandler
  public void onPlaceChange(final PlaceChangeEvent e) {
    menu.updateActive();
  }

  public void init(final ArrayList<ApplicationMenuItem> items) {
    menu.addItems(items);
    menu.updateActive();
  }
}
