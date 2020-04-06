package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageClaimNotifyRq_Ext.eti;ECFMessageClaimNotifyRq_Ext.eix;ECFMessageClaimNotifyRq_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageClaimNotifyRq_ExtInternal extends com.guidewire._generated.entity.ECFMessageClaimData_ExtInternal, com.guidewire._generated.entity.AssignableInternal {
  /**
   * Gets the value of the ActionParticipant field.
   * Code identifying syndicate or company or broker on the claim market who takes the action
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getActionParticipant();
  
  
  /**
   * Gets the value of the ActionParticipantType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFParticipationType_Ext getActionParticipantType();
  
  
  /**
   * Gets the value of the MessageSequence field.
   * Sequence number allocated to a request message to help the carrier to reconcile the messages received each day
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getMessageSequence();
  
  
  /**
   * Gets the value of the ResponseCode field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFResponseCode_Ext getResponseCode();
  
  
  /**
   * Sets the value of the ActionParticipant field.
   */
  public void setActionParticipant(java.lang.String value);
  
  
  /**
   * Sets the value of the ActionParticipantType field.
   */
  public void setActionParticipantType(typekey.ECFParticipationType_Ext value);
  
  
  /**
   * Sets the value of the MessageSequence field.
   */
  public void setMessageSequence(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ResponseCode field.
   */
  public void setResponseCode(typekey.ECFResponseCode_Ext value);
  
  
  
}