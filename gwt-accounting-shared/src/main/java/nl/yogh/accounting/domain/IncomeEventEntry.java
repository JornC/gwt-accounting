package nl.yogh.accounting.domain;

public class IncomeEventEntry extends GenericEventEntry {
  private static final long serialVersionUID = -7152700442074217995L;

  public IncomeEventEntry() {
    super(EntryType.INCOME);
  }
}
