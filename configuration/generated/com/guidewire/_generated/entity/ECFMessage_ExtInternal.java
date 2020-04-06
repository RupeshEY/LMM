package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessage_Ext.eti;ECFMessage_Ext.eix;ECFMessage_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessage_ExtInternal extends com.guidewire._generated.entity.LMMessage_ExtInternal {
  /**
   * Gets the value of the ClaimType field.
   * The three-digit ECF Code specifying the type of Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClaimTypeCode_Ext getClaimType();
  
  
  /**
   * Gets the value of the InsuredId field.
   * Insured Id come with in the message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredId();
  
  
  /**
   * Gets the value of the ResponseAcknowledgement field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageResponseAcknowledgement_Ext getResponseAcknowledgement();
  
  
  public gw.pl.persistence.core.Key getResponseAcknowledgementID();
  
  
  /**
   * Gets the value of the Role field.
   * The role the receiver had in this message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFParticipantFunction_Ext getRole();
  
  
  /**
   * Gets the value of the TR field.
   * Transaction reference for the Transaction this message belongs to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTR();
  
  
  /**
   * Sets the value of the ClaimType field.
   */
  public void setClaimType(typekey.ECFClaimTypeCode_Ext value);
  
  
  /**
   * Sets the value of the InsuredId field.
   */
  public void setInsuredId(java.lang.String value);
  
  
  /**
   * Sets the value of the ResponseAcknowledgement field.
   */
  public void setResponseAcknowledgement(entity.ECFMessageResponseAcknowledgement_Ext value);
  
  
  public void setResponseAcknowledgementID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Role field.
   */
  public void setRole(typekey.ECFParticipantFunction_Ext value);
  
  
  /**
   * Sets the value of the TR field.
   */
  public void setTR(java.lang.String value);
  
  
  
}