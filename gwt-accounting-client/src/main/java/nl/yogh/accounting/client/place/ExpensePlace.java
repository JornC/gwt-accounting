package nl.yogh.accounting.client.place;

import com.google.gwt.place.shared.Prefix;

public class ExpensePlace extends ApplicationPlace {
  private static final String PREFIX = "expenses";

  @Prefix(PREFIX)
  public static class Tokenizer extends CompositeTokenizer<ExpensePlace> {
    @Override
    protected ExpensePlace createPlace() {
      return new ExpensePlace();
    }
  }
}
