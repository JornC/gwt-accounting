package nl.yogh.accounting.main.ui.expense;

import com.google.gwt.place.shared.Prefix;

import nl.yogh.accounting.main.place.ApplicationPlace;
import nl.yogh.accounting.main.place.CompositeTokenizer;

public class ExpensePlace extends ApplicationPlace {
  public static final String COLOR = "EF6C00";
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
