package nl.yogh.accounting.domain;

public abstract class GenericEventEntry extends EventEntry {
  private static final long serialVersionUID = -8869667080926754486L;

  private String title;

  public GenericEventEntry(final EntryType type) {
    super(type);
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
