package entity;

/**
 * LoadIntegrityCheck
 * Timed loader integrity checks.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadIntegrityCheck.eti;LoadIntegrityCheck.eix;LoadIntegrityCheck.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "LoadIntegrityCheck")
public class LoadIntegrityCheck extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean, entity.TimedLoaderObject, entity.OrdereddLoaderObject {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.LoadIntegrityCheck> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.LoadIntegrityCheck>("entity.LoadIntegrityCheck");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXECUTIONORDER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExecutionOrder");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LOADCOMMAND_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LoadCommand");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOADINTEGRITYCHECKTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LoadIntegrityCheckType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LOADOPERATION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LoadOperation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> QUERY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Query");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> THREADNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ThreadName");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.LoadIntegrityCheckInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public LoadIntegrityCheck()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public LoadIntegrityCheck(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected LoadIntegrityCheck(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.LoadIntegrityCheckInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.LoadIntegrityCheckInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the Description field.
   * Description of integrity check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * Get the duration in milliseconds
   * @return Duration (in milliseconds)
   */
  public java.lang.Integer getDuration() {
    return ((com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods")).getDuration();
  }
  
  /**
   * Gets the value of the EndTime field.
   * Timestamp when the timing completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the ExecutionOrder field.
   * Order of execution (1-N).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExecutionOrder() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXECUTIONORDER_PROP.get());
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
   * Gets the value of the LoadCommand field.
   * Denorm FK for unique index.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCommand getLoadCommand() {
    return (entity.LoadCommand)__getInternalInterface().getFieldValue(LOADCOMMAND_PROP.get());
  }
  
  /**
   * Gets the value of the LoadIntegrityCheckType field.
   * Type of loader integrity check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LoadErrorType getLoadIntegrityCheckType() {
    return (typekey.LoadErrorType)__getInternalInterface().getFieldValue(LOADINTEGRITYCHECKTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the LoadOperation field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadOperation getLoadOperation() {
    return (entity.LoadOperation)__getInternalInterface().getFieldValue(LOADOPERATION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the Query field.
   * Query from integrity check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getQuery() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(QUERY_PROP.get());
  }
  
  /**
   * Get the name of the associated staging table
   * @return Staging table name
   */
  public java.lang.String getStagingTableName() {
    return ((com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods")).getStagingTableName();
  }
  
  /**
   * Gets the value of the StartTime field.
   * Timestamp when the timing began.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the ThreadName field.
   * Thread name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getThreadName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(THREADNAME_PROP.get());
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setDescription(java.lang.String value) {
    ((com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods")).setDescription(value);
  }
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExecutionOrder field.
   */
  public void setExecutionOrder(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXECUTIONORDER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommand field.
   */
  public void setLoadCommand(entity.LoadCommand value) {
    __getInternalInterface().setFieldValue(LOADCOMMAND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadIntegrityCheckType field.
   */
  public void setLoadIntegrityCheckType(typekey.LoadErrorType value) {
    __getInternalInterface().setFieldValue(LOADINTEGRITYCHECKTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadOperation field.
   */
  public void setLoadOperation(entity.LoadOperation value) {
    __getInternalInterface().setFieldValue(LOADOPERATION_PROP.get(), value);
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setQuery(java.lang.String value) {
    ((com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods")).setQuery(value);
  }
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ThreadName field.
   */
  public void setThreadName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(THREADNAME_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.LoadIntegrityCheckInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.LoadIntegrityCheck.this.__getDelegateManager();
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
     * Gets the value of the Description field.
     * Description of integrity check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Get the duration in milliseconds
     * @return Duration (in milliseconds)
     */
    public java.lang.Integer getDuration() {
      return ((com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods")).getDuration();
    }
    
    /**
     * Gets the value of the EndTime field.
     * Timestamp when the timing completed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEndTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the ExecutionOrder field.
     * Order of execution (1-N).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExecutionOrder() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXECUTIONORDER_PROP.get());
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
     * Gets the value of the LoadCommand field.
     * Denorm FK for unique index.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadCommand getLoadCommand() {
      return (entity.LoadCommand)__getInternalInterface().getFieldValue(LOADCOMMAND_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLoadCommandID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LOADCOMMAND_PROP.get());
    }
    
    /**
     * Gets the value of the LoadIntegrityCheckType field.
     * Type of loader integrity check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LoadErrorType getLoadIntegrityCheckType() {
      return (typekey.LoadErrorType)__getInternalInterface().getFieldValue(LOADINTEGRITYCHECKTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the LoadOperation field.
     * Parent.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadOperation getLoadOperation() {
      return (entity.LoadOperation)__getInternalInterface().getFieldValue(LOADOPERATION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLoadOperationID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LOADOPERATION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the Query field.
     * Query from integrity check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getQuery() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(QUERY_PROP.get());
    }
    
    /**
     * Get the name of the associated staging table
     * @return Staging table name
     */
    public java.lang.String getStagingTableName() {
      return ((com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods")).getStagingTableName();
    }
    
    /**
     * Gets the value of the StartTime field.
     * Timestamp when the timing began.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
    }
    
    /**
     * Gets the value of the ThreadName field.
     * Thread name.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getThreadName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(THREADNAME_PROP.get());
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setDescription(java.lang.String value) {
      ((com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods")).setDescription(value);
    }
    
    /**
     * Sets the value of the EndTime field.
     */
    public void setEndTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExecutionOrder field.
     */
    public void setExecutionOrder(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXECUTIONORDER_PROP.get(), value);
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
     * Sets the value of the LoadCommand field.
     */
    public void setLoadCommand(entity.LoadCommand value) {
      __getInternalInterface().setFieldValue(LOADCOMMAND_PROP.get(), value);
    }
    
    public void setLoadCommandID(gw.pl.persistence.core.Key value) {
      setFieldValue(LOADCOMMAND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LoadIntegrityCheckType field.
     */
    public void setLoadIntegrityCheckType(typekey.LoadErrorType value) {
      __getInternalInterface().setFieldValue(LOADINTEGRITYCHECKTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LoadOperation field.
     */
    public void setLoadOperation(entity.LoadOperation value) {
      __getInternalInterface().setFieldValue(LOADOPERATION_PROP.get(), value);
    }
    
    public void setLoadOperationID(gw.pl.persistence.core.Key value) {
      setFieldValue(LOADOPERATION_PROP.get(), value);
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setQuery(java.lang.String value) {
      ((com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods")).setQuery(value);
    }
    
    /**
     * Sets the value of the StartTime field.
     */
    public void setStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ThreadName field.
     */
    public void setThreadName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(THREADNAME_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.staging.LoadIntegrityCheckPublicMethods", "com.guidewire.pl.domain.staging.impl.LoadIntegrityCheckImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.LoadIntegrityCheck.class, config);
    com.guidewire._generated.entity.LoadIntegrityCheckInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.LoadIntegrityCheck, com.guidewire._generated.entity.LoadIntegrityCheckInternal>() {
      public java.lang.Object getImplementation(entity.LoadIntegrityCheck bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.LoadIntegrityCheckInternal getInternalInterface(entity.LoadIntegrityCheck bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.LoadIntegrityCheck newEmptyInstance() {
        return new entity.LoadIntegrityCheck((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}