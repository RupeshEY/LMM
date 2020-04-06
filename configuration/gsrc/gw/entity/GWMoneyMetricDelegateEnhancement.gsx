package gw.entity
uses gw.api.util.CurrencyUtil
uses gw.api.financials.CurrencyAmount

@Export
enhancement GWMoneyMetricDelegateEnhancement : entity.MoneyMetricDelegate {
  
  function getApplicableDisplayValue(value : CurrencyAmount) : String {
    return CurrencyUtil.renderAsCurrency(value, this.MoneyCurrency)
  }
  
  property get ZeroDisplayValue() : String {
    return CurrencyUtil.renderAsCurrency(0, this.MoneyCurrency)
  }
}
