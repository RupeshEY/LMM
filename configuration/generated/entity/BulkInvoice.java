package entity;

/**
 * BulkInvoice
 * 
 *     The top level entity for Bulk Pay, which corresponds to the incoming invoice or bill to be
 *     paid. It has a unique ID (which may correspond to the invoice), some data fields (such as payee and a scheduled send
 *     date), and a non-null array of bulk invoice items (refer to the BulkInvoiceItem entity for details). A bulk invoice
 *     is not associated with a single claim, but each line item (each BulkInvoiceItem) is associated with a different claim.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BulkInvoice.eti;BulkInvoice.eix;BulkInvoice.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "BulkInvoice")
public class BulkInvoice extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Approvable, entity.EFTDataDelegate, entity.EventAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.BulkInvoice> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.BulkInvoice>("entity.BulkInvoice");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACCOUNTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AccountName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPROVALDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ApprovalDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> APPROVALSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ApprovalStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPROVEDREPORTINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ApprovedReportingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> APPROVEDTRANSACTIONAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ApprovedTransactionAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BANKACCOUNTNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BankAccountNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> BANKACCOUNTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "BankAccountType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BANKNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BankName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BANKROUTINGNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BankRoutingNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BULKINVOICETOTAL_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BulkInvoiceTotal");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CHECKINSTRUCTIONS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CheckInstructions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Comments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CURRENCY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Currency");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DEFAULTCOSTCATEGORY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DefaultCostCategory");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DEFAULTCOSTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DefaultCostType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DEFAULTPAYMENTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DefaultPaymentType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DELIVERYMETHOD_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DeliveryMethod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> INVOICEITEMS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "InvoiceItems");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INVOICENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InvoiceNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISPRIMARY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IsPrimary");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISSUEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IssueDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LASTVALIDATEDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LastValidatedDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAILTO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MailTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAILTOADDRESS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MailToAddress");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> MAILINGADDRESS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "MailingAddress");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MEMO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Memo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAYTO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PayTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAYTODENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PayToDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PAYEE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Payee");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PAYMENTMETHOD_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PaymentMethod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROCESSINGITEMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ProcessingItems");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECEIVEDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReceivedDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REPORTABILITY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Reportability");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPORTABLEAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReportableAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> REQUESTINGUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RequestingUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCHEDULEDSENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ScheduledSendDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SPLITEQUALLY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "SplitEqually");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALREPORTINGAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalReportingAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TOTALTRANSACTIONAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TotalTransactionAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> TRANSTOREPORTINGEXCHANGERATE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "TransToReportingExchangeRate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> VALID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Valid");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> VALIDATIONALERTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ValidationAlerts");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.BulkInvoiceInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public BulkInvoice()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public BulkInvoice(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected BulkInvoice(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.BulkInvoiceInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.BulkInvoiceInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Acknowledges a message that this bulk invoice was submitted.
   * Updates its status to REQUESTED.
   * For each line item, updates its status to SUBMITTED if it was SUBMITTING,
   * and acknowledges its placeholder check.
   * @throws IllegalStateException if this invoice is not in REQUESTING status
   */
  public void acknowledgeSubmission() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).acknowledgeSubmission();
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
   * Create a new BulkInvoiceItem and add it to the list on this invoice.  Also, if the BulkInvoice
   * has a value of TRUE for spread evenly and a positive TotalAmount, then recalculates the sub amounts
   * for each item in the invoice.
   * @return The newly created Bulk Invoice Item.
   */
  public entity.BulkInvoiceItem addNewInvoiceItem() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).addNewInvoiceItem();
  }
  
  /**
   * Adds the given element to the InvoiceItems array. This is achieved by setting the parent foreign key to this entity instance.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void addToInvoiceItems(entity.BulkInvoiceItem value) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).addToInvoiceItems(value);
  }
  
  /**
   * Adds a new BIValidationAlert to the bulk invoice with alertType and alertMessage.
   * @param alertType type of alert
   * @param alertMessage message of alert
   */
  public void addValidationAlert(typekey.BIValidationAlertType alertType, java.lang.String alertMessage) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).addValidationAlert(alertType, alertMessage);
  }
  
  /**
   * <b>Note: This method should only be called from a rule in the Approval Routing ruleset</b>.
   * <p/>
   * Causes the approval activity to be sent to the supervisor of the group
   * to which the exposure is assigned, if there is exactly one exposure,
   * or the group to which the claim is assigned otherwise.
   * @return <tt>false</tt> if the approving user would be the user who
   *         submitted the approval bean - if, for instance, the user were the
   *         supervisor of the group to which the claim/exposure is assigned, or
   *         if the claim and exposure are not yet assigned
   */
  public boolean approveByGroupSupervisor() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).approveByGroupSupervisor();
  }
  
  /**
   * <b>Note: This method should only be called from a rule in the Approval Routing ruleset</b>.
   * <p/>
   * Handles the use case of an approval working its way up the group chain.
   * <ol>
   * <li>If submitting user is in the owning group and is not supervisor then approval goes to the group supervisor.</li>
   * <li>If the group supervisor is the submitting user, then the approval escaates to the group supervisor
   * of the next group up the tree.</li>
   * <li>If the submitting user is a group supervisor somewher ein the upline, then the approval escalates to
   * the supervisor of the next group up the tree.</li>
   * <li>If the approval has worked its way up to the supervisor of the root group, then it is assigned to the
   * default owner.</li>
   * <li>Otherwise, if the submitting user is in one and only one group, then the approval goes to that group's
   * supervisor. Otherwise, approval goes to the owning group's supervisor.</li>
   * </ol>
   * @return <tt>false</tt> if assignment is unsuccessful, else <tt>true</tt>
   */
  public boolean approveByUserSupervisor() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).approveByUserSupervisor();
  }
  
  /**
   * Deletes this BulkInvoice and all its contained BulkInvoiceItems.
   * This method will throw an IllegalStateException if it is not in one of the following statuses:
   * @throws IllegalStateException if the BulkInvoice is not one of the following statuses:
   * <p/>
   * <ul>
   * <li>{@link typekey.BulkInvoiceStatus#TC_DRAFT}</li>
   * <li>{@link BulkInvoiceStatus#TC_INREVIEW}</li>
   * <li>{@link typekey.BulkInvoiceStatus#TC_PENDINGITEMVALIDATION}</li>
   * <li>{@link BulkInvoiceStatus#TC_AWAITINGSUBMISSION}</li>
   * </ul>
   */
  public void delete() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).delete();
  }
  
  /**
   * Gets the value of the AccountName field.
   * The name on the account
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAccountName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ACCOUNTNAME_PROP.get());
  }
  
  /**
   * Gets the value of the ApprovalDate field.
   * The date when the object was ultimately approved or rejected
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getApprovalDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(APPROVALDATE_PROP.get());
  }
  
  /**
   * Retrieves all the approval activities for this Bulk Invoice, typically so that
   * a history view can be generated.
   * @return a List of the approval activities for this BulkInvoice.
   */
  public java.util.List<entity.Activity> getApprovalHistory() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getApprovalHistory();
  }
  
  /**
   * Gets the value of the ApprovalStatus field.
   * The approval status of the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ApprovalStatus getApprovalStatus() {
    return (typekey.ApprovalStatus)__getInternalInterface().getFieldValue(APPROVALSTATUS_PROP.get());
  }
  
  /**
   * Returns the currency and sum of all approved items' amounts of this invoice, as a CurrencyAmount.
   * @return CurrencyAmount representing this invoice's amount and currency
   */
  public gw.api.financials.CurrencyAmountPair getApprovedCurrencyAmount() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getApprovedCurrencyAmount();
  }
  
  /**
   * Retrieves only the approved BulkInvoiceItems contained by this BulkInvoice.  Note that this method currently
   * does a direct query to the database, so it should only used used for a <b>non-new</b> invoice, and it will not return
   * accurate results if one or more inserted/updated/removed invoice items are pending commit to the database.
   * @return QueryProcessor encapsulating a query to retrieve only the approved invoice items for this invoice
   */
  public gw.api.database.IQueryBeanResult<entity.BulkInvoiceItem> getApprovedInvoiceItems() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getApprovedInvoiceItems();
  }
  
  /**
   * Gets the value of the ApprovedReportingAmount field.
   * Denormalized value of amount in reporting currency of all approved invoice items.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getApprovedReportingAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(APPROVEDREPORTINGAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the ApprovedTransactionAmount field.
   * Denormalized value of amount in transaction currency of all approved invoice items.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getApprovedTransactionAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(APPROVEDTRANSACTIONAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the BankAccountNumber field.
   * The bank account number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBankAccountNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BANKACCOUNTNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the BankAccountType field.
   * The type of bank accout e.g. checking, savings etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BankAccountType getBankAccountType() {
    return (typekey.BankAccountType)__getInternalInterface().getFieldValue(BANKACCOUNTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the BankName field.
   * The name of the bank
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBankName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BANKNAME_PROP.get());
  }
  
  /**
   * Gets the value of the BankRoutingNumber field.
   * The routing number is a nine digit bank code used in the United States
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBankRoutingNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BANKROUTINGNUMBER_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Returns the invoice amount and currency of this invoice, as an IMutableMoney.
   * @return IMutableMoney representing this invoice's amount and currency
   */
  public gw.api.financials.IMutableMoney getBulkInvoiceAmountComponent() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getBulkInvoiceAmountComponent();
  }
  
  /**
   * Gets the value of the BulkInvoiceTotal field.
   * Amount to be split evenly across all invoice items, or zero if item amounts are to be entered individually.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getBulkInvoiceTotal() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(BULKINVOICETOTAL_PROP.get());
  }
  
  /**
   * Gets the value of the CheckInstructions field.
   * Special handling instructions for the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CheckHandlingInstructions getCheckInstructions() {
    return (typekey.CheckHandlingInstructions)__getInternalInterface().getFieldValue(CHECKINSTRUCTIONS_PROP.get());
  }
  
  /**
   * Gets the value of the CheckNumber field.
   * The check or EFT identifier for the single large check generated for this invoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKNUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the Comments field.
   * Comments about the check, such as a reason it was voided.
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
   * Gets the value of the Currency field.
   * Currency that the line items on this BulkInvoice should use.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getCurrency();
  }
  
  /**
   * Retrieves the sum of all deductions' amounts. Note that this method currently
   * does a direct query to the database for any non-new invoice, so in that case the returned amount may be inaccurate
   * if this method is called after one or more BulkInvoiceItems have been added/update/removed and before a database commit.
   * @return CurrencyAmount containing the sum of deductions
   */
  public gw.api.financials.CurrencyAmount getDeductionsSum() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getDeductionsSum();
  }
  
  /**
   * Gets the value of the DefaultCostCategory field.
   * The CostCategory, if any, shared by every payment on this BulkInvoice unless overriden by a particular line-item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostCategory getDefaultCostCategory() {
    return (typekey.CostCategory)__getInternalInterface().getFieldValue(DEFAULTCOSTCATEGORY_PROP.get());
  }
  
  /**
   * Gets the value of the DefaultCostType field.
   * The CostType, if any, shared by every payment on this BulkInvoice unless overriden by a particular line-item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostType getDefaultCostType() {
    return (typekey.CostType)__getInternalInterface().getFieldValue(DEFAULTCOSTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the DefaultPaymentType field.
   *  The PaymentType, if any, shared by every payment on this BulkInvoice unless overriden by a particular line-item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentType getDefaultPaymentType() {
    return (typekey.PaymentType)__getInternalInterface().getFieldValue(DEFAULTPAYMENTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the DeliveryMethod field.
   * Requested delivery method for the bulk check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DeliveryMethod getDeliveryMethod() {
    return (typekey.DeliveryMethod)__getInternalInterface().getFieldValue(DELIVERYMETHOD_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the InvoiceItems field.
   * The collection of BulkInvoiceItems on this invoice, corresponding to the line-items on the real-world invoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoiceItem[] getInvoiceItems() {
    return (entity.BulkInvoiceItem[])__getInternalInterface().getFieldValue(INVOICEITEMS_PROP.get());
  }
  
  /**
   * Gets the value of the InvoiceNumber field.
   * Unique number of the physical invoice related to this bulk pay invoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInvoiceNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INVOICENUMBER_PROP.get());
  }
  
  /**
   * Gets the value of the IssueDate field.
   * Date the check was issued.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getIssueDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ISSUEDATE_PROP.get());
  }
  
  /**
   * The last user who approved this BulkInvoice.
   * <p/>
   * For example, if User A submits a BulkInvoice for approval, then the
   * LastApprovingUser is User A.  Suppose that BulkInvoice then requires
   * approval by User B.  When User B approves the TransactionSet, then the
   * LastApprovingUser becomes User B.  And so on . . .
   * <p/>
   * Note: This method should only be called from BulkInvoice Approval Routing and BulkInvoice Approval
   * Rules.  If this method is called from any other ruleset, it may throw an NPE.
   * @return The last approving user
   */
  public entity.User getLastApprovingUser() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getLastApprovingUser();
  }
  
  /**
   * Gets the value of the LastValidatedDate field.
   * The date that this BulkInvoice was last validated. This property is always non-null when Valid is true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLastValidatedDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(LASTVALIDATEDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the MailTo field.
   * Name of the person/company to whom the check should be mailed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMailTo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MAILTO_PROP.get());
  }
  
  /**
   * Gets the value of the MailToAddress field.
   * @deprecated Address of the person/company to whom the check should be mailed.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMailToAddress() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MAILTOADDRESS_PROP.get());
  }
  
  /**
   * Gets the value of the MailingAddress field.
   * Address of the person/company to whom this invoice should be mailed. This represents an Address entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getMailingAddress() {
    return (entity.Address)__getInternalInterface().getFieldValue(MAILINGADDRESS_PROP.get());
  }
  
  /**
   * Gets the value of the Memo field.
   * Memo to include on the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMemo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MEMO_PROP.get());
  }
  
  /**
   * Returns whether this invoice has a custom exchange rate.
   * @return true if this bulk invoice has a custom exchange rate, false otherwise.
   */
  public boolean getOverrideTransToReportingExchangeRate() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getOverrideTransToReportingExchangeRate();
  }
  
  /**
   * Gets the value of the PayTo field.
   * Pay to the order of value for the bulk check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPayTo() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PAYTO_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPayToDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PAYTODENORM_PROP.get());
  }
  
  /**
   * Gets the value of the Payee field.
   * The Payee for all the bulkinvoiceitems on this bulkinvoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getPayee() {
    return (entity.Contact)__getInternalInterface().getFieldValue(PAYEE_PROP.get());
  }
  
  /**
   * Gets the value of the PaymentMethod field.
   * Requested payment method for all payments in the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentMethod getPaymentMethod() {
    return (typekey.PaymentMethod)__getInternalInterface().getFieldValue(PAYMENTMETHOD_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the ReceivedDate field.
   * Date that the invoice was received or entered.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReceivedDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(RECEIVEDDATE_PROP.get());
  }
  
  /**
   * Gets the value of the Reportability field.
   * Whether the bulk payment should be reported to the IRS as income.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReportabilityType getReportability() {
    return (typekey.ReportabilityType)__getInternalInterface().getFieldValue(REPORTABILITY_PROP.get());
  }
  
  /**
   * Gets the value of the ReportableAmount field.
   * (Unused. May be removed in a future release.) Reportable amount of the BI check (for deductions).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getReportableAmount() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REPORTABLEAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the RequestingUser field.
   * The user submitting the object for approval
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getRequestingUser() {
    return (entity.User)__getInternalInterface().getFieldValue(REQUESTINGUSER_PROP.get());
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
   * Gets the value of the ScheduledSendDate field.
   * Date that the bulk invoice should be submitted to the downstream system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getScheduledSendDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SCHEDULEDSENDDATE_PROP.get());
  }
  
  /**
   * Returns a QueryProcesser representing the set of BulkInvoiceItems for this BulkInvoice sorted by the default order.
   * Currently we sort by the BulkInvoiceOrder field as the default.
   * @return a QueryProcessor to obtain the set of Bulk Invoice Items sorted by the Bulk Invoice Order.
   */
  public gw.api.database.IQueryBeanResult<entity.BulkInvoiceItem> getSortedInvoiceItemsQuery() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getSortedInvoiceItemsQuery();
  }
  
  /**
   * Gets the value of the Status field.
   * Business status of this bulk invoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BulkInvoiceStatus getStatus() {
    return (typekey.BulkInvoiceStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
  }
  
  /**
   * Retrieves the aggregate amount of all approved, submitted, and submitting invoice items on this bulk invoice. Note that this method currently
   * does a direct query to the database for any non-new invoice, so in that case the returned amount may be inaccurate
   * if this method is called after one or more BulkInvoiceItems have been added/update/removed and before a database commit.
   * @return CurrencyAmount containing the aggregate amount
   */
  public gw.api.financials.CurrencyAmount getTotalAmountOfAllApprovedInvoiceItems() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getTotalAmountOfAllApprovedInvoiceItems();
  }
  
  /**
   * Returns the currency and sum of all items' amounts of this invoice, as a CurrencyAmount.
   * @return CurrencyAmount representing this invoice's amount and currency
   */
  public gw.api.financials.CurrencyAmountPair getTotalCurrencyAmount() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getTotalCurrencyAmount();
  }
  
  /**
   * Gets the value of the TotalReportingAmount field.
   * Denormalized value of total amount in reporting currency of all invoice items.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalReportingAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALREPORTINGAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the TotalTransactionAmount field.
   * Denormalized value of total amount in transaction currency of all invoice items.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalTransactionAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALTRANSACTIONAMOUNT_PROP.get());
  }
  
  /**
   * Gets the value of the TransToReportingExchangeRate field.
   * The Transaction-to-Reporting exchange rate used to select Transaction-to-Claim and Transaction-to-Reporting exchange rates for the checks created for this bulk invoice. If this refers to a market exchange rate, current market rates will be selected. Otherwise, a market Claim-to-Reporting exchange rate will be selected and a custom Transaction-to-Claim rate will be created such that, when multiplied together, they equal this rate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExchangeRate getTransToReportingExchangeRate() {
    return (entity.ExchangeRate)__getInternalInterface().getFieldValue(TRANSTOREPORTINGEXCHANGERATE_PROP.get());
  }
  
  /**
   * 
   * @return TransToReportingExchangeRate.Rate or null if TransToReportingExchangeRate is null
   */
  @gw.datatype.annotation.DataType(name = "exchangerate")
  public java.math.BigDecimal getTransToReportingExchangeRateRate() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getTransToReportingExchangeRateRate();
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
   * Gets the value of the ValidationAlerts field.
   * Any alerts returned by the most recent validation call.  If empty, then the BulkInvoice is considered valid.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BIValidationAlert[] getValidationAlerts() {
    return (entity.BIValidationAlert[])__getInternalInterface().getFieldValue(VALIDATIONALERTS_PROP.get());
  }
  
  /**
   * Determines whether there are any approval activities for this Bulk Invoice.
   * This is the same as <code>bulkInvoice.ApprovalHistory.HasElements</code>,
   * but is more efficient because it does not load any of the activity entities
   * from the database.
   * @return true if there are any approval activities, false otherwise
   */
  public boolean hasApprovalHistory() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).hasApprovalHistory();
  }
  
  /**
   * Tests whether any of the claims on this invoice have been archived.
   * @return <code>true</code> if the invoice has any archived claims, else <code>false</code>
   */
  public boolean hasArchivedClaims() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).hasArchivedClaims();
  }
  
  /**
   * Tests whether this invoice currently has a status of {@link BulkInvoiceStatus#TC_INVALIDITEMS}.
   * @return <code>true</code> if the invoice has the indicated status, else <code>false</code>
   */
  public boolean hasInvalidInvoiceItems() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).hasInvalidInvoiceItems();
  }
  
  /**
   * Sets the BulkInvoice to be invalid and unapproved.  This only has an effect on BulkInvoices
   * that are currently valid.
   */
  public void invalidate() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).invalidate();
  }
  
  /**
   * Tests whether this bulk invoice is currently valid (i.e., has been validated
   * successfully and had no meaningful change since).
   * @return <code>true</code> if this BulkInvoice is currently valid, else <code>false</code>
   */
  public boolean isBulkInvoiceValid() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isBulkInvoiceValid();
  }
  
  /**
   * Tests whether this BulkInvoice can be deleted.
   * @return <code>true</code> if this BulkInvoice can be deleted, else <code>false</code>
   */
  public boolean isDeletable() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isDeletable();
  }
  
  /**
   * Tests whether this BulkInvoice can be deleted.
   * @return <code>true</code> if this BulkInvoice can be deleted, else <code>false</code>
   * @deprecated use Deletable instead
   */
  public boolean isDeleteable() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isDeleteable();
  }
  
  /**
   * Tests whether this BulkInvoice is editable.  A BulkInvoice is editable if the
   * status is any of the following:
   * <p/>
   * <ul>
   * <li>{@link BulkInvoiceStatus#TC_DRAFT}</li>
   * <li>{@link BulkInvoiceStatus#TC_INREVIEW}</li>
   * <li>{@link typekey.BulkInvoiceStatus#TC_AWAITINGSUBMISSION}</li>
   * </ul>
   * <p/>
   * 
   * or, if the status is {@link typekey.BulkInvoiceStatus#TC_PENDINGITEMVALIDATION} and
   * it's been marked as EditableWhilePending.  This only happens if one or more
   * BulkInvoiceItems were approved but then failed validation or their checks failed
   * validation.
   * @return <code>true</code> if this BulkInvoice is editable, else <code>false</code>
   */
  public boolean isEditable() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isEditable();
  }
  
  /**
   * Gets the value of the IsPrimary field.
   * Indicates if this is the primary EFT record for the contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsPrimary() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ISPRIMARY_PROP.get());
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
   * Tests whether the payee is changeable for the Bulk Invoice.  This is only the case if the bulk invoice
   * is editable, and none of its associated checks have yet been escalated.
   * @return <code>true</code> if the bulk invoice's payee is changeable, else <code>false</code>
   */
  public boolean isPayeeChangeable() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isPayeeChangeable();
  }
  
  /**
   * Tests whether this bulk invoice is currently undergoing final processing, wherein all the
   * bulk invoice items are validated and associated placeholder checks are created.
   * @return <code>true</code> if the BulkInvoice is currently in 'Pending Item Validation' state, else
   * returns <code>false</code>
   */
  public boolean isPendingItemValidation() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isPendingItemValidation();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isProcessingItems() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(PROCESSINGITEMS_PROP.get());
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
   * Gets the value of the SplitEqually field.
   * Designates whether or not the amount for each individual line-item should be automatically calculated as an even share of the total amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSplitEqually() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SPLITEQUALLY_PROP.get());
  }
  
  /**
   * Tests whether this BulkInvoice can be stopped (only if it's been submitted to the downstream system).
   * @return <code>true</code> if the BulkInvoice is stoppable, else <code>false</code>
   */
  public boolean isStoppable() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isStoppable();
  }
  
  /**
   * Tests whether this Bulk Invoice can be submitted for approval and final processing
   * (i.e., its status is {@link typekey.BulkInvoiceStatus#TC_DRAFT}, it is valid and it has at
   * least one BulkInvoiceItem).
   * @return <code>true</code> if it can be submitted for approval and final processing,
   *         else <code>false</code>
   */
  public boolean isSubmittable() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isSubmittable();
  }
  
  /**
   * Gets the value of the Valid field.
   * Indicates whether this BulkInvoice has been validated and if so whether the validation was successful.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isValid() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(VALID_PROP.get());
  }
  
  /**
   * Tests whether this BulkInvoice can be validated (i.e., only if it has at least one BulkInvoiceItem and is not
   * currently valid).
   * @return <code>true</code> if the BulkInvoice is validateable, else <code>false</code>
   */
  public boolean isValidateable() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isValidateable();
  }
  
  /**
   * Tests whether this BulkInvoice can be voided (only if it's been submitted to the downstream system).
   * @return <code>true</code> if the BulkInvoice is voidable, else <code>false</code>
   */
  public boolean isVoidable() {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isVoidable();
  }
  
  /**
   * Marks the invoice as OnHold.  Typically this method is only called from the associated API.
   * @throws IllegalStateException If invoice is not in requesting or requested status
   */
  public void placeDownstreamHold() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).placeDownstreamHold();
  }
  
  /**
   * If this BulkInvoice has a value of TRUE for 'SplitEqually', this method recalculates
   * the amounts for each of the contained invoice items based on the TotalAmount entered for
   * the Invoice.  If the value of SplitEqually is FALSE, then this method does nothing.
   */
  public void recalculateSplitAmounts() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).recalculateSplitAmounts();
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
   * Removes the given element from the InvoiceItems array. This is achieved by marking the element for removal.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void removeFromInvoiceItems(entity.BulkInvoiceItem value) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).removeFromInvoiceItems(value);
  }
  
  /**
   * Removes the given element from the InvoiceItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInvoiceItems(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(INVOICEITEMS_PROP.get(), elementID);
  }
  
  /**
   * If the BulkInvoice is AwaitingSubmission with a scheduled send date of today, escalates the BulkInvoice's
   * status to {@link typekey.BulkInvoiceStatus#TC_REQUESTING} which means that all associated and unsubmitted checks will
   * also be requested.
   */
  public void requestInvoice() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).requestInvoice();
  }
  
  /**
   * <b>Note: This method should only be called from a rule in the BulkInvoice Approval ruleset</b>.
   * <p/>
   * Forces this BulkInvoice to require approval.
   * <p/>
   * Note: This method can only be called from rules.
   * @param reason the reason(s) that approval is required
   * @return True if bulk invoice requires approval
   */
  public boolean requireApproval(java.lang.String reason) {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).requireApproval(reason);
  }
  
  /**
   * Sets the value of the AccountName field.
   */
  public void setAccountName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ACCOUNTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ApprovalDate field.
   */
  public void setApprovalDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(APPROVALDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ApprovalStatus field.
   */
  public void setApprovalStatus(typekey.ApprovalStatus value) {
    __getInternalInterface().setFieldValue(APPROVALSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ApprovedReportingAmount field.
   */
  private void setApprovedReportingAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(APPROVEDREPORTINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ApprovedTransactionAmount field.
   */
  private void setApprovedTransactionAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(APPROVEDTRANSACTIONAMOUNT_PROP.get(), value);
  }
  
  /**
   * <b>Note: This method should only be called from a rule in the Approval Routing ruleset</b>.
   * <p/>
   * Selects a user to approve the approval activity.
   * @param user A user to be set as the individual who next needs to approve this Bulk Invoice
   * @param group A group to which this Bulk Invoice should be submitted for approval, typically one
   *              of the groups of the user.
   * @return <tt>false</tt> if the user or group is null or retired;
   *         <tt>true</tt> otherwise.
   */
  public boolean setApprovingUser(entity.User user, entity.Group group) {
    return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setApprovingUser(user, group);
  }
  
  /**
   * Sets the value of the BankAccountNumber field.
   */
  public void setBankAccountNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BANKACCOUNTNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BankAccountType field.
   */
  public void setBankAccountType(typekey.BankAccountType value) {
    __getInternalInterface().setFieldValue(BANKACCOUNTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BankName field.
   */
  public void setBankName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BANKNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BankRoutingNumber field.
   */
  public void setBankRoutingNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(BANKROUTINGNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BulkInvoiceTotal field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setBulkInvoiceTotal(gw.api.financials.CurrencyAmount value) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setBulkInvoiceTotal(value);
  }
  
  /**
   * Sets the value of the CheckInstructions field.
   */
  public void setCheckInstructions(typekey.CheckHandlingInstructions value) {
    __getInternalInterface().setFieldValue(CHECKINSTRUCTIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckNumber field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setCheckNumber(java.lang.String value) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setCheckNumber(value);
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
   * Sets the value of the Currency field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setCurrency(typekey.Currency value) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setCurrency(value);
  }
  
  /**
   * Sets the value of the DefaultCostCategory field.
   */
  public void setDefaultCostCategory(typekey.CostCategory value) {
    __getInternalInterface().setFieldValue(DEFAULTCOSTCATEGORY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DefaultCostType field.
   */
  public void setDefaultCostType(typekey.CostType value) {
    __getInternalInterface().setFieldValue(DEFAULTCOSTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DefaultPaymentType field.
   */
  public void setDefaultPaymentType(typekey.PaymentType value) {
    __getInternalInterface().setFieldValue(DEFAULTPAYMENTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DeliveryMethod field.
   */
  public void setDeliveryMethod(typekey.DeliveryMethod value) {
    __getInternalInterface().setFieldValue(DELIVERYMETHOD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InvoiceItems field.
   */
  public void setInvoiceItems(entity.BulkInvoiceItem[] value) {
    __getInternalInterface().setFieldValue(INVOICEITEMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the InvoiceNumber field.
   */
  public void setInvoiceNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(INVOICENUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IsPrimary field.
   */
  public void setIsPrimary(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ISPRIMARY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IssueDate field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setIssueDate(java.util.Date value) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setIssueDate(value);
  }
  
  /**
   * Sets the value of the LastValidatedDate field.
   */
  private void setLastValidatedDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(LASTVALIDATEDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MailTo field.
   */
  public void setMailTo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MAILTO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MailToAddress field.
   * @deprecated Address of the person/company to whom the check should be mailed.
   */
  @java.lang.Deprecated
  public void setMailToAddress(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MAILTOADDRESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MailingAddress field.
   */
  public void setMailingAddress(entity.Address value) {
    __getInternalInterface().setFieldValue(MAILINGADDRESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Memo field.
   */
  public void setMemo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MEMO_PROP.get(), value);
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
   * Specifies whether this invoice should use a custom exchange rate, and if so creates
   * a new exchange rate if it does not already have on.
   * @param override if true, uses a custom rate
   */
  public void setOverrideTransToReportingExchangeRate(boolean override) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setOverrideTransToReportingExchangeRate(override);
  }
  
  /**
   * Sets the value of the PayTo field.
   */
  public void setPayTo(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PAYTO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PayToDenorm field.
   */
  private void setPayToDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PAYTODENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Payee field.
   */
  public void setPayee(entity.Contact value) {
    __getInternalInterface().setFieldValue(PAYEE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaymentMethod field.
   */
  public void setPaymentMethod(typekey.PaymentMethod value) {
    __getInternalInterface().setFieldValue(PAYMENTMETHOD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ProcessingItems field.
   */
  private void setProcessingItems(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PROCESSINGITEMS_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the ReceivedDate field.
   */
  public void setReceivedDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(RECEIVEDDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Reportability field.
   */
  public void setReportability(typekey.ReportabilityType value) {
    __getInternalInterface().setFieldValue(REPORTABILITY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ReportableAmount field.
   */
  public void setReportableAmount(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(REPORTABLEAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RequestingUser field.
   */
  public void setRequestingUser(entity.User value) {
    __getInternalInterface().setFieldValue(REQUESTINGUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ScheduledSendDate field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setScheduledSendDate(java.util.Date value) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setScheduledSendDate(value);
  }
  
  /**
   * Sets the value of the SplitEqually field.
   */
  public void setSplitEqually(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SPLITEQUALLY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setStatus(typekey.BulkInvoiceStatus value) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setStatus(value);
  }
  
  /**
   * Sets the value of the TotalReportingAmount field.
   */
  private void setTotalReportingAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALREPORTINGAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TotalTransactionAmount field.
   */
  private void setTotalTransactionAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(TOTALTRANSACTIONAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TransToReportingExchangeRate field.
   */
  public void setTransToReportingExchangeRate(entity.ExchangeRate value) {
    __getInternalInterface().setFieldValue(TRANSTOREPORTINGEXCHANGERATE_PROP.get(), value);
  }
  
  /**
   * Sets the Rate on the TransToClaimExchangeRate entity to exchangeRate. (Actually, a copy of the current
   * TransToClaimExchangeRate will be made but with the new rate value.) The current TransToClaimExchangeRate must
   * not be a market rate (its ExchangeRateSet must not be a market rate set; equivalently,
   * OverrideTransToReportingExchangeRate must be true).  The exchangeRate must be non-null; a null
   * argument will be ignored.
   * @param exchangeRate The exchange rate to set
   * @throws IllegalStateException if TransToClaimExchangeRate is a market rate
   * @throws NullPointerException if TransToClaimExchangeRate is null
   */
  public void setTransToReportingExchangeRateRate(java.math.BigDecimal exchangeRate) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setTransToReportingExchangeRateRate(exchangeRate);
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
   * Sets the value of the Valid field.
   */
  private void setValid(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(VALID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ValidationAlerts field.
   */
  private void setValidationAlerts(entity.BIValidationAlert[] value) {
    __getInternalInterface().setFieldValue(VALIDATIONALERTS_PROP.get(), value);
  }
  
  /**
   * Marks the invoice and all associated approved InvoiceItems as PendingStop, along with all associated checks.
   * @throws IllegalStateException If invoice does not have a valid status for voiding the invoice
   */
  public void stopBulkInvoice() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).stopBulkInvoice();
  }
  
  /**
   * Submits this Bulk invoice for approval.  This is the pre-requisite for submitting the invoice for final
   * processing, which will happen automatically once the invoice is approved.
   */
  public void submitForApproval() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).submitForApproval();
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
   * Updates the status of the <code>BulkInvoice</code> and/or sets the check number or issue date.
   * This method can set the <code>BulkInvoiceStatus</code> to one of the following:
   * <ul>
   * <li><code>TC_ISSUED</code></li>
   * <li><code>TC_CLEARED</code></li>
   * <li><code>TC_VOIDED</code></li>
   * <li><code>TC_STOPPED</code></li>
   * </ul>
   * <p/>
   * Use acknowledgeSubmission() to update from REQUESTING to REQUESTED status.
   * <p/>
   * Note: This method does not update the Status of any BulkInvoiceItem or any placeholder checks, except when
   * uncancelling the BulkInvoice (e.g. update status from PendingVoid to Issued). If updating the BulkInvoice status,
   * at the same time you should loop over all the placeholder checks for the BulkInvoice's Items and call
   * check.updateCheckStatus() to update their statuses as well. That call will also update the BulkInvoiceItem status,
   * if appropriate.
   * @param checkNumber Check number to update, optional.
   * @param issueDate Date the check was issued.
   * @param status Status to update.
   * @throws IllegalStateException If bulk invoice status not in legal state
   * @deprecated Use {@link #updateBulkInvoiceStatus(String, java.util.Date, gw.cc.financials.typekey.BulkInvoiceStatus)} instead.
   */
  @java.lang.Deprecated
  public void updateBulkInvoiceStatus(java.lang.String checkNumber, java.util.Calendar issueDate, typekey.BulkInvoiceStatus status) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).updateBulkInvoiceStatus(checkNumber, issueDate, status);
  }
  
  /**
   * Updates the status of the <code>BulkInvoice</code> and/or sets the check number or issue date.
   * This method can set the <code>BulkInvoiceStatus</code> to one of the following:
   * <ul>
   * <li><code>TC_ISSUED</code></li>
   * <li><code>TC_CLEARED</code></li>
   * <li><code>TC_VOIDED</code></li>
   * <li><code>TC_STOPPED</code></li>
   * </ul>
   * <p/>
   * Use acknowledgeSubmission() to update from REQUESTING to REQUESTED status.
   * <p/>
   * Note: This method does not update the Status of any BulkInvoiceItem or any placeholder checks, except when
   * uncancelling the BulkInvoice (e.g. update status from PendingVoid to Issued). If updating the BulkInvoice status,
   * at the same time you should loop over all the placeholder checks for the BulkInvoice's Items and call
   * check.updateCheckStatus() to update their statuses as well. That call will also update the BulkInvoiceItem status,
   * if appropriate.
   * @param checkNumber Check number to update, optional.
   * @param issueDate Date the check was issued.
   * @param status Status to update.
   * @throws IllegalStateException If bulk invoice status not in legal state
   */
  public void updateBulkInvoiceStatus(java.lang.String checkNumber, java.util.Date issueDate, typekey.BulkInvoiceStatus status) {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).updateBulkInvoiceStatus(checkNumber, issueDate, status);
  }
  
  /**
   * Performs validation on this BulkInvoice.  After this method is called, the results can be checked via
   * calls to the {@link #isValid()} and {@link #getValidationAlerts()} methods. If no validation plugin is
   * registered, then the invoice will be automatically marked as valid.
   */
  public void validate() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).validate();
  }
  
  /**
   * Verifies that any changes on this bulk invoice are actually allowed. This should be called to check that all
   * changes made in the UI are allowed to be committed, because an invoice's editability can change during a user's
   * edit session. This method queries the databse to check that certain conditions for editability are still
   * satisfied. If any conditions are violated, a UserDisplayableException is thrown. Conditions to check are:
   * <p />
   * <ul>
   * <li>The status of the bulk invoice did not change to cause it to become uneditable; typically this is caused by
   * an escalation process changing the status to requesting.</li>
   * <li>If any payee-related fields (Payee, PayTo, MailTo, MailingAddress) are changed, this bulk invoice is still
   * payee changeable, as determined by the isPayeeChangeable method.</li>
   * </ul>
   */
  public void verifyChangesAllowed() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).verifyChangesAllowed();
  }
  
  /**
   * Marks the invoice and all associated approved InvoiceItems as PendingVoid, along with all associated checks.
   * @throws IllegalStateException If invoice does not have a valid status for voiding the invoice
   */
  public void voidBulkInvoice() {
    ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).voidBulkInvoice();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.BulkInvoiceInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.BulkInvoice.this.__getDelegateManager();
    }
    
    /**
     * Acknowledges a message that this bulk invoice was submitted.
     * Updates its status to REQUESTED.
     * For each line item, updates its status to SUBMITTED if it was SUBMITTING,
     * and acknowledges its placeholder check.
     * @throws IllegalStateException if this invoice is not in REQUESTING status
     */
    public void acknowledgeSubmission() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).acknowledgeSubmission();
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
     * Create a new BulkInvoiceItem and add it to the list on this invoice.  Also, if the BulkInvoice
     * has a value of TRUE for spread evenly and a positive TotalAmount, then recalculates the sub amounts
     * for each item in the invoice.
     * @return The newly created Bulk Invoice Item.
     */
    public entity.BulkInvoiceItem addNewInvoiceItem() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).addNewInvoiceItem();
    }
    
    /**
     * Adds the given element to the InvoiceItems array. This is achieved by setting the parent foreign key to this entity instance.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void addToInvoiceItems(entity.BulkInvoiceItem value) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).addToInvoiceItems(value);
    }
    
    /**
     * Adds the given element to the ValidationAlerts array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToValidationAlerts(entity.BIValidationAlert element) {
      __getInternalInterface().addArrayElement(VALIDATIONALERTS_PROP.get(), element);
    }
    
    /**
     * Adds a new BIValidationAlert to the bulk invoice with alertType and alertMessage.
     * @param alertType type of alert
     * @param alertMessage message of alert
     */
    public void addValidationAlert(typekey.BIValidationAlertType alertType, java.lang.String alertMessage) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).addValidationAlert(alertType, alertMessage);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    /**
     * <b>Note: This method should only be called from a rule in the Approval Routing ruleset</b>.
     * <p/>
     * Causes the approval activity to be sent to the supervisor of the group
     * to which the exposure is assigned, if there is exactly one exposure,
     * or the group to which the claim is assigned otherwise.
     * @return <tt>false</tt> if the approving user would be the user who
     *         submitted the approval bean - if, for instance, the user were the
     *         supervisor of the group to which the claim/exposure is assigned, or
     *         if the claim and exposure are not yet assigned
     */
    public boolean approveByGroupSupervisor() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).approveByGroupSupervisor();
    }
    
    /**
     * <b>Note: This method should only be called from a rule in the Approval Routing ruleset</b>.
     * <p/>
     * Handles the use case of an approval working its way up the group chain.
     * <ol>
     * <li>If submitting user is in the owning group and is not supervisor then approval goes to the group supervisor.</li>
     * <li>If the group supervisor is the submitting user, then the approval escaates to the group supervisor
     * of the next group up the tree.</li>
     * <li>If the submitting user is a group supervisor somewher ein the upline, then the approval escalates to
     * the supervisor of the next group up the tree.</li>
     * <li>If the approval has worked its way up to the supervisor of the root group, then it is assigned to the
     * default owner.</li>
     * <li>Otherwise, if the submitting user is in one and only one group, then the approval goes to that group's
     * supervisor. Otherwise, approval goes to the owning group's supervisor.</li>
     * </ol>
     * @return <tt>false</tt> if assignment is unsuccessful, else <tt>true</tt>
     */
    public boolean approveByUserSupervisor() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).approveByUserSupervisor();
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
    
    /**
     * Deletes this BulkInvoice and all its contained BulkInvoiceItems.
     * This method will throw an IllegalStateException if it is not in one of the following statuses:
     * @throws IllegalStateException if the BulkInvoice is not one of the following statuses:
     * <p/>
     * <ul>
     * <li>{@link typekey.BulkInvoiceStatus#TC_DRAFT}</li>
     * <li>{@link BulkInvoiceStatus#TC_INREVIEW}</li>
     * <li>{@link typekey.BulkInvoiceStatus#TC_PENDINGITEMVALIDATION}</li>
     * <li>{@link BulkInvoiceStatus#TC_AWAITINGSUBMISSION}</li>
     * </ul>
     */
    public void delete() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).delete();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
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
     * Gets the value of the AccountName field.
     * The name on the account
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAccountName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ACCOUNTNAME_PROP.get());
    }
    
    /**
     * Gets the value of the ApprovalDate field.
     * The date when the object was ultimately approved or rejected
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getApprovalDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(APPROVALDATE_PROP.get());
    }
    
    public com.guidewire.pl.system.approval.ApprovalHandler getApprovalHandler() {
      return ((com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods")).getApprovalHandler();
    }
    
    /**
     * Retrieves all the approval activities for this Bulk Invoice, typically so that
     * a history view can be generated.
     * @return a List of the approval activities for this BulkInvoice.
     */
    public java.util.List<entity.Activity> getApprovalHistory() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getApprovalHistory();
    }
    
    /**
     * Gets the value of the ApprovalStatus field.
     * The approval status of the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ApprovalStatus getApprovalStatus() {
      return (typekey.ApprovalStatus)__getInternalInterface().getFieldValue(APPROVALSTATUS_PROP.get());
    }
    
    /**
     * Returns the currency and sum of all approved items' amounts of this invoice, as a CurrencyAmount.
     * @return CurrencyAmount representing this invoice's amount and currency
     */
    public gw.api.financials.CurrencyAmountPair getApprovedCurrencyAmount() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getApprovedCurrencyAmount();
    }
    
    /**
     * Retrieves only the approved BulkInvoiceItems contained by this BulkInvoice.  Note that this method currently
     * does a direct query to the database, so it should only used used for a <b>non-new</b> invoice, and it will not return
     * accurate results if one or more inserted/updated/removed invoice items are pending commit to the database.
     * @return QueryProcessor encapsulating a query to retrieve only the approved invoice items for this invoice
     */
    public gw.api.database.IQueryBeanResult<entity.BulkInvoiceItem> getApprovedInvoiceItems() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getApprovedInvoiceItems();
    }
    
    /**
     * Gets the value of the ApprovedReportingAmount field.
     * Denormalized value of amount in reporting currency of all approved invoice items.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getApprovedReportingAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(APPROVEDREPORTINGAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the ApprovedTransactionAmount field.
     * Denormalized value of amount in transaction currency of all approved invoice items.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getApprovedTransactionAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(APPROVEDTRANSACTIONAMOUNT_PROP.get());
    }
    
    public gw.plugin.approval.UserGroupPair getApprovingUser(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods")).getApprovingUser(userId);
    }
    
    /**
     * Gets the value of the BankAccountNumber field.
     * The bank account number
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBankAccountNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BANKACCOUNTNUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the BankAccountType field.
     * The type of bank accout e.g. checking, savings etc
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.BankAccountType getBankAccountType() {
      return (typekey.BankAccountType)__getInternalInterface().getFieldValue(BANKACCOUNTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the BankName field.
     * The name of the bank
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBankName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BANKNAME_PROP.get());
    }
    
    /**
     * Gets the value of the BankRoutingNumber field.
     * The routing number is a nine digit bank code used in the United States
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getBankRoutingNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(BANKROUTINGNUMBER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Returns the invoice amount and currency of this invoice, as an IMutableMoney.
     * @return IMutableMoney representing this invoice's amount and currency
     */
    public gw.api.financials.IMutableMoney getBulkInvoiceAmountComponent() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getBulkInvoiceAmountComponent();
    }
    
    /**
     * Gets the value of the BulkInvoiceTotal field.
     * Amount to be split evenly across all invoice items, or zero if item amounts are to be entered individually.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getBulkInvoiceTotal() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(BULKINVOICETOTAL_PROP.get());
    }
    
    /**
     * Gets the value of the CheckInstructions field.
     * Special handling instructions for the check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CheckHandlingInstructions getCheckInstructions() {
      return (typekey.CheckHandlingInstructions)__getInternalInterface().getFieldValue(CHECKINSTRUCTIONS_PROP.get());
    }
    
    /**
     * Gets the value of the CheckNumber field.
     * The check or EFT identifier for the single large check generated for this invoice.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCheckNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKNUMBER_PROP.get());
    }
    
    public entity.Claim getClaimForActivities() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).getClaimForActivities();
    }
    
    public entity.Claim getClaimForActivitiesByQuery() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).getClaimForActivitiesByQuery();
    }
    
    /**
     * Gets the value of the Comments field.
     * Comments about the check, such as a reason it was voided.
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
     * Gets the value of the Currency field.
     * Currency that the line items on this BulkInvoice should use.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.Currency getCurrency() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getCurrency();
    }
    
    public typekey.Currency getCurrency(boolean useOldValues) {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).getCurrency(useOldValues);
    }
    
    /**
     * Retrieves the sum of all deductions' amounts. Note that this method currently
     * does a direct query to the database for any non-new invoice, so in that case the returned amount may be inaccurate
     * if this method is called after one or more BulkInvoiceItems have been added/update/removed and before a database commit.
     * @return CurrencyAmount containing the sum of deductions
     */
    public gw.api.financials.CurrencyAmount getDeductionsSum() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getDeductionsSum();
    }
    
    /**
     * Gets the value of the DefaultCostCategory field.
     * The CostCategory, if any, shared by every payment on this BulkInvoice unless overriden by a particular line-item.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CostCategory getDefaultCostCategory() {
      return (typekey.CostCategory)__getInternalInterface().getFieldValue(DEFAULTCOSTCATEGORY_PROP.get());
    }
    
    /**
     * Gets the value of the DefaultCostType field.
     * The CostType, if any, shared by every payment on this BulkInvoice unless overriden by a particular line-item.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CostType getDefaultCostType() {
      return (typekey.CostType)__getInternalInterface().getFieldValue(DEFAULTCOSTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the DefaultPaymentType field.
     *  The PaymentType, if any, shared by every payment on this BulkInvoice unless overriden by a particular line-item.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PaymentType getDefaultPaymentType() {
      return (typekey.PaymentType)__getInternalInterface().getFieldValue(DEFAULTPAYMENTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the DeliveryMethod field.
     * Requested delivery method for the bulk check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DeliveryMethod getDeliveryMethod() {
      return (typekey.DeliveryMethod)__getInternalInterface().getFieldValue(DELIVERYMETHOD_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
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
     * Gets the value of the InvoiceItems field.
     * The collection of BulkInvoiceItems on this invoice, corresponding to the line-items on the real-world invoice.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BulkInvoiceItem[] getInvoiceItems() {
      return (entity.BulkInvoiceItem[])__getInternalInterface().getFieldValue(INVOICEITEMS_PROP.get());
    }
    
    /**
     * Gets the value of the InvoiceNumber field.
     * Unique number of the physical invoice related to this bulk pay invoice.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getInvoiceNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(INVOICENUMBER_PROP.get());
    }
    
    /**
     * Gets the value of the IssueDate field.
     * Date the check was issued.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getIssueDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ISSUEDATE_PROP.get());
    }
    
    /**
     * The last user who approved this BulkInvoice.
     * <p/>
     * For example, if User A submits a BulkInvoice for approval, then the
     * LastApprovingUser is User A.  Suppose that BulkInvoice then requires
     * approval by User B.  When User B approves the TransactionSet, then the
     * LastApprovingUser becomes User B.  And so on . . .
     * <p/>
     * Note: This method should only be called from BulkInvoice Approval Routing and BulkInvoice Approval
     * Rules.  If this method is called from any other ruleset, it may throw an NPE.
     * @return The last approving user
     */
    public entity.User getLastApprovingUser() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getLastApprovingUser();
    }
    
    /**
     * Gets the value of the LastValidatedDate field.
     * The date that this BulkInvoice was last validated. This property is always non-null when Valid is true.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getLastValidatedDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(LASTVALIDATEDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the MailTo field.
     * Name of the person/company to whom the check should be mailed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMailTo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MAILTO_PROP.get());
    }
    
    /**
     * Gets the value of the MailToAddress field.
     * @deprecated Address of the person/company to whom the check should be mailed.
     */
    @java.lang.Deprecated
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMailToAddress() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MAILTOADDRESS_PROP.get());
    }
    
    /**
     * Gets the value of the MailingAddress field.
     * Address of the person/company to whom this invoice should be mailed. This represents an Address entity.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Address getMailingAddress() {
      return (entity.Address)__getInternalInterface().getFieldValue(MAILINGADDRESS_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getMailingAddressID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(MAILINGADDRESS_PROP.get());
    }
    
    /**
     * Gets the value of the Memo field.
     * Memo to include on the check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMemo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MEMO_PROP.get());
    }
    
    /**
     * Returns whether this invoice has a custom exchange rate.
     * @return true if this bulk invoice has a custom exchange rate, false otherwise.
     */
    public boolean getOverrideTransToReportingExchangeRate() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getOverrideTransToReportingExchangeRate();
    }
    
    /**
     * Gets the value of the PayTo field.
     * Pay to the order of value for the bulk check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPayTo() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PAYTO_PROP.get());
    }
    
    /**
     * Gets the value of the PayToDenorm field.
     * denorm field for PayTo
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPayToDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PAYTODENORM_PROP.get());
    }
    
    /**
     * Gets the value of the Payee field.
     * The Payee for all the bulkinvoiceitems on this bulkinvoice.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Contact getPayee() {
      return (entity.Contact)__getInternalInterface().getFieldValue(PAYEE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPayeeID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PAYEE_PROP.get());
    }
    
    /**
     * Gets the value of the PaymentMethod field.
     * Requested payment method for all payments in the check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PaymentMethod getPaymentMethod() {
      return (typekey.PaymentMethod)__getInternalInterface().getFieldValue(PAYMENTMETHOD_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the ReceivedDate field.
     * Date that the invoice was received or entered.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getReceivedDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(RECEIVEDDATE_PROP.get());
    }
    
    /**
     * Gets the value of the Reportability field.
     * Whether the bulk payment should be reported to the IRS as income.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ReportabilityType getReportability() {
      return (typekey.ReportabilityType)__getInternalInterface().getFieldValue(REPORTABILITY_PROP.get());
    }
    
    /**
     * Gets the value of the ReportableAmount field.
     * (Unused. May be removed in a future release.) Reportable amount of the BI check (for deductions).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getReportableAmount() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(REPORTABLEAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the RequestingUser field.
     * The user submitting the object for approval
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getRequestingUser() {
      return (entity.User)__getInternalInterface().getFieldValue(REQUESTINGUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRequestingUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(REQUESTINGUSER_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the ScheduledSendDate field.
     * Date that the bulk invoice should be submitted to the downstream system.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getScheduledSendDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SCHEDULEDSENDDATE_PROP.get());
    }
    
    /**
     * Returns a QueryProcesser representing the set of BulkInvoiceItems for this BulkInvoice sorted by the default order.
     * Currently we sort by the BulkInvoiceOrder field as the default.
     * @return a QueryProcessor to obtain the set of Bulk Invoice Items sorted by the Bulk Invoice Order.
     */
    public gw.api.database.IQueryBeanResult<entity.BulkInvoiceItem> getSortedInvoiceItemsQuery() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getSortedInvoiceItemsQuery();
    }
    
    /**
     * Gets the value of the Status field.
     * Business status of this bulk invoice.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.BulkInvoiceStatus getStatus() {
      return (typekey.BulkInvoiceStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Retrieves the aggregate amount of all approved, submitted, and submitting invoice items on this bulk invoice. Note that this method currently
     * does a direct query to the database for any non-new invoice, so in that case the returned amount may be inaccurate
     * if this method is called after one or more BulkInvoiceItems have been added/update/removed and before a database commit.
     * @return CurrencyAmount containing the aggregate amount
     */
    public gw.api.financials.CurrencyAmount getTotalAmountOfAllApprovedInvoiceItems() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getTotalAmountOfAllApprovedInvoiceItems();
    }
    
    /**
     * Returns the currency and sum of all items' amounts of this invoice, as a CurrencyAmount.
     * @return CurrencyAmount representing this invoice's amount and currency
     */
    public gw.api.financials.CurrencyAmountPair getTotalCurrencyAmount() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getTotalCurrencyAmount();
    }
    
    /**
     * Gets the value of the TotalReportingAmount field.
     * Denormalized value of total amount in reporting currency of all invoice items.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalReportingAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALREPORTINGAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the TotalTransactionAmount field.
     * Denormalized value of total amount in transaction currency of all invoice items.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getTotalTransactionAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(TOTALTRANSACTIONAMOUNT_PROP.get());
    }
    
    /**
     * Gets the value of the TransToReportingExchangeRate field.
     * The Transaction-to-Reporting exchange rate used to select Transaction-to-Claim and Transaction-to-Reporting exchange rates for the checks created for this bulk invoice. If this refers to a market exchange rate, current market rates will be selected. Otherwise, a market Claim-to-Reporting exchange rate will be selected and a custom Transaction-to-Claim rate will be created such that, when multiplied together, they equal this rate.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ExchangeRate getTransToReportingExchangeRate() {
      return (entity.ExchangeRate)__getInternalInterface().getFieldValue(TRANSTOREPORTINGEXCHANGERATE_PROP.get());
    }
    
    public entity.ExchangeRate getTransToReportingExchangeRate(boolean useOldValues) {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).getTransToReportingExchangeRate(useOldValues);
    }
    
    public gw.pl.persistence.core.Key getTransToReportingExchangeRateID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(TRANSTOREPORTINGEXCHANGERATE_PROP.get());
    }
    
    /**
     * 
     * @return TransToReportingExchangeRate.Rate or null if TransToReportingExchangeRate is null
     */
    @gw.datatype.annotation.DataType(name = "exchangerate")
    public java.math.BigDecimal getTransToReportingExchangeRateRate() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).getTransToReportingExchangeRateRate();
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
     * Gets the value of the ValidationAlerts field.
     * Any alerts returned by the most recent validation call.  If empty, then the BulkInvoice is considered valid.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BIValidationAlert[] getValidationAlerts() {
      return (entity.BIValidationAlert[])__getInternalInterface().getFieldValue(VALIDATIONALERTS_PROP.get());
    }
    
    /**
     * Determines whether there are any approval activities for this Bulk Invoice.
     * This is the same as <code>bulkInvoice.ApprovalHistory.HasElements</code>,
     * but is more efficient because it does not load any of the activity entities
     * from the database.
     * @return true if there are any approval activities, false otherwise
     */
    public boolean hasApprovalHistory() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).hasApprovalHistory();
    }
    
    /**
     * Tests whether any of the claims on this invoice have been archived.
     * @return <code>true</code> if the invoice has any archived claims, else <code>false</code>
     */
    public boolean hasArchivedClaims() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).hasArchivedClaims();
    }
    
    /**
     * Tests whether this invoice currently has a status of {@link BulkInvoiceStatus#TC_INVALIDITEMS}.
     * @return <code>true</code> if the invoice has the indicated status, else <code>false</code>
     */
    public boolean hasInvalidInvoiceItems() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).hasInvalidInvoiceItems();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Sets the BulkInvoice to be invalid and unapproved.  This only has an effect on BulkInvoices
     * that are currently valid.
     */
    public void invalidate() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).invalidate();
    }
    
    public boolean isAwaitingSubmission() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).isAwaitingSubmission();
    }
    
    /**
     * Tests whether this bulk invoice is currently valid (i.e., has been validated
     * successfully and had no meaningful change since).
     * @return <code>true</code> if this BulkInvoice is currently valid, else <code>false</code>
     */
    public boolean isBulkInvoiceValid() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isBulkInvoiceValid();
    }
    
    /**
     * Tests whether this BulkInvoice can be deleted.
     * @return <code>true</code> if this BulkInvoice can be deleted, else <code>false</code>
     */
    public boolean isDeletable() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isDeletable();
    }
    
    /**
     * Tests whether this BulkInvoice can be deleted.
     * @return <code>true</code> if this BulkInvoice can be deleted, else <code>false</code>
     * @deprecated use Deletable instead
     */
    public boolean isDeleteable() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isDeleteable();
    }
    
    /**
     * Tests whether this BulkInvoice is editable.  A BulkInvoice is editable if the
     * status is any of the following:
     * <p/>
     * <ul>
     * <li>{@link BulkInvoiceStatus#TC_DRAFT}</li>
     * <li>{@link BulkInvoiceStatus#TC_INREVIEW}</li>
     * <li>{@link typekey.BulkInvoiceStatus#TC_AWAITINGSUBMISSION}</li>
     * </ul>
     * <p/>
     * 
     * or, if the status is {@link typekey.BulkInvoiceStatus#TC_PENDINGITEMVALIDATION} and
     * it's been marked as EditableWhilePending.  This only happens if one or more
     * BulkInvoiceItems were approved but then failed validation or their checks failed
     * validation.
     * @return <code>true</code> if this BulkInvoice is editable, else <code>false</code>
     */
    public boolean isEditable() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isEditable();
    }
    
    public boolean isFullRecalcOfDenormAmountsNeeded() {
      return ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).isFullRecalcOfDenormAmountsNeeded();
    }
    
    /**
     * Gets the value of the IsPrimary field.
     * Indicates if this is the primary EFT record for the contact
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIsPrimary() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ISPRIMARY_PROP.get());
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
     * Tests whether the payee is changeable for the Bulk Invoice.  This is only the case if the bulk invoice
     * is editable, and none of its associated checks have yet been escalated.
     * @return <code>true</code> if the bulk invoice's payee is changeable, else <code>false</code>
     */
    public boolean isPayeeChangeable() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isPayeeChangeable();
    }
    
    /**
     * Tests whether this bulk invoice is currently undergoing final processing, wherein all the
     * bulk invoice items are validated and associated placeholder checks are created.
     * @return <code>true</code> if the BulkInvoice is currently in 'Pending Item Validation' state, else
     * returns <code>false</code>
     */
    public boolean isPendingItemValidation() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isPendingItemValidation();
    }
    
    /**
     * Gets the value of the ProcessingItems field.
     * Boolean flag to indicate whether the invoice's items are currently being processed.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isProcessingItems() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(PROCESSINGITEMS_PROP.get());
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
     * Gets the value of the SplitEqually field.
     * Designates whether or not the amount for each individual line-item should be automatically calculated as an even share of the total amount.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isSplitEqually() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(SPLITEQUALLY_PROP.get());
    }
    
    /**
     * Tests whether this BulkInvoice can be stopped (only if it's been submitted to the downstream system).
     * @return <code>true</code> if the BulkInvoice is stoppable, else <code>false</code>
     */
    public boolean isStoppable() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isStoppable();
    }
    
    /**
     * Tests whether this Bulk Invoice can be submitted for approval and final processing
     * (i.e., its status is {@link typekey.BulkInvoiceStatus#TC_DRAFT}, it is valid and it has at
     * least one BulkInvoiceItem).
     * @return <code>true</code> if it can be submitted for approval and final processing,
     *         else <code>false</code>
     */
    public boolean isSubmittable() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isSubmittable();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Gets the value of the Valid field.
     * Indicates whether this BulkInvoice has been validated and if so whether the validation was successful.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isValid() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(VALID_PROP.get());
    }
    
    /**
     * Tests whether this BulkInvoice can be validated (i.e., only if it has at least one BulkInvoiceItem and is not
     * currently valid).
     * @return <code>true</code> if the BulkInvoice is validateable, else <code>false</code>
     */
    public boolean isValidateable() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isValidateable();
    }
    
    /**
     * Tests whether this BulkInvoice can be voided (only if it's been submitted to the downstream system).
     * @return <code>true</code> if the BulkInvoice is voidable, else <code>false</code>
     */
    public boolean isVoidable() {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).isVoidable();
    }
    
    public void markAsApproved() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).markAsApproved();
    }
    
    public void markAsInReview() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).markAsInReview();
    }
    
    public void markAsRejected() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).markAsRejected();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    /**
     * Marks the invoice as OnHold.  Typically this method is only called from the associated API.
     * @throws IllegalStateException If invoice is not in requesting or requested status
     */
    public void placeDownstreamHold() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).placeDownstreamHold();
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * If this BulkInvoice has a value of TRUE for 'SplitEqually', this method recalculates
     * the amounts for each of the contained invoice items based on the TotalAmount entered for
     * the Invoice.  If the value of SplitEqually is FALSE, then this method does nothing.
     */
    public void recalculateSplitAmounts() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).recalculateSplitAmounts();
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
     * Removes the given element from the InvoiceItems array. This is achieved by marking the element for removal.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void removeFromInvoiceItems(entity.BulkInvoiceItem value) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).removeFromInvoiceItems(value);
    }
    
    /**
     * Removes the given element from the InvoiceItems array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromInvoiceItems(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(INVOICEITEMS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ValidationAlerts array. This is achieved by marking the element for removal.
     */
    public void removeFromValidationAlerts(entity.BIValidationAlert element) {
      __getInternalInterface().removeArrayElement(VALIDATIONALERTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ValidationAlerts array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromValidationAlerts(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(VALIDATIONALERTS_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * If the BulkInvoice is AwaitingSubmission with a scheduled send date of today, escalates the BulkInvoice's
     * status to {@link typekey.BulkInvoiceStatus#TC_REQUESTING} which means that all associated and unsubmitted checks will
     * also be requested.
     */
    public void requestInvoice() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).requestInvoice();
    }
    
    /**
     * <b>Note: This method should only be called from a rule in the BulkInvoice Approval ruleset</b>.
     * <p/>
     * Forces this BulkInvoice to require approval.
     * <p/>
     * Note: This method can only be called from rules.
     * @param reason the reason(s) that approval is required
     * @return True if bulk invoice requires approval
     */
    public boolean requireApproval(java.lang.String reason) {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).requireApproval(reason);
    }
    
    public gw.plugin.approval.ApprovalResult requiresApproval(gw.pl.persistence.core.Key userId) {
      return ((com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods")).requiresApproval(userId);
    }
    
    /**
     * Sets the value of the AccountName field.
     */
    public void setAccountName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ACCOUNTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ApprovalDate field.
     */
    public void setApprovalDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(APPROVALDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ApprovalStatus field.
     */
    public void setApprovalStatus(typekey.ApprovalStatus value) {
      __getInternalInterface().setFieldValue(APPROVALSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ApprovedReportingAmount field.
     */
    public void setApprovedReportingAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(APPROVEDREPORTINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ApprovedTransactionAmount field.
     */
    public void setApprovedTransactionAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(APPROVEDTRANSACTIONAMOUNT_PROP.get(), value);
    }
    
    /**
     * <b>Note: This method should only be called from a rule in the Approval Routing ruleset</b>.
     * <p/>
     * Selects a user to approve the approval activity.
     * @param user A user to be set as the individual who next needs to approve this Bulk Invoice
     * @param group A group to which this Bulk Invoice should be submitted for approval, typically one
     *              of the groups of the user.
     * @return <tt>false</tt> if the user or group is null or retired;
     *         <tt>true</tt> otherwise.
     */
    public boolean setApprovingUser(entity.User user, entity.Group group) {
      return ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setApprovingUser(user, group);
    }
    
    /**
     * Sets the value of the BankAccountNumber field.
     */
    public void setBankAccountNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BANKACCOUNTNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BankAccountType field.
     */
    public void setBankAccountType(typekey.BankAccountType value) {
      __getInternalInterface().setFieldValue(BANKACCOUNTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BankName field.
     */
    public void setBankName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BANKNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BankRoutingNumber field.
     */
    public void setBankRoutingNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(BANKROUTINGNUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BulkInvoiceTotal field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setBulkInvoiceTotal(gw.api.financials.CurrencyAmount value) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setBulkInvoiceTotal(value);
    }
    
    /**
     * Sets the value of the CheckInstructions field.
     */
    public void setCheckInstructions(typekey.CheckHandlingInstructions value) {
      __getInternalInterface().setFieldValue(CHECKINSTRUCTIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CheckNumber field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setCheckNumber(java.lang.String value) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setCheckNumber(value);
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
     * Sets the value of the Currency field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setCurrency(typekey.Currency value) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setCurrency(value);
    }
    
    /**
     * Sets the value of the DefaultCostCategory field.
     */
    public void setDefaultCostCategory(typekey.CostCategory value) {
      __getInternalInterface().setFieldValue(DEFAULTCOSTCATEGORY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DefaultCostType field.
     */
    public void setDefaultCostType(typekey.CostType value) {
      __getInternalInterface().setFieldValue(DEFAULTCOSTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DefaultPaymentType field.
     */
    public void setDefaultPaymentType(typekey.PaymentType value) {
      __getInternalInterface().setFieldValue(DEFAULTPAYMENTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DeliveryMethod field.
     */
    public void setDeliveryMethod(typekey.DeliveryMethod value) {
      __getInternalInterface().setFieldValue(DELIVERYMETHOD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InvoiceItems field.
     */
    public void setInvoiceItems(entity.BulkInvoiceItem[] value) {
      __getInternalInterface().setFieldValue(INVOICEITEMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the InvoiceNumber field.
     */
    public void setInvoiceNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(INVOICENUMBER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IsPrimary field.
     */
    public void setIsPrimary(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(ISPRIMARY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IssueDate field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setIssueDate(java.util.Date value) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setIssueDate(value);
    }
    
    /**
     * Sets the value of the LastValidatedDate field.
     */
    public void setLastValidatedDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(LASTVALIDATEDDATE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the MailTo field.
     */
    public void setMailTo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MAILTO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MailToAddress field.
     * @deprecated Address of the person/company to whom the check should be mailed.
     */
    @java.lang.Deprecated
    public void setMailToAddress(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MAILTOADDRESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MailingAddress field.
     */
    public void setMailingAddress(entity.Address value) {
      __getInternalInterface().setFieldValue(MAILINGADDRESS_PROP.get(), value);
    }
    
    public void setMailingAddressID(gw.pl.persistence.core.Key value) {
      setFieldValue(MAILINGADDRESS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Memo field.
     */
    public void setMemo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MEMO_PROP.get(), value);
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
     * Specifies whether this invoice should use a custom exchange rate, and if so creates
     * a new exchange rate if it does not already have on.
     * @param override if true, uses a custom rate
     */
    public void setOverrideTransToReportingExchangeRate(boolean override) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setOverrideTransToReportingExchangeRate(override);
    }
    
    /**
     * Sets the value of the PayTo field.
     */
    public void setPayTo(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PAYTO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PayToDenorm field.
     */
    public void setPayToDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PAYTODENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Payee field.
     */
    public void setPayee(entity.Contact value) {
      __getInternalInterface().setFieldValue(PAYEE_PROP.get(), value);
    }
    
    public void setPayeeID(gw.pl.persistence.core.Key value) {
      setFieldValue(PAYEE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaymentMethod field.
     */
    public void setPaymentMethod(typekey.PaymentMethod value) {
      __getInternalInterface().setFieldValue(PAYMENTMETHOD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ProcessingItems field.
     */
    public void setProcessingItems(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PROCESSINGITEMS_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the ReceivedDate field.
     */
    public void setReceivedDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(RECEIVEDDATE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Reportability field.
     */
    public void setReportability(typekey.ReportabilityType value) {
      __getInternalInterface().setFieldValue(REPORTABILITY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ReportableAmount field.
     */
    public void setReportableAmount(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(REPORTABLEAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the RequestingUser field.
     */
    public void setRequestingUser(entity.User value) {
      __getInternalInterface().setFieldValue(REQUESTINGUSER_PROP.get(), value);
    }
    
    public void setRequestingUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(REQUESTINGUSER_PROP.get(), value);
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
     * Sets the value of the ScheduledSendDate field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setScheduledSendDate(java.util.Date value) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setScheduledSendDate(value);
    }
    
    /**
     * Sets the value of the SplitEqually field.
     */
    public void setSplitEqually(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(SPLITEQUALLY_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setStatus(typekey.BulkInvoiceStatus value) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setStatus(value);
    }
    
    /**
     * Sets the value of the TotalReportingAmount field.
     */
    public void setTotalReportingAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALREPORTINGAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TotalTransactionAmount field.
     */
    public void setTotalTransactionAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(TOTALTRANSACTIONAMOUNT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TransToReportingExchangeRate field.
     */
    public void setTransToReportingExchangeRate(entity.ExchangeRate value) {
      __getInternalInterface().setFieldValue(TRANSTOREPORTINGEXCHANGERATE_PROP.get(), value);
    }
    
    public void setTransToReportingExchangeRateID(gw.pl.persistence.core.Key value) {
      setFieldValue(TRANSTOREPORTINGEXCHANGERATE_PROP.get(), value);
    }
    
    /**
     * Sets the Rate on the TransToClaimExchangeRate entity to exchangeRate. (Actually, a copy of the current
     * TransToClaimExchangeRate will be made but with the new rate value.) The current TransToClaimExchangeRate must
     * not be a market rate (its ExchangeRateSet must not be a market rate set; equivalently,
     * OverrideTransToReportingExchangeRate must be true).  The exchangeRate must be non-null; a null
     * argument will be ignored.
     * @param exchangeRate The exchange rate to set
     * @throws IllegalStateException if TransToClaimExchangeRate is a market rate
     * @throws NullPointerException if TransToClaimExchangeRate is null
     */
    public void setTransToReportingExchangeRateRate(java.math.BigDecimal exchangeRate) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).setTransToReportingExchangeRateRate(exchangeRate);
    }
    
    public void setUpTransToReportingExchangeRateIfNecessary() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).setUpTransToReportingExchangeRateIfNecessary();
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
     * Sets the value of the Valid field.
     */
    public void setValid(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(VALID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ValidationAlerts field.
     */
    public void setValidationAlerts(entity.BIValidationAlert[] value) {
      __getInternalInterface().setFieldValue(VALIDATIONALERTS_PROP.get(), value);
    }
    
    /**
     * Marks the invoice and all associated approved InvoiceItems as PendingStop, along with all associated checks.
     * @throws IllegalStateException If invoice does not have a valid status for voiding the invoice
     */
    public void stopBulkInvoice() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).stopBulkInvoice();
    }
    
    /**
     * Submits this Bulk invoice for approval.  This is the pre-requisite for submitting the invoice for final
     * processing, which will happen automatically once the invoice is approved.
     */
    public void submitForApproval() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).submitForApproval();
    }
    
    public void submitForFinalProcessing() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).submitForFinalProcessing();
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
     * Updates the status of the <code>BulkInvoice</code> and/or sets the check number or issue date.
     * This method can set the <code>BulkInvoiceStatus</code> to one of the following:
     * <ul>
     * <li><code>TC_ISSUED</code></li>
     * <li><code>TC_CLEARED</code></li>
     * <li><code>TC_VOIDED</code></li>
     * <li><code>TC_STOPPED</code></li>
     * </ul>
     * <p/>
     * Use acknowledgeSubmission() to update from REQUESTING to REQUESTED status.
     * <p/>
     * Note: This method does not update the Status of any BulkInvoiceItem or any placeholder checks, except when
     * uncancelling the BulkInvoice (e.g. update status from PendingVoid to Issued). If updating the BulkInvoice status,
     * at the same time you should loop over all the placeholder checks for the BulkInvoice's Items and call
     * check.updateCheckStatus() to update their statuses as well. That call will also update the BulkInvoiceItem status,
     * if appropriate.
     * @param checkNumber Check number to update, optional.
     * @param issueDate Date the check was issued.
     * @param status Status to update.
     * @throws IllegalStateException If bulk invoice status not in legal state
     * @deprecated Use {@link #updateBulkInvoiceStatus(String, java.util.Date, gw.cc.financials.typekey.BulkInvoiceStatus)} instead.
     */
    @java.lang.Deprecated
    public void updateBulkInvoiceStatus(java.lang.String checkNumber, java.util.Calendar issueDate, typekey.BulkInvoiceStatus status) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).updateBulkInvoiceStatus(checkNumber, issueDate, status);
    }
    
    /**
     * Updates the status of the <code>BulkInvoice</code> and/or sets the check number or issue date.
     * This method can set the <code>BulkInvoiceStatus</code> to one of the following:
     * <ul>
     * <li><code>TC_ISSUED</code></li>
     * <li><code>TC_CLEARED</code></li>
     * <li><code>TC_VOIDED</code></li>
     * <li><code>TC_STOPPED</code></li>
     * </ul>
     * <p/>
     * Use acknowledgeSubmission() to update from REQUESTING to REQUESTED status.
     * <p/>
     * Note: This method does not update the Status of any BulkInvoiceItem or any placeholder checks, except when
     * uncancelling the BulkInvoice (e.g. update status from PendingVoid to Issued). If updating the BulkInvoice status,
     * at the same time you should loop over all the placeholder checks for the BulkInvoice's Items and call
     * check.updateCheckStatus() to update their statuses as well. That call will also update the BulkInvoiceItem status,
     * if appropriate.
     * @param checkNumber Check number to update, optional.
     * @param issueDate Date the check was issued.
     * @param status Status to update.
     * @throws IllegalStateException If bulk invoice status not in legal state
     */
    public void updateBulkInvoiceStatus(java.lang.String checkNumber, java.util.Date issueDate, typekey.BulkInvoiceStatus status) {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).updateBulkInvoiceStatus(checkNumber, issueDate, status);
    }
    
    public void updateStatus() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).updateStatus();
    }
    
    public void updateStatusFromPendingInvoiceItemValidationIfReady() {
      ((com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal")).updateStatusFromPendingInvoiceItemValidationIfReady();
    }
    
    /**
     * Performs validation on this BulkInvoice.  After this method is called, the results can be checked via
     * calls to the {@link #isValid()} and {@link #getValidationAlerts()} methods. If no validation plugin is
     * registered, then the invoice will be automatically marked as valid.
     */
    public void validate() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).validate();
    }
    
    /**
     * Verifies that any changes on this bulk invoice are actually allowed. This should be called to check that all
     * changes made in the UI are allowed to be committed, because an invoice's editability can change during a user's
     * edit session. This method queries the databse to check that certain conditions for editability are still
     * satisfied. If any conditions are violated, a UserDisplayableException is thrown. Conditions to check are:
     * <p />
     * <ul>
     * <li>The status of the bulk invoice did not change to cause it to become uneditable; typically this is caused by
     * an escalation process changing the status to requesting.</li>
     * <li>If any payee-related fields (Payee, PayTo, MailTo, MailingAddress) are changed, this bulk invoice is still
     * payee changeable, as determined by the isPayeeChangeable method.</li>
     * </ul>
     */
    public void verifyChangesAllowed() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).verifyChangesAllowed();
    }
    
    /**
     * Marks the invoice and all associated approved InvoiceItems as PendingVoid, along with all associated checks.
     * @throws IllegalStateException If invoice does not have a valid status for voiding the invoice
     */
    public void voidBulkInvoice() {
      ((gw.cc.financials.bulkpay.entity.BulkInvoice)__getDelegateManager().getImplementation("gw.cc.financials.bulkpay.entity.BulkInvoice")).voidBulkInvoice();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.approval.impl.ApprovableInternalMethods", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceImpl");
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
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceImpl");
    config.put("gw.cc.contact.entity.EFTDataDelegate", "com.guidewire.cc.domain.contact.impl.EFTDataDelegateImpl");
    config.put("gw.cc.financials.bulkpay.entity.BulkInvoice", "com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.BulkInvoice.class, config);
    com.guidewire._generated.entity.BulkInvoiceInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.BulkInvoice, com.guidewire._generated.entity.BulkInvoiceInternal>() {
      public java.lang.Object getImplementation(entity.BulkInvoice bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.BulkInvoiceInternal getInternalInterface(entity.BulkInvoice bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.BulkInvoice newEmptyInstance() {
        return new entity.BulkInvoice((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}