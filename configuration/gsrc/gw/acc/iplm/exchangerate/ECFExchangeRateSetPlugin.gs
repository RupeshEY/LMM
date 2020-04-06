package gw.acc.iplm.exchangerate

uses gw.api.util.CurrencyUtil
uses gw.api.util.DateUtil
uses gw.api.util.Logger
uses gw.plugin.exchangerate.IExchangeRateSetPlugin

/**
 * A version of Sample ExchangeRates plugin that sets the
 * exchange rate to the same value for all currencies, rotating through
 * a set of possible ratios to help test or demonstrate scenarios where the exchange
 * rate is fluctuating.
 */
@Export
class ECFExchangeRateSetPlugin implements IExchangeRateSetPlugin {
  static var _index = 0

  static var _rates = {1, 2, 3, 2}

  construct() {
  }

  public override function createExchangeRateSet(): ExchangeRateSet {
    Logger.logInfo(" SampleExchangeRateSetPlugin2 returning a rate set with exchange rate = " + _rates[_index])

    _index++
    if (_index >= _rates.size()) _index = 0
    return CurrencyUtil.createMarketExchangeRateSet("Test ExchangeRateSet", "From SampleExchangeRateSetPlugin.",
        DateUtil.currentDate(), null, getExchangeRateList())
  }

  public function getExchangeRateList(): List<ExchangeRate> {
    var defaultCurrency = CurrencyUtil.getDefaultCurrency()

    var exchangeRates = new ArrayList<ExchangeRate>()
    for (var currency in typekey.Currency.getTypeKeys(true)) {
      if (currency != defaultCurrency) {
        exchangeRates.add(CurrencyUtil.createExchangeRate(currency, defaultCurrency, _rates[_index]))
      }
    }

    for (var currency in typekey.Currency.getTypeKeys(true)) {
      if (currency != Currency.TC_GBP) {
        exchangeRates.add(CurrencyUtil.createExchangeRate(currency, Currency.TC_GBP, _rates[_index]))
      }
    }

    for (var currency in typekey.Currency.getTypeKeys(true)) {
      if (currency != Currency.TC_EUR) {
        exchangeRates.add(CurrencyUtil.createExchangeRate(currency, Currency.TC_EUR, _rates[_index]))
      }
    }

    return exchangeRates
  }
}
