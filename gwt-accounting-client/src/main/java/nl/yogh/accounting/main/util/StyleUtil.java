package nl.yogh.accounting.main.util;

import com.google.gwt.user.client.ui.TextBox;

public class StyleUtil {
  public static void setPlaceHolder(final TextBox box, final String placeholder) {
    box.getElement().setAttribute("placeholder", placeholder);
  }
}
