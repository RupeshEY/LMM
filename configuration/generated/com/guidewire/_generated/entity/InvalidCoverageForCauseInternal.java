package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InvalidCoverageForCause.eti;InvalidCoverageForCause.eix;InvalidCoverageForCause.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface InvalidCoverageForCauseInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.exposure.entity.InvalidCoverageForCause {
  /**
   * Gets the value of the LOBCode field.
   * Line of Business code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LOBCode getLOBCode();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LossCause field.
   * General cause of loss; dependent on loss type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossCause getLossCause();
  
  
  /**
   * Gets the value of the LossType field.
   * High level claim type (for example, Auto or Property).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType();
  
  
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
   * Sets the value of the LOBCode field.
   */
  public void setLOBCode(typekey.LOBCode value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LossCause field.
   */
  public void setLossCause(typekey.LossCause value);
  
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the PrimaryCoverage field.
   */
  public void setPrimaryCoverage(typekey.CoverageType value);
  
  
  
}