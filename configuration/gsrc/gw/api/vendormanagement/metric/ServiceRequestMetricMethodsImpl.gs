package gw.api.vendormanagement.metric
uses gw.api.metric.MetricMethodsImpl
uses gw.api.metric.MetricLimitMethods
uses java.lang.UnsupportedOperationException
uses gw.plugin.Plugins
uses gw.plugin.vendormanagement.IServiceRequestMetricLimitFinderPlugin
uses java.lang.Comparable
uses java.math.BigDecimal
uses java.lang.Long
uses java.lang.Double
uses java.lang.Float
uses gw.api.metric.CalculatedLimitMethods
uses gw.api.financials.CurrencyAmount

@Export
class ServiceRequestMetricMethodsImpl extends MetricMethodsImpl implements CalculatedLimitMethods {

  var _serviceRequestMetric : ServiceRequestMetric as readonly Metric

  construct(serviceRequestMetric : ServiceRequestMetric) {
    _serviceRequestMetric = serviceRequestMetric
  }

  override function findLimit() : MetricLimitMethods {
    return Plugins.get(IServiceRequestMetricLimitFinderPlugin).findLimitValues(Metric)
  }

  override property get MetricAsMetricLimitTimeDelegate() : MetricLimitTimeDelegate {
    return _serviceRequestMetric
  }

  override property get Unit() : MetricUnit {
    return (Metric.MetricUnit == null) ? DefaultUnit : Metric.MetricUnit
  }
  
  override property get Limit() : MetricLimitMethods {
    return (Metric.DecimalTargetValue == null and Metric.DecimalYellowValue == null and Metric.DecimalRedValue == null) ? null : new ServiceRequestMetricLimitMethods(Metric)
  }
  
  override property get LimitValue() : Comparable {
    if (Value == null) {
      return null
    }
    if (Value typeis BigDecimal) {
      return Value
    } else if (Value typeis Double) {
      return BigDecimal.valueOf(Value)
    } else if (Value typeis Float) {
      return BigDecimal.valueOf(Value)
    } else if (Value typeis CurrencyAmount) {
      return Value.Amount
    }
    return BigDecimal.valueOf(Value as Long)
  }
  
  override property get BaseValueForLimitCalculation() : Comparable {
    throw notSupported()
  }
  
  override function calculateLimitValue(limitVal : BigDecimal, limitType : ServiceRequestMetricLimitType) : Comparable {
    throw notSupported()
  }

  override function notSupported() : UnsupportedOperationException {
    return new UnsupportedOperationException("Either the metric " + Metric.Subtype + " is not defined, or the operation you attempted is not implemented for that metric.")
  }

  protected function resetLimits() {
    var newLimit = findLimit()
    Metric.DecimalTargetValue = newLimit.TargetValue as BigDecimal
    Metric.DecimalYellowValue = newLimit.YellowValue as BigDecimal
    Metric.DecimalRedValue = newLimit.RedValue as BigDecimal
    Metric.MetricUnit = (newLimit.Unit == null) ? Metric.DefaultUnit : newLimit.Unit
  }
}