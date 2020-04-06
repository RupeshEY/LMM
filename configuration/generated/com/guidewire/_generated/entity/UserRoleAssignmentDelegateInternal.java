package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UserRoleAssignmentDelegate.eti;UserRoleAssignmentDelegate.eix;UserRoleAssignmentDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UserRoleAssignmentDelegateInternal extends com.guidewire._generated.entity.AssignableInternal, com.guidewire.pl.domain.assignment.UserRoleAssignmentDelegatePublicMethods, com.guidewire.pl.domain.assignment.impl.UserRoleAssignmentDelegateInternalMethods {
  /**
   * Gets the value of the Comments field.
   * Comments about this role assignment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the Role field.
   * The role to which the user is assigned.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UserRole getRole();
  
  
  /**
   * Gets the value of the Active field.
   * Indicates whether the user is active in this role assignment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isActive();
  
  
  /**
   * Sets the value of the Active field.
   */
  public void setActive(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the Role field.
   */
  public void setRole(typekey.UserRole value);
  
  
  
}