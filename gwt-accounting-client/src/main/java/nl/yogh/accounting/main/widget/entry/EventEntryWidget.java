package nl.yogh.accounting.main.widget.entry;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class EventEntryWidget extends Composite {
  interface EventEntryUiBinder extends UiBinder<Widget, EventEntryWidget> {}

  private static final EventEntryUiBinder UI_BINDER = GWT.create(EventEntryUiBinder.class);

  public EventEntryWidget() {
    initWidget(UI_BINDER.createAndBindUi(this));
  }
}
