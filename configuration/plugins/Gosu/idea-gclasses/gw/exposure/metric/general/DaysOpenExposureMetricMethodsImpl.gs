package gw.exposure.metric.general

uses gw.api.exposure.metric.TimeBasedExposureMetricMethodsImpl
uses java.util.Date
uses gw.api.metric.MetricUpdateHelper

@Export
class DaysOpenExposureMetricMethodsImpl extends TimeBasedExposureMetricMethodsImpl {
  
  construct(daysOpenExposureMetric : DaysOpenExposureMetric) {
    super(daysOpenExposureMetric)
  }

  override function updateMetricValue(helper : MetricUpdateHelper) : Date {
    Metric.StartTime = Metric.getCreateTime(Metric.Exposure)
    handleExposureStateChange()
    return null
  } 
}
