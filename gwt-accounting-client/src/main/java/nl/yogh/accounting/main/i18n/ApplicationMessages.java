package nl.yogh.accounting.main.i18n;

import com.google.gwt.i18n.client.LocalizableResource.DefaultLocale;
import com.google.gwt.i18n.client.Messages;

import nl.yogh.accounting.main.ui.core.ApplicationViewType;

@DefaultLocale("NL")
public interface ApplicationMessages extends Messages {
  String applicationViewTitle(@Select ApplicationViewType type);
}