package nl.yogh.accounting.client.place;

import com.google.gwt.place.shared.Prefix;

public class FinancePlace extends ApplicationPlace {
  private static final String PREFIX = "finance";
  public static final String COLOR = "CEBE00";

  @Override
  public String getColor() {
    return COLOR;
  }

  @Prefix(PREFIX)
  public static class Tokenizer extends CompositeTokenizer<FinancePlace> {
    @Override
    protected FinancePlace createPlace() {
      return new FinancePlace();
    }
  }
}
