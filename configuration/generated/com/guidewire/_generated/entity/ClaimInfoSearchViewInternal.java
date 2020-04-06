package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimInfoSearchView.eti;ClaimInfoSearchView.eix;ClaimInfoSearchView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimInfoSearchViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.cc.domain.claim.archiving.impl.ClaimInfoSearchViewInternal, gw.cc.claim.ArchivedClaimCompatible, gw.cc.claim.archiving.entity.ClaimInfoSearchView {
  /**
   * Gets the value of the ArchiveState field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ArchiveState getArchiveState();
  
  
  /**
   * Gets the value of the ArchivedAdjuster field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getArchivedAdjuster();
  
  
  /**
   * Gets the value of the Claim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimInfo field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo();
  
  
  public gw.pl.persistence.core.Key getClaimInfoID();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the CreateTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime();
  
  
  /**
   * Gets the value of the LossDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Sets the value of the ArchiveState field.
   */
  public void setArchiveState(typekey.ArchiveState value);
  
  
  /**
   * Sets the value of the ArchivedAdjuster field.
   */
  public void setArchivedAdjuster(java.lang.String value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  public void setClaimInfo(entity.ClaimInfo value);
  
  
  public void setClaimInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the CreateTime field.
   */
  public void setCreateTime(java.util.Date value);
  
  
  /**
   * Sets the value of the LossDate field.
   */
  public void setLossDate(java.util.Date value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  
}