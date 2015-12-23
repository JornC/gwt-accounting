package nl.yogh.accounting.main.place;

import nl.yogh.accounting.main.ui.expense.ExpenseActivity;
import nl.yogh.accounting.main.ui.finance.FinanceActivity;
import nl.yogh.accounting.main.ui.income.IncomeActivity;
import nl.yogh.accounting.main.ui.overview.OverviewActivity;

/**
 * Methods capable of creating presenters given the place that is passed in.
 */
public interface ActivityFactory {
  OverviewActivity createOverviewPresenter(OverviewPlace place);

  IncomeActivity createIncomeActivity(IncomePlace place);

  ExpenseActivity createExpenseActivity(ExpensePlace place);

  FinanceActivity createFinanceActivity(FinancePlace place);
}