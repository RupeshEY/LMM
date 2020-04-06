package entity;

/**
 * DatabaseUpdateStats
 * Stores update statistics info in the database.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DatabaseUpdateStats.eti;DatabaseUpdateStats.eix;DatabaseUpdateStats.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "DatabaseUpdateStats")
public class DatabaseUpdateStats extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DatabaseUpdateStats> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DatabaseUpdateStats>("entity.DatabaseUpdateStats");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXTENSIONSSCHEMAVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExtensionsSchemaVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCREMENTAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Incremental");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAJORSCHEMAVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MajorSchemaVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MINORSCHEMAVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MinorSchemaVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PLATFORMMAJORSCHEMAVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PlatformMajorSchemaVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PLATFORMMINORSCHEMAVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PlatformMinorSchemaVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RUNNERTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RunnerType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TABLEUPDATESTATS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "TableUpdateStats");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INCREMENTALTHRESHOLDPERCENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "incrementalThresholdPercent");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATESTATISTICSSQL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "updateStatisticsSQL");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.DatabaseUpdateStatsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public DatabaseUpdateStats()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public DatabaseUpdateStats(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected DatabaseUpdateStats(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.DatabaseUpdateStatsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.DatabaseUpdateStatsInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the TableUpdateStats array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTableUpdateStats(entity.TableUpdateStats element) {
    __getInternalInterface().addArrayElement(TABLEUPDATESTATS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the Description field.
   * Description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the EndTime field.
   * End time of update statistics process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the ExtensionsSchemaVersion field.
   * Extensions Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExtensionsSchemaVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXTENSIONSSCHEMAVERSION_PROP.get());
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
   * Gets the value of the MajorSchemaVersion field.
   * Major Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMajorSchemaVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(MAJORSCHEMAVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the MinorSchemaVersion field.
   * Minor Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMinorSchemaVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(MINORSCHEMAVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the PlatformMajorSchemaVersion field.
   * Platform Major Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPlatformMajorSchemaVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(PLATFORMMAJORSCHEMAVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the PlatformMinorSchemaVersion field.
   * Platform Minor Schema Version at time of collection 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPlatformMinorSchemaVersion() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(PLATFORMMINORSCHEMAVERSION_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RunnerType field.
   * Type of process running the operation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DBUpdateStatsRunnerType getRunnerType() {
    return (typekey.DBUpdateStatsRunnerType)__getInternalInterface().getFieldValue(RUNNERTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the StartTime field.
   * Start time of update statistics process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the TableUpdateStats field.
   * Collection of TableUpdateStats linked to this DatabaseUpdateStats.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableUpdateStats[] getTableUpdateStats() {
    return (entity.TableUpdateStats[])__getInternalInterface().getFieldValue(TABLEUPDATESTATS_PROP.get());
  }
  
  /**
   * Gets the value of the incrementalThresholdPercent field.
   * incremental threshold percent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getincrementalThresholdPercent() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(INCREMENTALTHRESHOLDPERCENT_PROP.get());
  }
  
  /**
   * Gets the value of the updateStatisticsSQL field.
   * Query used to determine if threshold exceeded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getupdateStatisticsSQL() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UPDATESTATISTICSSQL_PROP.get());
  }
  
  /**
   * Gets the value of the Incremental field.
   * Whether update is incremental.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncremental() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCREMENTAL_PROP.get());
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
   * Removes the given element from the TableUpdateStats array. This is achieved by marking the element for removal.
   */
  public void removeFromTableUpdateStats(entity.TableUpdateStats element) {
    __getInternalInterface().removeArrayElement(TABLEUPDATESTATS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the TableUpdateStats array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTableUpdateStats(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(TABLEUPDATESTATS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExtensionsSchemaVersion field.
   */
  public void setExtensionsSchemaVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXTENSIONSSCHEMAVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Incremental field.
   */
  public void setIncremental(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INCREMENTAL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MajorSchemaVersion field.
   */
  public void setMajorSchemaVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(MAJORSCHEMAVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MinorSchemaVersion field.
   */
  public void setMinorSchemaVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(MINORSCHEMAVERSION_PROP.get(), value);
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
   * Sets the value of the PlatformMajorSchemaVersion field.
   */
  public void setPlatformMajorSchemaVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(PLATFORMMAJORSCHEMAVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PlatformMinorSchemaVersion field.
   */
  public void setPlatformMinorSchemaVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(PLATFORMMINORSCHEMAVERSION_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RunnerType field.
   */
  public void setRunnerType(typekey.DBUpdateStatsRunnerType value) {
    __getInternalInterface().setFieldValue(RUNNERTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TableUpdateStats field.
   */
  public void setTableUpdateStats(entity.TableUpdateStats[] value) {
    __getInternalInterface().setFieldValue(TABLEUPDATESTATS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the incrementalThresholdPercent field.
   */
  public void setincrementalThresholdPercent(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(INCREMENTALTHRESHOLDPERCENT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the updateStatisticsSQL field.
   */
  public void setupdateStatisticsSQL(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(UPDATESTATISTICSSQL_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DatabaseUpdateStatsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.DatabaseUpdateStats.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the TableUpdateStats array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTableUpdateStats(entity.TableUpdateStats element) {
      __getInternalInterface().addArrayElement(TABLEUPDATESTATS_PROP.get(), element);
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
     * Description.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the EndTime field.
     * End time of update statistics process.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEndTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the ExtensionsSchemaVersion field.
     * Extensions Schema Version at time of collection 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExtensionsSchemaVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXTENSIONSSCHEMAVERSION_PROP.get());
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
     * Gets the value of the MajorSchemaVersion field.
     * Major Schema Version at time of collection 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getMajorSchemaVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(MAJORSCHEMAVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the MinorSchemaVersion field.
     * Minor Schema Version at time of collection 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getMinorSchemaVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(MINORSCHEMAVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the PlatformMajorSchemaVersion field.
     * Platform Major Schema Version at time of collection 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getPlatformMajorSchemaVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(PLATFORMMAJORSCHEMAVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the PlatformMinorSchemaVersion field.
     * Platform Minor Schema Version at time of collection 
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getPlatformMinorSchemaVersion() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(PLATFORMMINORSCHEMAVERSION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RunnerType field.
     * Type of process running the operation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DBUpdateStatsRunnerType getRunnerType() {
      return (typekey.DBUpdateStatsRunnerType)__getInternalInterface().getFieldValue(RUNNERTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the StartTime field.
     * Start time of update statistics process.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
    }
    
    /**
     * Gets the value of the TableUpdateStats field.
     * Collection of TableUpdateStats linked to this DatabaseUpdateStats.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TableUpdateStats[] getTableUpdateStats() {
      return (entity.TableUpdateStats[])__getInternalInterface().getFieldValue(TABLEUPDATESTATS_PROP.get());
    }
    
    /**
     * Gets the value of the incrementalThresholdPercent field.
     * incremental threshold percent.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getincrementalThresholdPercent() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(INCREMENTALTHRESHOLDPERCENT_PROP.get());
    }
    
    /**
     * Gets the value of the updateStatisticsSQL field.
     * Query used to determine if threshold exceeded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getupdateStatisticsSQL() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UPDATESTATISTICSSQL_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the Incremental field.
     * Whether update is incremental.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIncremental() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INCREMENTAL_PROP.get());
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
     * Removes the given element from the TableUpdateStats array. This is achieved by marking the element for removal.
     */
    public void removeFromTableUpdateStats(entity.TableUpdateStats element) {
      __getInternalInterface().removeArrayElement(TABLEUPDATESTATS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the TableUpdateStats array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTableUpdateStats(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TABLEUPDATESTATS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EndTime field.
     */
    public void setEndTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExtensionsSchemaVersion field.
     */
    public void setExtensionsSchemaVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXTENSIONSSCHEMAVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Incremental field.
     */
    public void setIncremental(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INCREMENTAL_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the MajorSchemaVersion field.
     */
    public void setMajorSchemaVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(MAJORSCHEMAVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MinorSchemaVersion field.
     */
    public void setMinorSchemaVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(MINORSCHEMAVERSION_PROP.get(), value);
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
     * Sets the value of the PlatformMajorSchemaVersion field.
     */
    public void setPlatformMajorSchemaVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(PLATFORMMAJORSCHEMAVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PlatformMinorSchemaVersion field.
     */
    public void setPlatformMinorSchemaVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(PLATFORMMINORSCHEMAVERSION_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RunnerType field.
     */
    public void setRunnerType(typekey.DBUpdateStatsRunnerType value) {
      __getInternalInterface().setFieldValue(RUNNERTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StartTime field.
     */
    public void setStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TableUpdateStats field.
     */
    public void setTableUpdateStats(entity.TableUpdateStats[] value) {
      __getInternalInterface().setFieldValue(TABLEUPDATESTATS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the incrementalThresholdPercent field.
     */
    public void setincrementalThresholdPercent(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(INCREMENTALTHRESHOLDPERCENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the updateStatisticsSQL field.
     */
    public void setupdateStatisticsSQL(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UPDATESTATISTICSSQL_PROP.get(), value);
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
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.DatabaseUpdateStats.class, config);
    com.guidewire._generated.entity.DatabaseUpdateStatsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.DatabaseUpdateStats, com.guidewire._generated.entity.DatabaseUpdateStatsInternal>() {
      public java.lang.Object getImplementation(entity.DatabaseUpdateStats bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DatabaseUpdateStatsInternal getInternalInterface(entity.DatabaseUpdateStats bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.DatabaseUpdateStats newEmptyInstance() {
        return new entity.DatabaseUpdateStats((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}