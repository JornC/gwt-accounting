package nl.yogh.accounting.main.ui.overview;

import com.google.gwt.place.shared.Prefix;

import nl.yogh.accounting.main.place.ApplicationPlace;
import nl.yogh.accounting.main.place.CompositeTokenizer;

public class OverviewPlace extends ApplicationPlace {
  private static final String PREFIX = "overview";
  public static final String COLOR = "4285f4";

  @Override
  public String getColor() {
    return COLOR;
  }
  
  @Prefix(PREFIX)
  public static class Tokenizer extends CompositeTokenizer<OverviewPlace> {
    @Override
    protected OverviewPlace createPlace() {
      return new OverviewPlace();
    }
  }

}
