package nl.yogh.accounting.main;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.place.shared.PlaceChangeEvent;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;

import nl.yogh.accounting.main.di.ApplicationGinjector;
import nl.yogh.accounting.main.place.ApplicationPlace;
import nl.yogh.accounting.main.resources.R;
import nl.yogh.accounting.main.ui.overview.OverviewPlace;

public class Application implements EntryPoint {

  @Inject ApplicationInitializer initializer;

  @Inject EventBus eventBus;

  @Inject ApplicationActivityMapper activityMapper;

  @Inject PlaceHistoryMapper historyMapper;

  @Inject PlaceController placeController;

  @Override
  public void onModuleLoad() {
    ApplicationGinjector.INSTANCE.inject(this);

    R.init();
    initializer.init();

    // Wrap GWT's PlaceChangeEvent with our own
    eventBus.addHandler(PlaceChangeEvent.TYPE, new PlaceChangeEvent.Handler() {
      @Override
      public void onPlaceChange(final PlaceChangeEvent event) {
        if (event.getNewPlace() instanceof ApplicationPlace) {
          eventBus.fireEvent(new nl.yogh.accounting.main.event.PlaceChangeEvent((ApplicationPlace) event.getNewPlace()));
        }
      }
    });

    final ApplicationDisplay applicationDisplay = ApplicationGinjector.INSTANCE.getApplicationRootView();

    final ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
    activityManager.setDisplay(applicationDisplay);

    final PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historyMapper);
    historyHandler.register(placeController, eventBus, new OverviewPlace());
    historyHandler.handleCurrentHistory();

    RootPanel.get().add(applicationDisplay);
  }
}
