package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivitySearchCriteria.eti;ActivitySearchCriteria.eix;ActivitySearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActivitySearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.activity.impl.ActivitySearchCriteriaInternal, gw.cc.activity.entity.ActivitySearchCriteria, java.io.Serializable {
  /**
   * Gets the value of the ActivityStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ActivityStatus getActivityStatus();
  
  
  /**
   * Gets the value of the AssignedToGroup field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupSearchCriterion getAssignedToGroup();
  
  
  public gw.pl.persistence.core.Key getAssignedToGroupID();
  
  
  /**
   * Gets the value of the AssignedToUser field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getAssignedToUser();
  
  
  public gw.pl.persistence.core.Key getAssignedToUserID();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the CreatedByUser field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreatedByUser();
  
  
  public gw.pl.persistence.core.Key getCreatedByUserID();
  
  
  /**
   * Gets the value of the DateCriterionChoice field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateCriterionChoice getDateCriterionChoice();
  
  
  public gw.pl.persistence.core.Key getDateCriterionChoiceID();
  
  
  /**
   * Gets the value of the Description field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the ExternalOwner field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getExternalOwner();
  
  
  public gw.pl.persistence.core.Key getExternalOwnerID();
  
  
  /**
   * Gets the value of the Priority field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Priority getPriority();
  
  
  /**
   * Gets the value of the SubjectCriteria field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivitySubjectSearchCriteria getSubjectCriteria();
  
  
  public gw.pl.persistence.core.Key getSubjectCriteriaID();
  
  
  /**
   * Gets the value of the CompletedLate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCompletedLate();
  
  
  /**
   * Gets the value of the OverdueNow field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isOverdueNow();
  
  
  /**
   * Gets the value of the PendingAssignment field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPendingAssignment();
  
  
  /**
   * Sets the value of the ActivityStatus field.
   */
  public void setActivityStatus(typekey.ActivityStatus value);
  
  
  /**
   * Sets the value of the AssignedToGroup field.
   */
  public void setAssignedToGroup(entity.GroupSearchCriterion value);
  
  
  public void setAssignedToGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AssignedToUser field.
   */
  public void setAssignedToUser(entity.User value);
  
  
  public void setAssignedToUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the CompletedLate field.
   */
  public void setCompletedLate(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CreatedByUser field.
   */
  public void setCreatedByUser(entity.User value);
  
  
  public void setCreatedByUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DateCriterionChoice field.
   */
  public void setDateCriterionChoice(entity.DateCriterionChoice value);
  
  
  public void setDateCriterionChoiceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the ExternalOwner field.
   */
  public void setExternalOwner(entity.Contact value);
  
  
  public void setExternalOwnerID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the OverdueNow field.
   */
  public void setOverdueNow(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PendingAssignment field.
   */
  public void setPendingAssignment(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Priority field.
   */
  public void setPriority(typekey.Priority value);
  
  
  /**
   * Sets the value of the SubjectCriteria field.
   */
  public void setSubjectCriteria(entity.ActivitySubjectSearchCriteria value);
  
  
  public void setSubjectCriteriaID(gw.pl.persistence.core.Key value);
  
  
  
}