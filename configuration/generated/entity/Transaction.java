package entity;

/**
 * Transaction
 * 
 *         Represents a financial operation, such as creating a reserve or scheduling
 *         a payment. It is an abstract supertype, and the UI uses only its four subtypes:
 *         <ul><li>Reserve - expected payments</li><li>Payment - money paid out or liability incurred</li>
 *         <li> RecoveryReserve - expected recoveries</li><li>Recovery - credit or money received</li></ul>
 *         <p>
 *         Every transaction is made against a single ReserveLine. It contains a non-null
 *         array of TransactionLineItem entities holding the amount(s) of the transaction. Checks
 *         are not transactions. A single transaction will affect multiple T-accounts.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Transaction.eti;Transaction.eix;Transaction.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class Transaction extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable, entity.TransactionTAccountOperationsDelegate, entity.EventAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Transaction> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Transaction>("entity.Transaction");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMTOREPORTINGEXCHANGERATE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimToReportingExchangeRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Comments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COSTCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CostCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COSTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CostType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXPOSURE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Exposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LIFECYCLESTATE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LifeCycleState");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> LINEITEMS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "LineItems");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> OFFSETS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Offsets");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ONSETS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Onsets");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ORIGINTRANSACTIONONSET_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "OriginTransactionOnset");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> ORIGINTRANSACTIONONSETARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "OriginTransactionOnsetArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> RECTACCOUNTTRANSACTIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "RecTAccountTransactions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RECOVERYCODING_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RecoveryCoding");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RESERVELINE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ReserveLine");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RESERVINGCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReservingCurrency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUBMITDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SubmitDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SUBTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Subtype");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> TACCOUNTTRANSACTIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "TAccountTransactions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TRANSTOCLAIMEXCHANGERATE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TransToClaimExchangeRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TRANSTORESERVINGEXCHANGERATE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TransToReservingExchangeRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TRANSACTIONSET_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TransactionSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TransactionInternal _internal;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  protected Transaction(java.lang.Void ignored)  {
    
  }
  
  protected abstract com.guidewire._generated.entity.TransactionInternal __createInternalInterface();
  
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected abstract com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap();
  
  
  protected com.guidewire._generated.entity.TransactionInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Acknowledges a message that this transaction was submitted.
   * Updates its status to SUBMITTED.
   * @throws IllegalStateException if this transaction is not in SUBMITTING status
   */
  public void acknowledgeSubmission() {
    ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).acknowledgeSubmission();
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
   * Adds the given element to the RecTAccountTransactions array. This is achieved by setting the parent foreign key to this entity instance.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
  public void addToRecTAccountTransactions(entity.RecTAccountTransaction element) {
    __getInternalInterface().addArrayElement(RECTACCOUNTTRANSACTIONS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the TAccountTransactions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTAccountTransactions(entity.TAccountTransaction element) {
    __getInternalInterface().addArrayElement(TACCOUNTTRANSACTIONS_PROP.get(), element);
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
  
  /**
   * Equivalent to TransactionAmount. Provided for backwards
   * compatibility on SINGLE currency mode servers.
   */
  public java.math.BigDecimal getAmount() {
    return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getAmount();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
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
  
  /**
   * Gets the value of the ClaimToReportingExchangeRate field.
   * ExchangeRate to use when converting ClaimAmount to ReportingAmount. Setting this value updates the reporting amounts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExchangeRate getClaimToReportingExchangeRate() {
    return (entity.ExchangeRate)__getInternalInterface().getFieldValue(CLAIMTOREPORTINGEXCHANGERATE_PROP.get());
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
  
  /**
   * Gets the value of the Currency field.
   * The Currency of the transaction amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(CURRENCY_PROP.get());
  }
  
  /**
   * Returns the title to use for the detail page that displays detail of is transaction - different transaction types
   * use different titles, such as "Payment Details", "Recovery Details" and so on.
   */
  public java.lang.String getDetailPageTitle() {
    return ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).getDetailPageTitle();
  }
  
  /**
   * Gets the value of the Exposure field.
   * The related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure() {
    return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionLifeCycleState getLifeCycleState() {
    return (typekey.TransactionLifeCycleState)__getInternalInterface().getFieldValue(LIFECYCLESTATE_PROP.get());
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
  
  /**
   * Gets the value of the OriginTransactionOnset field.
   * TransactionOnset join entity pointing to this Transaction as an Onset.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionOnset getOriginTransactionOnset() {
    return (entity.TransactionOnset)__getInternalInterface().getFieldValue(ORIGINTRANSACTIONONSET_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionOnset[] getOriginTransactionOnsetArray() {
    return (entity.TransactionOnset[])__getInternalInterface().getFieldValue(ORIGINTRANSACTIONONSETARRAY_PROP.get());
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
  public entity.RecTAccountTransaction[] getRecTAccountTransactions() {
    return (entity.RecTAccountTransaction[])__getInternalInterface().getFieldValue(RECTACCOUNTTRANSACTIONS_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryCoding getRecoveryCoding() {
    return (entity.RecoveryCoding)__getInternalInterface().getFieldValue(RECOVERYCODING_PROP.get());
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
  
  /**
   * Gets the value of the ReserveLine field.
   * The ReserveLine associated with this transaction.  For all transaction subtypes this ReserveLine will have matching Claim, Exposure, CostType and CostCategory.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveLine getReserveLine() {
    return (entity.ReserveLine)__getInternalInterface().getFieldValue(RESERVELINE_PROP.get());
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
  
  /**
   * Gets the value of the ReservingCurrency field.
   * Reserving Currency of this transaction's ReserveLine. Indicates the currency in which reserves are to be set aside and eroded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency() {
    return (typekey.Currency)__getInternalInterface().getFieldValue(RESERVINGCURRENCY_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetiredValue() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RETIREDVALUE_PROP.get());
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
  
  /**
   * Gets the value of the TAccountTransactions field.
   * Set of T-account transactions that make up the lifecycle of this Transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccountTransaction[] getTAccountTransactions() {
    return (entity.TAccountTransaction[])__getInternalInterface().getFieldValue(TACCOUNTTRANSACTIONS_PROP.get());
  }
  
  /**
   * Gets the value of the TransToClaimExchangeRate field.
   * ExchangeRate to use when converting TransactionAmount to ClaimAmount. Setting this value updates the claim and reporting amounts. Also sets the same ExchangeRate as TransToReservingExchangeRate if ClaimCurrency and ReservingCurrency are equal.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExchangeRate getTransToClaimExchangeRate() {
    return (entity.ExchangeRate)__getInternalInterface().getFieldValue(TRANSTOCLAIMEXCHANGERATE_PROP.get());
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
   * Removes the given element from the RecTAccountTransactions array. This is achieved by marking the element for removal.
   * @deprecated This method is not intended to be available and will be removed in a future release.
   */
  @java.lang.Deprecated
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
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
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
  
  /**
   * Sets the value of the ClaimToReportingExchangeRate field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setClaimToReportingExchangeRate(entity.ExchangeRate value) {
    ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setClaimToReportingExchangeRate(value);
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
  private void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUser field.
   */
  private void setCreateUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
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
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LifeCycleState field.
   */
  private void setLifeCycleState(typekey.TransactionLifeCycleState value) {
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
  private void setLoadCommandID(java.lang.Long value) {
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
  private void setOriginTransactionOnsetArray(entity.TransactionOnset[] value) {
    __getInternalInterface().setFieldValue(ORIGINTRANSACTIONONSETARRAY_PROP.get(), value);
  }
  
  /**
   * 
   * @param customOverride 
   */
  public void setOverrideTransToClaimExchangeRate(boolean customOverride) {
    ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setOverrideTransToClaimExchangeRate(customOverride);
  }
  
  /**
   * Sets the TransToReservingExchangeRate to be a custom rate rather than a market rate
   * @param customOverride 
   */
  public void setOverrideTransToReservingExchangeRate(boolean customOverride) {
    ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setOverrideTransToReservingExchangeRate(customOverride);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RecTAccountTransactions field.
   */
  private void setRecTAccountTransactions(entity.RecTAccountTransaction[] value) {
    __getInternalInterface().setFieldValue(RECTACCOUNTTRANSACTIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RecoveryCoding field.
   */
  private void setRecoveryCoding(entity.RecoveryCoding value) {
    __getInternalInterface().setFieldValue(RECOVERYCODING_PROP.get(), value);
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
  
  /**
   * Sets the value of the ReservingCurrency field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setReservingCurrency(typekey.Currency value) {
    ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setReservingCurrency(value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
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
  private void setSubtype(typekey.Transaction value) {
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
  
  /**
   * Set the Rate on the TransToClaimExchangeRate entity. IGNORED if the ExchangeRate entity is
   * part of a Market Rates set (should call setOverrideTransToClaimExchangeRate(true) first),
   * OR if the exchangeRate is null OR server is in SINGLE currency mode.
   * @param exchangeRate 
   */
  public void setTransToClaimExchangeRateRate(java.math.BigDecimal exchangeRate) {
    ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setTransToClaimExchangeRateRate(exchangeRate);
  }
  
  /**
   * Sets the value of the TransToReservingExchangeRate field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setTransToReservingExchangeRate(entity.ExchangeRate value) {
    ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setTransToReservingExchangeRate(value);
  }
  
  /**
   * Sets the Rate of the TransToReserveExchangeRate field.
   * @param bigDecimal rate to use
   */
  public void setTransToReservingExchangeRateRate(java.math.BigDecimal bigDecimal) {
    ((gw.cc.financials.entity.Transaction)__getDelegateManager().getImplementation("gw.cc.financials.entity.Transaction")).setTransToReservingExchangeRateRate(bigDecimal);
  }
  
  /**
   * Sets the value of the TransactionSet field.
   */
  public void setTransactionSet(entity.TransactionSet value) {
    __getInternalInterface().setFieldValue(TRANSACTIONSET_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateTime field.
   */
  private void setUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateUser field.
   */
  private void setUpdateUser(entity.User value) {
    __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
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
  
  static {
    com.guidewire._generated.entity.TransactionInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.Transaction, com.guidewire._generated.entity.TransactionInternal>() {
      public java.lang.Object getImplementation(entity.Transaction bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TransactionInternal getInternalInterface(entity.Transaction bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}