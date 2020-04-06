package gw.api.vendormanagement.metric
uses gw.api.metric.MetricLimitMethods
uses gw.entity.IEntityType
uses java.lang.Comparable

/**
 * A helper class for service request metrics.  Because the Metric.Limit property on MetricMethods 
 * requires an object implementing MetricLimitMethods, this is used to wrap the limit values stored
 * on the metric.
 */
@Export
class ServiceRequestMetricLimitMethods implements MetricLimitMethods {

  private var _metric : ServiceRequestMetric

  construct(metric : ServiceRequestMetric) {
    _metric = metric
  }

  override property get BaseType() : IEntityType {
    return ServiceRequestMetricLimit.Type
  }

  override property get DefaultLimit() : boolean {
    return false
  }

  override property get RedValue() : Comparable {
    return _metric.DecimalRedValue
  }

  override property get YellowValue() : Comparable {
    return _metric.DecimalYellowValue
  }

  override property get TargetValue() : Comparable {
    return _metric.DecimalTargetValue
  }

  override property get Unit() : MetricUnit {
    return _metric.MetricUnit
  }
}