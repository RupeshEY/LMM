package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityView.eti;ActivityView.eix;ActivityView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActivityViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.activity.entity.ActivityView {
  /**
   * Gets the value of the Activity field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity getActivity();
  
  
  public gw.pl.persistence.core.Key getActivityID();
  
  
  /**
   * Gets the value of the AssignedQueueID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getAssignedQueueID();
  
  
  /**
   * Gets the value of the AssignedUserID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getAssignedUserID();
  
  
  /**
   * Gets the value of the AssignmentStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssignmentStatus getAssignmentStatus();
  
  
  /**
   * Gets the value of the Claim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimInsuredName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimInsuredName();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the CloseDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCloseDate();
  
  
  /**
   * Gets the value of the CreateUserID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getCreateUserID();
  
  
  /**
   * Gets the value of the JurisdictionState field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState();
  
  
  /**
   * Gets the value of the LOBCode field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LOBCode getLOBCode();
  
  
  /**
   * Gets the value of the LastViewedDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLastViewedDate();
  
  
  /**
   * Gets the value of the Priority field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Priority getPriority();
  
  
  /**
   * Gets the value of the Status field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityStatus getStatus();
  
  
  /**
   * Gets the value of the Subject field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSubject();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityView getSubtype();
  
  
  /**
   * Gets the value of the TargetDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTargetDate();
  
  
  /**
   * Gets the value of the Type field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityType getType();
  
  
  /**
   * Gets the value of the UpdateTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime();
  
  
  /**
   * Gets the value of the UpdateUserID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getUpdateUserID();
  
  
  /**
   * Gets the value of the Escalated field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEscalated();
  
  
  /**
   * Gets the value of the ExternallyOwned field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExternallyOwned();
  
  
  /**
   * Sets the value of the Activity field.
   */
  public void setActivity(entity.Activity value);
  
  
  public void setActivityID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignedQueueID field.
   */
  public void setAssignedQueueID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignedUserID field.
   */
  public void setAssignedUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignmentStatus field.
   */
  public void setAssignmentStatus(typekey.AssignmentStatus value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimInsuredName field.
   */
  public void setClaimInsuredName(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the CloseDate field.
   */
  public void setCloseDate(java.util.Date value);
  
  
  /**
   * Sets the value of the CreateUserID field.
   */
  public void setCreateUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Escalated field.
   */
  public void setEscalated(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ExternallyOwned field.
   */
  public void setExternallyOwned(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the LOBCode field.
   */
  public void setLOBCode(typekey.LOBCode value);
  
  
  /**
   * Sets the value of the LastViewedDate field.
   */
  public void setLastViewedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Priority field.
   */
  public void setPriority(typekey.Priority value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.ActivityStatus value);
  
  
  /**
   * Sets the value of the Subject field.
   */
  public void setSubject(java.lang.String value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ActivityView value);
  
  
  /**
   * Sets the value of the TargetDate field.
   */
  public void setTargetDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.ActivityType value);
  
  
  /**
   * Sets the value of the UpdateTime field.
   */
  public void setUpdateTime(java.util.Date value);
  
  
  /**
   * Sets the value of the UpdateUserID field.
   */
  public void setUpdateUserID(gw.pl.persistence.core.Key value);
  
  
  
}