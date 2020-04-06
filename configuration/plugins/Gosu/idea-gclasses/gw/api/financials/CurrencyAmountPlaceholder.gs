package gw.api.financials
uses java.math.BigDecimal
uses gw.datatype.annotation.DataType
uses gw.datatype.annotation.Parameter
uses java.lang.IllegalArgumentException

/**
 * CurrencyAmountPlaceholder is a class that allows a variable on a PCF to be typed as a currency amount
 * As such, the variable will be run though the various validation checks on the UI to ensure it is a
 * proper value for a currency.  If it is not, the user will be alerted through the messages at the top
 * just as if they were editing a currency amount on an actual class.
 * 
 */
@Export
class CurrencyAmountPlaceholder {
  private var _currency : Currency
  private var _value : CurrencyAmount

  construct(curr : Currency, startingVal : CurrencyAmount) {
    if (curr == null) {
      throw new IllegalArgumentException("currency should not be null")
    }
    if (startingVal != null and startingVal.Currency != curr) {
      throw new IllegalArgumentException("currency of value ${startingVal.Currency.Code} should be ${curr.Code}")
    }
    _currency = curr
    _value = startingVal
  }

  property get Currency() : Currency {
    return _currency
  }
  
  /**
   * The DataType annotation will cause the UI to treat any field using this placeholder to verify the incoming
   * value against currency restrictions, not just BigDecimal ones.
   */
  @DataType("currencyamount", {
    new Parameter("currencyProperty", "Currency")
  })
  property get Value() : CurrencyAmount {
    return _value
  }
  
  property set Value(newVal : CurrencyAmount) {
    if (newVal != null and newVal.Currency != _currency) {
      throw new IllegalArgumentException("currency of value ${newVal.Currency.Code} should be ${_currency.Code}")
    }
    _value = newVal
  }

  property get Amount() : BigDecimal {
    return _value?.Amount
  } 
}
