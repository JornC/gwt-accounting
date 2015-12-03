package nl.yogh.accounting.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.core.client.Scheduler.ScheduledCommand;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;

import nl.yogh.accounting.client.place.ExpensePlace;
import nl.yogh.accounting.client.place.FinancePlace;
import nl.yogh.accounting.client.place.IncomePlace;
import nl.yogh.accounting.client.place.OverviewPlace;
import nl.yogh.accounting.client.ui.ExpenseActivity;
import nl.yogh.accounting.client.ui.FinanceActivity;
import nl.yogh.accounting.client.ui.IncomeActivity;
import nl.yogh.accounting.client.ui.OverviewActivity;

public class ApplicationActivityMapper implements ActivityMapper {
  private final ActivityFactory factory;
  private final PlaceController placeController;

  @Inject
  public ApplicationActivityMapper(final ActivityFactory factory, final PlaceController placeController) {
    this.factory = factory;
    this.placeController = placeController;
  }

  @Override
  public Activity getActivity(final Place place) {
    Activity activity = null;

    GWT.log(place.getClass().getName());

    if (place instanceof OverviewPlace) {
      activity = factory.createOverviewPresenter((OverviewPlace) place);
    } else if (place instanceof IncomePlace) {
      activity = factory.createIncomeActivity((IncomePlace) place);
    } else if (place instanceof ExpensePlace) {
      activity = factory.createExpenseActivity((ExpensePlace) place);
    } else if (place instanceof FinancePlace) {
      activity = factory.createFinanceActivity((FinancePlace) place);
    }

    if (activity == null) {
      Scheduler.get().scheduleDeferred(new ScheduledCommand() {
        @Override
        public void execute() {
          placeController.goTo(new OverviewPlace());
        }
      });
    }

    return activity;
  }

  /**
   * Methods capable of creating presenters given the place that is passed in.
   */
  public interface ActivityFactory {
    OverviewActivity createOverviewPresenter(OverviewPlace place);

    IncomeActivity createIncomeActivity(IncomePlace place);

    ExpenseActivity createExpenseActivity(ExpensePlace place);

    FinanceActivity createFinanceActivity(FinancePlace place);
  }

}
