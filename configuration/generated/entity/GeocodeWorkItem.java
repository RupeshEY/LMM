package entity;

/**
 * GeocodeWorkItem
 * Queue of Addresses to be geocoded. Work items are recorded as the ID value of Address entities. This is a system-internal entity.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GeocodeWorkItem.eti;GeocodeWorkItem.eix;GeocodeWorkItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "GeocodeWorkItem")
public class GeocodeWorkItem extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean, entity.WorkItem {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.GeocodeWorkItem> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.GeocodeWorkItem>("entity.GeocodeWorkItem");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ADDRESS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Address");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ATTEMPTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Attempts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVAILABLESINCE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AvailableSince");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKEDOUTBY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckedOutBy");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATIONTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreationTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXCEPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Exception");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LASTUPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LastUpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PRIORITY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Priority");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROCESSHISTORYID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProcessHistoryID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.GeocodeWorkItemInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public GeocodeWorkItem()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public GeocodeWorkItem(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected GeocodeWorkItem(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.GeocodeWorkItemInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.GeocodeWorkItemInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Postpone work item for later retrial
   * @param availableSince The time to retry work item
   * @param now Current time (used to update LastUpdateTime timestamp).
   * @deprecated This method is not intended to be accessed directly and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void checkIn(java.util.Date availableSince, java.util.Date now) {
    ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).checkIn(availableSince, now);
  }
  
  /**
   * Check out a work item. The progressInterval is used to calculate
   * the AvailableSince date to set (checkoutTime + 2 * progressInterval).
   * The AvailableSince date is used to find orphans.
   * @param checkoutTime The time of check out
   * @param instanceNumber The instance number of the worker doing the check out
   * @param progressInterval progress interval
   * @deprecated This method is not intended to be accessed directly and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void checkOut(java.util.Date checkoutTime, int instanceNumber, long progressInterval) {
    ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).checkOut(checkoutTime, instanceNumber, progressInterval);
  }
  
  /**
   * Fail work item
   * @param failDate The time of failure
   * @param exception optional exception string. If <code>null</code> exception field on the work item
   *                  is not modified (current value will be preserved).
   * @deprecated This method is not intended to be accessed directly and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void fail(java.util.Date failDate, java.lang.String exception) {
    ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).fail(failDate, exception);
  }
  
  /**
   * Gets the value of the Address field.
   * Address to be geocoded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getAddress() {
    return (entity.Address)__getInternalInterface().getFieldValue(ADDRESS_PROP.get());
  }
  
  /**
   * Gets the value of the Attempts field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAttempts() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ATTEMPTS_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAvailableSince() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AVAILABLESINCE_PROP.get());
  }
  
  /**
   * Return AvailableSince as Date value. May be <code>null</code>
   * @return AvailableSince as Date value
   */
  public java.util.Date getAvailableSinceAsDate() {
    return ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).getAvailableSinceAsDate();
  }
  
  /**
   * Return AvailableSince as Long value. May be <code>null</code>
   * @return AvailableSince as Long value
   */
  public java.lang.Long getAvailableSinceAsLong() {
    return ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).getAvailableSinceAsLong();
  }
  
  /**
   * Gets the value of the CheckedOutBy field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckedOutBy() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKEDOUTBY_PROP.get());
  }
  
  /**
   * Gets the value of the CreationTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreationTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATIONTIME_PROP.get());
  }
  
  /**
   * Gets the value of the Exception field.
   * Stack trace of the exception
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getException() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXCEPTION_PROP.get());
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
   * Gets the value of the LastUpdateTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLastUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(LASTUPDATETIME_PROP.get());
  }
  
  /**
   * Return that number of retries, i.e. Attempts - 1.
   * Added for backward compatibility.
   * @return number of retries of the work item.
   */
  public java.lang.Integer getNumRetries() {
    return ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).getNumRetries();
  }
  
  /**
   * Gets the value of the Priority field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPriority() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(PRIORITY_PROP.get());
  }
  
  /**
   * Return {@link ProcessHistory} that may be <code>null</code>
   * @return {@link entity.ProcessHistory} that may be <code>null</code>
   */
  public entity.ProcessHistory getProcessHistory() {
    return ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).getProcessHistory();
  }
  
  /**
   * Gets the value of the ProcessHistoryID field.
   * The writer batch job that created this workitem (ProcessHistory).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getProcessHistoryID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(PROCESSHISTORYID_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the Status field.
   * Status of this workitem.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkItemStatusType getStatus() {
    return (typekey.WorkItemStatusType)__getInternalInterface().getFieldValue(STATUS_PROP.get());
  }
  
  /**
   * Initialize a work item. Call this method after setting all other fields on the work item.
   * The method sets work item creation time, last update time, and processing time according to work item priority.
   */
  public void initialize() {
    ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).initialize();
  }
  
  /**
   * Initialize a work item. Call this method after setting all other fields on the work item.
   * The method sets work item creation time, last update time, and processing time according to work item priority.
   * @param now Current time (used to update LastUpdateTime timestamp).
   * @deprecated Replaced by {@link #initialize()} and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void initialize(java.util.Date now) {
    ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).initialize(now);
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
   * Sets the value of the Address field.
   */
  public void setAddress(entity.Address value) {
    __getInternalInterface().setFieldValue(ADDRESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Attempts field.
   */
  public void setAttempts(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ATTEMPTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AvailableSince field.
   */
  private void setAvailableSince(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(AVAILABLESINCE_PROP.get(), value);
  }
  
  /**
   * Sets AvailableSince.
   * @param val AvailableSince. May be <code>null</code>
   */
  public void setAvailableSinceAsLong(java.lang.Long val) {
    ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).setAvailableSinceAsLong(val);
  }
  
  /**
   * Sets the value of the CheckedOutBy field.
   */
  public void setCheckedOutBy(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CHECKEDOUTBY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreationTime field.
   */
  private void setCreationTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATIONTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Exception field.
   */
  private void setException(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXCEPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastUpdateTime field.
   */
  public void setLastUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(LASTUPDATETIME_PROP.get(), value);
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
   * Sets the value of the Priority field.
   */
  public void setPriority(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(PRIORITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProcessHistoryID field.
   */
  public void setProcessHistoryID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(PROCESSHISTORYID_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the Status field.
   */
  private void setStatus(typekey.WorkItemStatusType value) {
    __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.GeocodeWorkItemInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.GeocodeWorkItem.this.__getDelegateManager();
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
    
    public void checkIn(java.util.Date availableSince, java.util.Date now) {
      ((com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods")).checkIn(availableSince, now);
    }
    
    public void checkOut(java.util.Date checkoutTime, int instanceNumber, long progressInterval) {
      ((com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods")).checkOut(checkoutTime, instanceNumber, progressInterval);
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public void fail(java.util.Date failDate, java.lang.String exception) {
      ((com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods")).fail(failDate, exception);
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
     * Gets the value of the Address field.
     * Address to be geocoded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Address getAddress() {
      return (entity.Address)__getInternalInterface().getFieldValue(ADDRESS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getAddressID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ADDRESS_PROP.get());
    }
    
    /**
     * Gets the value of the Attempts field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getAttempts() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ATTEMPTS_PROP.get());
    }
    
    /**
     * Gets the value of the AvailableSince field.
     * The time after which the work item can be tried. Must be null on failed work items
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getAvailableSince() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AVAILABLESINCE_PROP.get());
    }
    
    /**
     * Return AvailableSince as Date value. May be <code>null</code>
     * @return AvailableSince as Date value
     */
    public java.util.Date getAvailableSinceAsDate() {
      return ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).getAvailableSinceAsDate();
    }
    
    /**
     * Return AvailableSince as Long value. May be <code>null</code>
     * @return AvailableSince as Long value
     */
    public java.lang.Long getAvailableSinceAsLong() {
      return ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).getAvailableSinceAsLong();
    }
    
    /**
     * Gets the value of the CheckedOutBy field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCheckedOutBy() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKEDOUTBY_PROP.get());
    }
    
    /**
     * Gets the value of the CreationTime field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreationTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATIONTIME_PROP.get());
    }
    
    /**
     * Gets the value of the Exception field.
     * Stack trace of the exception
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getException() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXCEPTION_PROP.get());
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
     * Gets the value of the LastUpdateTime field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLastUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LASTUPDATETIME_PROP.get());
    }
    
    /**
     * Return that number of retries, i.e. Attempts - 1.
     * Added for backward compatibility.
     * @return number of retries of the work item.
     */
    public java.lang.Integer getNumRetries() {
      return ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).getNumRetries();
    }
    
    /**
     * Gets the value of the Priority field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getPriority() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(PRIORITY_PROP.get());
    }
    
    /**
     * Return {@link ProcessHistory} that may be <code>null</code>
     * @return {@link entity.ProcessHistory} that may be <code>null</code>
     */
    public entity.ProcessHistory getProcessHistory() {
      return ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).getProcessHistory();
    }
    
    /**
     * Gets the value of the ProcessHistoryID field.
     * The writer batch job that created this workitem (ProcessHistory).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getProcessHistoryID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(PROCESSHISTORYID_PROP.get());
    }
    
    public java.lang.String getProfilingDescription() {
      return ((com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods")).getProfilingDescription();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the Status field.
     * Status of this workitem.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.WorkItemStatusType getStatus() {
      return (typekey.WorkItemStatusType)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Initialize a work item. Call this method after setting all other fields on the work item.
     * The method sets work item creation time, last update time, and processing time according to work item priority.
     */
    public void initialize() {
      ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).initialize();
    }
    
    public void initialize(java.util.Date now) {
      ((com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods")).initialize(now);
    }
    
    public boolean isAvailable() {
      return ((com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods")).isAvailable();
    }
    
    public boolean isCheckedOut() {
      return ((com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods")).isCheckedOut();
    }
    
    public boolean isFailed() {
      return ((com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods")).isFailed();
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
     * Sets the value of the Address field.
     */
    public void setAddress(entity.Address value) {
      __getInternalInterface().setFieldValue(ADDRESS_PROP.get(), value);
    }
    
    public void setAddressID(gw.pl.persistence.core.Key value) {
      setFieldValue(ADDRESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Attempts field.
     */
    public void setAttempts(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ATTEMPTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AvailableSince field.
     */
    public void setAvailableSince(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(AVAILABLESINCE_PROP.get(), value);
    }
    
    /**
     * Sets AvailableSince.
     * @param val AvailableSince. May be <code>null</code>
     */
    public void setAvailableSinceAsLong(java.lang.Long val) {
      ((com.guidewire.pl.domain.workqueue.WorkItemPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods")).setAvailableSinceAsLong(val);
    }
    
    /**
     * Sets the value of the CheckedOutBy field.
     */
    public void setCheckedOutBy(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CHECKEDOUTBY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreationTime field.
     */
    public void setCreationTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATIONTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Exception field.
     */
    public void setException(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXCEPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastUpdateTime field.
     */
    public void setLastUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(LASTUPDATETIME_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
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
     * Sets the value of the Priority field.
     */
    public void setPriority(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(PRIORITY_PROP.get(), value);
    }
    
    public void setProcessHistory(entity.ProcessHistory processHistory) {
      ((com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods")).setProcessHistory(processHistory);
    }
    
    /**
     * Sets the value of the ProcessHistoryID field.
     */
    public void setProcessHistoryID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(PROCESSHISTORYID_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.WorkItemStatusType value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.workqueue.WorkItemPublicMethods", "com.guidewire.pl.domain.workqueue.impl.WorkItemImpl");
    config.put("com.guidewire.pl.domain.workqueue.impl.WorkItemInternalMethods", "com.guidewire.pl.domain.workqueue.impl.WorkItemImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.GeocodeWorkItem.class, config);
    com.guidewire._generated.entity.GeocodeWorkItemInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.GeocodeWorkItem, com.guidewire._generated.entity.GeocodeWorkItemInternal>() {
      public java.lang.Object getImplementation(entity.GeocodeWorkItem bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.GeocodeWorkItemInternal getInternalInterface(entity.GeocodeWorkItem bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.GeocodeWorkItem newEmptyInstance() {
        return new entity.GeocodeWorkItem((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}