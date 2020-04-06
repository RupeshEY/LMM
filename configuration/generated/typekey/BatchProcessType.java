package typekey;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BatchProcessType.tti;BatchProcessType.tix;BatchProcessType.ttx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
public class BatchProcessType implements gw.entity.TypeKey {
  /**
   * Activity Escalation
   * Activity escalation monitor
   */
  public static final typekey.BatchProcessType TC_ACTIVITYESC = new typekey.BatchProcessType("ActivityEsc");
  
  /**
   * Address Delete
   * Attempt to retire a Address marked as possibly deletable.
   */
  public static final typekey.BatchProcessType TC_ADDRESSDELETE = new typekey.BatchProcessType("AddressDelete");
  
  /**
   * Aggregate Limit Calculations
   * Aggregate limit calculations
   */
  public static final typekey.BatchProcessType TC_AGGLIMITCALC = new typekey.BatchProcessType("AggLimitCalc");
  
  /**
   * Aggregate Limit Loader Calculations
   * Aggregate limit loader calculations
   */
  @java.lang.Deprecated
  public static final typekey.BatchProcessType TC_AGGLIMITLOADERCALC = new typekey.BatchProcessType("AggLimitLoaderCalc");
  
  /**
   * Archiving Item Writer
   * Archiving item writer
   */
  public static final typekey.BatchProcessType TC_ARCHIVE = new typekey.BatchProcessType("Archive");
  
  /**
   * BackOutRollingUpgrade
   * Back out a rolling upgrade
   */
  public static final typekey.BatchProcessType TC_BACKOUTROLLINGUPGRADE = new typekey.BatchProcessType("BackOutRollingUpgrade");
  
  /**
   * Business Rules Export/Import
   * Exports and imports business rules
   */
  public static final typekey.BatchProcessType TC_BIZRULESEXPORTIMPORT = new typekey.BatchProcessType("BizRulesExportImport");
  
  /**
   * Business Rules Validator
   * Validates business rules
   */
  public static final typekey.BatchProcessType TC_BIZRULESVALIDATOR = new typekey.BatchProcessType("BizRulesValidator");
  
  /**
   * Bulk Invoice Escalation
   * Escalate Bulk Invoices from Awaiting-submission status to Requesting status
   */
  public static final typekey.BatchProcessType TC_BULKINVOICEESC = new typekey.BatchProcessType("BulkInvoiceEsc");
  
  /**
   * Bulk Invoice Submission
   * Processes bulk invoice items for bulk invoice submission.
   */
  public static final typekey.BatchProcessType TC_BULKINVOICESUBMISSION = new typekey.BatchProcessType("BulkInvoiceSubmission");
  
  /**
   * Bulk Invoice Workflow Monitor
   * Transitions invoices from PendingInvoiceItemValidation status to 'AwaitingSubmission' or 'InvalidInvoiceItems' status once the invoice is ready
   */
  public static final typekey.BatchProcessType TC_BULKINVOICEWF = new typekey.BatchProcessType("BulkInvoiceWF");
  
  /**
   * BulkPurge
   * Purge records through table updates
   */
  public static final typekey.BatchProcessType TC_BULKPURGE = new typekey.BatchProcessType("BulkPurge");
  
  /**
   * Catastrophe Claim Finder
   * Finds possible claims related to a catastrophe and creates a 'Review for Catastrophe' activity on the claim.
   */
  public static final typekey.BatchProcessType TC_CATASTROPHECLAIMFINDER = new typekey.BatchProcessType("CatastropheClaimFinder");
  
  /**
   * Catastrophe Policy Location Download
   * Downloads PolicyLocationSummary data for catastrophes from the policy system
   */
  public static final typekey.BatchProcessType TC_CATASTROPHEPOLICYLOCATIONDOWNLOAD = new typekey.BatchProcessType("CatastrophePolicyLocationDownload");
  
  /**
   * Claim Contacts Calculations
   * Claim contacts calculations
   */
  public static final typekey.BatchProcessType TC_CLAIMCONTACTSCALC = new typekey.BatchProcessType("ClaimContactsCalc");
  
  /**
   * Claim Exception
   * Claim exception monitor
   */
  public static final typekey.BatchProcessType TC_CLAIMEXCEPTION = new typekey.BatchProcessType("ClaimException");
  
  /**
   * Claim Health Calculations
   * Calculates health indictators and metrics for all claims that do not have any metrics calculated
   */
  public static final typekey.BatchProcessType TC_CLAIMHEALTHCALC = new typekey.BatchProcessType("ClaimHealthCalc");
  
  /**
   * Bulk claim validation
   * Bulk claim validation work queue writer.  Creates workitems to schedule loaded claims for validation. See ClaimAPI.bulkValidate()
   */
  public static final typekey.BatchProcessType TC_CLAIMVALIDATION = new typekey.BatchProcessType("ClaimValidation");
  
  /**
   * ContactAutoSync
   * Automatically synchronize the local contacts that are out of sync and marked 'allow' auto-sync.
   */
  public static final typekey.BatchProcessType TC_CONTACTAUTOSYNC = new typekey.BatchProcessType("ContactAutoSync");
  
  /**
   * Contact Retire
   * Attempt to retire a Contacts marked as possibly retireable.
   */
  public static final typekey.BatchProcessType TC_CONTACTRETIRE = new typekey.BatchProcessType("ContactRetire");
  
  /**
   * Loader Create Indexes
   * Recreate perf-only indexes when the loader finishes the big insert/select from staging to operational tables
   */
  public static final typekey.BatchProcessType TC_CREATEPERFONLYINDEXES = new typekey.BatchProcessType("CreatePerfOnlyIndexes");
  
  /**
   * Dashboard Statistics
   * Statistics for the executive dashboard
   */
  public static final typekey.BatchProcessType TC_DASHBOARDSTATISTICS = new typekey.BatchProcessType("DashboardStatistics");
  
  /**
   * Data Distribution
   * Data distribution for the database
   */
  public static final typekey.BatchProcessType TC_DATADISTRIBUTION = new typekey.BatchProcessType("DataDistribution");
  
  /**
   * Database Consistency Check
   * Database consistency checks
   */
  public static final typekey.BatchProcessType TC_DBCONSISTENCYCHECK = new typekey.BatchProcessType("DBConsistencyCheck");
  
  /**
   * Database statistics
   * Database statistics
   */
  public static final typekey.BatchProcessType TC_DBSTATS = new typekey.BatchProcessType("DBStats");
  
  /**
   * DeferredUpgradeTasks
   * Execute database upgrade tasks that were deferred
   */
  public static final typekey.BatchProcessType TC_DEFERREDUPGRADETASKS = new typekey.BatchProcessType("DeferredUpgradeTasks");
  
  /**
   * Encryption Upgrade
   * Upgrades encryption for entity fields
   */
  public static final typekey.BatchProcessType TC_ENCRYPTIONUPGRADE = new typekey.BatchProcessType("EncryptionUpgrade");
  
  /**
   * Exchange Rate
   * Creates a new ExchangeRateSet using ExchangeRateSetPlugin
   */
  public static final typekey.BatchProcessType TC_EXCHANGERATE = new typekey.BatchProcessType("ExchangeRate");
  
  /**
   * Financials Calculations
   * Financials calculations
   */
  public static final typekey.BatchProcessType TC_FINANCIALSCALC = new typekey.BatchProcessType("FinancialsCalc");
  
  /**
   * Financials Escalation
   * Financials escalation monitor - escalates checks from Awaiting-submission status to Requesting status so that the downstream system will be alerted
   */
  public static final typekey.BatchProcessType TC_FINANCIALSESC = new typekey.BatchProcessType("FinancialsEsc");
  
  /**
   * FindUsagesOfUpgradedTypecodes
   * During the back out of a rolling upgrade, looks for typecodes that were inserted during the rolling upgrade. These usages need to be fixed before we can back out.
   */
  public static final typekey.BatchProcessType TC_FINDUSAGESOFUPGRADEDTYPECODES = new typekey.BatchProcessType("FindUsagesOfUpgradedTypecodes");
  
  /**
   * Geocode Writer
   * Geocoding Addresses queue writer.
   */
  public static final typekey.BatchProcessType TC_GEOCODE = new typekey.BatchProcessType("Geocode");
  
  /**
   * Group Exception
   * Group exception monitor
   */
  public static final typekey.BatchProcessType TC_GROUPEXCEPTION = new typekey.BatchProcessType("GroupException");
  
  /**
   * Idle Claim Exception
   * Idle claim exception monitor
   */
  public static final typekey.BatchProcessType TC_IDLECLAIM = new typekey.BatchProcessType("IdleClaim");
  
  /**
   * Idle Closed Claim Exception
   * Idle closed claim exception monitor
   */
  public static final typekey.BatchProcessType TC_IDLECLOSEDCLAIM = new typekey.BatchProcessType("IdleClosedClaim");
  
  /**
   * Microsoft DMV Report
   * Microsoft database DMV performance report generation
   */
  public static final typekey.BatchProcessType TC_MSDMVREPORT = new typekey.BatchProcessType("MSDMVReport");
  
  /**
   * Oracle AWR Report
   * Oracle database AWR performance report generation
   */
  public static final typekey.BatchProcessType TC_ORAAWRREPORT = new typekey.BatchProcessType("OraAWRReport");
  
  /**
   * Phone number normalizer
   * Performs a normalization of phone numbers contact
   */
  public static final typekey.BatchProcessType TC_PHONENUMBERNORMALIZER = new typekey.BatchProcessType("PhoneNumberNormalizer");
  
  /**
   * Populate searchColumn columns
   * Populate searchColumn columns from their original sources.
   */
  public static final typekey.BatchProcessType TC_POPULATESEARCHCOLUMNS = new typekey.BatchProcessType("PopulateSearchColumns");
  
  /**
   * Populate Denormalized User Search Column SpatialPointDenorm
   * Populates the denormalized search column User.SpatialPointDenorm from Address.SpatialPoint
   */
  public static final typekey.BatchProcessType TC_POPULATEUSERDENORMSEARCHCOLUMN = new typekey.BatchProcessType("PopulateUserDenormSearchColumn");
  
  /**
   * Process Completion Monitor
   * Invoke plugin on completion of monitored worker queue
   */
  public static final typekey.BatchProcessType TC_PROCESSCOMPLETIONMONITOR = new typekey.BatchProcessType("ProcessCompletionMonitor");
  
  /**
   * ProcessHistoryPurge
   * Purge batch process history data
   */
  public static final typekey.BatchProcessType TC_PROCESSHISTORYPURGE = new typekey.BatchProcessType("ProcessHistoryPurge");
  
  /**
   * Purge Cluster Members
   * Purge old ClusterMember entities
   */
  public static final typekey.BatchProcessType TC_PURGECLUSTERMEMBERS = new typekey.BatchProcessType("PurgeClusterMembers");
  
  /**
   * Purge Failed Work Items
   * Purge failed work items from all queues.
   */
  public static final typekey.BatchProcessType TC_PURGEFAILEDWORKITEMS = new typekey.BatchProcessType("PurgeFailedWorkItems");
  
  /**
   * Purge Message History
   * Purges old messages from the message history table
   */
  public static final typekey.BatchProcessType TC_PURGEMESSAGEHISTORY = new typekey.BatchProcessType("PurgeMessageHistory");
  
  /**
   * Purge Profiler Data
   * Purge profiler data at regular intervals
   */
  public static final typekey.BatchProcessType TC_PURGEPROFILERDATA = new typekey.BatchProcessType("PurgeProfilerData");
  
  /**
   * Purge old transaction ids
   * Purge external transaction id that no longer need to be tracked, by age.
   */
  public static final typekey.BatchProcessType TC_PURGETRANSACTIONIDS = new typekey.BatchProcessType("PurgeTransactionIds");
  
  /**
   * Purge Workflow Logs
   * Purge completed workflows logs, this executes gw.processes.PurgeWorkflowLogs.gs
   */
  public static final typekey.BatchProcessType TC_PURGEWORKFLOWLOGS = new typekey.BatchProcessType("PurgeWorkflowLogs");
  
  /**
   * Purge Workflow
   * Purge completed workflows after resetting any referenced workflows, this executes gw.processes.PurgeWorkflow.gs
   */
  public static final typekey.BatchProcessType TC_PURGEWORKFLOWS = new typekey.BatchProcessType("PurgeWorkflows");
  
  /**
   * Recalculate Claim Metrics
   * Recalculates claim metrics for claims whose metric update time has passed.
   */
  public static final typekey.BatchProcessType TC_RECALCULATEMETRICS = new typekey.BatchProcessType("RecalculateMetrics");
  
  /**
   * Retired Policy Graph Disconnector
   * Disconnects claim graph objects from retired policy objects so that those claims can be archived
   */
  public static final typekey.BatchProcessType TC_RETIREDPOLICYGRAPHDISCONNECTOR = new typekey.BatchProcessType("RetiredPolicyGraphDisconnector");
  
  /**
   * ClaimCenter (SPM) Completed Review Sync
   * Transmits completed reviews to ContactManager.
   */
  public static final typekey.BatchProcessType TC_REVIEWSYNC = new typekey.BatchProcessType("ReviewSync");
  
  /**
   * Service Metric Escalation
   * Escalates service metrics when they have exceeded an upper limit
   */
  public static final typekey.BatchProcessType TC_SERVICEREQUESTMETRICESCALATION = new typekey.BatchProcessType("ServiceRequestMetricEscalation");
  
  /**
   * Solr Data Import
   * Performs a full data import of the app database into the Solr/Lucene index
   */
  public static final typekey.BatchProcessType TC_SOLRDATAIMPORT = new typekey.BatchProcessType("SolrDataImport");
  
  /**
   * Staging Table Import
   * Asynchronous operation on staging tables (encrypt, statistics, integrity check, load, delete excluded, populate excluded)
   */
  public static final typekey.BatchProcessType TC_STAGINGTABLEIMPORT = new typekey.BatchProcessType("StagingTableImport");
  
  /**
   * Statistics
   * Statistics calculator
   */
  public static final typekey.BatchProcessType TC_STATISTICS = new typekey.BatchProcessType("Statistics");
  
  /**
   * Stat Report Writer
   * Stat Report work queue writer
   */
  public static final typekey.BatchProcessType TC_STATREPORT = new typekey.BatchProcessType("StatReport");
  
  /**
   * TAccounts Escalation
   * TAccounts escalation monitor to transition payments and reserves from FutureDated state to Awaiting-submission state
   */
  public static final typekey.BatchProcessType TC_TACCOUNTESC = new typekey.BatchProcessType("TAccountEsc");
  
  /**
   * User Exception
   * User exception monitor
   */
  public static final typekey.BatchProcessType TC_USEREXCEPTION = new typekey.BatchProcessType("UserException");
  
  /**
   * User Workload Update
   * Updates user weighted workload
   */
  public static final typekey.BatchProcessType TC_USERWORKLOADUPDATE = new typekey.BatchProcessType("UserWorkloadUpdate");
  
  /**
   * Workflow
   * Workflows work queue writer.
   */
  public static final typekey.BatchProcessType TC_WORKFLOW = new typekey.BatchProcessType("Workflow");
  
  /**
   * WorkItemSetPurge
   * Purge WorkItemSet data
   */
  public static final typekey.BatchProcessType TC_WORKITEMSETPURGE = new typekey.BatchProcessType("WorkItemSetPurge");
  
  /**
   * WorkQueueInstrumentationPurge
   * Purge instrumentation data for work queues
   */
  public static final typekey.BatchProcessType TC_WORKQUEUEINSTRUMENTATIONPURGE = new typekey.BatchProcessType("WorkQueueInstrumentationPurge");
  
  public static final gw.pl.persistence.type.TypeListTypeReference<typekey.BatchProcessType> TYPE = new com.guidewire.commons.metadata.types.TypeListIntrinsicTypeCache<typekey.BatchProcessType>("BatchProcessType");
  
  private final com.guidewire.commons.typelist.TypeKeyImplManager _typeKeyImplManager;
  
  private BatchProcessType(java.lang.String code)  {
    _typeKeyImplManager  =  com.guidewire.commons.typelist.TypeKeyImplManager.newInstance(this, code);
  }
  
  public int compareTo(gw.entity.TypeKey arg0) {
    return _typeKeyImplManager.getTypeKeyImpl().compareTo(arg0);
  }
  
  /**
   * 
   * @deprecated Use this object instead.
   */
  @java.lang.Deprecated
  public typekey.BatchProcessType get() {
    return this;
  }
  
  public static typekey.BatchProcessType get(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  public static java.util.List<typekey.BatchProcessType> getAllTypeKeys() {
    return TYPE.get().getTypeKeys(true);
  }
  
  /**
   * Returns the list of categories that this key belongs to
   * @return the categories that this key belongs to
   */
  public gw.entity.TypeKey[] getCategories() {
    return _typeKeyImplManager.getTypeKeyImpl().getCategories();
  }
  
  public java.lang.String getCode() {
    return _typeKeyImplManager.getCode();
  }
  
  /**
   * Returns the description for this typekey for the current locale.
   * @return the description for this typekey
   */
  public java.lang.String getDescription() {
    return _typeKeyImplManager.getTypeKeyImpl().getDescription();
  }
  
  /**
   * Returns the description of this typekey for the given locale.
   * @param locale the locale to use to get the description
   * @return a description for this typekey for the given locale
   */
  public java.lang.String getDescription(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getDescription(locale);
  }
  
  public java.lang.String getDisplayName() {
    return _typeKeyImplManager.getTypeKeyImpl().getDisplayName();
  }
  
  /**
   * Returns the name of this typekey for the given locale.
   * @param locale 
   */
  public java.lang.String getDisplayName(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getDisplayName(locale);
  }
  
  /**
   * Gets the entity type associated with this typekey, if any. Returns null if this is not a subtype typekey.
   */
  public gw.entity.IEntityType getEntityType() {
    return _typeKeyImplManager.getTypeKeyImpl().getEntityType();
  }
  
  /**
   * Returns the owning type for this key.
   * @return 
   */
  public gw.entity.ITypeList getIntrinsicType() {
    return _typeKeyImplManager.getTypeKeyImpl().getIntrinsicType();
  }
  
  /**
   * A string containing the typelist name.
   */
  public java.lang.String getListName() {
    return _typeKeyImplManager.getTypeKeyImpl().getListName();
  }
  
  /**
   * Returns the value of the "name" attribute for this typekey.
   * @return the name of this typekey
   * @deprecated Use {@link #getDisplayName()} or {@link #getUnlocalizedName()} instead, as appropriate.
   */
  @java.lang.Deprecated
  public java.lang.String getName() {
    return _typeKeyImplManager.getTypeKeyImpl().getName();
  }
  
  public int getOrdinal() {
    return _typeKeyImplManager.getTypeKeyImpl().getOrdinal();
  }
  
  /**
   * Returns the priority for this type key
   * @return the priority for this type key
   */
  public int getPriority() {
    return _typeKeyImplManager.getTypeKeyImpl().getPriority();
  }
  
  /**
   * Returns the sort order for this type key in the specified language.
   * @param locale 
   * @return the sort order for this type key
   */
  public int getSortOrder(gw.i18n.ILocale locale) {
    return _typeKeyImplManager.getTypeKeyImpl().getSortOrder(locale);
  }
  
  public static typekey.BatchProcessType getTypeKey(java.lang.String code) {
    return TYPE.get().getTypeKey(code);
  }
  
  /**
   * All of the typekeys in this list, including retired typekeys.
   * @deprecated Use getTypeKeys(boolean)
   */
  @java.lang.Deprecated
  public static typekey.BatchProcessType[] getTypeKeys() {
    return TYPE.get().getTypeKeys(true).toArray(new typekey.BatchProcessType[]{});
  }
  
  public static java.util.List<typekey.BatchProcessType> getTypeKeys(boolean includeRetired) {
    return TYPE.get().getTypeKeys(includeRetired);
  }
  
  /**
   * Returns the (non-localized) description of this typekey. Generally should not be used by application code. To get a
   * displayable string, use {@link #getDescription()} instead.
   * @return the non-localized description of this typekey
   */
  public java.lang.String getUnlocalizedDescription() {
    return _typeKeyImplManager.getTypeKeyImpl().getUnlocalizedDescription();
  }
  
  /**
   * Returns the (non-localized) name of this typekey. Generally should not be used by application code. To get a
   * displayable string, use {@link #getDisplayName()} instead. To get a unique string identifier for this typekey,
   * use {@link #getCode()} instead.
   * @return the non-localized name of this typekey
   */
  public java.lang.String getUnlocalizedName() {
    return _typeKeyImplManager.getTypeKeyImpl().getUnlocalizedName();
  }
  
  public typekey.BatchProcessType getValue() {
    return this;
  }
  
  /**
   * Checks to see if this typekey has a category corresponding to the given
   * typekey.  For a match to be found, this typekey has to have a category
   * with the same typelist and code as the given typekey.
   * @param categoryToCheck 
   * @return 
   */
  public boolean hasCategory(gw.entity.TypeKey categoryToCheck) {
    return _typeKeyImplManager.getTypeKeyImpl().hasCategory(categoryToCheck);
  }
  
  /**
   * A boolean that indicates a type code is for internal use by Guidewire software. Internal type codes cannot be
   * removed or modified.
   */
  public boolean isInternal() {
    return _typeKeyImplManager.getTypeKeyImpl().isInternal();
  }
  
  /**
   * Returns true if this type key is retired.  Retired type keys will not show up in the UI.
   * @return true if this type key is retired false if not.
   */
  public boolean isRetired() {
    return _typeKeyImplManager.getTypeKeyImpl().isRetired();
  }
  
  private java.lang.Object readObject(java.io.ObjectInputStream in) throws java.io.InvalidObjectException {
    throw new java.io.InvalidObjectException("Proxy required");
  }
  
  public java.lang.String toString() {
    return getDisplayName();
  }
  
  private java.lang.Object writeReplace() {
    return new com.guidewire.commons.typelist.TypeKeySerializationProxy(this);
  }
  
  static {
    com.guidewire._generated.typekey.BatchProcessTypeInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.TypeKeyFriendAccess<typekey.BatchProcessType>() {
      public void clearCache(typekey.BatchProcessType typeKey) {
        typeKey._typeKeyImplManager.resetTypeKeyImpl();
      }
      
      public com.guidewire.commons.entity.type2.TypeKeyInternal getInternalInterface(typekey.BatchProcessType typeKey) {
        return typeKey._typeKeyImplManager.getTypeKeyImpl();
      }
      
      public typekey.BatchProcessType newInstance(java.lang.String code) {
        return new typekey.BatchProcessType(code);
      }
      
      
    });
  }
}