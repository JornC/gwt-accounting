package nl.yogh.accounting.main.place;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

@WithTokenizers({ ExpensePlace.Tokenizer.class, FinancePlace.Tokenizer.class, IncomePlace.Tokenizer.class, OverviewPlace.Tokenizer.class })
public interface ApplicationPlaceHistoryMapper extends PlaceHistoryMapper {}