package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "IncompatibleNewExposure.eti;IncompatibleNewExposure.eix;IncompatibleNewExposure.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface IncompatibleNewExposureInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.exposure.entity.IncompatibleNewExposure {
  /**
   * Gets the value of the ExistingExposures field.
   * New Coverage Type of the coverage on this exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getExistingExposures();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the NewExposureCoverage field.
   * A coverage for an exposure that may not be appropriate for addition to the claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getNewExposureCoverage();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Sets the value of the ExistingExposures field.
   */
  public void setExistingExposures(typekey.CoverageType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the NewExposureCoverage field.
   */
  public void setNewExposureCoverage(typekey.CoverageType value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  
}