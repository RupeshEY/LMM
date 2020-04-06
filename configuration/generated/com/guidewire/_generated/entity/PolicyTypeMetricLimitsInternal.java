package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicyTypeMetricLimits.eti;PolicyTypeMetricLimits.eix;PolicyTypeMetricLimits.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicyTypeMetricLimitsInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire.cc.domain.metric.impl.PolicyTypeMetricLimitsInternal, gw.cc.metric.entity.PolicyTypeMetricLimits {
  /**
   * Adds the given element to the ClaimMetricLimits array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimMetricLimits(entity.ClaimMetricLimit element);
  
  
  /**
   * Adds the given element to the ExposureMetricLimits array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExposureMetricLimits(entity.ExposureMetricLimit element);
  
  
  /**
   * Gets the value of the ClaimMetricLimits field.
   * Claim metric limits for this policy type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimMetricLimit[] getClaimMetricLimits();
  
  
  /**
   * Gets the value of the ExposureMetricLimits field.
   * Exposure metric limits for this policy type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureMetricLimit[] getExposureMetricLimits();
  
  
  /**
   * Gets the value of the Generation field.
   * Generation number, used to identify when metric limits were created or retired
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getGeneration();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Policy type for the limits.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Removes the given element from the ClaimMetricLimits array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimMetricLimits(entity.ClaimMetricLimit element);
  
  
  /**
   * Removes the given element from the ClaimMetricLimits array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimMetricLimits(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ExposureMetricLimits array. This is achieved by marking the element for removal.
   */
  public void removeFromExposureMetricLimits(entity.ExposureMetricLimit element);
  
  
  /**
   * Removes the given element from the ExposureMetricLimits array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExposureMetricLimits(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ClaimMetricLimits field.
   */
  public void setClaimMetricLimits(entity.ClaimMetricLimit[] value);
  
  
  /**
   * Sets the value of the ExposureMetricLimits field.
   */
  public void setExposureMetricLimits(entity.ExposureMetricLimit[] value);
  
  
  /**
   * Sets the value of the Generation field.
   */
  public void setGeneration(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  
}