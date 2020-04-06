package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LastAssignedUserContainerBase.eti;LastAssignedUserContainerBase.eix;LastAssignedUserContainerBase.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LastAssignedUserContainerBaseInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the LastActivityGrp field.
   * The id of the last group that was assigned an activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastActivityGrp();
  
  
  public gw.pl.persistence.core.Key getLastActivityGrpID();
  
  
  /**
   * Gets the value of the LastActivityUser field.
   * The id of the last user that was assigned an activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastActivityUser();
  
  
  public gw.pl.persistence.core.Key getLastActivityUserID();
  
  
  /**
   * Gets the value of the LastReviewGrp field.
   * The id of the last group that was assigned an assignment review activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getLastReviewGrp();
  
  
  public gw.pl.persistence.core.Key getLastReviewGrpID();
  
  
  /**
   * Gets the value of the LastReviewUser field.
   * The id of the last user that was assigned an assignment review activity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getLastReviewUser();
  
  
  public gw.pl.persistence.core.Key getLastReviewUserID();
  
  
  /**
   * Sets the value of the LastActivityGrp field.
   */
  public void setLastActivityGrp(entity.Group value);
  
  
  public void setLastActivityGrpID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LastActivityUser field.
   */
  public void setLastActivityUser(entity.User value);
  
  
  public void setLastActivityUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LastReviewGrp field.
   */
  public void setLastReviewGrp(entity.Group value);
  
  
  public void setLastReviewGrpID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LastReviewUser field.
   */
  public void setLastReviewUser(entity.User value);
  
  
  public void setLastReviewUserID(gw.pl.persistence.core.Key value);
  
  
  
}