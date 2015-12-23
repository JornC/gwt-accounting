package nl.yogh.accounting.main.ui.core;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.binder.EventBinder;
import com.google.web.bindery.event.shared.binder.EventHandler;

import nl.yogh.accounting.main.i18n.M;
import nl.yogh.accounting.main.place.PlaceChangeEvent;
import nl.yogh.accounting.main.util.ColorUtil;
import nl.yogh.accounting.main.util.StyleUtil;

public class ApplicationNavBar extends Composite {
  interface ApplicationNavBarUiBinder extends UiBinder<Widget, ApplicationNavBar> {}

  private static final ApplicationNavBarUiBinder UI_BINDER = GWT.create(ApplicationNavBarUiBinder.class);

  interface ApplicationNavBarEventBinder extends EventBinder<ApplicationNavBar> {}

  private final ApplicationNavBarEventBinder EVENT_BINDER = GWT.create(ApplicationNavBarEventBinder.class);

  public interface CustomStyle extends CssResource {
    String searchMode();
  }

  @UiField FlowPanel navBar;
  @UiField Label navBarTitle;
  @UiField TextBox search;
  @UiField CustomStyle style;
  private ApplicationViewType currentViewType;

  @Inject
  public ApplicationNavBar(final EventBus eventBus) {
    initWidget(UI_BINDER.createAndBindUi(this));
    EVENT_BINDER.bindEventHandlers(this, eventBus);

    StyleUtil.setPlaceHolder(search, "Search");
  }

  @EventHandler
  public void onPlaceChange(final PlaceChangeEvent e) {
    currentViewType = e.getValue().getType();

    updateNavBar();
  }

  private void updateNavBar() {
    navBarTitle.setText(M.messages().applicationViewTitle(currentViewType));
    navBar.getElement().getStyle().setBackgroundColor(ColorUtil.webColor(currentViewType.getColor()));
  }

  @UiHandler("search")
  public void onSearchFieldFocus(final FocusEvent e) {
    navBar.setStyleName(style.searchMode(), true);
    navBarTitle.setText("Search");
  }

  @UiHandler("search")
  public void onSearchFieldBlur(final BlurEvent e) {
    navBar.setStyleName(style.searchMode(), false);
    navBarTitle.setText(M.messages().applicationViewTitle(currentViewType));
  }
}
