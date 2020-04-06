package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimAssignmentView.eti;ClaimAssignmentView.eix;ClaimAssignmentView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimAssignmentViewInternal extends com.guidewire._generated.entity.ClaimAbstractViewInternal, gw.cc.claim.entity.ClaimAssignmentView {
  /**
   * Gets the value of the AssignedQueue field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssignedQueue();
  
  
  /**
   * Gets the value of the AssignedUser field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssignedUser();
  
  
  /**
   * Gets the value of the AssignmentStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssignmentStatus getAssignmentStatus();
  
  
  /**
   * Sets the value of the AssignedQueue field.
   */
  public void setAssignedQueue(java.lang.String value);
  
  
  /**
   * Sets the value of the AssignedUser field.
   */
  public void setAssignedUser(java.lang.String value);
  
  
  /**
   * Sets the value of the AssignmentStatus field.
   */
  public void setAssignmentStatus(typekey.AssignmentStatus value);
  
  
  
}