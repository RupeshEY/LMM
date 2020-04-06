package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageErrorOrWarning_Ext.eti;ECFMessageErrorOrWarning_Ext.eix;ECFMessageErrorOrWarning_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageErrorOrWarning_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the Description field.
   * Description of the error or the warning
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the ECFMessage field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessage_Ext getECFMessage();
  
  
  public gw.pl.persistence.core.Key getECFMessageID();
  
  
  /**
   * Gets the value of the ErrorCode field.
   * Coded identification of the error or warning
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getErrorCode();
  
  
  /**
   * Gets the value of the ErrorType field.
   * The type of ErrorOrWarning on a ClaimNotifyRq
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFErrorType_Ext getErrorType();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ReferenceMessageUUID field.
   * UUID for the owner mesage which contains the ErrorsOrWarnings Tags
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReferenceMessageUUID();
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the ECFMessage field.
   */
  public void setECFMessage(entity.ECFMessage_Ext value);
  
  
  public void setECFMessageID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ErrorCode field.
   */
  public void setErrorCode(java.lang.String value);
  
  
  /**
   * Sets the value of the ErrorType field.
   */
  public void setErrorType(typekey.ECFErrorType_Ext value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReferenceMessageUUID field.
   */
  public void setReferenceMessageUUID(java.lang.String value);
  
  
  
}