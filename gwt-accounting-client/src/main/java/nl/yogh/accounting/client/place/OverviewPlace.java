package nl.yogh.accounting.client.place;

import com.google.gwt.place.shared.Prefix;

public class OverviewPlace extends ApplicationPlace {
  private static final String PREFIX = "overview";

  @Prefix(PREFIX)
  public static class Tokenizer extends CompositeTokenizer<OverviewPlace> {
    @Override
    protected OverviewPlace createPlace() {
      return new OverviewPlace();
    }
  }

}
