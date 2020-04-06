package entity;

/**
 * BulkInvoiceItem
 * 
 *     Describes one item of the BulkInvoice, and corresponds to one line item of the original invoice.
 *     It contains data fields that define the reserve line to which the item is to be coded, as well as the amount and the PaymentType.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BulkInvoiceItem.eti;BulkInvoiceItem.eix;BulkInvoiceItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "BulkInvoiceItem")
public class BulkInvoiceItem extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.BulkInvoiceItem> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.BulkInvoiceItem>("entity.BulkInvoiceItem");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Amount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AWAITINGPROCESSING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AwaitingProcessing");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> BULKINVOICE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "BulkInvoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> BULKINVOICEITEMINFO_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "BulkInvoiceItemInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> BULKINVOICEITEMINFOARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "BulkInvoiceItemInfoArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BULKINVOICEORDER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BulkInvoiceOrder");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMINFO_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CLAIMNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ClaimNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COSTCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CostCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COSTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CostType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEOFSERVICE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateOfService");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DEDUCTIONSAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DeductionsAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EXPLANATION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Explanation");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NONERODING_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NonEroding");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PAYMENTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PaymentType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> RESERVINGCURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ReservingCurrency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICEPDEND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServicePdEnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICEPDSTART_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServicePdStart");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.BulkInvoiceItemInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public BulkInvoiceItem()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public BulkInvoiceItem(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected BulkInvoiceItem(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.BulkInvoiceItemInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.BulkInvoiceItemInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Deletes this BulkInvoiceItem and its associated payment/check.
   */
  public void delete() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).delete();
  }
  
  /**
   * Gets the value of the Amount field.
   * The amount of this invoice item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(AMOUNT_PROP.get());
  }
  
  /**
   * Returns the amount and currency of this invoice item, as an IMoney. The currency is the
   * owning invoice's currency.
   * @return IMoney representing this item's amount and currency
   */
  public gw.api.financials.IMoney getAmountComponent() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getAmountComponent();
  }
  
  /**
   * This is a convenience method to easily retrieve the single payment associated with this bulk invoice
   * item, if any.  If this bulk invoice item does not have an associated check/payment, then NULL will
   * be returned
   * @return this item's associated Payment, or NULL if no check/payment is associated with this item.
   */
  public entity.Payment getAssociatedPayment() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getAssociatedPayment();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the BulkInvoice field.
   * The bulk invoice that contains this bulk invoice item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoice getBulkInvoice() {
    return (entity.BulkInvoice)__getInternalInterface().getFieldValue(BULKINVOICE_PROP.get());
  }
  
  /**
   * Gets the value of the BulkInvoiceItemInfo field.
   * Links a BulkInvoiceItem to its info. Returns null if the associated Claim is Archived.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoiceItemInfo getBulkInvoiceItemInfo() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getBulkInvoiceItemInfo();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoiceItemInfo[] getBulkInvoiceItemInfoArray() {
    return (entity.BulkInvoiceItemInfo[])__getInternalInterface().getFieldValue(BULKINVOICEITEMINFOARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the BulkInvoiceOrder field.
   * Order of the BulkInvoiceItem on the BulkInvoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBulkInvoiceOrder() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(BULKINVOICEORDER_PROP.get());
  }
  
  /**
   * The Claim for which this BulkInvoiceItem represents a payment.
   */
  @com.guidewire.commons.entity.type.ExportAsId
  public entity.Claim getClaim() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getClaim();
  }
  
  /**
   * Gets the value of the ClaimInfo field.
   * The ClaimInfo for which this BulkInvoiceItem represents a payment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo() {
    return (entity.ClaimInfo)__getInternalInterface().getFieldValue(CLAIMINFO_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimNumber field.
   * Claim Number of the claim that this BulkInvoiceItem is related to.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getClaimNumber();
  }
  
  /**
   * Gets the value of the CostCategory field.
   * The CostCategory of the payment associated with this item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostCategory getCostCategory() {
    return (typekey.CostCategory)__getInternalInterface().getFieldValue(COSTCATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the CostType field.
   * The CostType of the payment associated with this item.
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
   * Gets the currency associated with the bulk invoice.
   */
  public typekey.Currency getCurrency() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getCurrency();
  }
  
  /**
   * Gets the value of the DateOfService field.
   * Date that the service was performed (if this check is for a service).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfService() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEOFSERVICE_PROP.get());
  }
  
  /**
   * Gets the value of the DeductionsAmount field.
   * The total amount of all deductions computed for the check associated with this bulk invoice item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getDeductionsAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(DEDUCTIONSAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the Description field.
   * A comment field for the invoice item.  The contents of this field will be copied to the memo of the place-holder check that is created for this BulkInvoiceItem in ClaimCenter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the Explanation field.
   * Validation warnings / errors generated for this BulkInvoiceItem during final processing.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExplanation() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPLANATION_PROP.get());
  }
  
  /**
   * The Exposure, if any, for which this BulkInvoiceItem represents a payment.
   */
  @com.guidewire.commons.entity.type.ExportAsId
  public entity.Exposure getExposure() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getExposure();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the PaymentType field.
   * The PaymentType for the payment associated with this item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentType getPaymentType() {
    return (typekey.PaymentType)__getInternalInterface().getFieldValue(PAYMENTTYPE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Returns the amount of this invoice item in the reporting currency (default currency in 5.0.x).
   */
  public gw.api.financials.CurrencyAmount getReportingAmount() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getReportingAmount();
  }
  
  /**
   * Retrieves the ReserveLine to which this BulkInvoiceItem is linked, if any.
   * @return the ReserveLine for this BulkInvoiceItem, or NULL if the item does not yet have a ReserveLine.
   */
  public entity.ReserveLine getReserveLine() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getReserveLine();
  }
  
  /**
   * 
   * @return Reserve line wrapper on BulkInvoiceItemInfo
   */
  public entity.ReserveLineWrapper getReserveLineWrapper() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getReserveLineWrapper();
  }
  
  /**
   * Gets the value of the ReservingCurrency field.
   * The reserving currency of the payment associated with this item.
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
   * Gets the value of the ServicePdEnd field.
   * End date of the service period for the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServicePdEnd() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEPDEND_PROP.get());
  }
  
  /**
   * Gets the value of the ServicePdStart field.
   * Start date of the service period for the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServicePdStart() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEPDSTART_PROP.get());
  }
  
  /**
   * Gets the value of the Status field.
   * The current business status of this item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BulkInvoiceItemStatus getStatus() {
    return (typekey.BulkInvoiceItemStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
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
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAwaitingProcessing() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(AWAITINGPROCESSING_PROP.get());
  }
  
  /**
   * Tests whether this BulkInvoiceItem is editable.  It is editable if:
   * <p/>
   * <ul>
   * <li> The status is one of:
   *   <ol>
   *     <li> {@link typekey.BulkInvoiceItemStatus#TC_DRAFT}
   *     <li> {@link typekey.BulkInvoiceItemStatus#TC_NOTVALID}
   *   </ol>
   * </li>
   * </ul>
   * or
   * <ul>
   * <li> The status of the owning Bulk Invoice is {@link typekey.BulkInvoiceStatus#TC_AWAITINGSUBMISSION}
   * and the status of this item is one of:
   *   <ol>
   *     <li> {@link typekey.BulkInvoiceItemStatus#TC_APPROVED}
   *     <li> {@link typekey.BulkInvoiceItemStatus#TC_REJECTED}
   *     <li> {@link BulkInvoiceItemStatus#TC_INREVIEW}
   *   </ol>
   * </li>
   * </ul>
   * <p/>
   * @return <code>true</code> if this BulkInvoiceItem is editable, else <code>false</code>
   */
  public boolean isEditable() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).isEditable();
  }
  
  /**
   * True if this item's claim is archived. false if the Claim (ClaimInfo) has
   * not been set yet, or the claim is not archived.
   */
  public boolean isItemClaimArchived() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).isItemClaimArchived();
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
   * Gets the value of the NonEroding field.
   * Indicates whether the associated payment should erode reserves (false) or not (true).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isNonEroding() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(NONERODING_PROP.get());
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
   * Sets the value of the Amount field.
   */
  public void setAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(AMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AwaitingProcessing field.
   */
  private void setAwaitingProcessing(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(AWAITINGPROCESSING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkInvoice field.
   */
  public void setBulkInvoice(entity.BulkInvoice value) {
    __getInternalInterface().setFieldValue(BULKINVOICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkInvoiceItemInfo field.
   */
  private void setBulkInvoiceItemInfo(entity.BulkInvoiceItemInfo value) {
    __getInternalInterface().setFieldValue(BULKINVOICEITEMINFO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkInvoiceItemInfoArray field.
   */
  private void setBulkInvoiceItemInfoArray(entity.BulkInvoiceItemInfo[] value) {
    __getInternalInterface().setFieldValue(BULKINVOICEITEMINFOARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkInvoiceOrder field.
   */
  public void setBulkInvoiceOrder(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BULKINVOICEORDER_PROP.get(), value);
  }
  
  /**
   * The Claim for which this BulkInvoiceItem represents a payment.
   * @param c 
   */
  @com.guidewire.commons.entity.type.ExportAsId
  public void setClaim(entity.Claim c) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).setClaim(c);
  }
  
  /**
   * This method is used to set the claim on a BulkInvoiceItem by setting its Claim Number.
   * @param claimNumber The claim # of the claim to set into the BulkInvoiceItem
   * @return the Claim Number as a String if it's valid, otherwise returns NULL
   */
  public java.lang.String setClaimByClaimNumber(java.lang.String claimNumber) {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).setClaimByClaimNumber(claimNumber);
  }
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  public void setClaimInfo(entity.ClaimInfo value) {
    __getInternalInterface().setFieldValue(CLAIMINFO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
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
   * Sets the value of the DateOfService field.
   */
  public void setDateOfService(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEOFSERVICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DeductionsAmount field.
   */
  private void setDeductionsAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(DEDUCTIONSAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Explanation field.
   */
  public void setExplanation(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EXPLANATION_PROP.get(), value);
  }
  
  /**
   * The Exposure, if any, for which this BulkInvoiceItem represents a payment.
   * @param e 
   */
  @com.guidewire.commons.entity.type.ExportAsId
  public void setExposure(entity.Exposure e) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).setExposure(e);
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
   * Sets the value of the NonEroding field.
   */
  public void setNonEroding(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(NONERODING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaymentType field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPaymentType(typekey.PaymentType value) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).setPaymentType(value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * 
   * @param reserveLineWrapper The value to set on BulkInvoiceItemInfo
   */
  public void setReserveLineWrapper(entity.ReserveLineWrapper reserveLineWrapper) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).setReserveLineWrapper(reserveLineWrapper);
  }
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  public void setReservingCurrency(typekey.Currency value) {
    __getInternalInterface().setFieldValue(RESERVINGCURRENCY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServicePdEnd field.
   */
  public void setServicePdEnd(java.util.Date value) {
    __getInternalInterface().setFieldValue(SERVICEPDEND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ServicePdStart field.
   */
  public void setServicePdStart(java.util.Date value) {
    __getInternalInterface().setFieldValue(SERVICEPDSTART_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.BulkInvoiceItemStatus value) {
    __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
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
   * Updates the proper fields on the BulkInvoiceItem to match the values required by the reserve line assigned to this
   * item.  Should be called whenever the reserve line is changed.
   */
  public void updateRelatedInvoiceItemFields() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).updateRelatedInvoiceItemFields();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.BulkInvoiceItemInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.BulkInvoiceItem.this.__getDelegateManager();
    }
    
    /**
     * Adds the given element to the BulkInvoiceItemInfoArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToBulkInvoiceItemInfoArray(entity.BulkInvoiceItemInfo element) {
      __getInternalInterface().addArrayElement(BULKINVOICEITEMINFOARRAY_PROP.get(), element);
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
    
    public boolean canExceedAvailableReservesRegardlessOfLimit() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).canExceedAvailableReservesRegardlessOfLimit();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public boolean changesRequireCheckToBeApprovedAgain() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).changesRequireCheckToBeApprovedAgain();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public entity.Check createCheck() throws com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).createCheck();
    }
    
    /**
     * Deletes this BulkInvoiceItem and its associated payment/check.
     */
    public void delete() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).delete();
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
     * Gets the value of the Amount field.
     * The amount of this invoice item.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(AMOUNT_PROP.get());
    }
    
    /**
     * Returns the amount and currency of this invoice item, as an IMoney. The currency is the
     * owning invoice's currency.
     * @return IMoney representing this item's amount and currency
     */
    public gw.api.financials.IMoney getAmountComponent() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getAmountComponent();
    }
    
    /**
     * This is a convenience method to easily retrieve the single payment associated with this bulk invoice
     * item, if any.  If this bulk invoice item does not have an associated check/payment, then NULL will
     * be returned
     * @return this item's associated Payment, or NULL if no check/payment is associated with this item.
     */
    public entity.Payment getAssociatedPayment() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getAssociatedPayment();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the BulkInvoice field.
     * The bulk invoice that contains this bulk invoice item.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BulkInvoice getBulkInvoice() {
      return (entity.BulkInvoice)__getInternalInterface().getFieldValue(BULKINVOICE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getBulkInvoiceID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(BULKINVOICE_PROP.get());
    }
    
    /**
     * Gets the value of the BulkInvoiceItemInfo field.
     * Links a BulkInvoiceItem to its info. Returns null if the associated Claim is Archived.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BulkInvoiceItemInfo getBulkInvoiceItemInfo() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getBulkInvoiceItemInfo();
    }
    
    /**
     * Gets the value of the BulkInvoiceItemInfoArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BulkInvoiceItemInfo[] getBulkInvoiceItemInfoArray() {
      return (entity.BulkInvoiceItemInfo[])__getInternalInterface().getFieldValue(BULKINVOICEITEMINFOARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getBulkInvoiceItemInfoID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(BULKINVOICEITEMINFO_PROP.get());
    }
    
    /**
     * Gets the value of the BulkInvoiceOrder field.
     * Order of the BulkInvoiceItem on the BulkInvoice.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBulkInvoiceOrder() {
      return (java.lang.Integer)__getInternalInterface().getFieldValue(BULKINVOICEORDER_PROP.get());
    }
    
    public entity.Check getCheck() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).getCheck();
    }
    
    public gw.pl.persistence.core.Key getCheckID() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).getCheckID();
    }
    
    /**
     * The Claim for which this BulkInvoiceItem represents a payment.
     */
    @com.guidewire.commons.entity.type.ExportAsId
    public entity.Claim getClaim() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getClaim();
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).getClaimID();
    }
    
    /**
     * Gets the value of the ClaimInfo field.
     * The ClaimInfo for which this BulkInvoiceItem represents a payment.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimInfo getClaimInfo() {
      return (entity.ClaimInfo)__getInternalInterface().getFieldValue(CLAIMINFO_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimInfoID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMINFO_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimNumber field.
     * Claim Number of the claim that this BulkInvoiceItem is related to.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getClaimNumber() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getClaimNumber();
    }
    
    /**
     * Gets the value of the CostCategory field.
     * The CostCategory of the payment associated with this item.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CostCategory getCostCategory() {
      return (typekey.CostCategory)__getInternalInterface().getFieldValue(COSTCATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the CostType field.
     * The CostType of the payment associated with this item.
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
    
    /**
     * Gets the currency associated with the bulk invoice.
     */
    public typekey.Currency getCurrency() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getCurrency();
    }
    
    /**
     * Gets the value of the DateOfService field.
     * Date that the service was performed (if this check is for a service).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateOfService() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEOFSERVICE_PROP.get());
    }
    
    /**
     * Gets the value of the DeductionsAmount field.
     * The total amount of all deductions computed for the check associated with this bulk invoice item.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getDeductionsAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(DEDUCTIONSAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the Description field.
     * A comment field for the invoice item.  The contents of this field will be copied to the memo of the place-holder check that is created for this BulkInvoiceItem in ClaimCenter.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the Explanation field.
     * Validation warnings / errors generated for this BulkInvoiceItem during final processing.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getExplanation() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EXPLANATION_PROP.get());
    }
    
    /**
     * The Exposure, if any, for which this BulkInvoiceItem represents a payment.
     */
    @com.guidewire.commons.entity.type.ExportAsId
    public entity.Exposure getExposure() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getExposure();
    }
    
    public gw.pl.persistence.core.Key getExposureID() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).getExposureID();
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
     * Gets the value of the PaymentType field.
     * The PaymentType for the payment associated with this item.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PaymentType getPaymentType() {
      return (typekey.PaymentType)__getInternalInterface().getFieldValue(PAYMENTTYPE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Returns the amount of this invoice item in the reporting currency (default currency in 5.0.x).
     */
    public gw.api.financials.CurrencyAmount getReportingAmount() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getReportingAmount();
    }
    
    public typekey.PaymentType getRequiredPaymentType() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).getRequiredPaymentType();
    }
    
    /**
     * Retrieves the ReserveLine to which this BulkInvoiceItem is linked, if any.
     * @return the ReserveLine for this BulkInvoiceItem, or NULL if the item does not yet have a ReserveLine.
     */
    public entity.ReserveLine getReserveLine() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getReserveLine();
    }
    
    /**
     * 
     * @return Reserve line wrapper on BulkInvoiceItemInfo
     */
    public entity.ReserveLineWrapper getReserveLineWrapper() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).getReserveLineWrapper();
    }
    
    public gw.pl.persistence.core.Key getReserveLineWrapperID() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).getReserveLineWrapperID();
    }
    
    /**
     * Gets the value of the ReservingCurrency field.
     * The reserving currency of the payment associated with this item.
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
     * Gets the value of the ServicePdEnd field.
     * End date of the service period for the check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getServicePdEnd() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEPDEND_PROP.get());
    }
    
    /**
     * Gets the value of the ServicePdStart field.
     * Start date of the service period for the check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getServicePdStart() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SERVICEPDSTART_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     * The current business status of this item.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.BulkInvoiceItemStatus getStatus() {
      return (typekey.BulkInvoiceItemStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
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
    
    public typekey.PaymentType[] getValidPaymentTypes() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).getValidPaymentTypes();
    }
    
    public void handleItemProcessingException(java.lang.Exception e) {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).handleItemProcessingException(e);
    }
    
    public boolean hasValidPaymentType() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).hasValidPaymentType();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public boolean isApproved() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).isApproved();
    }
    
    /**
     * Gets the value of the AwaitingProcessing field.
     * Flag to indicate whether this item is waiting to be processed for invoice submission.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isAwaitingProcessing() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(AWAITINGPROCESSING_PROP.get());
    }
    
    /**
     * Tests whether this BulkInvoiceItem is editable.  It is editable if:
     * <p/>
     * <ul>
     * <li> The status is one of:
     *   <ol>
     *     <li> {@link typekey.BulkInvoiceItemStatus#TC_DRAFT}
     *     <li> {@link typekey.BulkInvoiceItemStatus#TC_NOTVALID}
     *   </ol>
     * </li>
     * </ul>
     * or
     * <ul>
     * <li> The status of the owning Bulk Invoice is {@link typekey.BulkInvoiceStatus#TC_AWAITINGSUBMISSION}
     * and the status of this item is one of:
     *   <ol>
     *     <li> {@link typekey.BulkInvoiceItemStatus#TC_APPROVED}
     *     <li> {@link typekey.BulkInvoiceItemStatus#TC_REJECTED}
     *     <li> {@link BulkInvoiceItemStatus#TC_INREVIEW}
     *   </ol>
     * </li>
     * </ul>
     * <p/>
     * @return <code>true</code> if this BulkInvoiceItem is editable, else <code>false</code>
     */
    public boolean isEditable() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).isEditable();
    }
    
    /**
     * True if this item's claim is archived. false if the Claim (ClaimInfo) has
     * not been set yet, or the claim is not archived.
     */
    public boolean isItemClaimArchived() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).isItemClaimArchived();
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
     * Gets the value of the NonEroding field.
     * Indicates whether the associated payment should erode reserves (false) or not (true).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isNonEroding() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(NONERODING_PROP.get());
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
    
    public boolean isTransferred() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).isTransferred();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public boolean paymentExchangeRatesMatchExpected(entity.Payment payment) {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).paymentExchangeRatesMatchExpected(payment);
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
     * Removes the given element from the BulkInvoiceItemInfoArray array. This is achieved by marking the element for removal.
     */
    public void removeFromBulkInvoiceItemInfoArray(entity.BulkInvoiceItemInfo element) {
      __getInternalInterface().removeArrayElement(BULKINVOICEITEMINFOARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the BulkInvoiceItemInfoArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromBulkInvoiceItemInfoArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(BULKINVOICEITEMINFOARRAY_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    public void resetCostCategoryToDefault() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).resetCostCategoryToDefault();
    }
    
    public void resetCostTypeToDefault() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).resetCostTypeToDefault();
    }
    
    public entity.ExchangeRate[] selectCheckExchangeRates(entity.Check check) {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).selectCheckExchangeRates(check);
    }
    
    /**
     * Sets the value of the Amount field.
     */
    public void setAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(AMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AwaitingProcessing field.
     */
    public void setAwaitingProcessing(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(AWAITINGPROCESSING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkInvoice field.
     */
    public void setBulkInvoice(entity.BulkInvoice value) {
      __getInternalInterface().setFieldValue(BULKINVOICE_PROP.get(), value);
    }
    
    public void setBulkInvoiceID(gw.pl.persistence.core.Key value) {
      setFieldValue(BULKINVOICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkInvoiceItemInfo field.
     */
    public void setBulkInvoiceItemInfo(entity.BulkInvoiceItemInfo value) {
      __getInternalInterface().setFieldValue(BULKINVOICEITEMINFO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkInvoiceItemInfoArray field.
     */
    public void setBulkInvoiceItemInfoArray(entity.BulkInvoiceItemInfo[] value) {
      __getInternalInterface().setFieldValue(BULKINVOICEITEMINFOARRAY_PROP.get(), value);
    }
    
    public void setBulkInvoiceItemInfoID(gw.pl.persistence.core.Key value) {
      setFieldValue(BULKINVOICEITEMINFO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkInvoiceOrder field.
     */
    public void setBulkInvoiceOrder(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BULKINVOICEORDER_PROP.get(), value);
    }
    
    /**
     * The Claim for which this BulkInvoiceItem represents a payment.
     * @param c 
     */
    @com.guidewire.commons.entity.type.ExportAsId
    public void setClaim(entity.Claim c) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).setClaim(c);
    }
    
    /**
     * This method is used to set the claim on a BulkInvoiceItem by setting its Claim Number.
     * @param claimNumber The claim # of the claim to set into the BulkInvoiceItem
     * @return the Claim Number as a String if it's valid, otherwise returns NULL
     */
    public java.lang.String setClaimByClaimNumber(java.lang.String claimNumber) {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).setClaimByClaimNumber(claimNumber);
    }
    
    /**
     * Sets the value of the ClaimInfo field.
     */
    public void setClaimInfo(entity.ClaimInfo value) {
      __getInternalInterface().setFieldValue(CLAIMINFO_PROP.get(), value);
    }
    
    public void setClaimInfoID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMINFO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimNumber field.
     */
    public void setClaimNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CLAIMNUMBER_PROP.get(), value);
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
     * Sets the value of the DateOfService field.
     */
    public void setDateOfService(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEOFSERVICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DeductionsAmount field.
     */
    public void setDeductionsAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(DEDUCTIONSAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Explanation field.
     */
    public void setExplanation(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(EXPLANATION_PROP.get(), value);
    }
    
    /**
     * The Exposure, if any, for which this BulkInvoiceItem represents a payment.
     * @param e 
     */
    @com.guidewire.commons.entity.type.ExportAsId
    public void setExposure(entity.Exposure e) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).setExposure(e);
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
     * Sets the value of the NonEroding field.
     */
    public void setNonEroding(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(NONERODING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaymentType field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPaymentType(typekey.PaymentType value) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).setPaymentType(value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * 
     * @param reserveLineWrapper The value to set on BulkInvoiceItemInfo
     */
    public void setReserveLineWrapper(entity.ReserveLineWrapper reserveLineWrapper) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).setReserveLineWrapper(reserveLineWrapper);
    }
    
    /**
     * Sets the value of the ReservingCurrency field.
     */
    public void setReservingCurrency(typekey.Currency value) {
      __getInternalInterface().setFieldValue(RESERVINGCURRENCY_PROP.get(), value);
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
     * Sets the value of the ServicePdEnd field.
     */
    public void setServicePdEnd(java.util.Date value) {
      __getInternalInterface().setFieldValue(SERVICEPDEND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ServicePdStart field.
     */
    public void setServicePdStart(java.util.Date value) {
      __getInternalInterface().setFieldValue(SERVICEPDSTART_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.BulkInvoiceItemStatus value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
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
    
    public void updateBulkInvoiceDenormalizedFields() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).updateBulkInvoiceDenormalizedFields();
    }
    
    public void updateBulkInvoiceDenormalizedFieldsForDelete() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).updateBulkInvoiceDenormalizedFieldsForDelete();
    }
    
    public entity.Check updateCheck() throws com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).updateCheck();
    }
    
    /**
     * Updates the proper fields on the BulkInvoiceItem to match the values required by the reserve line assigned to this
     * item.  Should be called whenever the reserve line is changed.
     */
    public void updateRelatedInvoiceItemFields() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoiceItem)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoiceItem")).updateRelatedInvoiceItemFields();
    }
    
    public java.util.List<entity.BIValidationAlert> validate() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).validate();
    }
    
    public void validateAndProcessItem() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).validateAndProcessItem();
    }
    
    public void verifyItemClaimNotArchivedOrPurged() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal")).verifyItemClaimNotArchivedOrPurged();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemInternal", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemImpl");
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
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemImpl");
    config.put("gw.cc.financials.bulkpay.entity.BulkInvoiceItem", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceItemImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.BulkInvoiceItem.class, config);
    com.guidewire._generated.entity.BulkInvoiceItemInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.BulkInvoiceItem, com.guidewire._generated.entity.BulkInvoiceItemInternal>() {
      public java.lang.Object getImplementation(entity.BulkInvoiceItem bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.BulkInvoiceItemInternal getInternalInterface(entity.BulkInvoiceItem bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.BulkInvoiceItem newEmptyInstance() {
        return new entity.BulkInvoiceItem((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}