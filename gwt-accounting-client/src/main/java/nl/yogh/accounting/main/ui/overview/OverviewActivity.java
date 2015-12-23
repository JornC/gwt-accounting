package nl.yogh.accounting.main.ui.overview;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;

import nl.yogh.accounting.main.ui.expense.ExpenseView.Presenter;

public class OverviewActivity extends AbstractActivity implements Presenter {
  private final OverviewView view;

  public OverviewActivity(final OverviewView view) {
    this.view = view;
  }

  @Override
  public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
    panel.setWidget(view);
  }
}