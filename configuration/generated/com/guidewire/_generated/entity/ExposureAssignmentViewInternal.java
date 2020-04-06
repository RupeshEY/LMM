package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExposureAssignmentView.eti;ExposureAssignmentView.eix;ExposureAssignmentView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExposureAssignmentViewInternal extends com.guidewire._generated.entity.ExposureDesktopViewInternal, gw.cc.exposure.entity.ExposureAssignmentView {
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