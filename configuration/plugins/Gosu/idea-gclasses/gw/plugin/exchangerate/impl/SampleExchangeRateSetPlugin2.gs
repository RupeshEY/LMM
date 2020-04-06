package gw.plugin.exchangerate.impl;
uses gw.plugin.exchangerate.IExchangeRateSetPlugin
uses gw.api.util.CurrencyUtil
uses java.util.ArrayList
uses gw.api.util.DateUtil
uses gw.api.util.Logger

/**
 * A version of Sample ExchangeRates plugin that sets the
 * exchange rate to the same value for all currencies, rotating through
 * a set of possible ratios to help test or demonstrate scenarios where the exchange
 * rate is fluctuating.
 */
@Export
class SampleExchangeRateSetPlugin2 implements IExchangeRateSetPlugin
{
  static var _index = 0

  static var _rates = { 1, 2, 3, 2  }

  construct()
  {
  }

  public override function createExchangeRateSet() : ExchangeRateSet {
    Logger.logInfo(" SampleExchangeRateSetPlugin2 returning a rate set with exchange rate = " + _rates[_index]);
    var defaultCurrency = CurrencyUtil.getDefaultCurrency()

    var exchangeRates = new ArrayList<ExchangeRate>()
    for (var currency in typekey.Currency.getTypeKeys( true )) {
      if (currency != defaultCurrency) {
        exchangeRates.add( CurrencyUtil.createExchangeRate( currency, defaultCurrency, _rates[_index] ) )
      }
    }
    _index++
    if (_index >= _rates.size()) _index = 0
    return CurrencyUtil.createMarketExchangeRateSet( "Test ExchangeRateSet", "From SampleExchangeRateSetPlugin.",
        DateUtil.currentDate(), null, exchangeRates )
  }
}
