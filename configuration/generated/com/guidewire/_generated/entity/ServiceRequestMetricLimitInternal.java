package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestMetricLimit.eti;ServiceRequestMetricLimit.eix;ServiceRequestMetricLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceRequestMetricLimitInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.DecimalMetricLimitDelegateInternal {
  /**
   * Gets the value of the Currency field.
   * Currency for this limit, for non-money based limits this is always the default currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the CustomerServiceTier field.
   * Customer service tier that this limit applies to, null if it applies to any service tier
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CustomerServiceTier getCustomerServiceTier();
  
  
  /**
   * Gets the value of the LimitType field.
   * Calculation type for this limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestMetricLimitType getLimitType();
  
  
  /**
   * Gets the value of the MetricUnit field.
   * Units for this type of metric limit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MetricUnit getMetricUnit();
  
  
  /**
   * Gets the value of the ServiceCategory field.
   * Category of service that this limit applies to, null if it applies to any category
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistService getServiceCategory();
  
  
  public gw.pl.persistence.core.Key getServiceCategoryID();
  
  
  /**
   * Gets the value of the ServiceRequestMetricType field.
   * Type of service request metric to which this limit applies
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestMetric getServiceRequestMetricType();
  
  
  /**
   * Gets the value of the ServiceRequestTier field.
   * Service request tier to which this limit applies, or null if it applies to any tier
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestTier getServiceRequestTier();
  
  
  /**
   * Gets the value of the SpecialistService field.
   * Fully-specified service that this limit applies to, null if it applies to any service
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistService getSpecialistService();
  
  
  public gw.pl.persistence.core.Key getSpecialistServiceID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestMetricLimit getSubtype();
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the CustomerServiceTier field.
   */
  public void setCustomerServiceTier(typekey.CustomerServiceTier value);
  
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(typekey.ServiceRequestMetricLimitType value);
  
  
  /**
   * Sets the value of the MetricUnit field.
   */
  public void setMetricUnit(typekey.MetricUnit value);
  
  
  /**
   * Sets the value of the ServiceCategory field.
   */
  public void setServiceCategory(entity.SpecialistService value);
  
  
  public void setServiceCategoryID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ServiceRequestMetricType field.
   */
  public void setServiceRequestMetricType(typekey.ServiceRequestMetric value);
  
  
  /**
   * Sets the value of the ServiceRequestTier field.
   */
  public void setServiceRequestTier(typekey.ServiceRequestTier value);
  
  
  /**
   * Sets the value of the SpecialistService field.
   */
  public void setSpecialistService(entity.SpecialistService value);
  
  
  public void setSpecialistServiceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ServiceRequestMetricLimit value);
  
  
  
}