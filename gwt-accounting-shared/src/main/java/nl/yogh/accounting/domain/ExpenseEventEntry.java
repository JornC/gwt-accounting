package nl.yogh.accounting.domain;

public class ExpenseEventEntry extends GenericEventEntry {
  private static final long serialVersionUID = -7152700442074217995L;

  public ExpenseEventEntry() {
    super(EntryType.EXPENSE);
  }
}
