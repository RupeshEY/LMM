package entity;

/**
 * LoadStep
 * Steps within a load command.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadStep.eti;LoadStep.eix;LoadStep.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "LoadStep")
public class LoadStep extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean, entity.TimedLoaderObject, entity.OrdereddLoaderObject {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.LoadStep> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.LoadStep>("entity.LoadStep");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXECUTIONORDER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExecutionOrder");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LOADCOMMAND_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LoadCommand");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> LOADPARENTSTEPARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "LoadparentstepArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> OPERATIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Operations");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PARENTSTEP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ParentStep");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STEPTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "StepType");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.LoadStepInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public LoadStep()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public LoadStep(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected LoadStep(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.LoadStepInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.LoadStepInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the Operations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOperations(entity.LoadOperation element) {
    __getInternalInterface().addArrayElement(OPERATIONS_PROP.get(), element);
  }
  
  /**
   * 
   * @return Millilseconds of elapsed time for this step.
   */
  public java.lang.Integer getDuration() {
    return ((com.guidewire.pl.domain.staging.LoadStepPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadStepPublicMethods")).getDuration();
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
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCommand getLoadCommand() {
    return (entity.LoadCommand)__getInternalInterface().getFieldValue(LOADCOMMAND_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Loadparentstep[] getLoadparentstepArray() {
    return (entity.Loadparentstep[])__getInternalInterface().getFieldValue(LOADPARENTSTEPARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the Operations field.
   * Detailed operations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadOperation[] getOperations() {
    return (entity.LoadOperation[])__getInternalInterface().getFieldValue(OPERATIONS_PROP.get());
  }
  
  /**
   * 
   * @return Operations ordered by start time, end time.
   */
  public gw.api.database.IQueryBeanResult getOrderedOps() {
    return ((com.guidewire.pl.domain.staging.LoadStepPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadStepPublicMethods")).getOrderedOps();
  }
  
  /**
   * Gets the value of the ParentStep field.
   * For non-root steps, points to parent step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadStep getParentStep() {
    return (entity.LoadStep)__getInternalInterface().getFieldValue(PARENTSTEP_PROP.get());
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
   * Gets the value of the StepType field.
   * Type of load step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LoadStepType getStepType() {
    return (typekey.LoadStepType)__getInternalInterface().getFieldValue(STEPTYPE_PROP.get());
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
   * Removes the given element from the Operations array. This is achieved by marking the element for removal.
   */
  public void removeFromOperations(entity.LoadOperation element) {
    __getInternalInterface().removeArrayElement(OPERATIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Operations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOperations(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(OPERATIONS_PROP.get(), elementID);
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
   * Sets the value of the LoadparentstepArray field.
   */
  private void setLoadparentstepArray(entity.Loadparentstep[] value) {
    __getInternalInterface().setFieldValue(LOADPARENTSTEPARRAY_PROP.get(), value);
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
   * Sets the value of the Operations field.
   */
  public void setOperations(entity.LoadOperation[] value) {
    __getInternalInterface().setFieldValue(OPERATIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ParentStep field.
   */
  public void setParentStep(entity.LoadStep value) {
    __getInternalInterface().setFieldValue(PARENTSTEP_PROP.get(), value);
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
   * Sets the value of the StepType field.
   */
  public void setStepType(typekey.LoadStepType value) {
    __getInternalInterface().setFieldValue(STEPTYPE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.LoadStepInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.LoadStep.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the LoadparentstepArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToLoadparentstepArray(entity.Loadparentstep element) {
      __getInternalInterface().addArrayElement(LOADPARENTSTEPARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Operations array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToOperations(entity.LoadOperation element) {
      __getInternalInterface().addArrayElement(OPERATIONS_PROP.get(), element);
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
     * 
     * @return Millilseconds of elapsed time for this step.
     */
    public java.lang.Integer getDuration() {
      return ((com.guidewire.pl.domain.staging.LoadStepPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadStepPublicMethods")).getDuration();
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
     * Parent.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadCommand getLoadCommand() {
      return (entity.LoadCommand)__getInternalInterface().getFieldValue(LOADCOMMAND_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getLoadCommandID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(LOADCOMMAND_PROP.get());
    }
    
    /**
     * Gets the value of the LoadparentstepArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Loadparentstep[] getLoadparentstepArray() {
      return (entity.Loadparentstep[])__getInternalInterface().getFieldValue(LOADPARENTSTEPARRAY_PROP.get());
    }
    
    /**
     * Gets the value of the Operations field.
     * Detailed operations.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadOperation[] getOperations() {
      return (entity.LoadOperation[])__getInternalInterface().getFieldValue(OPERATIONS_PROP.get());
    }
    
    /**
     * 
     * @return Operations ordered by start time, end time.
     */
    public gw.api.database.IQueryBeanResult getOrderedOps() {
      return ((com.guidewire.pl.domain.staging.LoadStepPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadStepPublicMethods")).getOrderedOps();
    }
    
    /**
     * Gets the value of the ParentStep field.
     * For non-root steps, points to parent step.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadStep getParentStep() {
      return (entity.LoadStep)__getInternalInterface().getFieldValue(PARENTSTEP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getParentStepID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PARENTSTEP_PROP.get());
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
     * Gets the value of the StepType field.
     * Type of load step.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LoadStepType getStepType() {
      return (typekey.LoadStepType)__getInternalInterface().getFieldValue(STEPTYPE_PROP.get());
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
     * Removes the given element from the LoadparentstepArray array. This is achieved by marking the element for removal.
     */
    public void removeFromLoadparentstepArray(entity.Loadparentstep element) {
      __getInternalInterface().removeArrayElement(LOADPARENTSTEPARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the LoadparentstepArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromLoadparentstepArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(LOADPARENTSTEPARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Operations array. This is achieved by marking the element for removal.
     */
    public void removeFromOperations(entity.LoadOperation element) {
      __getInternalInterface().removeArrayElement(OPERATIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Operations array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromOperations(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(OPERATIONS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
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
     * Sets the value of the LoadparentstepArray field.
     */
    public void setLoadparentstepArray(entity.Loadparentstep[] value) {
      __getInternalInterface().setFieldValue(LOADPARENTSTEPARRAY_PROP.get(), value);
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
     * Sets the value of the Operations field.
     */
    public void setOperations(entity.LoadOperation[] value) {
      __getInternalInterface().setFieldValue(OPERATIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ParentStep field.
     */
    public void setParentStep(entity.LoadStep value) {
      __getInternalInterface().setFieldValue(PARENTSTEP_PROP.get(), value);
    }
    
    public void setParentStepID(gw.pl.persistence.core.Key value) {
      setFieldValue(PARENTSTEP_PROP.get(), value);
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
     * Sets the value of the StepType field.
     */
    public void setStepType(typekey.LoadStepType value) {
      __getInternalInterface().setFieldValue(STEPTYPE_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.staging.LoadStepPublicMethods", "com.guidewire.pl.domain.staging.impl.LoadStepImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.LoadStep.class, config);
    com.guidewire._generated.entity.LoadStepInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.LoadStep, com.guidewire._generated.entity.LoadStepInternal>() {
      public java.lang.Object getImplementation(entity.LoadStep bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.LoadStepInternal getInternalInterface(entity.LoadStep bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.LoadStep newEmptyInstance() {
        return new entity.LoadStep((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}