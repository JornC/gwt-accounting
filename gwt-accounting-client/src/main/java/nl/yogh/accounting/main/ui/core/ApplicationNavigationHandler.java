package nl.yogh.accounting.main.ui.core;

import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;

import nl.yogh.accounting.main.widget.menu.FloatingMenu.MenuHandler;

@Singleton
public class ApplicationNavigationHandler implements MenuHandler<ApplicationMenuItem> {

  private final PlaceController placeController;

  @Inject
  public ApplicationNavigationHandler(final PlaceController placeController, final EventBus eventBus) {
    this.placeController = placeController;
  }

  @Override
  public void onMenuSelect(final ApplicationMenuItem item) {
    placeController.goTo(item.getPlace());
  }
}
