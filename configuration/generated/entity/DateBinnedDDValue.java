package entity;

/**
 * DateBinnedDDValue
 * Stores value bins and date bin array for date binned distribution.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DateBinnedDDValue.eti;DateBinnedDDValue.eix;DateBinnedDDValue.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "DateBinnedDDValue")
public class DateBinnedDDValue extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DateBinnedDDValue> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DateBinnedDDValue>("entity.DateBinnedDDValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDLVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AddlValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DATEBINNEDDATADIST_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "DateBinnedDataDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DATEBINS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "DateBins");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAXIMUMDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MaximumDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MINIMUMDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MinimumDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NULLVALUES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NullValues");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Value");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.DateBinnedDDValueInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public DateBinnedDDValue()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public DateBinnedDDValue(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected DateBinnedDDValue(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.DateBinnedDDValueInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.DateBinnedDDValueInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the DateBins array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDateBins(entity.DateBinnedDDDateBin element) {
    __getInternalInterface().addArrayElement(DATEBINS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the AddlValue field.
   * Additional column value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddlValue() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDLVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the DateBinnedDataDist field.
   * TypeKeyDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateBinnedDataDist getDateBinnedDataDist() {
    return (entity.DateBinnedDataDist)__getInternalInterface().getFieldValue(DATEBINNEDDATADIST_PROP.get());
  }
  
  /**
   * Gets the value of the DateBins field.
   * Date bins for this value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateBinnedDDDateBin[] getDateBins() {
    return (entity.DateBinnedDDDateBin[])__getInternalInterface().getFieldValue(DATEBINS_PROP.get());
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
   * Gets the value of the MaximumDate field.
   * Maximum date and time for this date column and value bin
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMaximumDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(MAXIMUMDATE_PROP.get());
  }
  
  /**
   * Gets the value of the MinimumDate field.
   * Minimum date and time for this date column and value bin
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMinimumDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(MINIMUMDATE_PROP.get());
  }
  
  /**
   * Gets the value of the NullValues field.
   * Count of items in this value bin with null date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNullValues() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(NULLVALUES_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the Value field.
   * Main column value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getValue() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VALUE_PROP.get());
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
   * Removes the given element from the DateBins array. This is achieved by marking the element for removal.
   */
  public void removeFromDateBins(entity.DateBinnedDDDateBin element) {
    __getInternalInterface().removeArrayElement(DATEBINS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the DateBins array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDateBins(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DATEBINS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AddlValue field.
   */
  public void setAddlValue(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ADDLVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateBinnedDataDist field.
   */
  public void setDateBinnedDataDist(entity.DateBinnedDataDist value) {
    __getInternalInterface().setFieldValue(DATEBINNEDDATADIST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateBins field.
   */
  public void setDateBins(entity.DateBinnedDDDateBin[] value) {
    __getInternalInterface().setFieldValue(DATEBINS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MaximumDate field.
   */
  public void setMaximumDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(MAXIMUMDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MinimumDate field.
   */
  public void setMinimumDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(MINIMUMDATE_PROP.get(), value);
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
   * Sets the value of the NullValues field.
   */
  public void setNullValues(java.lang.Long value) {
    __getInternalInterface().setFieldValue(NULLVALUES_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the Value field.
   */
  public void setValue(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(VALUE_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DateBinnedDDValueInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.DateBinnedDDValue.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the DateBins array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDateBins(entity.DateBinnedDDDateBin element) {
      __getInternalInterface().addArrayElement(DATEBINS_PROP.get(), element);
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
     * Gets the value of the AddlValue field.
     * Additional column value.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAddlValue() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ADDLVALUE_PROP.get());
    }
    
    /**
     * Gets the value of the DateBinnedDataDist field.
     * TypeKeyDataDist for this object.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DateBinnedDataDist getDateBinnedDataDist() {
      return (entity.DateBinnedDataDist)__getInternalInterface().getFieldValue(DATEBINNEDDATADIST_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDateBinnedDataDistID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DATEBINNEDDATADIST_PROP.get());
    }
    
    /**
     * Gets the value of the DateBins field.
     * Date bins for this value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DateBinnedDDDateBin[] getDateBins() {
      return (entity.DateBinnedDDDateBin[])__getInternalInterface().getFieldValue(DATEBINS_PROP.get());
    }
    
    public entity.DateBinnedDDDateBin[] getDateBinsOrderedByStartDate() {
      return ((com.guidewire.pl.domain.database.impl.DateBinnedDDValueInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.DateBinnedDDValueInternalMethods")).getDateBinsOrderedByStartDate();
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
     * Gets the value of the MaximumDate field.
     * Maximum date and time for this date column and value bin
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getMaximumDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(MAXIMUMDATE_PROP.get());
    }
    
    /**
     * Gets the value of the MinimumDate field.
     * Minimum date and time for this date column and value bin
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getMinimumDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(MINIMUMDATE_PROP.get());
    }
    
    /**
     * Gets the value of the NullValues field.
     * Count of items in this value bin with null date
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getNullValues() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(NULLVALUES_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the Value field.
     * Main column value.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getValue() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(VALUE_PROP.get());
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
     * Removes the given element from the DateBins array. This is achieved by marking the element for removal.
     */
    public void removeFromDateBins(entity.DateBinnedDDDateBin element) {
      __getInternalInterface().removeArrayElement(DATEBINS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the DateBins array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDateBins(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DATEBINS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AddlValue field.
     */
    public void setAddlValue(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ADDLVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateBinnedDataDist field.
     */
    public void setDateBinnedDataDist(entity.DateBinnedDataDist value) {
      __getInternalInterface().setFieldValue(DATEBINNEDDATADIST_PROP.get(), value);
    }
    
    public void setDateBinnedDataDistID(gw.pl.persistence.core.Key value) {
      setFieldValue(DATEBINNEDDATADIST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateBins field.
     */
    public void setDateBins(entity.DateBinnedDDDateBin[] value) {
      __getInternalInterface().setFieldValue(DATEBINS_PROP.get(), value);
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
     * Sets the value of the MaximumDate field.
     */
    public void setMaximumDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(MAXIMUMDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MinimumDate field.
     */
    public void setMinimumDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(MINIMUMDATE_PROP.get(), value);
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
     * Sets the value of the NullValues field.
     */
    public void setNullValues(java.lang.Long value) {
      __getInternalInterface().setFieldValue(NULLVALUES_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Value field.
     */
    public void setValue(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(VALUE_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.database.impl.DateBinnedDDValueInternalMethods", "com.guidewire.pl.domain.database.impl.DateBinnedDDValueImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.DateBinnedDDValue.class, config);
    com.guidewire._generated.entity.DateBinnedDDValueInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.DateBinnedDDValue, com.guidewire._generated.entity.DateBinnedDDValueInternal>() {
      public java.lang.Object getImplementation(entity.DateBinnedDDValue bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DateBinnedDDValueInternal getInternalInterface(entity.DateBinnedDDValue bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.DateBinnedDDValue newEmptyInstance() {
        return new entity.DateBinnedDDValue((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}