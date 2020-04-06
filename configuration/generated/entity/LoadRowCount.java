package entity;

/**
 * LoadRowCount
 * Row counts for load history.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadRowCount.eti;LoadRowCount.eix;LoadRowCount.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "LoadRowCount")
public class LoadRowCount extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.LoadRowCount> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.LoadRowCount>("entity.LoadRowCount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> LOADCOMMAND_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "LoadCommand");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SOURCEBLOCKCOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SourceBlockCount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SOURCEROWCOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SourceRowCount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SOURCETABLENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SourceTableName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STAGINGBLOCKCOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StagingBlockCount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STAGINGROWCOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StagingRowCount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STAGINGTABLENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StagingTableName");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.LoadRowCountInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public LoadRowCount()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public LoadRowCount(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected LoadRowCount(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.LoadRowCountInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.LoadRowCountInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the SourceBlockCount field.
   * Number of blocks in source table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSourceBlockCount() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEBLOCKCOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the SourceRowCount field.
   * Number of rows in source table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getSourceRowCount() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(SOURCEROWCOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the SourceTableName field.
   * Name of source table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSourceTableName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SOURCETABLENAME_PROP.get());
  }
  
  /**
   * Gets the value of the StagingBlockCount field.
   * Number of blocks in staging table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getStagingBlockCount() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(STAGINGBLOCKCOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the StagingRowCount field.
   * Number of rows in staging table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getStagingRowCount() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(STAGINGROWCOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the StagingTableName field.
   * Name of staging table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getStagingTableName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STAGINGTABLENAME_PROP.get());
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
   * Sets the value of the SourceBlockCount field.
   */
  public void setSourceBlockCount(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SOURCEBLOCKCOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SourceRowCount field.
   */
  public void setSourceRowCount(java.lang.Long value) {
    __getInternalInterface().setFieldValue(SOURCEROWCOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SourceTableName field.
   */
  public void setSourceTableName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SOURCETABLENAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StagingBlockCount field.
   */
  public void setStagingBlockCount(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(STAGINGBLOCKCOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StagingRowCount field.
   */
  public void setStagingRowCount(java.lang.Long value) {
    __getInternalInterface().setFieldValue(STAGINGROWCOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StagingTableName field.
   */
  public void setStagingTableName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(STAGINGTABLENAME_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.LoadRowCountInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.LoadRowCount.this.__getDelegateManager();
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
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the SourceBlockCount field.
     * Number of blocks in source table.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSourceBlockCount() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SOURCEBLOCKCOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the SourceRowCount field.
     * Number of rows in source table.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getSourceRowCount() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(SOURCEROWCOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the SourceTableName field.
     * Name of source table.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSourceTableName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SOURCETABLENAME_PROP.get());
    }
    
    /**
     * Gets the value of the StagingBlockCount field.
     * Number of blocks in staging table.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getStagingBlockCount() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(STAGINGBLOCKCOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the StagingRowCount field.
     * Number of rows in staging table.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getStagingRowCount() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(STAGINGROWCOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the StagingTableName field.
     * Name of staging table.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getStagingTableName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(STAGINGTABLENAME_PROP.get());
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
     * Sets the value of the SourceBlockCount field.
     */
    public void setSourceBlockCount(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SOURCEBLOCKCOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourceRowCount field.
     */
    public void setSourceRowCount(java.lang.Long value) {
      __getInternalInterface().setFieldValue(SOURCEROWCOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SourceTableName field.
     */
    public void setSourceTableName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SOURCETABLENAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StagingBlockCount field.
     */
    public void setStagingBlockCount(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(STAGINGBLOCKCOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StagingRowCount field.
     */
    public void setStagingRowCount(java.lang.Long value) {
      __getInternalInterface().setFieldValue(STAGINGROWCOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StagingTableName field.
     */
    public void setStagingTableName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(STAGINGTABLENAME_PROP.get(), value);
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
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.LoadRowCount.class, config);
    com.guidewire._generated.entity.LoadRowCountInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.LoadRowCount, com.guidewire._generated.entity.LoadRowCountInternal>() {
      public java.lang.Object getImplementation(entity.LoadRowCount bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.LoadRowCountInternal getInternalInterface(entity.LoadRowCount bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.LoadRowCount newEmptyInstance() {
        return new entity.LoadRowCount((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}