package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageClaimResponseRs_Ext.eti;ECFMessageClaimResponseRs_Ext.eix;ECFMessageClaimResponseRs_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageClaimResponseRs_ExtInternal extends com.guidewire._generated.entity.ECFMessage_ExtInternal {
  /**
   * Adds the given element to the ErrorsOrWarnings array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext element);
  
  
  /**
   * Gets the value of the ErrorsOrWarnings field.
   * Errors or Warnings
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageErrorOrWarning_Ext[] getErrorsOrWarnings();
  
  
  /**
   * Gets the value of the ReferredMessageUUId field.
   * ReferredMessageUUId - Unique Universal Identifier of the message identifies ClaimResponseRq
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReferredMessageUUId();
  
  
  /**
   * Removes the given element from the ErrorsOrWarnings array. This is achieved by marking the element for removal.
   */
  public void removeFromErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext element);
  
  
  /**
   * Removes the given element from the ErrorsOrWarnings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromErrorsOrWarnings(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ErrorsOrWarnings field.
   */
  public void setErrorsOrWarnings(entity.ECFMessageErrorOrWarning_Ext[] value);
  
  
  /**
   * Sets the value of the ReferredMessageUUId field.
   */
  public void setReferredMessageUUId(java.lang.String value);
  
  
  
}