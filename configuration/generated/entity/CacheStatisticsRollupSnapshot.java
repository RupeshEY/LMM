package entity;

/**
 * CacheStatisticsRollupSnapshot
 * Rollup snapshot for the global cache for a particular time slice
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CacheStatisticsRollupSnapshot.eti;CacheStatisticsRollupSnapshot.eix;CacheStatisticsRollupSnapshot.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "CacheStatisticsRollupSnapshot")
public class CacheStatisticsRollupSnapshot extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean, com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.CacheStatisticsRollupSnapshot> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.CacheStatisticsRollupSnapshot>("entity.CacheStatisticsRollupSnapshot");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVERAGENUMHITS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AverageNumHits");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVERAGENUMMISSES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AverageNumMisses");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVERAGENUMMISSESWHENCACHEFULL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AverageNumMissesWhenCacheFull");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVERAGESPACERETAINED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AverageSpaceRetained");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVERID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServerId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SLICETIMESTAMP_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SliceTimestamp");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.CacheStatisticsRollupSnapshotInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public CacheStatisticsRollupSnapshot()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public CacheStatisticsRollupSnapshot(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected CacheStatisticsRollupSnapshot(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.CacheStatisticsRollupSnapshotInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.CacheStatisticsRollupSnapshotInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AverageNumHits field.
   * Average number of hits for this time slice
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAverageNumHits() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(AVERAGENUMHITS_PROP.get());
  }
  
  /**
   * Gets the value of the AverageNumMisses field.
   * Average number of misses for this time slice
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAverageNumMisses() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(AVERAGENUMMISSES_PROP.get());
  }
  
  /**
   * Gets the value of the AverageNumMissesWhenCacheFull field.
   * Average number of misses because the item was evicted when the cache was full for this time slice
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAverageNumMissesWhenCacheFull() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(AVERAGENUMMISSESWHENCACHEFULL_PROP.get());
  }
  
  /**
   * Gets the value of the AverageSpaceRetained field.
   * Average space retained in bytes for this time slice
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getAverageSpaceRetained() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(AVERAGESPACERETAINED_PROP.get());
  }
  
  /**
   * 
   * @return String representing the line in CSV formatPLC
   */
  public java.lang.String getCSVLine() {
    return ((com.guidewire.pl.domain.cache2.CacheStatisticsRollupSnapshotPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.cache2.CacheStatisticsRollupSnapshotPublicMethods")).getCSVLine();
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ServerId field.
   * ServerId of the host that generated the statistics
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServerId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVERID_PROP.get());
  }
  
  /**
   * Gets the value of the SliceTimestamp field.
   * Lower end of this time slice, i.e 00:00:00,000 for the range 00:00:00,000 to 00:29:59,999
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSliceTimestamp() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SLICETIMESTAMP_PROP.get());
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
   * Sets the value of the AverageNumHits field.
   */
  public void setAverageNumHits(java.lang.Long value) {
    __getInternalInterface().setFieldValue(AVERAGENUMHITS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AverageNumMisses field.
   */
  public void setAverageNumMisses(java.lang.Long value) {
    __getInternalInterface().setFieldValue(AVERAGENUMMISSES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AverageNumMissesWhenCacheFull field.
   */
  public void setAverageNumMissesWhenCacheFull(java.lang.Long value) {
    __getInternalInterface().setFieldValue(AVERAGENUMMISSESWHENCACHEFULL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AverageSpaceRetained field.
   */
  public void setAverageSpaceRetained(java.lang.Long value) {
    __getInternalInterface().setFieldValue(AVERAGESPACERETAINED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
   * Sets the value of the ServerId field.
   */
  public void setServerId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SERVERID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SliceTimestamp field.
   */
  public void setSliceTimestamp(java.util.Date value) {
    __getInternalInterface().setFieldValue(SLICETIMESTAMP_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.CacheStatisticsRollupSnapshotInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.CacheStatisticsRollupSnapshot.this.__getDelegateManager();
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
     * Gets the value of the AverageNumHits field.
     * Average number of hits for this time slice
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getAverageNumHits() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(AVERAGENUMHITS_PROP.get());
    }
    
    /**
     * Gets the value of the AverageNumMisses field.
     * Average number of misses for this time slice
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getAverageNumMisses() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(AVERAGENUMMISSES_PROP.get());
    }
    
    /**
     * Gets the value of the AverageNumMissesWhenCacheFull field.
     * Average number of misses because the item was evicted when the cache was full for this time slice
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getAverageNumMissesWhenCacheFull() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(AVERAGENUMMISSESWHENCACHEFULL_PROP.get());
    }
    
    /**
     * Gets the value of the AverageSpaceRetained field.
     * Average space retained in bytes for this time slice
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getAverageSpaceRetained() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(AVERAGESPACERETAINED_PROP.get());
    }
    
    /**
     * 
     * @return String representing the line in CSV formatPLC
     */
    public java.lang.String getCSVLine() {
      return ((com.guidewire.pl.domain.cache2.CacheStatisticsRollupSnapshotPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.cache2.CacheStatisticsRollupSnapshotPublicMethods")).getCSVLine();
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ServerId field.
     * ServerId of the host that generated the statistics
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getServerId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVERID_PROP.get());
    }
    
    /**
     * Gets the value of the SliceTimestamp field.
     * Lower end of this time slice, i.e 00:00:00,000 for the range 00:00:00,000 to 00:29:59,999
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSliceTimestamp() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SLICETIMESTAMP_PROP.get());
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
     * Sets the value of the AverageNumHits field.
     */
    public void setAverageNumHits(java.lang.Long value) {
      __getInternalInterface().setFieldValue(AVERAGENUMHITS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AverageNumMisses field.
     */
    public void setAverageNumMisses(java.lang.Long value) {
      __getInternalInterface().setFieldValue(AVERAGENUMMISSES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AverageNumMissesWhenCacheFull field.
     */
    public void setAverageNumMissesWhenCacheFull(java.lang.Long value) {
      __getInternalInterface().setFieldValue(AVERAGENUMMISSESWHENCACHEFULL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AverageSpaceRetained field.
     */
    public void setAverageSpaceRetained(java.lang.Long value) {
      __getInternalInterface().setFieldValue(AVERAGESPACERETAINED_PROP.get(), value);
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
     * Sets the value of the ServerId field.
     */
    public void setServerId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SERVERID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SliceTimestamp field.
     */
    public void setSliceTimestamp(java.util.Date value) {
      __getInternalInterface().setFieldValue(SLICETIMESTAMP_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.cache2.CacheStatisticsRollupSnapshotPublicMethods", "com.guidewire.pl.domain.cache2.impl.CacheStatisticsRollupSnapshotImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.cache2.CacheStatisticsRollupSnapshotData", "com.guidewire.pl.domain.cache2.impl.CacheStatisticsRollupSnapshotImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.CacheStatisticsRollupSnapshot.class, config);
    com.guidewire._generated.entity.CacheStatisticsRollupSnapshotInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.CacheStatisticsRollupSnapshot, com.guidewire._generated.entity.CacheStatisticsRollupSnapshotInternal>() {
      public java.lang.Object getImplementation(entity.CacheStatisticsRollupSnapshot bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.CacheStatisticsRollupSnapshotInternal getInternalInterface(entity.CacheStatisticsRollupSnapshot bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.CacheStatisticsRollupSnapshot newEmptyInstance() {
        return new entity.CacheStatisticsRollupSnapshot((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}