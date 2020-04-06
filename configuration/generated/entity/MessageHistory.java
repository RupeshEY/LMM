package entity;

/**
 * MessageHistory
 * 
 * A completed message     
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MessageHistory.eti;MessageHistory.eix;MessageHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "MessageHistory")
public class MessageHistory extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MessageHistory> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MessageHistory>("entity.MessageHistory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACKCODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AckCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACKCOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AckCount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACKEDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AckedTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AFTERSENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AfterSendTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEFORESENDLOCKTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeforeSendLockTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEFORESENDLOCKEDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeforeSendLockedTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEFORESENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeforeSendTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BOUND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Bound");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONTACT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Contact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATIONTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreationTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESTINATIONID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DestinationID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DUPLICATECOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DuplicateCount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ERRORCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ErrorCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ERRORDESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ErrorDescription");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EVENTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EventName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EVENTROOTKEY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EventRootKey");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ISOMESSAGETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ISOMessageType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> KEYMAP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "KeyMap");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LATEBOUND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LateBound");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOCKINGCOLUMN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LockingColumn");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MESSAGECODE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MessageCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OBJECTKEY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ObjectKey");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPTIONALINT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OptionalInt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPTIONALMONEY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OptionalMoney");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPTIONALSTRING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OptionalString");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ORIGMSGID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OrigMsgId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAYLOAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Payload");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> QUERYTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "QueryTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETRYCOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetryCount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETRYTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetryTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SENDLOCKTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SendLockTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SENDLOCKEDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SendLockedTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SENDORDER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SendOrder");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SendTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SENDERREFID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SenderRefID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> USER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "User");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.MessageHistoryInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public MessageHistory()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public MessageHistory(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected MessageHistory(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.MessageHistoryInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.MessageHistoryInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AckCode field.
   * @deprecated Custom field that may be defined when acknowledging.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAckCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ACKCODE_PROP.get());
  }
  
  /**
   * Gets the value of the AckCount field.
   * Number of acks received.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAckCount() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ACKCOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the AckedTime field.
   * Time of ack.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAckedTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ACKEDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the AfterSendTime field.
   * Time of completion of afterSend method.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAfterSendTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(AFTERSENDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the BeforeSendLockTime field.
   * Time of attempting to get lock before the call to beforeSend transformations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBeforeSendLockTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(BEFORESENDLOCKTIME_PROP.get());
  }
  
  /**
   * Gets the value of the BeforeSendLockedTime field.
   * Time of after acquired lock before the call to beforeSend transformations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBeforeSendLockedTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(BEFORESENDLOCKEDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the BeforeSendTime field.
   * Time of completion of beforeSend transformations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBeforeSendTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(BEFORESENDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the Claim field.
   * Associated claim, if applicable.  If null, then the associated object is a cross-claim object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the Contact field.
   * Associated contact, if applicable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getContact() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
  }
  
  /**
   * Gets the value of the CreationTime field.
   * Time of creating the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreationTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATIONTIME_PROP.get());
  }
  
  /**
   * Gets the value of the Description field.
   * Short description of the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the DestinationID field.
   * Identifies the message destination to send this message to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDestinationID() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(DESTINATIONID_PROP.get());
  }
  
  /**
   * Gets the value of the DuplicateCount field.
   * Number of duplicate errors received.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDuplicateCount() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(DUPLICATECOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the ErrorCategory field.
   * Type of error if the message is in error.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ErrorCategory getErrorCategory() {
    return (typekey.ErrorCategory)__getInternalInterface().getFieldValue(ERRORCATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the ErrorDescription field.
   * Detailed description of error condition (set in the message destination).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getErrorDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ERRORDESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the EventName field.
   * Name of the event.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEventName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EVENTNAME_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEventRootKey() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EVENTROOTKEY_PROP.get());
  }
  
  /**
   * 
   * @return Unique identifier of the object.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.commons.entity.Keyable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Keyable")).getID();
  }
  
  /**
   * Gets the value of the ISOMessageType field.
   * Defines the type of message being sent to ISO
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ISOMessageType getISOMessageType() {
    return (typekey.ISOMessageType)__getInternalInterface().getFieldValue(ISOMESSAGETYPE_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getKeyMap() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(KEYMAP_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LOCKINGCOLUMN_PROP.get());
  }
  
  /**
   * Gets the value of the MessageCode field.
   * @deprecated Custom field that may be defined during message creation.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMessageCode() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MESSAGECODE_PROP.get());
  }
  
  public entity.KeyableBean getMessageRoot() {
    return ((com.guidewire.pl.domain.messaging.MessageHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageHistoryPublicMethods")).getMessageRoot();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getObjectKey() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OBJECTKEY_PROP.get());
  }
  
  /**
   * Gets the value of the OptionalInt field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOptionalInt() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(OPTIONALINT_PROP.get());
  }
  
  /**
   * Gets the value of the OptionalMoney field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOptionalMoney() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OPTIONALMONEY_PROP.get());
  }
  
  /**
   * Gets the value of the OptionalString field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOptionalString() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OPTIONALSTRING_PROP.get());
  }
  
  /**
   * Gets the value of the OrigMsgId field.
   * Identifies the id of the original message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getOrigMsgId() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ORIGMSGID_PROP.get());
  }
  
  /**
   * Gets the value of the Payload field.
   * Contents of the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPayload() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PAYLOAD_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the QueryTime field.
   * Time of of query selecting message to be processed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getQueryTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(QUERYTIME_PROP.get());
  }
  
  /**
   * Gets the value of the RetryCount field.
   * Number of times message has been retried.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRetryCount() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(RETRYCOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the RetryTime field.
   * Time in the future at which to retry the message in error, applicable only to retryable error messages.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRetryTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RETRYTIME_PROP.get());
  }
  
  /**
   * Gets the value of the SendLockTime field.
   * Time of attempting to lock before the sending the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSendLockTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SENDLOCKTIME_PROP.get());
  }
  
  /**
   * Gets the value of the SendLockedTime field.
   * Time of after acquired lock lock before the sending the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSendLockedTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SENDLOCKEDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the SendOrder field.
   * Order in which to send messages.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSendOrder() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SENDORDER_PROP.get());
  }
  
  /**
   * Gets the value of the SendTime field.
   * Time of completion of sending the message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSendTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SENDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the SenderRefID field.
   * Optional sender reference set at message send time.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSenderRefID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SENDERREFID_PROP.get());
  }
  
  /**
   * Gets the value of the Status field.
   * Message status: 10-Acked; 11-Error cleared; 12-Error retried; 13-Skipped
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getStatus() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(STATUS_PROP.get());
  }
  
  /**
   * Gets the value of the User field.
   * The user who created this message.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser() {
    return (entity.User)__getInternalInterface().getFieldValue(USER_PROP.get());
  }
  
  /**
   * Gets the value of the Bound field.
   * Message Bound/Unbound
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBound() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(BOUND_PROP.get());
  }
  
  /**
   * Gets the value of the LateBound field.
   * Whether the payload contains late-bound fields.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLateBound() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(LATEBOUND_PROP.get());
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
  }
  
  /**
   * 
   * @return True if the object was created by importation from an external system,
   *         False if it was created internally. Note that this refers to the currently
   *         instantiated object, not the data it represents
   */
  public boolean isNewlyImported() {
    return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
  }
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
  }
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove() {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
  }
  
  public void reportDuplicate() {
    ((com.guidewire.pl.domain.messaging.MessageHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageHistoryPublicMethods")).reportDuplicate();
  }
  
  /**
   * Sets the value of the AckCode field.
   * @deprecated Custom field that may be defined when acknowledging.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  public void setAckCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ACKCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AckCount field.
   */
  private void setAckCount(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ACKCOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AckedTime field.
   */
  private void setAckedTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(ACKEDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AfterSendTime field.
   */
  private void setAfterSendTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(AFTERSENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeforeSendLockTime field.
   */
  private void setBeforeSendLockTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(BEFORESENDLOCKTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeforeSendLockedTime field.
   */
  private void setBeforeSendLockedTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(BEFORESENDLOCKEDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeforeSendTime field.
   */
  private void setBeforeSendTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(BEFORESENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Bound field.
   */
  public void setBound(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(BOUND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreationTime field.
   */
  private void setCreationTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATIONTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DestinationID field.
   */
  private void setDestinationID(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(DESTINATIONID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DuplicateCount field.
   */
  private void setDuplicateCount(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(DUPLICATECOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ErrorCategory field.
   */
  private void setErrorCategory(typekey.ErrorCategory value) {
    __getInternalInterface().setFieldValue(ERRORCATEGORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ErrorDescription field.
   */
  public void setErrorDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ERRORDESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EventName field.
   */
  private void setEventName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EVENTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EventRootKey field.
   */
  private void setEventRootKey(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EVENTROOTKEY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ISOMessageType field.
   */
  public void setISOMessageType(typekey.ISOMessageType value) {
    __getInternalInterface().setFieldValue(ISOMESSAGETYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the KeyMap field.
   */
  private void setKeyMap(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(KEYMAP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LateBound field.
   */
  public void setLateBound(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(LATEBOUND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LockingColumn field.
   */
  private void setLockingColumn(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MessageCode field.
   * @deprecated Custom field that may be defined during message creation.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  public void setMessageCode(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MESSAGECODE_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  /**
   * Sets the value of the ObjectKey field.
   */
  private void setObjectKey(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(OBJECTKEY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OptionalInt field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  public void setOptionalInt(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(OPTIONALINT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OptionalMoney field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  public void setOptionalMoney(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(OPTIONALMONEY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OptionalString field.
   * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
   */
  @java.lang.Deprecated
  public void setOptionalString(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(OPTIONALSTRING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OrigMsgId field.
   */
  private void setOrigMsgId(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ORIGMSGID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Payload field.
   */
  public void setPayload(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PAYLOAD_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the QueryTime field.
   */
  private void setQueryTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(QUERYTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetryCount field.
   */
  private void setRetryCount(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(RETRYCOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetryTime field.
   */
  private void setRetryTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(RETRYTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SendLockTime field.
   */
  private void setSendLockTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(SENDLOCKTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SendLockedTime field.
   */
  private void setSendLockedTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(SENDLOCKEDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SendOrder field.
   */
  private void setSendOrder(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SENDORDER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SendTime field.
   */
  private void setSendTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(SENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SenderRefID field.
   */
  public void setSenderRefID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SENDERREFID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   */
  private void setStatus(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value) {
    __getInternalInterface().setFieldValue(USER_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.MessageHistoryInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.MessageHistory.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void beforeRemove() {
      ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the AckCode field.
     * @deprecated Custom field that may be defined when acknowledging.  This field is deprecated, please define a new custom extension field instead.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAckCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ACKCODE_PROP.get());
    }
    
    /**
     * Gets the value of the AckCount field.
     * Number of acks received.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getAckCount() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ACKCOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the AckedTime field.
     * Time of ack.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAckedTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ACKEDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the AfterSendTime field.
     * Time of completion of afterSend method.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getAfterSendTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(AFTERSENDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the BeforeSendLockTime field.
     * Time of attempting to get lock before the call to beforeSend transformations.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getBeforeSendLockTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(BEFORESENDLOCKTIME_PROP.get());
    }
    
    /**
     * Gets the value of the BeforeSendLockedTime field.
     * Time of after acquired lock before the call to beforeSend transformations.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getBeforeSendLockedTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(BEFORESENDLOCKEDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the BeforeSendTime field.
     * Time of completion of beforeSend transformations.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getBeforeSendTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(BEFORESENDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the Claim field.
     * Associated claim, if applicable.  If null, then the associated object is a cross-claim object.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the Contact field.
     * Associated contact, if applicable.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getContact() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CONTACT_PROP.get());
    }
    
    /**
     * Gets the value of the CreationTime field.
     * Time of creating the message.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreationTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATIONTIME_PROP.get());
    }
    
    /**
     * Gets the value of the Description field.
     * Short description of the message.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the DestinationID field.
     * Identifies the message destination to send this message to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getDestinationID() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(DESTINATIONID_PROP.get());
    }
    
    /**
     * Gets the value of the DuplicateCount field.
     * Number of duplicate errors received.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getDuplicateCount() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(DUPLICATECOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the ErrorCategory field.
     * Type of error if the message is in error.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ErrorCategory getErrorCategory() {
      return (typekey.ErrorCategory)__getInternalInterface().getFieldValue(ERRORCATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the ErrorDescription field.
     * Detailed description of error condition (set in the message destination).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getErrorDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ERRORDESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the EventName field.
     * Name of the event.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEventName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EVENTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the EventRootKey field.
     * Key of event root/cause, encoded as type:id.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEventRootKey() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EVENTROOTKEY_PROP.get());
    }
    
    /**
     * 
     * @return Unique identifier of the object.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.commons.entity.Keyable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Keyable")).getID();
    }
    
    /**
     * Gets the value of the ISOMessageType field.
     * Defines the type of message being sent to ISO
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ISOMessageType getISOMessageType() {
      return (typekey.ISOMessageType)__getInternalInterface().getFieldValue(ISOMESSAGETYPE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the KeyMap field.
     * A CSV representation of the key->object ID map.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getKeyMap() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(KEYMAP_PROP.get());
    }
    
    /**
     * Gets the value of the LockingColumn field.
     * Meaningless column for locking
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLockingColumn() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(LOCKINGCOLUMN_PROP.get());
    }
    
    /**
     * Gets the value of the MessageCode field.
     * @deprecated Custom field that may be defined during message creation.  This field is deprecated, please define a new custom extension field instead.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMessageCode() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MESSAGECODE_PROP.get());
    }
    
    public entity.KeyableBean getMessageRoot() {
      return ((com.guidewire.pl.domain.messaging.MessageHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageHistoryPublicMethods")).getMessageRoot();
    }
    
    /**
     * Gets the value of the ObjectKey field.
     * Key of template root object, encoded as type:id.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getObjectKey() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OBJECTKEY_PROP.get());
    }
    
    /**
     * Gets the value of the OptionalInt field.
     * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOptionalInt() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(OPTIONALINT_PROP.get());
    }
    
    /**
     * Gets the value of the OptionalMoney field.
     * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getOptionalMoney() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(OPTIONALMONEY_PROP.get());
    }
    
    /**
     * Gets the value of the OptionalString field.
     * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getOptionalString() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(OPTIONALSTRING_PROP.get());
    }
    
    /**
     * Gets the value of the OrigMsgId field.
     * Identifies the id of the original message.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getOrigMsgId() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ORIGMSGID_PROP.get());
    }
    
    /**
     * Gets the value of the Payload field.
     * Contents of the message.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPayload() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PAYLOAD_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the QueryTime field.
     * Time of of query selecting message to be processed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getQueryTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(QUERYTIME_PROP.get());
    }
    
    /**
     * Gets the value of the RetryCount field.
     * Number of times message has been retried.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getRetryCount() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(RETRYCOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the RetryTime field.
     * Time in the future at which to retry the message in error, applicable only to retryable error messages.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getRetryTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RETRYTIME_PROP.get());
    }
    
    /**
     * Gets the value of the SendLockTime field.
     * Time of attempting to lock before the sending the message.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSendLockTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SENDLOCKTIME_PROP.get());
    }
    
    /**
     * Gets the value of the SendLockedTime field.
     * Time of after acquired lock lock before the sending the message.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSendLockedTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SENDLOCKEDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the SendOrder field.
     * Order in which to send messages.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSendOrder() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SENDORDER_PROP.get());
    }
    
    /**
     * Gets the value of the SendTime field.
     * Time of completion of sending the message.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSendTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SENDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the SenderRefID field.
     * Optional sender reference set at message send time.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSenderRefID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SENDERREFID_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     * Message status: 10-Acked; 11-Error cleared; 12-Error retried; 13-Skipped
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getStatus() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the User field.
     * The user who created this message.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUser() {
      return (entity.User)__getInternalInterface().getFieldValue(USER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(USER_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the Bound field.
     * Message Bound/Unbound
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isBound() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(BOUND_PROP.get());
    }
    
    /**
     * Gets the value of the LateBound field.
     * Whether the payload contains late-bound fields.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isLateBound() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(LATEBOUND_PROP.get());
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
    }
    
    /**
     * 
     * @return True if the object was created by importation from an external system,
     *         False if it was created internally. Note that this refers to the currently
     *         instantiated object, not the data it represents
     */
    public boolean isNewlyImported() {
      return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * Refreshes this bean with the latest database version.
     * <p/>
     * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
     * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
     * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
     * updated.
     */
    public entity.KeyableBean refresh() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
    }
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
    }
    
    /**
     * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
     * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
     * <p>
     * WARNING: This method is designed for simple custom entities which are normally not
     * associated with other entities. Undesirable results may occur when used on out-of-box entities.
     */
    public void remove() {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    public void reportDuplicate() {
      ((com.guidewire.pl.domain.messaging.MessageHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.MessageHistoryPublicMethods")).reportDuplicate();
    }
    
    /**
     * Sets the value of the AckCode field.
     * @deprecated Custom field that may be defined when acknowledging.  This field is deprecated, please define a new custom extension field instead.
     */
    @java.lang.Deprecated
    public void setAckCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ACKCODE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AckCount field.
     */
    public void setAckCount(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ACKCOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AckedTime field.
     */
    public void setAckedTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(ACKEDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AfterSendTime field.
     */
    public void setAfterSendTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(AFTERSENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeforeSendLockTime field.
     */
    public void setBeforeSendLockTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(BEFORESENDLOCKTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeforeSendLockedTime field.
     */
    public void setBeforeSendLockedTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(BEFORESENDLOCKEDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeforeSendTime field.
     */
    public void setBeforeSendTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(BEFORESENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Bound field.
     */
    public void setBound(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(BOUND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Contact field.
     */
    public void setContact(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CONTACT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreationTime field.
     */
    public void setCreationTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATIONTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DestinationID field.
     */
    public void setDestinationID(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(DESTINATIONID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DuplicateCount field.
     */
    public void setDuplicateCount(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(DUPLICATECOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ErrorCategory field.
     */
    public void setErrorCategory(typekey.ErrorCategory value) {
      __getInternalInterface().setFieldValue(ERRORCATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ErrorDescription field.
     */
    public void setErrorDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ERRORDESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EventName field.
     */
    public void setEventName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EVENTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EventRootKey field.
     */
    public void setEventRootKey(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EVENTROOTKEY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ISOMessageType field.
     */
    public void setISOMessageType(typekey.ISOMessageType value) {
      __getInternalInterface().setFieldValue(ISOMESSAGETYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the KeyMap field.
     */
    public void setKeyMap(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(KEYMAP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LateBound field.
     */
    public void setLateBound(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(LATEBOUND_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LockingColumn field.
     */
    public void setLockingColumn(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MessageCode field.
     * @deprecated Custom field that may be defined during message creation.  This field is deprecated, please define a new custom extension field instead.
     */
    @java.lang.Deprecated
    public void setMessageCode(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MESSAGECODE_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the ObjectKey field.
     */
    public void setObjectKey(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(OBJECTKEY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OptionalInt field.
     * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
     */
    @java.lang.Deprecated
    public void setOptionalInt(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(OPTIONALINT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OptionalMoney field.
     * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
     */
    @java.lang.Deprecated
    public void setOptionalMoney(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(OPTIONALMONEY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OptionalString field.
     * @deprecated Custom field that may be set at message creation time.  This field is deprecated, please define a new custom extension field instead.
     */
    @java.lang.Deprecated
    public void setOptionalString(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(OPTIONALSTRING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OrigMsgId field.
     */
    public void setOrigMsgId(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ORIGMSGID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Payload field.
     */
    public void setPayload(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PAYLOAD_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the QueryTime field.
     */
    public void setQueryTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(QUERYTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RetryCount field.
     */
    public void setRetryCount(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(RETRYCOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RetryTime field.
     */
    public void setRetryTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(RETRYTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SendLockTime field.
     */
    public void setSendLockTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(SENDLOCKTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SendLockedTime field.
     */
    public void setSendLockedTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(SENDLOCKEDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SendOrder field.
     */
    public void setSendOrder(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SENDORDER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SendTime field.
     */
    public void setSendTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(SENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SenderRefID field.
     */
    public void setSenderRefID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SENDERREFID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the User field.
     */
    public void setUser(entity.User value) {
      __getInternalInterface().setFieldValue(USER_PROP.get(), value);
    }
    
    public void setUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(USER_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.messaging.MessageHistoryPublicMethods", "com.guidewire.cc.domain.messaging.impl.MessageHistoryCoreExtMethodsImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.pl.domain.messaging.impl.MessageHistoryImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.MessageHistory.class, config);
    com.guidewire._generated.entity.MessageHistoryInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.MessageHistory, com.guidewire._generated.entity.MessageHistoryInternal>() {
      public java.lang.Object getImplementation(entity.MessageHistory bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.MessageHistoryInternal getInternalInterface(entity.MessageHistory bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.MessageHistory newEmptyInstance() {
        return new entity.MessageHistory((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}