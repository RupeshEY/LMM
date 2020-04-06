package gw.entity
uses gw.api.locale.DisplayKey
uses java.lang.Integer
uses gw.api.util.Math

@Export
enhancement GWIntegerMetricDelegateEnhancement : entity.IntegerMetricDelegate {
  
  function getApplicableDisplayValue(value : Integer) : String {
    var absValue = Math.abs(value) as String
    return value < 0 ? DisplayKey.get("Web.Metric.NegativeValue", absValue) : absValue
  }

}
