package nl.yogh.accounting.main;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.inject.client.assistedinject.GinFactoryModuleBuilder;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;

import nl.yogh.accounting.main.place.ActivityFactory;
import nl.yogh.accounting.main.place.ApplicationActivityMapper;
import nl.yogh.accounting.main.place.ApplicationPlaceHistoryMapper;
import nl.yogh.accounting.main.ui.ApplicationDisplay;
import nl.yogh.accounting.main.ui.ApplicationRootView;

public class ApplicationClientModule extends AbstractGinModule {
  @Override
  protected void configure() {
    bind(ApplicationDisplay.class).to(ApplicationRootView.class).in(Singleton.class);
    bind(ActivityMapper.class).to(ApplicationActivityMapper.class).in(Singleton.class);
    bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
    bind(PlaceController.class).to(ApplicationPlaceController.class).in(Singleton.class);
    bind(PlaceHistoryMapper.class).to(ApplicationPlaceHistoryMapper.class).in(Singleton.class);

    install(new GinFactoryModuleBuilder().build(ActivityFactory.class));
  }

  public static class ApplicationPlaceController extends PlaceController {
    @Inject
    public ApplicationPlaceController(final EventBus eventBus) {
      super(eventBus);
    }
  }
}
