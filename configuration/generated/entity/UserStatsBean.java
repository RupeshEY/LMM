package entity;

/**
 * UserStatsBean
 * 
 *         Supports display of user statistics. This is an internal, virtual entity, the system does not store it.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UserStatsBean.eti;UserStatsBean.eix;UserStatsBean.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "UserStatsBean")
public class UserStatsBean extends com.guidewire.pl.persistence.code.BeanBase implements entity.Versionable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.UserStatsBean> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.UserStatsBean>("entity.UserStatsBean");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDCLAIMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClosedClaims");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDEXPOSURES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClosedExposures");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDMATTERS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClosedMatters");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMPLETEDACTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CompletedActs");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FNOLCOMPLETED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FNOLCompleted");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FNOLFLAGGED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FNOLFlagged");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FNOLINQUEUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FNOLInQueue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FNOLNEW_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FNOLNew");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FNOLOPEN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "FNOLOpen");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEWCLAIMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NewClaims");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENACTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenActs");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENCLAIMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenClaims");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENEXPOSURES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenExposures");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENMATTERS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenMatters");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OVERDUEACTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OverdueActs");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STATSUPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StatsUpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TEAMCLOSEDCLAIMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TeamClosedClaims");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TEAMNEWCLAIMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TeamNewClaims");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TEAMOPENCLAIMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TeamOpenClaims");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TEAMOVERDUEACTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TeamOverdueActs");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.UserStatsBeanInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public UserStatsBean()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public UserStatsBean(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected UserStatsBean(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.UserStatsBeanInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.UserStatsBeanInternal __getInternalInterface() {
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
   * Gets the value of the ClosedClaims field.
   * Number of claims closed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClosedClaims() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLOSEDCLAIMS_PROP.get());
  }
  
  /**
   * Gets the value of the ClosedExposures field.
   * Number of exposures closed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClosedExposures() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLOSEDEXPOSURES_PROP.get());
  }
  
  /**
   * Gets the value of the ClosedMatters field.
   * Number of matters closed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClosedMatters() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLOSEDMATTERS_PROP.get());
  }
  
  /**
   * Gets the value of the CompletedActs field.
   * Number of activities completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getCompletedActs() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(COMPLETEDACTS_PROP.get());
  }
  
  /**
   * Gets the value of the FNOLCompleted field.
   * Number of FNOLs completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFNOLCompleted() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(FNOLCOMPLETED_PROP.get());
  }
  
  /**
   * Gets the value of the FNOLFlagged field.
   * Number of FNOLs flagged.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFNOLFlagged() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(FNOLFLAGGED_PROP.get());
  }
  
  /**
   * Gets the value of the FNOLInQueue field.
   * Number of FNOLs in the queue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFNOLInQueue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(FNOLINQUEUE_PROP.get());
  }
  
  /**
   * Gets the value of the FNOLNew field.
   * Number of FNOLs new.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFNOLNew() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(FNOLNEW_PROP.get());
  }
  
  /**
   * Gets the value of the FNOLOpen field.
   * Number of FNOLs open.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFNOLOpen() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(FNOLOPEN_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the NewClaims field.
   * Number of claims new.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewClaims() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NEWCLAIMS_PROP.get());
  }
  
  /**
   * Gets the value of the OpenActs field.
   * Number of activities open.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOpenActs() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(OPENACTS_PROP.get());
  }
  
  /**
   * Gets the value of the OpenClaims field.
   * Number of claims open.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOpenClaims() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(OPENCLAIMS_PROP.get());
  }
  
  /**
   * Gets the value of the OpenExposures field.
   * Number of exposures open.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOpenExposures() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(OPENEXPOSURES_PROP.get());
  }
  
  /**
   * Gets the value of the OpenMatters field.
   * Number of matters open.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOpenMatters() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(OPENMATTERS_PROP.get());
  }
  
  /**
   * Gets the value of the OverdueActs field.
   * Number of activities overdue.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOverdueActs() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(OVERDUEACTS_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the StatsUpdateTime field.
   * Time of last update.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStatsUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STATSUPDATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the TeamClosedClaims field.
   * Number of claims closed for the team.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTeamClosedClaims() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TEAMCLOSEDCLAIMS_PROP.get());
  }
  
  /**
   * Gets the value of the TeamNewClaims field.
   * Number of claims new for the team.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTeamNewClaims() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TEAMNEWCLAIMS_PROP.get());
  }
  
  /**
   * Gets the value of the TeamOpenClaims field.
   * Number of claims open for the team.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTeamOpenClaims() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TEAMOPENCLAIMS_PROP.get());
  }
  
  /**
   * Gets the value of the TeamOverdueActs field.
   * Number of activities overdue for the team.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTeamOverdueActs() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TEAMOVERDUEACTS_PROP.get());
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
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClosedClaims field.
   */
  public void setClosedClaims(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLOSEDCLAIMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClosedExposures field.
   */
  public void setClosedExposures(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLOSEDEXPOSURES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClosedMatters field.
   */
  public void setClosedMatters(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLOSEDMATTERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CompletedActs field.
   */
  public void setCompletedActs(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(COMPLETEDACTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FNOLCompleted field.
   */
  public void setFNOLCompleted(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(FNOLCOMPLETED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FNOLFlagged field.
   */
  public void setFNOLFlagged(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(FNOLFLAGGED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FNOLInQueue field.
   */
  public void setFNOLInQueue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(FNOLINQUEUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FNOLNew field.
   */
  public void setFNOLNew(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(FNOLNEW_PROP.get(), value);
  }
  
  /**
   * Sets the value of the FNOLOpen field.
   */
  public void setFNOLOpen(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(FNOLOPEN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NewClaims field.
   */
  public void setNewClaims(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NEWCLAIMS_PROP.get(), value);
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
   * Sets the value of the OpenActs field.
   */
  public void setOpenActs(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(OPENACTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OpenClaims field.
   */
  public void setOpenClaims(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(OPENCLAIMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OpenExposures field.
   */
  public void setOpenExposures(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(OPENEXPOSURES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OpenMatters field.
   */
  public void setOpenMatters(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(OPENMATTERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OverdueActs field.
   */
  public void setOverdueActs(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(OVERDUEACTS_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the StatsUpdateTime field.
   */
  public void setStatsUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STATSUPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TeamClosedClaims field.
   */
  public void setTeamClosedClaims(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TEAMCLOSEDCLAIMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TeamNewClaims field.
   */
  public void setTeamNewClaims(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TEAMNEWCLAIMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TeamOpenClaims field.
   */
  public void setTeamOpenClaims(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TEAMOPENCLAIMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TeamOverdueActs field.
   */
  public void setTeamOverdueActs(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TEAMOVERDUEACTS_PROP.get(), value);
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
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.UserStatsBeanInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.UserStatsBean.this.__getDelegateManager();
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
     * Gets the value of the ClosedClaims field.
     * Number of claims closed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClosedClaims() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLOSEDCLAIMS_PROP.get());
    }
    
    /**
     * Gets the value of the ClosedExposures field.
     * Number of exposures closed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClosedExposures() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLOSEDEXPOSURES_PROP.get());
    }
    
    /**
     * Gets the value of the ClosedMatters field.
     * Number of matters closed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClosedMatters() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLOSEDMATTERS_PROP.get());
    }
    
    /**
     * Gets the value of the CompletedActs field.
     * Number of activities completed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getCompletedActs() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(COMPLETEDACTS_PROP.get());
    }
    
    /**
     * Gets the value of the FNOLCompleted field.
     * Number of FNOLs completed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getFNOLCompleted() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(FNOLCOMPLETED_PROP.get());
    }
    
    /**
     * Gets the value of the FNOLFlagged field.
     * Number of FNOLs flagged.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getFNOLFlagged() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(FNOLFLAGGED_PROP.get());
    }
    
    /**
     * Gets the value of the FNOLInQueue field.
     * Number of FNOLs in the queue.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getFNOLInQueue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(FNOLINQUEUE_PROP.get());
    }
    
    /**
     * Gets the value of the FNOLNew field.
     * Number of FNOLs new.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getFNOLNew() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(FNOLNEW_PROP.get());
    }
    
    /**
     * Gets the value of the FNOLOpen field.
     * Number of FNOLs open.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getFNOLOpen() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(FNOLOPEN_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the NewClaims field.
     * Number of claims new.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNewClaims() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NEWCLAIMS_PROP.get());
    }
    
    /**
     * Gets the value of the OpenActs field.
     * Number of activities open.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOpenActs() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(OPENACTS_PROP.get());
    }
    
    /**
     * Gets the value of the OpenClaims field.
     * Number of claims open.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOpenClaims() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(OPENCLAIMS_PROP.get());
    }
    
    /**
     * Gets the value of the OpenExposures field.
     * Number of exposures open.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOpenExposures() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(OPENEXPOSURES_PROP.get());
    }
    
    /**
     * Gets the value of the OpenMatters field.
     * Number of matters open.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOpenMatters() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(OPENMATTERS_PROP.get());
    }
    
    /**
     * Gets the value of the OverdueActs field.
     * Number of activities overdue.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOverdueActs() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(OVERDUEACTS_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the StatsUpdateTime field.
     * Time of last update.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getStatsUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(STATSUPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the TeamClosedClaims field.
     * Number of claims closed for the team.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTeamClosedClaims() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TEAMCLOSEDCLAIMS_PROP.get());
    }
    
    /**
     * Gets the value of the TeamNewClaims field.
     * Number of claims new for the team.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTeamNewClaims() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TEAMNEWCLAIMS_PROP.get());
    }
    
    /**
     * Gets the value of the TeamOpenClaims field.
     * Number of claims open for the team.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTeamOpenClaims() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TEAMOPENCLAIMS_PROP.get());
    }
    
    /**
     * Gets the value of the TeamOverdueActs field.
     * Number of activities overdue for the team.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTeamOverdueActs() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TEAMOVERDUEACTS_PROP.get());
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
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClosedClaims field.
     */
    public void setClosedClaims(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLOSEDCLAIMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClosedExposures field.
     */
    public void setClosedExposures(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLOSEDEXPOSURES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClosedMatters field.
     */
    public void setClosedMatters(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLOSEDMATTERS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CompletedActs field.
     */
    public void setCompletedActs(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(COMPLETEDACTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FNOLCompleted field.
     */
    public void setFNOLCompleted(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(FNOLCOMPLETED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FNOLFlagged field.
     */
    public void setFNOLFlagged(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(FNOLFLAGGED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FNOLInQueue field.
     */
    public void setFNOLInQueue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(FNOLINQUEUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FNOLNew field.
     */
    public void setFNOLNew(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(FNOLNEW_PROP.get(), value);
    }
    
    /**
     * Sets the value of the FNOLOpen field.
     */
    public void setFNOLOpen(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(FNOLOPEN_PROP.get(), value);
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
     * Sets the value of the NewClaims field.
     */
    public void setNewClaims(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NEWCLAIMS_PROP.get(), value);
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
     * Sets the value of the OpenActs field.
     */
    public void setOpenActs(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(OPENACTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OpenClaims field.
     */
    public void setOpenClaims(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(OPENCLAIMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OpenExposures field.
     */
    public void setOpenExposures(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(OPENEXPOSURES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OpenMatters field.
     */
    public void setOpenMatters(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(OPENMATTERS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OverdueActs field.
     */
    public void setOverdueActs(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(OVERDUEACTS_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    public void setStatistics(java.util.Map statsMap) {
      ((com.guidewire.cc.domain.statistics.impl.UserStatsBeanInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.statistics.impl.UserStatsBeanInternal")).setStatistics(statsMap);
    }
    
    /**
     * Sets the value of the StatsUpdateTime field.
     */
    public void setStatsUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(STATSUPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TeamClosedClaims field.
     */
    public void setTeamClosedClaims(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TEAMCLOSEDCLAIMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TeamNewClaims field.
     */
    public void setTeamNewClaims(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TEAMNEWCLAIMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TeamOpenClaims field.
     */
    public void setTeamOpenClaims(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TEAMOPENCLAIMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TeamOverdueActs field.
     */
    public void setTeamOverdueActs(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TEAMOVERDUEACTS_PROP.get(), value);
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
    config.put("com.guidewire.cc.domain.statistics.impl.UserStatsBeanInternal", "com.guidewire.cc.domain.statistics.impl.UserStatsBeanImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.cc.statistics.entity.UserStatsBean", "com.guidewire.cc.domain.statistics.impl.UserStatsBeanImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.UserStatsBean.class, config);
    com.guidewire._generated.entity.UserStatsBeanInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.UserStatsBean, com.guidewire._generated.entity.UserStatsBeanInternal>() {
      public java.lang.Object getImplementation(entity.UserStatsBean bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.UserStatsBeanInternal getInternalInterface(entity.UserStatsBean bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.UserStatsBean newEmptyInstance() {
        return new entity.UserStatsBean((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}