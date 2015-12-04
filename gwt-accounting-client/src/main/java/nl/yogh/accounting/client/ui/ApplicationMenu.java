package nl.yogh.accounting.client.ui;

import java.util.ArrayList;

import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.Place;
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

import nl.yogh.accounting.client.domain.ApplicationMenuItem;
import nl.yogh.accounting.client.event.PlaceChangeEvent;
import nl.yogh.accounting.client.place.ApplicationNavigationHandler;
import nl.yogh.accounting.client.place.ExpensePlace;
import nl.yogh.accounting.client.place.FinancePlace;
import nl.yogh.accounting.client.place.IncomePlace;
import nl.yogh.accounting.client.place.OverviewPlace;
import nl.yogh.accounting.client.widget.menu.FloatingMenu;
import nl.yogh.accounting.client.widget.menu.MenuItemFactory;

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

  public void init() {
    final ArrayList<ApplicationMenuItem> items = new ArrayList<ApplicationMenuItem>();

    items.add(new ApplicationMenuItem("Overview", OverviewPlace.COLOR) {
      @Override
      public Place getPlace() {
        return new OverviewPlace();
      }

      @Override
      public boolean isActive() {
        return placeController.getWhere() instanceof OverviewPlace;
      }
    });
    items.add(new ApplicationMenuItem("Income", IncomePlace.COLOR) {
      @Override
      public Place getPlace() {
        return new IncomePlace();
      }

      @Override
      public boolean isActive() {
        return placeController.getWhere() instanceof IncomePlace;
      }
    });
    items.add(new ApplicationMenuItem("Expenses", ExpensePlace.COLOR) {
      @Override
      public Place getPlace() {
        return new ExpensePlace();
      }

      @Override
      public boolean isActive() {
        return placeController.getWhere() instanceof ExpensePlace;
      }
    });
    items.add(new ApplicationMenuItem("Finances", FinancePlace.COLOR) {
      @Override
      public Place getPlace() {
        return new FinancePlace();
      }

      @Override
      public boolean isActive() {
        return placeController.getWhere() instanceof FinancePlace;
      }
    });

    menu.addItems(items);
    menu.updateActive();
  }
}
