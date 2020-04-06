package gw.acc.iplm.utils

uses org.apache.commons.lang3.time.DateUtils

uses java.text.SimpleDateFormat

class ECFDateTimeParser {

  private var _allowedFormats : String[]

  /**
   * Creates a date parser that accepts multiple patterns.
   * The options for this pattern are the same as the options for {@link SimpleDateFormat} patterns.
   * See {@link SimpleDateFormat}
   * @param pattern String Array of {@link SimpleDateFormat} pattern options
   */
  construct(allowedFormats: String[]) {
    _allowedFormats = allowedFormats
  }

  /**
   * Converts a {@link String} to a {@link Date} based on allowed patterns.
   * Iterates through the array of allowed patterns and returns the first {@link Date} that matches
   * @param text {@link Date} as a {@link String}
   * @return {@link Date}
   */
  function parse(text: String) : Date {
    return DateUtils.parseDate(text, _allowedFormats)
  }

  /**
   * Converts a {@link Date} to a {@link String}
   * @param date {@link Date} to be converted
   * @param formatIndex Position on the allowed patterns array to convert the date to.
   * @return {@link String} representation of the {@link Date}
   */
  function format(date: Date, formatIndex : int = 0) : String {
    if (date == null) {
      throw new IllegalArgumentException("Date can not be null")
    }
    return new SimpleDateFormat(_allowedFormats[formatIndex]).format(date)
  }
}