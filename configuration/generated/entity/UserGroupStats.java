package entity;

/**
 * UserGroupStats
 * 
 *         Represents the combined statistics for a given user in a group. This entity aggregates claim, exposure, and activity
 *         statistics. Refer to the DashboardStats entity for statistics displayed for a user or in the dashboard.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UserGroupStats.eti;UserGroupStats.eix;UserGroupStats.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "UserGroupStats")
public class UserGroupStats extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.UserGroupStats> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.UserGroupStats>("entity.UserGroupStats");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ALLACTOPEN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AllActOpen");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ALLMATTEROPEN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AllMatterOpen");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ALLOPEN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AllOpen");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ALLSUBOPEN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AllSubOpen");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CALCULATEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CalculateDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMAGINGFOUR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimAgingFour");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMAGINGONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimAgingOne");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMAGINGTHREE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimAgingThree");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMAGINGTWO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimAgingTwo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMWORKLOAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimWorkload");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDTHISWEEK_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClosedThisWeek");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMPLETEDTODAY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CompletedToday");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DUETODAY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DueToday");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPAGINGFOUR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpAgingFour");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPAGINGONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpAgingOne");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPAGINGTHREE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpAgingThree");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPAGINGTWO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpAgingTwo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPOSUREWORKLOAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExposureWorkload");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FLAGGED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Flagged");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> GROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Group");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LITAGINGFOUR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LitAgingFour");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LITAGINGONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LitAgingOne");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LITAGINGTHREE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LitAgingThree");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LITAGINGTWO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LitAgingTwo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MATTERCLOSEDTHISWEEK_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MatterClosedThisWeek");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEWTHISWEEK_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NewThisWeek");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OVERDUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Overdue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBAGINGFOUR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubAgingFour");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBAGINGONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubAgingOne");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBAGINGTHREE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubAgingThree");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBAGINGTWO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubAgingTwo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBCLOSEDTHISWEEK_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubClosedThisWeek");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBLITAGINGFOUR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubLitAgingFour");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBLITAGINGONE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubLitAgingOne");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBLITAGINGTHREE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubLitAgingThree");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBLITAGINGTWO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubLitAgingTwo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBROACTIVEALL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubroActiveAll");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBROACTIVECLAIM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubroActiveClaim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBROACTIVEEXPOSURE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubroActiveExposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBROCLOSED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubroClosed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALWORKLOAD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalWorkload");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> USER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "User");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.UserGroupStatsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public UserGroupStats()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public UserGroupStats(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected UserGroupStats(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.UserGroupStatsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.UserGroupStatsInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Gets the value of the AllActOpen field.
   * Number of open activities for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAllActOpen() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ALLACTOPEN_PROP.get());
  }
  
  /**
   * Gets the value of the AllMatterOpen field.
   * Number of open matters for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAllMatterOpen() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ALLMATTEROPEN_PROP.get());
  }
  
  /**
   * Gets the value of the AllOpen field.
   * Number of open claims for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAllOpen() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ALLOPEN_PROP.get());
  }
  
  /**
   * Gets the value of the AllSubOpen field.
   * Number of open exposures for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAllSubOpen() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(ALLSUBOPEN_PROP.get());
  }
  
  /**
   * Gets the value of the CalculateDate field.
   * Date when statistics were calculated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCalculateDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CALCULATEDATE_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimAgingFour field.
   * Number of open claims falling into the fourth aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimAgingFour() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMAGINGFOUR_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimAgingOne field.
   * Number of open claims falling into the first aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimAgingOne() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMAGINGONE_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimAgingThree field.
   * Number of open claims falling into the third aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimAgingThree() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMAGINGTHREE_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimAgingTwo field.
   * Number of open claims falling into the second aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimAgingTwo() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMAGINGTWO_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimWorkload field.
   * Total Claim Workload for Group/User
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimWorkload() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMWORKLOAD_PROP.get());
  }
  
  /**
   * Gets the value of the ClosedThisWeek field.
   * Number of claims closed in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClosedThisWeek() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(CLOSEDTHISWEEK_PROP.get());
  }
  
  /**
   * Gets the value of the CompletedToday field.
   * Number of activities completed today.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getCompletedToday() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(COMPLETEDTODAY_PROP.get());
  }
  
  /**
   * Gets the value of the DueToday field.
   * Number of activities due today.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDueToday() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(DUETODAY_PROP.get());
  }
  
  /**
   * Gets the value of the ExpAgingFour field.
   * Number of open exposures falling into the fourth aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExpAgingFour() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPAGINGFOUR_PROP.get());
  }
  
  /**
   * Gets the value of the ExpAgingOne field.
   * Number of open exposures falling into the first aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExpAgingOne() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPAGINGONE_PROP.get());
  }
  
  /**
   * Gets the value of the ExpAgingThree field.
   * Number of open exposures falling into the third aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExpAgingThree() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPAGINGTHREE_PROP.get());
  }
  
  /**
   * Gets the value of the ExpAgingTwo field.
   * Number of open exposures falling into the second aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExpAgingTwo() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPAGINGTWO_PROP.get());
  }
  
  /**
   * Gets the value of the ExposureWorkload field.
   * Total Exposure Workload for Group/User
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExposureWorkload() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPOSUREWORKLOAD_PROP.get());
  }
  
  /**
   * Gets the value of the Flagged field.
   * Number of flagged claims for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFlagged() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(FLAGGED_PROP.get());
  }
  
  /**
   * Gets the value of the Group field.
   * The given group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
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
   * Gets the value of the LitAgingFour field.
   * Number of open and litigated claims falling into the fourth aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLitAgingFour() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LITAGINGFOUR_PROP.get());
  }
  
  /**
   * Gets the value of the LitAgingOne field.
   * Number of open and litigated claims falling into the first aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLitAgingOne() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LITAGINGONE_PROP.get());
  }
  
  /**
   * Gets the value of the LitAgingThree field.
   * Number of open and litigated claims falling into the third aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLitAgingThree() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LITAGINGTHREE_PROP.get());
  }
  
  /**
   * Gets the value of the LitAgingTwo field.
   * Number of open and litigated claims falling into the second aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLitAgingTwo() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(LITAGINGTWO_PROP.get());
  }
  
  /**
   * Gets the value of the MatterClosedThisWeek field.
   * Number of matters closed in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMatterClosedThisWeek() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(MATTERCLOSEDTHISWEEK_PROP.get());
  }
  
  /**
   * Gets the value of the NewThisWeek field.
   * Number of claims created in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewThisWeek() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(NEWTHISWEEK_PROP.get());
  }
  
  /**
   * Gets the value of the Overdue field.
   * Number of overdue activities for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOverdue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(OVERDUE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the SubAgingFour field.
   * Number of active subrogations falling into the fourth aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubAgingFour() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBAGINGFOUR_PROP.get());
  }
  
  /**
   * Gets the value of the SubAgingOne field.
   * Number of active subrogations falling into the first aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubAgingOne() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBAGINGONE_PROP.get());
  }
  
  /**
   * Gets the value of the SubAgingThree field.
   * Number of active subrogations falling into the third aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubAgingThree() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBAGINGTHREE_PROP.get());
  }
  
  /**
   * Gets the value of the SubAgingTwo field.
   * Number of active subrogations falling into the second aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubAgingTwo() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBAGINGTWO_PROP.get());
  }
  
  /**
   * Gets the value of the SubClosedThisWeek field.
   * Number of exposures closed in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubClosedThisWeek() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBCLOSEDTHISWEEK_PROP.get());
  }
  
  /**
   * Gets the value of the SubLitAgingFour field.
   * Number of active subrogations with a related litigation falling into the fourth aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubLitAgingFour() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBLITAGINGFOUR_PROP.get());
  }
  
  /**
   * Gets the value of the SubLitAgingOne field.
   * Number of active subrogations with a related litigation falling into the first aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubLitAgingOne() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBLITAGINGONE_PROP.get());
  }
  
  /**
   * Gets the value of the SubLitAgingThree field.
   * Number of active subrogations with a related litigation falling into the third aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubLitAgingThree() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBLITAGINGTHREE_PROP.get());
  }
  
  /**
   * Gets the value of the SubLitAgingTwo field.
   * Number of active subrogations with a related litigation falling into the second aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubLitAgingTwo() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBLITAGINGTWO_PROP.get());
  }
  
  /**
   * Gets the value of the SubroActiveAll field.
   * Active subrogations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubroActiveAll() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBROACTIVEALL_PROP.get());
  }
  
  /**
   * Gets the value of the SubroActiveClaim field.
   * Active claim-level subrogations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubroActiveClaim() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBROACTIVECLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the SubroActiveExposure field.
   * Active exposure-level subrogations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubroActiveExposure() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBROACTIVEEXPOSURE_PROP.get());
  }
  
  /**
   * Gets the value of the SubroClosed field.
   * Subrogations closed within the statistics window
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubroClosed() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBROCLOSED_PROP.get());
  }
  
  /**
   * Gets the value of the TotalWorkload field.
   * Total Workload for Group/User
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalWorkload() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(TOTALWORKLOAD_PROP.get());
  }
  
  /**
   * Gets the value of the User field.
   * The given user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser() {
    return (entity.User)__getInternalInterface().getFieldValue(USER_PROP.get());
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
   * Sets the value of the AllActOpen field.
   */
  public void setAllActOpen(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ALLACTOPEN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AllMatterOpen field.
   */
  public void setAllMatterOpen(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ALLMATTEROPEN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AllOpen field.
   */
  public void setAllOpen(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ALLOPEN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AllSubOpen field.
   */
  public void setAllSubOpen(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(ALLSUBOPEN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CalculateDate field.
   */
  public void setCalculateDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(CALCULATEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimAgingFour field.
   */
  public void setClaimAgingFour(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLAIMAGINGFOUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimAgingOne field.
   */
  public void setClaimAgingOne(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLAIMAGINGONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimAgingThree field.
   */
  public void setClaimAgingThree(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLAIMAGINGTHREE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimAgingTwo field.
   */
  public void setClaimAgingTwo(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLAIMAGINGTWO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimWorkload field.
   */
  public void setClaimWorkload(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLAIMWORKLOAD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClosedThisWeek field.
   */
  public void setClosedThisWeek(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLOSEDTHISWEEK_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CompletedToday field.
   */
  public void setCompletedToday(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(COMPLETEDTODAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DueToday field.
   */
  public void setDueToday(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(DUETODAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpAgingFour field.
   */
  public void setExpAgingFour(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXPAGINGFOUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpAgingOne field.
   */
  public void setExpAgingOne(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXPAGINGONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpAgingThree field.
   */
  public void setExpAgingThree(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXPAGINGTHREE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpAgingTwo field.
   */
  public void setExpAgingTwo(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXPAGINGTWO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExposureWorkload field.
   */
  public void setExposureWorkload(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(EXPOSUREWORKLOAD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Flagged field.
   */
  public void setFlagged(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(FLAGGED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value) {
    __getInternalInterface().setFieldValue(GROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LitAgingFour field.
   */
  public void setLitAgingFour(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LITAGINGFOUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LitAgingOne field.
   */
  public void setLitAgingOne(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LITAGINGONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LitAgingThree field.
   */
  public void setLitAgingThree(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LITAGINGTHREE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LitAgingTwo field.
   */
  public void setLitAgingTwo(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LITAGINGTWO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MatterClosedThisWeek field.
   */
  public void setMatterClosedThisWeek(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(MATTERCLOSEDTHISWEEK_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NewThisWeek field.
   */
  public void setNewThisWeek(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NEWTHISWEEK_PROP.get(), value);
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
   * Sets the value of the Overdue field.
   */
  public void setOverdue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(OVERDUE_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the SubAgingFour field.
   */
  public void setSubAgingFour(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBAGINGFOUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubAgingOne field.
   */
  public void setSubAgingOne(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBAGINGONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubAgingThree field.
   */
  public void setSubAgingThree(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBAGINGTHREE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubAgingTwo field.
   */
  public void setSubAgingTwo(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBAGINGTWO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubClosedThisWeek field.
   */
  public void setSubClosedThisWeek(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBCLOSEDTHISWEEK_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubLitAgingFour field.
   */
  public void setSubLitAgingFour(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBLITAGINGFOUR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubLitAgingOne field.
   */
  public void setSubLitAgingOne(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBLITAGINGONE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubLitAgingThree field.
   */
  public void setSubLitAgingThree(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBLITAGINGTHREE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubLitAgingTwo field.
   */
  public void setSubLitAgingTwo(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBLITAGINGTWO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubroActiveAll field.
   */
  public void setSubroActiveAll(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBROACTIVEALL_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubroActiveClaim field.
   */
  public void setSubroActiveClaim(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBROACTIVECLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubroActiveExposure field.
   */
  public void setSubroActiveExposure(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBROACTIVEEXPOSURE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SubroClosed field.
   */
  public void setSubroClosed(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(SUBROCLOSED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalWorkload field.
   */
  public void setTotalWorkload(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(TOTALWORKLOAD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value) {
    __getInternalInterface().setFieldValue(USER_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.UserGroupStatsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.UserGroupStats.this.__getDelegateManager();
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
     * Gets the value of the AllActOpen field.
     * Number of open activities for the given user/group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getAllActOpen() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ALLACTOPEN_PROP.get());
    }
    
    /**
     * Gets the value of the AllMatterOpen field.
     * Number of open matters for the given user/group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getAllMatterOpen() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ALLMATTEROPEN_PROP.get());
    }
    
    /**
     * Gets the value of the AllOpen field.
     * Number of open claims for the given user/group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getAllOpen() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ALLOPEN_PROP.get());
    }
    
    /**
     * Gets the value of the AllSubOpen field.
     * Number of open exposures for the given user/group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getAllSubOpen() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(ALLSUBOPEN_PROP.get());
    }
    
    /**
     * Gets the value of the CalculateDate field.
     * Date when statistics were calculated.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCalculateDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CALCULATEDATE_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimAgingFour field.
     * Number of open claims falling into the fourth aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClaimAgingFour() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMAGINGFOUR_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimAgingOne field.
     * Number of open claims falling into the first aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClaimAgingOne() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMAGINGONE_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimAgingThree field.
     * Number of open claims falling into the third aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClaimAgingThree() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMAGINGTHREE_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimAgingTwo field.
     * Number of open claims falling into the second aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClaimAgingTwo() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMAGINGTWO_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimWorkload field.
     * Total Claim Workload for Group/User
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClaimWorkload() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLAIMWORKLOAD_PROP.get());
    }
    
    /**
     * Gets the value of the ClosedThisWeek field.
     * Number of claims closed in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClosedThisWeek() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(CLOSEDTHISWEEK_PROP.get());
    }
    
    /**
     * Gets the value of the CompletedToday field.
     * Number of activities completed today.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getCompletedToday() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(COMPLETEDTODAY_PROP.get());
    }
    
    /**
     * Gets the value of the DueToday field.
     * Number of activities due today.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getDueToday() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(DUETODAY_PROP.get());
    }
    
    /**
     * Gets the value of the ExpAgingFour field.
     * Number of open exposures falling into the fourth aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExpAgingFour() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPAGINGFOUR_PROP.get());
    }
    
    /**
     * Gets the value of the ExpAgingOne field.
     * Number of open exposures falling into the first aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExpAgingOne() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPAGINGONE_PROP.get());
    }
    
    /**
     * Gets the value of the ExpAgingThree field.
     * Number of open exposures falling into the third aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExpAgingThree() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPAGINGTHREE_PROP.get());
    }
    
    /**
     * Gets the value of the ExpAgingTwo field.
     * Number of open exposures falling into the second aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExpAgingTwo() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPAGINGTWO_PROP.get());
    }
    
    /**
     * Gets the value of the ExposureWorkload field.
     * Total Exposure Workload for Group/User
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getExposureWorkload() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(EXPOSUREWORKLOAD_PROP.get());
    }
    
    /**
     * Gets the value of the Flagged field.
     * Number of flagged claims for the given user/group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getFlagged() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(FLAGGED_PROP.get());
    }
    
    /**
     * Gets the value of the Group field.
     * The given group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(GROUP_PROP.get());
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
     * Gets the value of the LitAgingFour field.
     * Number of open and litigated claims falling into the fourth aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLitAgingFour() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(LITAGINGFOUR_PROP.get());
    }
    
    /**
     * Gets the value of the LitAgingOne field.
     * Number of open and litigated claims falling into the first aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLitAgingOne() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(LITAGINGONE_PROP.get());
    }
    
    /**
     * Gets the value of the LitAgingThree field.
     * Number of open and litigated claims falling into the third aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLitAgingThree() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(LITAGINGTHREE_PROP.get());
    }
    
    /**
     * Gets the value of the LitAgingTwo field.
     * Number of open and litigated claims falling into the second aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLitAgingTwo() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(LITAGINGTWO_PROP.get());
    }
    
    /**
     * Gets the value of the MatterClosedThisWeek field.
     * Number of matters closed in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getMatterClosedThisWeek() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(MATTERCLOSEDTHISWEEK_PROP.get());
    }
    
    /**
     * Gets the value of the NewThisWeek field.
     * Number of claims created in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNewThisWeek() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(NEWTHISWEEK_PROP.get());
    }
    
    /**
     * Gets the value of the Overdue field.
     * Number of overdue activities for the given user/group.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOverdue() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(OVERDUE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the SubAgingFour field.
     * Number of active subrogations falling into the fourth aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubAgingFour() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBAGINGFOUR_PROP.get());
    }
    
    /**
     * Gets the value of the SubAgingOne field.
     * Number of active subrogations falling into the first aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubAgingOne() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBAGINGONE_PROP.get());
    }
    
    /**
     * Gets the value of the SubAgingThree field.
     * Number of active subrogations falling into the third aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubAgingThree() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBAGINGTHREE_PROP.get());
    }
    
    /**
     * Gets the value of the SubAgingTwo field.
     * Number of active subrogations falling into the second aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubAgingTwo() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBAGINGTWO_PROP.get());
    }
    
    /**
     * Gets the value of the SubClosedThisWeek field.
     * Number of exposures closed in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubClosedThisWeek() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBCLOSEDTHISWEEK_PROP.get());
    }
    
    /**
     * Gets the value of the SubLitAgingFour field.
     * Number of active subrogations with a related litigation falling into the fourth aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubLitAgingFour() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBLITAGINGFOUR_PROP.get());
    }
    
    /**
     * Gets the value of the SubLitAgingOne field.
     * Number of active subrogations with a related litigation falling into the first aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubLitAgingOne() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBLITAGINGONE_PROP.get());
    }
    
    /**
     * Gets the value of the SubLitAgingThree field.
     * Number of active subrogations with a related litigation falling into the third aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubLitAgingThree() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBLITAGINGTHREE_PROP.get());
    }
    
    /**
     * Gets the value of the SubLitAgingTwo field.
     * Number of active subrogations with a related litigation falling into the second aging bucket (the divisions are customer-configurable).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubLitAgingTwo() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBLITAGINGTWO_PROP.get());
    }
    
    /**
     * Gets the value of the SubroActiveAll field.
     * Active subrogations
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubroActiveAll() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBROACTIVEALL_PROP.get());
    }
    
    /**
     * Gets the value of the SubroActiveClaim field.
     * Active claim-level subrogations
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubroActiveClaim() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBROACTIVECLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the SubroActiveExposure field.
     * Active exposure-level subrogations
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubroActiveExposure() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBROACTIVEEXPOSURE_PROP.get());
    }
    
    /**
     * Gets the value of the SubroClosed field.
     * Subrogations closed within the statistics window
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getSubroClosed() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(SUBROCLOSED_PROP.get());
    }
    
    /**
     * Gets the value of the TotalWorkload field.
     * Total Workload for Group/User
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getTotalWorkload() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(TOTALWORKLOAD_PROP.get());
    }
    
    /**
     * Gets the value of the User field.
     * The given user.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUser() {
      return (entity.User)__getInternalInterface().getFieldValue(USER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(USER_PROP.get());
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
     * Sets the value of the AllActOpen field.
     */
    public void setAllActOpen(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ALLACTOPEN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AllMatterOpen field.
     */
    public void setAllMatterOpen(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ALLMATTEROPEN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AllOpen field.
     */
    public void setAllOpen(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ALLOPEN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AllSubOpen field.
     */
    public void setAllSubOpen(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(ALLSUBOPEN_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CalculateDate field.
     */
    public void setCalculateDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(CALCULATEDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimAgingFour field.
     */
    public void setClaimAgingFour(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLAIMAGINGFOUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimAgingOne field.
     */
    public void setClaimAgingOne(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLAIMAGINGONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimAgingThree field.
     */
    public void setClaimAgingThree(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLAIMAGINGTHREE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimAgingTwo field.
     */
    public void setClaimAgingTwo(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLAIMAGINGTWO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimWorkload field.
     */
    public void setClaimWorkload(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLAIMWORKLOAD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClosedThisWeek field.
     */
    public void setClosedThisWeek(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLOSEDTHISWEEK_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CompletedToday field.
     */
    public void setCompletedToday(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(COMPLETEDTODAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DueToday field.
     */
    public void setDueToday(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(DUETODAY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpAgingFour field.
     */
    public void setExpAgingFour(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXPAGINGFOUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpAgingOne field.
     */
    public void setExpAgingOne(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXPAGINGONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpAgingThree field.
     */
    public void setExpAgingThree(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXPAGINGTHREE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpAgingTwo field.
     */
    public void setExpAgingTwo(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXPAGINGTWO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExposureWorkload field.
     */
    public void setExposureWorkload(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(EXPOSUREWORKLOAD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Flagged field.
     */
    public void setFlagged(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(FLAGGED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Group field.
     */
    public void setGroup(entity.Group value) {
      __getInternalInterface().setFieldValue(GROUP_PROP.get(), value);
    }
    
    public void setGroupID(gw.pl.persistence.core.Key value) {
      setFieldValue(GROUP_PROP.get(), value);
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
     * Sets the value of the LitAgingFour field.
     */
    public void setLitAgingFour(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LITAGINGFOUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LitAgingOne field.
     */
    public void setLitAgingOne(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LITAGINGONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LitAgingThree field.
     */
    public void setLitAgingThree(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LITAGINGTHREE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LitAgingTwo field.
     */
    public void setLitAgingTwo(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LITAGINGTWO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MatterClosedThisWeek field.
     */
    public void setMatterClosedThisWeek(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(MATTERCLOSEDTHISWEEK_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NewThisWeek field.
     */
    public void setNewThisWeek(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NEWTHISWEEK_PROP.get(), value);
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
     * Sets the value of the Overdue field.
     */
    public void setOverdue(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(OVERDUE_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the SubAgingFour field.
     */
    public void setSubAgingFour(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBAGINGFOUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubAgingOne field.
     */
    public void setSubAgingOne(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBAGINGONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubAgingThree field.
     */
    public void setSubAgingThree(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBAGINGTHREE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubAgingTwo field.
     */
    public void setSubAgingTwo(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBAGINGTWO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubClosedThisWeek field.
     */
    public void setSubClosedThisWeek(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBCLOSEDTHISWEEK_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubLitAgingFour field.
     */
    public void setSubLitAgingFour(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBLITAGINGFOUR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubLitAgingOne field.
     */
    public void setSubLitAgingOne(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBLITAGINGONE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubLitAgingThree field.
     */
    public void setSubLitAgingThree(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBLITAGINGTHREE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubLitAgingTwo field.
     */
    public void setSubLitAgingTwo(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBLITAGINGTWO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubroActiveAll field.
     */
    public void setSubroActiveAll(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBROACTIVEALL_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubroActiveClaim field.
     */
    public void setSubroActiveClaim(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBROACTIVECLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubroActiveExposure field.
     */
    public void setSubroActiveExposure(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBROACTIVEEXPOSURE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SubroClosed field.
     */
    public void setSubroClosed(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(SUBROCLOSED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalWorkload field.
     */
    public void setTotalWorkload(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(TOTALWORKLOAD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the User field.
     */
    public void setUser(entity.User value) {
      __getInternalInterface().setFieldValue(USER_PROP.get(), value);
    }
    
    public void setUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(USER_PROP.get(), value);
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
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.UserGroupStats.class, config);
    com.guidewire._generated.entity.UserGroupStatsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.UserGroupStats, com.guidewire._generated.entity.UserGroupStatsInternal>() {
      public java.lang.Object getImplementation(entity.UserGroupStats bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.UserGroupStatsInternal getInternalInterface(entity.UserGroupStats bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.UserGroupStats newEmptyInstance() {
        return new entity.UserGroupStats((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}