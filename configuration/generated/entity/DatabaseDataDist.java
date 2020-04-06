package entity;

/**
 * DatabaseDataDist
 * Stores data distribution info in the database.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DatabaseDataDist.eti;DatabaseDataDist.eix;DatabaseDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "DatabaseDataDist")
public class DatabaseDataDist extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DatabaseDataDist> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DatabaseDataDist>("entity.DatabaseDataDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADHOCDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AdHocDistsCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ALLTABLESCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AllTablesCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPSPECIFICDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AppSpecificDistsCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARRAYDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArrayDistsCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASSIGNABLEDISTSBYDATECOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AssignableDistsByDateCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ASSIGNABLEFORKEYDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AssignableForKeyDistsCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanDistsCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BLOBDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BlobDistsCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BOOLEANCOLDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BooleanColDistsCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOBDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClobDistsCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DATADISTQUERYEXECS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "DataDistQueryExecs");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EndTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FORKEYDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ForKeyDistsCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAJORSCHEMAVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MajorSchemaVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MINORSCHEMAVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MinorSchemaVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMTHREADS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumThreads");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PLATFORMMAJORSCHEMAVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PlatformMajorSchemaVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PLATFORMMINORSCHEMAVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PlatformMinorSchemaVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STAGINGTABLEDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StagingTableDistsCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TABLEDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "TableDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TYPEKEYDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TypeKeyDistsCollected");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TYPELISTTABLEDISTSCOLLECTED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TypeListTableDistsCollected");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.DatabaseDataDistInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public DatabaseDataDist()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public DatabaseDataDist(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected DatabaseDataDist(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.DatabaseDataDistInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.DatabaseDataDistInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the given element to the DataDistQueryExecs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDataDistQueryExecs(entity.DataDistQueryExec element) {
    __getInternalInterface().addArrayElement(DATADISTQUERYEXECS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the TableDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTableDataDists(entity.TableDataDist element) {
    __getInternalInterface().addArrayElement(TABLEDATADISTS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the DataDistQueryExecs field.
   * Collection of DataDistQueryExecs linked to this DatabaseDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DataDistQueryExec[] getDataDistQueryExecs() {
    return (entity.DataDistQueryExec[])__getInternalInterface().getFieldValue(DATADISTQUERYEXECS_PROP.get());
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
   * End time of data distribution process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
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
   * Gets the value of the NumThreads field.
   * Number of threads configured to collect data distribution
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumThreads() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMTHREADS_PROP.get());
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
   * Gets the value of the StartTime field.
   * Start time of data distribution process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the TableDataDists field.
   * Collection of TableDataDists linked to this DatabaseDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist[] getTableDataDists() {
    return (entity.TableDataDist[])__getInternalInterface().getFieldValue(TABLEDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the AdHocDistsCollected field.
   * Ad hoc data distributions collected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAdHocDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ADHOCDISTSCOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the AllTablesCollected field.
   * All tables data distributions collected.  If false, a subset was specified.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAllTablesCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ALLTABLESCOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the AppSpecificDistsCollected field.
   * Application specific data distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppSpecificDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPSPECIFICDISTSCOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the ArrayDistsCollected field.
   * Array distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isArrayDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ARRAYDISTSCOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the AssignableDistsByDateCollected field.
   * Assignable data distributions by date collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAssignableDistsByDateCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ASSIGNABLEDISTSBYDATECOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the AssignableForKeyDistsCollected field.
   * Assignable Foreign Key distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAssignableForKeyDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ASSIGNABLEFORKEYDISTSCOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the BeanDistsCollected field.
   * Bean distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBeanDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(BEANDISTSCOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the BlobDistsCollected field.
   * Blob distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBlobDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(BLOBDISTSCOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the BooleanColDistsCollected field.
   * Boolean column data distributions collected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isBooleanColDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(BOOLEANCOLDISTSCOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the ClobDistsCollected field.
   * Clob distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isClobDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(CLOBDISTSCOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the ForKeyDistsCollected field.
   * ForeignKey distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isForKeyDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(FORKEYDISTSCOLLECTED_PROP.get());
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
   * Gets the value of the StagingTableDistsCollected field.
   * Staging table data distributions collected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStagingTableDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(STAGINGTABLEDISTSCOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the TypeKeyDistsCollected field.
   * TypeKey  distributions collected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTypeKeyDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(TYPEKEYDISTSCOLLECTED_PROP.get());
  }
  
  /**
   * Gets the value of the TypeListTableDistsCollected field.
   * Typelist table data distributions collected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTypeListTableDistsCollected() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(TYPELISTTABLEDISTSCOLLECTED_PROP.get());
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
   * Removes the given element from the DataDistQueryExecs array. This is achieved by marking the element for removal.
   */
  public void removeFromDataDistQueryExecs(entity.DataDistQueryExec element) {
    __getInternalInterface().removeArrayElement(DATADISTQUERYEXECS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the DataDistQueryExecs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDataDistQueryExecs(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DATADISTQUERYEXECS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the TableDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromTableDataDists(entity.TableDataDist element) {
    __getInternalInterface().removeArrayElement(TABLEDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the TableDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTableDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(TABLEDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AdHocDistsCollected field.
   */
  public void setAdHocDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ADHOCDISTSCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AllTablesCollected field.
   */
  public void setAllTablesCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ALLTABLESCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AppSpecificDistsCollected field.
   */
  public void setAppSpecificDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(APPSPECIFICDISTSCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArrayDistsCollected field.
   */
  public void setArrayDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ARRAYDISTSCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignableDistsByDateCollected field.
   */
  public void setAssignableDistsByDateCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ASSIGNABLEDISTSBYDATECOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignableForKeyDistsCollected field.
   */
  public void setAssignableForKeyDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ASSIGNABLEFORKEYDISTSCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanDistsCollected field.
   */
  public void setBeanDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(BEANDISTSCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BlobDistsCollected field.
   */
  public void setBlobDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(BLOBDISTSCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BooleanColDistsCollected field.
   */
  public void setBooleanColDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(BOOLEANCOLDISTSCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClobDistsCollected field.
   */
  public void setClobDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(CLOBDISTSCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DataDistQueryExecs field.
   */
  public void setDataDistQueryExecs(entity.DataDistQueryExec[] value) {
    __getInternalInterface().setFieldValue(DATADISTQUERYEXECS_PROP.get(), value);
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
   * Sets the value of the ForKeyDistsCollected field.
   */
  public void setForKeyDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(FORKEYDISTSCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
   * Sets the value of the NumThreads field.
   */
  public void setNumThreads(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NUMTHREADS_PROP.get(), value);
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
   * Sets the value of the StagingTableDistsCollected field.
   */
  public void setStagingTableDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(STAGINGTABLEDISTSCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TableDataDists field.
   */
  public void setTableDataDists(entity.TableDataDist[] value) {
    __getInternalInterface().setFieldValue(TABLEDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TypeKeyDistsCollected field.
   */
  public void setTypeKeyDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(TYPEKEYDISTSCOLLECTED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TypeListTableDistsCollected field.
   */
  public void setTypeListTableDistsCollected(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(TYPELISTTABLEDISTSCOLLECTED_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DatabaseDataDistInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.DatabaseDataDist.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the DataDistQueryExecs array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDataDistQueryExecs(entity.DataDistQueryExec element) {
      __getInternalInterface().addArrayElement(DATADISTQUERYEXECS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the TableDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTableDataDists(entity.TableDataDist element) {
      __getInternalInterface().addArrayElement(TABLEDATADISTS_PROP.get(), element);
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
    
    public entity.TableDataDist[] getAdminPlatformTableDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods")).getAdminPlatformTableDataDistsOrderedByName();
    }
    
    /**
     * Gets the value of the DataDistQueryExecs field.
     * Collection of DataDistQueryExecs linked to this DatabaseDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DataDistQueryExec[] getDataDistQueryExecs() {
      return (entity.DataDistQueryExec[])__getInternalInterface().getFieldValue(DATADISTQUERYEXECS_PROP.get());
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
     * End time of data distribution process.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEndTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENDTIME_PROP.get());
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
     * Gets the value of the NumThreads field.
     * Number of threads configured to collect data distribution
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNumThreads() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NUMTHREADS_PROP.get());
    }
    
    public entity.TableDataDist[] getParentDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods")).getParentDataDistsOrderedByName();
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
    
    public entity.TableDataDist[] getStagingTableDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods")).getStagingTableDataDistsOrderedByName();
    }
    
    /**
     * Gets the value of the StartTime field.
     * Start time of data distribution process.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStartTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
    }
    
    public entity.TableDataDist getTableDataDistByName(java.lang.String tableName) {
      return ((com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods")).getTableDataDistByName(tableName);
    }
    
    public entity.TableDataDist getTableDataDistByNameAndEntity(java.lang.String tableName, java.lang.String entityName) {
      return ((com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods")).getTableDataDistByNameAndEntity(tableName, entityName);
    }
    
    /**
     * Gets the value of the TableDataDists field.
     * Collection of TableDataDists linked to this DatabaseDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TableDataDist[] getTableDataDists() {
      return (entity.TableDataDist[])__getInternalInterface().getFieldValue(TABLEDATADISTS_PROP.get());
    }
    
    public entity.TableDataDist[] getTableDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods")).getTableDataDistsOrderedByName();
    }
    
    public entity.TableDataDist[] getTypeListDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods")).getTypeListDataDistsOrderedByName();
    }
    
    public entity.TableDataDist[] getUserTableDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods")).getUserTableDataDistsOrderedByName();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the AdHocDistsCollected field.
     * Ad hoc data distributions collected
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAdHocDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ADHOCDISTSCOLLECTED_PROP.get());
    }
    
    /**
     * Gets the value of the AllTablesCollected field.
     * All tables data distributions collected.  If false, a subset was specified.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAllTablesCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ALLTABLESCOLLECTED_PROP.get());
    }
    
    /**
     * Gets the value of the AppSpecificDistsCollected field.
     * Application specific data distributions collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAppSpecificDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(APPSPECIFICDISTSCOLLECTED_PROP.get());
    }
    
    /**
     * Gets the value of the ArrayDistsCollected field.
     * Array distributions collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isArrayDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ARRAYDISTSCOLLECTED_PROP.get());
    }
    
    /**
     * Gets the value of the AssignableDistsByDateCollected field.
     * Assignable data distributions by date collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAssignableDistsByDateCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ASSIGNABLEDISTSBYDATECOLLECTED_PROP.get());
    }
    
    /**
     * Gets the value of the AssignableForKeyDistsCollected field.
     * Assignable Foreign Key distributions collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAssignableForKeyDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ASSIGNABLEFORKEYDISTSCOLLECTED_PROP.get());
    }
    
    /**
     * Gets the value of the BeanDistsCollected field.
     * Bean distributions collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isBeanDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(BEANDISTSCOLLECTED_PROP.get());
    }
    
    /**
     * Gets the value of the BlobDistsCollected field.
     * Blob distributions collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isBlobDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(BLOBDISTSCOLLECTED_PROP.get());
    }
    
    /**
     * Gets the value of the BooleanColDistsCollected field.
     * Boolean column data distributions collected
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isBooleanColDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(BOOLEANCOLDISTSCOLLECTED_PROP.get());
    }
    
    /**
     * Gets the value of the ClobDistsCollected field.
     * Clob distributions collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isClobDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(CLOBDISTSCOLLECTED_PROP.get());
    }
    
    /**
     * Gets the value of the ForKeyDistsCollected field.
     * ForeignKey distributions collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isForKeyDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(FORKEYDISTSCOLLECTED_PROP.get());
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
     * Gets the value of the StagingTableDistsCollected field.
     * Staging table data distributions collected
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isStagingTableDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(STAGINGTABLEDISTSCOLLECTED_PROP.get());
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the TypeKeyDistsCollected field.
     * TypeKey  distributions collected.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isTypeKeyDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(TYPEKEYDISTSCOLLECTED_PROP.get());
    }
    
    /**
     * Gets the value of the TypeListTableDistsCollected field.
     * Typelist table data distributions collected
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isTypeListTableDistsCollected() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(TYPELISTTABLEDISTSCOLLECTED_PROP.get());
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
     * Removes the given element from the DataDistQueryExecs array. This is achieved by marking the element for removal.
     */
    public void removeFromDataDistQueryExecs(entity.DataDistQueryExec element) {
      __getInternalInterface().removeArrayElement(DATADISTQUERYEXECS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the DataDistQueryExecs array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDataDistQueryExecs(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DATADISTQUERYEXECS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the TableDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromTableDataDists(entity.TableDataDist element) {
      __getInternalInterface().removeArrayElement(TABLEDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the TableDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTableDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TABLEDATADISTS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AdHocDistsCollected field.
     */
    public void setAdHocDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ADHOCDISTSCOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AllTablesCollected field.
     */
    public void setAllTablesCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ALLTABLESCOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AppSpecificDistsCollected field.
     */
    public void setAppSpecificDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(APPSPECIFICDISTSCOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArrayDistsCollected field.
     */
    public void setArrayDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ARRAYDISTSCOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignableDistsByDateCollected field.
     */
    public void setAssignableDistsByDateCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ASSIGNABLEDISTSBYDATECOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignableForKeyDistsCollected field.
     */
    public void setAssignableForKeyDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ASSIGNABLEFORKEYDISTSCOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanDistsCollected field.
     */
    public void setBeanDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(BEANDISTSCOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BlobDistsCollected field.
     */
    public void setBlobDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(BLOBDISTSCOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BooleanColDistsCollected field.
     */
    public void setBooleanColDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(BOOLEANCOLDISTSCOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClobDistsCollected field.
     */
    public void setClobDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(CLOBDISTSCOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DataDistQueryExecs field.
     */
    public void setDataDistQueryExecs(entity.DataDistQueryExec[] value) {
      __getInternalInterface().setFieldValue(DATADISTQUERYEXECS_PROP.get(), value);
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
     * Sets the value of the ForKeyDistsCollected field.
     */
    public void setForKeyDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(FORKEYDISTSCOLLECTED_PROP.get(), value);
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
     * Sets the value of the NumThreads field.
     */
    public void setNumThreads(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NUMTHREADS_PROP.get(), value);
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
     * Sets the value of the StagingTableDistsCollected field.
     */
    public void setStagingTableDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(STAGINGTABLEDISTSCOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StartTime field.
     */
    public void setStartTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TableDataDists field.
     */
    public void setTableDataDists(entity.TableDataDist[] value) {
      __getInternalInterface().setFieldValue(TABLEDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TypeKeyDistsCollected field.
     */
    public void setTypeKeyDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(TYPEKEYDISTSCOLLECTED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TypeListTableDistsCollected field.
     */
    public void setTypeListTableDistsCollected(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(TYPELISTTABLEDISTSCOLLECTED_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.database.impl.DatabaseDataDistInternalMethods", "com.guidewire.pl.domain.database.impl.DatabaseDataDistImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.DatabaseDataDist.class, config);
    com.guidewire._generated.entity.DatabaseDataDistInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.DatabaseDataDist, com.guidewire._generated.entity.DatabaseDataDistInternal>() {
      public java.lang.Object getImplementation(entity.DatabaseDataDist bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DatabaseDataDistInternal getInternalInterface(entity.DatabaseDataDist bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.DatabaseDataDist newEmptyInstance() {
        return new entity.DatabaseDataDist((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}