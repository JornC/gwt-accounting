package nl.yogh.accounting.client.widget.menu;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Label;

import nl.yogh.accounting.client.util.ColorUtil;

public class MenuItemWidget<M extends MenuItem> extends Label implements HasClickHandlers, MouseOutHandler, MouseOverHandler {
  private final String color;
  private final String activeStyleName;

  private final M value;
  private boolean active;

  public MenuItemWidget(final M value, final String activeStyleName) {
    this.value = value;

    this.activeStyleName = activeStyleName;

    setText(value.getName());

    this.color = value.getColor();

    addMouseOutHandler(this);
    addMouseOverHandler(this);
  }

  @Override
  public void onMouseOver(final MouseOverEvent event) {
    if (active) {
      return;
    }

    activate();
  }

  @Override
  public void onMouseOut(final MouseOutEvent event) {
    if (active) {
      return;
    }

    deactivate();
  }

  @Override
  public HandlerRegistration addClickHandler(final ClickHandler handler) {
    return addDomHandler(handler, ClickEvent.getType());
  }

  public void updateActive() {
    this.active = value.isActive();

    setStyleName(activeStyleName, active);

    if (active) {
      activate();
    } else {
      deactivate();
    }
  }

  private void activate() {
    getElement().getStyle().setBackgroundColor(ColorUtil.webColor(color));
  }

  private void deactivate() {
    getElement().getStyle().clearBackgroundColor();
  }
}