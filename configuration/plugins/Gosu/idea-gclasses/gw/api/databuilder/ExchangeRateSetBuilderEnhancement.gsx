package gw.api.databuilder
uses java.math.BigDecimal

@Export
enhancement ExchangeRateSetBuilderEnhancement : ExchangeRateSetBuilder {

  /**
   * Gets an ExchangeRateSetBuilder configured to create a custom ExchangeRateSet with one ExchangeRate,
   * an effective date of today, and a name.
   * @return  a new ExchangeRateSetBuilder for a custom rate
   */
  static function getCustom( baseCurrency : Currency, priceCurrency : Currency, rate : BigDecimal ) : ExchangeRateSetBuilder {
    return new ExchangeRateSetBuilder()
                 .effectiveNow()
                 .notMarketRates()
                 .withName(baseCurrency + "-to-" + priceCurrency + " custom rate")
                 .withExchangeRate(baseCurrency, priceCurrency, rate)
  }

}
