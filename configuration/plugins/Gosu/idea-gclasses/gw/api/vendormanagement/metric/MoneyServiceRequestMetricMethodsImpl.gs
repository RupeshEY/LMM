package gw.api.vendormanagement.metric

uses java.math.BigDecimal
uses java.lang.Comparable
uses gw.api.financials.CurrencyAmount

@Export
class MoneyServiceRequestMetricMethodsImpl extends ServiceRequestMetricMethodsImpl {
  
  construct(decimalServiceRequestMetric : MoneyServiceRequestMetric) {
    super(decimalServiceRequestMetric)
  }
  
  override property get Metric() : MoneyServiceRequestMetric {
    return super.Metric as MoneyServiceRequestMetric
  }
    
  override property get Value() : CurrencyAmount {
    return Metric.MoneyValue
  }

  override property get LimitValue() : Comparable {
    return Applicable ? super.LimitValue : BigDecimal.valueOf(0)
  }
  
  override property get ApplicableDisplayValue() : String {
    return Metric.getApplicableDisplayValue(Value)
  }

  override property get NotApplicableDisplayValue() : String {
    return Metric.ZeroDisplayValue
  }
  
  override property get IsNegative() : boolean {
    return Value < new CurrencyAmount(0, Metric.MoneyCurrency)
  }

  override function formatTargetValue(targetValue : Comparable) : String {
    return Metric.getApplicableDisplayValue(new CurrencyAmount(targetValue as BigDecimal, Metric.MoneyCurrency))
  }

  override property get DefaultUnit() : MetricUnit {
    return TC_CURRENCY
  }
}