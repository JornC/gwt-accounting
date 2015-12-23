package nl.yogh.accounting.main.widget;

import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.Widget;

import nl.yogh.accounting.util.HasDate;

public class BundledHistoryPanel {

  public void add(final IsWidget child) {
    add(child.asWidget());
  }

  public void add(final Widget child) {
    if(child instanceof HasDate) {

    }
  }
}
