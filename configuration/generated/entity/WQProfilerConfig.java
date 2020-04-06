package entity;

/**
 * WQProfilerConfig
 * Profiler configuration for a work queue
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WQProfilerConfig.eti;WQProfilerConfig.eix;WQProfilerConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "WQProfilerConfig")
public class WQProfilerConfig extends entity.ProfilerConfig {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.WQProfilerConfig> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.WQProfilerConfig>("entity.WQProfilerConfig");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INDIVIDUALSTACKS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IndividualStacks");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public WQProfilerConfig()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public WQProfilerConfig(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected WQProfilerConfig(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.WQProfilerConfigInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.WQProfilerConfigInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.WQProfilerConfigInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the IndividualStacks field.
   * True to capture individual stacks; null or false to aggregate the stacks
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIndividualStacks() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INDIVIDUALSTACKS_PROP.get());
  }
  
  /**
   * Sets the value of the IndividualStacks field.
   */
  public void setIndividualStacks(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INDIVIDUALSTACKS_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.WQProfilerConfigInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.WQProfilerConfig.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
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
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
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
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
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
     * Gets the value of the IndividualStacks field.
     * True to capture individual stacks; null or false to aggregate the stacks
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIndividualStacks() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INDIVIDUALSTACKS_PROP.get());
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
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
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
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IndividualStacks field.
     */
    public void setIndividualStacks(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INDIVIDUALSTACKS_PROP.get(), value);
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
    public void setSubtype(typekey.ProfilerConfig value) {
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
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.domain.profiler.impl.ProfilerConfigImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.WQProfilerConfig.class, config);
    com.guidewire._generated.entity.WQProfilerConfigInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.WQProfilerConfig, com.guidewire._generated.entity.WQProfilerConfigInternal>() {
      public java.lang.Object getImplementation(entity.WQProfilerConfig bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.WQProfilerConfigInternal getInternalInterface(entity.WQProfilerConfig bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.WQProfilerConfig newEmptyInstance() {
        return new entity.WQProfilerConfig((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}