package entity;

/**
 * LoadOperation
 * Detail of the staging table load history.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadOperation.eti;LoadOperation.eix;LoadOperation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "LoadOperation")
public class LoadOperation extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean, entity.TimedLoaderObject, entity.OrdereddLoaderObject {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.LoadOperation> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.LoadOperation>("entity.LoadOperation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AFFECTEDROWCOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AffectedRowCount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CALLBACKS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Callbacks");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ERRORCOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ErrorCount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXECUTIONORDER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExecutionOrder");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HIGHESTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HighestID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INSERTSELECTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "InsertSelects");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INTEGRITYCHECKS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "IntegrityChecks");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LOADSTEP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LoadStep");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOWESTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LowestID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TABLENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TableName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> UPDATESTATISTICSSELECTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "UpdateStatisticsSelects");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.LoadOperationInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public LoadOperation()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public LoadOperation(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected LoadOperation(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.LoadOperationInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.LoadOperationInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the Callbacks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCallbacks(entity.LoadCallback element) {
    __getInternalInterface().addArrayElement(CALLBACKS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the InsertSelects array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInsertSelects(entity.LoadInsertSelect element) {
    __getInternalInterface().addArrayElement(INSERTSELECTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the IntegrityChecks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToIntegrityChecks(entity.LoadIntegrityCheck element) {
    __getInternalInterface().addArrayElement(INTEGRITYCHECKS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the UpdateStatisticsSelects array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpdateStatisticsSelects(entity.LoadUpdateStatisticsSelect element) {
    __getInternalInterface().addArrayElement(UPDATESTATISTICSSELECTS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the AffectedRowCount field.
   * Number of rows affected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAffectedRowCount() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(AFFECTEDROWCOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the Callbacks field.
   * Timed loader callbacks.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCallback[] getCallbacks() {
    return (entity.LoadCallback[])__getInternalInterface().getFieldValue(CALLBACKS_PROP.get());
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
   * Gets the value of the ErrorCount field.
   * Number of integrity check errors detected (if applicable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getErrorCount() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ERRORCOUNT_PROP.get());
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
   * Gets the value of the HighestID field.
   * If associated with a idsgenerated step, contains the end of the id range for the rows being loaded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getHighestID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(HIGHESTID_PROP.get());
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
   * Gets the value of the InsertSelects field.
   * Timed loader insert/selects.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadInsertSelect[] getInsertSelects() {
    return (entity.LoadInsertSelect[])__getInternalInterface().getFieldValue(INSERTSELECTS_PROP.get());
  }
  
  /**
   * Gets the value of the IntegrityChecks field.
   * Timed loader integrity checks.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadIntegrityCheck[] getIntegrityChecks() {
    return (entity.LoadIntegrityCheck[])__getInternalInterface().getFieldValue(INTEGRITYCHECKS_PROP.get());
  }
  
  /**
   * Gets the value of the LoadStep field.
   * Parent step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadStep getLoadStep() {
    return (entity.LoadStep)__getInternalInterface().getFieldValue(LOADSTEP_PROP.get());
  }
  
  /**
   * Gets the value of the LowestID field.
   * If associated with a idsgenerated step, contains the start of the id range for the rows being loaded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLowestID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOWESTID_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
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
   * Gets the value of the TableName field.
   * Affected staging table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TABLENAME_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateStatisticsSelects field.
   * db update statistics loader selects.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadUpdateStatisticsSelect[] getUpdateStatisticsSelects() {
    return (entity.LoadUpdateStatisticsSelect[])__getInternalInterface().getFieldValue(UPDATESTATISTICSSELECTS_PROP.get());
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
   * Removes the given element from the Callbacks array. This is achieved by marking the element for removal.
   */
  public void removeFromCallbacks(entity.LoadCallback element) {
    __getInternalInterface().removeArrayElement(CALLBACKS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Callbacks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCallbacks(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CALLBACKS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the InsertSelects array. This is achieved by marking the element for removal.
   */
  public void removeFromInsertSelects(entity.LoadInsertSelect element) {
    __getInternalInterface().removeArrayElement(INSERTSELECTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the InsertSelects array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInsertSelects(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(INSERTSELECTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the IntegrityChecks array. This is achieved by marking the element for removal.
   */
  public void removeFromIntegrityChecks(entity.LoadIntegrityCheck element) {
    __getInternalInterface().removeArrayElement(INTEGRITYCHECKS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the IntegrityChecks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromIntegrityChecks(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(INTEGRITYCHECKS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the UpdateStatisticsSelects array. This is achieved by marking the element for removal.
   */
  public void removeFromUpdateStatisticsSelects(entity.LoadUpdateStatisticsSelect element) {
    __getInternalInterface().removeArrayElement(UPDATESTATISTICSSELECTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the UpdateStatisticsSelects array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpdateStatisticsSelects(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(UPDATESTATISTICSSELECTS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AffectedRowCount field.
   */
  public void setAffectedRowCount(java.lang.Long value) {
    __getInternalInterface().setFieldValue(AFFECTEDROWCOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Callbacks field.
   */
  public void setCallbacks(entity.LoadCallback[] value) {
    __getInternalInterface().setFieldValue(CALLBACKS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ErrorCount field.
   */
  public void setErrorCount(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ERRORCOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExecutionOrder field.
   */
  public void setExecutionOrder(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXECUTIONORDER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HighestID field.
   */
  public void setHighestID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(HIGHESTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsertSelects field.
   */
  public void setInsertSelects(entity.LoadInsertSelect[] value) {
    __getInternalInterface().setFieldValue(INSERTSELECTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IntegrityChecks field.
   */
  public void setIntegrityChecks(entity.LoadIntegrityCheck[] value) {
    __getInternalInterface().setFieldValue(INTEGRITYCHECKS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadStep field.
   */
  public void setLoadStep(entity.LoadStep value) {
    __getInternalInterface().setFieldValue(LOADSTEP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LowestID field.
   */
  public void setLowestID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOWESTID_PROP.get(), value);
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
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TABLENAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateStatisticsSelects field.
   */
  public void setUpdateStatisticsSelects(entity.LoadUpdateStatisticsSelect[] value) {
    __getInternalInterface().setFieldValue(UPDATESTATISTICSSELECTS_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.LoadOperationInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.LoadOperation.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the Callbacks array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCallbacks(entity.LoadCallback element) {
      __getInternalInterface().addArrayElement(CALLBACKS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the InsertSelects array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToInsertSelects(entity.LoadInsertSelect element) {
      __getInternalInterface().addArrayElement(INSERTSELECTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the IntegrityChecks array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToIntegrityChecks(entity.LoadIntegrityCheck element) {
      __getInternalInterface().addArrayElement(INTEGRITYCHECKS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the UpdateStatisticsSelects array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToUpdateStatisticsSelects(entity.LoadUpdateStatisticsSelect element) {
      __getInternalInterface().addArrayElement(UPDATESTATISTICSSELECTS_PROP.get(), element);
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
     * Gets the value of the AffectedRowCount field.
     * Number of rows affected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getAffectedRowCount() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(AFFECTEDROWCOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the Callbacks field.
     * Timed loader callbacks.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadCallback[] getCallbacks() {
      return (entity.LoadCallback[])__getInternalInterface().getFieldValue(CALLBACKS_PROP.get());
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
     * Gets the value of the ErrorCount field.
     * Number of integrity check errors detected (if applicable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getErrorCount() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ERRORCOUNT_PROP.get());
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
     * Gets the value of the HighestID field.
     * If associated with a idsgenerated step, contains the end of the id range for the rows being loaded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getHighestID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(HIGHESTID_PROP.get());
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
     * Gets the value of the InsertSelects field.
     * Timed loader insert/selects.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadInsertSelect[] getInsertSelects() {
      return (entity.LoadInsertSelect[])__getInternalInterface().getFieldValue(INSERTSELECTS_PROP.get());
    }
    
    /**
     * Gets the value of the IntegrityChecks field.
     * Timed loader integrity checks.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadIntegrityCheck[] getIntegrityChecks() {
      return (entity.LoadIntegrityCheck[])__getInternalInterface().getFieldValue(INTEGRITYCHECKS_PROP.get());
    }
    
    /**
     * Gets the value of the LoadStep field.
     * Parent step.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadStep getLoadStep() {
      return (entity.LoadStep)__getInternalInterface().getFieldValue(LOADSTEP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLoadStepID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LOADSTEP_PROP.get());
    }
    
    /**
     * Gets the value of the LowestID field.
     * If associated with a idsgenerated step, contains the start of the id range for the rows being loaded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLowestID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOWESTID_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
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
     * Gets the value of the TableName field.
     * Affected staging table.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTableName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TABLENAME_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateStatisticsSelects field.
     * db update statistics loader selects.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadUpdateStatisticsSelect[] getUpdateStatisticsSelects() {
      return (entity.LoadUpdateStatisticsSelect[])__getInternalInterface().getFieldValue(UPDATESTATISTICSSELECTS_PROP.get());
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
    
    /**
     * Removes the given element from the Callbacks array. This is achieved by marking the element for removal.
     */
    public void removeFromCallbacks(entity.LoadCallback element) {
      __getInternalInterface().removeArrayElement(CALLBACKS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Callbacks array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCallbacks(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CALLBACKS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the InsertSelects array. This is achieved by marking the element for removal.
     */
    public void removeFromInsertSelects(entity.LoadInsertSelect element) {
      __getInternalInterface().removeArrayElement(INSERTSELECTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the InsertSelects array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromInsertSelects(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INSERTSELECTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the IntegrityChecks array. This is achieved by marking the element for removal.
     */
    public void removeFromIntegrityChecks(entity.LoadIntegrityCheck element) {
      __getInternalInterface().removeArrayElement(INTEGRITYCHECKS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the IntegrityChecks array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromIntegrityChecks(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INTEGRITYCHECKS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the UpdateStatisticsSelects array. This is achieved by marking the element for removal.
     */
    public void removeFromUpdateStatisticsSelects(entity.LoadUpdateStatisticsSelect element) {
      __getInternalInterface().removeArrayElement(UPDATESTATISTICSSELECTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the UpdateStatisticsSelects array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromUpdateStatisticsSelects(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(UPDATESTATISTICSSELECTS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AffectedRowCount field.
     */
    public void setAffectedRowCount(java.lang.Long value) {
      __getInternalInterface().setFieldValue(AFFECTEDROWCOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Callbacks field.
     */
    public void setCallbacks(entity.LoadCallback[] value) {
      __getInternalInterface().setFieldValue(CALLBACKS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EndTime field.
     */
    public void setEndTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ErrorCount field.
     */
    public void setErrorCount(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ERRORCOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExecutionOrder field.
     */
    public void setExecutionOrder(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXECUTIONORDER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HighestID field.
     */
    public void setHighestID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(HIGHESTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsertSelects field.
     */
    public void setInsertSelects(entity.LoadInsertSelect[] value) {
      __getInternalInterface().setFieldValue(INSERTSELECTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IntegrityChecks field.
     */
    public void setIntegrityChecks(entity.LoadIntegrityCheck[] value) {
      __getInternalInterface().setFieldValue(INTEGRITYCHECKS_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LoadStep field.
     */
    public void setLoadStep(entity.LoadStep value) {
      __getInternalInterface().setFieldValue(LOADSTEP_PROP.get(), value);
    }
    
    public void setLoadStepID(gw.pl.persistence.core.Key value) {
      setFieldValue(LOADSTEP_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LowestID field.
     */
    public void setLowestID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOWESTID_PROP.get(), value);
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
    
    /**
     * Sets the value of the StartTime field.
     */
    public void setStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TableName field.
     */
    public void setTableName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TABLENAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateStatisticsSelects field.
     */
    public void setUpdateStatisticsSelects(entity.LoadUpdateStatisticsSelect[] value) {
      __getInternalInterface().setFieldValue(UPDATESTATISTICSSELECTS_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.LoadOperation.class, config);
    com.guidewire._generated.entity.LoadOperationInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.LoadOperation, com.guidewire._generated.entity.LoadOperationInternal>() {
      public java.lang.Object getImplementation(entity.LoadOperation bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.LoadOperationInternal getInternalInterface(entity.LoadOperation bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.LoadOperation newEmptyInstance() {
        return new entity.LoadOperation((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}