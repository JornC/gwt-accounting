package nl.yogh.accounting.main.ui.overview;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class OverviewViewImpl extends Composite implements OverviewView {
  interface OverviewViewImplUiBinder extends UiBinder<Widget, OverviewViewImpl> {}

  private static final OverviewViewImplUiBinder UI_BINDER = GWT.create(OverviewViewImplUiBinder.class);

  public OverviewViewImpl() {
    initWidget(UI_BINDER.createAndBindUi(this));
  }
}
