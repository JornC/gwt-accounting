package nl.yogh.accounting.client.widget;

import com.google.gwt.user.client.ui.IsWidget;

/**
 * Simple widget factory which can generate a widget out of some object type.
 *
 * @param <L> Type of object to generate a widget out of.
 * @param <W> the widget type to return
 */
public abstract class WidgetFactory<L, W extends IsWidget> {
  private String cellStyle;

  public void setCellStyle(final String style) {
    this.cellStyle = style;
  }

  /**
   * @param object Value this widget will be generated with.
   * @return A widget.
   */
  public abstract W createWidget(final L object);

  /**
   * Apply cell options to a created widget. Adds a debug ID and/or style, if any by default.
   *
   * May be overridden to do something more complicated (be sure to call .super)
   *
   * @param cell Cell container to apply options to.
   * @param object Object contained in the cell.
   */
  public void applyCellOptions(final W cell, final L object) {
    if (cell == null) {
      return;
    }

    if (cellStyle != null) {
      cell.asWidget().addStyleName(cellStyle);
    }
  }
}