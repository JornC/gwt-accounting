package nl.yogh.accounting.main.ui.income;

import com.google.gwt.place.shared.Prefix;

import nl.yogh.accounting.main.place.ApplicationPlace;
import nl.yogh.accounting.main.place.CompositeTokenizer;

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
