package entity;

/**
 * HourAnalysisDataDist
 * Stores hour analysis data distribution.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "HourAnalysisDataDist.eti;HourAnalysisDataDist.eix;HourAnalysisDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "HourAnalysisDataDist")
public class HourAnalysisDataDist extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.HourAnalysisDataDist> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.HourAnalysisDataDist>("entity.HourAnalysisDataDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AVGROWSPERHOUR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AvgRowsPerHour");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATETIMECOLUMNNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DatetimeColumnName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAXROWSPERHOUR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MaxRowsPerHour");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MINROWSPERHOUR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MinRowsPerHour");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMDISTINCTDATES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumDistinctDates");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMDISTINCTHOURSINDAY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumDistinctHoursInDay");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NUMNONNULLNONLOADABLEDATES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NumNonNullNonLoadableDates");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TABLEDATADIST_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TableDataDist");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MNTH_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "mnth");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> YR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "yr");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.HourAnalysisDataDistInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public HourAnalysisDataDist()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public HourAnalysisDataDist(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected HourAnalysisDataDist(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.HourAnalysisDataDistInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.HourAnalysisDataDistInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AvgRowsPerHour field.
   * Average number of rows per hour.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAvgRowsPerHour() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AVGROWSPERHOUR_PROP.get());
  }
  
  /**
   * Gets the value of the DatetimeColumnName field.
   * Name of datetime column.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDatetimeColumnName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DATETIMECOLUMNNAME_PROP.get());
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
   * Gets the value of the MaxRowsPerHour field.
   * Maximum number of rows per hour.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMaxRowsPerHour() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(MAXROWSPERHOUR_PROP.get());
  }
  
  /**
   * Gets the value of the MinRowsPerHour field.
   * Minimum number of rows per hour.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMinRowsPerHour() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(MINROWSPERHOUR_PROP.get());
  }
  
  /**
   * Gets the value of the NumDistinctDates field.
   * Number of distinct hours in month.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumDistinctDates() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(NUMDISTINCTDATES_PROP.get());
  }
  
  /**
   * Gets the value of the NumDistinctHoursInDay field.
   * Number of distinct hours in day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumDistinctHoursInDay() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(NUMDISTINCTHOURSINDAY_PROP.get());
  }
  
  /**
   * Gets the value of the NumNonNullNonLoadableDates field.
   * Number of non-null, non-loadable rows.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumNonNullNonLoadableDates() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(NUMNONNULLNONLOADABLEDATES_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist() {
    return (entity.TableDataDist)__getInternalInterface().getFieldValue(TABLEDATADIST_PROP.get());
  }
  
  /**
   * Gets the value of the mnth field.
   * Month
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getmnth() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(MNTH_PROP.get());
  }
  
  /**
   * Gets the value of the yr field.
   * Year
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getyr() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(YR_PROP.get());
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
   * Sets the value of the AvgRowsPerHour field.
   */
  public void setAvgRowsPerHour(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(AVGROWSPERHOUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DatetimeColumnName field.
   */
  public void setDatetimeColumnName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DATETIMECOLUMNNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MaxRowsPerHour field.
   */
  public void setMaxRowsPerHour(java.lang.Long value) {
    __getInternalInterface().setFieldValue(MAXROWSPERHOUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MinRowsPerHour field.
   */
  public void setMinRowsPerHour(java.lang.Long value) {
    __getInternalInterface().setFieldValue(MINROWSPERHOUR_PROP.get(), value);
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
   * Sets the value of the NumDistinctDates field.
   */
  public void setNumDistinctDates(java.lang.Long value) {
    __getInternalInterface().setFieldValue(NUMDISTINCTDATES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NumDistinctHoursInDay field.
   */
  public void setNumDistinctHoursInDay(java.lang.Long value) {
    __getInternalInterface().setFieldValue(NUMDISTINCTHOURSINDAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NumNonNullNonLoadableDates field.
   */
  public void setNumNonNullNonLoadableDates(java.lang.Long value) {
    __getInternalInterface().setFieldValue(NUMNONNULLNONLOADABLEDATES_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value) {
    __getInternalInterface().setFieldValue(TABLEDATADIST_PROP.get(), value);
  }
  
  /**
   * Sets the value of the mnth field.
   */
  public void setmnth(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(MNTH_PROP.get(), value);
  }
  
  /**
   * Sets the value of the yr field.
   */
  public void setyr(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(YR_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.HourAnalysisDataDistInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.HourAnalysisDataDist.this.__getDelegateManager();
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
     * Gets the value of the AvgRowsPerHour field.
     * Average number of rows per hour.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getAvgRowsPerHour() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(AVGROWSPERHOUR_PROP.get());
    }
    
    /**
     * Gets the value of the DatetimeColumnName field.
     * Name of datetime column.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDatetimeColumnName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DATETIMECOLUMNNAME_PROP.get());
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
     * Gets the value of the MaxRowsPerHour field.
     * Maximum number of rows per hour.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getMaxRowsPerHour() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(MAXROWSPERHOUR_PROP.get());
    }
    
    /**
     * Gets the value of the MinRowsPerHour field.
     * Minimum number of rows per hour.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getMinRowsPerHour() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(MINROWSPERHOUR_PROP.get());
    }
    
    /**
     * Gets the value of the NumDistinctDates field.
     * Number of distinct hours in month.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getNumDistinctDates() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(NUMDISTINCTDATES_PROP.get());
    }
    
    /**
     * Gets the value of the NumDistinctHoursInDay field.
     * Number of distinct hours in day.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getNumDistinctHoursInDay() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(NUMDISTINCTHOURSINDAY_PROP.get());
    }
    
    /**
     * Gets the value of the NumNonNullNonLoadableDates field.
     * Number of non-null, non-loadable rows.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getNumNonNullNonLoadableDates() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(NUMNONNULLNONLOADABLEDATES_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the TableDataDist field.
     * TableDataDist for this object.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TableDataDist getTableDataDist() {
      return (entity.TableDataDist)__getInternalInterface().getFieldValue(TABLEDATADIST_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTableDataDistID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TABLEDATADIST_PROP.get());
    }
    
    /**
     * Gets the value of the mnth field.
     * Month
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getmnth() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(MNTH_PROP.get());
    }
    
    /**
     * Gets the value of the yr field.
     * Year
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getyr() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(YR_PROP.get());
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
     * Sets the value of the AvgRowsPerHour field.
     */
    public void setAvgRowsPerHour(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(AVGROWSPERHOUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DatetimeColumnName field.
     */
    public void setDatetimeColumnName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DATETIMECOLUMNNAME_PROP.get(), value);
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
     * Sets the value of the MaxRowsPerHour field.
     */
    public void setMaxRowsPerHour(java.lang.Long value) {
      __getInternalInterface().setFieldValue(MAXROWSPERHOUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MinRowsPerHour field.
     */
    public void setMinRowsPerHour(java.lang.Long value) {
      __getInternalInterface().setFieldValue(MINROWSPERHOUR_PROP.get(), value);
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
     * Sets the value of the NumDistinctDates field.
     */
    public void setNumDistinctDates(java.lang.Long value) {
      __getInternalInterface().setFieldValue(NUMDISTINCTDATES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NumDistinctHoursInDay field.
     */
    public void setNumDistinctHoursInDay(java.lang.Long value) {
      __getInternalInterface().setFieldValue(NUMDISTINCTHOURSINDAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NumNonNullNonLoadableDates field.
     */
    public void setNumNonNullNonLoadableDates(java.lang.Long value) {
      __getInternalInterface().setFieldValue(NUMNONNULLNONLOADABLEDATES_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the TableDataDist field.
     */
    public void setTableDataDist(entity.TableDataDist value) {
      __getInternalInterface().setFieldValue(TABLEDATADIST_PROP.get(), value);
    }
    
    public void setTableDataDistID(gw.pl.persistence.core.Key value) {
      setFieldValue(TABLEDATADIST_PROP.get(), value);
    }
    
    /**
     * Sets the value of the mnth field.
     */
    public void setmnth(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(MNTH_PROP.get(), value);
    }
    
    /**
     * Sets the value of the yr field.
     */
    public void setyr(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(YR_PROP.get(), value);
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
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.HourAnalysisDataDist.class, config);
    com.guidewire._generated.entity.HourAnalysisDataDistInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.HourAnalysisDataDist, com.guidewire._generated.entity.HourAnalysisDataDistInternal>() {
      public java.lang.Object getImplementation(entity.HourAnalysisDataDist bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.HourAnalysisDataDistInternal getInternalInterface(entity.HourAnalysisDataDist bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.HourAnalysisDataDist newEmptyInstance() {
        return new entity.HourAnalysisDataDist((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}