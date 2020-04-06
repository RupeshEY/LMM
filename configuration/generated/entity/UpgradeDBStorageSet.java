package entity;

/**
 * UpgradeDBStorageSet
 * Stores a database storage set snapshot.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeDBStorageSet.eti;UpgradeDBStorageSet.eix;UpgradeDBStorageSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "UpgradeDBStorageSet")
public class UpgradeDBStorageSet extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.UpgradeDBStorageSet> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.UpgradeDBStorageSet>("entity.UpgradeDBStorageSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AFTERUPGRADE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AfterUpgrade");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TIMETAKEN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TimeTaken");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> UPGRADEDBSTORAGESETCOLUMNS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "UpgradeDBStorageSetColumns");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> UPGRADEDBSTORAGESETRESULTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "UpgradeDBStorageSetResults");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> UPGRADEDBSTORAGESETTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "UpgradeDBStorageSetType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPGRADEINSTANCE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpgradeInstance");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.UpgradeDBStorageSetInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public UpgradeDBStorageSet()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public UpgradeDBStorageSet(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected UpgradeDBStorageSet(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.UpgradeDBStorageSetInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.UpgradeDBStorageSetInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the UpgradeDBStorageSetColumns array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpgradeDBStorageSetColumns(entity.UpgradeDBStorageSetColumn element) {
    __getInternalInterface().addArrayElement(UPGRADEDBSTORAGESETCOLUMNS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the UpgradeDBStorageSetResults array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpgradeDBStorageSetResults(entity.UpgradeDBStorageSetResult element) {
    __getInternalInterface().addArrayElement(UPGRADEDBSTORAGESETRESULTS_PROP.get(), element);
  }
  
  /**
   * Delete all children of this.
   */
  public void deleteAllChildren() {
    ((com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods")).deleteAllChildren();
  }
  
  /**
   * Returns all UpgradeDBStorageSetColumn beans for this UpgradeDBStorageSet
   * @return QueryProcessor of type UpgradeDBStorageSetColumn
   */
  public gw.api.database.IQueryBeanResult<entity.UpgradeDBStorageSetColumn> findUpgradeDBStorageSetColumns() {
    return ((com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods")).findUpgradeDBStorageSetColumns();
  }
  
  /**
   * Returns all UpgradeDBStorageSetResult beans for this UpgradeDBStorageSet
   * @return QueryProcessor of type UpgradeDBStorageSetResult
   */
  public gw.api.database.IQueryBeanResult<entity.UpgradeDBStorageSetResult> findUpgradeDBStorageSetResults() {
    return ((com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods")).findUpgradeDBStorageSetResults();
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
   * Gets the value of the Name field.
   * Name of storage set.
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
  
  /**
   * Gets the value of the TimeTaken field.
   * Time storage set taken.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTimeTaken() {
    return (java.util.Date)__getInternalInterface().getFieldValue(TIMETAKEN_PROP.get());
  }
  
  /**
   * Gets the value of the UpgradeDBStorageSetColumns field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeDBStorageSetColumn[] getUpgradeDBStorageSetColumns() {
    return (entity.UpgradeDBStorageSetColumn[])__getInternalInterface().getFieldValue(UPGRADEDBSTORAGESETCOLUMNS_PROP.get());
  }
  
  /**
   * Gets the value of the UpgradeDBStorageSetResults field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeDBStorageSetResult[] getUpgradeDBStorageSetResults() {
    return (entity.UpgradeDBStorageSetResult[])__getInternalInterface().getFieldValue(UPGRADEDBSTORAGESETRESULTS_PROP.get());
  }
  
  /**
   * Gets the value of the UpgradeDBStorageSetType field.
   * Database storage set type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UpgradeDBStorageSetType getUpgradeDBStorageSetType() {
    return (typekey.UpgradeDBStorageSetType)__getInternalInterface().getFieldValue(UPGRADEDBSTORAGESETTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the UpgradeInstance field.
   * Upgrade instance for this object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeInstance getUpgradeInstance() {
    return (entity.UpgradeInstance)__getInternalInterface().getFieldValue(UPGRADEINSTANCE_PROP.get());
  }
  
  /**
   * Gets the value of the AfterUpgrade field.
   * True is set created after the process, false if before
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAfterUpgrade() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(AFTERUPGRADE_PROP.get());
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
   * Removes the given element from the UpgradeDBStorageSetColumns array. This is achieved by marking the element for removal.
   */
  public void removeFromUpgradeDBStorageSetColumns(entity.UpgradeDBStorageSetColumn element) {
    __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETCOLUMNS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the UpgradeDBStorageSetColumns array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpgradeDBStorageSetColumns(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETCOLUMNS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the UpgradeDBStorageSetResults array. This is achieved by marking the element for removal.
   */
  public void removeFromUpgradeDBStorageSetResults(entity.UpgradeDBStorageSetResult element) {
    __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETRESULTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the UpgradeDBStorageSetResults array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpgradeDBStorageSetResults(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETRESULTS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AfterUpgrade field.
   */
  public void setAfterUpgrade(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(AFTERUPGRADE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
  
  /**
   * Sets the value of the TimeTaken field.
   */
  public void setTimeTaken(java.util.Date value) {
    __getInternalInterface().setFieldValue(TIMETAKEN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpgradeDBStorageSetColumns field.
   */
  public void setUpgradeDBStorageSetColumns(entity.UpgradeDBStorageSetColumn[] value) {
    __getInternalInterface().setFieldValue(UPGRADEDBSTORAGESETCOLUMNS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpgradeDBStorageSetResults field.
   */
  public void setUpgradeDBStorageSetResults(entity.UpgradeDBStorageSetResult[] value) {
    __getInternalInterface().setFieldValue(UPGRADEDBSTORAGESETRESULTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpgradeDBStorageSetType field.
   */
  public void setUpgradeDBStorageSetType(typekey.UpgradeDBStorageSetType value) {
    __getInternalInterface().setFieldValue(UPGRADEDBSTORAGESETTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpgradeInstance field.
   */
  public void setUpgradeInstance(entity.UpgradeInstance value) {
    __getInternalInterface().setFieldValue(UPGRADEINSTANCE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.UpgradeDBStorageSetInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.UpgradeDBStorageSet.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the UpgradeDBStorageSetColumns array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToUpgradeDBStorageSetColumns(entity.UpgradeDBStorageSetColumn element) {
      __getInternalInterface().addArrayElement(UPGRADEDBSTORAGESETCOLUMNS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the UpgradeDBStorageSetResults array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToUpgradeDBStorageSetResults(entity.UpgradeDBStorageSetResult element) {
      __getInternalInterface().addArrayElement(UPGRADEDBSTORAGESETRESULTS_PROP.get(), element);
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
    
    /**
     * Delete all children of this.
     */
    public void deleteAllChildren() {
      ((com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods")).deleteAllChildren();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    /**
     * Returns all UpgradeDBStorageSetColumn beans for this UpgradeDBStorageSet
     * @return QueryProcessor of type UpgradeDBStorageSetColumn
     */
    public gw.api.database.IQueryBeanResult<entity.UpgradeDBStorageSetColumn> findUpgradeDBStorageSetColumns() {
      return ((com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods")).findUpgradeDBStorageSetColumns();
    }
    
    /**
     * Returns all UpgradeDBStorageSetResult beans for this UpgradeDBStorageSet
     * @return QueryProcessor of type UpgradeDBStorageSetResult
     */
    public gw.api.database.IQueryBeanResult<entity.UpgradeDBStorageSetResult> findUpgradeDBStorageSetResults() {
      return ((com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods")).findUpgradeDBStorageSetResults();
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
     * Gets the value of the Name field.
     * Name of storage set.
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
    
    /**
     * Gets the value of the TimeTaken field.
     * Time storage set taken.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getTimeTaken() {
      return (java.util.Date)__getInternalInterface().getFieldValue(TIMETAKEN_PROP.get());
    }
    
    /**
     * Gets the value of the UpgradeDBStorageSetColumns field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UpgradeDBStorageSetColumn[] getUpgradeDBStorageSetColumns() {
      return (entity.UpgradeDBStorageSetColumn[])__getInternalInterface().getFieldValue(UPGRADEDBSTORAGESETCOLUMNS_PROP.get());
    }
    
    /**
     * Gets the value of the UpgradeDBStorageSetResults field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UpgradeDBStorageSetResult[] getUpgradeDBStorageSetResults() {
      return (entity.UpgradeDBStorageSetResult[])__getInternalInterface().getFieldValue(UPGRADEDBSTORAGESETRESULTS_PROP.get());
    }
    
    /**
     * Gets the value of the UpgradeDBStorageSetType field.
     * Database storage set type
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.UpgradeDBStorageSetType getUpgradeDBStorageSetType() {
      return (typekey.UpgradeDBStorageSetType)__getInternalInterface().getFieldValue(UPGRADEDBSTORAGESETTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the UpgradeInstance field.
     * Upgrade instance for this object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UpgradeInstance getUpgradeInstance() {
      return (entity.UpgradeInstance)__getInternalInterface().getFieldValue(UPGRADEINSTANCE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUpgradeInstanceID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPGRADEINSTANCE_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the AfterUpgrade field.
     * True is set created after the process, false if before
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAfterUpgrade() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(AFTERUPGRADE_PROP.get());
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
     * Removes the given element from the UpgradeDBStorageSetColumns array. This is achieved by marking the element for removal.
     */
    public void removeFromUpgradeDBStorageSetColumns(entity.UpgradeDBStorageSetColumn element) {
      __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETCOLUMNS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the UpgradeDBStorageSetColumns array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromUpgradeDBStorageSetColumns(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETCOLUMNS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the UpgradeDBStorageSetResults array. This is achieved by marking the element for removal.
     */
    public void removeFromUpgradeDBStorageSetResults(entity.UpgradeDBStorageSetResult element) {
      __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETRESULTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the UpgradeDBStorageSetResults array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromUpgradeDBStorageSetResults(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(UPGRADEDBSTORAGESETRESULTS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AfterUpgrade field.
     */
    public void setAfterUpgrade(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(AFTERUPGRADE_PROP.get(), value);
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
    
    /**
     * Sets the value of the TimeTaken field.
     */
    public void setTimeTaken(java.util.Date value) {
      __getInternalInterface().setFieldValue(TIMETAKEN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpgradeDBStorageSetColumns field.
     */
    public void setUpgradeDBStorageSetColumns(entity.UpgradeDBStorageSetColumn[] value) {
      __getInternalInterface().setFieldValue(UPGRADEDBSTORAGESETCOLUMNS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpgradeDBStorageSetResults field.
     */
    public void setUpgradeDBStorageSetResults(entity.UpgradeDBStorageSetResult[] value) {
      __getInternalInterface().setFieldValue(UPGRADEDBSTORAGESETRESULTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpgradeDBStorageSetType field.
     */
    public void setUpgradeDBStorageSetType(typekey.UpgradeDBStorageSetType value) {
      __getInternalInterface().setFieldValue(UPGRADEDBSTORAGESETTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpgradeInstance field.
     */
    public void setUpgradeInstance(entity.UpgradeInstance value) {
      __getInternalInterface().setFieldValue(UPGRADEINSTANCE_PROP.get(), value);
    }
    
    public void setUpgradeInstanceID(gw.pl.persistence.core.Key value) {
      setFieldValue(UPGRADEINSTANCE_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods", "com.guidewire.pl.domain.upgrader.impl.UpgradeDBStorageSetImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.UpgradeDBStorageSet.class, config);
    com.guidewire._generated.entity.UpgradeDBStorageSetInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.UpgradeDBStorageSet, com.guidewire._generated.entity.UpgradeDBStorageSetInternal>() {
      public java.lang.Object getImplementation(entity.UpgradeDBStorageSet bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.UpgradeDBStorageSetInternal getInternalInterface(entity.UpgradeDBStorageSet bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.UpgradeDBStorageSet newEmptyInstance() {
        return new entity.UpgradeDBStorageSet((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}