package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicyLocationSummaryJoin.eti;PolicyLocationSummaryJoin.eix;PolicyLocationSummaryJoin.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicyLocationSummaryJoinInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.catastrophe.entity.PolicyLocationSummaryJoin {
  /**
   * Gets the value of the Claim field.
   * Associated claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PolicyLocationSummary field.
   * Associated PolicyLocationSummary
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocationSummary getPolicyLocationSummary();
  
  
  public gw.pl.persistence.core.Key getPolicyLocationSummaryID();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PolicyLocationSummary field.
   */
  public void setPolicyLocationSummary(entity.PolicyLocationSummary value);
  
  
  public void setPolicyLocationSummaryID(gw.pl.persistence.core.Key value);
  
  
  
}