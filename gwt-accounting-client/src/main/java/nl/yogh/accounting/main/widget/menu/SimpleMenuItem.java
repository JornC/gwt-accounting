package nl.yogh.accounting.main.widget.menu;

public class SimpleMenuItem implements MenuItem {
  private String color;
  private String name;

  public SimpleMenuItem(final String name, final String color) {
    this.name = name;
    this.color = color;
  }

  public void setColor(final String color) {
    this.color = color;
  }

  public void setName(final String name) {
    this.name = name;
  }

  @Override
  public String getColor() {
    return color;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public boolean isActive() {
    return false;
  }
}
