package nl.yogh.accounting.domain;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {
  private static final long serialVersionUID = -5312389590363121609L;

  public enum EventType {
    EXPENSE, INCOME
  }

  private EventType type;
  private Date date;

  public Event() {}

  public EventType getType() {
    return type;
  }

  public void setType(final EventType type) {
    this.type = type;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(final Date date) {
    this.date = date;
  }
}