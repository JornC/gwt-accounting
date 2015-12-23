package nl.yogh.accounting.main.ui.income;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

import nl.yogh.accounting.main.ui.expense.ExpenseView.Presenter;

public class IncomeActivity extends AbstractActivity implements Presenter {

  private final IncomeView view;

  @Inject
  public IncomeActivity(final IncomeView view) {
    this.view = view;
  }

  @Override
  public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
    panel.setWidget(view);
  }
}