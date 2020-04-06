package entity;

/**
 * RecoveryReserve
 * 
 *       A subtype of Transaction that indicates money expected to be recovered. These reserves are depleted by Recovery
 *       transactions. Not commonly used, and ClaimCenter can be globally configured to not use RecoveryReserves at all.
 *       However, if ClaimCenter is configured to use them, and a Recovery is created with an amount that exceeds the open
 *       recovery reserves (total Recovery Reserves minus Total Recoveries) on that particular ReserveLine, then a
 *       RecoveryReserve in the proper amount is automatically created to keep open recovery reserves from becoming negative.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RecoveryReserve.eti;RecoveryReserve.eix;RecoveryReserve.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "RecoveryReserve")
public class RecoveryReserve extends entity.Transaction implements entity.EventAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.RecoveryReserve> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.RecoveryReserve>("entity.RecoveryReserve");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RECOVERYCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "RecoveryCategory");
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public RecoveryReserve()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public RecoveryReserve(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected RecoveryReserve(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected com.guidewire._generated.entity.RecoveryReserveInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.RecoveryReserveInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.RecoveryReserveInternal)super.__getInternalInterface();
  }
  
  public entity.RecoveryCoding getCoding() {
    return ((gw.cc.financials.recovery.entity.RecoveryReserve)__getDelegateManager().getImplementation("gw.cc.financials.recovery.entity.RecoveryReserve")).getCoding();
  }
  
  /**
   * Gets the value of the RecoveryCategory field.
   * The RecoveryCategory to which this transaction is coded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecoveryCategory getRecoveryCategory() {
    return (typekey.RecoveryCategory)__getInternalInterface().getFieldValue(RECOVERYCATEGORY_PROP.get());
  }
  
  /**
   * Sets the value of the RecoveryCategory field.
   */
  public void setRecoveryCategory(typekey.RecoveryCategory value) {
    __getInternalInterface().setFieldValue(RECOVERYCATEGORY_PROP.get(), value);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.RecoveryReserveInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.RecoveryReserve.this.__getDelegateManager();
    }
    
    /**
     * Acknowledges a message that this transaction was submitted.
     * Updates its status to SUBMITTED.
     * @throws IllegalStateException if this transaction is not in SUBMITTING status
     */
    public void acknowledgeSubmission() {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).acknowledgeSubmission();
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
     * Adds a line item to this transaction with the given transaction amount, comments, and
     * line category.  This transaction must be editable for a lineitem to be added.
     * 
     * NOTE: When called through rules, this method should only be called from the TransactionSet
     *       pre-setup ruleset.
     * @param transAmount 
     * @param comments 
     * @param lineCategory 
     * @return the line item created
     */
    public entity.TransactionLineItem addNewLineItem(gw.api.financials.CurrencyAmount transAmount, java.lang.String comments, typekey.LineCategory lineCategory) {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).addNewLineItem(transAmount, comments, lineCategory);
    }
    
    /**
     * Adds the given element to the LineItems array. This is achieved by setting the parent foreign key to this entity instance.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void addToLineItems(entity.TransactionLineItem value) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).addToLineItems(value);
    }
    
    public entity.TransactionLineItem addToLineItems(gw.api.financials.CurrencyAmount transAmount, java.lang.String comments, typekey.LineCategory lineCategory) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).addToLineItems(transAmount, comments, lineCategory);
    }
    
    public entity.TransactionLineItem addToLineItemsForTesting(gw.api.financials.CurrencyAmount transAmount, java.lang.String comments, typekey.LineCategory lineCategory) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).addToLineItemsForTesting(transAmount, comments, lineCategory);
    }
    
    public void addToLineItemsWithoutEditabilityCheck(entity.TransactionLineItem lineItem) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).addToLineItemsWithoutEditabilityCheck(lineItem);
    }
    
    public void addToOffsetOnsets(entity.Transaction offset, entity.Transaction[] onsets) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).addToOffsetOnsets(offset, onsets);
    }
    
    /**
     * Adds the given element to the Offsets array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToOffsets(entity.TransactionOffset element) {
      __getInternalInterface().addArrayElement(OFFSETS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Onsets array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToOnsets(entity.TransactionOnset element) {
      __getInternalInterface().addArrayElement(ONSETS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the OriginTransactionOnsetArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToOriginTransactionOnsetArray(entity.TransactionOnset element) {
      __getInternalInterface().addArrayElement(ORIGINTRANSACTIONONSETARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the RecTAccountTransactions array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToRecTAccountTransactions(entity.RecTAccountTransaction element) {
      __getInternalInterface().addArrayElement(RECTACCOUNTTRANSACTIONS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the TAccountTransactions array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToTAccountTransactions(entity.TAccountTransaction element) {
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
    
    public void beforeRemove() {
      ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
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
    
    public entity.Transaction cloneAsNegative() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).cloneAsNegative();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public void copyLineItems(entity.Transaction original, boolean removeForExAmounts) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).copyLineItems(original, removeForExAmounts);
    }
    
    public entity.Transaction copyToNewTransaction(gw.entity.IEntityType transactionType, java.lang.Boolean negate, boolean removeForExAmounts) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).copyToNewTransaction(transactionType, negate, removeForExAmounts);
    }
    
    public entity.Transaction createNewTransactionAndLineItemsFromData(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).createNewTransactionAndLineItemsFromData(bundle);
    }
    
    public entity.Transaction createNewTransactionAndLineItemsFromData(gw.pl.persistence.core.Bundle bundle, boolean createWithAdjustedAmount) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).createNewTransactionAndLineItemsFromData(bundle, createWithAdjustedAmount);
    }
    
    public entity.Reserve createOffsetReserve(boolean negateAmount, com.guidewire.pl.system.locale.DisplayKey reserveComment, typekey.TransactionLifeCycleState lifeCycleStateOfOffset) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).createOffsetReserve(negateAmount, reserveComment, lifeCycleStateOfOffset);
    }
    
    public void createSupportingData() {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).createSupportingData();
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
    
    public void delete() {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).delete();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    /**
     * Determines the proper ReserveLine for this Transaction and sets it into the Transaction.  If an existing
     * ReserveLine is a match, then this ReserveLine is used.  Otherwise, a new ReserveLine is created
     * and used.  If this Transaction already has a non-null Reserveline and it is not in 'New' or 'Draft'
     * LifeCycleState, then this method has no effect (i.e., you cannot change the ReserveLine of a
     * Transaction once it has been permanently saved to the database).
     * <p/>
     * <b>Note: This method should only be called on a new Reserve</b>.
     * @throws IllegalStateException if this Reserve is not new
     */
    public void findAndSetReserveLine() {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).findAndSetReserveLine();
    }
    
    public entity.TAccountLineItemDelegate findExistingCreditNeedingDebitingOffset(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type, entity.TAccountDelegate account) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).findExistingCreditNeedingDebitingOffset(type, account);
    }
    
    public entity.TAccountLineItemDelegate findExistingDebitNeedingCreditingOffset(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type, entity.TAccountDelegate account) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).findExistingDebitNeedingCreditingOffset(type, account);
    }
    
    public void forceResetToDraft() {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).forceResetToDraft();
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
     * Equivalent to TransactionAmount. Provided for backwards
     * compatibility on SINGLE currency mode servers.
     */
    public java.math.BigDecimal getAmount() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getAmount();
    }
    
    public gw.api.financials.CurrencyAmount getAmount(com.guidewire.cc.domain.financials.AmountType amountType, boolean returnOldValue) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getAmount(amountType, returnOldValue);
    }
    
    public gw.api.financials.CurrencyAmount getAmount(com.guidewire.cc.domain.financials.AmountType amountType, typekey.CostCategory costCategory) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getAmount(amountType, costCategory);
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
     * The related claim.<p>Setting the claim also sets this transaction's currency to the claim's currency if it is null.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Returns the Claim amount of this transaction, which is the equivalent of
     * transaction amount in the claim currency. The amount is determined by
     * summing the claim amounts of all TransactionLineItems that belong to the
     * transaction.  Returns zero if the transaction has no line items.
     */
    public gw.api.financials.CurrencyAmount getClaimAmount() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getClaimAmount();
    }
    
    public gw.api.financials.CurrencyAmount getClaimAmount(boolean returnOldValue) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getClaimAmount(returnOldValue);
    }
    
    public gw.api.financials.CurrencyAmount getClaimAmountForTAccounts(boolean useOldAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getClaimAmountForTAccounts(useOldAmount);
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimToReportingExchangeRate field.
     * ExchangeRate to use when converting ClaimAmount to ReportingAmount. Setting this value updates the reporting amounts.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ExchangeRate getClaimToReportingExchangeRate() {
      return (entity.ExchangeRate)__getInternalInterface().getFieldValue(CLAIMTOREPORTINGEXCHANGERATE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimToReportingExchangeRateID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMTOREPORTINGEXCHANGERATE_PROP.get());
    }
    
    public entity.RecoveryCoding getCoding() {
      return ((gw.cc.financials.recovery.entity.RecoveryReserve)__getDelegateManager().getImplementation("gw.cc.financials.recovery.entity.RecoveryReserve")).getCoding();
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
    
    /**
     * Gets the value of the Currency field.
     * The Currency of the transaction amount.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
    }
    
    public typekey.Currency getCurrency(com.guidewire.cc.domain.financials.AmountType amountType) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getCurrency(amountType);
    }
    
    public gw.entity.IArrayPropertyInfo getDebitingLineItemsProperty(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getDebitingLineItemsProperty(type);
    }
    
    public gw.entity.ILinkPropertyInfo getDebitingTransactionFKProperty(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getDebitingTransactionFKProperty(type);
    }
    
    /**
     * Returns the title to use for the detail page that displays detail of is transaction - different transaction types
     * use different titles, such as "Payment Details", "Recovery Details" and so on.
     */
    public java.lang.String getDetailPageTitle() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getDetailPageTitle();
    }
    
    public entity.TAccountTransaction getEarliestTAccountTransaction() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getEarliestTAccountTransaction();
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
    
    public gw.api.financials.CurrencyAmount getForExAmount(com.guidewire.cc.domain.financials.AmountType amountType) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getForExAmount(amountType);
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
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getLifeCycleStateTransitionMapInternal();
    }
    
    public gw.api.financials.CurrencyAmount getLimitUsed(entity.AggregateLimit limit) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getLimitUsed(limit);
    }
    
    public com.guidewire.cc.domain.financials.calc.TransactionBasedFinancialsCalculator getLimitUsedCalculator() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getLimitUsedCalculator();
    }
    
    public gw.api.financials.CurrencyAmount getLimitUsedDelta(com.guidewire.cc.domain.financials.calc.TransactionBasedFinancialsCalculator calculator, boolean ignoreStatus, boolean useOldValues) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getLimitUsedDelta(calculator, ignoreStatus, useOldValues);
    }
    
    public gw.api.financials.CurrencyAmount getLimitUsedDelta(entity.AggregateLimitRptDelegate limitRpt) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getLimitUsedDelta(limitRpt);
    }
    
    public gw.api.financials.CurrencyAmount getLimitUsedIgnoringStatus(entity.AggregateLimit limit) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getLimitUsedIgnoringStatus(limit);
    }
    
    /**
     * Gets the value of the LineItems field.
     * Set of line items that further categorize the transaction amount.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TransactionLineItem[] getLineItems() {
      return (entity.TransactionLineItem[])__getInternalInterface().getFieldValue(LINEITEMS_PROP.get());
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the value of the Offsets field.
     * Transactions that offset this transaction. A transaction should have at most one item in this array. This array is applicable only to a payment or recovery.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TransactionOffset[] getOffsets() {
      return (entity.TransactionOffset[])__getInternalInterface().getFieldValue(OFFSETS_PROP.get());
    }
    
    /**
     * Gets the value of the Onsets field.
     * Transactions that onset this transaction. This array is applicable only to a payment or recovery.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TransactionOnset[] getOnsets() {
      return (entity.TransactionOnset[])__getInternalInterface().getFieldValue(ONSETS_PROP.get());
    }
    
    public entity.TAccountTransactionDelegate getOrCreateTAccountTransactionForTAccountUpdate(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type, boolean createNew) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).getOrCreateTAccountTransactionForTAccountUpdate(type, createNew);
    }
    
    /**
     * Gets the value of the OriginTransactionOnset field.
     * TransactionOnset join entity pointing to this Transaction as an Onset.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TransactionOnset getOriginTransactionOnset() {
      return (entity.TransactionOnset)__getInternalInterface().getFieldValue(ORIGINTRANSACTIONONSET_PROP.get());
    }
    
    /**
     * Gets the value of the OriginTransactionOnsetArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TransactionOnset[] getOriginTransactionOnsetArray() {
      return (entity.TransactionOnset[])__getInternalInterface().getFieldValue(ORIGINTRANSACTIONONSETARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getOriginTransactionOnsetID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(ORIGINTRANSACTIONONSET_PROP.get());
    }
    
    /**
     * False if the TransactionAmount to ClaimAmount ExchangeRate is a Market Rate
     * (Automatic) or true if it's a user-entered custom rate for this Transaction (Manual).
     */
    public boolean getOverrideTransToClaimExchangeRate() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getOverrideTransToClaimExchangeRate();
    }
    
    /**
     * False if the TransactionAmount to ReservingAmount ExchangeRate is a Market Rate
     * (Automatic) or true if it's a user-entered custom rate for this Transaction (Manual).
     */
    public boolean getOverrideTransToReservingExchangeRate() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getOverrideTransToReservingExchangeRate();
    }
    
    public java.util.Collection<typekey.TAccountType> getPossibleCreditingTAccountTypes() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getPossibleCreditingTAccountTypes();
    }
    
    public java.util.Collection<typekey.TAccountType> getPossibleDebitingTAccountTypes() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getPossibleDebitingTAccountTypes();
    }
    
    public typekey.TransactionLifeCycleState getProperLifeCycleState() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getProperLifeCycleState();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RecTAccountTransactions field.
     * Set of T-account transactions that make up the lifecycle of this Transaction. Only applicable to Recoveries and RecoveryReserves.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RecTAccountTransaction[] getRecTAccountTransactions() {
      return (entity.RecTAccountTransaction[])__getInternalInterface().getFieldValue(RECTACCOUNTTRANSACTIONS_PROP.get());
    }
    
    /**
     * Gets the value of the RecoveryCategory field.
     * The RecoveryCategory to which this transaction is coded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.RecoveryCategory getRecoveryCategory() {
      return (typekey.RecoveryCategory)__getInternalInterface().getFieldValue(RECOVERYCATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the RecoveryCoding field.
     * The RecoveryCoding to which this transaction is coded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RecoveryCoding getRecoveryCoding() {
      return (entity.RecoveryCoding)__getInternalInterface().getFieldValue(RECOVERYCODING_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRecoveryCodingID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RECOVERYCODING_PROP.get());
    }
    
    /**
     * Returns the reporting amount of this transaction, which is the equivalent of
     * transaction amount in the reporting currency. The amount is determined by
     * summing the reporting amounts of all TransactionLineItems that belong to the
     * transaction.  Returns zero if the transaction has no line items.
     */
    public gw.api.financials.CurrencyAmount getReportingAmount() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getReportingAmount();
    }
    
    public gw.api.financials.CurrencyAmount getReportingAmount(boolean returnOldValue) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getReportingAmount(returnOldValue);
    }
    
    public gw.api.financials.CurrencyAmount getReportingAmountForTAccounts(boolean useOldAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getReportingAmountForTAccounts(useOldAmount);
    }
    
    /**
     * Gets the value of the ReserveLine field.
     * The ReserveLine associated with this transaction.  For all transaction subtypes this ReserveLine will have matching Claim, Exposure, CostType and CostCategory.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ReserveLine getReserveLine() {
      return (entity.ReserveLine)__getInternalInterface().getFieldValue(RESERVELINE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getReserveLineID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RESERVELINE_PROP.get());
    }
    
    /**
     * Returns the Reserving amount of this transaction, which is the amount of this transaction
     * in the Reserving Currency. The amount is determined by
     * summing the ReservingAmounts of all TransactionLineItems that belong to the
     * transaction.  Returns zero if the transaction has no line items.
     */
    public gw.api.financials.CurrencyAmount getReservingAmount() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getReservingAmount();
    }
    
    public gw.api.financials.CurrencyAmount getReservingAmount(boolean returnOldValue) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getReservingAmount(returnOldValue);
    }
    
    public gw.api.financials.CurrencyAmount getReservingAmountForTAccounts(boolean useOldAmount) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getReservingAmountForTAccounts(useOldAmount);
    }
    
    /**
     * Gets the value of the ReservingCurrency field.
     * Reserving Currency of this transaction's ReserveLine. Indicates the currency in which reserves are to be set aside and eroded.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getReservingCurrency() {
      return (typekey.Currency)__getInternalInterface().getFieldValue(RESERVINGCURRENCY_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the rounding mode that should be used when converting amounts between
     * transaction, reserving, claim, and reporting currency for this transaction.
     * See also <code>CCCurrencyUtil.getRoundingMode()</code>.
     * @return the rounding mode to be used when converting the amounts for this
     *         transaction
     */
    public java.math.RoundingMode getRoundingMode() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getRoundingMode();
    }
    
    public entity.TransactionLineItem getSingleLineItem() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getSingleLineItem();
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
     * Gets the value of the SubmitDate field.
     * Unused. May be removed in a future release.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getSubmitDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SUBMITDATE_PROP.get());
    }
    
    /**
     * Gets the value of the Subtype field.
     * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Transaction getSubtype() {
      return (typekey.Transaction)__getInternalInterface().getFieldValue(SUBTYPE_PROP.get());
    }
    
    public java.util.List<entity.TAccountOwnerDelegate> getTAccountOwners() {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getTAccountOwners();
    }
    
    /**
     * Gets the value of the TAccountTransactions field.
     * Set of T-account transactions that make up the lifecycle of this Transaction.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TAccountTransaction[] getTAccountTransactions() {
      return (entity.TAccountTransaction[])__getInternalInterface().getFieldValue(TACCOUNTTRANSACTIONS_PROP.get());
    }
    
    public entity.TAccountTransactionDelegate[] getTAccountTransactions(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type) {
      return ((com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter")).getTAccountTransactions(type);
    }
    
    public entity.TAccountTransactionDelegate[] getTAccountTransactionsWithLatestAsFirst(gw.pl.persistence.type.EntityTypeReference<? extends entity.TAccountTransactionDelegate> type) {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).getTAccountTransactionsWithLatestAsFirst(type);
    }
    
    /**
     * Gets the value of the TransToClaimExchangeRate field.
     * ExchangeRate to use when converting TransactionAmount to ClaimAmount. Setting this value updates the claim and reporting amounts. Also sets the same ExchangeRate as TransToReservingExchangeRate if ClaimCurrency and ReservingCurrency are equal.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ExchangeRate getTransToClaimExchangeRate() {
      return (entity.ExchangeRate)__getInternalInterface().getFieldValue(TRANSTOCLAIMEXCHANGERATE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTransToClaimExchangeRateID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TRANSTOCLAIMEXCHANGERATE_PROP.get());
    }
    
    /**
     * Get the TransToClaimExchangeRate entity and check that it matches the current Currency,
     * or lookup the current Market Exchange Rate entity. Return the ER entity's Rate.
     * Or return ONE if it's null and/or in SINGLE currency mode.
     */
    @gw.datatype.annotation.DataType(name = "exchangerate")
    public java.math.BigDecimal getTransToClaimExchangeRateRate() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getTransToClaimExchangeRateRate();
    }
    
    /**
     * Gets the value of the TransToReservingExchangeRate field.
     * ExchangeRate to use when converting TransactionAmount to ReservingAmount. Setting this value updates the reserving amounts. Also sets the same ExchangeRate as TransToClaimExchangeRate if ClaimCurrency and ReservingCurrency are equal.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ExchangeRate getTransToReservingExchangeRate() {
      return (entity.ExchangeRate)__getInternalInterface().getFieldValue(TRANSTORESERVINGEXCHANGERATE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTransToReservingExchangeRateID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TRANSTORESERVINGEXCHANGERATE_PROP.get());
    }
    
    /**
     * Get the TransToReservingExchangeRate entity and check that it matches the current Currency,
     * or lookup the current Market Exchange Rate entity. Return the ER entity's Rate.
     * Or return ONE if it's null and/or in SINGLE currency mode.
     */
    @gw.datatype.annotation.DataType(name = "exchangerate")
    public java.math.BigDecimal getTransToReservingExchangeRateRate() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getTransToReservingExchangeRateRate();
    }
    
    /**
     * Returns the transaction amount of this transaction.  The currency of the transaction
     * amount may differ from the Claim currency. The amount is determined by
     * summing the transaction amounts of all TransactionLineItems that belong to the
     * transaction.  Returns zero if the transaction has no line items.
     */
    public gw.api.financials.CurrencyAmount getTransactionAmount() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getTransactionAmount();
    }
    
    public gw.api.financials.CurrencyAmount getTransactionAmount(boolean returnOldValue) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getTransactionAmount(returnOldValue);
    }
    
    /**
     * Returns the TransactionAmount and ClaimAmount of this transaction as a CurrencyAmountPair.
     * @deprecated Use getTransactionAmountReservingAmountPair() instead.
     */
    public gw.api.financials.CurrencyAmountPair getTransactionAmountComponent() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getTransactionAmountComponent();
    }
    
    /**
     * Ensures there is one and only one line item, ala setAmountDirectly, and then returns
     * that TransactionLineItem.  Only works for editable transactions.
     * @throws IllegalStateException if transaction is not editable
     */
    public entity.TransactionLineItem getTransactionAmountDirectlyLineItem() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getTransactionAmountDirectlyLineItem();
    }
    
    /**
     * Returns the TransactionAmount and ReservingAmount of this transaction as an IPairedMoney.
     */
    public gw.api.financials.IPairedMoney getTransactionAmountReservingAmountPair() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getTransactionAmountReservingAmountPair();
    }
    
    /**
     * Returns the date of this transaction.  For any Transaction subtype other than
     * Payment, this is simply the CreateTime.  For Payments, it is the IssueDate of
     * the Payment's associated Check, if not null, otherwise it it the ScheduledSendDate
     * of the check.
     * @return Date of the check (CreateTime for non-payments, else IssueDate or
     *         ScheduledSendDate).
     */
    public java.util.Date getTransactionDate() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getTransactionDate();
    }
    
    /**
     * Gets the value of the TransactionSet field.
     * Set that groups together one or more transactions for approval.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.TransactionSet getTransactionSet() {
      return (entity.TransactionSet)__getInternalInterface().getFieldValue(TRANSACTIONSET_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getTransactionSetID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TRANSACTIONSET_PROP.get());
    }
    
    /**
     * Returns the type of the transaction subtype: Payment, Reserve, Recovery, RecoveryReserve.
     * Value is localized.
     * @return String containing the name of the transaction subtype
     */
    public java.lang.String getTransactionTypeName() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getTransactionTypeName();
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
    
    public java.util.Stack<java.lang.Boolean> getWasAppliedToAggLimitUsed() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).getWasAppliedToAggLimitUsed();
    }
    
    public boolean hasAmountChanged() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).hasAmountChanged();
    }
    
    public boolean hasLineItemsRequiringRecalculation() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).hasLineItemsRequiringRecalculation();
    }
    
    public boolean hasNegativeLineItems() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).hasNegativeLineItems();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isAmountEditable() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isAmountEditable();
    }
    
    public boolean isAppliedToAggLimitUsed() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isAppliedToAggLimitUsed();
    }
    
    public boolean isApproved() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isApproved();
    }
    
    public boolean isApprovedButUnsubmitted() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isApprovedButUnsubmitted();
    }
    
    public boolean isCommitted() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isCommitted();
    }
    
    /**
     * Returns true if this Transaction can be deleted. For Payments, Check.Deleteable should normally be used instead,
     * since, after a Check has been created, its Payments cannot be deleted individually--the entire Check must be
     * deleted.
     */
    public boolean isDeletable() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).isDeletable();
    }
    
    /**
     * Returns true if this Transaction can be deleted. For Payments, Check.Deleteable should normally be used instead,
     * since, after a Check has been created, its Payments cannot be deleted individually--the entire Check must be
     * deleted.
     * @deprecated use Deletable instead
     */
    public boolean isDeleteable() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).isDeleteable();
    }
    
    /**
     * Returns whether or not a Transaction can be directly edited versus
     * needing to offset the transaction or void/recreate the transaction.
     * For all Transaction subtypes, returns true if the status is null.
     * For Reserves and RecoveryReserves, returns true if the transaction is
     * unapproved or rejected and its exposure is not closed. For Payments and
     * Recoveries, returns true if the transaction has not been submitted.
     */
    public boolean isEditable() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).isEditable();
    }
    
    public boolean isEffectivelySubmitted() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isEffectivelySubmitted();
    }
    
    public boolean isEqual(entity.Transaction t) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isEqual(t);
    }
    
    public boolean isFieldNullOnAnyLineItem(gw.entity.IEntityPropertyInfo propertyInfo) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isFieldNullOnAnyLineItem(propertyInfo);
    }
    
    public boolean isLifeCycleStateConsistent() {
      return ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).isLifeCycleStateConsistent();
    }
    
    public boolean isLimitApplies(entity.AggregateLimit limit) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isLimitApplies(limit);
    }
    
    public boolean isMatch(entity.Transaction transaction) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isMatch(transaction);
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
     * Returns true if the LifeCycleState indicates the transaction is unapproved or
     * rejected. Specifically, if the LifeCycleState is one of the following:
     * <ul>
     * <li> <code>TransactionLifeCycleState.DRAFT</code>
     * <li> <code>TransactionLifeCycleState.PENDINGAPPROVAL</code>
     * <li> <code>TransactionLifeCycleState.REJECTED</code>
     * </ul>
     */
    public boolean isNotApproved() {
      return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).isNotApproved();
    }
    
    public boolean isOkToRetire() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).isOkToRetire();
    }
    
    public boolean isPendingOrBetter() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isPendingOrBetter();
    }
    
    public boolean isRecalculationRequired() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isRecalculationRequired();
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
    
    public boolean isSubmitted() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isSubmitted();
    }
    
    public boolean isTAccountsUpToDate(boolean throwIfProblem) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isTAccountsUpToDate(throwIfProblem);
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public boolean isUnsubmitted() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).isUnsubmitted();
    }
    
    public boolean lineItemsForceDenormRecalcAtTxnLevel() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).lineItemsForceDenormRecalcAtTxnLevel();
    }
    
    public void markAsAppliedToAggLimitUsed() {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).markAsAppliedToAggLimitUsed();
    }
    
    public void offsetExistingCreditToTAccount(entity.TAccountDelegate account) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).offsetExistingCreditToTAccount(account);
    }
    
    public void offsetExistingDebitToTAccount(entity.TAccountDelegate account) {
      ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).offsetExistingDebitToTAccount(account);
    }
    
    public void onlyForTestingUpdateTAccountsForConsistency(gw.api.financials.CurrencyAmount transactionAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).onlyForTestingUpdateTAccountsForConsistency(transactionAmount);
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public boolean populateTransToClaimExchangeRate() {
      return ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).populateTransToClaimExchangeRate();
    }
    
    public void populateTransToReservingExchangeRateAndRecalculateReservingAmount(boolean recalcReservingAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).populateTransToReservingExchangeRateAndRecalculateReservingAmount(recalcReservingAmount);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    public void recalculateClaimAndReportingAmount() {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).recalculateClaimAndReportingAmount();
    }
    
    public void recalculateReservingAmount() {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).recalculateReservingAmount();
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
    
    public void removeAllLineItems() {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).removeAllLineItems();
    }
    
    public void removeEmptyLineItems() {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).removeEmptyLineItems();
    }
    
    /**
     * Removes the given element from the LineItems array. This is achieved by marking the element for removal.
     */
    public void removeFromLineItems(entity.TransactionLineItem element) {
      __getInternalInterface().removeArrayElement(LINEITEMS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the LineItems array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromLineItems(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(LINEITEMS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given transaction line item from this transaction.
     * @param lineItem line item to be removed
     * @throws IllegalStateException if the transaction is not editable
     */
    public void removeFromLineItemsIfEditable(entity.TransactionLineItem lineItem) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).removeFromLineItemsIfEditable(lineItem);
    }
    
    /**
     * Removes the given element from the Offsets array. This is achieved by marking the element for removal.
     */
    public void removeFromOffsets(entity.TransactionOffset element) {
      __getInternalInterface().removeArrayElement(OFFSETS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Offsets array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromOffsets(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(OFFSETS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Onsets array. This is achieved by marking the element for removal.
     */
    public void removeFromOnsets(entity.TransactionOnset element) {
      __getInternalInterface().removeArrayElement(ONSETS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Onsets array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromOnsets(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ONSETS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the OriginTransactionOnsetArray array. This is achieved by marking the element for removal.
     */
    public void removeFromOriginTransactionOnsetArray(entity.TransactionOnset element) {
      __getInternalInterface().removeArrayElement(ORIGINTRANSACTIONONSETARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the OriginTransactionOnsetArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromOriginTransactionOnsetArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(ORIGINTRANSACTIONONSETARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the RecTAccountTransactions array. This is achieved by marking the element for removal.
     */
    public void removeFromRecTAccountTransactions(entity.RecTAccountTransaction element) {
      __getInternalInterface().removeArrayElement(RECTACCOUNTTRANSACTIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the RecTAccountTransactions array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromRecTAccountTransactions(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(RECTACCOUNTTRANSACTIONS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the TAccountTransactions array. This is achieved by marking the element for removal.
     */
    public void removeFromTAccountTransactions(entity.TAccountTransaction element) {
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
    
    public void setAmountDirectly(com.guidewire.cc.domain.financials.AmountType whichAmount, gw.api.financials.CurrencyAmount amount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setAmountDirectly(whichAmount, amount);
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
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setClaim(entity.Claim value) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setClaim(value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimToReportingExchangeRate field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setClaimToReportingExchangeRate(entity.ExchangeRate value) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setClaimToReportingExchangeRate(value);
    }
    
    public void setClaimToReportingExchangeRate(entity.ExchangeRate exchangeRate, boolean recalculateReportingAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setClaimToReportingExchangeRate(exchangeRate, recalculateReportingAmount);
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
     * Sets the value of the Currency field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setCurrency(typekey.Currency value) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setCurrency(value);
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
     * Sets the value of the LineItems field.
     */
    public void setLineItems(entity.TransactionLineItem[] value) {
      __getInternalInterface().setFieldValue(LINEITEMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
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
     * Sets the value of the Offsets field.
     */
    public void setOffsets(entity.TransactionOffset[] value) {
      __getInternalInterface().setFieldValue(OFFSETS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Onsets field.
     */
    public void setOnsets(entity.TransactionOnset[] value) {
      __getInternalInterface().setFieldValue(ONSETS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OriginTransactionOnset field.
     */
    public void setOriginTransactionOnset(entity.TransactionOnset value) {
      __getInternalInterface().setFieldValue(ORIGINTRANSACTIONONSET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the OriginTransactionOnsetArray field.
     */
    public void setOriginTransactionOnsetArray(entity.TransactionOnset[] value) {
      __getInternalInterface().setFieldValue(ORIGINTRANSACTIONONSETARRAY_PROP.get(), value);
    }
    
    public void setOriginTransactionOnsetID(gw.pl.persistence.core.Key value) {
      setFieldValue(ORIGINTRANSACTIONONSET_PROP.get(), value);
    }
    
    /**
     * 
     * @param customOverride 
     */
    public void setOverrideTransToClaimExchangeRate(boolean customOverride) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setOverrideTransToClaimExchangeRate(customOverride);
    }
    
    public void setOverrideTransToClaimExchangeRate(boolean customOverride, java.lang.String description) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setOverrideTransToClaimExchangeRate(customOverride, description);
    }
    
    public void setOverrideTransToClaimExchangeRate(boolean customOverride, java.lang.String description, boolean recalculateClaimAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setOverrideTransToClaimExchangeRate(customOverride, description, recalculateClaimAmount);
    }
    
    /**
     * Sets the TransToReservingExchangeRate to be a custom rate rather than a market rate
     * @param customOverride 
     */
    public void setOverrideTransToReservingExchangeRate(boolean customOverride) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setOverrideTransToReservingExchangeRate(customOverride);
    }
    
    public void setOverrideTransToReservingExchangeRate(boolean customOverride, java.lang.String description) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setOverrideTransToReservingExchangeRate(customOverride, description);
    }
    
    public void setOverrideTransToReservingExchangeRate(boolean customOverride, java.lang.String description, boolean recalculateReservingAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setOverrideTransToReservingExchangeRate(customOverride, description, recalculateReservingAmount);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RecTAccountTransactions field.
     */
    public void setRecTAccountTransactions(entity.RecTAccountTransaction[] value) {
      __getInternalInterface().setFieldValue(RECTACCOUNTTRANSACTIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RecoveryCategory field.
     */
    public void setRecoveryCategory(typekey.RecoveryCategory value) {
      __getInternalInterface().setFieldValue(RECOVERYCATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RecoveryCoding field.
     */
    public void setRecoveryCoding(entity.RecoveryCoding value) {
      __getInternalInterface().setFieldValue(RECOVERYCODING_PROP.get(), value);
    }
    
    public void setRecoveryCodingID(gw.pl.persistence.core.Key value) {
      setFieldValue(RECOVERYCODING_PROP.get(), value);
    }
    
    /**
     * Sets the Transaction's ReserveLine.  This is only possible if the Transaction is editable.  This method has the following
     * critical side effects for existing Transactions:
     * <p/>
     * <ol>
     * <li>Transitions the Transaction to the 'Retired' LifeCycleState on its current ReserveLine so that its contributions to the TAccounts for that reserveline are offset
     * <li>Transitions the Transaction back to its original LifeCycleState on the new ReserveLine.
     * </ol>
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setReserveLine(entity.ReserveLine value) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setReserveLine(value);
    }
    
    public void setReserveLineID(gw.pl.persistence.core.Key value) {
      setFieldValue(RESERVELINE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReservingCurrency field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setReservingCurrency(typekey.Currency value) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setReservingCurrency(value);
    }
    
    public void setReservingCurrency(typekey.Currency value, boolean recalcReservingAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setReservingCurrency(value, recalcReservingAmount);
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
     * Sets the value of the SubmitDate field.
     */
    public void setSubmitDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SUBMITDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Subtype field.
     */
    public void setSubtype(typekey.Transaction value) {
      __getInternalInterface().setFieldValue(SUBTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TAccountTransactions field.
     */
    public void setTAccountTransactions(entity.TAccountTransaction[] value) {
      __getInternalInterface().setFieldValue(TACCOUNTTRANSACTIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TransToClaimExchangeRate field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setTransToClaimExchangeRate(entity.ExchangeRate value) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setTransToClaimExchangeRate(value);
    }
    
    public void setTransToClaimExchangeRate(entity.ExchangeRate exchangeRate, boolean recalculateClaimAndReportingAmounts) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setTransToClaimExchangeRate(exchangeRate, recalculateClaimAndReportingAmounts);
    }
    
    public void setTransToClaimExchangeRateID(gw.pl.persistence.core.Key value) {
      setFieldValue(TRANSTOCLAIMEXCHANGERATE_PROP.get(), value);
    }
    
    /**
     * Set the Rate on the TransToClaimExchangeRate entity. IGNORED if the ExchangeRate entity is
     * part of a Market Rates set (should call setOverrideTransToClaimExchangeRate(true) first),
     * OR if the exchangeRate is null OR server is in SINGLE currency mode.
     * @param exchangeRate 
     */
    public void setTransToClaimExchangeRateRate(java.math.BigDecimal exchangeRate) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setTransToClaimExchangeRateRate(exchangeRate);
    }
    
    public void setTransToClaimExchangeRateRate(java.math.BigDecimal exchangeRate, boolean recalculateClaimAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setTransToClaimExchangeRateRate(exchangeRate, recalculateClaimAmount);
    }
    
    /**
     * Sets the value of the TransToReservingExchangeRate field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setTransToReservingExchangeRate(entity.ExchangeRate value) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setTransToReservingExchangeRate(value);
    }
    
    public void setTransToReservingExchangeRate(entity.ExchangeRate exchangeRate, boolean recalculateReservingAmounts) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setTransToReservingExchangeRate(exchangeRate, recalculateReservingAmounts);
    }
    
    public void setTransToReservingExchangeRateID(gw.pl.persistence.core.Key value) {
      setFieldValue(TRANSTORESERVINGEXCHANGERATE_PROP.get(), value);
    }
    
    /**
     * Sets the Rate of the TransToReserveExchangeRate field.
     * @param bigDecimal rate to use
     */
    public void setTransToReservingExchangeRateRate(java.math.BigDecimal bigDecimal) {
      ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setTransToReservingExchangeRateRate(bigDecimal);
    }
    
    public void setTransToReservingExchangeRateRate(java.math.BigDecimal exchangeRate, boolean recalculateReservingAndMaybeClaimAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setTransToReservingExchangeRateRate(exchangeRate, recalculateReservingAndMaybeClaimAmount);
    }
    
    public void setTransactionAmountDirectly(gw.api.financials.CurrencyAmount amount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).setTransactionAmountDirectly(amount);
    }
    
    /**
     * Sets the value of the TransactionSet field.
     */
    public void setTransactionSet(entity.TransactionSet value) {
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
    
    public void updateStatus(typekey.TransactionStatus originalStatus, typekey.TransactionStatus newStatus) {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).updateStatus(originalStatus, newStatus);
    }
    
    public void validateCostCategory() {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).validateCostCategory();
    }
    
    public void verifyHasEditableStatus() {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).verifyHasEditableStatus();
    }
    
    public void verifyLifeCycleStateConsistent() {
      ((com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal")).verifyLifeCycleStateConsistent();
    }
    
    public void verifyMultipleLineItemsParameterObeyed() throws com.guidewire.cc.system.exception.MultipleLineItemsNotAllowedException {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).verifyMultipleLineItemsParameterObeyed();
    }
    
    public void verifyStatusUnchanged() {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).verifyStatusUnchanged();
    }
    
    public void verifyTAccountsExist() throws java.lang.IllegalStateException {
      ((com.guidewire.cc.domain.financials.impl.TransactionInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionInternal")).verifyTAccountsExist();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.impl.TransactionInternal", "com.guidewire.cc.domain.financials.impl.TransactionImpl");
    config.put("com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter", "com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateAdapterNormalImpl");
    config.put("com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal", "com.guidewire.cc.domain.financials.impl.TransactionImpl");
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
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.financials.impl.TransactionImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.cc.domain.financials.impl.TransactionImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.financials.impl.TransactionImpl");
    config.put("gw.cc.financials.entity.Transaction", "com.guidewire.cc.domain.financials.recovery.impl.RecoveryReserveImpl");
    config.put("gw.cc.financials.recovery.entity.RecoveryReserve", "com.guidewire.cc.domain.financials.recovery.impl.RecoveryReserveImpl");
    config.put("gw.cc.financials.taccount.entity.TransactionTAccountOperationsDelegate", "com.guidewire.cc.domain.financials.impl.TransactionImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.RecoveryReserve.class, config);
    com.guidewire._generated.entity.RecoveryReserveInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.RecoveryReserve, com.guidewire._generated.entity.RecoveryReserveInternal>() {
      public java.lang.Object getImplementation(entity.RecoveryReserve bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.RecoveryReserveInternal getInternalInterface(entity.RecoveryReserve bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.RecoveryReserve newEmptyInstance() {
        return new entity.RecoveryReserve((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}