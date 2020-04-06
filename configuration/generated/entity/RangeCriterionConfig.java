package entity;

/**
 * RangeCriterionConfig
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RangeCriterionConfig.eti;RangeCriterionConfig.eix;RangeCriterionConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "RangeCriterionConfig")
public class RangeCriterionConfig extends entity.MultiArgCriterionConfig implements com.guidewire.cc.system.dynaction.config.RangeValues {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RangeCriterionConfig> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RangeCriterionConfig>("entity.RangeCriterionConfig");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDINCLUSIVE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndInclusive");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTINCLUSIVE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartInclusive");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public RangeCriterionConfig()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public RangeCriterionConfig(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected RangeCriterionConfig(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.RangeCriterionConfigInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.RangeCriterionConfigInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.RangeCriterionConfigInternal)super.__getInternalInterface();
  }
  
  public entity.CriterionValue getEndValue() {
    return ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).getEndValue();
  }
  
  public <T extends java.lang.Object> T getEndValue(java.lang.Class<T> type) {
    return ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).getEndValue(type);
  }
  
  public entity.CriterionValue getStartValue() {
    return ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).getStartValue();
  }
  
  public <T extends java.lang.Object> T getStartValue(java.lang.Class<T> type) {
    return ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).getStartValue(type);
  }
  
  /**
   * Gets the value of the EndInclusive field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEndInclusive() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ENDINCLUSIVE_PROP.get());
  }
  
  /**
   * Gets the value of the StartInclusive field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStartInclusive() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(STARTINCLUSIVE_PROP.get());
  }
  
  /**
   * Sets the value of the EndInclusive field.
   */
  public void setEndInclusive(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ENDINCLUSIVE_PROP.get(), value);
  }
  
  public <T extends java.lang.Object> void setEndValue(java.lang.Class<T> type, T value) {
    ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).setEndValue(type, value);
  }
  
  /**
   * Sets the value of the StartInclusive field.
   */
  public void setStartInclusive(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(STARTINCLUSIVE_PROP.get(), value);
  }
  
  public <T extends java.lang.Object> void setStartValue(java.lang.Class<T> type, T value) {
    ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).setStartValue(type, value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.RangeCriterionConfigInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.RangeCriterionConfig.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the Values array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToValues(entity.CriterionValue element) {
      __getInternalInterface().addArrayElement(VALUES_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public java.util.List<typekey.CriterionOperator> availableOperators() {
      return ((com.guidewire.cc.system.dynaction.config.CriterionOperatorRestriction)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.CriterionOperatorRestriction")).availableOperators();
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
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
     * Gets the value of the BeanPath field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBeanPath() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BEANPATH_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the CreateTime field.
     * Timestamp when the object was created
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUser field.
     * User who created the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEUSER_PROP.get());
    }
    
    public entity.CriterionValue getEndValue() {
      return ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).getEndValue();
    }
    
    public <T extends java.lang.Object> T getEndValue(java.lang.Class<T> type) {
      return ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).getEndValue(type);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
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
     * Gets the value of the Operator field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CriterionOperator getOperator() {
      return (typekey.CriterionOperator)__getInternalInterface().getFieldValue(OPERATOR_PROP.get());
    }
    
    /**
     * Gets the value of the Owner field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DynamicActionConfig getOwner() {
      return (entity.DynamicActionConfig)__getInternalInterface().getFieldValue(OWNER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getOwnerID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(OWNER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    public entity.CriterionValue getStartValue() {
      return ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).getStartValue();
    }
    
    public <T extends java.lang.Object> T getStartValue(java.lang.Class<T> type) {
      return ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).getStartValue(type);
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.BaseCriterionConfig getSubtype() {
      return (typekey.BaseCriterionConfig)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateTime field.
     * Timestamp when the object was last updated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateUser field.
     * User who last updated the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUpdateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPDATEUSER_PROP.get());
    }
    
    /**
     * Gets the value of the Values field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CriterionValue[] getValues() {
      return (entity.CriterionValue[])__getInternalInterface().getFieldValue(VALUES_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the EndInclusive field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isEndInclusive() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ENDINCLUSIVE_PROP.get());
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
     * Gets the value of the StartInclusive field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isStartInclusive() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(STARTINCLUSIVE_PROP.get());
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
     * Removes the given element from the Values array. This is achieved by marking the element for removal.
     */
    public void removeFromValues(entity.CriterionValue element) {
      __getInternalInterface().removeArrayElement(VALUES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Values array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromValues(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(VALUES_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the BeanPath field.
     */
    public void setBeanPath(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BEANPATH_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUser field.
     */
    public void setCreateUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    public void setCreateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EndInclusive field.
     */
    public void setEndInclusive(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ENDINCLUSIVE_PROP.get(), value);
    }
    
    public <T extends java.lang.Object> void setEndValue(java.lang.Class<T> type, T value) {
      ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).setEndValue(type, value);
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
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LockingColumn field.
     */
    public void setLockingColumn(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LOCKINGCOLUMN_PROP.get(), value);
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
     * Sets the value of the Operator field.
     */
    public void setOperator(typekey.CriterionOperator value) {
      __getInternalInterface().setFieldValue(OPERATOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Owner field.
     */
    public void setOwner(entity.DynamicActionConfig value) {
      __getInternalInterface().setFieldValue(OWNER_PROP.get(), value);
    }
    
    public void setOwnerID(gw.pl.persistence.core.Key value) {
      setFieldValue(OWNER_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the StartInclusive field.
     */
    public void setStartInclusive(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(STARTINCLUSIVE_PROP.get(), value);
    }
    
    public <T extends java.lang.Object> void setStartValue(java.lang.Class<T> type, T value) {
      ((com.guidewire.cc.system.dynaction.config.RangeValues)__getDelegateManager().getImplementation("com.guidewire.cc.system.dynaction.config.RangeValues")).setStartValue(type, value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.BaseCriterionConfig value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateTime field.
     */
    public void setUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateUser field.
     */
    public void setUpdateUser(entity.User value) {
      __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    public void setUpdateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Values field.
     */
    public void setValues(entity.CriterionValue[] value) {
      __getInternalInterface().setFieldValue(VALUES_PROP.get(), value);
    }
    
    /**
     * Set's the version of the bean to the next value (i.e. the bean version original value+1)
     * Multiple calls to this method on the same bean will result in the same value being used
     * for the version (i.e. it is idempotent).
     * 
     * Calling this method will force the bean to be written to the database and participate fully
     * in the commit cycle e.g. pre-update rules will be run, etc.
     */
    public void touch() {
      ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.system.dynaction.config.CriterionOperatorRestriction", "com.guidewire.cc.system.dynaction.config.CriterionOperatorRestrictionDelegate");
    config.put("com.guidewire.cc.system.dynaction.config.RangeValues", "com.guidewire.cc.system.dynaction.config.RangeValuesDelegate");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.RangeCriterionConfig.class, config);
    com.guidewire._generated.entity.RangeCriterionConfigInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.RangeCriterionConfig, com.guidewire._generated.entity.RangeCriterionConfigInternal>() {
      public java.lang.Object getImplementation(entity.RangeCriterionConfig bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RangeCriterionConfigInternal getInternalInterface(entity.RangeCriterionConfig bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.RangeCriterionConfig newEmptyInstance() {
        return new entity.RangeCriterionConfig((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}