package nl.yogh.accounting.main.ui.finance;

import com.google.gwt.place.shared.Prefix;

import nl.yogh.accounting.main.place.ApplicationPlace;
import nl.yogh.accounting.main.place.CompositeTokenizer;

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
