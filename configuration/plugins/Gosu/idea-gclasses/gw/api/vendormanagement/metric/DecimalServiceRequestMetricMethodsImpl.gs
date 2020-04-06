package gw.api.vendormanagement.metric
uses java.math.BigDecimal
uses java.lang.Comparable

@Export
class DecimalServiceRequestMetricMethodsImpl extends ServiceRequestMetricMethodsImpl {  
  
  var _displayScale : int as readonly DisplayScale
  var _calculationScale : int as readonly CalculationScale
  
  construct(decimalServiceRequestMetric : DecimalServiceRequestMetric, inDisplayScale : int) {
    super(decimalServiceRequestMetric)
    _displayScale = inDisplayScale
    _calculationScale = 4 
  }
  
  construct(decimalServiceRequestMetric : DecimalServiceRequestMetric) {
    this(decimalServiceRequestMetric, 2)
  }
  
  override property get Metric() : DecimalServiceRequestMetric {
    return super.Metric as DecimalServiceRequestMetric
  }
    
  override property get Value() : BigDecimal {
    return Metric.DecimalValue
  }

  override property get ApplicableDisplayValue() : String {
    return Metric.getApplicableDisplayValue(Value, DisplayScale)
  }
  
  override property get IsNegative() : boolean {
    return Value < 0
  }
  
  override property get DefaultUnit() : MetricUnit {
    return TC_NUMERIC
  }

  override function formatTargetValue(targetValue : Comparable) : String {
    return Metric.getApplicableDisplayValue(targetValue as BigDecimal, DisplayScale)
  }
  
}
