package nl.yogh.accounting.main;

import java.util.ArrayList;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;

import nl.yogh.accounting.main.place.ExpensePlace;
import nl.yogh.accounting.main.place.FinancePlace;
import nl.yogh.accounting.main.place.IncomePlace;
import nl.yogh.accounting.main.place.OverviewPlace;
import nl.yogh.accounting.main.ui.core.ApplicationMenu;
import nl.yogh.accounting.main.ui.core.ApplicationMenuItem;
import nl.yogh.accounting.main.ui.core.ApplicationViewType;

public class ApplicationInitializer {
  private final ApplicationMenu menu;
  private final PlaceController placeController;

  @Inject
  public ApplicationInitializer(final ApplicationMenu menu, final PlaceController placeController) {
    this.menu = menu;
    this.placeController = placeController;
  }

  public void init() {
    final ArrayList<ApplicationMenuItem> items = new ArrayList<ApplicationMenuItem>();

    items.add(new ApplicationMenuItem("Overview", ApplicationViewType.OVERVIEW) {
      @Override
      public Place getPlace() {
        return new OverviewPlace();
      }

      @Override
      public boolean isActive() {
        return placeController.getWhere() instanceof OverviewPlace;
      }
    });
    items.add(new ApplicationMenuItem("Income", ApplicationViewType.INCOME) {
      @Override
      public Place getPlace() {
        return new IncomePlace();
      }

      @Override
      public boolean isActive() {
        return placeController.getWhere() instanceof IncomePlace;
      }
    });
    items.add(new ApplicationMenuItem("Expenses", ApplicationViewType.EXPENSE) {
      @Override
      public Place getPlace() {
        return new ExpensePlace();
      }

      @Override
      public boolean isActive() {
        return placeController.getWhere() instanceof ExpensePlace;
      }
    });
    items.add(new ApplicationMenuItem("Finances", ApplicationViewType.FINANCE) {
      @Override
      public Place getPlace() {
        return new FinancePlace();
      }

      @Override
      public boolean isActive() {
        return placeController.getWhere() instanceof FinancePlace;
      }
    });

    menu.init(items);
  }
}
