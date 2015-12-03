package nl.yogh.accounting.client.place;

import com.google.gwt.place.shared.Prefix;

public class ExpensePlace extends ApplicationPlace {
  public static final String COLOR = "D31717";
  private static final String PREFIX = "expenses";
  
  @Override
  public String getColor() {
    return COLOR;
  }

  @Prefix(PREFIX)
  public static class Tokenizer extends CompositeTokenizer<ExpensePlace> {
    @Override
    protected ExpensePlace createPlace() {
      return new ExpensePlace();
    }
  }
}
