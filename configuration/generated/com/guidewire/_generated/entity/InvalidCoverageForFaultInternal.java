package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InvalidCoverageForFault.eti;InvalidCoverageForFault.eix;InvalidCoverageForFault.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface InvalidCoverageForFaultInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.exposure.entity.InvalidCoverageForFault {
  /**
   * Gets the value of the FaultRating field.
   * Indicates fault rating.  For example, the insured is at fault.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FaultRating getFaultRating();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Gets the value of the PrimaryCoverage field.
   * A coverage for an exposure that may not be appropriate for addition to the claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getPrimaryCoverage();
  
  
  /**
   * Sets the value of the FaultRating field.
   */
  public void setFaultRating(typekey.FaultRating value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the PrimaryCoverage field.
   */
  public void setPrimaryCoverage(typekey.CoverageType value);
  
  
  
}