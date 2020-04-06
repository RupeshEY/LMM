package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LMMessage_Ext.eti;LMMessage_Ext.eix;LMMessage_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LMMessage_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.CCAssignableInternal {
  /**
   * Gets the value of the Claim field.
   * The Claim this message is related to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Content field.
   * The message content
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getContent();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the MessageCategory field.
   * Specifies a category that this message belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LMMessageCategory_Ext getMessageCategory();
  
  
  /**
   * Gets the value of the MessageDirection field.
   * Specifies if the message is an Inbound or Outbound message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFMessageDirectionType_Ext getMessageDirection();
  
  
  /**
   * Gets the value of the MessageType field.
   * store message type as extracted from the header
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFMessageType_Ext getMessageType();
  
  
  /**
   * Gets the value of the OriginTimeStamp field.
   * The message origin post date and time
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getOriginTimeStamp();
  
  
  /**
   * Gets the value of the ReceiverPartyAgency field.
   * Receiver Party Agency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReceiverPartyAgency();
  
  
  /**
   * Gets the value of the ReceiverPartyId field.
   * Receiver Party Id
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReceiverPartyId();
  
  
  /**
   * Gets the value of the ReceiverPartyName field.
   * Receiver Party Name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReceiverPartyName();
  
  
  /**
   * Gets the value of the ReceiverPartyRoleCd field.
   * Receiver Party Role
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReceiverPartyRoleCd();
  
  
  /**
   * Gets the value of the SenderPartyAgency field.
   * Sender Party Agency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSenderPartyAgency();
  
  
  /**
   * Gets the value of the SenderPartyId field.
   * Sender Party Id
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSenderPartyId();
  
  
  /**
   * Gets the value of the SenderPartyName field.
   * Sender Party Name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSenderPartyName();
  
  
  /**
   * Gets the value of the SenderPartyRoleCd field.
   * Sender Party Role
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSenderPartyRoleCd();
  
  
  /**
   * Gets the value of the Status field.
   * Message processing status
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFMessageStatus_Ext getStatus();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LMMessage_Ext getSubtype();
  
  
  /**
   * Gets the value of the UCR field.
   * Unique Claim Reference for claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUCR();
  
  
  /**
   * Gets the value of the UMR field.
   * Unique Mandate Reference. This identifies the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUMR();
  
  
  /**
   * Gets the value of the UUID field.
   * UUId - Unique Universal Identifier of the message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUUID();
  
  
  /**
   * Gets the value of the ValidationErrorCode field.
   * The error code for the reason this message failed validation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getValidationErrorCode();
  
  
  /**
   * Gets the value of the ValidationFailureReason field.
   * The reason being given for this message to have failed validation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getValidationFailureReason();
  
  
  /**
   * Gets the value of the Reprocess field.
   * Indicates if a message needs to be reprocessed. Will be picked up by a batch process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReprocess();
  
  
  /**
   * Gets the value of the Suspended field.
   * Whether the message needs a manual interaction due to preprocessing validation failure or not.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSuspended();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Content field.
   */
  public void setContent(gw.lang.Blob value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MessageCategory field.
   */
  public void setMessageCategory(typekey.LMMessageCategory_Ext value);
  
  
  /**
   * Sets the value of the MessageDirection field.
   */
  public void setMessageDirection(typekey.ECFMessageDirectionType_Ext value);
  
  
  /**
   * Sets the value of the MessageType field.
   */
  public void setMessageType(typekey.ECFMessageType_Ext value);
  
  
  /**
   * Sets the value of the OriginTimeStamp field.
   */
  public void setOriginTimeStamp(java.util.Date value);
  
  
  /**
   * Sets the value of the ReceiverPartyAgency field.
   */
  public void setReceiverPartyAgency(java.lang.String value);
  
  
  /**
   * Sets the value of the ReceiverPartyId field.
   */
  public void setReceiverPartyId(java.lang.String value);
  
  
  /**
   * Sets the value of the ReceiverPartyName field.
   */
  public void setReceiverPartyName(java.lang.String value);
  
  
  /**
   * Sets the value of the ReceiverPartyRoleCd field.
   */
  public void setReceiverPartyRoleCd(java.lang.String value);
  
  
  /**
   * Sets the value of the Reprocess field.
   */
  public void setReprocess(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SenderPartyAgency field.
   */
  public void setSenderPartyAgency(java.lang.String value);
  
  
  /**
   * Sets the value of the SenderPartyId field.
   */
  public void setSenderPartyId(java.lang.String value);
  
  
  /**
   * Sets the value of the SenderPartyName field.
   */
  public void setSenderPartyName(java.lang.String value);
  
  
  /**
   * Sets the value of the SenderPartyRoleCd field.
   */
  public void setSenderPartyRoleCd(java.lang.String value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.ECFMessageStatus_Ext value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.LMMessage_Ext value);
  
  
  /**
   * Sets the value of the Suspended field.
   */
  public void setSuspended(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the UCR field.
   */
  public void setUCR(java.lang.String value);
  
  
  /**
   * Sets the value of the UMR field.
   */
  public void setUMR(java.lang.String value);
  
  
  /**
   * Sets the value of the UUID field.
   */
  public void setUUID(java.lang.String value);
  
  
  /**
   * Sets the value of the ValidationErrorCode field.
   */
  public void setValidationErrorCode(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ValidationFailureReason field.
   */
  public void setValidationFailureReason(java.lang.String value);
  
  
  
}