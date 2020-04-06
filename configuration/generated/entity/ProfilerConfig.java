package entity;

/**
 * ProfilerConfig
 * Profiler configuration for an entry point
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ProfilerConfig.eti;ProfilerConfig.eix;ProfilerConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class ProfilerConfig extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ProfilerConfig> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ProfilerConfig>("entity.ProfilerConfig");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DBMSCOUNTERTHRESHOLDMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DbmsCounterThresholdMs");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DIFFDBMSCOUNTERS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DiffDbmsCounters");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENTRYPOINT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EntryPoint");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXTENDEDQUERYTRACING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExtendedQueryTracing");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HIRESCLOCK_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "HiResClock");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROFILERENABLED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProfilerEnabled");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> QUERYOPTIMIZERTRACING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "QueryOptimizerTracing");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STACKTRACETRACKING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StackTraceTracking");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ProfilerConfigInternal _internal;
  
  protected ProfilerConfig(java.lang.Void ignored)  {
    
  }
  
  protected abstract com.guidewire._generated.entity.ProfilerConfigInternal __createInternalInterface();
  
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected abstract com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap();
  
  
  protected com.guidewire._generated.entity.ProfilerConfigInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the DbmsCounterThresholdMs field.
   * The threshold for generating a report using dbms counters for the interval (start of profiling session, end of profiling session). Use 0 to disable. Only meaningful if ProfilerEnabled is true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDbmsCounterThresholdMs() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(DBMSCOUNTERTHRESHOLDMS_PROP.get());
  }
  
  /**
   * Gets the value of the EntryPoint field.
   * Name of entry point
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEntryPoint() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ENTRYPOINT_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ProfilerConfig getSubtype() {
    return (typekey.ProfilerConfig)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the DiffDbmsCounters field.
   * Whether diffing DBMS counters is enabled. Only meaningful if ProfilerEnabled and DbmsCounterThresholdMs are true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDiffDbmsCounters() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(DIFFDBMSCOUNTERS_PROP.get());
  }
  
  /**
   * Gets the value of the ExtendedQueryTracing field.
   * Whether extended query tracing is enabled. Only meaningful if ProfilerEnabled is true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExtendedQueryTracing() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(EXTENDEDQUERYTRACING_PROP.get());
  }
  
  /**
   * Gets the value of the HiResClock field.
   * Whether to use hi-resolution clock for timing (Windows only)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isHiResClock() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(HIRESCLOCK_PROP.get());
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
   * Gets the value of the ProfilerEnabled field.
   * Whether profiling is enabled for this entry point
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isProfilerEnabled() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PROFILERENABLED_PROP.get());
  }
  
  /**
   * Gets the value of the QueryOptimizerTracing field.
   * Whether query optimizer tracing is enabled. Only meaningful if ProfilerEnabled is true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isQueryOptimizerTracing() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(QUERYOPTIMIZERTRACING_PROP.get());
  }
  
  /**
   * Gets the value of the StackTraceTracking field.
   * Whether stack tracing is enabled. Only meaningful if ProfilerEnabled is true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStackTraceTracking() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(STACKTRACETRACKING_PROP.get());
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
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DbmsCounterThresholdMs field.
   */
  public void setDbmsCounterThresholdMs(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(DBMSCOUNTERTHRESHOLDMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DiffDbmsCounters field.
   */
  public void setDiffDbmsCounters(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(DIFFDBMSCOUNTERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EntryPoint field.
   */
  public void setEntryPoint(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ENTRYPOINT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExtendedQueryTracing field.
   */
  public void setExtendedQueryTracing(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(EXTENDEDQUERYTRACING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HiResClock field.
   */
  public void setHiResClock(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(HIRESCLOCK_PROP.get(), value);
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
  
  /**
   * Sets the value of the ProfilerEnabled field.
   */
  public void setProfilerEnabled(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PROFILERENABLED_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the QueryOptimizerTracing field.
   */
  public void setQueryOptimizerTracing(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(QUERYOPTIMIZERTRACING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StackTraceTracking field.
   */
  public void setStackTraceTracking(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(STACKTRACETRACKING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Subtype field.
   */
  private void setSubtype(typekey.ProfilerConfig value) {
    __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
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
  
  static {
    com.guidewire._generated.entity.ProfilerConfigInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.ProfilerConfig, com.guidewire._generated.entity.ProfilerConfigInternal>() {
      public java.lang.Object getImplementation(entity.ProfilerConfig bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ProfilerConfigInternal getInternalInterface(entity.ProfilerConfig bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}