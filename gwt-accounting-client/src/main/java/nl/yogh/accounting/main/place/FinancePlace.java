package nl.yogh.accounting.main.place;

import com.google.gwt.place.shared.Prefix;

import nl.yogh.accounting.main.ui.core.ApplicationViewType;

public class FinancePlace extends ApplicationPlace {
  private static final String PREFIX = "finance";

  public FinancePlace() {
    super(ApplicationViewType.FINANCE);
  }

  @Prefix(PREFIX)
  public static class Tokenizer extends CompositeTokenizer<FinancePlace> {
    @Override
    protected FinancePlace createPlace() {
      return new FinancePlace();
    }
  }
}
