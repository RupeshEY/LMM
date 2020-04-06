package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReinsuranceCoverage.eti;ReinsuranceCoverage.eix;ReinsuranceCoverage.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReinsuranceCoverageInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.claim.entity.ReinsuranceCoverage {
  /**
   * Gets the value of the Coverage field.
   * Coverage Type of the coverage on this Reinsurance Threshold.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getCoverage();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ReinsuranceThreshold field.
   * Related reinsurance threshold.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReinsuranceThreshold getReinsuranceThreshold();
  
  
  public gw.pl.persistence.core.Key getReinsuranceThresholdID();
  
  
  /**
   * Sets the value of the Coverage field.
   */
  public void setCoverage(typekey.CoverageType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReinsuranceThreshold field.
   */
  public void setReinsuranceThreshold(entity.ReinsuranceThreshold value);
  
  
  public void setReinsuranceThresholdID(gw.pl.persistence.core.Key value);
  
  
  
}