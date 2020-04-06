package entity;

/**
 * ClusterMemberData
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClusterMemberData.eti;ClusterMemberData.eix;ClusterMemberData.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "ClusterMemberData")
public class ClusterMemberData extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.ClusterMemberData> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.ClusterMemberData>("entity.ClusterMemberData");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BGTASKSSTOPPED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BgTasksStopped");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BUILD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Build");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONNECTIONSTARTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ConnectionStarted");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CONNECTIONSTOPPED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ConnectionStopped");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATA_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Data");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENV_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Env");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LASTUPDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LastUpdate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOGICALNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LogicalName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PLANNEDSHUTDOWNINITIATED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PlannedShutdownInitiated");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PLANNEDSHUTDOWNTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PlannedShutdownTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ROLES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Roles");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RUNLEVEL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RunLevel");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVERID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServerId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVERSTARTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServerStarted");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> USERSESSIONS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UserSessions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UUID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Uuid");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.ClusterMemberDataInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public ClusterMemberData()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public ClusterMemberData(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected ClusterMemberData(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.ClusterMemberDataInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.ClusterMemberDataInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  public java.util.Date calcServerStopped(long staleRecordTimeout) {
    return ((com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods")).calcServerStopped(staleRecordTimeout);
  }
  
  /**
   * Gets the value of the BgTasksStopped field.
   * Time background tasks stopped
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBgTasksStopped() {
    return (java.util.Date)__getInternalInterface().getFieldValue(BGTASKSSTOPPED_PROP.get());
  }
  
  /**
   * Gets the value of the Build field.
   * Build and schema version string
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBuild() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUILD_PROP.get());
  }
  
  /**
   * Gets the value of the ConnectionStarted field.
   * Time connection started
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getConnectionStarted() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CONNECTIONSTARTED_PROP.get());
  }
  
  /**
   * Gets the value of the ConnectionStopped field.
   * Time connection stopped
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getConnectionStopped() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CONNECTIONSTOPPED_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.lang.Blob getData() {
    return (gw.lang.Blob)__getInternalInterface().getFieldValue(DATA_PROP.get());
  }
  
  public java.util.Map<java.lang.String, java.io.Serializable> getDataAsMap() {
    return ((com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods")).getDataAsMap();
  }
  
  /**
   * Gets the value of the Env field.
   * Env value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEnv() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ENV_PROP.get());
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
   * Gets the value of the LastUpdate field.
   * Last update
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLastUpdate() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LASTUPDATE_PROP.get());
  }
  
  public java.util.Date getLastUpdateAsDate() {
    return ((com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods")).getLastUpdateAsDate();
  }
  
  /**
   * Gets the value of the LogicalName field.
   * Node logical name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLogicalName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOGICALNAME_PROP.get());
  }
  
  /**
   * Gets the value of the PlannedShutdownInitiated field.
   * Time planned shutdown initiated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPlannedShutdownInitiated() {
    return (java.util.Date)__getInternalInterface().getFieldValue(PLANNEDSHUTDOWNINITIATED_PROP.get());
  }
  
  /**
   * Gets the value of the PlannedShutdownTime field.
   * Time shutdown planned
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPlannedShutdownTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(PLANNEDSHUTDOWNTIME_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRoles() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ROLES_PROP.get());
  }
  
  /**
   * Gets the value of the RunLevel field.
   * Run level
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRunLevel() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RUNLEVEL_PROP.get());
  }
  
  /**
   * Gets the value of the ServerId field.
   * Server ID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getServerId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVERID_PROP.get());
  }
  
  public java.util.Set<java.lang.String> getServerRoles() {
    return ((com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods")).getServerRoles();
  }
  
  /**
   * Gets the value of the ServerStarted field.
   * Time server started
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServerStarted() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SERVERSTARTED_PROP.get());
  }
  
  /**
   * Gets the value of the UserSessions field.
   * Number of user sessions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getUserSessions() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(USERSESSIONS_PROP.get());
  }
  
  /**
   * Gets the value of the Uuid field.
   * UUID
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUuid() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UUID_PROP.get());
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
   * Sets the value of the BgTasksStopped field.
   */
  public void setBgTasksStopped(java.util.Date value) {
    __getInternalInterface().setFieldValue(BGTASKSSTOPPED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Build field.
   */
  public void setBuild(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BUILD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ConnectionStarted field.
   */
  public void setConnectionStarted(java.util.Date value) {
    __getInternalInterface().setFieldValue(CONNECTIONSTARTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ConnectionStopped field.
   */
  public void setConnectionStopped(java.util.Date value) {
    __getInternalInterface().setFieldValue(CONNECTIONSTOPPED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Data field.
   */
  private void setData(gw.lang.Blob value) {
    __getInternalInterface().setFieldValue(DATA_PROP.get(), value);
  }
  
  public void setDataAsMap(java.util.Map<java.lang.String, java.io.Serializable> data) {
    ((com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods")).setDataAsMap(data);
  }
  
  /**
   * Sets the value of the Env field.
   */
  public void setEnv(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ENV_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LastUpdate field.
   */
  public void setLastUpdate(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(LASTUPDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LogicalName field.
   */
  public void setLogicalName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(LOGICALNAME_PROP.get(), value);
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
   * Sets the value of the PlannedShutdownInitiated field.
   */
  public void setPlannedShutdownInitiated(java.util.Date value) {
    __getInternalInterface().setFieldValue(PLANNEDSHUTDOWNINITIATED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PlannedShutdownTime field.
   */
  public void setPlannedShutdownTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(PLANNEDSHUTDOWNTIME_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the Roles field.
   */
  private void setRoles(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ROLES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RunLevel field.
   */
  public void setRunLevel(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RUNLEVEL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServerId field.
   */
  public void setServerId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(SERVERID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServerStarted field.
   */
  public void setServerStarted(java.util.Date value) {
    __getInternalInterface().setFieldValue(SERVERSTARTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UserSessions field.
   */
  public void setUserSessions(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(USERSESSIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Uuid field.
   */
  public void setUuid(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(UUID_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.ClusterMemberDataInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.ClusterMemberData.this.__getDelegateManager();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public java.util.Date calcServerStopped(long staleRecordTimeout) {
      return ((com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods")).calcServerStopped(staleRecordTimeout);
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
     * Gets the value of the BgTasksStopped field.
     * Time background tasks stopped
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getBgTasksStopped() {
      return (java.util.Date)__getInternalInterface().getFieldValue(BGTASKSSTOPPED_PROP.get());
    }
    
    /**
     * Gets the value of the Build field.
     * Build and schema version string
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBuild() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BUILD_PROP.get());
    }
    
    /**
     * Gets the value of the ConnectionStarted field.
     * Time connection started
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getConnectionStarted() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CONNECTIONSTARTED_PROP.get());
    }
    
    /**
     * Gets the value of the ConnectionStopped field.
     * Time connection stopped
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getConnectionStopped() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CONNECTIONSTOPPED_PROP.get());
    }
    
    /**
     * Gets the value of the Data field.
     * Data
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.lang.Blob getData() {
      return (gw.lang.Blob)__getInternalInterface().getFieldValue(DATA_PROP.get());
    }
    
    public java.util.Map<java.lang.String, java.io.Serializable> getDataAsMap() {
      return ((com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods")).getDataAsMap();
    }
    
    /**
     * Gets the value of the Env field.
     * Env value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEnv() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ENV_PROP.get());
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
     * Gets the value of the LastUpdate field.
     * Last update
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getLastUpdate() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(LASTUPDATE_PROP.get());
    }
    
    public java.util.Date getLastUpdateAsDate() {
      return ((com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods")).getLastUpdateAsDate();
    }
    
    public long getLastUpdateAsLong() {
      return ((com.guidewire.pl.domain.clusterinfo.impl.ClusterMemberDataInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.impl.ClusterMemberDataInternalMethods")).getLastUpdateAsLong();
    }
    
    /**
     * Gets the value of the LogicalName field.
     * Node logical name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getLogicalName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(LOGICALNAME_PROP.get());
    }
    
    /**
     * Gets the value of the PlannedShutdownInitiated field.
     * Time planned shutdown initiated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getPlannedShutdownInitiated() {
      return (java.util.Date)__getInternalInterface().getFieldValue(PLANNEDSHUTDOWNINITIATED_PROP.get());
    }
    
    /**
     * Gets the value of the PlannedShutdownTime field.
     * Time shutdown planned
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getPlannedShutdownTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(PLANNEDSHUTDOWNTIME_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the Roles field.
     * Server roles
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRoles() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ROLES_PROP.get());
    }
    
    /**
     * Gets the value of the RunLevel field.
     * Run level
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRunLevel() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RUNLEVEL_PROP.get());
    }
    
    /**
     * Gets the value of the ServerId field.
     * Server ID
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getServerId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SERVERID_PROP.get());
    }
    
    public java.util.Set<java.lang.String> getServerRoles() {
      return ((com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods")).getServerRoles();
    }
    
    /**
     * Gets the value of the ServerStarted field.
     * Time server started
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getServerStarted() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SERVERSTARTED_PROP.get());
    }
    
    /**
     * Gets the value of the UserSessions field.
     * Number of user sessions
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getUserSessions() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(USERSESSIONS_PROP.get());
    }
    
    /**
     * Gets the value of the Uuid field.
     * UUID
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getUuid() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(UUID_PROP.get());
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
     * Sets the value of the BgTasksStopped field.
     */
    public void setBgTasksStopped(java.util.Date value) {
      __getInternalInterface().setFieldValue(BGTASKSSTOPPED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Build field.
     */
    public void setBuild(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BUILD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ConnectionStarted field.
     */
    public void setConnectionStarted(java.util.Date value) {
      __getInternalInterface().setFieldValue(CONNECTIONSTARTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ConnectionStopped field.
     */
    public void setConnectionStopped(java.util.Date value) {
      __getInternalInterface().setFieldValue(CONNECTIONSTOPPED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Data field.
     */
    public void setData(gw.lang.Blob value) {
      __getInternalInterface().setFieldValue(DATA_PROP.get(), value);
    }
    
    public void setDataAsMap(java.util.Map<java.lang.String, java.io.Serializable> data) {
      ((com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods")).setDataAsMap(data);
    }
    
    /**
     * Sets the value of the Env field.
     */
    public void setEnv(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ENV_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LastUpdate field.
     */
    public void setLastUpdate(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(LASTUPDATE_PROP.get(), value);
    }
    
    public void setLastUpdateAsLong(long value) {
      ((com.guidewire.pl.domain.clusterinfo.impl.ClusterMemberDataInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.impl.ClusterMemberDataInternalMethods")).setLastUpdateAsLong(value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LogicalName field.
     */
    public void setLogicalName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(LOGICALNAME_PROP.get(), value);
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
     * Sets the value of the PlannedShutdownInitiated field.
     */
    public void setPlannedShutdownInitiated(java.util.Date value) {
      __getInternalInterface().setFieldValue(PLANNEDSHUTDOWNINITIATED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PlannedShutdownTime field.
     */
    public void setPlannedShutdownTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(PLANNEDSHUTDOWNTIME_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Roles field.
     */
    public void setRoles(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ROLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RunLevel field.
     */
    public void setRunLevel(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RUNLEVEL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServerId field.
     */
    public void setServerId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(SERVERID_PROP.get(), value);
    }
    
    public void setServerRoles(java.util.Set<java.lang.String> roles) {
      ((com.guidewire.pl.domain.clusterinfo.impl.ClusterMemberDataInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.clusterinfo.impl.ClusterMemberDataInternalMethods")).setServerRoles(roles);
    }
    
    /**
     * Sets the value of the ServerStarted field.
     */
    public void setServerStarted(java.util.Date value) {
      __getInternalInterface().setFieldValue(SERVERSTARTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UserSessions field.
     */
    public void setUserSessions(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(USERSESSIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Uuid field.
     */
    public void setUuid(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(UUID_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.clusterinfo.ClusterMemberDataPublicMethods", "com.guidewire.pl.domain.clusterinfo.impl.ClusterMemberDataImpl");
    config.put("com.guidewire.pl.domain.clusterinfo.impl.ClusterMemberDataInternalMethods", "com.guidewire.pl.domain.clusterinfo.impl.ClusterMemberDataImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.ClusterMemberData.class, config);
    com.guidewire._generated.entity.ClusterMemberDataInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.ClusterMemberData, com.guidewire._generated.entity.ClusterMemberDataInternal>() {
      public java.lang.Object getImplementation(entity.ClusterMemberData bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.ClusterMemberDataInternal getInternalInterface(entity.ClusterMemberData bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.ClusterMemberData newEmptyInstance() {
        return new entity.ClusterMemberData((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}