package gw.api.databuilder
uses java.math.BigDecimal
uses gw.api.util.CurrencyUtil

@Export
class ServiceRequestMetricLimitBuilder extends CCDataBuilder<ServiceRequestMetricLimit, ServiceRequestMetricLimitBuilder> {

  construct() {
    super(ServiceRequestMetricLimit)
  }
  
  /**
   * Creates a limit with the given metric type and unit, with the target/yellow/red values as null/null/null, and the limit type as standard
   */
  static function uiReady(metricType : typekey.ServiceRequestMetric, unit : MetricUnit) : ServiceRequestMetricLimitBuilder {
    return new ServiceRequestMetricLimitBuilder()
                    .withMetricType(metricType)
                    .withLimitType(TC_NOOFFSET)
                    .withUnit(unit)
  }
  
  function withMetricType(metricType : typekey.ServiceRequestMetric) : ServiceRequestMetricLimitBuilder {
    set(ServiceRequestMetricLimit#ServiceRequestMetricType, metricType)
    return this
  }

  function withCurrency(currency : typekey.Currency) : ServiceRequestMetricLimitBuilder {
    set(ServiceRequestMetricLimit#Currency, currency)
    return this
  }
    
  function withUnit(metricUnit : MetricUnit) : ServiceRequestMetricLimitBuilder {
    set(ServiceRequestMetricLimit#MetricUnit, metricUnit)
    return this
  }
  
  function withTier(tier : ServiceRequestTier) : ServiceRequestMetricLimitBuilder {
    set(ServiceRequestMetricLimit#ServiceRequestTier, tier)
    return this
  }
  
  function withServiceCategory(categorySpecialistService : SpecialistService) : ServiceRequestMetricLimitBuilder {
    return withServiceCategory(ExistingBean.wrap(categorySpecialistService))
  }
  
  function withServiceCategory(specialistService : ValueGenerator<SpecialistService>) : ServiceRequestMetricLimitBuilder {
    set(ServiceRequestMetricLimit#ServiceCategory, specialistService)
    return this
  }
  

  function withCustomerServiceTier(customerServiceTier : CustomerServiceTier) : ServiceRequestMetricLimitBuilder {
    set(ServiceRequestMetricLimit#CustomerServiceTier, customerServiceTier)
    return this
  }
  
  function withTargetValue(target : BigDecimal) : ServiceRequestMetricLimitBuilder {
    set(ServiceRequestMetricLimit#DecimalTargetValue, target)
    return this
  }
  
  function withYellowValue(yellow : BigDecimal) : ServiceRequestMetricLimitBuilder {
    set(ServiceRequestMetricLimit#DecimalYellowValue, yellow)
    return this
  }
  
  function withRedValue(red : BigDecimal) : ServiceRequestMetricLimitBuilder {
    set(ServiceRequestMetricLimit#DecimalRedValue, red)
    return this
  }

  function withLimitType(type : ServiceRequestMetricLimitType) : ServiceRequestMetricLimitBuilder {
    set(ServiceRequestMetricLimit#LimitType, type)
    return this
  }
  
  function withSpecialistService(specialistService : SpecialistService) : ServiceRequestMetricLimitBuilder {
    set(ServiceRequestMetricLimit#SpecialistService, specialistService)
    return this
  }
}