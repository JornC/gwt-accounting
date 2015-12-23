package nl.yogh.accounting.main.ui.income;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class IncomeViewImpl extends Composite implements IncomeView {
  interface IncomeViewImplUiBinder extends UiBinder<Widget, IncomeViewImpl> {}

  private static final IncomeViewImplUiBinder UI_BINDER = GWT.create(IncomeViewImplUiBinder.class);

  public IncomeViewImpl() {
    initWidget(UI_BINDER.createAndBindUi(this));
  }
}
