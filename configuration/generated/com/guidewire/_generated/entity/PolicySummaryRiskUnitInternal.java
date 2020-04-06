package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicySummaryRiskUnit.eti;PolicySummaryRiskUnit.eix;PolicySummaryRiskUnit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicySummaryRiskUnitInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.policy.entity.PolicySummaryRiskUnit {
  /**
   * Gets the value of the PolicySummary field.
   * Related policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicySummary getPolicySummary();
  
  
  public gw.pl.persistence.core.Key getPolicySummaryID();
  
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the risk in an external policy system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySystemId();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicySummaryRiskUnit getSubtype();
  
  
  /**
   * Gets the value of the Selected field.
   * Indicates whether the risk unit should be included when fetching the policy from the policy system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSelected();
  
  
  /**
   * Sets the value of the PolicySummary field.
   */
  public void setPolicySummary(entity.PolicySummary value);
  
  
  public void setPolicySummaryID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PolicySystemId field.
   */
  public void setPolicySystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the Selected field.
   */
  public void setSelected(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.PolicySummaryRiskUnit value);
  
  
  
}