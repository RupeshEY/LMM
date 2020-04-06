package gw.api.vendormanagement.metric
uses gw.api.metric.MetricLimitMethods
uses java.lang.Comparable
uses java.math.BigDecimal

@Export
class PercentServiceRequestMetricMethodsImpl extends ServiceRequestMetricMethodsImpl {

  construct(serviceRequestMetric : PercentServiceRequestMetric) {
    super(serviceRequestMetric)
  }
  
  override property get Metric() : PercentServiceRequestMetric {
    return super.Metric as PercentServiceRequestMetric
  }
    
  override property get Value() : BigDecimal {
    return Metric.PercentValue
  }

  override property get ApplicableDisplayValue() : String {
    return Metric.getApplicableDisplayValue(Value)
  }
  
  override property get IsNegative() : boolean {
    return Value < 0
  }

  override function formatTargetValue(targetValue : Comparable) : String {
    return Metric.getApplicableDisplayValue(targetValue as BigDecimal)
  }
  
  override function createDefaultLimit() : MetricLimitMethods {
    return null
  }

  override property get DefaultUnit() : MetricUnit {
    return TC_PERCENT
  }

  function setValueToRatio(numerator : BigDecimal, denominator : BigDecimal) {
    Metric.PercentValue = Metric.fractionToPercentage(numerator, denominator)
  }
}