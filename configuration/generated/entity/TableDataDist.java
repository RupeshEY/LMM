package entity;

/**
 * TableDataDist
 * Stores data distribution info for each table in the database.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TableDataDist.eti;TableDataDist.eix;TableDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TableDataDist")
public class TableDataDist extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TableDataDist> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TableDataDist>("entity.TableDataDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADMINTABLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AdminTable");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ARRAYDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ArrayDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ASSIGNABLEFORKEYDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "AssignableForKeyDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> BEANVERSIONDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "BeanVersionDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> BLOBCOLDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "BlobColDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> BOOLEANCOLDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "BooleanColDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CLOBCOLDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ClobColDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CUSTOMDATADISTREQUESTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CustomDataDistRequests");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DATABASEDATADIST_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "DatabaseDataDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DATEANALYSISDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "DateAnalysisDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DATEBINNEDDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "DateBinnedDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DATESPANDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "DateSpanDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENTITYNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EntityName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> FORKEYDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ForKeyDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> GENERICGROUPDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "GenericGroupDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> HOURANALYSISDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "HourAnalysisDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> NULLABLECOLUMNDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "NullableColumnDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMLOADEDTHRUSTAGINGTABLES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumLoadedThruStagingTables");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMRETIREDROWS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumRetiredRows");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMROWS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumRows");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMUPDATEDROWS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumUpdatedRows");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMUPDATES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumUpdates");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PARENTTABLEDATADIST_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ParentTableDataDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PLATFORMTABLE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PlatformTable");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STAGINGTABLEDIST_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StagingTableDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TABLEDATADISTPARENTARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "TableDataDistParentArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TABLENAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TableName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TYPEKEYDATADISTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "TypeKeyDataDists");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TYPELISTTABLEDIST_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TypeListTableDist");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TableDataDistInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TableDataDist()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TableDataDist(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TableDataDist(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TableDataDistInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TableDataDistInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  public void addAllSubTypeDistributions(java.util.Collection<entity.TableDataDist> allSubtypeDistributions) {
    ((com.guidewire.pl.domain.database.TableDataDistPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.TableDataDistPublicMethods")).addAllSubTypeDistributions(allSubtypeDistributions);
  }
  
  /**
   * Adds the given element to the ArrayDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToArrayDataDists(entity.ArrayDataDist element) {
    __getInternalInterface().addArrayElement(ARRAYDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the AssignableForKeyDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAssignableForKeyDataDists(entity.AssignableForKeyDataDist element) {
    __getInternalInterface().addArrayElement(ASSIGNABLEFORKEYDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the BeanVersionDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBeanVersionDataDists(entity.BeanVersionDataDist element) {
    __getInternalInterface().addArrayElement(BEANVERSIONDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the BlobColDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBlobColDataDists(entity.BlobColDataDist element) {
    __getInternalInterface().addArrayElement(BLOBCOLDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the BooleanColDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBooleanColDataDists(entity.BooleanColDataDist element) {
    __getInternalInterface().addArrayElement(BOOLEANCOLDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ClobColDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClobColDataDists(entity.ClobColDataDist element) {
    __getInternalInterface().addArrayElement(CLOBCOLDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the CustomDataDistRequests array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCustomDataDistRequests(entity.CustomDataDistRequest element) {
    __getInternalInterface().addArrayElement(CUSTOMDATADISTREQUESTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the DateAnalysisDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDateAnalysisDataDists(entity.DateAnalysisDataDist element) {
    __getInternalInterface().addArrayElement(DATEANALYSISDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the DateBinnedDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDateBinnedDataDists(entity.DateBinnedDataDist element) {
    __getInternalInterface().addArrayElement(DATEBINNEDDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the DateSpanDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDateSpanDataDists(entity.DateSpanDataDist element) {
    __getInternalInterface().addArrayElement(DATESPANDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ForKeyDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToForKeyDataDists(entity.ForKeyDataDist element) {
    __getInternalInterface().addArrayElement(FORKEYDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the GenericGroupDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToGenericGroupDataDists(entity.GenericGroupDataDist element) {
    __getInternalInterface().addArrayElement(GENERICGROUPDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the HourAnalysisDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToHourAnalysisDataDists(entity.HourAnalysisDataDist element) {
    __getInternalInterface().addArrayElement(HOURANALYSISDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the NullableColumnDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToNullableColumnDataDists(entity.NullableColumnDataDist element) {
    __getInternalInterface().addArrayElement(NULLABLECOLUMNDATADISTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the TypeKeyDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTypeKeyDataDists(entity.TypeKeyDataDist element) {
    __getInternalInterface().addArrayElement(TYPEKEYDATADISTS_PROP.get(), element);
  }
  
  /**
   * Gets the value of the ArrayDataDists field.
   * Collection of ArrayDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ArrayDataDist[] getArrayDataDists() {
    return (entity.ArrayDataDist[])__getInternalInterface().getFieldValue(ARRAYDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the AssignableForKeyDataDists field.
   * Collection of AssignableForKeyDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableForKeyDataDist[] getAssignableForKeyDataDists() {
    return (entity.AssignableForKeyDataDist[])__getInternalInterface().getFieldValue(ASSIGNABLEFORKEYDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the BeanVersionDataDists field.
   * Collection of BeanVersionDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BeanVersionDataDist[] getBeanVersionDataDists() {
    return (entity.BeanVersionDataDist[])__getInternalInterface().getFieldValue(BEANVERSIONDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the BlobColDataDists field.
   * Collection of BlobColDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BlobColDataDist[] getBlobColDataDists() {
    return (entity.BlobColDataDist[])__getInternalInterface().getFieldValue(BLOBCOLDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the BooleanColDataDists field.
   * Collection of BooleanColDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BooleanColDataDist[] getBooleanColDataDists() {
    return (entity.BooleanColDataDist[])__getInternalInterface().getFieldValue(BOOLEANCOLDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the ClobColDataDists field.
   * Collection of ClobColDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClobColDataDist[] getClobColDataDists() {
    return (entity.ClobColDataDist[])__getInternalInterface().getFieldValue(CLOBCOLDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the CustomDataDistRequests field.
   * Collection of CustomDataDistRequests linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CustomDataDistRequest[] getCustomDataDistRequests() {
    return (entity.CustomDataDistRequest[])__getInternalInterface().getFieldValue(CUSTOMDATADISTREQUESTS_PROP.get());
  }
  
  /**
   * Gets the value of the DatabaseDataDist field.
   * DatabaseDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DatabaseDataDist getDatabaseDataDist() {
    return (entity.DatabaseDataDist)__getInternalInterface().getFieldValue(DATABASEDATADIST_PROP.get());
  }
  
  /**
   * Gets the value of the DateAnalysisDataDists field.
   * Collection of DateAnalysisDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateAnalysisDataDist[] getDateAnalysisDataDists() {
    return (entity.DateAnalysisDataDist[])__getInternalInterface().getFieldValue(DATEANALYSISDATADISTS_PROP.get());
  }
  
  /**
   * 
   * @return TreeMap of DateAnalysisDataDists by ColumnName
   */
  public java.util.TreeMap<java.lang.String, java.util.List<entity.DateAnalysisDataDist>> getDateAnalysisDataDistsByColumnName() {
    return ((com.guidewire.pl.domain.database.TableDataDistPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.TableDataDistPublicMethods")).getDateAnalysisDataDistsByColumnName();
  }
  
  /**
   * Gets the value of the DateBinnedDataDists field.
   * Collection of DateBinnedDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateBinnedDataDist[] getDateBinnedDataDists() {
    return (entity.DateBinnedDataDist[])__getInternalInterface().getFieldValue(DATEBINNEDDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the DateSpanDataDists field.
   * Collection of min and max dates for all date columns in this table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateSpanDataDist[] getDateSpanDataDists() {
    return (entity.DateSpanDataDist[])__getInternalInterface().getFieldValue(DATESPANDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the EntityName field.
   * Name of entity.  Can be subtype entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEntityName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ENTITYNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ForKeyDataDists field.
   * Collection of ForKeyDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ForKeyDataDist[] getForKeyDataDists() {
    return (entity.ForKeyDataDist[])__getInternalInterface().getFieldValue(FORKEYDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the GenericGroupDataDists field.
   * Collection of GenericGroupDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GenericGroupDataDist[] getGenericGroupDataDists() {
    return (entity.GenericGroupDataDist[])__getInternalInterface().getFieldValue(GENERICGROUPDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the HourAnalysisDataDists field.
   * Collection of HourAnalysisDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.HourAnalysisDataDist[] getHourAnalysisDataDists() {
    return (entity.HourAnalysisDataDist[])__getInternalInterface().getFieldValue(HOURANALYSISDATADISTS_PROP.get());
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
   * Gets the value of the NullableColumnDataDists field.
   * Collection of NullableColumnDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.NullableColumnDataDist[] getNullableColumnDataDists() {
    return (entity.NullableColumnDataDist[])__getInternalInterface().getFieldValue(NULLABLECOLUMNDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the NumLoadedThruStagingTables field.
   * Count of # of rows loaded through the staging tables. (null if non-loadable)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumLoadedThruStagingTables() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(NUMLOADEDTHRUSTAGINGTABLES_PROP.get());
  }
  
  /**
   * Gets the value of the NumRetiredRows field.
   * Count of # of retired rows. (null if non-retireable)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumRetiredRows() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(NUMRETIREDROWS_PROP.get());
  }
  
  /**
   * Gets the value of the NumRows field.
   * Count of # of rows.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumRows() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(NUMROWS_PROP.get());
  }
  
  /**
   * 
   * @param columnName 
   * @param yearMonthString 
   * @return # of rows for the specified columnName in the specified year/month, derived from the daily data distribution
   */
  public java.lang.Long getNumRowsFromDateAnalysis(java.lang.String columnName, java.lang.String yearMonthString) {
    return ((com.guidewire.pl.domain.database.TableDataDistPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.TableDataDistPublicMethods")).getNumRowsFromDateAnalysis(columnName, yearMonthString);
  }
  
  /**
   * Gets the value of the NumUpdatedRows field.
   * Count of # of updated rows.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumUpdatedRows() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(NUMUPDATEDROWS_PROP.get());
  }
  
  /**
   * Gets the value of the NumUpdates field.
   * Count of # of total updates.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumUpdates() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(NUMUPDATES_PROP.get());
  }
  
  /**
   * Gets the value of the ParentTableDataDist field.
   * For subtype tables, points to the parent table's data distribution.  Otherwise, this is null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getParentTableDataDist() {
    return (entity.TableDataDist)__getInternalInterface().getFieldValue(PARENTTABLEDATADIST_PROP.get());
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
  public entity.TableDataDistParent[] getTableDataDistParentArray() {
    return (entity.TableDataDistParent[])__getInternalInterface().getFieldValue(TABLEDATADISTPARENTARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the TableName field.
   * Name of table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TABLENAME_PROP.get());
  }
  
  /**
   * Gets the value of the TypeKeyDataDists field.
   * Collection of TypeKeyDataDists linked to this TableDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TypeKeyDataDist[] getTypeKeyDataDists() {
    return (entity.TypeKeyDataDist[])__getInternalInterface().getFieldValue(TYPEKEYDATADISTS_PROP.get());
  }
  
  /**
   * Gets the value of the AdminTable field.
   * True if admin table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAdminTable() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ADMINTABLE_PROP.get());
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
   * Gets the value of the PlatformTable field.
   * True if platform table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPlatformTable() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PLATFORMTABLE_PROP.get());
  }
  
  /**
   * Gets the value of the StagingTableDist field.
   * True if staging table distribution
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isStagingTableDist() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(STAGINGTABLEDIST_PROP.get());
  }
  
  /**
   * Gets the value of the TypeListTableDist field.
   * True if type list table distribution
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTypeListTableDist() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(TYPELISTTABLEDIST_PROP.get());
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
   * Removes the given element from the ArrayDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromArrayDataDists(entity.ArrayDataDist element) {
    __getInternalInterface().removeArrayElement(ARRAYDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ArrayDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromArrayDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ARRAYDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the AssignableForKeyDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromAssignableForKeyDataDists(entity.AssignableForKeyDataDist element) {
    __getInternalInterface().removeArrayElement(ASSIGNABLEFORKEYDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the AssignableForKeyDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAssignableForKeyDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(ASSIGNABLEFORKEYDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the BeanVersionDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromBeanVersionDataDists(entity.BeanVersionDataDist element) {
    __getInternalInterface().removeArrayElement(BEANVERSIONDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the BeanVersionDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBeanVersionDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(BEANVERSIONDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the BlobColDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromBlobColDataDists(entity.BlobColDataDist element) {
    __getInternalInterface().removeArrayElement(BLOBCOLDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the BlobColDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBlobColDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(BLOBCOLDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the BooleanColDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromBooleanColDataDists(entity.BooleanColDataDist element) {
    __getInternalInterface().removeArrayElement(BOOLEANCOLDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the BooleanColDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBooleanColDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(BOOLEANCOLDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ClobColDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromClobColDataDists(entity.ClobColDataDist element) {
    __getInternalInterface().removeArrayElement(CLOBCOLDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ClobColDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClobColDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CLOBCOLDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the CustomDataDistRequests array. This is achieved by marking the element for removal.
   */
  public void removeFromCustomDataDistRequests(entity.CustomDataDistRequest element) {
    __getInternalInterface().removeArrayElement(CUSTOMDATADISTREQUESTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the CustomDataDistRequests array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCustomDataDistRequests(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(CUSTOMDATADISTREQUESTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the DateAnalysisDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromDateAnalysisDataDists(entity.DateAnalysisDataDist element) {
    __getInternalInterface().removeArrayElement(DATEANALYSISDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the DateAnalysisDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDateAnalysisDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DATEANALYSISDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the DateBinnedDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromDateBinnedDataDists(entity.DateBinnedDataDist element) {
    __getInternalInterface().removeArrayElement(DATEBINNEDDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the DateBinnedDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDateBinnedDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DATEBINNEDDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the DateSpanDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromDateSpanDataDists(entity.DateSpanDataDist element) {
    __getInternalInterface().removeArrayElement(DATESPANDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the DateSpanDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDateSpanDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DATESPANDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ForKeyDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromForKeyDataDists(entity.ForKeyDataDist element) {
    __getInternalInterface().removeArrayElement(FORKEYDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ForKeyDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromForKeyDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(FORKEYDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the GenericGroupDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromGenericGroupDataDists(entity.GenericGroupDataDist element) {
    __getInternalInterface().removeArrayElement(GENERICGROUPDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the GenericGroupDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromGenericGroupDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(GENERICGROUPDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the HourAnalysisDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromHourAnalysisDataDists(entity.HourAnalysisDataDist element) {
    __getInternalInterface().removeArrayElement(HOURANALYSISDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the HourAnalysisDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromHourAnalysisDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(HOURANALYSISDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the NullableColumnDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromNullableColumnDataDists(entity.NullableColumnDataDist element) {
    __getInternalInterface().removeArrayElement(NULLABLECOLUMNDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the NullableColumnDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromNullableColumnDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(NULLABLECOLUMNDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the TypeKeyDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromTypeKeyDataDists(entity.TypeKeyDataDist element) {
    __getInternalInterface().removeArrayElement(TYPEKEYDATADISTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the TypeKeyDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTypeKeyDataDists(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(TYPEKEYDATADISTS_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the AdminTable field.
   */
  public void setAdminTable(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ADMINTABLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArrayDataDists field.
   */
  public void setArrayDataDists(entity.ArrayDataDist[] value) {
    __getInternalInterface().setFieldValue(ARRAYDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AssignableForKeyDataDists field.
   */
  public void setAssignableForKeyDataDists(entity.AssignableForKeyDataDist[] value) {
    __getInternalInterface().setFieldValue(ASSIGNABLEFORKEYDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersionDataDists field.
   */
  public void setBeanVersionDataDists(entity.BeanVersionDataDist[] value) {
    __getInternalInterface().setFieldValue(BEANVERSIONDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BlobColDataDists field.
   */
  public void setBlobColDataDists(entity.BlobColDataDist[] value) {
    __getInternalInterface().setFieldValue(BLOBCOLDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BooleanColDataDists field.
   */
  public void setBooleanColDataDists(entity.BooleanColDataDist[] value) {
    __getInternalInterface().setFieldValue(BOOLEANCOLDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClobColDataDists field.
   */
  public void setClobColDataDists(entity.ClobColDataDist[] value) {
    __getInternalInterface().setFieldValue(CLOBCOLDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CustomDataDistRequests field.
   */
  public void setCustomDataDistRequests(entity.CustomDataDistRequest[] value) {
    __getInternalInterface().setFieldValue(CUSTOMDATADISTREQUESTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DatabaseDataDist field.
   */
  public void setDatabaseDataDist(entity.DatabaseDataDist value) {
    __getInternalInterface().setFieldValue(DATABASEDATADIST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateAnalysisDataDists field.
   */
  public void setDateAnalysisDataDists(entity.DateAnalysisDataDist[] value) {
    __getInternalInterface().setFieldValue(DATEANALYSISDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateBinnedDataDists field.
   */
  public void setDateBinnedDataDists(entity.DateBinnedDataDist[] value) {
    __getInternalInterface().setFieldValue(DATEBINNEDDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateSpanDataDists field.
   */
  public void setDateSpanDataDists(entity.DateSpanDataDist[] value) {
    __getInternalInterface().setFieldValue(DATESPANDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EntityName field.
   */
  public void setEntityName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ENTITYNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ForKeyDataDists field.
   */
  public void setForKeyDataDists(entity.ForKeyDataDist[] value) {
    __getInternalInterface().setFieldValue(FORKEYDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the GenericGroupDataDists field.
   */
  public void setGenericGroupDataDists(entity.GenericGroupDataDist[] value) {
    __getInternalInterface().setFieldValue(GENERICGROUPDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the HourAnalysisDataDists field.
   */
  public void setHourAnalysisDataDists(entity.HourAnalysisDataDist[] value) {
    __getInternalInterface().setFieldValue(HOURANALYSISDATADISTS_PROP.get(), value);
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
   * Sets the value of the NullableColumnDataDists field.
   */
  public void setNullableColumnDataDists(entity.NullableColumnDataDist[] value) {
    __getInternalInterface().setFieldValue(NULLABLECOLUMNDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NumLoadedThruStagingTables field.
   */
  public void setNumLoadedThruStagingTables(java.lang.Long value) {
    __getInternalInterface().setFieldValue(NUMLOADEDTHRUSTAGINGTABLES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NumRetiredRows field.
   */
  public void setNumRetiredRows(java.lang.Long value) {
    __getInternalInterface().setFieldValue(NUMRETIREDROWS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NumRows field.
   */
  public void setNumRows(java.lang.Long value) {
    __getInternalInterface().setFieldValue(NUMROWS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NumUpdatedRows field.
   */
  public void setNumUpdatedRows(java.lang.Long value) {
    __getInternalInterface().setFieldValue(NUMUPDATEDROWS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NumUpdates field.
   */
  public void setNumUpdates(java.lang.Long value) {
    __getInternalInterface().setFieldValue(NUMUPDATES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ParentTableDataDist field.
   */
  public void setParentTableDataDist(entity.TableDataDist value) {
    __getInternalInterface().setFieldValue(PARENTTABLEDATADIST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PlatformTable field.
   */
  public void setPlatformTable(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PLATFORMTABLE_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the StagingTableDist field.
   */
  public void setStagingTableDist(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(STAGINGTABLEDIST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TableDataDistParentArray field.
   */
  private void setTableDataDistParentArray(entity.TableDataDistParent[] value) {
    __getInternalInterface().setFieldValue(TABLEDATADISTPARENTARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TABLENAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TypeKeyDataDists field.
   */
  public void setTypeKeyDataDists(entity.TypeKeyDataDist[] value) {
    __getInternalInterface().setFieldValue(TYPEKEYDATADISTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TypeListTableDist field.
   */
  public void setTypeListTableDist(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(TYPELISTTABLEDIST_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TableDataDistInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TableDataDist.this.__getDelegateManager();
    }
    
    public void addAllSubTypeDistributions(java.util.Collection<entity.TableDataDist> allSubtypeDistributions) {
      ((com.guidewire.pl.domain.database.TableDataDistPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.TableDataDistPublicMethods")).addAllSubTypeDistributions(allSubtypeDistributions);
    }
    
    /**
     * Adds the given element to the ArrayDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToArrayDataDists(entity.ArrayDataDist element) {
      __getInternalInterface().addArrayElement(ARRAYDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the AssignableForKeyDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToAssignableForKeyDataDists(entity.AssignableForKeyDataDist element) {
      __getInternalInterface().addArrayElement(ASSIGNABLEFORKEYDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the BeanVersionDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToBeanVersionDataDists(entity.BeanVersionDataDist element) {
      __getInternalInterface().addArrayElement(BEANVERSIONDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the BlobColDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToBlobColDataDists(entity.BlobColDataDist element) {
      __getInternalInterface().addArrayElement(BLOBCOLDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the BooleanColDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToBooleanColDataDists(entity.BooleanColDataDist element) {
      __getInternalInterface().addArrayElement(BOOLEANCOLDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ClobColDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToClobColDataDists(entity.ClobColDataDist element) {
      __getInternalInterface().addArrayElement(CLOBCOLDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the CustomDataDistRequests array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCustomDataDistRequests(entity.CustomDataDistRequest element) {
      __getInternalInterface().addArrayElement(CUSTOMDATADISTREQUESTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the DateAnalysisDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDateAnalysisDataDists(entity.DateAnalysisDataDist element) {
      __getInternalInterface().addArrayElement(DATEANALYSISDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the DateBinnedDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDateBinnedDataDists(entity.DateBinnedDataDist element) {
      __getInternalInterface().addArrayElement(DATEBINNEDDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the DateSpanDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDateSpanDataDists(entity.DateSpanDataDist element) {
      __getInternalInterface().addArrayElement(DATESPANDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ForKeyDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToForKeyDataDists(entity.ForKeyDataDist element) {
      __getInternalInterface().addArrayElement(FORKEYDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the GenericGroupDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToGenericGroupDataDists(entity.GenericGroupDataDist element) {
      __getInternalInterface().addArrayElement(GENERICGROUPDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the HourAnalysisDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToHourAnalysisDataDists(entity.HourAnalysisDataDist element) {
      __getInternalInterface().addArrayElement(HOURANALYSISDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the NullableColumnDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToNullableColumnDataDists(entity.NullableColumnDataDist element) {
      __getInternalInterface().addArrayElement(NULLABLECOLUMNDATADISTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the TableDataDistParentArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTableDataDistParentArray(entity.TableDataDistParent element) {
      __getInternalInterface().addArrayElement(TABLEDATADISTPARENTARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the TypeKeyDataDists array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTypeKeyDataDists(entity.TypeKeyDataDist element) {
      __getInternalInterface().addArrayElement(TYPEKEYDATADISTS_PROP.get(), element);
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
    
    public entity.ArrayDataDist getArrayDataDistByName(java.lang.String arrayName) {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getArrayDataDistByName(arrayName);
    }
    
    /**
     * Gets the value of the ArrayDataDists field.
     * Collection of ArrayDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ArrayDataDist[] getArrayDataDists() {
      return (entity.ArrayDataDist[])__getInternalInterface().getFieldValue(ARRAYDATADISTS_PROP.get());
    }
    
    public entity.ArrayDataDist[] getArrayDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getArrayDataDistsOrderedByName();
    }
    
    /**
     * Gets the value of the AssignableForKeyDataDists field.
     * Collection of AssignableForKeyDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.AssignableForKeyDataDist[] getAssignableForKeyDataDists() {
      return (entity.AssignableForKeyDataDist[])__getInternalInterface().getFieldValue(ASSIGNABLEFORKEYDATADISTS_PROP.get());
    }
    
    public entity.AssignableForKeyDataDist[] getAssignableForKeyDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getAssignableForKeyDataDistsOrderedByName();
    }
    
    /**
     * Gets the value of the BeanVersionDataDists field.
     * Collection of BeanVersionDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BeanVersionDataDist[] getBeanVersionDataDists() {
      return (entity.BeanVersionDataDist[])__getInternalInterface().getFieldValue(BEANVERSIONDATADISTS_PROP.get());
    }
    
    /**
     * Gets the value of the BlobColDataDists field.
     * Collection of BlobColDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BlobColDataDist[] getBlobColDataDists() {
      return (entity.BlobColDataDist[])__getInternalInterface().getFieldValue(BLOBCOLDATADISTS_PROP.get());
    }
    
    public entity.BlobColDataDist[] getBlobColDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getBlobColDataDistsOrderedByName();
    }
    
    /**
     * Gets the value of the BooleanColDataDists field.
     * Collection of BooleanColDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BooleanColDataDist[] getBooleanColDataDists() {
      return (entity.BooleanColDataDist[])__getInternalInterface().getFieldValue(BOOLEANCOLDATADISTS_PROP.get());
    }
    
    public entity.BooleanColDataDist[] getBooleanColDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getBooleanColDataDistsOrderedByName();
    }
    
    /**
     * Gets the value of the ClobColDataDists field.
     * Collection of ClobColDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClobColDataDist[] getClobColDataDists() {
      return (entity.ClobColDataDist[])__getInternalInterface().getFieldValue(CLOBCOLDATADISTS_PROP.get());
    }
    
    public entity.ClobColDataDist[] getClobColDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getClobColDataDistsOrderedByName();
    }
    
    /**
     * Gets the value of the CustomDataDistRequests field.
     * Collection of CustomDataDistRequests linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CustomDataDistRequest[] getCustomDataDistRequests() {
      return (entity.CustomDataDistRequest[])__getInternalInterface().getFieldValue(CUSTOMDATADISTREQUESTS_PROP.get());
    }
    
    /**
     * Gets the value of the DatabaseDataDist field.
     * DatabaseDataDist for this object.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DatabaseDataDist getDatabaseDataDist() {
      return (entity.DatabaseDataDist)__getInternalInterface().getFieldValue(DATABASEDATADIST_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDatabaseDataDistID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DATABASEDATADIST_PROP.get());
    }
    
    /**
     * Gets the value of the DateAnalysisDataDists field.
     * Collection of DateAnalysisDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DateAnalysisDataDist[] getDateAnalysisDataDists() {
      return (entity.DateAnalysisDataDist[])__getInternalInterface().getFieldValue(DATEANALYSISDATADISTS_PROP.get());
    }
    
    /**
     * 
     * @return TreeMap of DateAnalysisDataDists by ColumnName
     */
    public java.util.TreeMap<java.lang.String, java.util.List<entity.DateAnalysisDataDist>> getDateAnalysisDataDistsByColumnName() {
      return ((com.guidewire.pl.domain.database.TableDataDistPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.TableDataDistPublicMethods")).getDateAnalysisDataDistsByColumnName();
    }
    
    public entity.DateAnalysisDataDist[] getDateAnalysisDataDistsOrderedByYearAndMonth() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getDateAnalysisDataDistsOrderedByYearAndMonth();
    }
    
    /**
     * Gets the value of the DateBinnedDataDists field.
     * Collection of DateBinnedDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DateBinnedDataDist[] getDateBinnedDataDists() {
      return (entity.DateBinnedDataDist[])__getInternalInterface().getFieldValue(DATEBINNEDDATADISTS_PROP.get());
    }
    
    public entity.DateBinnedDataDist[] getDateBinnedDataDistsOrderedByValueColumnName() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getDateBinnedDataDistsOrderedByValueColumnName();
    }
    
    /**
     * Gets the value of the DateSpanDataDists field.
     * Collection of min and max dates for all date columns in this table
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.DateSpanDataDist[] getDateSpanDataDists() {
      return (entity.DateSpanDataDist[])__getInternalInterface().getFieldValue(DATESPANDATADISTS_PROP.get());
    }
    
    /**
     * Gets the value of the EntityName field.
     * Name of entity.  Can be subtype entity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getEntityName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ENTITYNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ForKeyDataDists field.
     * Collection of ForKeyDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ForKeyDataDist[] getForKeyDataDists() {
      return (entity.ForKeyDataDist[])__getInternalInterface().getFieldValue(FORKEYDATADISTS_PROP.get());
    }
    
    public entity.ForKeyDataDist[] getForKeyDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getForKeyDataDistsOrderedByName();
    }
    
    /**
     * Gets the value of the GenericGroupDataDists field.
     * Collection of GenericGroupDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.GenericGroupDataDist[] getGenericGroupDataDists() {
      return (entity.GenericGroupDataDist[])__getInternalInterface().getFieldValue(GENERICGROUPDATADISTS_PROP.get());
    }
    
    public entity.GenericGroupDataDist[] getGenericGroupDataDistsOrderedByDescription() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getGenericGroupDataDistsOrderedByDescription();
    }
    
    /**
     * Gets the value of the HourAnalysisDataDists field.
     * Collection of HourAnalysisDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.HourAnalysisDataDist[] getHourAnalysisDataDists() {
      return (entity.HourAnalysisDataDist[])__getInternalInterface().getFieldValue(HOURANALYSISDATADISTS_PROP.get());
    }
    
    public entity.HourAnalysisDataDist[] getHourAnalysisDataDistsOrderedByYearAndMonth() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getHourAnalysisDataDistsOrderedByYearAndMonth();
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
     * Gets the value of the NullableColumnDataDists field.
     * Collection of NullableColumnDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.NullableColumnDataDist[] getNullableColumnDataDists() {
      return (entity.NullableColumnDataDist[])__getInternalInterface().getFieldValue(NULLABLECOLUMNDATADISTS_PROP.get());
    }
    
    public entity.NullableColumnDataDist[] getNullableColumnDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getNullableColumnDataDistsOrderedByName();
    }
    
    /**
     * Gets the value of the NumLoadedThruStagingTables field.
     * Count of # of rows loaded through the staging tables. (null if non-loadable)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getNumLoadedThruStagingTables() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(NUMLOADEDTHRUSTAGINGTABLES_PROP.get());
    }
    
    /**
     * Gets the value of the NumRetiredRows field.
     * Count of # of retired rows. (null if non-retireable)
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getNumRetiredRows() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(NUMRETIREDROWS_PROP.get());
    }
    
    /**
     * Gets the value of the NumRows field.
     * Count of # of rows.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getNumRows() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(NUMROWS_PROP.get());
    }
    
    /**
     * 
     * @param columnName 
     * @param yearMonthString 
     * @return # of rows for the specified columnName in the specified year/month, derived from the daily data distribution
     */
    public java.lang.Long getNumRowsFromDateAnalysis(java.lang.String columnName, java.lang.String yearMonthString) {
      return ((com.guidewire.pl.domain.database.TableDataDistPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.TableDataDistPublicMethods")).getNumRowsFromDateAnalysis(columnName, yearMonthString);
    }
    
    /**
     * Gets the value of the NumUpdatedRows field.
     * Count of # of updated rows.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getNumUpdatedRows() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(NUMUPDATEDROWS_PROP.get());
    }
    
    /**
     * Gets the value of the NumUpdates field.
     * Count of # of total updates.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getNumUpdates() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(NUMUPDATES_PROP.get());
    }
    
    /**
     * Gets the value of the ParentTableDataDist field.
     * For subtype tables, points to the parent table's data distribution.  Otherwise, this is null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TableDataDist getParentTableDataDist() {
      return (entity.TableDataDist)__getInternalInterface().getFieldValue(PARENTTABLEDATADIST_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getParentTableDataDistID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PARENTTABLEDATADIST_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    public entity.ForKeyDataDist[] getReferencingForKeyDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getReferencingForKeyDataDistsOrderedByName();
    }
    
    public entity.TableDataDist[] getSubTypeDistributions() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getSubTypeDistributions();
    }
    
    /**
     * Gets the value of the TableDataDistParentArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TableDataDistParent[] getTableDataDistParentArray() {
      return (entity.TableDataDistParent[])__getInternalInterface().getFieldValue(TABLEDATADISTPARENTARRAY_PROP.get());
    }
    
    /**
     * Gets the value of the TableName field.
     * Name of table.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTableName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TABLENAME_PROP.get());
    }
    
    /**
     * Gets the value of the TypeKeyDataDists field.
     * Collection of TypeKeyDataDists linked to this TableDataDist.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TypeKeyDataDist[] getTypeKeyDataDists() {
      return (entity.TypeKeyDataDist[])__getInternalInterface().getFieldValue(TYPEKEYDATADISTS_PROP.get());
    }
    
    public entity.TypeKeyDataDist[] getTypeKeyDataDistsOrderedByName() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).getTypeKeyDataDistsOrderedByName();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the AdminTable field.
     * True if admin table
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAdminTable() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ADMINTABLE_PROP.get());
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
     * Gets the value of the PlatformTable field.
     * True if platform table
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPlatformTable() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PLATFORMTABLE_PROP.get());
    }
    
    /**
     * Gets the value of the StagingTableDist field.
     * True if staging table distribution
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isStagingTableDist() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(STAGINGTABLEDIST_PROP.get());
    }
    
    public boolean isSubType() {
      return ((com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods")).isSubType();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the TypeListTableDist field.
     * True if type list table distribution
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isTypeListTableDist() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(TYPELISTTABLEDIST_PROP.get());
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
     * Removes the given element from the ArrayDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromArrayDataDists(entity.ArrayDataDist element) {
      __getInternalInterface().removeArrayElement(ARRAYDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ArrayDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromArrayDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ARRAYDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the AssignableForKeyDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromAssignableForKeyDataDists(entity.AssignableForKeyDataDist element) {
      __getInternalInterface().removeArrayElement(ASSIGNABLEFORKEYDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the AssignableForKeyDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromAssignableForKeyDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ASSIGNABLEFORKEYDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the BeanVersionDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromBeanVersionDataDists(entity.BeanVersionDataDist element) {
      __getInternalInterface().removeArrayElement(BEANVERSIONDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the BeanVersionDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromBeanVersionDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(BEANVERSIONDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the BlobColDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromBlobColDataDists(entity.BlobColDataDist element) {
      __getInternalInterface().removeArrayElement(BLOBCOLDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the BlobColDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromBlobColDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(BLOBCOLDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the BooleanColDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromBooleanColDataDists(entity.BooleanColDataDist element) {
      __getInternalInterface().removeArrayElement(BOOLEANCOLDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the BooleanColDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromBooleanColDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(BOOLEANCOLDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ClobColDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromClobColDataDists(entity.ClobColDataDist element) {
      __getInternalInterface().removeArrayElement(CLOBCOLDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ClobColDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromClobColDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CLOBCOLDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the CustomDataDistRequests array. This is achieved by marking the element for removal.
     */
    public void removeFromCustomDataDistRequests(entity.CustomDataDistRequest element) {
      __getInternalInterface().removeArrayElement(CUSTOMDATADISTREQUESTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CustomDataDistRequests array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCustomDataDistRequests(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CUSTOMDATADISTREQUESTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the DateAnalysisDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromDateAnalysisDataDists(entity.DateAnalysisDataDist element) {
      __getInternalInterface().removeArrayElement(DATEANALYSISDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the DateAnalysisDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDateAnalysisDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DATEANALYSISDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the DateBinnedDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromDateBinnedDataDists(entity.DateBinnedDataDist element) {
      __getInternalInterface().removeArrayElement(DATEBINNEDDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the DateBinnedDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDateBinnedDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DATEBINNEDDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the DateSpanDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromDateSpanDataDists(entity.DateSpanDataDist element) {
      __getInternalInterface().removeArrayElement(DATESPANDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the DateSpanDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDateSpanDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DATESPANDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ForKeyDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromForKeyDataDists(entity.ForKeyDataDist element) {
      __getInternalInterface().removeArrayElement(FORKEYDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ForKeyDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromForKeyDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(FORKEYDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the GenericGroupDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromGenericGroupDataDists(entity.GenericGroupDataDist element) {
      __getInternalInterface().removeArrayElement(GENERICGROUPDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the GenericGroupDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromGenericGroupDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(GENERICGROUPDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the HourAnalysisDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromHourAnalysisDataDists(entity.HourAnalysisDataDist element) {
      __getInternalInterface().removeArrayElement(HOURANALYSISDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the HourAnalysisDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromHourAnalysisDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(HOURANALYSISDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the NullableColumnDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromNullableColumnDataDists(entity.NullableColumnDataDist element) {
      __getInternalInterface().removeArrayElement(NULLABLECOLUMNDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the NullableColumnDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromNullableColumnDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(NULLABLECOLUMNDATADISTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the TableDataDistParentArray array. This is achieved by marking the element for removal.
     */
    public void removeFromTableDataDistParentArray(entity.TableDataDistParent element) {
      __getInternalInterface().removeArrayElement(TABLEDATADISTPARENTARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the TableDataDistParentArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTableDataDistParentArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TABLEDATADISTPARENTARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the TypeKeyDataDists array. This is achieved by marking the element for removal.
     */
    public void removeFromTypeKeyDataDists(entity.TypeKeyDataDist element) {
      __getInternalInterface().removeArrayElement(TYPEKEYDATADISTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the TypeKeyDataDists array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTypeKeyDataDists(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TYPEKEYDATADISTS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the AdminTable field.
     */
    public void setAdminTable(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ADMINTABLE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArrayDataDists field.
     */
    public void setArrayDataDists(entity.ArrayDataDist[] value) {
      __getInternalInterface().setFieldValue(ARRAYDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AssignableForKeyDataDists field.
     */
    public void setAssignableForKeyDataDists(entity.AssignableForKeyDataDist[] value) {
      __getInternalInterface().setFieldValue(ASSIGNABLEFORKEYDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersionDataDists field.
     */
    public void setBeanVersionDataDists(entity.BeanVersionDataDist[] value) {
      __getInternalInterface().setFieldValue(BEANVERSIONDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BlobColDataDists field.
     */
    public void setBlobColDataDists(entity.BlobColDataDist[] value) {
      __getInternalInterface().setFieldValue(BLOBCOLDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BooleanColDataDists field.
     */
    public void setBooleanColDataDists(entity.BooleanColDataDist[] value) {
      __getInternalInterface().setFieldValue(BOOLEANCOLDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClobColDataDists field.
     */
    public void setClobColDataDists(entity.ClobColDataDist[] value) {
      __getInternalInterface().setFieldValue(CLOBCOLDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CustomDataDistRequests field.
     */
    public void setCustomDataDistRequests(entity.CustomDataDistRequest[] value) {
      __getInternalInterface().setFieldValue(CUSTOMDATADISTREQUESTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DatabaseDataDist field.
     */
    public void setDatabaseDataDist(entity.DatabaseDataDist value) {
      __getInternalInterface().setFieldValue(DATABASEDATADIST_PROP.get(), value);
    }
    
    public void setDatabaseDataDistID(gw.pl.persistence.core.Key value) {
      setFieldValue(DATABASEDATADIST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateAnalysisDataDists field.
     */
    public void setDateAnalysisDataDists(entity.DateAnalysisDataDist[] value) {
      __getInternalInterface().setFieldValue(DATEANALYSISDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateBinnedDataDists field.
     */
    public void setDateBinnedDataDists(entity.DateBinnedDataDist[] value) {
      __getInternalInterface().setFieldValue(DATEBINNEDDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateSpanDataDists field.
     */
    public void setDateSpanDataDists(entity.DateSpanDataDist[] value) {
      __getInternalInterface().setFieldValue(DATESPANDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EntityName field.
     */
    public void setEntityName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ENTITYNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ForKeyDataDists field.
     */
    public void setForKeyDataDists(entity.ForKeyDataDist[] value) {
      __getInternalInterface().setFieldValue(FORKEYDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the GenericGroupDataDists field.
     */
    public void setGenericGroupDataDists(entity.GenericGroupDataDist[] value) {
      __getInternalInterface().setFieldValue(GENERICGROUPDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the HourAnalysisDataDists field.
     */
    public void setHourAnalysisDataDists(entity.HourAnalysisDataDist[] value) {
      __getInternalInterface().setFieldValue(HOURANALYSISDATADISTS_PROP.get(), value);
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
     * Sets the value of the NullableColumnDataDists field.
     */
    public void setNullableColumnDataDists(entity.NullableColumnDataDist[] value) {
      __getInternalInterface().setFieldValue(NULLABLECOLUMNDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NumLoadedThruStagingTables field.
     */
    public void setNumLoadedThruStagingTables(java.lang.Long value) {
      __getInternalInterface().setFieldValue(NUMLOADEDTHRUSTAGINGTABLES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NumRetiredRows field.
     */
    public void setNumRetiredRows(java.lang.Long value) {
      __getInternalInterface().setFieldValue(NUMRETIREDROWS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NumRows field.
     */
    public void setNumRows(java.lang.Long value) {
      __getInternalInterface().setFieldValue(NUMROWS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NumUpdatedRows field.
     */
    public void setNumUpdatedRows(java.lang.Long value) {
      __getInternalInterface().setFieldValue(NUMUPDATEDROWS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NumUpdates field.
     */
    public void setNumUpdates(java.lang.Long value) {
      __getInternalInterface().setFieldValue(NUMUPDATES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ParentTableDataDist field.
     */
    public void setParentTableDataDist(entity.TableDataDist value) {
      __getInternalInterface().setFieldValue(PARENTTABLEDATADIST_PROP.get(), value);
    }
    
    public void setParentTableDataDistID(gw.pl.persistence.core.Key value) {
      setFieldValue(PARENTTABLEDATADIST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PlatformTable field.
     */
    public void setPlatformTable(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PLATFORMTABLE_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the StagingTableDist field.
     */
    public void setStagingTableDist(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(STAGINGTABLEDIST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TableDataDistParentArray field.
     */
    public void setTableDataDistParentArray(entity.TableDataDistParent[] value) {
      __getInternalInterface().setFieldValue(TABLEDATADISTPARENTARRAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TableName field.
     */
    public void setTableName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TABLENAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TypeKeyDataDists field.
     */
    public void setTypeKeyDataDists(entity.TypeKeyDataDist[] value) {
      __getInternalInterface().setFieldValue(TYPEKEYDATADISTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TypeListTableDist field.
     */
    public void setTypeListTableDist(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(TYPELISTTABLEDIST_PROP.get(), value);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.database.TableDataDistPublicMethods", "com.guidewire.pl.domain.database.impl.TableDataDistImpl");
    config.put("com.guidewire.pl.domain.database.impl.TableDataDistInternalMethods", "com.guidewire.pl.domain.database.impl.TableDataDistImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TableDataDist.class, config);
    com.guidewire._generated.entity.TableDataDistInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TableDataDist, com.guidewire._generated.entity.TableDataDistInternal>() {
      public java.lang.Object getImplementation(entity.TableDataDist bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TableDataDistInternal getInternalInterface(entity.TableDataDist bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TableDataDist newEmptyInstance() {
        return new entity.TableDataDist((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}