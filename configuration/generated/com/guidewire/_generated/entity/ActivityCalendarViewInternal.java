package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityCalendarView.eti;ActivityCalendarView.eix;ActivityCalendarView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActivityCalendarViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.activity.entity.ActivityCalendarView {
  /**
   * Gets the value of the Activity field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Activity getActivity();
  
  
  /**
   * Gets the value of the ActivityClass field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityClass getActivityClass();
  
  
  public gw.pl.persistence.core.Key getActivityID();
  
  
  /**
   * Gets the value of the ActivityPattern field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityPattern getActivityPattern();
  
  
  public gw.pl.persistence.core.Key getActivityPatternID();
  
  
  /**
   * Gets the value of the AssignedGroupID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getAssignedGroupID();
  
  
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
   * Gets the value of the EndDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate();
  
  
  /**
   * Gets the value of the Importance field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ImportanceLevel getImportance();
  
  
  /**
   * Gets the value of the Matter field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
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
  public typekey.ActivityCalendarView getSubtype();
  
  
  /**
   * Gets the value of the TargetDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTargetDate();
  
  
  /**
   * Sets the value of the Activity field.
   */
  public void setActivity(entity.Activity value);
  
  
  /**
   * Sets the value of the ActivityClass field.
   */
  public void setActivityClass(typekey.ActivityClass value);
  
  
  public void setActivityID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ActivityPattern field.
   */
  public void setActivityPattern(entity.ActivityPattern value);
  
  
  public void setActivityPatternID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignedGroupID field.
   */
  public void setAssignedGroupID(gw.pl.persistence.core.Key value);
  
  
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
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Importance field.
   */
  public void setImportance(typekey.ImportanceLevel value);
  
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value);
  
  
  public void setMatterID(gw.pl.persistence.core.Key value);
  
  
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
  public void setSubtype(typekey.ActivityCalendarView value);
  
  
  /**
   * Sets the value of the TargetDate field.
   */
  public void setTargetDate(java.util.Date value);
  
  
  
}