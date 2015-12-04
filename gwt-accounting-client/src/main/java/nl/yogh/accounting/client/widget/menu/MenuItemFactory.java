package nl.yogh.accounting.client.widget.menu;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;

import nl.yogh.accounting.client.widget.WidgetFactory;
import nl.yogh.accounting.client.widget.menu.FloatingMenu.MenuHandler;

public class MenuItemFactory<M extends MenuItem> extends WidgetFactory<M, MenuItemWidget<M>> {

  private final MenuHandler<M> menuHandler;

  private String activeStyleName;

  public MenuItemFactory(final MenuHandler<M> menuHandler) {
    this.menuHandler = menuHandler;
  }

  @Override
  public MenuItemWidget<M> createWidget(final M object) {
    return new MenuItemWidget<M>(object, activeStyleName);
  }

  @Override
  public void applyCellOptions(final MenuItemWidget<M> cell, final M object) {
    super.applyCellOptions(cell, object);

    cell.addClickHandler(new ClickHandler() {
      @Override
      public void onClick(final ClickEvent event) {
        menuHandler.onMenuSelect(object);
      }
    });
  }

  public void setActiveStyle(final String styleName) {
    this.activeStyleName = styleName;
  }
}
