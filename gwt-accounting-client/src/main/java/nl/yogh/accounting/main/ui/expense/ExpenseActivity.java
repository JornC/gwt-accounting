package nl.yogh.accounting.main.ui.expense;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

import nl.yogh.accounting.main.ui.expense.ExpenseView.Presenter;

public class ExpenseActivity extends AbstractActivity implements Presenter {
  private final ExpenseView view;

  @Inject
  public ExpenseActivity(final ExpenseView view) {
    this.view = view;
  }

  @Override
  public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
    panel.setWidget(view);
  }
}
