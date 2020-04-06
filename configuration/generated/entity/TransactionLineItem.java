package entity;

/**
 * TransactionLineItem
 * 
 *     TransactionLineItems provide a means to split the amount of a transaction into multiple
 *     categories (e.g., Doctor, Hospital, Legal, Other, etc.).  Every transaction has one or more TransactionLineItems, and
 *     the amount of the transaction is the aggregate amount of all its line items.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionLineItem.eti;TransactionLineItem.eix;TransactionLineItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "TransactionLineItem")
public class TransactionLineItem extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TransactionLineItem> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TransactionLineItem>("entity.TransactionLineItem");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMFOREXAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimForExAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Comments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> DEDUCTIBLE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Deductible");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LINECATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "LineCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPORTINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReportingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPORTINGFOREXAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReportingForExAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RESERVINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReservingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RESERVINGFOREXAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReservingForExAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TRANSACTION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Transaction");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TRANSACTIONAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TransactionAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.TransactionLineItemInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public TransactionLineItem()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public TransactionLineItem(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected TransactionLineItem(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.TransactionLineItemInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.TransactionLineItemInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Equivalent to TransactionAmount. Provided for backwards
   * compatibility on SINGLE currency mode servers.
   * </p>
   * To set this amount when appropriate, call {@link #setTransactionAmountAndUpdate(gw.api.financials.CurrencyAmount)}.
   */
  public java.math.BigDecimal getAmount() {
    return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getAmount();
  }
  
  /**
   * Looks at this line item's Transaction, Reserving and Claim Amounts (in that order), and returns the first one whose
   * Currency matches the targetCurrency. Returns null otherwise.
   * @param targetCurrency 
   * @return 
   */
  public gw.api.financials.CurrencyAmount getAmountMatchingCurrency(typekey.Currency targetCurrency) {
    return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getAmountMatchingCurrency(targetCurrency);
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
   * Gets the value of the ClaimAmount field.
   * The amount of this line item in the Claim's currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getClaimAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(CLAIMAMOUNT_PROP.get());
  }
  
  /**
   * Gets this line item's claim's currency. Required by the "CurrencyAmount" currencyProperty to resolve the claim currency.
   */
  public typekey.Currency getClaimCurrency() {
    return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getClaimCurrency();
  }
  
  /**
   * 
   * @deprecated use ClaimAmount instead
   */
  public gw.api.financials.CurrencyAmount getClaimCurrencyAmount() {
    return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getClaimCurrencyAmount();
  }
  
  /**
   * Gets the value of the ClaimForExAmount field.
   * The foreign exchange adjustment for this line item in the claim currency. This stores the amount by which the current value of ClaimAmount exceeds its original value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getClaimForExAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(CLAIMFOREXAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the Comments field.
   * A note or description of the line item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
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
   * Gets this line item's currency. Required by the "CurrencyAmount" currencyProperty to resolve the transaction currency.
   */
  public typekey.Currency getCurrency() {
    return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getCurrency();
  }
  
  /**
   * Gets the value of the Deductible field.
   * The deductible for which this transaction line item is applied, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Deductible getDeductible() {
    return (entity.Deductible)__getInternalInterface().getFieldValue(DEDUCTIBLE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the LineCategory field.
   * The category of this line item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LineCategory getLineCategory() {
    return (typekey.LineCategory)__getInternalInterface().getFieldValue(LINECATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ReportingAmount field.
   * The amount of this line item in the app's default currency (reporting currency).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReportingAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REPORTINGAMOUNT_PROP.get());
  }
  
  /**
   * 
   * @deprecated use ReportingAmount instead
   */
  public gw.api.financials.CurrencyAmount getReportingCurrencyAmount() {
    return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getReportingCurrencyAmount();
  }
  
  /**
   * Gets the value of the ReportingForExAmount field.
   * The foreign exchange adjustment for this line item in the reporting currency. This stores the amount by which the current value of ReportingAmount exceeds its original value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReportingForExAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REPORTINGFOREXAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the ReservingAmount field.
   * The amount of this line item in the Currency of the ReserveLine (ReservingCurrency).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReservingAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RESERVINGAMOUNT_PROP.get());
  }
  
  /**
   * Gets this line item's reserving currency. Required by the "CurrencyAmount" currencyProperty to resolve the reserving currency.
   */
  public typekey.Currency getReservingCurrency() {
    return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getReservingCurrency();
  }
  
  /**
   * Gets the value of the ReservingForExAmount field.
   * The foreign exchange adjustment for this line item in the reserving currency. This stores the amount by which the current value of ReservingAmount exceeds its original value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReservingForExAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RESERVINGFOREXAMOUNT_PROP.get());
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
   * Gets the value of the Transaction field.
   * The parent transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction getTransaction() {
    return (entity.Transaction)__getInternalInterface().getFieldValue(TRANSACTION_PROP.get());
  }
  
  /**
   * Gets the value of the TransactionAmount field.
   * The amount of this line item, in the transaction currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTransactionAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TRANSACTIONAMOUNT_PROP.get());
  }
  
  /**
   * Get this line item's TransactionAmount and ClaimAmount as an IPairedMoney.
   * This is for editing in the UI only. Use TransactionAmount or ClaimAmount in Gosu.
   * @deprecated Use getTransactionAmountReservingAmountPair() instead.
   */
  public gw.api.financials.IPairedMoney getTransactionAmountComponent() {
    return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getTransactionAmountComponent();
  }
  
  /**
   * Get this line item's TransactionAmount and ReservingAmount as an IPairedMoney.
   * This is for editing in the UI only. Use TransactionAmount or ReservingAmount in Gosu.
   */
  public gw.api.financials.IPairedMoney getTransactionAmountReservingAmountPair() {
    return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getTransactionAmountReservingAmountPair();
  }
  
  /**
   * 
   * @deprecated use TransactionAmount instead
   */
  public gw.api.financials.CurrencyAmount getTransactionCurrencyAmount() {
    return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getTransactionCurrencyAmount();
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
   * Set TransactionAmount, then updates the Claim amount and Reporting amount.
   * Equivalent to TransactionAmount. Provided for backwards
   * compatibility on SINGLE currency mode servers. This method defers to
   * {@link #setTransactionAmountAndUpdate(gw.api.financials.CurrencyAmount)}.
   * @param value 
   * @deprecated call {@link #setTransactionAmountAndUpdate(gw.api.financials.CurrencyAmount)} instead
   */
  public void setAmount(gw.api.financials.CurrencyAmount value) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setAmount(value);
  }
  
  /**
   * Looks at this line item's Transaction, Reserving and Claim Currencies (in that order) and, if any of them match the
   * Currency of amountToSet, calls the corresponding setXXAmountAndUpdate(..) API to set the amount on the Line Item.
   * Otherwise, i.e. if none of those Currencies matched, the amountToSet is converted to Claim Currency using the
   * current market rate and then set as the ClaimAmount on the line item.
   * @param amountToSet 
   */
  public void setAmountMatchingCurrency(gw.api.financials.CurrencyAmount amountToSet) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setAmountMatchingCurrency(amountToSet);
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
   * Sets the value of the ClaimAmount field.
   */
  private void setClaimAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(CLAIMAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets <code>ClaimAmount</code> <em>only</em>, to the new value. All other amounts (Transaction, Reserving &
   * Reporting) are left as-is.
   * @param newClaimAmount the new value for <code>ClaimAmount</code>
   */
  public void setClaimAmountAndDoNotUpdateOthers(gw.api.financials.CurrencyAmount newClaimAmount) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setClaimAmountAndDoNotUpdateOthers(newClaimAmount);
  }
  
  /**
   * Sets <code>ClaimAmount</code> and updates <code>TransactionAmount</code>, <code>ReservingAmount</code>, and <code>ReportingAmount</code> based
   * on the new value.
   * @param newClaimAmount the new value for <code>ClaimAmount</code>
   */
  public void setClaimAmountAndUpdate(gw.api.financials.CurrencyAmount newClaimAmount) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setClaimAmountAndUpdate(newClaimAmount);
  }
  
  /**
   * Sets the value of the ClaimForExAmount field.
   */
  private void setClaimForExAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(CLAIMFOREXAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
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
   * Sets the value of the Deductible field.
   */
  public void setDeductible(entity.Deductible value) {
    __getInternalInterface().setFieldValue(DEDUCTIBLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LineCategory field.
   */
  public void setLineCategory(typekey.LineCategory value) {
    __getInternalInterface().setFieldValue(LINECATEGORY_PROP.get(), value);
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
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ReportingAmount field.
   */
  private void setReportingAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(REPORTINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets <code>ReportingAmount</code> <em>only</em>, to the new value. All other amounts (Transaction, Reserving &
   * Claim) are left as-is.
   * @param newReportingAmount the new value for <code>ReportingAmount</code>
   */
  public void setReportingAmountAndDoNotUpdateOthers(gw.api.financials.CurrencyAmount newReportingAmount) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setReportingAmountAndDoNotUpdateOthers(newReportingAmount);
  }
  
  /**
   * Sets the value of the ReportingForExAmount field.
   */
  private void setReportingForExAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(REPORTINGFOREXAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReservingAmount field.
   */
  private void setReservingAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(RESERVINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets <code>ReservingAmount</code> <em>only</em>, to the new value. All other amounts (Transaction, Claim &
   * Reporting) are left as-is.
   * @param newReservingAmount the new value for <code>ReservingAmount</code>
   */
  public void setReservingAmountAndDoNotUpdateOthers(gw.api.financials.CurrencyAmount newReservingAmount) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setReservingAmountAndDoNotUpdateOthers(newReservingAmount);
  }
  
  /**
   * Sets <code>ReservingAmount</code> and updates <code>TransactionAmount</code>, <code>ClaimAmount</code>, and <code>ReportingAmount</code> based
   * on the new value.
   * @param newReservingAmount the new value for <code>ReservingAmount</code>
   */
  public void setReservingAmountAndUpdate(gw.api.financials.CurrencyAmount newReservingAmount) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setReservingAmountAndUpdate(newReservingAmount);
  }
  
  /**
   * Sets the value of the ReservingForExAmount field.
   */
  private void setReservingForExAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(RESERVINGFOREXAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Transaction field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setTransaction(entity.Transaction value) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setTransaction(value);
  }
  
  /**
   * Sets the value of the TransactionAmount field.
   */
  private void setTransactionAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TRANSACTIONAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets <code>TransactionAmount</code> <em>only</em>, to the new value. All other amounts (Reserving, Claim &
   * Reporting) are left as-is.
   * @param newTransactionAmount the new value for <code>TransactionAmount</code>
   */
  public void setTransactionAmountAndDoNotUpdateOthers(gw.api.financials.CurrencyAmount newTransactionAmount) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setTransactionAmountAndDoNotUpdateOthers(newTransactionAmount);
  }
  
  /**
   * Sets <code>TransactionAmount</code> and updates <code>ClaimAmount</code>, <code>ReservingAmount</code>, and <code>ReportingAmount</code> based
   * on the new value.
   * @param newTransactionAmount the new value for <code>TransactionAmount</code>
   */
  public void setTransactionAmountAndUpdate(gw.api.financials.CurrencyAmount newTransactionAmount) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setTransactionAmountAndUpdate(newTransactionAmount);
  }
  
  /**
   * Set TransactionAmount, then updates the Claim amount and Reporting amount.
   * @param value 
   * @deprecated call {@link #setTransactionAmountAndUpdate(gw.api.financials.CurrencyAmount)} instead
   */
  public void setTransactionCurrencyAmount(gw.api.financials.CurrencyAmount value) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setTransactionCurrencyAmount(value);
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
  
  /**
   * Updates all three amounts based on <code>claimAmount</code>
   * @param claimAmount 
   * @deprecated use {@link #setClaimAmountAndUpdate(gw.api.financials.CurrencyAmount)} instead
   */
  public void updateAmountsFromClaimAmount(gw.api.financials.CurrencyAmount claimAmount) {
    ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).updateAmountsFromClaimAmount(claimAmount);
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.TransactionLineItemInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.TransactionLineItem.this.__getDelegateManager();
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
     * Equivalent to TransactionAmount. Provided for backwards
     * compatibility on SINGLE currency mode servers.
     * </p>
     * To set this amount when appropriate, call {@link #setTransactionAmountAndUpdate(gw.api.financials.CurrencyAmount)}.
     */
    public java.math.BigDecimal getAmount() {
      return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getAmount();
    }
    
    public gw.api.financials.CurrencyAmount getAmount(com.guidewire.cc.domain.financials.AmountType amountType) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).getAmount(amountType);
    }
    
    /**
     * Looks at this line item's Transaction, Reserving and Claim Amounts (in that order), and returns the first one whose
     * Currency matches the targetCurrency. Returns null otherwise.
     * @param targetCurrency 
     * @return 
     */
    public gw.api.financials.CurrencyAmount getAmountMatchingCurrency(typekey.Currency targetCurrency) {
      return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getAmountMatchingCurrency(targetCurrency);
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
     * Gets the value of the ClaimAmount field.
     * The amount of this line item in the Claim's currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getClaimAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(CLAIMAMOUNT_PROP.get());
    }
    
    /**
     * Gets this line item's claim's currency. Required by the "CurrencyAmount" currencyProperty to resolve the claim currency.
     */
    public typekey.Currency getClaimCurrency() {
      return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getClaimCurrency();
    }
    
    /**
     * 
     * @deprecated use ClaimAmount instead
     */
    public gw.api.financials.CurrencyAmount getClaimCurrencyAmount() {
      return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getClaimCurrencyAmount();
    }
    
    /**
     * Gets the value of the ClaimForExAmount field.
     * The foreign exchange adjustment for this line item in the claim currency. This stores the amount by which the current value of ClaimAmount exceeds its original value.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getClaimForExAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(CLAIMFOREXAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the Comments field.
     * A note or description of the line item.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getComments() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(COMMENTS_PROP.get());
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
    
    /**
     * Gets this line item's currency. Required by the "CurrencyAmount" currencyProperty to resolve the transaction currency.
     */
    public typekey.Currency getCurrency() {
      return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getCurrency();
    }
    
    /**
     * Gets the value of the Deductible field.
     * The deductible for which this transaction line item is applied, if any.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Deductible getDeductible() {
      return (entity.Deductible)__getInternalInterface().getFieldValue(DEDUCTIBLE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getDeductibleID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(DEDUCTIBLE_PROP.get());
    }
    
    public gw.api.financials.CurrencyAmount getForExAmount(com.guidewire.cc.domain.financials.AmountType amountType) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).getForExAmount(amountType);
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
     * Gets the value of the LineCategory field.
     * The category of this line item.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LineCategory getLineCategory() {
      return (typekey.LineCategory)__getInternalInterface().getFieldValue(LINECATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReportingAmount field.
     * The amount of this line item in the app's default currency (reporting currency).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getReportingAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REPORTINGAMOUNT_PROP.get());
    }
    
    /**
     * 
     * @deprecated use ReportingAmount instead
     */
    public gw.api.financials.CurrencyAmount getReportingCurrencyAmount() {
      return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getReportingCurrencyAmount();
    }
    
    /**
     * Gets the value of the ReportingForExAmount field.
     * The foreign exchange adjustment for this line item in the reporting currency. This stores the amount by which the current value of ReportingAmount exceeds its original value.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getReportingForExAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REPORTINGFOREXAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the ReservingAmount field.
     * The amount of this line item in the Currency of the ReserveLine (ReservingCurrency).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getReservingAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RESERVINGAMOUNT_PROP.get());
    }
    
    /**
     * Gets this line item's reserving currency. Required by the "CurrencyAmount" currencyProperty to resolve the reserving currency.
     */
    public typekey.Currency getReservingCurrency() {
      return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getReservingCurrency();
    }
    
    /**
     * Gets the value of the ReservingForExAmount field.
     * The foreign exchange adjustment for this line item in the reserving currency. This stores the amount by which the current value of ReservingAmount exceeds its original value.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getReservingForExAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(RESERVINGFOREXAMOUNT_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the Transaction field.
     * The parent transaction.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Transaction getTransaction() {
      return (entity.Transaction)__getInternalInterface().getFieldValue(TRANSACTION_PROP.get());
    }
    
    /**
     * Gets the value of the TransactionAmount field.
     * The amount of this line item, in the transaction currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTransactionAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TRANSACTIONAMOUNT_PROP.get());
    }
    
    /**
     * Get this line item's TransactionAmount and ClaimAmount as an IPairedMoney.
     * This is for editing in the UI only. Use TransactionAmount or ClaimAmount in Gosu.
     * @deprecated Use getTransactionAmountReservingAmountPair() instead.
     */
    public gw.api.financials.IPairedMoney getTransactionAmountComponent() {
      return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getTransactionAmountComponent();
    }
    
    /**
     * Get this line item's TransactionAmount and ReservingAmount as an IPairedMoney.
     * This is for editing in the UI only. Use TransactionAmount or ReservingAmount in Gosu.
     */
    public gw.api.financials.IPairedMoney getTransactionAmountReservingAmountPair() {
      return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getTransactionAmountReservingAmountPair();
    }
    
    /**
     * 
     * @deprecated use TransactionAmount instead
     */
    public gw.api.financials.CurrencyAmount getTransactionCurrencyAmount() {
      return ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).getTransactionCurrencyAmount();
    }
    
    public gw.pl.persistence.core.Key getTransactionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TRANSACTION_PROP.get());
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
    
    public boolean isOkToRetire() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).isOkToRetire();
    }
    
    public boolean isRecalculationRequired(boolean ignoreTransactionInDecision) {
      return ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).isRecalculationRequired(ignoreTransactionInDecision);
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
    
    public void negate() {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).negate();
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
    
    public void recalculateClaimAndReportingAmount() {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).recalculateClaimAndReportingAmount();
    }
    
    public void recalculateReportingAmount() {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).recalculateReportingAmount();
    }
    
    public void recalculateReservingAmount() {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).recalculateReservingAmount();
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
    
    public void setAllAmountsForTesting(gw.api.financials.CurrencyAmount transactionAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).setAllAmountsForTesting(transactionAmount);
    }
    
    public void setAmount(com.guidewire.cc.domain.financials.AmountType amountType, gw.api.financials.CurrencyAmount value) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).setAmount(amountType, value);
    }
    
    /**
     * Set TransactionAmount, then updates the Claim amount and Reporting amount.
     * Equivalent to TransactionAmount. Provided for backwards
     * compatibility on SINGLE currency mode servers. This method defers to
     * {@link #setTransactionAmountAndUpdate(gw.api.financials.CurrencyAmount)}.
     * @param value 
     * @deprecated call {@link #setTransactionAmountAndUpdate(gw.api.financials.CurrencyAmount)} instead
     */
    public void setAmount(gw.api.financials.CurrencyAmount value) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setAmount(value);
    }
    
    public void setAmountAndCopy(com.guidewire.cc.domain.financials.AmountType amountType, gw.api.financials.CurrencyAmount value) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).setAmountAndCopy(amountType, value);
    }
    
    /**
     * Looks at this line item's Transaction, Reserving and Claim Currencies (in that order) and, if any of them match the
     * Currency of amountToSet, calls the corresponding setXXAmountAndUpdate(..) API to set the amount on the Line Item.
     * Otherwise, i.e. if none of those Currencies matched, the amountToSet is converted to Claim Currency using the
     * current market rate and then set as the ClaimAmount on the line item.
     * @param amountToSet 
     */
    public void setAmountMatchingCurrency(gw.api.financials.CurrencyAmount amountToSet) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setAmountMatchingCurrency(amountToSet);
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
     * Sets the value of the ClaimAmount field.
     */
    public void setClaimAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(CLAIMAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets <code>ClaimAmount</code> <em>only</em>, to the new value. All other amounts (Transaction, Reserving &
     * Reporting) are left as-is.
     * @param newClaimAmount the new value for <code>ClaimAmount</code>
     */
    public void setClaimAmountAndDoNotUpdateOthers(gw.api.financials.CurrencyAmount newClaimAmount) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setClaimAmountAndDoNotUpdateOthers(newClaimAmount);
    }
    
    /**
     * Sets <code>ClaimAmount</code> and updates <code>TransactionAmount</code>, <code>ReservingAmount</code>, and <code>ReportingAmount</code> based
     * on the new value.
     * @param newClaimAmount the new value for <code>ClaimAmount</code>
     */
    public void setClaimAmountAndUpdate(gw.api.financials.CurrencyAmount newClaimAmount) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setClaimAmountAndUpdate(newClaimAmount);
    }
    
    public void setClaimAmountAndUpdateReportingAndMaybeReservingAmount(gw.api.financials.CurrencyAmount newClaimAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).setClaimAmountAndUpdateReportingAndMaybeReservingAmount(newClaimAmount);
    }
    
    /**
     * Sets the value of the ClaimForExAmount field.
     */
    public void setClaimForExAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(CLAIMFOREXAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Comments field.
     */
    public void setComments(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(COMMENTS_PROP.get(), value);
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
     * Sets the value of the Deductible field.
     */
    public void setDeductible(entity.Deductible value) {
      __getInternalInterface().setFieldValue(DEDUCTIBLE_PROP.get(), value);
    }
    
    public void setDeductibleID(gw.pl.persistence.core.Key value) {
      setFieldValue(DEDUCTIBLE_PROP.get(), value);
    }
    
    public void setForExAmount(com.guidewire.cc.domain.financials.AmountType amountType, gw.api.financials.CurrencyAmount value) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).setForExAmount(amountType, value);
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
     * Sets the value of the LineCategory field.
     */
    public void setLineCategory(typekey.LineCategory value) {
      __getInternalInterface().setFieldValue(LINECATEGORY_PROP.get(), value);
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
    
    public void setOneAmountAndUpdateOthers(com.guidewire.cc.domain.financials.AmountType sourceAmountType, gw.api.financials.CurrencyAmount sourceAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).setOneAmountAndUpdateOthers(sourceAmountType, sourceAmount);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReportingAmount field.
     */
    public void setReportingAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(REPORTINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets <code>ReportingAmount</code> <em>only</em>, to the new value. All other amounts (Transaction, Reserving &
     * Claim) are left as-is.
     * @param newReportingAmount the new value for <code>ReportingAmount</code>
     */
    public void setReportingAmountAndDoNotUpdateOthers(gw.api.financials.CurrencyAmount newReportingAmount) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setReportingAmountAndDoNotUpdateOthers(newReportingAmount);
    }
    
    public void setReportingAmountAndUpdate(gw.api.financials.CurrencyAmount newReportingAmount) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).setReportingAmountAndUpdate(newReportingAmount);
    }
    
    /**
     * Sets the value of the ReportingForExAmount field.
     */
    public void setReportingForExAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(REPORTINGFOREXAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReservingAmount field.
     */
    public void setReservingAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(RESERVINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets <code>ReservingAmount</code> <em>only</em>, to the new value. All other amounts (Transaction, Claim &
     * Reporting) are left as-is.
     * @param newReservingAmount the new value for <code>ReservingAmount</code>
     */
    public void setReservingAmountAndDoNotUpdateOthers(gw.api.financials.CurrencyAmount newReservingAmount) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setReservingAmountAndDoNotUpdateOthers(newReservingAmount);
    }
    
    /**
     * Sets <code>ReservingAmount</code> and updates <code>TransactionAmount</code>, <code>ClaimAmount</code>, and <code>ReportingAmount</code> based
     * on the new value.
     * @param newReservingAmount the new value for <code>ReservingAmount</code>
     */
    public void setReservingAmountAndUpdate(gw.api.financials.CurrencyAmount newReservingAmount) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setReservingAmountAndUpdate(newReservingAmount);
    }
    
    /**
     * Sets the value of the ReservingForExAmount field.
     */
    public void setReservingForExAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(RESERVINGFOREXAMOUNT_PROP.get(), value);
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
     * Sets the value of the Transaction field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setTransaction(entity.Transaction value) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setTransaction(value);
    }
    
    /**
     * Sets the value of the TransactionAmount field.
     */
    public void setTransactionAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TRANSACTIONAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets <code>TransactionAmount</code> <em>only</em>, to the new value. All other amounts (Reserving, Claim &
     * Reporting) are left as-is.
     * @param newTransactionAmount the new value for <code>TransactionAmount</code>
     */
    public void setTransactionAmountAndDoNotUpdateOthers(gw.api.financials.CurrencyAmount newTransactionAmount) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setTransactionAmountAndDoNotUpdateOthers(newTransactionAmount);
    }
    
    /**
     * Sets <code>TransactionAmount</code> and updates <code>ClaimAmount</code>, <code>ReservingAmount</code>, and <code>ReportingAmount</code> based
     * on the new value.
     * @param newTransactionAmount the new value for <code>TransactionAmount</code>
     */
    public void setTransactionAmountAndUpdate(gw.api.financials.CurrencyAmount newTransactionAmount) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setTransactionAmountAndUpdate(newTransactionAmount);
    }
    
    /**
     * Set TransactionAmount, then updates the Claim amount and Reporting amount.
     * @param value 
     * @deprecated call {@link #setTransactionAmountAndUpdate(gw.api.financials.CurrencyAmount)} instead
     */
    public void setTransactionCurrencyAmount(gw.api.financials.CurrencyAmount value) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).setTransactionCurrencyAmount(value);
    }
    
    public void setTransactionID(gw.pl.persistence.core.Key value) {
      setFieldValue(TRANSACTION_PROP.get(), value);
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
    
    /**
     * Updates all three amounts based on <code>claimAmount</code>
     * @param claimAmount 
     * @deprecated use {@link #setClaimAmountAndUpdate(gw.api.financials.CurrencyAmount)} instead
     */
    public void updateAmountsFromClaimAmount(gw.api.financials.CurrencyAmount claimAmount) {
      ((gw.cc.financials.entity.TransactionLineItem)__getDelegateManager().getImplementation("gw.cc.financials.entity.TransactionLineItem")).updateAmountsFromClaimAmount(claimAmount);
    }
    
    public void updateClaimAmountFromReportingAmount(boolean forTesting) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).updateClaimAmountFromReportingAmount(forTesting);
    }
    
    public void updateClaimAmountFromTransactionAmount(boolean forTesting) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).updateClaimAmountFromTransactionAmount(forTesting);
    }
    
    public void updateReportingAmountFromAnyOtherAmount(boolean forTesting) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).updateReportingAmountFromAnyOtherAmount(forTesting);
    }
    
    public void updateReservingAmountFromTransactionAmount(boolean forTesting) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).updateReservingAmountFromTransactionAmount(forTesting);
    }
    
    public void updateTransactionAmountFromClaimAmount(boolean forTesting) {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).updateTransactionAmountFromClaimAmount(forTesting);
    }
    
    public void validateLineCategory() {
      ((com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal")).validateLineCategory();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal", "com.guidewire.cc.domain.financials.impl.TransactionLineItemImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.financials.impl.TransactionLineItemImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.cc.domain.financials.impl.TransactionLineItemImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.financials.impl.TransactionLineItemImpl");
    config.put("gw.cc.financials.entity.TransactionLineItem", "com.guidewire.cc.domain.financials.impl.TransactionLineItemImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.TransactionLineItem.class, config);
    com.guidewire._generated.entity.TransactionLineItemInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.TransactionLineItem, com.guidewire._generated.entity.TransactionLineItemInternal>() {
      public java.lang.Object getImplementation(entity.TransactionLineItem bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TransactionLineItemInternal getInternalInterface(entity.TransactionLineItem bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.TransactionLineItem newEmptyInstance() {
        return new entity.TransactionLineItem((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}