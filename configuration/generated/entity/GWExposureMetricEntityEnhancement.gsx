package entity

@javax.annotation.Generated("com.guidewire.pl.metadata.codegen.Codegen", "", "ExposureMetric.eti;ExposureMetric.eix;ExposureMetric.etx")
enhancement GWExposureMetricEntityEnhancement : entity.ExposureMetric {
  function createDefaultLimit () : gw.api.metric.MetricLimitMethods {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).createDefaultLimit()
  }
  
  function findLimit () : gw.api.metric.MetricLimitMethods {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).findLimit()
  }
  
  function update (helper :  gw.api.metric.MetricUpdateHelper) : java.util.Date {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).update(helper)
  }
  
  property get AscendingLimitOrder () : boolean {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).AscendingLimitOrder
  }
  
  property get DefaultUnit () : typekey.MetricUnit {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).DefaultUnit
  }
  
  property get DisplayColor () : java.lang.String {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).DisplayColor
  }
  
  property get DisplayTargetValue () : java.lang.String {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).DisplayTargetValue
  }
  
  property get DisplayValue () : java.lang.String {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).DisplayValue
  }
  
  property get Limit () : gw.api.metric.MetricLimitMethods {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).Limit
  }
  
  property get LimitValue () : java.lang.Comparable {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).LimitValue
  }
  
  property get Status () : gw.api.metric.MetricLimitStatus {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).Status
  }
  
  property get Value () : java.lang.Comparable {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.MetricMethods") as gw.api.metric.MetricMethods).Value
  }
  
  
}