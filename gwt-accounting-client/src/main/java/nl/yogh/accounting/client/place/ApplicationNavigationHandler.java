package nl.yogh.accounting.client.place;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;

import nl.yogh.accounting.client.ui.ApplicationMenuItem;
import nl.yogh.accounting.client.widget.menu.FloatingMenu.MenuHandler;

@Singleton
public class ApplicationNavigationHandler implements MenuHandler<ApplicationMenuItem> {

  private final PlaceController placeController;

  @Inject
  public ApplicationNavigationHandler(final PlaceController placeController, final EventBus eventBus) {
    this.placeController = placeController;
  }

  @Override
  public void onMenuSelect(final ApplicationMenuItem item) {
    GWT.log(item.getName());

    placeController.goTo(item.getPlace());
  }
}
