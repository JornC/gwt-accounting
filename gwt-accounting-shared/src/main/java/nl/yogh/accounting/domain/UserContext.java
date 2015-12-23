package nl.yogh.accounting.domain;

import java.util.ArrayList;

public class UserContext {
  private ArrayList<EventEntry> events;

  public UserContext() {
    events = new ArrayList<EventEntry>();

    events.add(new IncomeEventEntry() {
      {
        setTitle("Test 1");
      }
    });
    events.add(new IncomeEventEntry() {
      {
        setTitle("Test 2");
      }
    });
    events.add(new ExpenseEventEntry() {
      {
        setTitle("Test 1");
      }
    });
    events.add(new ExpenseEventEntry() {
      {
        setTitle("Test 2");
      }
    });
  }

  public ArrayList<EventEntry> getEvents() {
    return events;
  }

  public void setEvents(final ArrayList<EventEntry> events) {
    this.events = events;
  }
}
