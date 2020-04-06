package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ValidationIssue.eti;ValidationIssue.eix;ValidationIssue.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ValidationIssueInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the EntityValidation field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.EntityValidation getEntityValidation();
  
  
  public gw.pl.persistence.core.Key getEntityValidationID();
  
  
  /**
   * Gets the value of the FlowStepId field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFlowStepId();
  
  
  /**
   * Gets the value of the Level field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ValidationLevel getLevel();
  
  
  /**
   * Gets the value of the Reason field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReason();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ValidationIssue getSubtype();
  
  
  /**
   * Gets the value of the Type field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ValidationIssueType getType();
  
  
  /**
   * Sets the value of the EntityValidation field.
   */
  public void setEntityValidation(entity.EntityValidation value);
  
  
  public void setEntityValidationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FlowStepId field.
   */
  public void setFlowStepId(java.lang.String value);
  
  
  /**
   * Sets the value of the Level field.
   */
  public void setLevel(typekey.ValidationLevel value);
  
  
  /**
   * Sets the value of the Reason field.
   */
  public void setReason(java.lang.String value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ValidationIssue value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.ValidationIssueType value);
  
  
  
}