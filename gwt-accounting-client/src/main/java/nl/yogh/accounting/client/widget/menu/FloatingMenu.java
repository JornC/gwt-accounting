package nl.yogh.accounting.client.widget.menu;

import java.util.List;

import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;

public class FloatingMenu<M extends MenuItem> extends FlowPanel {
  private final MenuItemFactory<M> factory;

  public static interface MenuHandler<M> {
    void onMenuSelect(M item);
  }

  public FloatingMenu(final MenuItemFactory<M> factory) {
    this.factory = factory;
  }

  public void addItems(final M[] items) {
    for (final M item : items) {
      addItem(item);
    }
  }

  public void addItems(final List<M> items) {
    for (final M item : items) {
      addItem(item);
    }
  }

  public void setMenuStyle(final String styleName) {
    factory.setCellStyle(styleName);
  }

  public void setActiveMenuStyle(final String styleName) {
    factory.setActiveStyle(styleName);
  }

  private void addItem(final M item) {
    final MenuItemWidget<M> widg = factory.createWidget(item);

    factory.applyCellOptions(widg, item);

    add(widg.asWidget());
  }

  public void updateActive() {
    for (final Widget w : this) {
      if (w instanceof MenuItemWidget) {
        ((MenuItemWidget<?>) w).updateActive();
      }
    }
  }
}
