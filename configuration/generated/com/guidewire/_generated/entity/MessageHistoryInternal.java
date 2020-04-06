package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MessageHistory.eti;MessageHistory.eix;MessageHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MessageHistoryInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.messaging.MessageHistoryPublicMethods, com.guidewire.pl.system.bundle.RemoveCallback {
  /**
   * Gets the value of the AckCode field.
   * @deprecated Custom field that may be defined when acknowledging.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAckCode();
  
  
  /**
   * Gets the value of the AckCount field.
   * Number of acks received.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAckCount();
  
  
  /**
   * Gets the value of the AckedTime field.
   * Time of ack.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAckedTime();
  
  
  /**
   * Gets the value of the AfterSendTime field.
   * Time of completion of afterSend method.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAfterSendTime();
  
  
  /**
   * Gets the value of the BeforeSendLockTime field.
   * Time of attempting to get lock before the call to beforeSend transformations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBeforeSendLockTime();
  
  
  /**
   * Gets the value of the BeforeSendLockedTime field.
   * Time of after acquired lock before the call to beforeSend transformations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBeforeSendLockedTime();
  
  
  /**
   * Gets the value of the BeforeSendTime field.
   * Time of completion of beforeSend transformations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBeforeSendTime();
  
  
  /**
   * Gets the value of the Claim field.
   * Associated claim, if applicable.  If null, then the associated object is a cross-claim object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Contact field.
   * Associated contact, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getContact();
  
  
  /**
   * Gets the value of the CreationTime field.
   * Time of creating the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreationTime();
  
  
  /**
   * Gets the value of the Description field.
   * Short description of the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the DestinationID field.
   * Identifies the message destination to send this message to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDestinationID();
  
  
  /**
   * Gets the value of the DuplicateCount field.
   * Number of duplicate errors received.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDuplicateCount();
  
  
  /**
   * Gets the value of the ErrorCategory field.
   * Type of error if the message is in error.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ErrorCategory getErrorCategory();
  
  
  /**
   * Gets the value of the ErrorDescription field.
   * Detailed description of error condition (set in the message destination).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getErrorDescription();
  
  
  /**
   * Gets the value of the EventName field.
   * Name of the event.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEventName();
  
  
  /**
   * Gets the value of the EventRootKey field.
   * Key of event root/cause, encoded as type:id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEventRootKey();
  
  
  /**
   * Gets the value of the ISOMessageType field.
   * Defines the type of message being sent to ISO
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ISOMessageType getISOMessageType();
  
  
  /**
   * Gets the value of the KeyMap field.
   * A CSV representation of the key->object ID map.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getKeyMap();
  
  
  /**
   * Gets the value of the LockingColumn field.
   * Meaningless column for locking
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn();
  
  
  /**
   * Gets the value of the MessageCode field.
   * @deprecated Custom field that may be defined during message creation.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMessageCode();
  
  
  /**
   * Gets the value of the ObjectKey field.
   * Key of template root object, encoded as type:id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getObjectKey();
  
  
  /**
   * Gets the value of the OptionalInt field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOptionalInt();
  
  
  /**
   * Gets the value of the OptionalMoney field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOptionalMoney();
  
  
  /**
   * Gets the value of the OptionalString field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOptionalString();
  
  
  /**
   * Gets the value of the OrigMsgId field.
   * Identifies the id of the original message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getOrigMsgId();
  
  
  /**
   * Gets the value of the Payload field.
   * Contents of the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPayload();
  
  
  /**
   * Gets the value of the QueryTime field.
   * Time of of query selecting message to be processed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getQueryTime();
  
  
  /**
   * Gets the value of the RetryCount field.
   * Number of times message has been retried.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRetryCount();
  
  
  /**
   * Gets the value of the RetryTime field.
   * Time in the future at which to retry the message in error, applicable only to retryable error messages.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRetryTime();
  
  
  /**
   * Gets the value of the SendLockTime field.
   * Time of attempting to lock before the sending the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSendLockTime();
  
  
  /**
   * Gets the value of the SendLockedTime field.
   * Time of after acquired lock lock before the sending the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSendLockedTime();
  
  
  /**
   * Gets the value of the SendOrder field.
   * Order in which to send messages.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSendOrder();
  
  
  /**
   * Gets the value of the SendTime field.
   * Time of completion of sending the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSendTime();
  
  
  /**
   * Gets the value of the SenderRefID field.
   * Optional sender reference set at message send time.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSenderRefID();
  
  
  /**
   * Gets the value of the Status field.
   * Message status: 10-Acked; 11-Error cleared; 12-Error retried; 13-Skipped
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getStatus();
  
  
  /**
   * Gets the value of the User field.
   * The user who created this message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
  /**
   * Gets the value of the Bound field.
   * Message Bound/Unbound
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBound();
  
  
  /**
   * Gets the value of the LateBound field.
   * Whether the payload contains late-bound fields.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLateBound();
  
  
  /**
   * Sets the value of the AckCode field.
   * @deprecated Custom field that may be defined when acknowledging.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  public void setAckCode(java.lang.String value);
  
  
  /**
   * Sets the value of the AckCount field.
   */
  public void setAckCount(java.lang.Integer value);
  
  
  /**
   * Sets the value of the AckedTime field.
   */
  public void setAckedTime(java.util.Date value);
  
  
  /**
   * Sets the value of the AfterSendTime field.
   */
  public void setAfterSendTime(java.util.Date value);
  
  
  /**
   * Sets the value of the BeforeSendLockTime field.
   */
  public void setBeforeSendLockTime(java.util.Date value);
  
  
  /**
   * Sets the value of the BeforeSendLockedTime field.
   */
  public void setBeforeSendLockedTime(java.util.Date value);
  
  
  /**
   * Sets the value of the BeforeSendTime field.
   */
  public void setBeforeSendTime(java.util.Date value);
  
  
  /**
   * Sets the value of the Bound field.
   */
  public void setBound(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(java.lang.Long value);
  
  
  /**
   * Sets the value of the CreationTime field.
   */
  public void setCreationTime(java.util.Date value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the DestinationID field.
   */
  public void setDestinationID(java.lang.Integer value);
  
  
  /**
   * Sets the value of the DuplicateCount field.
   */
  public void setDuplicateCount(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ErrorCategory field.
   */
  public void setErrorCategory(typekey.ErrorCategory value);
  
  
  /**
   * Sets the value of the ErrorDescription field.
   */
  public void setErrorDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the EventName field.
   */
  public void setEventName(java.lang.String value);
  
  
  /**
   * Sets the value of the EventRootKey field.
   */
  public void setEventRootKey(java.lang.String value);
  
  
  /**
   * Sets the value of the ISOMessageType field.
   */
  public void setISOMessageType(typekey.ISOMessageType value);
  
  
  /**
   * Sets the value of the KeyMap field.
   */
  public void setKeyMap(java.lang.String value);
  
  
  /**
   * Sets the value of the LateBound field.
   */
  public void setLateBound(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MessageCode field.
   * @deprecated Custom field that may be defined during message creation.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  public void setMessageCode(java.lang.String value);
  
  
  /**
   * Sets the value of the ObjectKey field.
   */
  public void setObjectKey(java.lang.String value);
  
  
  /**
   * Sets the value of the OptionalInt field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  public void setOptionalInt(java.lang.Integer value);
  
  
  /**
   * Sets the value of the OptionalMoney field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  public void setOptionalMoney(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the OptionalString field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  public void setOptionalString(java.lang.String value);
  
  
  /**
   * Sets the value of the OrigMsgId field.
   */
  public void setOrigMsgId(java.lang.Long value);
  
  
  /**
   * Sets the value of the Payload field.
   */
  public void setPayload(java.lang.String value);
  
  
  /**
   * Sets the value of the QueryTime field.
   */
  public void setQueryTime(java.util.Date value);
  
  
  /**
   * Sets the value of the RetryCount field.
   */
  public void setRetryCount(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RetryTime field.
   */
  public void setRetryTime(java.util.Date value);
  
  
  /**
   * Sets the value of the SendLockTime field.
   */
  public void setSendLockTime(java.util.Date value);
  
  
  /**
   * Sets the value of the SendLockedTime field.
   */
  public void setSendLockedTime(java.util.Date value);
  
  
  /**
   * Sets the value of the SendOrder field.
   */
  public void setSendOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SendTime field.
   */
  public void setSendTime(java.util.Date value);
  
  
  /**
   * Sets the value of the SenderRefID field.
   */
  public void setSenderRefID(java.lang.String value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(java.lang.Integer value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  
}