package nl.yogh.accounting.client.place;

import com.google.gwt.place.shared.Prefix;

public class IncomePlace extends ApplicationPlace {
  private static final String PREFIX = "income";

  @Prefix(PREFIX)
  public static class Tokenizer extends CompositeTokenizer<IncomePlace> {
    @Override
    protected IncomePlace createPlace() {
      return new IncomePlace();
    }
  }
}
