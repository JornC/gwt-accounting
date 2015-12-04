package nl.yogh.accounting.main.place;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;

import nl.yogh.accounting.main.ui.expense.ExpensePlace;
import nl.yogh.accounting.main.ui.finance.FinancePlace;
import nl.yogh.accounting.main.ui.income.IncomePlace;
import nl.yogh.accounting.main.ui.overview.OverviewPlace;

@WithTokenizers({ ExpensePlace.Tokenizer.class, FinancePlace.Tokenizer.class, IncomePlace.Tokenizer.class, OverviewPlace.Tokenizer.class })
public interface ApplicationPlaceHistoryMapper extends PlaceHistoryMapper {}