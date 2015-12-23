package nl.yogh.accounting.main.ui.finance;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.inject.Inject;

import nl.yogh.accounting.main.ui.finance.FinanceView.Presenter;

public class FinanceActivity extends AbstractActivity implements Presenter {
  private final FinanceView view;

  @Inject
  public FinanceActivity(final FinanceView view) {
    this.view = view;
  }

  @Override
  public void start(final AcceptsOneWidget panel, final EventBus eventBus) {
    panel.setWidget(view);
  }
}
