package nl.yogh.accounting.main.place;

import com.google.gwt.place.shared.Prefix;

import nl.yogh.accounting.main.ui.core.ApplicationViewType;

public class IncomePlace extends EventPlace {
  private static final String PREFIX = "income";

  public IncomePlace() {
    super(ApplicationViewType.INCOME);
  }

  @Prefix(PREFIX)
  public static class Tokenizer extends CompositeTokenizer<IncomePlace> {
    @Override
    protected IncomePlace createPlace() {
      return new IncomePlace();
    }
  }
}
