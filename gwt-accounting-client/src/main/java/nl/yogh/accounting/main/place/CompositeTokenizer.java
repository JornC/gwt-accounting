package nl.yogh.accounting.main.place;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gwt.http.client.URL;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;

public abstract class CompositeTokenizer<P extends Place> implements PlaceTokenizer<P> {
  private static final String ARGUMENT_DIVIDER = "&";
  private static final String VALUE_DIVIDER = "=";

  @Override
  public final P getPlace(final String token) {
    final Map<String, String> values = new HashMap<String, String>();
    final String[] args = token.split(ARGUMENT_DIVIDER);

    for (final String arg : args) {

      final String[] value = arg.split(VALUE_DIVIDER);

      values.put(URL.decodeQueryString(value[0]), value.length > 1 ? URL.decodeQueryString(value[1]) : null);
    }
    final P place = createPlace();
    updatePlace(values, place);
    return place;
  }

  @Override
  public final String getToken(final P place) {
    final Map<String, String> tokens = new HashMap<String, String>();

    setTokenMap(place, tokens);
    final StringBuilder sb = new StringBuilder();
    boolean first = true;
    for (final Entry<String, String> entry : tokens.entrySet()) {
      if (first) {
        first = false;
      } else {
        sb.append(ARGUMENT_DIVIDER);
      }
      sb.append(URL.encodeQueryString(entry.getKey()));
      if (entry.getValue() != null) {
        sb.append(VALUE_DIVIDER + URL.encodeQueryString(entry.getValue()));
      }
    }
    return sb.toString();
  }

  protected boolean booleanValue(final Map<String, String> tokens, final String key) {
    return tokens.containsKey(key);
  }

  protected int intValue(final Map<String, String> tokens, final String key) {
    return intValue(tokens, key, 0);
  }

  protected int intValue(final Map<String, String> tokens, final String key, final int defaultValue) {
    if (tokens.containsKey(key)) {
      final String value = tokens.get(key);
      try {
        return value == null ? defaultValue : Integer.parseInt(value);
      } catch (final NumberFormatException e) {
        return defaultValue;
      }
    }
    return defaultValue;
  }

  protected void put(final Map<String, String> tokens, final String key) {
    tokens.put(key, null);
  }

  protected void put(final Map<String, String> tokens, final String key, final Integer value) {
    if (value != null) {
      tokens.put(key, String.valueOf(value));
    }
  }

  protected void put(final Map<String, String> tokens, final String key, final int value) {
    tokens.put(key, String.valueOf(value));
  }

  protected void put(final Map<String, String> tokens, final String key, final String value) {
    tokens.put(key, value);
  }

  protected void put(final Map<String, String> tokens, final String key, final Double value) {
    if (value != null) {
      tokens.put(key, String.valueOf(value));
    }
  }

  protected void put(final Map<String, String> tokens, final String key, final double value) {
    tokens.put(key, String.valueOf(value));
  }

  /**
   * Returns a new instance of the place.
   *
   * @return new place instance
   */
  protected abstract P createPlace();

  /**
   * In the implementation place any additional key values present in the tokens in the given place object and
   *
   * @param tokens
   * @return
   */
  protected void updatePlace(final Map<String, String> tokens, final P place) {

  }

  /**
   * In the implementation add additional key/values from the place into the token map.
   *
   * @param place
   *          place object
   * @param tokens
   *          token map
   */
  protected void setTokenMap(final P place, final Map<String, String> tokens) {

  }
}