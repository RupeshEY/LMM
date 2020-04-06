package entity;

/**
 * DashboardStats
 * 
 *         Maintains statistics for claim activity and financial data within ClaimCenter.
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DashboardStats.eti;DashboardStats.eix;DashboardStats.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "DashboardStats")
public class DashboardStats extends com.guidewire.pl.persistence.code.BeanBase implements entity.KeyableBean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DashboardStats> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DashboardStats>("entity.DashboardStats");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMCOSTSINPERIOD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimCostsInPeriod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMCOSTSONCLOSED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimCostsOnClosed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMCOSTSPAID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimCostsPaid");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CloseTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDCLAIMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClosedClaims");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLOSEDEXPOSURES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClosedExposures");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COVERAGETYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CoverageType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPENSESINPERIOD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpensesInPeriod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPENSESONCLOSED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpensesOnClosed");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPENSESPAID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ExpensesPaid");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> FLAGGED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Flagged");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> GROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Group");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> HANDLERS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Handlers");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOBCODE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LOBCode");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LITIGATED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Litigated");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LOSSTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LossType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEWCLAIMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NewClaims");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEWEXPOSURES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NewExposures");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEWLITIGATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NewLitigation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NEWNOTICEONLY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NewNoticeOnly");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NOTICEONLY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NoticeOnly");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENCLAIMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenClaims");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENEXPOSURES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenExposures");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OPENRESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OpenReserves");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OVERINCURREDLIMIT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "OverIncurredLimit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECOVEREDINPERIOD_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RecoveredInPeriod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REOPENEDCLAIMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReopenedClaims");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "StatType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALINCURREDNET_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalIncurredNet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TTLINCNETMINUSOPENRECRESERVES_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TtlIncNetMinusOpenRecReserves");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.DashboardStatsInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public DashboardStats()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public DashboardStats(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected DashboardStats(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.DashboardStatsInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.DashboardStatsInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Adds the stats of the given stat to this stat.
   * @param stat 
   */
  public void addToStats(entity.DashboardStats stat) {
    ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).addToStats(stat);
  }
  
  /**
   */
  public java.lang.Double getAvgCloseTime() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getAvgCloseTime();
  }
  
  /**
   */
  public java.math.BigDecimal getAvgIncurred() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getAvgIncurred();
  }
  
  /**
   */
  public java.math.BigDecimal getAvgPaidOnClosed() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getAvgPaidOnClosed();
  }
  
  /**
   */
  public java.lang.Double getAvgPending() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getAvgPending();
  }
  
  /**
   * Gets the value of the ClaimCostsInPeriod field.
   * Claim costs paid in this period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimCostsInPeriod() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getClaimCostsInPeriod();
  }
  
  /**
   * Gets the value of the ClaimCostsOnClosed field.
   * Claim costs paid on claims closed in this period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimCostsOnClosed() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getClaimCostsOnClosed();
  }
  
  /**
   * Gets the value of the ClaimCostsPaid field.
   * Claim costs paid on open claims.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimCostsPaid() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getClaimCostsPaid();
  }
  
  /**
   * Gets the value of the CloseTime field.
   * Total of days from CreateDate to CloseDate for all claims closed in period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getCloseTime() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getCloseTime();
  }
  
  /**
   * Gets the value of the ClosedClaims field.
   * Number of claims closed in period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClosedClaims() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getClosedClaims();
  }
  
  /**
   * Gets the value of the ClosedExposures field.
   * Number of exposures closed in period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClosedExposures() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getClosedExposures();
  }
  
  /**
   * Gets the value of the CoverageType field.
   * CoverageType this statistic is for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getCoverageType() {
    return (typekey.CoverageType)__getInternalInterface().getFieldValue(COVERAGETYPE_PROP.get());
  }
  
  /**
   * Gets the value of the ExpensesInPeriod field.
   * Expenses paid in this period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getExpensesInPeriod() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getExpensesInPeriod();
  }
  
  /**
   * Gets the value of the ExpensesOnClosed field.
   * Expenses paid on claims closed in this period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getExpensesOnClosed() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getExpensesOnClosed();
  }
  
  /**
   * Gets the value of the ExpensesPaid field.
   * Expenses paid on open claims.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getExpensesPaid() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getExpensesPaid();
  }
  
  /**
   * Gets the value of the Flagged field.
   * Number of claims with Flagged = isFlagged.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFlagged() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getFlagged();
  }
  
  /**
   * Gets the value of the Group field.
   * Group this statistic is for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup() {
    return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
  }
  
  /**
   * Gets the value of the Handlers field.
   * Number of users in each group as the primary owner of at least one claim.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getHandlers() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getHandlers();
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
   * Gets the value of the LOBCode field.
   * LOB this statistic is for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LOBCode getLOBCode() {
    return (typekey.LOBCode)__getInternalInterface().getFieldValue(LOBCODE_PROP.get());
  }
  
  /**
   * Gets the value of the Litigated field.
   * Number of litigated claims.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLitigated() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getLitigated();
  }
  
  /**
   * Gets the value of the LossType field.
   * LossType this statistic is for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType() {
    return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the NewClaims field.
   * Number of new claims opened in period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewClaims() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getNewClaims();
  }
  
  /**
   * Gets the value of the NewExposures field.
   * Number of new exposures opened in period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewExposures() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getNewExposures();
  }
  
  /**
   * Gets the value of the NewLitigation field.
   * Number of litigated claims in period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewLitigation() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getNewLitigation();
  }
  
  /**
   * Gets the value of the NewNoticeOnly field.
   * Number of new claims opened in period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewNoticeOnly() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getNewNoticeOnly();
  }
  
  /**
   * Gets the value of the NoticeOnly field.
   * Number of claims with IncidentReport = true.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNoticeOnly() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getNoticeOnly();
  }
  
  /**
   * Gets the value of the OpenClaims field.
   * Number of open claims.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOpenClaims() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getOpenClaims();
  }
  
  /**
   * Gets the value of the OpenExposures field.
   * Number of open exposures.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOpenExposures() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getOpenExposures();
  }
  
  /**
   * Gets the value of the OpenReserves field.
   * Open reserve amount for open claims.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOpenReserves() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getOpenReserves();
  }
  
  /**
   * Gets the value of the OverIncurredLimit field.
   * Number of claims that have incurred over a certain amount of money.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOverIncurredLimit() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getOverIncurredLimit();
  }
  
  /**
   */
  public java.math.BigDecimal getPaidInPeriod() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getPaidInPeriod();
  }
  
  /**
   */
  public java.math.BigDecimal getPaidOnClosed() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getPaidOnClosed();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RecoveredInPeriod field.
   * Recoveries made in this period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRecoveredInPeriod() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getRecoveredInPeriod();
  }
  
  /**
   * Gets the value of the ReopenedClaims field.
   * Number of claims reopened in period.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getReopenedClaims() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getReopenedClaims();
  }
  
  /**
   * Gets the value of the StatType field.
   * Whether this stat is for a group, LOB, losstype, or coveragetype.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DashboardStatType getStatType() {
    return (typekey.DashboardStatType)__getInternalInterface().getFieldValue(STATTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the TotalIncurredNet field.
   * Net total incurred for open claims.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalIncurredNet() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getTotalIncurredNet();
  }
  
  /**
   */
  public java.math.BigDecimal getTotalPaid() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getTotalPaid();
  }
  
  /**
   * Gets the value of the TtlIncNetMinusOpenRecReserves field.
   * Net total incurred minus open recovery reserves for open claims.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTtlIncNetMinusOpenRecReserves() {
    return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getTtlIncNetMinusOpenRecReserves();
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
   * Sets the value of the ClaimCostsInPeriod field.
   */
  public void setClaimCostsInPeriod(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CLAIMCOSTSINPERIOD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimCostsOnClosed field.
   */
  public void setClaimCostsOnClosed(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CLAIMCOSTSONCLOSED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimCostsPaid field.
   */
  public void setClaimCostsPaid(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(CLAIMCOSTSPAID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CloseTime field.
   */
  public void setCloseTime(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(CLOSETIME_PROP.get(), value);
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
   * Sets the value of the CoverageType field.
   */
  public void setCoverageType(typekey.CoverageType value) {
    __getInternalInterface().setFieldValue(COVERAGETYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpensesInPeriod field.
   */
  public void setExpensesInPeriod(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(EXPENSESINPERIOD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpensesOnClosed field.
   */
  public void setExpensesOnClosed(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(EXPENSESONCLOSED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ExpensesPaid field.
   */
  public void setExpensesPaid(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(EXPENSESPAID_PROP.get(), value);
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
   * Sets the value of the Handlers field.
   */
  public void setHandlers(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(HANDLERS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LOBCode field.
   */
  public void setLOBCode(typekey.LOBCode value) {
    __getInternalInterface().setFieldValue(LOBCODE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Litigated field.
   */
  public void setLitigated(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(LITIGATED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value) {
    __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NewClaims field.
   */
  public void setNewClaims(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NEWCLAIMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NewExposures field.
   */
  public void setNewExposures(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NEWEXPOSURES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NewLitigation field.
   */
  public void setNewLitigation(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NEWLITIGATION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NewNoticeOnly field.
   */
  public void setNewNoticeOnly(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NEWNOTICEONLY_PROP.get(), value);
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
   * Sets the value of the NoticeOnly field.
   */
  public void setNoticeOnly(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(NOTICEONLY_PROP.get(), value);
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
   * Sets the value of the OpenReserves field.
   */
  public void setOpenReserves(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(OPENRESERVES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the OverIncurredLimit field.
   */
  public void setOverIncurredLimit(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(OVERINCURREDLIMIT_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RecoveredInPeriod field.
   */
  public void setRecoveredInPeriod(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(RECOVEREDINPERIOD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReopenedClaims field.
   */
  public void setReopenedClaims(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(REOPENEDCLAIMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StatType field.
   */
  public void setStatType(typekey.DashboardStatType value) {
    __getInternalInterface().setFieldValue(STATTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalIncurredNet field.
   */
  public void setTotalIncurredNet(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TOTALINCURREDNET_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TtlIncNetMinusOpenRecReserves field.
   */
  public void setTtlIncNetMinusOpenRecReserves(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(TTLINCNETMINUSOPENRECRESERVES_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DashboardStatsInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.DashboardStats.this.__getDelegateManager();
    }
    
    /**
     * Adds the stats of the given stat to this stat.
     * @param stat 
     */
    public void addToStats(entity.DashboardStats stat) {
      ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).addToStats(stat);
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
     */
    public java.lang.Double getAvgCloseTime() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getAvgCloseTime();
    }
    
    /**
     */
    public java.math.BigDecimal getAvgIncurred() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getAvgIncurred();
    }
    
    /**
     */
    public java.math.BigDecimal getAvgPaidOnClosed() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getAvgPaidOnClosed();
    }
    
    /**
     */
    public java.lang.Double getAvgPending() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getAvgPending();
    }
    
    /**
     * Gets the value of the ClaimCostsInPeriod field.
     * Claim costs paid in this period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getClaimCostsInPeriod() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getClaimCostsInPeriod();
    }
    
    /**
     * Gets the value of the ClaimCostsOnClosed field.
     * Claim costs paid on claims closed in this period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getClaimCostsOnClosed() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getClaimCostsOnClosed();
    }
    
    /**
     * Gets the value of the ClaimCostsPaid field.
     * Claim costs paid on open claims.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getClaimCostsPaid() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getClaimCostsPaid();
    }
    
    /**
     * Gets the value of the CloseTime field.
     * Total of days from CreateDate to CloseDate for all claims closed in period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getCloseTime() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getCloseTime();
    }
    
    /**
     * Gets the value of the ClosedClaims field.
     * Number of claims closed in period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClosedClaims() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getClosedClaims();
    }
    
    /**
     * Gets the value of the ClosedExposures field.
     * Number of exposures closed in period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getClosedExposures() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getClosedExposures();
    }
    
    /**
     * Gets the value of the CoverageType field.
     * CoverageType this statistic is for.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CoverageType getCoverageType() {
      return (typekey.CoverageType)__getInternalInterface().getFieldValue(COVERAGETYPE_PROP.get());
    }
    
    /**
     * Gets the value of the ExpensesInPeriod field.
     * Expenses paid in this period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getExpensesInPeriod() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getExpensesInPeriod();
    }
    
    /**
     * Gets the value of the ExpensesOnClosed field.
     * Expenses paid on claims closed in this period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getExpensesOnClosed() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getExpensesOnClosed();
    }
    
    /**
     * Gets the value of the ExpensesPaid field.
     * Expenses paid on open claims.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getExpensesPaid() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getExpensesPaid();
    }
    
    /**
     * Gets the value of the Flagged field.
     * Number of claims with Flagged = isFlagged.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getFlagged() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getFlagged();
    }
    
    /**
     * Gets the value of the Group field.
     * Group this statistic is for.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Group getGroup() {
      return (entity.Group)__getInternalInterface().getFieldValue(GROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(GROUP_PROP.get());
    }
    
    /**
     * Gets the value of the Handlers field.
     * Number of users in each group as the primary owner of at least one claim.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getHandlers() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getHandlers();
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
     * Gets the value of the LOBCode field.
     * LOB this statistic is for.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LOBCode getLOBCode() {
      return (typekey.LOBCode)__getInternalInterface().getFieldValue(LOBCODE_PROP.get());
    }
    
    /**
     * Gets the value of the Litigated field.
     * Number of litigated claims.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getLitigated() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getLitigated();
    }
    
    /**
     * Gets the value of the LossType field.
     * LossType this statistic is for.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LossType getLossType() {
      return (typekey.LossType)__getInternalInterface().getFieldValue(LOSSTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the NewClaims field.
     * Number of new claims opened in period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNewClaims() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getNewClaims();
    }
    
    /**
     * Gets the value of the NewExposures field.
     * Number of new exposures opened in period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNewExposures() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getNewExposures();
    }
    
    /**
     * Gets the value of the NewLitigation field.
     * Number of litigated claims in period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNewLitigation() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getNewLitigation();
    }
    
    /**
     * Gets the value of the NewNoticeOnly field.
     * Number of new claims opened in period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNewNoticeOnly() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getNewNoticeOnly();
    }
    
    /**
     * Gets the value of the NoticeOnly field.
     * Number of claims with IncidentReport = true.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getNoticeOnly() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getNoticeOnly();
    }
    
    /**
     * Gets the value of the OpenClaims field.
     * Number of open claims.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOpenClaims() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getOpenClaims();
    }
    
    /**
     * Gets the value of the OpenExposures field.
     * Number of open exposures.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOpenExposures() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getOpenExposures();
    }
    
    /**
     * Gets the value of the OpenReserves field.
     * Open reserve amount for open claims.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getOpenReserves() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getOpenReserves();
    }
    
    /**
     * Gets the value of the OverIncurredLimit field.
     * Number of claims that have incurred over a certain amount of money.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getOverIncurredLimit() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getOverIncurredLimit();
    }
    
    /**
     */
    public java.math.BigDecimal getPaidInPeriod() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getPaidInPeriod();
    }
    
    /**
     */
    public java.math.BigDecimal getPaidOnClosed() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getPaidOnClosed();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RecoveredInPeriod field.
     * Recoveries made in this period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getRecoveredInPeriod() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getRecoveredInPeriod();
    }
    
    /**
     * Gets the value of the ReopenedClaims field.
     * Number of claims reopened in period.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getReopenedClaims() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getReopenedClaims();
    }
    
    /**
     * Gets the value of the StatType field.
     * Whether this stat is for a group, LOB, losstype, or coveragetype.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DashboardStatType getStatType() {
      return (typekey.DashboardStatType)__getInternalInterface().getFieldValue(STATTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the TotalIncurredNet field.
     * Net total incurred for open claims.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTotalIncurredNet() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getTotalIncurredNet();
    }
    
    /**
     */
    public java.math.BigDecimal getTotalPaid() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getTotalPaid();
    }
    
    /**
     * Gets the value of the TtlIncNetMinusOpenRecReserves field.
     * Net total incurred minus open recovery reserves for open claims.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getTtlIncNetMinusOpenRecReserves() {
      return ((gw.cc.statistics.entity.DashboardStats)__getDelegateManager().getImplementation("gw.cc.statistics.entity.DashboardStats")).getTtlIncNetMinusOpenRecReserves();
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
     * Sets the value of the ClaimCostsInPeriod field.
     */
    public void setClaimCostsInPeriod(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CLAIMCOSTSINPERIOD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimCostsOnClosed field.
     */
    public void setClaimCostsOnClosed(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CLAIMCOSTSONCLOSED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimCostsPaid field.
     */
    public void setClaimCostsPaid(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(CLAIMCOSTSPAID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CloseTime field.
     */
    public void setCloseTime(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(CLOSETIME_PROP.get(), value);
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
     * Sets the value of the CoverageType field.
     */
    public void setCoverageType(typekey.CoverageType value) {
      __getInternalInterface().setFieldValue(COVERAGETYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpensesInPeriod field.
     */
    public void setExpensesInPeriod(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(EXPENSESINPERIOD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpensesOnClosed field.
     */
    public void setExpensesOnClosed(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(EXPENSESONCLOSED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ExpensesPaid field.
     */
    public void setExpensesPaid(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(EXPENSESPAID_PROP.get(), value);
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
     * Sets the value of the Handlers field.
     */
    public void setHandlers(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(HANDLERS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LOBCode field.
     */
    public void setLOBCode(typekey.LOBCode value) {
      __getInternalInterface().setFieldValue(LOBCODE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the Litigated field.
     */
    public void setLitigated(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(LITIGATED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LossType field.
     */
    public void setLossType(typekey.LossType value) {
      __getInternalInterface().setFieldValue(LOSSTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NewClaims field.
     */
    public void setNewClaims(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NEWCLAIMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NewExposures field.
     */
    public void setNewExposures(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NEWEXPOSURES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NewLitigation field.
     */
    public void setNewLitigation(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NEWLITIGATION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NewNoticeOnly field.
     */
    public void setNewNoticeOnly(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NEWNOTICEONLY_PROP.get(), value);
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
     * Sets the value of the NoticeOnly field.
     */
    public void setNoticeOnly(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(NOTICEONLY_PROP.get(), value);
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
     * Sets the value of the OpenReserves field.
     */
    public void setOpenReserves(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(OPENRESERVES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OverIncurredLimit field.
     */
    public void setOverIncurredLimit(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(OVERINCURREDLIMIT_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RecoveredInPeriod field.
     */
    public void setRecoveredInPeriod(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(RECOVEREDINPERIOD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReopenedClaims field.
     */
    public void setReopenedClaims(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(REOPENEDCLAIMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the StatType field.
     */
    public void setStatType(typekey.DashboardStatType value) {
      __getInternalInterface().setFieldValue(STATTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalIncurredNet field.
     */
    public void setTotalIncurredNet(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TOTALINCURREDNET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TtlIncNetMinusOpenRecReserves field.
     */
    public void setTtlIncNetMinusOpenRecReserves(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(TTLINCNETMINUSOPENRECRESERVES_PROP.get(), value);
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
    config.put("gw.cc.statistics.entity.DashboardStats", "com.guidewire.cc.domain.statistics.impl.DashboardStatsImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.DashboardStats.class, config);
    com.guidewire._generated.entity.DashboardStatsInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.DashboardStats, com.guidewire._generated.entity.DashboardStatsInternal>() {
      public java.lang.Object getImplementation(entity.DashboardStats bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DashboardStatsInternal getInternalInterface(entity.DashboardStats bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.DashboardStats newEmptyInstance() {
        return new entity.DashboardStats((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}