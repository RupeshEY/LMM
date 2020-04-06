package entity;

/**
 * RICededReserve
 * 
 *     A subtype of <code>RITransaction</code> that indicates an Amount of Reserves attributable to a particular RIAgreement.
 *     In other words, we have created Reserves, and if we pay out all that money, the reinsurer behind the RIAgreement will be obligated to
 *     reimburse us for this amount according to the RI treaty. It is a heads up about potential reinsurer liability.
 *     Like both types of RITransactions, RICededReserves behave similar to Reserve transactions as entities: they are immutable,
 *     and so multiple positive or negative transactions are created to adjust the total on a particular RICoding.
 *     To get the Total Ceded Reserves and other RI financials calculations,
 *     use the <code>FinancialsCalculationUtil</code> class.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RICededReserve.eti;RICededReserve.eix;RICededReserve.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "RICededReserve")
public class RICededReserve extends entity.RITransaction {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RICededReserve> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RICededReserve>("entity.RICededReserve");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public RICededReserve()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public RICededReserve(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected RICededReserve(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.RICededReserveInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.RICededReserveInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.RICededReserveInternal)super.__getInternalInterface();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.RICededReserveInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.RICededReserve.this.__getDelegateManager();
    }
    
    /**
     * Acknowledges a message that this transaction was submitted.
     * Updates its status to SUBMITTED.
     * @throws IllegalStateException if this transaction is not in SUBMITTING status
     */
    public void acknowledgeSubmission() {
      ((gw.cc.financials.entity.RITransaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransaction")).acknowledgeSubmission();
    }
    
    public void addEvent(com.guidewire.pl.system.entity.BeanEvent event) {
      ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).addEvent(event);
    }
    
    /**
     * Associates an event with the bean, which will be fired when the bean is
     * committed. A bean with an event is considered changed.
     * @param strEventId The event id.
     */
    public void addEvent(java.lang.String strEventId) {
      ((com.guidewire.pl.domain.messaging.EventAwarePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.EventAwarePublicMethods")).addEvent(strEventId);
    }
    
    /**
     * Adds the given element to the TAccountTransactions array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTAccountTransactions(entity.RITAccountTransaction element) {
      __getInternalInterface().addArrayElement(TACCOUNTTRANSACTIONS_PROP.get(), element);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void beforeInsert() {
      ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
    }
    
    public void beforeUpdate() {
      ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
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
    
    public entity.TAccountTransactionDelegate createTAccountTransaction(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type, entity.TAccountTransactionDelegate currentLatestTAcctTxn) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).createTAccountTransaction(type, currentLatestTAcctTxn);
    }
    
    public void creditTAccount(entity.TAccountDelegate account, boolean useOldAmount) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).creditTAccount(account, useOldAmount);
    }
    
    public void debitTAccount(entity.TAccountDelegate account, boolean useOldAmount) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).debitTAccount(account, useOldAmount);
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public entity.TAccountLineItemDelegate findExistingCreditNeedingDebitingOffset(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type, entity.TAccountDelegate account) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).findExistingCreditNeedingDebitingOffset(type, account);
    }
    
    public entity.TAccountLineItemDelegate findExistingDebitNeedingCreditingOffset(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type, entity.TAccountDelegate account) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).findExistingDebitNeedingCreditingOffset(type, account);
    }
    
    public java.util.List generateInsertEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateInsertEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List generateRemoveEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateRemoveEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List generateUpdateEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateUpdateEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Claim field.
     * The related claim.<p>Setting the claim also sets this transaction's currency (if null) to the claim's currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimAmount field.
     * The amount of this RITransaction in the Claim's currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getClaimAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(CLAIMAMOUNT_PROP.get());
    }
    
    public gw.api.financials.CurrencyAmount getClaimAmountForTAccounts(boolean useOldAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getClaimAmountForTAccounts(useOldAmount);
    }
    
    /**
     * The currency of this transaction's claim.
     * @return currency of the claim
     */
    public typekey.Currency getClaimCurrency() {
      return ((gw.cc.financials.entity.RITransaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.RITransaction")).getClaimCurrency();
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimToReportingExchangeRate field.
     * ExchangeRate to use when converting ClaimAmount to ReportingAmount. This must be null when the server is configured to run in single-currency mode and non-null otherwise.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ExchangeRate getClaimToReportingExchangeRate() {
      return (entity.ExchangeRate)__getInternalInterface().getFieldValue(CLAIMTOREPORTINGEXCHANGERATE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimToReportingExchangeRateID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMTOREPORTINGEXCHANGERATE_PROP.get());
    }
    
    /**
     * Gets the value of the Comments field.
     * Comments about the transaction, such as a reason.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getComments() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
    }
    
    /**
     * Gets the value of the CostCategory field.
     * The CostCategory for this transaction.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CostCategory getCostCategory() {
      return (typekey.CostCategory)__getInternalInterface().getFieldValue(COSTCATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the CostType field.
     * Type of cost (for example, claim cost or adjusting overhead).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CostType getCostType() {
      return (typekey.CostType)__getInternalInterface().getFieldValue(COSTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the CreateTime field.
     * Timestamp when the object was created
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUser field.
     * User who created the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEUSER_PROP.get());
    }
    
    public gw.entity.IArrayPropertyInfo getCreditingLineItemsProperty(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getCreditingLineItemsProperty(type);
    }
    
    public gw.entity.ILinkPropertyInfo getCreditingTransactionFKProperty(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getCreditingTransactionFKProperty(type);
    }
    
    public gw.entity.IArrayPropertyInfo getDebitingLineItemsProperty(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getDebitingLineItemsProperty(type);
    }
    
    public gw.entity.ILinkPropertyInfo getDebitingTransactionFKProperty(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getDebitingTransactionFKProperty(type);
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the Exposure field.
     * The related exposure.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Exposure getExposure() {
      return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getExposureID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EXPOSURE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    public entity.TAccountTransactionDelegate getLatestTAccountTransaction(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).getLatestTAccountTransaction(type);
    }
    
    /**
     * Gets the value of the LifeCycleState field.
     * Current internal lifecycle state of the transaction. Changing state affects T-accounts.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TransactionLifeCycleState getLifeCycleState() {
      return (typekey.TransactionLifeCycleState)__getInternalInterface().getFieldValue(LIFECYCLESTATE_PROP.get());
    }
    
    public java.util.Map<gw.cc.financials.taccount.entity.TransactionTAccountOperationsDelegate.TLCStatePair, com.guidewire.cc.domain.financials.TransactionLifeCycleTransition> getLifeCycleStateTransitionMap() {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getLifeCycleStateTransitionMap();
    }
    
    public java.util.Map<gw.cc.financials.taccount.entity.TransactionTAccountOperationsDelegate.TLCStatePair, com.guidewire.cc.domain.financials.TransactionLifeCycleTransition> getLifeCycleStateTransitionMapInternal() {
      return ((com.guidewire.cc.domain.financials.impl.RITransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.RITransactionInternal")).getLifeCycleStateTransitionMapInternal();
    }
    
    public entity.TAccountTransactionDelegate getOrCreateTAccountTransactionForTAccountUpdate(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type, boolean createNew) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).getOrCreateTAccountTransactionForTAccountUpdate(type, createNew);
    }
    
    public typekey.TransactionLifeCycleState getProperLifeCycleState() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).getProperLifeCycleState();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RIAgreement field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RIAgreement getRIAgreement() {
      return (entity.RIAgreement)__getInternalInterface().getFieldValue(RIAGREEMENT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRIAgreementID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RIAGREEMENT_PROP.get());
    }
    
    /**
     * Gets the value of the RICoding field.
     * The RICoding on which this RI transaction is coded. The Claim, Exposure, CostType, CostCategory, and RIAgreement fields on an RI transaction match those same fields on its RICoding.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RICoding getRICoding() {
      return (entity.RICoding)__getInternalInterface().getFieldValue(RICODING_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRICodingID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RICODING_PROP.get());
    }
    
    /**
     * Gets the value of the ReportingAmount field.
     * The amount of this line item in the app's default currency (reporting currency).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getReportingAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REPORTINGAMOUNT_PROP.get());
    }
    
    public gw.api.financials.CurrencyAmount getReportingAmountForTAccounts(boolean useOldAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getReportingAmountForTAccounts(useOldAmount);
    }
    
    public gw.api.financials.CurrencyAmount getReservingAmountForTAccounts(boolean useOldAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getReservingAmountForTAccounts(useOldAmount);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the Status field.
     * Status of the transaction. Further refines the LifeCycleState. Can only change status directly to another status in the same LifeCycleState, which does not affect Taccounts.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TransactionStatus getStatus() {
      return (typekey.TransactionStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RITransaction getSubtype() {
      return (typekey.RITransaction)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    public java.util.List<entity.TAccountOwnerDelegate> getTAccountOwners() {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getTAccountOwners();
    }
    
    /**
     * Gets the value of the TAccountTransactions field.
     * Set of T-account transactions that make up the lifecycle of this Transaction.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RITAccountTransaction[] getTAccountTransactions() {
      return (entity.RITAccountTransaction[])__getInternalInterface().getFieldValue(TACCOUNTTRANSACTIONS_PROP.get());
    }
    
    public entity.TAccountTransactionDelegate[] getTAccountTransactions(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getTAccountTransactions(type);
    }
    
    public entity.TAccountTransactionDelegate[] getTAccountTransactionsWithLatestAsFirst(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).getTAccountTransactionsWithLatestAsFirst(type);
    }
    
    /**
     * Gets the value of the TransactionSet field.
     * Set that groups together one or more transactions for approval.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RITransactionSet getTransactionSet() {
      return (entity.RITransactionSet)__getInternalInterface().getFieldValue(TRANSACTIONSET_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTransactionSetID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TRANSACTIONSET_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateTime field.
     * Timestamp when the object was last updated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateUser field.
     * User who last updated the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUpdateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPDATEUSER_PROP.get());
    }
    
    /**
     * Gets the validation result.
     * @return The validation result.
     */
    public gw.api.validation.ValidationResult getValidationResult() {
      return ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).getValidationResult();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Gets the value of the Adjustment field.
     * True if this RITransaction was created to adjust the totals on its RICoding. This is usually used to distinguish explicit, user-requested adjustments from RITransactions that were created automatically for non-reinsurance Transactions.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAdjustment() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ADJUSTMENT_PROP.get());
    }
    
    public boolean isLifeCycleStateConsistent() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).isLifeCycleStateConsistent();
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
    
    public boolean isOkToRetire() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).isOkToRetire();
    }
    
    /**
     * 
     * @return True if the object has been retired from active use, false if the
     *         object is active.  Retireable objects are never deleted from a
     *         database table, instead they are retired by setting the retired
     *         column to the same value as the ID of the object.
     */
    public java.lang.Boolean isRetired() {
      return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public void offsetExistingCreditToTAccount(entity.TAccountDelegate account) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).offsetExistingCreditToTAccount(account);
    }
    
    public void offsetExistingDebitToTAccount(entity.TAccountDelegate account) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).offsetExistingDebitToTAccount(account);
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
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void reject(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).reject(errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectField(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectField(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Rejects a particular field or field path on the root bean.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectFieldWithFlowStep(java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectFieldWithFlowStep(strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     */
    public void rejectSubField(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubField(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason);
    }
    
    /**
     * Reject a particular field of field path on a bean related to the root
     * bean, e.g. an array element of the bean such as an Exposure of a Claim.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * Note that this is the fullest version of "reject"; all the others are
     * overloaded for easier use.
     * @param relatedBean Bean related to the root bean
     * @param strRelativeFieldPath The relative path from the root bean to the field that failed validation.
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectSubFieldWithFlowStep(entity.KeyableBean relatedBean, java.lang.String strRelativeFieldPath, typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectSubFieldWithFlowStep(relatedBean, strRelativeFieldPath, errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
    }
    
    /**
     * Rejects the root bean w/ a global message
     * <p/>
     * Note the reason why the bean failed validation shouldn't refer to a particular
     * field in the entity. To do that, use the rejectField() method.
     * <p/>
     * Note you can indicate failure as both an error and a warning simultaneously.
     * However, if the failure is both an error and a warning, the failure should
     * have different error and warning levels.
     * <p/>
     * @param errorLevel The corresponding level effected by the validation error.
     * @param strErrorReason The message that should be displayed to the user, to indicate the reason for the error.
     * @param warningLevel The corresponding level effected by the validation warning.
     * @param strWarningReason The message that should be displayed to the user, to indicate the reason for the warning.
     * @param flowStepId The process FlowStep that this error applies to, if any
     */
    public void rejectWithFlowStep(typekey.ValidationLevel errorLevel, java.lang.String strErrorReason, typekey.ValidationLevel warningLevel, java.lang.String strWarningReason, java.lang.String flowStepId) {
      ((com.guidewire.pl.domain.validation.ValidatablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.ValidatablePublicMethods")).rejectWithFlowStep(errorLevel, strErrorReason, warningLevel, strWarningReason, flowStepId);
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
     * Removes the given element from the TAccountTransactions array. This is achieved by marking the element for removal.
     */
    public void removeFromTAccountTransactions(entity.RITAccountTransaction element) {
      __getInternalInterface().removeArrayElement(TACCOUNTTRANSACTIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the TAccountTransactions array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromTAccountTransactions(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(TACCOUNTTRANSACTIONS_PROP.get(), elementID);
    }
    
    public void removeFromTAccountTransactionsForTAccounts(entity.TAccountTransactionDelegate value) {
      ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).removeFromTAccountTransactionsForTAccounts(value);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Sets the value of the Adjustment field.
     */
    public void setAdjustment(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ADJUSTMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimAmount field.
     */
    public void setClaimAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(CLAIMAMOUNT_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimToReportingExchangeRate field.
     */
    public void setClaimToReportingExchangeRate(entity.ExchangeRate value) {
      __getInternalInterface().setFieldValue(CLAIMTOREPORTINGEXCHANGERATE_PROP.get(), value);
    }
    
    public void setClaimToReportingExchangeRateID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMTOREPORTINGEXCHANGERATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Comments field.
     */
    public void setComments(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CostCategory field.
     */
    public void setCostCategory(typekey.CostCategory value) {
      __getInternalInterface().setFieldValue(COSTCATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CostType field.
     */
    public void setCostType(typekey.CostType value) {
      __getInternalInterface().setFieldValue(COSTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUser field.
     */
    public void setCreateUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    public void setCreateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Exposure field.
     */
    public void setExposure(entity.Exposure value) {
      __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
    }
    
    public void setExposureID(gw.pl.persistence.core.Key value) {
      setFieldValue(EXPOSURE_PROP.get(), value);
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
     * Sets the value of the LifeCycleState field.
     */
    public void setLifeCycleState(typekey.TransactionLifeCycleState value) {
      __getInternalInterface().setFieldValue(LIFECYCLESTATE_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RIAgreement field.
     */
    public void setRIAgreement(entity.RIAgreement value) {
      __getInternalInterface().setFieldValue(RIAGREEMENT_PROP.get(), value);
    }
    
    public void setRIAgreementID(gw.pl.persistence.core.Key value) {
      setFieldValue(RIAGREEMENT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RICoding field.
     */
    public void setRICoding(entity.RICoding value) {
      __getInternalInterface().setFieldValue(RICODING_PROP.get(), value);
    }
    
    public void setRICodingID(gw.pl.persistence.core.Key value) {
      setFieldValue(RICODING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReportingAmount field.
     */
    public void setReportingAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(REPORTINGAMOUNT_PROP.get(), value);
    }
    
    public void setRetired() {
      ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).setRetired();
    }
    
    /**
     * Sets the value of the RetiredValue field.
     */
    public void setRetiredValue(java.lang.Long value) {
      __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.TransactionStatus value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.RITransaction value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TAccountTransactions field.
     */
    public void setTAccountTransactions(entity.RITAccountTransaction[] value) {
      __getInternalInterface().setFieldValue(TACCOUNTTRANSACTIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TransactionSet field.
     */
    public void setTransactionSet(entity.RITransactionSet value) {
      __getInternalInterface().setFieldValue(TRANSACTIONSET_PROP.get(), value);
    }
    
    public void setTransactionSetID(gw.pl.persistence.core.Key value) {
      setFieldValue(TRANSACTIONSET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateTime field.
     */
    public void setUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateUser field.
     */
    public void setUpdateUser(entity.User value) {
      __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    public void setUpdateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    public void setValidationResult(gw.api.validation.ValidationResult result) {
      ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).setValidationResult(result);
    }
    
    public void simulateTransitionToNewState(typekey.TransactionLifeCycleState newState, com.guidewire.cc.domain.financials.impl.SimulatedTAccountOwner reserveLine) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).simulateTransitionToNewState(newState, reserveLine);
    }
    
    public void throwCDCEIfOffsetFailedDueToConcurrentChange() {
      ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).throwCDCEIfOffsetFailedDueToConcurrentChange();
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
    
    public void transitionToNewState(typekey.TransactionLifeCycleState newState) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).transitionToNewState(newState);
    }
    
    public gw.api.validation.ValidationResult validate() {
      return ((com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods")).validate();
    }
    
    public void verifyLifeCycleStateConsistent() {
      ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).verifyLifeCycleStateConsistent();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.impl.RITransactionInternal", "com.guidewire.cc.domain.financials.impl.RITransactionImpl");
    config.put("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter", "com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateAdapterRIImpl");
    config.put("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal", "com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.domain.validation.ValidatablePublicMethods", "com.guidewire.pl.domain.validation.impl.ValidatableImpl");
    config.put("com.guidewire.pl.domain.validation.impl.ValidatableInternalMethods", "com.guidewire.pl.domain.validation.impl.ValidatableImpl");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.financials.impl.RITransactionImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.financials.impl.RITransactionImpl");
    config.put("gw.cc.financials.entity.RITransaction", "com.guidewire.cc.domain.financials.ri.impl.RICededReserveImpl");
    config.put("gw.cc.financials.ri.entity.RICededReserve", "com.guidewire.cc.domain.financials.ri.impl.RICededReserveImpl");
    config.put("gw.cc.financials.taccount.entity.TransactionTAccountOperationsDelegate", "com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.RICededReserve.class, config);
    com.guidewire._generated.entity.RICededReserveInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.RICededReserve, com.guidewire._generated.entity.RICededReserveInternal>() {
      public java.lang.Object getImplementation(entity.RICededReserve bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RICededReserveInternal getInternalInterface(entity.RICededReserve bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.RICededReserve newEmptyInstance() {
        return new entity.RICededReserve((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}