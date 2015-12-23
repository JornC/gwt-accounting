package nl.yogh.accounting.main.place;

import com.google.gwt.place.shared.Prefix;

import nl.yogh.accounting.main.ui.core.ApplicationViewType;

public class ExpensePlace extends ApplicationPlace {
  private static final String PREFIX = "expenses";

  public ExpensePlace() {
    super(ApplicationViewType.EXPENSE);
  }

  @Prefix(PREFIX)
  public static class Tokenizer extends CompositeTokenizer<ExpensePlace> {
    @Override
    protected ExpensePlace createPlace() {
      return new ExpensePlace();
    }
  }
}
