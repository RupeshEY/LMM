package entity;

/**
 * LoadCommand
 * Staging table load history.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadCommand.eti;LoadCommand.eix;LoadCommand.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "LoadCommand")
public class LoadCommand extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean, entity.TimedLoaderObject {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.LoadCommand> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.LoadCommand>("entity.LoadCommand");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CALLBACKS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Callbacks");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CALLINGUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CallingUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COMMANDTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CommandType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ENCRYPTTABLES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "EncryptTables");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ERRORCOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ErrorCount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INSERTSELECTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "InsertSelects");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INTEGRITYCHECKS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "IntegrityChecks");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PARAMETERNAMEVALUEPAIRS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ParameterNameValuePairs");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECREATEINDEXES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RecreateIndexes");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ROWCOUNTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RowCounts");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> STEPS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Steps");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> UPDATEDBSTATISTICSCOMMANDS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "UpdateDBStatisticsCommands");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.LoadCommandInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public LoadCommand()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public LoadCommand(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected LoadCommand(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.LoadCommandInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.LoadCommandInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the Callbacks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCallbacks(entity.LoadCallback element) {
    __getInternalInterface().addArrayElement(CALLBACKS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the EncryptTables array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToEncryptTables(entity.LoadEncryptTable element) {
    __getInternalInterface().addArrayElement(ENCRYPTTABLES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the InsertSelects array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInsertSelects(entity.LoadInsertSelect element) {
    __getInternalInterface().addArrayElement(INSERTSELECTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the IntegrityChecks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToIntegrityChecks(entity.LoadIntegrityCheck element) {
    __getInternalInterface().addArrayElement(INTEGRITYCHECKS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ParameterNameValuePairs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToParameterNameValuePairs(entity.LoadParameter element) {
    __getInternalInterface().addArrayElement(PARAMETERNAMEVALUEPAIRS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the RowCounts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRowCounts(entity.LoadRowCount element) {
    __getInternalInterface().addArrayElement(ROWCOUNTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Steps array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSteps(entity.LoadStep element) {
    __getInternalInterface().addArrayElement(STEPS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the UpdateDBStatisticsCommands array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpdateDBStatisticsCommands(entity.UpdateDBStatisticsCommand element) {
    __getInternalInterface().addArrayElement(UPDATEDBSTATISTICSCOMMANDS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the Callbacks field.
   * Timed loader callbacks.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCallback[] getCallbacks() {
    return (entity.LoadCallback[])__getInternalInterface().getFieldValue(CALLBACKS_PROP.get());
  }
  
  /**
   * Gets the value of the CallingUser field.
   * ID of the user who executed the operation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCallingUser() {
    return (entity.User)__getInternalInterface().getFieldValue(CALLINGUSER_PROP.get());
  }
  
  /**
   * Gets the value of the CommandType field.
   * Type of load command.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LoadCommandType getCommandType() {
    return (typekey.LoadCommandType)__getInternalInterface().getFieldValue(COMMANDTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the Description field.
   * Description of the load history event.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the EncryptTables field.
   * Timed loader table columns encryptions.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadEncryptTable[] getEncryptTables() {
    return (entity.LoadEncryptTable[])__getInternalInterface().getFieldValue(ENCRYPTTABLES_PROP.get());
  }
  
  /**
   * Gets the value of the EndTime field.
   * Timestamp when the timing completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
  }
  
  /**
   * Gets the value of the ErrorCount field.
   * Total number of integrity check errors detected for all affected tables (if applicable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getErrorCount() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ERRORCOUNT_PROP.get());
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
   * Gets the value of the InsertSelects field.
   * Timed loader insert/selects.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadInsertSelect[] getInsertSelects() {
    return (entity.LoadInsertSelect[])__getInternalInterface().getFieldValue(INSERTSELECTS_PROP.get());
  }
  
  /**
   * Gets the value of the IntegrityChecks field.
   * Timed loader integrity checks.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadIntegrityCheck[] getIntegrityChecks() {
    return (entity.LoadIntegrityCheck[])__getInternalInterface().getFieldValue(INTEGRITYCHECKS_PROP.get());
  }
  
  /**
   * 
   * @return LoadCallbacks ordered by duration descending.
   */
  public entity.LoadCallback[] getOrderedCallbacks() {
    return ((com.guidewire.pl.domain.staging.LoadCommandPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadCommandPublicMethods")).getOrderedCallbacks();
  }
  
  /**
   * 
   * @return Insert selects ordered by duration descending.
   */
  public gw.api.database.IQueryBeanResult<entity.LoadInsertSelect> getOrderedInserts() {
    return ((com.guidewire.pl.domain.staging.LoadCommandPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadCommandPublicMethods")).getOrderedInserts();
  }
  
  /**
   * 
   * @return Integrity checks ordered by duration descending.
   */
  public gw.api.database.IQueryBeanResult<entity.LoadIntegrityCheck> getOrderedIntegrityChecks() {
    return ((com.guidewire.pl.domain.staging.LoadCommandPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadCommandPublicMethods")).getOrderedIntegrityChecks();
  }
  
  /**
   * 
   * @return Row counts ordered by table name.
   */
  public gw.api.database.IQueryBeanResult<entity.LoadRowCount> getOrderedRowCounts() {
    return ((com.guidewire.pl.domain.staging.LoadCommandPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadCommandPublicMethods")).getOrderedRowCounts();
  }
  
  /**
   * Gets the value of the ParameterNameValuePairs field.
   * Parameter values for command.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadParameter[] getParameterNameValuePairs() {
    return (entity.LoadParameter[])__getInternalInterface().getFieldValue(PARAMETERNAMEVALUEPAIRS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RecreateIndexes field.
   * ID of batch process to recreate indexes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRecreateIndexes() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RECREATEINDEXES_PROP.get());
  }
  
  /**
   * Gets the value of the RowCounts field.
   * Row counts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadRowCount[] getRowCounts() {
    return (entity.LoadRowCount[])__getInternalInterface().getFieldValue(ROWCOUNTS_PROP.get());
  }
  
  /**
   * Gets the value of the StartTime field.
   * Timestamp when the timing began.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the Steps field.
   * Steps.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadStep[] getSteps() {
    return (entity.LoadStep[])__getInternalInterface().getFieldValue(STEPS_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateDBStatisticsCommands field.
   * UpdateDBStatisticsCommands.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpdateDBStatisticsCommand[] getUpdateDBStatisticsCommands() {
    return (entity.UpdateDBStatisticsCommand[])__getInternalInterface().getFieldValue(UPDATEDBSTATISTICSCOMMANDS_PROP.get());
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
   * Removes the given element from the Callbacks array. This is achieved by marking the element for removal.
   */
  public void removeFromCallbacks(entity.LoadCallback element) {
    __getInternalInterface().removeArrayElement(CALLBACKS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Callbacks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCallbacks(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CALLBACKS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the EncryptTables array. This is achieved by marking the element for removal.
   */
  public void removeFromEncryptTables(entity.LoadEncryptTable element) {
    __getInternalInterface().removeArrayElement(ENCRYPTTABLES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the EncryptTables array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromEncryptTables(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ENCRYPTTABLES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the InsertSelects array. This is achieved by marking the element for removal.
   */
  public void removeFromInsertSelects(entity.LoadInsertSelect element) {
    __getInternalInterface().removeArrayElement(INSERTSELECTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the InsertSelects array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInsertSelects(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(INSERTSELECTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the IntegrityChecks array. This is achieved by marking the element for removal.
   */
  public void removeFromIntegrityChecks(entity.LoadIntegrityCheck element) {
    __getInternalInterface().removeArrayElement(INTEGRITYCHECKS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the IntegrityChecks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromIntegrityChecks(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(INTEGRITYCHECKS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ParameterNameValuePairs array. This is achieved by marking the element for removal.
   */
  public void removeFromParameterNameValuePairs(entity.LoadParameter element) {
    __getInternalInterface().removeArrayElement(PARAMETERNAMEVALUEPAIRS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ParameterNameValuePairs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromParameterNameValuePairs(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(PARAMETERNAMEVALUEPAIRS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the RowCounts array. This is achieved by marking the element for removal.
   */
  public void removeFromRowCounts(entity.LoadRowCount element) {
    __getInternalInterface().removeArrayElement(ROWCOUNTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the RowCounts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRowCounts(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ROWCOUNTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Steps array. This is achieved by marking the element for removal.
   */
  public void removeFromSteps(entity.LoadStep element) {
    __getInternalInterface().removeArrayElement(STEPS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Steps array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSteps(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(STEPS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the UpdateDBStatisticsCommands array. This is achieved by marking the element for removal.
   */
  public void removeFromUpdateDBStatisticsCommands(entity.UpdateDBStatisticsCommand element) {
    __getInternalInterface().removeArrayElement(UPDATEDBSTATISTICSCOMMANDS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the UpdateDBStatisticsCommands array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpdateDBStatisticsCommands(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(UPDATEDBSTATISTICSCOMMANDS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the Callbacks field.
   */
  public void setCallbacks(entity.LoadCallback[] value) {
    __getInternalInterface().setFieldValue(CALLBACKS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CallingUser field.
   */
  public void setCallingUser(entity.User value) {
    __getInternalInterface().setFieldValue(CALLINGUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CommandType field.
   */
  public void setCommandType(typekey.LoadCommandType value) {
    __getInternalInterface().setFieldValue(COMMANDTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EncryptTables field.
   */
  public void setEncryptTables(entity.LoadEncryptTable[] value) {
    __getInternalInterface().setFieldValue(ENCRYPTTABLES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ErrorCount field.
   */
  public void setErrorCount(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ERRORCOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InsertSelects field.
   */
  public void setInsertSelects(entity.LoadInsertSelect[] value) {
    __getInternalInterface().setFieldValue(INSERTSELECTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IntegrityChecks field.
   */
  public void setIntegrityChecks(entity.LoadIntegrityCheck[] value) {
    __getInternalInterface().setFieldValue(INTEGRITYCHECKS_PROP.get(), value);
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
   * Sets the value of the ParameterNameValuePairs field.
   */
  public void setParameterNameValuePairs(entity.LoadParameter[] value) {
    __getInternalInterface().setFieldValue(PARAMETERNAMEVALUEPAIRS_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RecreateIndexes field.
   */
  public void setRecreateIndexes(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RECREATEINDEXES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RowCounts field.
   */
  public void setRowCounts(entity.LoadRowCount[] value) {
    __getInternalInterface().setFieldValue(ROWCOUNTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Steps field.
   */
  public void setSteps(entity.LoadStep[] value) {
    __getInternalInterface().setFieldValue(STEPS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateDBStatisticsCommands field.
   */
  public void setUpdateDBStatisticsCommands(entity.UpdateDBStatisticsCommand[] value) {
    __getInternalInterface().setFieldValue(UPDATEDBSTATISTICSCOMMANDS_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.LoadCommandInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.LoadCommand.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the Callbacks array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCallbacks(entity.LoadCallback element) {
      __getInternalInterface().addArrayElement(CALLBACKS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the EncryptTables array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToEncryptTables(entity.LoadEncryptTable element) {
      __getInternalInterface().addArrayElement(ENCRYPTTABLES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the InsertSelects array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToInsertSelects(entity.LoadInsertSelect element) {
      __getInternalInterface().addArrayElement(INSERTSELECTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the IntegrityChecks array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToIntegrityChecks(entity.LoadIntegrityCheck element) {
      __getInternalInterface().addArrayElement(INTEGRITYCHECKS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ParameterNameValuePairs array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToParameterNameValuePairs(entity.LoadParameter element) {
      __getInternalInterface().addArrayElement(PARAMETERNAMEVALUEPAIRS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the RowCounts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRowCounts(entity.LoadRowCount element) {
      __getInternalInterface().addArrayElement(ROWCOUNTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Steps array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToSteps(entity.LoadStep element) {
      __getInternalInterface().addArrayElement(STEPS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the UpdateDBStatisticsCommands array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToUpdateDBStatisticsCommands(entity.UpdateDBStatisticsCommand element) {
      __getInternalInterface().addArrayElement(UPDATEDBSTATISTICSCOMMANDS_PROP.get(), element);
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
     * Gets the value of the Callbacks field.
     * Timed loader callbacks.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadCallback[] getCallbacks() {
      return (entity.LoadCallback[])__getInternalInterface().getFieldValue(CALLBACKS_PROP.get());
    }
    
    /**
     * Gets the value of the CallingUser field.
     * ID of the user who executed the operation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCallingUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CALLINGUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCallingUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CALLINGUSER_PROP.get());
    }
    
    /**
     * Gets the value of the CommandType field.
     * Type of load command.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LoadCommandType getCommandType() {
      return (typekey.LoadCommandType)__getInternalInterface().getFieldValue(COMMANDTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Description field.
     * Description of the load history event.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the EncryptTables field.
     * Timed loader table columns encryptions.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadEncryptTable[] getEncryptTables() {
      return (entity.LoadEncryptTable[])__getInternalInterface().getFieldValue(ENCRYPTTABLES_PROP.get());
    }
    
    /**
     * Gets the value of the EndTime field.
     * Timestamp when the timing completed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEndTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
    }
    
    /**
     * Gets the value of the ErrorCount field.
     * Total number of integrity check errors detected for all affected tables (if applicable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getErrorCount() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ERRORCOUNT_PROP.get());
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
     * Gets the value of the InsertSelects field.
     * Timed loader insert/selects.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadInsertSelect[] getInsertSelects() {
      return (entity.LoadInsertSelect[])__getInternalInterface().getFieldValue(INSERTSELECTS_PROP.get());
    }
    
    /**
     * Gets the value of the IntegrityChecks field.
     * Timed loader integrity checks.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadIntegrityCheck[] getIntegrityChecks() {
      return (entity.LoadIntegrityCheck[])__getInternalInterface().getFieldValue(INTEGRITYCHECKS_PROP.get());
    }
    
    /**
     * 
     * @return LoadCallbacks ordered by duration descending.
     */
    public entity.LoadCallback[] getOrderedCallbacks() {
      return ((com.guidewire.pl.domain.staging.LoadCommandPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadCommandPublicMethods")).getOrderedCallbacks();
    }
    
    /**
     * 
     * @return Insert selects ordered by duration descending.
     */
    public gw.api.database.IQueryBeanResult<entity.LoadInsertSelect> getOrderedInserts() {
      return ((com.guidewire.pl.domain.staging.LoadCommandPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadCommandPublicMethods")).getOrderedInserts();
    }
    
    /**
     * 
     * @return Integrity checks ordered by duration descending.
     */
    public gw.api.database.IQueryBeanResult<entity.LoadIntegrityCheck> getOrderedIntegrityChecks() {
      return ((com.guidewire.pl.domain.staging.LoadCommandPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadCommandPublicMethods")).getOrderedIntegrityChecks();
    }
    
    /**
     * 
     * @return Row counts ordered by table name.
     */
    public gw.api.database.IQueryBeanResult<entity.LoadRowCount> getOrderedRowCounts() {
      return ((com.guidewire.pl.domain.staging.LoadCommandPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.staging.LoadCommandPublicMethods")).getOrderedRowCounts();
    }
    
    /**
     * Gets the value of the ParameterNameValuePairs field.
     * Parameter values for command.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadParameter[] getParameterNameValuePairs() {
      return (entity.LoadParameter[])__getInternalInterface().getFieldValue(PARAMETERNAMEVALUEPAIRS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RecreateIndexes field.
     * ID of batch process to recreate indexes.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRecreateIndexes() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(RECREATEINDEXES_PROP.get());
    }
    
    /**
     * Gets the value of the RowCounts field.
     * Row counts.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadRowCount[] getRowCounts() {
      return (entity.LoadRowCount[])__getInternalInterface().getFieldValue(ROWCOUNTS_PROP.get());
    }
    
    /**
     * Gets the value of the StartTime field.
     * Timestamp when the timing began.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
    }
    
    /**
     * Gets the value of the Steps field.
     * Steps.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.LoadStep[] getSteps() {
      return (entity.LoadStep[])__getInternalInterface().getFieldValue(STEPS_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateDBStatisticsCommands field.
     * UpdateDBStatisticsCommands.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.UpdateDBStatisticsCommand[] getUpdateDBStatisticsCommands() {
      return (entity.UpdateDBStatisticsCommand[])__getInternalInterface().getFieldValue(UPDATEDBSTATISTICSCOMMANDS_PROP.get());
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
     * Removes the given element from the Callbacks array. This is achieved by marking the element for removal.
     */
    public void removeFromCallbacks(entity.LoadCallback element) {
      __getInternalInterface().removeArrayElement(CALLBACKS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Callbacks array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCallbacks(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CALLBACKS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the EncryptTables array. This is achieved by marking the element for removal.
     */
    public void removeFromEncryptTables(entity.LoadEncryptTable element) {
      __getInternalInterface().removeArrayElement(ENCRYPTTABLES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the EncryptTables array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromEncryptTables(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ENCRYPTTABLES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the InsertSelects array. This is achieved by marking the element for removal.
     */
    public void removeFromInsertSelects(entity.LoadInsertSelect element) {
      __getInternalInterface().removeArrayElement(INSERTSELECTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the InsertSelects array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromInsertSelects(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INSERTSELECTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the IntegrityChecks array. This is achieved by marking the element for removal.
     */
    public void removeFromIntegrityChecks(entity.LoadIntegrityCheck element) {
      __getInternalInterface().removeArrayElement(INTEGRITYCHECKS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the IntegrityChecks array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromIntegrityChecks(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INTEGRITYCHECKS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ParameterNameValuePairs array. This is achieved by marking the element for removal.
     */
    public void removeFromParameterNameValuePairs(entity.LoadParameter element) {
      __getInternalInterface().removeArrayElement(PARAMETERNAMEVALUEPAIRS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ParameterNameValuePairs array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromParameterNameValuePairs(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PARAMETERNAMEVALUEPAIRS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the RowCounts array. This is achieved by marking the element for removal.
     */
    public void removeFromRowCounts(entity.LoadRowCount element) {
      __getInternalInterface().removeArrayElement(ROWCOUNTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the RowCounts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRowCounts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ROWCOUNTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Steps array. This is achieved by marking the element for removal.
     */
    public void removeFromSteps(entity.LoadStep element) {
      __getInternalInterface().removeArrayElement(STEPS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Steps array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromSteps(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(STEPS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the UpdateDBStatisticsCommands array. This is achieved by marking the element for removal.
     */
    public void removeFromUpdateDBStatisticsCommands(entity.UpdateDBStatisticsCommand element) {
      __getInternalInterface().removeArrayElement(UPDATEDBSTATISTICSCOMMANDS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the UpdateDBStatisticsCommands array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromUpdateDBStatisticsCommands(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(UPDATEDBSTATISTICSCOMMANDS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the Callbacks field.
     */
    public void setCallbacks(entity.LoadCallback[] value) {
      __getInternalInterface().setFieldValue(CALLBACKS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CallingUser field.
     */
    public void setCallingUser(entity.User value) {
      __getInternalInterface().setFieldValue(CALLINGUSER_PROP.get(), value);
    }
    
    public void setCallingUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CALLINGUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CommandType field.
     */
    public void setCommandType(typekey.LoadCommandType value) {
      __getInternalInterface().setFieldValue(COMMANDTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EncryptTables field.
     */
    public void setEncryptTables(entity.LoadEncryptTable[] value) {
      __getInternalInterface().setFieldValue(ENCRYPTTABLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EndTime field.
     */
    public void setEndTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENDTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ErrorCount field.
     */
    public void setErrorCount(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ERRORCOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InsertSelects field.
     */
    public void setInsertSelects(entity.LoadInsertSelect[] value) {
      __getInternalInterface().setFieldValue(INSERTSELECTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IntegrityChecks field.
     */
    public void setIntegrityChecks(entity.LoadIntegrityCheck[] value) {
      __getInternalInterface().setFieldValue(INTEGRITYCHECKS_PROP.get(), value);
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
     * Sets the value of the ParameterNameValuePairs field.
     */
    public void setParameterNameValuePairs(entity.LoadParameter[] value) {
      __getInternalInterface().setFieldValue(PARAMETERNAMEVALUEPAIRS_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RecreateIndexes field.
     */
    public void setRecreateIndexes(java.lang.Long value) {
      __getInternalInterface().setFieldValue(RECREATEINDEXES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RowCounts field.
     */
    public void setRowCounts(entity.LoadRowCount[] value) {
      __getInternalInterface().setFieldValue(ROWCOUNTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StartTime field.
     */
    public void setStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Steps field.
     */
    public void setSteps(entity.LoadStep[] value) {
      __getInternalInterface().setFieldValue(STEPS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateDBStatisticsCommands field.
     */
    public void setUpdateDBStatisticsCommands(entity.UpdateDBStatisticsCommand[] value) {
      __getInternalInterface().setFieldValue(UPDATEDBSTATISTICSCOMMANDS_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.staging.LoadCommandPublicMethods", "com.guidewire.pl.domain.staging.impl.LoadCommandImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.LoadCommand.class, config);
    com.guidewire._generated.entity.LoadCommandInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.LoadCommand, com.guidewire._generated.entity.LoadCommandInternal>() {
      public java.lang.Object getImplementation(entity.LoadCommand bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.LoadCommandInternal getInternalInterface(entity.LoadCommand bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.LoadCommand newEmptyInstance() {
        return new entity.LoadCommand((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}