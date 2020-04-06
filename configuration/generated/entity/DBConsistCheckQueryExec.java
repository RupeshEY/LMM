package entity;

/**
 * DBConsistCheckQueryExec
 * Stores instrumented queries from consistency checker.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DBConsistCheckQueryExec.eti;DBConsistCheckQueryExec.eix;DBConsistCheckQueryExec.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "DBConsistCheckQueryExec")
public class DBConsistCheckQueryExec extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DBConsistCheckQueryExec> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DBConsistCheckQueryExec>("entity.DBConsistCheckQueryExec");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CONSISTENCYCHECKTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ConsistencyCheckType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DBCONSISTCHECKRUN_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "DBConsistCheckRun");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DURATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Duration");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FINGERPRINT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Fingerprint");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMROWS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumRows");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> QUERYTEXT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "QueryText");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> QUERYTOIDENTIFYROWS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "QueryToIdentifyRows");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SQLFAILUREMSG_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SQLFailureMsg");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TABLENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TableName");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.DBConsistCheckQueryExecInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public DBConsistCheckQueryExec()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public DBConsistCheckQueryExec(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected DBConsistCheckQueryExec(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.DBConsistCheckQueryExecInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.DBConsistCheckQueryExecInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the ConsistencyCheckType field.
   * Type of consistency check
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ConsistencyCheckType getConsistencyCheckType() {
    return (typekey.ConsistencyCheckType)__getInternalInterface().getFieldValue(CONSISTENCYCHECKTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the DBConsistCheckRun field.
   * DBConsistCheckRun for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DBConsistCheckRun getDBConsistCheckRun() {
    return (entity.DBConsistCheckRun)__getInternalInterface().getFieldValue(DBCONSISTCHECKRUN_PROP.get());
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
   * Gets the value of the Duration field.
   * Elapsed time in seconds
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDuration() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DURATION_PROP.get());
  }
  
  /**
   * Gets the value of the EndTime field.
   * End time of query execution.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the Fingerprint field.
   * Fingerprint of query, if query-based
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFingerprint() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FINGERPRINT_PROP.get());
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
   * Gets the value of the NumRows field.
   * # of rows failing check
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumRows() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMROWS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the QueryText field.
   * Query.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getQueryText() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(QUERYTEXT_PROP.get());
  }
  
  /**
   * Gets the value of the QueryToIdentifyRows field.
   * Query to identify rows.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getQueryToIdentifyRows() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(QUERYTOIDENTIFYROWS_PROP.get());
  }
  
  /**
   * Gets the value of the SQLFailureMsg field.
   * SQL failure stack trace
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSQLFailureMsg() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SQLFAILUREMSG_PROP.get());
  }
  
  /**
   * Gets the value of the StartTime field.
   * Start time of query execution.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the TableName field.
   * Table name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TABLENAME_PROP.get());
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
   * Sets the value of the ConsistencyCheckType field.
   */
  public void setConsistencyCheckType(typekey.ConsistencyCheckType value) {
    __getInternalInterface().setFieldValue(CONSISTENCYCHECKTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DBConsistCheckRun field.
   */
  public void setDBConsistCheckRun(entity.DBConsistCheckRun value) {
    __getInternalInterface().setFieldValue(DBCONSISTCHECKRUN_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setDescription(java.lang.String value) {
    ((com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods")).setDescription(value);
  }
  
  /**
   * Sets the value of the Duration field.
   */
  public void setDuration(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(DURATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Fingerprint field.
   */
  public void setFingerprint(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(FINGERPRINT_PROP.get(), value);
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
   * Sets the value of the NumRows field.
   */
  public void setNumRows(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NUMROWS_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setQueryText(java.lang.String value) {
    ((com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods")).setQueryText(value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setQueryToIdentifyRows(java.lang.String value) {
    ((com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods")).setQueryToIdentifyRows(value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setSQLFailureMsg(java.lang.String value) {
    ((com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods")).setSQLFailureMsg(value);
  }
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TABLENAME_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DBConsistCheckQueryExecInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.DBConsistCheckQueryExec.this.__getDelegateManager();
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
     * Gets the value of the ConsistencyCheckType field.
     * Type of consistency check
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ConsistencyCheckType getConsistencyCheckType() {
      return (typekey.ConsistencyCheckType)__getInternalInterface().getFieldValue(CONSISTENCYCHECKTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the DBConsistCheckRun field.
     * DBConsistCheckRun for this object.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DBConsistCheckRun getDBConsistCheckRun() {
      return (entity.DBConsistCheckRun)__getInternalInterface().getFieldValue(DBCONSISTCHECKRUN_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDBConsistCheckRunID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DBCONSISTCHECKRUN_PROP.get());
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
     * Gets the value of the Duration field.
     * Elapsed time in seconds
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getDuration() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DURATION_PROP.get());
    }
    
    /**
     * Gets the value of the EndTime field.
     * End time of query execution.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEndTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the Fingerprint field.
     * Fingerprint of query, if query-based
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getFingerprint() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(FINGERPRINT_PROP.get());
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
     * Gets the value of the NumRows field.
     * # of rows failing check
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNumRows() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMROWS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the QueryText field.
     * Query.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getQueryText() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(QUERYTEXT_PROP.get());
    }
    
    /**
     * Gets the value of the QueryToIdentifyRows field.
     * Query to identify rows.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getQueryToIdentifyRows() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(QUERYTOIDENTIFYROWS_PROP.get());
    }
    
    /**
     * Gets the value of the SQLFailureMsg field.
     * SQL failure stack trace
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getSQLFailureMsg() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(SQLFAILUREMSG_PROP.get());
    }
    
    /**
     * Gets the value of the StartTime field.
     * Start time of query execution.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
    }
    
    /**
     * Gets the value of the TableName field.
     * Table name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTableName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TABLENAME_PROP.get());
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
     * Sets the value of the ConsistencyCheckType field.
     */
    public void setConsistencyCheckType(typekey.ConsistencyCheckType value) {
      __getInternalInterface().setFieldValue(CONSISTENCYCHECKTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DBConsistCheckRun field.
     */
    public void setDBConsistCheckRun(entity.DBConsistCheckRun value) {
      __getInternalInterface().setFieldValue(DBCONSISTCHECKRUN_PROP.get(), value);
    }
    
    public void setDBConsistCheckRunID(gw.pl.persistence.core.Key value) {
      setFieldValue(DBCONSISTCHECKRUN_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setDescription(java.lang.String value) {
      ((com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods")).setDescription(value);
    }
    
    /**
     * Sets the value of the Duration field.
     */
    public void setDuration(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(DURATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EndTime field.
     */
    public void setEndTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Fingerprint field.
     */
    public void setFingerprint(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(FINGERPRINT_PROP.get(), value);
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
    
    /**
     * Sets the value of the NumRows field.
     */
    public void setNumRows(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NUMROWS_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setQueryText(java.lang.String value) {
      ((com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods")).setQueryText(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setQueryToIdentifyRows(java.lang.String value) {
      ((com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods")).setQueryToIdentifyRows(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setSQLFailureMsg(java.lang.String value) {
      ((com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods")).setSQLFailureMsg(value);
    }
    
    /**
     * Sets the value of the StartTime field.
     */
    public void setStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TableName field.
     */
    public void setTableName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TABLENAME_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.database.DBConsistCheckQueryExecPublicMethods", "com.guidewire.pl.domain.database.impl.DBConsistCheckQueryExecImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.DBConsistCheckQueryExec.class, config);
    com.guidewire._generated.entity.DBConsistCheckQueryExecInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.DBConsistCheckQueryExec, com.guidewire._generated.entity.DBConsistCheckQueryExecInternal>() {
      public java.lang.Object getImplementation(entity.DBConsistCheckQueryExec bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DBConsistCheckQueryExecInternal getInternalInterface(entity.DBConsistCheckQueryExec bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.DBConsistCheckQueryExec newEmptyInstance() {
        return new entity.DBConsistCheckQueryExec((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}