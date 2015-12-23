package nl.yogh.accounting.domain;

import java.io.Serializable;
import java.util.Date;

import nl.yogh.accounting.util.HasDate;

public class EventEntry implements Serializable, HasDate {
  private static final long serialVersionUID = -5312389590363121609L;

  public enum EntryType {
    EXPENSE, INCOME
  }

  private EntryType type;
  private Date date;

  public EventEntry(final EntryType type) {
    this.type = type;
  }

  public EntryType getType() {
    return type;
  }

  public void setType(final EntryType type) {
    this.type = type;
  }

  @Override
  public Date getDate() {
    return date;
  }

  public void setDate(final Date date) {
    this.date = date;
  }
}
