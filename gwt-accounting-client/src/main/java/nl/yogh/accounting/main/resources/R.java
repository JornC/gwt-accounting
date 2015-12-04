package nl.yogh.accounting.main.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;

/**
 * Global resource class, access resources via R.css().
 */
public final class R {
  private static final ApplicationResource RESOURCES = GWT.create(ApplicationResource.class);

  /**
   * Application CssResources.
   */
  public interface ApplicationCssResource extends CssResource {
    String mainContent();

    String link();

    String flex();

    String columns();

    String justify();

    String alignCenter();

    String grow();

    String panel();
  }

  /**
   * Ensures css is injected. Should be called as soon as possible on startup.
   */
  public static void init() {
    RESOURCES.css().ensureInjected();
  }

  public interface ApplicationResource extends ClientBundle {
    @Source("strict.css")
    ApplicationCssResource css();
  }

  /**
   * Access to css resources.
   */
  public static ApplicationCssResource css() {
    return RESOURCES.css();
  }
}