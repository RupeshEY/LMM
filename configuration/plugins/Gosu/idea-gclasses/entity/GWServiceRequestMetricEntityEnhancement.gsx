package entity

@javax.annotation.Generated("com.guidewire.pl.metadata.codegen.Codegen", "", "ServiceRequestMetric.eti;ServiceRequestMetric.eix;ServiceRequestMetric.etx")
enhancement GWServiceRequestMetricEntityEnhancement : entity.ServiceRequestMetric {
  function calculateLimitValue (limitVal :  java.math.BigDecimal, limitType :  typekey.ServiceRequestMetricLimitType) : java.lang.Comparable {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.CalculatedLimitMethods") as gw.api.metric.CalculatedLimitMethods).calculateLimitValue(limitVal, limitType)
  }
  
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
  
  property get BaseValueForLimitCalculation () : java.lang.Comparable {
    return (com.guidewire.pl.persistence.code.EntityInternalAccess.getImplementation(this, "gw.api.metric.CalculatedLimitMethods") as gw.api.metric.CalculatedLimitMethods).BaseValueForLimitCalculation
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