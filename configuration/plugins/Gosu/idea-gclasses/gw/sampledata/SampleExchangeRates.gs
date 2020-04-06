package gw.sampledata

uses gw.pl.persistence.core.Bundle
uses java.util.Map
uses java.math.BigDecimal
uses gw.api.util.CurrencyUtil
uses gw.api.util.DisplayableException
uses gw.util.Pair

@Export
class SampleExchangeRates extends SampleDataBase {

  /**
   * Maps the given pair of currencies (default and secondary) to an exchange
   * rate. Unfortunately has to use strings (the currency.Code field) rather
   * than Currency, because it needs to reference currencies that don't exist
   * in the out of box configuration.
   * <p>
   * When setting up exchange rates we first look in this map to see if there
   * is an exact match for the default currency/currency pair. If there is we
   * use it. If not we back off and look up the currency in the
   * CURRENCY_TO_RATE map
   */
  static var CURRENCY_PAIR_TO_RATE : Map<Pair<String,String>,BigDecimal> = {
    new Pair<String,String>("eur", "usd") -> 0.7643402,
    new Pair<String,String>("eur", "gbp") -> 1.468163,
    new Pair<String,String>("eur", "cad") -> 0.6475703,
    new Pair<String,String>("eur", "aud") -> 0.5888327,
    new Pair<String,String>("eur", "rub") -> 0.03176677,
    new Pair<String,String>("eur", "rub") -> 0.0129
  }

  /**
   * Maps a given currency to a rate; this rate will be used for the exchange
   * rate that converts the default currency to the given currency.
   * <p>
   * Normally the default currency is dollars so the values in this map make
   * most sense for dollars. But if the default currency is something else we
   * use this same map. This may not make that much sense (e.g. if the default
   * currency is rubles the rubles -> euro exchange rate is not going to be
   * realistic) but it at least gives a value that won't cause the UI to crash.
   * <p>
   * If the defaults given by this map are not good enough you can add
   * mappings for specific currency pairs to CURRENCY_PAIR_TO_RATE.
   * <p>
   * One special case; the mapping from the default currency to itself is
   * always one, and the value in this map is ignored in that case.
   */
  static var CURRENCY_TO_RATE : Map<String,BigDecimal> = {
    "usd" -> 1.203,
    "eur" -> 1.308318,
    "gbp" -> 1.920824,
    "cad" -> 0.8472279,
    "aud" -> 0.7703804,
    "rub" -> 0.04156103,
    "nzd" -> 0.8902,
    "jpy" -> 0.0129
  }
  
  construct(inCache : SampleDataCache) {
    super(inCache)
  }

  override property get Description() : String {
    return "ExchangeRateSet and ExchangeRate"
  }

  override function testSampleData(bundle : Bundle) {

    var exchangeRateSetDemoSample4000 = new gw.api.databuilder.ExchangeRateSetBuilder()
      .marketRates()
      .withPublicId("demo_sample:4000")
      .withDescription("Sample data current market rates set.")
      .withEffectiveDate(BaseDate.addDays(-530))
      .withName("CurrentRates")
      .create(bundle)

    var defaultCurrency = CurrencyUtil.getDefaultCurrency()
    for (currency in Currency.getTypeKeys(false)) {
      new gw.api.databuilder.CCExchangeRateBuilder()
              .withRate(getExchangeRate(defaultCurrency, currency))
              .onExchangeRateSet(exchangeRateSetDemoSample4000)
              .withPriceCurrency(defaultCurrency)
              .withBaseCurrency(currency)
              .create(bundle)
    }
  }

  /**
   * Find a rate for the given defaultCurrency, currency pair. If the two
   * currencies are the same, return 1 If they have a specific mapping in
   * the CURRENCY_PAIR_TO_RATE map, then return that. Otherwise back off
   * to looking up the currency in CURRENCY_TO_RATE
   */
  private static function getExchangeRate(defaultCurrency : Currency, currency : Currency) : BigDecimal {
    var rate : BigDecimal = 1
    if (currency != defaultCurrency) {
      var pair = new Pair<String,String>(defaultCurrency.Code, currency.Code)
      if (CURRENCY_PAIR_TO_RATE.containsKey(pair)) {
        rate = CURRENCY_PAIR_TO_RATE.get(pair)
      } else {
        rate = CURRENCY_TO_RATE.get(currency.Code)
      }
    }
    if (rate == null) {
      throw new DisplayableException("Cannot load sample data because there is no exchange rate for ${currency}; please add a rate to the CURRENCY_TO_RATE map in SampleExchangeRates.gs")
    }
    return rate
  }

  static function reloadSampleExchangeRates() {
    var erSet = new gw.api.databuilder.ExchangeRateSetBuilder()
        .marketRates()
        .withDescription("Sample data current market rates set.")
        .effectiveNow()
        .withName("CurrentRates")
        .createInNewBundle()

    var defaultCurrency = CurrencyUtil.getDefaultCurrency()
    for (currency in Currency.getTypeKeys(false)) {
      new gw.api.databuilder.CCExchangeRateBuilder()
          .withRate(getExchangeRate(defaultCurrency, currency))
          .onExchangeRateSet(erSet)
          .withPriceCurrency(defaultCurrency)
          .withBaseCurrency(currency)
          .create(erSet.Bundle)
    }

    erSet.Bundle.commit()
  }
  
}
