package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Approvable.eti;Approvable.eix;Approvable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ApprovableInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods {
  /**
   * Gets the value of the ApprovalDate field.
   * The date when the object was ultimately approved or rejected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getApprovalDate();
  
  
  /**
   * Gets the value of the ApprovalStatus field.
   * The approval status of the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ApprovalStatus getApprovalStatus();
  
  
  /**
   * Gets the value of the RequestingUser field.
   * The user submitting the object for approval
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getRequestingUser();
  
  
  public gw.pl.persistence.core.Key getRequestingUserID();
  
  
  /**
   * Sets the value of the ApprovalDate field.
   */
  public void setApprovalDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ApprovalStatus field.
   */
  public void setApprovalStatus(typekey.ApprovalStatus value);
  
  
  /**
   * Sets the value of the RequestingUser field.
   */
  public void setRequestingUser(entity.User value);
  
  
  public void setRequestingUserID(gw.pl.persistence.core.Key value);
  
  
  
}