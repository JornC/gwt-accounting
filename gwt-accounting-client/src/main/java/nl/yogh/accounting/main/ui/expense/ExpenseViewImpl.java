package nl.yogh.accounting.main.ui.expense;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ExpenseViewImpl extends Composite implements ExpenseView {
  interface ExpenseViewImplUiBinder extends UiBinder<Widget, ExpenseViewImpl> {}

  private static final ExpenseViewImplUiBinder UI_BINDER = GWT.create(ExpenseViewImplUiBinder.class);

  public ExpenseViewImpl() {
    initWidget(UI_BINDER.createAndBindUi(this));
  }
}
