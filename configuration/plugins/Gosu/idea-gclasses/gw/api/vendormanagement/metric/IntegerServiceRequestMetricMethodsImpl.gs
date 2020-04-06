package gw.api.vendormanagement.metric
uses java.lang.Integer
uses java.lang.Comparable

@Export
class IntegerServiceRequestMetricMethodsImpl extends ServiceRequestMetricMethodsImpl {

  construct(integerServiceRequestMetric : IntegerServiceRequestMetric) {
    super(integerServiceRequestMetric)
  }
  
  override property get Metric() : IntegerServiceRequestMetric {
    return super.Metric as IntegerServiceRequestMetric
  }
    
  override property get Value() : Integer {
    return Metric.IntegerValue
  }

  override property get ApplicableDisplayValue() : String {
    return Metric.getApplicableDisplayValue(Value)
  }

  override property get IsNegative() : boolean {
    return Value < 0
  }
  
  override property get DefaultUnit() : MetricUnit {
    return TC_NUMERIC
  }

  override function formatTargetValue(targetValue : Comparable) : String {
    return Metric.getApplicableDisplayValue(targetValue as Integer)
  }
  
}
