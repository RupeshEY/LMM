package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExposureMetric.eti;ExposureMetric.eix;ExposureMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExposureMetricInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.MetricLimitTimeDelegateInternal, gw.cc.exposure.metric.entity.ExposureMetric {
  /**
   * Gets the value of the Exposure field.
   * Exposure to which this metric is related.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the MetricLimitDenorm field.
   * The metric limit for the exposure metric, denormalized from the claim's inital exposure metric limits array.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExposureMetricLimit getMetricLimitDenorm();
  
  
  public gw.pl.persistence.core.Key getMetricLimitDenormID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ExposureMetric getSubtype();
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the MetricLimitDenorm field.
   */
  public void setMetricLimitDenorm(entity.ExposureMetricLimit value);
  
  
  public void setMetricLimitDenormID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ExposureMetric value);
  
  
  
}