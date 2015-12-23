package nl.yogh.accounting.main;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

import nl.yogh.accounting.main.place.ActivityFactory;
import nl.yogh.accounting.main.place.ApplicationActivityMapper;
import nl.yogh.accounting.main.place.ApplicationPlaceHistoryMapper;
import nl.yogh.accounting.main.ui.ApplicationDisplay;
import nl.yogh.accounting.main.ui.ApplicationRootView;
import nl.yogh.accounting.main.ui.expense.ExpenseView;
import nl.yogh.accounting.main.ui.expense.ExpenseViewImpl;
import nl.yogh.accounting.main.ui.finance.FinanceView;
import nl.yogh.accounting.main.ui.finance.FinanceViewImpl;
import nl.yogh.accounting.main.ui.income.IncomeView;
import nl.yogh.accounting.main.ui.income.IncomeViewImpl;
import nl.yogh.accounting.main.ui.overview.OverviewView;
import nl.yogh.accounting.main.ui.overview.OverviewViewImpl;

public class ApplicationClientModule extends AbstractGinModule {
  @Override
  protected void configure() {
    // Essentials
    bind(ApplicationDisplay.class).to(ApplicationRootView.class).in(Singleton.class);
    bind(ActivityMapper.class).to(ApplicationActivityMapper.class).in(Singleton.class);
    bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
    bind(PlaceController.class).to(ApplicationPlaceController.class).in(Singleton.class);
    bind(PlaceHistoryMapper.class).to(ApplicationPlaceHistoryMapper.class).in(Singleton.class);

    // Views
    bind(OverviewView.class).to(OverviewViewImpl.class);
    bind(IncomeView.class).to(IncomeViewImpl.class);
    bind(ExpenseView.class).to(ExpenseViewImpl.class);
    bind(FinanceView.class).to(FinanceViewImpl.class);

    install(new GinFactoryModuleBuilder().build(ActivityFactory.class));
  }

  public static class ApplicationPlaceController extends PlaceController {
    @Inject
    public ApplicationPlaceController(final EventBus eventBus) {
      super(eventBus);
    }
  }
}
