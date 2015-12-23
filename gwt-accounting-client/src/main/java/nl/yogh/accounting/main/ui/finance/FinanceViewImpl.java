package nl.yogh.accounting.main.ui.finance;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class FinanceViewImpl extends Composite implements FinanceView {
  interface FinanceViewImplUiBinder extends UiBinder<Widget, FinanceViewImpl> {}

  private static final FinanceViewImplUiBinder UI_BINDER = GWT.create(FinanceViewImplUiBinder.class);

  public FinanceViewImpl() {
    initWidget(UI_BINDER.createAndBindUi(this));
  }
}
