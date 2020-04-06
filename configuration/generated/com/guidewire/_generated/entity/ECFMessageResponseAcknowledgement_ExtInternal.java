package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageResponseAcknowledgement_Ext.eti;ECFMessageResponseAcknowledgement_Ext.eix;ECFMessageResponseAcknowledgement_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageResponseAcknowledgement_ExtInternal extends com.guidewire._generated.entity.RetireableInternal {
  /**
   * Gets the value of the AckLevel field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFAckLevelCode_Ext getAckLevel();
  
  
  /**
   * Gets the value of the AcknowledgementLevelIndicator field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAcknowledgementLevelIndicator();
  
  
  /**
   * Gets the value of the AcknowledgementStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFAcknowledgementStatus_Ext getAcknowledgementStatus();
  
  
  /**
   * Gets the value of the ErrorCode field.
   * Links this acknowledgement response to a error code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getErrorCode();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ResponseDescription field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getResponseDescription();
  
  
  /**
   * Sets the value of the AckLevel field.
   */
  public void setAckLevel(typekey.ECFAckLevelCode_Ext value);
  
  
  /**
   * Sets the value of the AcknowledgementLevelIndicator field.
   */
  public void setAcknowledgementLevelIndicator(java.lang.String value);
  
  
  /**
   * Sets the value of the AcknowledgementStatus field.
   */
  public void setAcknowledgementStatus(typekey.ECFAcknowledgementStatus_Ext value);
  
  
  /**
   * Sets the value of the ErrorCode field.
   */
  public void setErrorCode(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ResponseDescription field.
   */
  public void setResponseDescription(java.lang.String value);
  
  
  
}