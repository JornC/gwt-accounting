package nl.yogh.accounting.main.util;

public final class ColorUtil {
  private static final int MIN_HEX_LENGTH = 3;
  private static final int MAX_HEX_LENGTH = 6;

  private ColorUtil() {}

  public static String webColor(final String color) {
    return color == null || color.isEmpty() || color.charAt(0) == '#' || color.length() != MIN_HEX_LENGTH && color.length() != MAX_HEX_LENGTH ? color
        : "#" + color;
  }
}
