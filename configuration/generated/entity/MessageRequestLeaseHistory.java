package entity;

/**
 * MessageRequestLeaseHistory
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MessageRequestLeaseHistory.eti;MessageRequestLeaseHistory.eix;MessageRequestLeaseHistory.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "MessageRequestLeaseHistory")
public class MessageRequestLeaseHistory extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean, entity.LeaseHistory {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MessageRequestLeaseHistory> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MessageRequestLeaseHistory>("entity.MessageRequestLeaseHistory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACQUIRED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Acquired");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Created");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPIREREQUESTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpireRequested");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPIRED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Expired");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LEASEOWNER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LeaseOwner");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOCKINGCOLUMN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LockingColumn");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPLACEMENTIDLSB_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReplacementIdLSB");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPLACEMENTIDMSB_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReplacementIdMSB");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TERMINATED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Terminated");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TERMINATIONMESSAGE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TerminationMessage");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TERMINATIONREASON_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "TerminationReason");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TRANSFERREQUESTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TransferRequested");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TRANSFERTARGET_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TransferTarget");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UNIQUEIDLSB_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UniqueIdLSB");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UNIQUEIDMSB_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UniqueIdMSB");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.MessageRequestLeaseHistoryInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public MessageRequestLeaseHistory()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public MessageRequestLeaseHistory(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected MessageRequestLeaseHistory(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.MessageRequestLeaseHistoryInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.MessageRequestLeaseHistoryInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the Acquired field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAcquired() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ACQUIRED_PROP.get());
  }
  
  /**
   * Gets the value of the Created field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCreated() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(CREATED_PROP.get());
  }
  
  /**
   * Gets the value of the ExpireRequested field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExpireRequested() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(EXPIREREQUESTED_PROP.get());
  }
  
  /**
   * Gets the value of the Expired field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getExpired() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(EXPIRED_PROP.get());
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
   * Gets the value of the LeaseOwner field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLeaseOwner() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LEASEOWNER_PROP.get());
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
   * Gets the value of the Name field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  public java.util.UUID getReplacementId() {
    return ((com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods")).getReplacementId();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getReplacementIdLSB() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(REPLACEMENTIDLSB_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getReplacementIdMSB() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(REPLACEMENTIDMSB_PROP.get());
  }
  
  /**
   * Gets the value of the Terminated field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTerminated() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(TERMINATED_PROP.get());
  }
  
  /**
   * Gets the value of the TerminationMessage field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTerminationMessage() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TERMINATIONMESSAGE_PROP.get());
  }
  
  /**
   * Gets the value of the TerminationReason field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LeaseTerminationReason getTerminationReason() {
    return (typekey.LeaseTerminationReason)__getInternalInterface().getFieldValue(TERMINATIONREASON_PROP.get());
  }
  
  /**
   * Gets the value of the TransferRequested field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTransferRequested() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(TRANSFERREQUESTED_PROP.get());
  }
  
  /**
   * Gets the value of the TransferTarget field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTransferTarget() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TRANSFERTARGET_PROP.get());
  }
  
  public java.util.UUID getUniqueId() {
    return ((com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods")).getUniqueId();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getUniqueIdLSB() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(UNIQUEIDLSB_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getUniqueIdMSB() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(UNIQUEIDMSB_PROP.get());
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
  
  /**
   * Sets the value of the Acquired field.
   */
  public void setAcquired(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ACQUIRED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Created field.
   */
  public void setCreated(java.lang.Long value) {
    __getInternalInterface().setFieldValue(CREATED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpireRequested field.
   */
  public void setExpireRequested(java.lang.Long value) {
    __getInternalInterface().setFieldValue(EXPIREREQUESTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Expired field.
   */
  public void setExpired(java.lang.Long value) {
    __getInternalInterface().setFieldValue(EXPIRED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LeaseOwner field.
   */
  public void setLeaseOwner(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LEASEOWNER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LockingColumn field.
   */
  private void setLockingColumn(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  public void setReplacementId(java.util.UUID paramUUID) {
    ((com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods")).setReplacementId(paramUUID);
  }
  
  /**
   * Sets the value of the ReplacementIdLSB field.
   */
  private void setReplacementIdLSB(java.lang.Long value) {
    __getInternalInterface().setFieldValue(REPLACEMENTIDLSB_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReplacementIdMSB field.
   */
  private void setReplacementIdMSB(java.lang.Long value) {
    __getInternalInterface().setFieldValue(REPLACEMENTIDMSB_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Terminated field.
   */
  public void setTerminated(java.lang.Long value) {
    __getInternalInterface().setFieldValue(TERMINATED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TerminationMessage field.
   */
  public void setTerminationMessage(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TERMINATIONMESSAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TerminationReason field.
   */
  public void setTerminationReason(typekey.LeaseTerminationReason value) {
    __getInternalInterface().setFieldValue(TERMINATIONREASON_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TransferRequested field.
   */
  public void setTransferRequested(java.lang.Long value) {
    __getInternalInterface().setFieldValue(TRANSFERREQUESTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TransferTarget field.
   */
  public void setTransferTarget(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TRANSFERTARGET_PROP.get(), value);
  }
  
  public void setUniqueId(java.util.UUID paramUUID) {
    ((com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods")).setUniqueId(paramUUID);
  }
  
  /**
   * Sets the value of the UniqueIdLSB field.
   */
  private void setUniqueIdLSB(java.lang.Long value) {
    __getInternalInterface().setFieldValue(UNIQUEIDLSB_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UniqueIdMSB field.
   */
  private void setUniqueIdMSB(java.lang.Long value) {
    __getInternalInterface().setFieldValue(UNIQUEIDMSB_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.MessageRequestLeaseHistoryInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.MessageRequestLeaseHistory.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
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
     * Gets the value of the Acquired field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getAcquired() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ACQUIRED_PROP.get());
    }
    
    /**
     * Gets the value of the Created field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getCreated() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(CREATED_PROP.get());
    }
    
    /**
     * Gets the value of the ExpireRequested field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getExpireRequested() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(EXPIREREQUESTED_PROP.get());
    }
    
    /**
     * Gets the value of the Expired field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getExpired() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(EXPIRED_PROP.get());
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
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the LeaseOwner field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLeaseOwner() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LEASEOWNER_PROP.get());
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
     * Gets the value of the Name field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    public java.util.UUID getReplacementId() {
      return ((com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods")).getReplacementId();
    }
    
    /**
     * Gets the value of the ReplacementIdLSB field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getReplacementIdLSB() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(REPLACEMENTIDLSB_PROP.get());
    }
    
    /**
     * Gets the value of the ReplacementIdMSB field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getReplacementIdMSB() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(REPLACEMENTIDMSB_PROP.get());
    }
    
    /**
     * Gets the value of the Terminated field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getTerminated() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(TERMINATED_PROP.get());
    }
    
    /**
     * Gets the value of the TerminationMessage field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTerminationMessage() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TERMINATIONMESSAGE_PROP.get());
    }
    
    /**
     * Gets the value of the TerminationReason field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LeaseTerminationReason getTerminationReason() {
      return (typekey.LeaseTerminationReason)__getInternalInterface().getFieldValue(TERMINATIONREASON_PROP.get());
    }
    
    /**
     * Gets the value of the TransferRequested field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getTransferRequested() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(TRANSFERREQUESTED_PROP.get());
    }
    
    /**
     * Gets the value of the TransferTarget field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTransferTarget() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TRANSFERTARGET_PROP.get());
    }
    
    public java.util.UUID getUniqueId() {
      return ((com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods")).getUniqueId();
    }
    
    /**
     * Gets the value of the UniqueIdLSB field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getUniqueIdLSB() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(UNIQUEIDLSB_PROP.get());
    }
    
    /**
     * Gets the value of the UniqueIdMSB field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getUniqueIdMSB() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(UNIQUEIDMSB_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
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
    
    /**
     * Sets the value of the Acquired field.
     */
    public void setAcquired(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ACQUIRED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Created field.
     */
    public void setCreated(java.lang.Long value) {
      __getInternalInterface().setFieldValue(CREATED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpireRequested field.
     */
    public void setExpireRequested(java.lang.Long value) {
      __getInternalInterface().setFieldValue(EXPIREREQUESTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Expired field.
     */
    public void setExpired(java.lang.Long value) {
      __getInternalInterface().setFieldValue(EXPIRED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LeaseOwner field.
     */
    public void setLeaseOwner(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LEASEOWNER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LockingColumn field.
     */
    public void setLockingColumn(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Name field.
     */
    public void setName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    public void setReplacementId(java.util.UUID paramUUID) {
      ((com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods")).setReplacementId(paramUUID);
    }
    
    /**
     * Sets the value of the ReplacementIdLSB field.
     */
    public void setReplacementIdLSB(java.lang.Long value) {
      __getInternalInterface().setFieldValue(REPLACEMENTIDLSB_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReplacementIdMSB field.
     */
    public void setReplacementIdMSB(java.lang.Long value) {
      __getInternalInterface().setFieldValue(REPLACEMENTIDMSB_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Terminated field.
     */
    public void setTerminated(java.lang.Long value) {
      __getInternalInterface().setFieldValue(TERMINATED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TerminationMessage field.
     */
    public void setTerminationMessage(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TERMINATIONMESSAGE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TerminationReason field.
     */
    public void setTerminationReason(typekey.LeaseTerminationReason value) {
      __getInternalInterface().setFieldValue(TERMINATIONREASON_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TransferRequested field.
     */
    public void setTransferRequested(java.lang.Long value) {
      __getInternalInterface().setFieldValue(TRANSFERREQUESTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TransferTarget field.
     */
    public void setTransferTarget(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TRANSFERTARGET_PROP.get(), value);
    }
    
    public void setUniqueId(java.util.UUID paramUUID) {
      ((com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods")).setUniqueId(paramUUID);
    }
    
    /**
     * Sets the value of the UniqueIdLSB field.
     */
    public void setUniqueIdLSB(java.lang.Long value) {
      __getInternalInterface().setFieldValue(UNIQUEIDLSB_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UniqueIdMSB field.
     */
    public void setUniqueIdMSB(java.lang.Long value) {
      __getInternalInterface().setFieldValue(UNIQUEIDMSB_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.lease.LeaseHistoryPublicMethods", "com.guidewire.pl.domain.lease.impl.LeaseHistoryImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.MessageRequestLeaseHistory.class, config);
    com.guidewire._generated.entity.MessageRequestLeaseHistoryInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.MessageRequestLeaseHistory, com.guidewire._generated.entity.MessageRequestLeaseHistoryInternal>() {
      public java.lang.Object getImplementation(entity.MessageRequestLeaseHistory bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.MessageRequestLeaseHistoryInternal getInternalInterface(entity.MessageRequestLeaseHistory bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.MessageRequestLeaseHistory newEmptyInstance() {
        return new entity.MessageRequestLeaseHistory((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}