package nl.yogh.accounting.main.ui.core;

public enum ApplicationViewType {
  OVERVIEW("#4285f4"), EXPENSE("#EF6C00"), INCOME("#0f9d58"), FINANCE("#CEBE00");

  private final String color;

  private ApplicationViewType(final String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }
}
