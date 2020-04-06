package entity;

/**
 * ArrayDataDist
 * Stores array data distribution.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ArrayDataDist.eti;ArrayDataDist.eix;ArrayDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ArrayDataDist")
public class ArrayDataDist extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ArrayDataDist> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ArrayDataDist>("entity.ArrayDataDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARRAYENTITYNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArrayEntityName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARRAYENTITYTABLENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArrayEntityTableName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARRAYNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArrayName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ARRAYSIZECNTDDS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ArraySizeCntDDs");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAXSIZE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MaxSize");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MEANSIZE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MeanSize");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MEDIANSIZE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MedianSize");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MINSIZE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MinSize");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMNONNULL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumNonNull");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TABLEDATADIST_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TableDataDist");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ArrayDataDistInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ArrayDataDist()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ArrayDataDist(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ArrayDataDist(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ArrayDataDistInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ArrayDataDistInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the ArraySizeCntDDs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToArraySizeCntDDs(entity.ArraySizeCntDD element) {
    __getInternalInterface().addArrayElement(ARRAYSIZECNTDDS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the ArrayEntityName field.
   * Entity associated with array
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getArrayEntityName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ARRAYENTITYNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ArrayEntityTableName field.
   * Table for array entity
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getArrayEntityTableName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ARRAYENTITYTABLENAME_PROP.get());
  }
  
  /**
   * Gets the value of the ArrayName field.
   * Name of array.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getArrayName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ARRAYNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ArraySizeCntDDs field.
   * Collection of ArraySizeCntDDs linked to this ArrayDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ArraySizeCntDD[] getArraySizeCntDDs() {
    return (entity.ArraySizeCntDD[])__getInternalInterface().getFieldValue(ARRAYSIZECNTDDS_PROP.get());
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
   * Gets the value of the MaxSize field.
   * Maximum array size.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMaxSize() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(MAXSIZE_PROP.get());
  }
  
  /**
   * Gets the value of the MeanSize field.
   * Mean size of arrays.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getMeanSize() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(MEANSIZE_PROP.get());
  }
  
  /**
   * Gets the value of the MedianSize field.
   * Median size of arrays.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMedianSize() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(MEDIANSIZE_PROP.get());
  }
  
  /**
   * Gets the value of the MinSize field.
   * Minimum array size.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMinSize() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(MINSIZE_PROP.get());
  }
  
  /**
   * Gets the value of the NumNonNull field.
   * Count of # of non null values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumNonNull() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(NUMNONNULL_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist() {
    return (entity.TableDataDist)__getInternalInterface().getFieldValue(TABLEDATADIST_PROP.get());
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
   * Removes the given element from the ArraySizeCntDDs array. This is achieved by marking the element for removal.
   */
  public void removeFromArraySizeCntDDs(entity.ArraySizeCntDD element) {
    __getInternalInterface().removeArrayElement(ARRAYSIZECNTDDS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ArraySizeCntDDs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromArraySizeCntDDs(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ARRAYSIZECNTDDS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the ArrayEntityName field.
   */
  public void setArrayEntityName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ARRAYENTITYNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArrayEntityTableName field.
   */
  public void setArrayEntityTableName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ARRAYENTITYTABLENAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArrayName field.
   */
  public void setArrayName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ARRAYNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArraySizeCntDDs field.
   */
  public void setArraySizeCntDDs(entity.ArraySizeCntDD[] value) {
    __getInternalInterface().setFieldValue(ARRAYSIZECNTDDS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MaxSize field.
   */
  public void setMaxSize(java.lang.Long value) {
    __getInternalInterface().setFieldValue(MAXSIZE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MeanSize field.
   */
  public void setMeanSize(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(MEANSIZE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MedianSize field.
   */
  public void setMedianSize(java.lang.Long value) {
    __getInternalInterface().setFieldValue(MEDIANSIZE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MinSize field.
   */
  public void setMinSize(java.lang.Long value) {
    __getInternalInterface().setFieldValue(MINSIZE_PROP.get(), value);
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
   * Sets the value of the NumNonNull field.
   */
  public void setNumNonNull(java.lang.Long value) {
    __getInternalInterface().setFieldValue(NUMNONNULL_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value) {
    __getInternalInterface().setFieldValue(TABLEDATADIST_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ArrayDataDistInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ArrayDataDist.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the ArraySizeCntDDs array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToArraySizeCntDDs(entity.ArraySizeCntDD element) {
      __getInternalInterface().addArrayElement(ARRAYSIZECNTDDS_PROP.get(), element);
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
     * Gets the value of the ArrayEntityName field.
     * Entity associated with array
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getArrayEntityName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ARRAYENTITYNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ArrayEntityTableName field.
     * Table for array entity
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getArrayEntityTableName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ARRAYENTITYTABLENAME_PROP.get());
    }
    
    /**
     * Gets the value of the ArrayName field.
     * Name of array.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getArrayName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ARRAYNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ArraySizeCntDDs field.
     * Collection of ArraySizeCntDDs linked to this ArrayDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ArraySizeCntDD[] getArraySizeCntDDs() {
      return (entity.ArraySizeCntDD[])__getInternalInterface().getFieldValue(ARRAYSIZECNTDDS_PROP.get());
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
     * Gets the value of the MaxSize field.
     * Maximum array size.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getMaxSize() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(MAXSIZE_PROP.get());
    }
    
    /**
     * Gets the value of the MeanSize field.
     * Mean size of arrays.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getMeanSize() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(MEANSIZE_PROP.get());
    }
    
    /**
     * Gets the value of the MedianSize field.
     * Median size of arrays.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getMedianSize() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(MEDIANSIZE_PROP.get());
    }
    
    /**
     * Gets the value of the MinSize field.
     * Minimum array size.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getMinSize() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(MINSIZE_PROP.get());
    }
    
    /**
     * Gets the value of the NumNonNull field.
     * Count of # of non null values.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getNumNonNull() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(NUMNONNULL_PROP.get());
    }
    
    public entity.ArraySizeCntDD[] getPairsSortedByCountDescending() {
      return ((com.guidewire.pl.domain.database.impl.ArrayDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.ArrayDataDistInternalMethods")).getPairsSortedByCountDescending();
    }
    
    public entity.ArraySizeCntDD[] getPairsSortedBySizeAscending() {
      return ((com.guidewire.pl.domain.database.impl.ArrayDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.ArrayDataDistInternalMethods")).getPairsSortedBySizeAscending();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the TableDataDist field.
     * TableDataDist for this object.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TableDataDist getTableDataDist() {
      return (entity.TableDataDist)__getInternalInterface().getFieldValue(TABLEDATADIST_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTableDataDistID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TABLEDATADIST_PROP.get());
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
     * Removes the given element from the ArraySizeCntDDs array. This is achieved by marking the element for removal.
     */
    public void removeFromArraySizeCntDDs(entity.ArraySizeCntDD element) {
      __getInternalInterface().removeArrayElement(ARRAYSIZECNTDDS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ArraySizeCntDDs array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromArraySizeCntDDs(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ARRAYSIZECNTDDS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the ArrayEntityName field.
     */
    public void setArrayEntityName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ARRAYENTITYNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArrayEntityTableName field.
     */
    public void setArrayEntityTableName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ARRAYENTITYTABLENAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArrayName field.
     */
    public void setArrayName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ARRAYNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArraySizeCntDDs field.
     */
    public void setArraySizeCntDDs(entity.ArraySizeCntDD[] value) {
      __getInternalInterface().setFieldValue(ARRAYSIZECNTDDS_PROP.get(), value);
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
     * Sets the value of the MaxSize field.
     */
    public void setMaxSize(java.lang.Long value) {
      __getInternalInterface().setFieldValue(MAXSIZE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MeanSize field.
     */
    public void setMeanSize(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(MEANSIZE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MedianSize field.
     */
    public void setMedianSize(java.lang.Long value) {
      __getInternalInterface().setFieldValue(MEDIANSIZE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MinSize field.
     */
    public void setMinSize(java.lang.Long value) {
      __getInternalInterface().setFieldValue(MINSIZE_PROP.get(), value);
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
     * Sets the value of the NumNonNull field.
     */
    public void setNumNonNull(java.lang.Long value) {
      __getInternalInterface().setFieldValue(NUMNONNULL_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the TableDataDist field.
     */
    public void setTableDataDist(entity.TableDataDist value) {
      __getInternalInterface().setFieldValue(TABLEDATADIST_PROP.get(), value);
    }
    
    public void setTableDataDistID(gw.pl.persistence.core.Key value) {
      setFieldValue(TABLEDATADIST_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.database.impl.ArrayDataDistInternalMethods", "com.guidewire.pl.domain.database.impl.ArrayDataDistImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ArrayDataDist.class, config);
    com.guidewire._generated.entity.ArrayDataDistInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ArrayDataDist, com.guidewire._generated.entity.ArrayDataDistInternal>() {
      public java.lang.Object getImplementation(entity.ArrayDataDist bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ArrayDataDistInternal getInternalInterface(entity.ArrayDataDist bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ArrayDataDist newEmptyInstance() {
        return new entity.ArrayDataDist((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}