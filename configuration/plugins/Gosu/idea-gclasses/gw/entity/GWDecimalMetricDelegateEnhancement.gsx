package gw.entity
uses gw.api.locale.DisplayKey
uses java.math.BigDecimal
uses gw.api.util.CurrencyUtil

@Export
enhancement GWDecimalMetricDelegateEnhancement : entity.DecimalMetricDelegate {
  
  function getApplicableDisplayValue(value : BigDecimal, displayScale : int) : String {
    var absValue = value.setScale(displayScale, CurrencyUtil.getRoundingMode()).abs().toString()
    return value < 0 ? DisplayKey.get("Web.Metric.NegativeValue", absValue) : absValue
  }

}
