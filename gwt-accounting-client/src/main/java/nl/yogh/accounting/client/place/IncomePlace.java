package nl.yogh.accounting.client.place;

import com.google.gwt.place.shared.Prefix;

public class IncomePlace extends ApplicationPlace {
  public static final String COLOR = "0f9d58";
  private static final String PREFIX = "income";
  
  @Override
  public String getColor() {
    return COLOR;
  }

  @Prefix(PREFIX)
  public static class Tokenizer extends CompositeTokenizer<IncomePlace> {
    @Override
    protected IncomePlace createPlace() {
      return new IncomePlace();
    }
  }
}
