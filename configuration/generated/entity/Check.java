package entity;

/**
 * Check
 * 
 *       A paper Check or EFT issued to a particular payee to deliver one or more Payments. A Check can have multiple payees,
 *       in which case distinct Checks to each secondary payee are created in the same CheckSet, and they are all related
 *       to the primary check as members of a CheckGroup. For a single payee check, the check's amount is the aggregate
 *       of all the payments associated with it. For a multiple-payee check, each of the secondary checks gets a portion
 *       of the aggregated payments, and the remainder is the amount of the primary Check.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Check.eti;Check.eix;Check.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Check")
public class Check extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable, entity.EFTDataDelegate, entity.EventAware, gw.api.financials.CancelCheckMethods, gw.api.financials.CheckMethods, gw.api.financials.CheckValidationMethods, gw.api.financials.DeleteCheckMethods {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Check> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Check>("entity.Check");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ACCOUNTNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AccountName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> BANKACCOUNT_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "BankAccount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BANKACCOUNTNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BankAccountNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> BANKACCOUNTTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "BankAccountType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BANKNAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BankName");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BANKROUTINGNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BankRoutingNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> BULKINVOICEITEMINFO_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "BulkInvoiceItemInfo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CHECKBATCHING_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CheckBatching");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CHECKINSTRUCTIONS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CheckInstructions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CHECKNUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CheckNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CHECKRPT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CheckRpt");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> CHECKRPTARRAY_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "CheckRptArray");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CHECKSET_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CheckSet");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> CHECKTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "CheckType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMCONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COMMENTS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Comments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEOFSERVICE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateOfService");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DEDUCTIONTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DeductionType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> DEDUCTIONS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Deductions");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> DELIVERYMETHOD_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "DeliveryMethod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENTEREDTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EnteredTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> GROUP_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Group");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INVOICENUMBER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "InvoiceNumber");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISPRIMARY_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IsPrimary");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISSUEDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IssueDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAILTO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MailTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MAILTOADDRESS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MailToAddress");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> MAILINGADDRESS_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "MailingAddress");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MEMO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Memo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAYTO_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PayTo");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PAYTODENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PayToDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PAYEES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Payees");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> PAYMENTMETHOD_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "PaymentMethod");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> PAYMENTS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Payments");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PENDESCALATIONFORBULK_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PendEscalationForBulk");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> PORTION_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Portion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> RECURRINGCHECK_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "RecurringCheck");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> REPORTABILITY_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Reportability");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REPORTABLEAMOUNT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ReportableAmount");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SCHEDULEDSENDDATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ScheduledSendDate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICEPDEND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServicePdEnd");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SERVICEPDSTART_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ServicePdStart");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SERVICEREQUESTINVOICES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ServiceRequestInvoices");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.CheckInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Check()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Check(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Check(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.CheckInternal __createInternalInterface() {
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
  
  protected com.guidewire._generated.entity.CheckInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Acknowledges a message that this check is being submitted.
   * Updates the check's status to REQUESTED if it was REQUESTING, or ISSUED if it was NOTIFYING.
   * Updates its payments and their offsetting reserves (if any) to SUBMITTED.
   * @throws IllegalStateException if this check is not in REQUESTING or NOTIFYING status
   */
  public void acknowledgeSubmission() {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).acknowledgeSubmission();
  }
  
  /**
   * Acknowledges a message that this check is being transferred.
   * Updates the check's status to TRANSFERRED.
   * Updates its PENDINGTRANSFER payments to TRANSFERRED.
   * For each transferred payment, updates its onset and offset to SUBMITTED.
   * 
   * At the end it logs the transfer.
   * @throws IllegalStateException if this check is not in PENDINGTRANSFER status
   */
  public void acknowledgeTransfer() {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).acknowledgeTransfer();
  }
  
  /**
   * Adds a new additional payee to the check. It copies the base check info from the current check first, and
   * then overrides the properties given as parameters.
   * @param payee 
   * @param payeeRole 
   * @param deductionType 
   * @param percentage 
   * @param fixedAmount 
   * @return new check for the additional payee
   */
  public entity.Check addAdditionalPayee(entity.Contact payee, typekey.ContactRole payeeRole, typekey.DeductionType deductionType, java.math.BigDecimal percentage, java.math.BigDecimal fixedAmount) {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).addAdditionalPayee(payee, payeeRole, deductionType, percentage, fixedAmount);
  }
  
  /**
   * Adds a new additional payee to the check. It copies the base check info from the current check.
   * @return new check for the additional payee
   */
  public entity.Check addAdditionalPayeeBase() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).addAdditionalPayeeBase();
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
   * Add a new (empty) CheckPayee bean to the Check and return it.
   * 
   * Callers must then set the returned checkPayee's PayeeType to a ContactRole and the checkPayee's Payee to a Contact
   * in order for the CheckPayee to be valid. These two properties are required on the CheckPayee.
   * @return The newly created CheckPayee bean, already associated with this check.
   */
  public entity.CheckPayee addNewPayee() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).addNewPayee();
  }
  
  /**
   * Adds a new Payment to the Check and returns it.  This payment can then be modified as desired to
   * set the Exposure, CostType, CostCategory and lineitems.
   * @return the newly created Payment
   */
  public entity.Payment addNewPayment() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).addNewPayment();
  }
  
  /**
   * Adds a new Payment to the Check and returns it.  The ReserveLine of this new Payment will be set to
   * the provided Exposure, CostType, CostCategory.  If the Exposure is NULL, then the new Payment will
   * be a claim-level Payment.
   * @param exposure The Exposure for the new Payment - can be NULL, in which case a claim-level payment will
   *                 be created.
   * @param costType The CostType for the new Payment - cannot be NULL
   * @param costCategory The CostCategory for the new Payment - cannot be NULL
   * @return the newly created Payment
   */
  public entity.Payment addNewPayment(entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory) {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).addNewPayment(exposure, costType, costCategory);
  }
  
  /**
   * Adds the given element to the Deductions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDeductions(entity.Deduction element) {
    __getInternalInterface().addArrayElement(DEDUCTIONS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Payees array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPayees(entity.CheckPayee element) {
    __getInternalInterface().addArrayElement(PAYEES_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the Payments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPayments(entity.Payment element) {
    __getInternalInterface().addArrayElement(PAYMENTS_PROP.get(), element);
  }
  
  /**
   * Adds the given element to the ServiceRequestInvoices array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServiceRequestInvoices(entity.ServiceRequestInvoice element) {
    __getInternalInterface().addArrayElement(SERVICEREQUESTINVOICES_PROP.get(), element);
  }
  
  /**
   * Adjusts this check's claim and/or reporting amounts to the specified values. Such adjustments are intended for
   * cases where better values for the amounts are determined later, after the check is created and escalated. For
   * example, if a check is written from a claim-currency bank account, the amount actually deducted from
   * that account's balance will be determined by exchange rates in effect at the time the check clears. This method
   * allows, for example, the claim amounts of the payments to be adjusted to reflect that amount for which the check
   * actually cleared.Adjustments are distributed proportionally among the payment's line
   * items. For example, if the payment has four line items with claim amounts of $40, $20, $10, and $10 (a total of
   * $80), and <code>newClaimAmount</code> is $100, then the claim amounts will be adjused to $50, $25, $12.50, and
   * $12.50. In this example, each claim amount was increased by 25% (equal to the total relative increase), and each
   * new claim amount comprises the same fraction of the total as it did before the adjustment.
   * 
   * In this variant of the method, only a claim amount is specified, and an adjustment to the reporting amount is
   * selected automatically. For example, if the reporting currency equals the transaction currency, then the reporting
   * amount is not adjusted. If the payment's claim is in the reporting currency, then the reporting amount is adjusted
   * to <code>newClaimAmount</code>. Otherwise, the adjusted reporting amount is determined by converting
   * <code>newClaimAmount</code> to the reporting currency using this payment's claim-to-reporting exchange rate.
   * 
   * When this method is called, the system must be configured in multicurrency mode and the check must:
   * <ul>
   *  <li>have already been escalated and sent downstream but not been canceled or transferred
   *  <li>not be part of a multi-payee (grouped) check
   * </ul>
   * 
   * Foreign exchange adjustments only affect total incurred and total paid calculations.  They do not further erode reserves.
   * @param newClaimAmount the adjusted amount for this payment in the claim currency; cannot be null
   * @throws IllegalStateException if claim amount is being adjusted but the transaction currency equals the claim currency
   */
  public void applyForeignExchangeAdjustment(java.math.BigDecimal newClaimAmount) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).applyForeignExchangeAdjustment(newClaimAmount);
  }
  
  /**
   * Adjusts this check's claim and/or reporting amounts to the specified values. Such adjustments are intended for
   * cases where better values for the amounts are determined later, after the check is created and escalated. For
   * example, if a check is written from a claim-currency bank account, the amount actually deducted from
   * that account's balance will be determined by exchange rates in effect at the time the check clears. This method
   * allows, for example, the claim amounts of the payments to be adjusted to reflect that amount for which the check
   * actually cleared. Null may be passed for <code>newClaimAmount</code> or <code>newReportingAmount</code>, in which
   * case no adjustment is made to that amount. Adjustments are distributed proportionally among the payment's line
   * items. For example, if the payment has four line items with claim amounts of $40, $20, $10, and $10 (a total of
   * $80), and <code>newClaimAmount</code> is $100, then the claim amounts will be adjused to $50, $25, $12.50, and
   * $12.50. In this example, each claim amount was increased by 25% (equal to the total relative increase), and each
   * new claim amount comprises the same fraction of the total as it did before the adjustment. Adjustments to the claim
   * and reporting amounts are largely independent.
   * 
   * When this method is called, the system must be configured in multicurrency mode and the check must:
   * <ul>
   *  <li>have already been escalated and sent downstream but not been canceled or transferred
   *  <li>not be part of a multi-payee (grouped) check
   * </ul>
   * 
   * Foreign exchange adjustments only affect total incurred and total paid calculations.  They do not further erode reserves.
   * @param newClaimAmount the value to which this check's claim amount should be adjusted; if null, the claim amount
   *                       is not adjusted
   * @param newReportingAmount the value to which this check's reporting amount should be adjusted; if null, the
   *                           reporting amount is not adjusted
   * @throws IllegalStateException if there is a conflict between the new, adjusted amounts and the currencies:
   *                            if newClaimAmount is different from the current transaction amount and the transaction and claim currencies are the same,
   *                            or if newClaimAmount is different from newReportingAmount and the reporting and claim currencies are the same,
   *                            or if newReportingAmount is different from the current transaction amount and the reporting and transaction currencies are the same
   */
  public void applyForeignExchangeAdjustment(java.math.BigDecimal newClaimAmount, java.math.BigDecimal newReportingAmount) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).applyForeignExchangeAdjustment(newClaimAmount, newReportingAmount);
  }
  
  /**
   * Tests whether a foreign exchange adjustment can be applied to this check.  Only checks that have been escalated
   * (i.e., submitted to the downstream system), but not subsequently voided, stopped or transferred can have a foreign
   * exchange adjustment applied to them.  Also, foreign exchange adjustments are not allowed for multi-payee checks
   * in version 5.0.x (joint-payee checks are OK) or if the system is not configured for multicurrency mode.
   * @return <code>true</code> if this check can have a foreign exchange adjustment applied to it, else <code>false</code>
   */
  public boolean canApplyForeignExchangeAdjustment() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).canApplyForeignExchangeAdjustment();
  }
  
  /**
   * Creates a clone of this check in a new CheckSet. The new check can be modified, but prepareForCommit() must be
   * called on its CheckSet before committing. A check cannot be cloned if it is part of a bulk invoice, is part of a
   * recurrence, has been transferred, or is not a primary check. If this check is the primary check of a CheckGroup,
   * the group is cloned and the new primary check is returned. All deductible line items are removed, so the total
   * amount of the check may be greater than the original.
   * @return clone of this check
   */
  public entity.Check cloneCheck() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).cloneCheck();
  }
  
  /**
   * Invokes any deduction adapters in the system to generate deductions for a check and
   *  adds them to the Check. All existing deductions on the Check are replaced.
   * @throws DeductionAdapterException if the configured deduction adapter fails
   */
  public void computeDeductions() throws com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).computeDeductions();
  }
  
  /**
   * NOTE: To create a check for reissuance, call <code>createCheckForReissue()</code> instead. This should only be
   * called from the implementation of that method.
   * <p>
   * Returns a copy of this check for reissuance without all of its fields completely initialized, since it
   * is expected that <code>createCheckForReissue()</code> will finish initializing the object. The new check's
   * status is set to {@link TransactionStatus#TC_AWAITINGSUBMISSION}.
   * 
   * If this is a primary check, the returned check will be a secondary check (since it won't have any payments yet) and
   * when {@link entity.Check#voidAndReissue} or {@link entity.Check#stopAndReissue} is eventually called, the checks will swap roles:
   * the old check will become a secondary check, the new check will become the primary check, and the payments and
   * deductions will be moved to the new check.
   * @throws IllegalStateException if the check is not reissuable (i.e., if Check.Reissuable evaluates to false)
   * @return a new Check bean that is a copy of this check for purposes of reissuance.
   */
  public entity.Check coreCreateCheckForReissue() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreCreateCheckForReissue();
  }
  
  /**
   * Deletes a check and all of its payments and deductions via Check.retire().
   * For recurring CheckSets, if the primary check becomes null, then resets it
   * to the first check in the recurrence and resets Recurrence.NumChecks if necessary.
   * The method then calls CheckSet.delete().
   * @throws com.guidewire.pl.system.exception.InsufficientPermissionException If the current user does not have
   *                                                                             the required system permission for deleting checks.
   * @throws IllegalStateException If the check does not have a valid status to be
   *                                                                             deleted.
   */
  public void coreDelete() throws com.guidewire.pl.system.exception.InsufficientPermissionException {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreDelete();
  }
  
  /**
   * NOTE: To stop and reissue a check, call {@link entity.Check#stopAndReissue(entity.Check)}. This should only be called from the
   * implementation of that method.
   * <p>
   * Performs the "core" operations to stop payment on and reissue one Check in a CheckGroup.
   * Each Check in a CheckGroup represents one payee (or set of
   * joint payees)--and therefore one physical check--for a multi-payee "check". The original Check, which is being
   * reissued, is identified by the <code>oldCheck</code> argument, and <em>this</em> (the new Check) becomes its
   * replacement. This check should have been returned by an earlier call to <code>createCheckForReissue()</code>.
   * This method requires that the following criteria are met:
   * <ul>
   *  <li>The user has the "stop" permission.
   *  <li>The original Check is Reissuable and has one of these statuses:<ul>
   *    <li> {@link TransactionStatus#TC_REQUESTING}
   *    <li> {@link TransactionStatus#TC_REQUESTED}
   *    <li> {@link TransactionStatus#TC_ISSUED}
   *    <li> {@link TransactionStatus#TC_NOTIFYING}
   *   </ul>
   * </ul>
   * The status of the original Check is set to {@link TransactionStatus#TC_PENDINGSTOP}, and then reissuance proceeds
   * as follows:
   * <ol>
   *  <li>If the original Check was the primary Check for the CheckGroup, the new Check becomes the primary Check
   *      and the original Check is converted to a secondary Check (still in the same CheckGroup), and all of the
   *      Payments and Deductions are moved to the new Check
   *  <li>Regardless of whether the original Check already had a CheckPortion, a new, fixed-amount CheckPortion is
   *      created for it so that, in case it was not already defined by a fixed portion, its amount will not
   *      fluctuate (e.g., if it previously used a percentage portion)
   *  <li>A CheckRpt is created for the new Check
   *  <li>On the new Check, CheckNumber and IssueDate are cleared, ScheduledSendDate is set to today, and Status is
   *      is set to {@link TransactionStatus#TC_AWAITINGSUBMISSION}
   * </ol>
   * @param oldCheck 
   * @throws IllegalStateException if check status is not one of the allowed statuses or if the check is otherwise not reissuable
   */
  public void coreStopAndReissue(entity.Check oldCheck) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreStopAndReissue(oldCheck);
  }
  
  /**
   * NOTE: To stop a check, call {@link entity.Check#stopCheck()}. This should only be called from the
   * implementation of that method.
   * 
   * Performs the "core" operations to stop payment on a check. Offsetting reserves are created only if
   * the payment is not a supplement (since supplement payments never affect
   * open reserves in the first place) and either of the following holds:
   * - the payment's exposure is closed (open reserves should always be zero for a closed exposure)
   * - the open reserves for the payment's exposure's costtype is zero
   * Offsetting reserves are included in this check's CheckSet.
   * <p/>
   * The status of the check and all payments on the check are set to pending
   * stop.  The status of any offsetting reserves is set to pending submission.
   * <p/>
   * If this check belongs to a CheckGroup, then all checks in the group are stopped.
   * <p/>
   * This action does not require approval.
   * @throws IllegalStateException if check status is not one of the
   *          following: TransactionStatus.TC_NOTIFYING,
   *          TransactionStatus.TC_REQUESTED,
   *          TransactionStatus.TC_REQUESTING,
   *          TransactionStatus.TC_ISSUED
   */
  public void coreStopCheck() {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreStopCheck();
  }
  
  /**
   * NOTE: To void and reissue a check, call {@link entity.Check#voidAndReissue(entity.Check)}. This should only be called from the
   * implementation of that method.
   * <p>
   * Performs the "core" operations to void and reissue one Check in a CheckGroup. Each Check in a CheckGroup represents one payee (or set of
   * joint payees)--and therefore one physical check--for a multi-payee "check". The original Check, which is being
   * reissued, is identified by the <code>oldCheck</code> argument, and <em>this</em> (the new Check) becomes its
   * replacement. This check should have been returned by an earlier call to <code>createCheckForReissue()</code>. This
   * method requires that the following criteria are met:
   * <ul>
   *  <li>The user has the "void" permission.
   *  <li>If the original Check was cleared, the user has the "voidclearedpmt" permission.
   *  <li>The original Check is Reissuable and has one of these statuses:<ul>
   *    <li> {@link TransactionStatus#TC_REQUESTING}
   *    <li> {@link TransactionStatus#TC_REQUESTED}
   *    <li> {@link TransactionStatus#TC_ISSUED}
   *    <li> {@link TransactionStatus#TC_NOTIFYING}
   *    <li> {@link TransactionStatus#TC_CLEARED}
   *   </ul>
   * </ul>
   * The status of the original Check is set to {@link TransactionStatus#TC_PENDINGVOID}, and then reissuance proceeds
   * as follows:
   * <ol>
   *  <li>If the original Check was the primary Check for the CheckGroup, the new Check becomes the primary Check
   *      and the original Check is converted to a secondary Check (still in the same CheckGroup), and all of the
   *      Payments and Deductions are moved to the new Check
   *  <li>Regardless of whether the original Check already had a CheckPortion, a new, fixed-amount CheckPortion is
   *      created for it so that, in case it was not already defined by a fixed portion, its amount will not
   *      fluctuate (e.g., if it previously used a percentage portion)
   *  <li>A CheckRpt is created for the new Check
   *  <li>On the new Check, CheckNumber and IssueDate are cleared, ScheduledSendDate is set to today, and Status is
   *      is set to {@link TransactionStatus#TC_AWAITINGSUBMISSION}
   * </ol>
   * @param oldCheck 
   * @throws IllegalStateException if check status is not one of the allowed statuses or if the check is otherwise not reissuable
   */
  public void coreVoidAndReissue(entity.Check oldCheck) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreVoidAndReissue(oldCheck);
  }
  
  /**
   * NOTE: To void a check, call {@link entity.Check#voidCheck()}. This should only be called from the
   * implementation of that method.
   * 
   * Performs the "core" operations to void a check. This method will normally only be called
   * from {@link entity.Check#voidCheck}. Offsetting reserves are created only if the payment is not
   * a supplement (since supplement payments never affect open reserves in the
   * first place) and either of the following holds:
   * - the payment's exposure is closed (open reserves should always be zero for a closed exposure)
   * - the open reserves for the payment's exposure's costtype is zero
   * Offsetting reserves are included in this check's CheckSet.
   * <p/>
   * The status of the check and all payments on the check are set to pending
   * void.  The status of any offsetting reserves is set to submitting.
   * <p/>
   * If this check belongs to a CheckGroup, then all checks in the group are voided.
   * <p/>
   * This action does not require approval.
   * @throws IllegalStateException if check status is not one of the
   *          following: TransactionStatus.TC_REQUESTING,
   *          TransactionStatus.TC_REQUESTED,
   *          TransactionStatus.TC_ISSUED,
   *          TransactionStatus.TC_NOTIFYING,
   *          TransactionStatus.TC_CLEARED
   */
  public void coreVoidCheck() {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreVoidCheck();
  }
  
  /**
   * Creates a new check that is a copy of this check.  Also copies the payments,
   * deductions, and payees of this check to the new check as new objects.
   * <p>
   * Methods to call when Transferring a Check:
   * <ol>
   * <li>oldCheck.createCheckForTransfer() - returns the newCheck</li>
   * <li>newCheck.updateCheckForTransfer(Claim newClaim, Check oldCheck)</li>
   * <li>CheckUtil#transferCheck( newCheck, oldCheck, Location currentLocation )
   *  OR newCheck.prepareForCommitForTransfer(Check oldCheck)</li>
   * </ol>
   * @throws IllegalArgumentException if the bundle of this check is not writeable
   * @return A new Check that is a copy of this check for the purpose of transferring
   *         the original check to a new claim.
   */
  public entity.Check createCheckForTransfer() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).createCheckForTransfer();
  }
  
  public void delete() throws com.guidewire.pl.system.exception.InsufficientPermissionException {
    ((gw.api.financials.DeleteCheckMethods)__getDelegateManager().getImplementation("gw.api.financials.DeleteCheckMethods")).delete();
  }
  
  /**
   * Called when check is denied by downstream system.  This action does not require approval.
   * @throws IllegalStateException if the check status is not one of the
   *          following: TransactionStatus.TC_SUBMITTING,
   *          TransactionStatus.TC_SUBMITTED
   * @throws com.guidewire.pl.system.exception.InsufficientPermissionException 
   */
  public void denyCheck() throws com.guidewire.pl.system.exception.InsufficientPermissionException {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).denyCheck();
  }
  
  /**
   * Called by Check to execute check payee validation. Used by check wizard and check creator.
   * Customers may change the implementation of this method.
   */
  public void executePayeeEarlyValidation() {
    ((gw.api.financials.CheckValidationMethods)__getDelegateManager().getImplementation("gw.api.financials.CheckValidationMethods")).executePayeeEarlyValidation();
  }
  
  /**
   * Called by Check to execute check payment validation. Used by check wizard and check creator.
   * Customers may change the implementation of this method.
   */
  public void executePaymentEarlyValidation() {
    ((gw.api.financials.CheckValidationMethods)__getDelegateManager().getImplementation("gw.api.financials.CheckValidationMethods")).executePaymentEarlyValidation();
  }
  
  /**
   * Validates the check payees for every check in the checkset being edited.  Throws a UserDisplayableException with
   * relevant error message if a problem is found.
   */
  public void executeRequiredPayeeEarlyValidation() {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).executeRequiredPayeeEarlyValidation();
  }
  
  /**
   * Verifies that each payment has a reserve line, a payment type, at least one line item, and that each line item
   * has an amount.  If problems are found during this verification, then a UserDisplayableException is thrown containing
   * an appropriate error message.
   */
  public void executeRequiredPaymentEarlyValidation() {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).executeRequiredPaymentEarlyValidation();
  }
  
  /**
   * Returns the claimant that should be associated with this check.
   */
  public entity.Contact findClaimant() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).findClaimant();
  }
  
  /**
   * Get a payment on the check. If no payments exist,
   * then one will be created and added to the Payments array.
   * <p>
   * Warning: The payment returned can change from one call to the next.
   * Used where the Check is guaranteed to have only one payment, or to edit fields which will immediately
   * be synchronized across all Payments, such as Currency and exchange rate. Use with caution.
   * <p>
   * Warning: call this method only on a Primary check.  This method throws on a secondary check.
   */
  public entity.Payment findOrCreatePayment() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).findOrCreatePayment();
  }
  
  /**
   * Gets the value of the AccountName field.
   * The name on the account
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAccountName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(ACCOUNTNAME_PROP.get());
  }
  
  public gw.api.address.SimpleAddressOwner getAddressOwner() {
    return ((gw.api.financials.CheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CheckMethods")).getAddressOwner();
  }
  
  /**
   * Get the allowed ContactRole values that can be set for the check's payeetype
   * when the check's payee is the given Contact.
   * @param payee The payee for whom to get the allowed types
   * @return the allowed ContactRole values for the check's payeetype given the payee passed in
   */
  public typekey.ContactRole[] getAllowedPayeeTypes(entity.Contact payee) {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getAllowedPayeeTypes(payee);
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
  
  /**
   * Gets the value of the BankAccount field.
   * Source bank account.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BankAccount getBankAccount() {
    return (typekey.BankAccount)__getInternalInterface().getFieldValue(BANKACCOUNT_PROP.get());
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
   * Retrieves bulk invoice item associated with current check if any.
   * If there is no associated bulk invoice item, returns null
   * @return The associated BulkInvoiceItem or null
   */
  public entity.BulkInvoiceItem getBulkInvoiceItem() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getBulkInvoiceItem();
  }
  
  /**
   * Gets the value of the BulkInvoiceItemInfo field.
   * If this check was created to act as a record-keeper for a bulk invoice item, this is the item it references.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoiceItemInfo getBulkInvoiceItemInfo() {
    return (entity.BulkInvoiceItemInfo)__getInternalInterface().getFieldValue(BULKINVOICEITEMINFO_PROP.get());
  }
  
  /**
   * Returns the invoice number of the BulkInvoice associated with the BulkInvoiceItem of this Check, or "&lt;none&gt;"
   * if this Check is not bulked.
   * @return BulkInvoice number associated with this Check
   */
  public java.lang.String getBulkInvoiceNumber() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getBulkInvoiceNumber();
  }
  
  /**
   * Primary payee's address if not null, else return the claim's loss location.
   * @return the primary payee's address if not null, else return the claim's loss location
   */
  public entity.Address getBusinessCalendarAddress() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getBusinessCalendarAddress();
  }
  
  /**
   * Gets the value of the CheckBatching field.
   * How the check should be batched for sending.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CheckBatching getCheckBatching() {
    return (typekey.CheckBatching)__getInternalInterface().getFieldValue(CHECKBATCHING_PROP.get());
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
   * The check or EFT identifier.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckNumber() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKNUMBER_PROP.get());
  }
  
  /**
   * Returns the order that a check occurs in a recurrence set based on its send
   * date.  If the check is not part of a recurrence set, then returns -1.
   * @return the numeric order of this check in the recurrence, as an int.  The ordering
   *         is one based, i.e. the earliest dated check in the recurrence will have an
   *         order of 1.
   */
  public int getCheckOrder() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getCheckOrder();
  }
  
  /**
   * Gets the value of the CheckRpt field.
   * The calculated data for this check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckRpt getCheckRpt() {
    return (entity.CheckRpt)__getInternalInterface().getFieldValue(CHECKRPT_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckRpt[] getCheckRptArray() {
    return (entity.CheckRpt[])__getInternalInterface().getFieldValue(CHECKRPTARRAY_PROP.get());
  }
  
  /**
   * Gets the value of the CheckSet field.
   * CheckSet this Check belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckSet getCheckSet() {
    return (entity.CheckSet)__getInternalInterface().getFieldValue(CHECKSET_PROP.get());
  }
  
  /**
   * Gets the value of the CheckType field.
   * Role of the check in the check group (primary or secondary).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CheckType getCheckType() {
    return (typekey.CheckType)__getInternalInterface().getFieldValue(CHECKTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the Claim field.
   * The related claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimContact field.
   * Claimant the check is being written for, as a ClaimContact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact() {
    return (entity.ClaimContact)__getInternalInterface().getFieldValue(CLAIMCONTACT_PROP.get());
  }
  
  /**
   * Returns the foreign-exchange adjustment made to this check's claim currency amount.
   * @return a BigDecimal containing the amount of the claim currency foreign exchange adjustment
   */
  public gw.api.financials.CurrencyAmount getClaimForExAdjustmentAmount() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getClaimForExAdjustmentAmount();
  }
  
  /**
   * Returns the foreign-exchange adjustment made to this check's claim currency amount.
   * @param useOldAmounts if <code>true</code> and the foreign exchange adjustment
   *                      amount was changed, then the prior amount will be returned.
   *                      If <code>false</code> then the current foreign exchange
   *                      amount will always be returned.
   * @return a BigDecimal containing the claim currency amount of the foreign exchange adjustment
   */
  public gw.api.financials.CurrencyAmount getClaimForExAdjustmentAmount(boolean useOldAmounts) {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getClaimForExAdjustmentAmount(useOldAmounts);
  }
  
  /**
   * 
   * @return 
   */
  public entity.ClaimInfo getClaimInfo() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getClaimInfo();
  }
  
  /**
   * 
   * @return the rate value of the {@link ExchangeRate} returned by
   *         {@link entity.Check#getClaimToReportingExchangeRateEntity} or null if that method returns null
   */
  public java.math.BigDecimal getClaimToReportingExchangeRateEntityRate() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getClaimToReportingExchangeRateEntityRate();
  }
  
  /**
   * Claimant the check is being written for, as a Contact.
   */
  public entity.Contact getClaimant() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getClaimant();
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
   * The Currency of this check, and all its Payments. If this is a secondary check, the currency will be retrieved
   * from the primary check
   */
  public typekey.Currency getCurrency() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getCurrency();
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
   * Gets the value of the DeductionType field.
   * Deduction type for secondary checks.  Always NULL for primary checks.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DeductionType getDeductionType() {
    return (typekey.DeductionType)__getInternalInterface().getFieldValue(DEDUCTIONTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the Deductions field.
   * Any deductions related to the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Deduction[] getDeductions() {
    return (entity.Deduction[])__getInternalInterface().getFieldValue(DEDUCTIONS_PROP.get());
  }
  
  /**
   * Returns the sum of the claim amounts of all deductions on this check.
   * @return the aggregate claim amount of all deductions on this check, as a BigDecimal
   */
  public gw.api.financials.CurrencyAmount getDeductionsClaimTotal() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getDeductionsClaimTotal();
  }
  
  /**
   * Returns the sum of the transaction amounts of all deductions on this check.
   * @return the aggregate transaction amount of all deductions on this check, as a BigDecimal
   */
  public gw.api.financials.CurrencyAmount getDeductionsTotal() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getDeductionsTotal();
  }
  
  /**
   * Gets the deductions total in the transaction currency paired with the amount in the reserving currency.
   */
  public gw.api.financials.CurrencyAmountPair getDeductionsTotalPair() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getDeductionsTotalPair();
  }
  
  /**
   * Defines the default Reserving Currency to be used while matching Reserve Lines on this payment to those on the
   * target Claim.
   * 
   * NOTE: This API is not intended to be used/extended if Multi Currency Reserving isn't enabled.
   * @param targetClaim the claim to which this check is being transferred to.
   * @return the default Target Reserving Currency. Can be null.
   */
  public typekey.Currency getDefaultTargetReservingCurrencyForTransfer(entity.Claim targetClaim) {
    return ((gw.api.financials.CheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CheckMethods")).getDefaultTargetReservingCurrencyForTransfer(targetClaim);
  }
  
  /**
   * Gets the value of the DeliveryMethod field.
   * Requested delivery method.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DeliveryMethod getDeliveryMethod() {
    return (typekey.DeliveryMethod)__getInternalInterface().getFieldValue(DELIVERYMETHOD_PROP.get());
  }
  
  /**
   * Gets the value of the EnteredTime field.
   * The time the check was created. This is different from CreateTime, which is the time it was stored in the system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEnteredTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(ENTEREDTIME_PROP.get());
  }
  
  /**
   * 
   * @deprecated use {@link #getTransToClaimExchangeRateEntity} instead
   */
  @java.lang.Deprecated
  public entity.ExchangeRate getExchangeRateEntity() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getExchangeRateEntity();
  }
  
  /**
   * 
   * @deprecated use {@link #getTransToClaimExchangeRateEntityRate} instead
   */
  @java.lang.Deprecated
  public java.math.BigDecimal getExchangeRateEntityRate() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getExchangeRateEntityRate();
  }
  
  /**
   * Get the first payee on the check (defined as Payees[0]). If no payees exist,
   * then one will be created and added to the array.
   * @return The first CheckPayee on this check, which may be a new bean.  Note that this method does
   *         not necessarily have a deterministic result, i.e. two calls to this method
   *         in different sessions could return different values if the check has more than one payee.
   */
  public entity.CheckPayee getFirstPayee() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getFirstPayee();
  }
  
  /**
   * Get a payment on the check. If no payments exist,
   * then one will be created and added to the array.
   * <p>
   * Warning: The payment returned can change from one call to the next.
   * Used where the Check is guaranteed to have only one payment, or to edit fields which will immediately
   * be synchronized across all Payments, such as Currency and exchange rate. Use with caution.
   * @return The "first" Payment on this check, which may be added by this call. Note that this property
   *         not necessarily have a deterministic result, i.e. two accesses of this property
   *         in different sessions could return different values if the check has more than one payment.
   * @deprecated Use findOrCreatePayment() method.
   */
  @java.lang.Deprecated
  public entity.Payment getFirstPayment() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getFirstPayment();
  }
  
  /**
   * The gross amount of this check in the transaction currency.  The amount is determined by summing
   * the transaction amounts of all payments that belong to this check.  Deductions are not
   * accounted for.
   * @return the summed transaction amounts of all this check's payments
   */
  public gw.api.financials.CurrencyAmount getGrossAmount() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getGrossAmount();
  }
  
  /**
   * Gets the gross amount in the transaction currency paired with the amount in the reserving currency.
   */
  public gw.api.financials.CurrencyAmountPair getGrossAmountPair() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getGrossAmountPair();
  }
  
  /**
   * Gets the Check GrossAmount. Sets the amount of the first Payment of the Check.
   * Should only be edited when there is only one Payment on the Check, otherwise
   * an IllegalStateException is thrown.
   */
  public gw.api.financials.IMoney getGrossAmountSettableComponent() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getGrossAmountSettableComponent();
  }
  
  /**
   * The gross amount of this check in the claim/default currency.  The amount is
   * determined by summing the claim amounts of all payments that belong to this check.
   * Deductions are not accounted for.
   * @return the summed claim amounts of all this check's payments
   */
  public gw.api.financials.CurrencyAmount getGrossClaimAmount() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getGrossClaimAmount();
  }
  
  /**
   * The gross amount of this check in the reserving currency.  The amount is
   * determined by summing the reserving amounts of all payments that belong to this check.
   * Deductions are not accounted for.
   * @return the summed reserving amounts of all this check's payments
   */
  public gw.api.financials.CurrencyAmount getGrossReservingAmount() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getGrossReservingAmount();
  }
  
  /**
   * Gets the value of the Group field.
   * CheckGroup this check belongs to, if it's part of a multi-payee check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckGroup getGroup() {
    return (entity.CheckGroup)__getInternalInterface().getFieldValue(GROUP_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the InvoiceNumber field.
   * Invoice number associated with the check.
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
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
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
   * Address of the person/company to whom the check should be mailed. This represents an Address entity.
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
   * The net transaction amount of this check.  The amount is determined by subtracting
   * any deductions from the gross check amount.
   */
  public gw.api.financials.CurrencyAmount getNetAmount() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getNetAmount();
  }
  
  /**
   * Gets the net amount in the transaction currency paired with the amount in the reserving currency.
   */
  public gw.api.financials.CurrencyAmountPair getNetAmountPair() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getNetAmountPair();
  }
  
  /**
   * The net claim amount of this check.  The amount is determined by subtracting
   * any deductions from the gross check amount.
   */
  public gw.api.financials.CurrencyAmount getNetClaimAmount() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getNetClaimAmount();
  }
  
  /**
   * 
   * @deprecated use {@link #getOverrideTransToReservingExchangeRate()} instead
   */
  @java.lang.Deprecated
  public boolean getOverrideExchangeRate() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getOverrideExchangeRate();
  }
  
  /**
   * Override the Transaction to Claim amount ExchangeRate for Payments on this Check.
   * If true, {@link #getTransToClaimExchangeRateEntity()} returns a custom ExchangeRate entity with an editable Rate.
   * If false, it returns the appropriate Market Exchange Rate (which is not editable).
   */
  public boolean getOverrideTransToClaimExchangeRate() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getOverrideTransToClaimExchangeRate();
  }
  
  /**
   * Returns whether the transaction-to-reserving exchange rate has been
   * overridden for the payments on this check.
   */
  public boolean getOverrideTransToReservingExchangeRate() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getOverrideTransToReservingExchangeRate();
  }
  
  /**
   * Gets the value of the PayTo field.
   * Pay to the order of.
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
   * Gets the value of the Payees field.
   * Recipients of the payment; there must be at least one. If there are multiple, each is a 'joint' payee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckPayee[] getPayees() {
    return (entity.CheckPayee[])__getInternalInterface().getFieldValue(PAYEES_PROP.get());
  }
  
  /**
   * Gets the value of the PaymentMethod field.
   * Requested payment method for all payments in the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentMethod getPaymentMethod() {
    return (typekey.PaymentMethod)__getInternalInterface().getFieldValue(PAYMENTMETHOD_PROP.get());
  }
  
  /**
   * Gets the value of the Payments field.
   * Payments on the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Payment[] getPayments() {
    return (entity.Payment[])__getInternalInterface().getFieldValue(PAYMENTS_PROP.get());
  }
  
  /**
   * Gets the value of the Portion field.
   * The amount of a multi-payee check applicable to this check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckPortion getPortion() {
    return (entity.CheckPortion)__getInternalInterface().getFieldValue(PORTION_PROP.get());
  }
  
  /**
   * Returns the previously paid or scheduled service period of the first exposure
   * that is of a type that can have a service period and has a check whose payee
   * is the same as that of the given check.
   */
  public java.lang.String getPrevPaidOrScheduledServicePeriod() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getPrevPaidOrScheduledServicePeriod();
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the RecurringCheck field.
   * The recurring check entity, if any, associated with this check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecurringCheck getRecurringCheck() {
    return (entity.RecurringCheck)__getInternalInterface().getFieldValue(RECURRINGCHECK_PROP.get());
  }
  
  /**
   * Gets the value of the Reportability field.
   * Whether the payment should be reported to the IRS as income.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReportabilityType getReportability() {
    return (typekey.ReportabilityType)__getInternalInterface().getFieldValue(REPORTABILITY_PROP.get());
  }
  
  /**
   * Gets the value of the ReportableAmount field.
   * Reportable amount of the check in the transaction currency. Used by the BackupWithholdingCalculator as the amount of the check reportable to the IRS, from which it calculates backup withholding Deductions. It is editable in the UI.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReportableAmount() {
    return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REPORTABLEAMOUNT_PROP.get());
  }
  
  /**
   * The ReportableAmount of the Check. This value is in the Check Currency.
   */
  public gw.api.financials.IMoney getReportableAmountSettableComponent() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getReportableAmountSettableComponent();
  }
  
  /**
   * Returns the foreign-exchange adjustment made to this check's reporting currency amount.
   * @return a BigDecimal containing the amount of the reporting currency foreign exchange adjustment
   */
  public gw.api.financials.CurrencyAmount getReportingForExAdjustmentAmount() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getReportingForExAdjustmentAmount();
  }
  
  /**
   * Returns the foreign-exchange adjustment made to this check's reporting currency amount.
   * @param useOldAmounts if <code>true</code> and the foreign exchange adjustment
   *                      amount was changed, then the prior amount will be returned.
   *                      If <code>false</code> then the current foreign exchange
   *                      amount will always be returned.
   * @return a BigDecimal containing the reporting currency amount of the foreign exchange adjustment
   */
  public gw.api.financials.CurrencyAmount getReportingForExAdjustmentAmount(boolean useOldAmounts) {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getReportingForExAdjustmentAmount(useOldAmounts);
  }
  
  /**
   * Returns the reserving currency, which is assumed to be shared by all
   * payments on this check.
   */
  public typekey.Currency getReservingCurrency() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getReservingCurrency();
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
   * Date that the check is scheduled to be sent.  Also used to determine if the check amount is included in Future Payments (tomorrow or later).  Should only be modified in the UI or PreSetup rules.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getScheduledSendDate() {
    return (java.util.Date)__getInternalInterface().getFieldValue(SCHEDULEDSENDDATE_PROP.get());
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
   * Gets the value of the ServiceRequestInvoices field.
   * ServiceRequestInvoices related to this check. All linked invoices are expected to have the same service request specialist and currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestInvoice[] getServiceRequestInvoices() {
    return (entity.ServiceRequestInvoice[])__getInternalInterface().getFieldValue(SERVICEREQUESTINVOICES_PROP.get());
  }
  
  /**
   * Get the only payment on the check; use where the check is expected to have
   * 1 payment and any other state indicates a programming error.  If the check
   * does not have exactly 1 payment, an IllegalStateException is thrown.
   * @return The single payment on the check
   */
  public entity.Payment getSinglePayment() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getSinglePayment();
  }
  
  /**
   * Gets the value of the Status field.
   * Status of the check (issued, voided, cleared, and so on). Do not update directly. Use methods to initiate operations, or use updateCheckStatus() method.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionStatus getStatus() {
    return (typekey.TransactionStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
  }
  
  /**
   * Return the suggested Payee type for the given Payee. Used in UI reflection to pre-fill
   * a suggested Payee type if the user selects a particular Payee. A payee type is a contact
   * role, but is restricted to be one of the roles given by the "payee" type filter. This
   * method checks the given payee is a claim contact. If so it searches through the claim
   * contact's roles for the first one (in typekey order - priority/name) that is allowed by
   * the "payee" type filter. If it finds such a role it returns that. If the contact is
   * not a claim contact or it has no suitable role then this method returns "vendor" if
   * the contact is a vendor and "other" otherwise. If the payee argument is null this
   * method returns null.
   * @param payee the payee contact for which to suggest a payee type
   * @return the suggested payee type, or null if no suggestion can be found
   */
  public typekey.ContactRole getSuggestedPayeeType(entity.Contact payee) {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getSuggestedPayeeType(payee);
  }
  
  /**
   * The ExchangeRate entity for TransactionAmount to ClaimAmount translation
   * used for all Payments on this Check. See {@link #getOverrideTransToClaimExchangeRate()}
   * When in override mode, you may modify the Description and Name.
   */
  public entity.ExchangeRate getTransToClaimExchangeRateEntity() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransToClaimExchangeRateEntity();
  }
  
  /**
   * The exchange rate in the ExchangeRate entity for TransactionAmount to ClaimAmount translation
   * used for all Payments on this Check. See {@link #getOverrideTransToClaimExchangeRate()}.
   * When in override mode, modify this property to change the exchange rate for the Check.
   */
  @gw.datatype.annotation.DataType(name = "exchangerate")
  public java.math.BigDecimal getTransToClaimExchangeRateEntityRate() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransToClaimExchangeRateEntityRate();
  }
  
  /**
   * Returns the transaction-to-reserving exchange rate entity, which is assumed
   * to be shared by all payments on this check.
   */
  public entity.ExchangeRate getTransToReservingExchangeRate() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransToReservingExchangeRate();
  }
  
  /**
   * Returns the numeric rate of the transaction-to-reserving exchange rate
   * entity, which is assumed to be shared by all payments on this check.
   */
  public java.math.BigDecimal getTransToReservingExchangeRateRate() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransToReservingExchangeRateRate();
  }
  
  /**
   * The gross amount of this check before it was transferred.
   * @return A BigDecimal containing the amount of this check before it was
   * transferred (essentially the sum of all payments on the check that have
   * a status of {@link TransactionStatus#TC_PENDINGTRANSFER} or
   * {@link TransactionStatus#TC_TRANSFERRED}).
   */
  public gw.api.financials.CurrencyAmount getTransferredAmount() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransferredAmount();
  }
  
  /**
   * Gets the transferred amount in the transaction currency paired with the amount in the reserving currency.
   */
  public gw.api.financials.CurrencyAmountPair getTransferredAmountComponent() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransferredAmountComponent();
  }
  
  /**
   * If this check was created due to another check being transferred, this method returns the original check for which this is
   * the transfer copy.  If this check was not created in response to a transfer, then this method returns NULL.
   * @return the original check that was transferred to produce this check, or NULL if this check is not the result of a transfer.
   */
  public entity.Check getTransferredCheck() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransferredCheck();
  }
  
  /**
   * The Check that this check was transferred to.
   * @return The onset check on the new claim that is the result of having transferred
   *         this check.  If this check has not been transferred then this method will
   *         return NULL.
   */
  public entity.Check getTransferredToCheck() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransferredToCheck();
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
   * If the any of the payees on this check is a Vendor, then returns the first
   * of those payees.  If none of the payees is a Vendor, then returns null.
   * @return The vendor, if any, found as a payee for this check.
   */
  public entity.Contact getVendor() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getVendor();
  }
  
  /**
   * Returns true if this check has a service period (as opposed to a single
   * service date.)  A check has a service period if it has a WC Lost Wages,
   * PIP, Bodily Injury, or WC Injury exposure.
   * @return <code>true</code> If this check contains a payment with an exposure that
   *         has a service period, else <code>false</code>.
   */
  public boolean hasExposureWithServicePeriod() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).hasExposureWithServicePeriod();
  }
  
  /**
   * Tests whether this check has been adjusted due to foreign exchange rate changes.
   * @return <code>true</code> if this payment has a foreign exchange adjustment, else <code>false</code>
   */
  public boolean hasForeignExchangeAdjustment() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).hasForeignExchangeAdjustment();
  }
  
  /**
   * Tests whether this check is part of a bulk payment (i.e., it's tied to a BulkInvoiceItem).
   * @return <code>true</code> if this is a bulked check, else <code>false</code>
   */
  public boolean isBulked() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isBulked();
  }
  
  /**
   * Tests whether the check can be deleted. For the check to be deletable it
   * must have one of the following statuses:
   * <ul>
   * <li> {@link TransactionStatus#TC_DRAFT}
   * <li> {@link TransactionStatus#TC_PENDINGAPPROVAL}
   * <li> {@link TransactionStatus#TC_AWAITINGSUBMISSION}
   * <li> {@link TransactionStatus#TC_REJECTED}
   * <li> {@link TransactionStatus#TC_DENIED}
   * </ul>
   * 
   * If the check is part of a group (i.e., the check was created with one or more
   * secondary payees), then every check in the group must be deletable for this
   * check to be deletable.
   * @return <code>true</code> if this check can be deleted, else <code>false</code>
   */
  public boolean isDeletable() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isDeletable();
  }
  
  /**
   * Tests whether the check can be deleted.
   * @return <code>true</code> if this check can be deleted, else <code>false</code>
   * @deprecated use Deletable instead
   */
  @java.lang.Deprecated
  public boolean isDeleteable() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isDeleteable();
  }
  
  /**
   * Tests whether this check can be edited.  For the check to be editable, it must have
   * one of the following statuses:
   * <ul>
   * <li> {@link TransactionStatus#TC_DRAFT}
   * <li> {@link TransactionStatus#TC_PENDINGAPPROVAL}
   * <li> {@link TransactionStatus#TC_AWAITINGSUBMISSION}
   * <li> {@link TransactionStatus#TC_REJECTED}
   * </ul>
   * @return <code>true</code> if this check can be edited, else <code>false</code>
   */
  public boolean isEditable() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isEditable();
  }
  
  /**
   * Tests whether this check belongs to a CheckGroup (optionally, the number of CheckGroup members is considered as well).
   * @param acceptSingleMemberGroups if <code>true</code>, method will return true even if this check is the only member of
   * the CheckGroup, otherwise if <code>false</code> and this check is only member of the group, will return false.
   * @return <code>true</code> if this check is a member of a CheckGroup, accounting for the passed parameter, else <code>false</code>
   */
  public boolean isGroupMember(boolean acceptSingleMemberGroups) {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isGroupMember(acceptSingleMemberGroups);
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
   * Tests whether this check was manually entered.
   * @return <code>true</code> if this is a manually entered check, else <code>false</code>
   */
  public boolean isManualCheck() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isManualCheck();
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
   * Gets the value of the PendEscalationForBulk field.
   * Only escalate as part of a BulkInvoice.
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPendEscalationForBulk() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isPendEscalationForBulk();
  }
  
  /**
   * Tests whether this check is the primary check in a check group or if the
   * check does not belong to a check group at all, in which case it is always
   * a primary check.
   * @return <code>true</code> if this is a primary check, as per the description above, else <code>false</code>
   */
  public boolean isPrimary() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isPrimary();
  }
  
  /**
   * Returns whether this check can be reissued; i.e., it belongs to a CheckGroup and either Check.Voidable or
   * Check.Stoppable evaluate to true.
   * @return <code>true</code> if this check can be reissued, else <code>false</code>
   */
  public boolean isReissueable() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isReissueable();
  }
  
  /**
   * Tests if the check is a denied check that can be resubmitted as is
   * @return true if check can be resubmitted, else false
   */
  public boolean isResubmittable() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isResubmittable();
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
   * True if the scheduled send date of this check is after today.
   */
  public boolean isScheduledSendDateInFuture() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isScheduledSendDateInFuture();
  }
  
  /**
   * True if a stop payment can be issued against this check. The
   * check status must be one of the following:
   * <ul>
   * <li> {@link TransactionStatus#TC_REQUESTING}
   * <li> {@link TransactionStatus#TC_REQUESTED}
   * <li> {@link TransactionStatus#TC_ISSUED}
   * <li> {@link TransactionStatus#TC_NOTIFYING}
   * </ul>
   * If this check belongs to a check group, then all others checks in the group
   * must be stoppable or already voided/stopped.
   * @return <code>true</code> if this check can be stopped, else <code>false</code>
   */
  public boolean isStoppable() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isStoppable();
  }
  
  /**
   * Tests whether this check can be stopped and reissued.  Note that this is a less strict
   * test than isStoppable(), since it does not verify the status of other checks in the
   * CheckGroup; because the check will be reissued, the payment associated with the
   * CheckGroup will be left unchanged, so no check is necessary.
   * @return <code>true</code> if this check can be stopped and reissued, else </code>false</code>
   */
  public boolean isStoppableForReissue() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isStoppableForReissue();
  }
  
  /**
   * Returns true if the status indicates the check has been stopped.
   * Specifically, if the status is one of the following:
   * <ul>
   * <li> {@link TransactionStatus#TC_PENDINGSTOP}
   * <li> {@link TransactionStatus#TC_STOPPED}
   * </ul>
   */
  public boolean isStopped() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isStopped();
  }
  
  /**
   * Tests whether this check can be transferred to another claim.  This check
   * is transferable if the following are true:
   * 
   * <ul>
   * <li> it is not a recurring check
   * <li> it does not belong to a check group
   * <li> its status is one of the following:
   * <ul>
   * <li> {@link TransactionStatus#TC_REQUESTING}
   * <li> {@link TransactionStatus#TC_REQUESTED}
   * <li> {@link TransactionStatus#TC_NOTIFYING}
   * <li> {@link TransactionStatus#TC_ISSUED}
   * <li> {@link TransactionStatus#TC_CLEARED}
   * </ul>
   * </ul>
   * @return <code>true</code> if this check can be transferred to a new claim, else </code>false</code>
   */
  public boolean isTransferable() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isTransferable();
  }
  
  /**
   * Tests whether this check has been transferred to another claim.
   * That is, its status is one of the following:
   * <ul>
   * <li> {@link TransactionStatus#TC_PENDINGTRANSFER}
   * <li> {@link TransactionStatus#TC_TRANSFERRED}
   * </ul>
   * @return <code>true</code> if this check has been transferred, else </code>false</code>
   */
  public boolean isTransferred() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isTransferred();
  }
  
  /**
   * True if this check is can be voided. The check status must be one
   * of the following:
   * <ul>
   * <li> {@link TransactionStatus#TC_REQUESTING}
   * <li> {@link TransactionStatus#TC_REQUESTED}
   * <li> {@link TransactionStatus#TC_ISSUED}
   * <li> {@link TransactionStatus#TC_NOTIFYING}
   * <li> {@link TransactionStatus#TC_CLEARED}
   * </ul>
   * If this check belongs to a check group, then all others checks in the group
   * must be voidable or already voided/stopped.
   * @return <code>true</code> if this check can be voided, else <code>false</code>
   */
  public boolean isVoidable() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isVoidable();
  }
  
  /**
   * Tests whether this check can be voided and reissued.  Note that this is a less strict
   * test than isVoidable(), since it does not verify the status of other checks in the
   * CheckGroup; because the check will be reissued, the payment associated with the
   * CheckGroup will be left unchanged, so no check is necessary.
   * @return <code>true</code> if this check can be voided and reissued, else </code>false</code>
   */
  public boolean isVoidableForReissue() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isVoidableForReissue();
  }
  
  /**
   * Returns true if the status indicates the check has been voided.
   * Specifically, if the status is one of the following:
   * <ul>
   * <li> {@link TransactionStatus#TC_PENDINGVOID}
   * <li> {@link TransactionStatus#TC_VOIDED}
   * </ul>
   */
  public boolean isVoided() {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isVoided();
  }
  
  /**
   * Writes a debug log message about the check being Stopped.
   * @deprecated this message is now logged internally in {@link #coreStopCheck}
   */
  @java.lang.Deprecated
  public void logStop() {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).logStop();
  }
  
  /**
   * Writes a debug log message about this check being Voided.
   * @deprecated this message is now logged internally in {@link #coreVoidCheck}
   */
  @java.lang.Deprecated
  public void logVoid() {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).logVoid();
  }
  
  /**
   * When transfering a Check in Gosu outside the UI, this is the final call
   * to update the old and new Checks, including the updating of Taccounts.
   * Before calling this method, a new ReserveLine on the target claim can
   * be chosen/set for each payment of newCheck. After this method is called,
   * the Payments on the old and new Checks cannot be modified.
   * <p>
   * See also {CheckUtil#transferCheck( Check newCheck, Check oldCheck, Location currentLocation )}
   * for use in the UI instead of this method.
   * <p>
   * Note that any Final payments on the newCheck will attempt to close their
   * target exposure or claim.
   * <p>
   * Methods to call when Transferring a Check:
   * <ol>
   * <li>oldCheck.createCheckForTransfer() - returns the newCheck</li>
   * <li>newCheck.updateCheckForTransfer(Claim newClaim, Check oldCheck)</li>
   * <li>CheckUtil#transferCheck( newCheck, oldCheck, Location currentLocation )
   *  OR newCheck.prepareForCommitForTransfer(Check oldCheck)</li>
   * </ol>
   * @param oldCheck the original check object representing the check that is being transferred
   * @throws IllegalArgumentException if the amount or transaction statuses are changed.
   * @return List of ValidationExecutionResult objects with any validation
   *  errors or warnings from the Claim or Exposure Closed Validation rules, resulting
   *  from any attempt to close the Exposure or Claim of Final payments.
   */
  public java.util.List<gw.api.validation.ValidationExecutionResult> prepareForCommitForTransfer(entity.Check oldCheck) {
    return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).prepareForCommitForTransfer(oldCheck);
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
   * Removes the given element from the Deductions array. This is achieved by marking the element for removal.
   */
  public void removeFromDeductions(entity.Deduction element) {
    __getInternalInterface().removeArrayElement(DEDUCTIONS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Deductions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDeductions(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(DEDUCTIONS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Payees array. This is achieved by marking the element for removal.
   */
  public void removeFromPayees(entity.CheckPayee element) {
    __getInternalInterface().removeArrayElement(PAYEES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Payees array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPayees(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(PAYEES_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the Payments array. This is achieved by marking the element for removal.
   */
  public void removeFromPayments(entity.Payment element) {
    __getInternalInterface().removeArrayElement(PAYMENTS_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Payments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPayments(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(PAYMENTS_PROP.get(), elementID);
  }
  
  /**
   * Removes the given element from the ServiceRequestInvoices array. This is achieved by marking the element for removal.
   */
  public void removeFromServiceRequestInvoices(entity.ServiceRequestInvoice element) {
    __getInternalInterface().removeArrayElement(SERVICEREQUESTINVOICES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the ServiceRequestInvoices array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServiceRequestInvoices(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(SERVICEREQUESTINVOICES_PROP.get(), elementID);
  }
  
  /**
   * Escalates the Check's status to Requesting. Which means the following:
   * <ol>
   * <li> Check is moved to "requesting" status
   * <li> All Payments are moved to "submitting" unless they've already been submitted (I think this the case when a check is transferred?)
   * <li> Zeroing Reserves are created
   * <li> If configured to do so, an attempt is made to close the Exposure. If this fails, an activity is created saying the close was not possible and giving the validation errors.
   * <li> If the Exposure closes and it was the only open exposure, the claim is closed (if configured to close claim after final payment)
   * <li> Transaction post setup rules are executed on this transaction set because new Reserves may have been created
   * <li> A reminder activity is created if this check is the penultimate in a recurrence
   * </ol>
   * Returns without doing anything if the check is not in AWAITINGSUBMISSION state.
   * @throws IllegalArgumentException if the check is not scheduled to be sent today
   */
  public void requestCheck() {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).requestCheck();
  }
  
  /**
   * Called when check is being resubmitted.  This action does not require approval.
   * @throws IllegalStateException if the check status is not one of the
   *          following: TransactionStatus.TC_DENIED
   * @throws com.guidewire.pl.system.exception.InsufficientPermissionException is the financials version parameter is read-only
   */
  public void resubmit() throws com.guidewire.pl.system.exception.InsufficientPermissionException {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).resubmit();
  }
  
  /**
   * Sets the value of the AccountName field.
   */
  public void setAccountName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(ACCOUNTNAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BankAccount field.
   */
  public void setBankAccount(typekey.BankAccount value) {
    __getInternalInterface().setFieldValue(BANKACCOUNT_PROP.get(), value);
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
   * Associates a BulkInvoiceItem with the current check.
   * @param item The BulkInvoiceItem to be set of BulkInvoiceItemInfo
   */
  public void setBulkInvoiceItem(entity.BulkInvoiceItem item) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setBulkInvoiceItem(item);
  }
  
  /**
   * Sets the value of the BulkInvoiceItemInfo field.
   */
  public void setBulkInvoiceItemInfo(entity.BulkInvoiceItemInfo value) {
    __getInternalInterface().setFieldValue(BULKINVOICEITEMINFO_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckBatching field.
   */
  public void setCheckBatching(typekey.CheckBatching value) {
    __getInternalInterface().setFieldValue(CHECKBATCHING_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckInstructions field.
   */
  public void setCheckInstructions(typekey.CheckHandlingInstructions value) {
    __getInternalInterface().setFieldValue(CHECKINSTRUCTIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckNumber field.
   */
  public void setCheckNumber(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(CHECKNUMBER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckRpt field.
   */
  private void setCheckRpt(entity.CheckRpt value) {
    __getInternalInterface().setFieldValue(CHECKRPT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckRptArray field.
   */
  private void setCheckRptArray(entity.CheckRpt[] value) {
    __getInternalInterface().setFieldValue(CHECKRPTARRAY_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckSet field.
   */
  public void setCheckSet(entity.CheckSet value) {
    __getInternalInterface().setFieldValue(CHECKSET_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CheckType field.
   */
  public void setCheckType(typekey.CheckType value) {
    __getInternalInterface().setFieldValue(CHECKTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value) {
    __getInternalInterface().setFieldValue(CLAIMCONTACT_PROP.get(), value);
  }
  
  /**
   * 
   * @param claimInfo 
   */
  public void setClaimInfo(entity.ClaimInfo claimInfo) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setClaimInfo(claimInfo);
  }
  
  /**
   * Sets the ExchangeRate entity for ClaimAmount to ReportingAmount translation
   * on all Payments on this Check. This triggers recalculation of the reporting amounts for the {@link
   * Payment}s and claim and reporting amounts on the {@link entity.CheckPortion} (if applicable). This must be a primary check.
   * @param rateEntity the ExchangeRate entity to set for all payments in this check
   */
  public void setClaimToReportingExchangeRateEntity(entity.ExchangeRate rateEntity) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setClaimToReportingExchangeRateEntity(rateEntity);
  }
  
  /**
   * Claimant the check is being written for, as a Contact.
   * @param value 
   */
  public void setClaimant(entity.Contact value) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setClaimant(value);
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
   * The Currency of this check, and all its Payments. This must be a primary check.
   * @param currency 
   */
  public void setCurrency(typekey.Currency currency) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setCurrency(currency);
  }
  
  /**
   * Sets the value of the DateOfService field.
   */
  public void setDateOfService(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEOFSERVICE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DeductionType field.
   */
  public void setDeductionType(typekey.DeductionType value) {
    __getInternalInterface().setFieldValue(DEDUCTIONTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Deductions field.
   */
  public void setDeductions(entity.Deduction[] value) {
    __getInternalInterface().setFieldValue(DEDUCTIONS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DeliveryMethod field.
   */
  public void setDeliveryMethod(typekey.DeliveryMethod value) {
    __getInternalInterface().setFieldValue(DELIVERYMETHOD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EnteredTime field.
   */
  public void setEnteredTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(ENTEREDTIME_PROP.get(), value);
  }
  
  /**
   * 
   * @param exchangeRate 
   * @deprecated use {@link #setTransToClaimExchangeRateEntityRate(BigDecimal)} instead
   */
  @java.lang.Deprecated
  public void setExchangeRateEntityRate(java.math.BigDecimal exchangeRate) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setExchangeRateEntityRate(exchangeRate);
  }
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.CheckGroup value) {
    __getInternalInterface().setFieldValue(GROUP_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
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
   */
  public void setIssueDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(ISSUEDATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
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
   * 
   * @param value 
   * @deprecated use {@link #setOverrideTransToReservingExchangeRate(boolean)} instead
   */
  @java.lang.Deprecated
  public void setOverrideExchangeRate(boolean value) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setOverrideExchangeRate(value);
  }
  
  /**
   * Triggers recalculation of the claim and reporting amounts for the {@link Payment}s and {@link entity.CheckPortion} (if
   * applicable). This must be a primary check.
   * @param value 
   */
  public void setOverrideTransToClaimExchangeRate(boolean value) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setOverrideTransToClaimExchangeRate(value);
  }
  
  /**
   * Specifies whether the transaction-to-reserving exchange rate shall be
   * overridden for the payments on this check. If changing from false to true,
   * a new manual exchange rate is created. If changing from true to false, the
   * manual exchange rate is discarded and replaced with the current market
   * rate.
   * @param value 
   */
  public void setOverrideTransToReservingExchangeRate(boolean value) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setOverrideTransToReservingExchangeRate(value);
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
   * Sets the value of the Payees field.
   */
  public void setPayees(entity.CheckPayee[] value) {
    __getInternalInterface().setFieldValue(PAYEES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PaymentMethod field.
   */
  public void setPaymentMethod(typekey.PaymentMethod value) {
    __getInternalInterface().setFieldValue(PAYMENTMETHOD_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Payments field.
   */
  public void setPayments(entity.Payment[] value) {
    __getInternalInterface().setFieldValue(PAYMENTS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PendEscalationForBulk field.
   */
  public void setPendEscalationForBulk(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(PENDESCALATIONFORBULK_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Portion field.
   */
  public void setPortion(entity.CheckPortion value) {
    __getInternalInterface().setFieldValue(PORTION_PROP.get(), value);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the RecurringCheck field.
   */
  public void setRecurringCheck(entity.RecurringCheck value) {
    __getInternalInterface().setFieldValue(RECURRINGCHECK_PROP.get(), value);
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
  public void setReportableAmount(gw.api.financials.CurrencyAmount value) {
    __getInternalInterface().setFieldValue(REPORTABLEAMOUNT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ScheduledSendDate field.
   */
  public void setScheduledSendDate(java.util.Date value) {
    __getInternalInterface().setFieldValue(SCHEDULEDSENDDATE_PROP.get(), value);
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
   * Sets the value of the ServiceRequestInvoices field.
   */
  public void setServiceRequestInvoices(entity.ServiceRequestInvoice[] value) {
    __getInternalInterface().setFieldValue(SERVICEREQUESTINVOICES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setStatus(typekey.TransactionStatus value) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setStatus(value);
  }
  
  /**
   * Sets the ExchangeRate entity for TransactionAmount to ClaimAmount translation
   * on all Payments on this Check. This triggers recalculation of the claim and reporting amounts for the {@link
   * Payment}s and {@link entity.CheckPortion} (if applicable). This must be a primary check.
   * @param rateEntity the ExchangeRate entity to set for all payments in this check
   */
  public void setTransToClaimExchangeRateEntity(entity.ExchangeRate rateEntity) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setTransToClaimExchangeRateEntity(rateEntity);
  }
  
  /**
   * The exchange rate in the ExchangeRate entity for TransactionAmount to ClaimAmount translation
   * used for all Payments on this Check. See {@link #getOverrideTransToClaimExchangeRate()}
   * When in override mode, modify this property to change the exchange rate for the Check. This must be a primary
   * check.
   * @param exchangeRate 
   */
  public void setTransToClaimExchangeRateEntityRate(java.math.BigDecimal exchangeRate) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setTransToClaimExchangeRateEntityRate(exchangeRate);
  }
  
  /**
   * Sets the transaction-to-reserving exchange rate entity on all of the
   * payments on this check, and recomputes the reserving, claim, and
   * reporting amounts of all of the payments and fixed check portions
   * accordingly.
   * @param entity 
   */
  public void setTransToReservingExchangeRate(entity.ExchangeRate entity) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setTransToReservingExchangeRate(entity);
  }
  
  /**
   * Creates a new manual exchange rate entity with the given numeric rate, sets
   * it as the transaction-to-reserving exchange rate entity on all of the
   * payments on this check, and recomputes the reserving, claim, and reporting
   * amounts of all of the payments and fixed check portions accordingly.
   * @param rate 
   */
  public void setTransToReservingExchangeRateRate(java.math.BigDecimal rate) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setTransToReservingExchangeRateRate(rate);
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
   * Stops and reissues a check, deferring to {@link Check#coreStopAndReissue}. Customers may change the implementation
   * of this method.
   * Note: this method has been changed to take a Check, rather than a Key
   * @param oldCheck 
   */
  public void stopAndReissue(entity.Check oldCheck) {
    ((gw.api.financials.CancelCheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CancelCheckMethods")).stopAndReissue(oldCheck);
  }
  
  /**
   * Stops a check, deferring to {@link entity.Check#coreStopCheck}. Customers may change the implementation of this method.
   */
  public void stopCheck() {
    ((gw.api.financials.CancelCheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CancelCheckMethods")).stopCheck();
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
   * Sets the claim of the payments, checkset, and claimcontacts of this check to the claim given. Also, for every
   * payment:
   * <ul>
   *   <li>
   *     Sets the exposure to the first matching exposure (by PrimaryCoverage and LossParty) on the given claim, if
   *     one exists. Otherwise, sets it to null.
   *   </li>
   *   <li>
   *     Sets the ReserveLine to the best matching Reserve Line on the given claim. Otherwise, sets it to null.
   *   </li>
   * </ul>
   * <p>
   * Methods to call when Transferring a Check:
   * <ol>
   * <li>oldCheck.createCheckForTransfer() - returns the newCheck</li>
   * <li>newCheck.updateCheckForTransfer(Claim newClaim, Check oldCheck)</li>
   * <li>CheckUtil#transferCheck( newCheck, oldCheck, Location currentLocation )
   *  OR newCheck.prepareForCommitForTransfer(Check oldCheck)</li>
   * </ol>
   * @param newClaim the claim to which this check is being transferred
   * @param oldCheck the original check object representing the check that is being transferred
   * @throws IllegalArgumentException if the original check id null
   */
  public void updateCheckForTransfer(entity.Claim newClaim, entity.Check oldCheck) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).updateCheckForTransfer(newClaim, oldCheck);
  }
  
  /**
   * Sets the claim of the payments, checkset, and claimcontacts of this check to the claim on this check. Also, for
   * every payment:
   * <ul>
   *   <li>
   *     Sets the exposure to the first matching exposure (by PrimaryCoverage and LossParty) on the given claim, if
   *     one exists. Otherwise, sets it to null.
   *   </li>
   *   <li>
   *     Sets the ReserveLine to the best matching Reserve Line on the given claim. Otherwise, sets it to null. The
   *     targetReservingCurrency is included in the matching logic.
   *   </li>
   * </ul>
   * <p>
   * Methods to call when Transferring a Check:
   * <ol>
   * <li>oldCheck.createCheckForTransfer() - returns the newCheck</li>
   * <li>newCheck.updateCheckForTransfer(Claim newClaim, Check oldCheck)</li>
   * <li>CheckUtil#transferCheck( newCheck, oldCheck, Location currentLocation )
   *  OR newCheck.prepareForCommitForTransfer(Check oldCheck)</li>
   * </ol>
   * @param newClaim the claim to which this check is being transferred
   * @param oldCheck the original check object representing the check that is being transferred
   * @param targetReservingCurrency the Reserving Currency to be used for matching the payment Reserve Lines on the new
   *                                Claim.
   * @throws IllegalArgumentException if the original check id null
   */
  public void updateCheckForTransfer(entity.Claim newClaim, entity.Check oldCheck, typekey.Currency targetReservingCurrency) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).updateCheckForTransfer(newClaim, oldCheck, targetReservingCurrency);
  }
  
  /**
   * Updates the status of a check.
   * <p/>
   * Allowed check status are "issued", "cleared", "voided", and "stopped".  The "Issued" and "Cleared" statuses
   * are not legal options if this check is part of a multi-payee check group that has been voided or stopped.
   * <p/>
   * If the check status is changed to "voided" or "stopped", the status of "pending void" or "pending stop"
   * payments are updated as well.
   * <p/>
   * checkNumber and issueDate is used when updating the check status to "issued".
   * For other updates, these two fields can be left as NULL.
   * <p/>
   * Note that if the check is pending stop or pending void and the new status
   * is issued or cleared, the statuses of the check and its payments are updated
   * and a warning activity is created and assigned to the user who attempted to
   * void or stop the check so that the user knows that the check was not voided.
   * <p/>
   * If the Check is linked to a BulkInvoiceItem (check.Bulked == true), updating the Check status will also
   * update the BulkInvoiceItem status, if appropriate.
   * @param checkNumber the checkNumber to update to
   * @param issueDate the issueDate to updated to
   * @param status the status to update to
   */
  public void updateCheckStatus(java.lang.String checkNumber, java.util.Calendar issueDate, typekey.TransactionStatus status) {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).updateCheckStatus(checkNumber, issueDate, status);
  }
  
  /**
   * Updates this check's reportable amount to match the gross amount. Also computes and sets deductions, if any. Any
   * already existing deductions are replaced.
   */
  public void updateReportableAmountAndDeductions() throws com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
    ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).updateReportableAmountAndDeductions();
  }
  
  /**
   * Performs various validation tests on the payees for a check.  These include whether the same payee is used more than once on a check, and whether
   * the check has more than one vendor as a payee.  If any problems are found, a UserDisplayableException with the proper error message is thrown.
   */
  public void validateCheckPayees() {
    ((gw.api.financials.CheckValidationMethods)__getDelegateManager().getImplementation("gw.api.financials.CheckValidationMethods")).validateCheckPayees();
  }
  
  /**
   * Voids and reissues a check, deferring to {@link entity.Check#coreVoidAndReissue}. Customers may change the implementation
   * of this method.
   * Note: this method has been changed to take a Check, rather than a Key
   * @param oldCheck 
   */
  public void voidAndReissue(entity.Check oldCheck) {
    ((gw.api.financials.CancelCheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CancelCheckMethods")).voidAndReissue(oldCheck);
  }
  
  /**
   * Voids a check, deferring to {@link Check#coreVoidCheck}. Customers may change the implementation of this method.
   */
  public void voidCheck() {
    ((gw.api.financials.CancelCheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CancelCheckMethods")).voidCheck();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.CheckInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Check.this.__getDelegateManager();
    }
    
    /**
     * Acknowledges a message that this check is being submitted.
     * Updates the check's status to REQUESTED if it was REQUESTING, or ISSUED if it was NOTIFYING.
     * Updates its payments and their offsetting reserves (if any) to SUBMITTED.
     * @throws IllegalStateException if this check is not in REQUESTING or NOTIFYING status
     */
    public void acknowledgeSubmission() {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).acknowledgeSubmission();
    }
    
    /**
     * Acknowledges a message that this check is being transferred.
     * Updates the check's status to TRANSFERRED.
     * Updates its PENDINGTRANSFER payments to TRANSFERRED.
     * For each transferred payment, updates its onset and offset to SUBMITTED.
     * 
     * At the end it logs the transfer.
     * @throws IllegalStateException if this check is not in PENDINGTRANSFER status
     */
    public void acknowledgeTransfer() {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).acknowledgeTransfer();
    }
    
    /**
     * Adds a new additional payee to the check. It copies the base check info from the current check first, and
     * then overrides the properties given as parameters.
     * @param payee 
     * @param payeeRole 
     * @param deductionType 
     * @param percentage 
     * @param fixedAmount 
     * @return new check for the additional payee
     */
    public entity.Check addAdditionalPayee(entity.Contact payee, typekey.ContactRole payeeRole, typekey.DeductionType deductionType, java.math.BigDecimal percentage, java.math.BigDecimal fixedAmount) {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).addAdditionalPayee(payee, payeeRole, deductionType, percentage, fixedAmount);
    }
    
    /**
     * Adds a new additional payee to the check. It copies the base check info from the current check.
     * @return new check for the additional payee
     */
    public entity.Check addAdditionalPayeeBase() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).addAdditionalPayeeBase();
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
     * Add a new (empty) CheckPayee bean to the Check and return it.
     * 
     * Callers must then set the returned checkPayee's PayeeType to a ContactRole and the checkPayee's Payee to a Contact
     * in order for the CheckPayee to be valid. These two properties are required on the CheckPayee.
     * @return The newly created CheckPayee bean, already associated with this check.
     */
    public entity.CheckPayee addNewPayee() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).addNewPayee();
    }
    
    /**
     * Adds a new Payment to the Check and returns it.  This payment can then be modified as desired to
     * set the Exposure, CostType, CostCategory and lineitems.
     * @return the newly created Payment
     */
    public entity.Payment addNewPayment() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).addNewPayment();
    }
    
    /**
     * Adds a new Payment to the Check and returns it.  The ReserveLine of this new Payment will be set to
     * the provided Exposure, CostType, CostCategory.  If the Exposure is NULL, then the new Payment will
     * be a claim-level Payment.
     * @param exposure The Exposure for the new Payment - can be NULL, in which case a claim-level payment will
     *                 be created.
     * @param costType The CostType for the new Payment - cannot be NULL
     * @param costCategory The CostCategory for the new Payment - cannot be NULL
     * @return the newly created Payment
     */
    public entity.Payment addNewPayment(entity.Exposure exposure, typekey.CostType costType, typekey.CostCategory costCategory) {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).addNewPayment(exposure, costType, costCategory);
    }
    
    /**
     * Adds the given element to the CheckRptArray array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToCheckRptArray(entity.CheckRpt element) {
      __getInternalInterface().addArrayElement(CHECKRPTARRAY_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Deductions array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToDeductions(entity.Deduction element) {
      __getInternalInterface().addArrayElement(DEDUCTIONS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Payees array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToPayees(entity.CheckPayee element) {
      __getInternalInterface().addArrayElement(PAYEES_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the Payments array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToPayments(entity.Payment element) {
      __getInternalInterface().addArrayElement(PAYMENTS_PROP.get(), element);
    }
    
    /**
     * Adds the given element to the ServiceRequestInvoices array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToServiceRequestInvoices(entity.ServiceRequestInvoice element) {
      __getInternalInterface().addArrayElement(SERVICEREQUESTINVOICES_PROP.get(), element);
    }
    
    public void adjustDeductionsOnTransferredCheckInCaseOfCurrencyChange(entity.Check checkOld) {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).adjustDeductionsOnTransferredCheckInCaseOfCurrencyChange(checkOld);
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    /**
     * Adjusts this check's claim and/or reporting amounts to the specified values. Such adjustments are intended for
     * cases where better values for the amounts are determined later, after the check is created and escalated. For
     * example, if a check is written from a claim-currency bank account, the amount actually deducted from
     * that account's balance will be determined by exchange rates in effect at the time the check clears. This method
     * allows, for example, the claim amounts of the payments to be adjusted to reflect that amount for which the check
     * actually cleared.Adjustments are distributed proportionally among the payment's line
     * items. For example, if the payment has four line items with claim amounts of $40, $20, $10, and $10 (a total of
     * $80), and <code>newClaimAmount</code> is $100, then the claim amounts will be adjused to $50, $25, $12.50, and
     * $12.50. In this example, each claim amount was increased by 25% (equal to the total relative increase), and each
     * new claim amount comprises the same fraction of the total as it did before the adjustment.
     * 
     * In this variant of the method, only a claim amount is specified, and an adjustment to the reporting amount is
     * selected automatically. For example, if the reporting currency equals the transaction currency, then the reporting
     * amount is not adjusted. If the payment's claim is in the reporting currency, then the reporting amount is adjusted
     * to <code>newClaimAmount</code>. Otherwise, the adjusted reporting amount is determined by converting
     * <code>newClaimAmount</code> to the reporting currency using this payment's claim-to-reporting exchange rate.
     * 
     * When this method is called, the system must be configured in multicurrency mode and the check must:
     * <ul>
     *  <li>have already been escalated and sent downstream but not been canceled or transferred
     *  <li>not be part of a multi-payee (grouped) check
     * </ul>
     * 
     * Foreign exchange adjustments only affect total incurred and total paid calculations.  They do not further erode reserves.
     * @param newClaimAmount the adjusted amount for this payment in the claim currency; cannot be null
     * @throws IllegalStateException if claim amount is being adjusted but the transaction currency equals the claim currency
     */
    public void applyForeignExchangeAdjustment(java.math.BigDecimal newClaimAmount) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).applyForeignExchangeAdjustment(newClaimAmount);
    }
    
    /**
     * Adjusts this check's claim and/or reporting amounts to the specified values. Such adjustments are intended for
     * cases where better values for the amounts are determined later, after the check is created and escalated. For
     * example, if a check is written from a claim-currency bank account, the amount actually deducted from
     * that account's balance will be determined by exchange rates in effect at the time the check clears. This method
     * allows, for example, the claim amounts of the payments to be adjusted to reflect that amount for which the check
     * actually cleared. Null may be passed for <code>newClaimAmount</code> or <code>newReportingAmount</code>, in which
     * case no adjustment is made to that amount. Adjustments are distributed proportionally among the payment's line
     * items. For example, if the payment has four line items with claim amounts of $40, $20, $10, and $10 (a total of
     * $80), and <code>newClaimAmount</code> is $100, then the claim amounts will be adjused to $50, $25, $12.50, and
     * $12.50. In this example, each claim amount was increased by 25% (equal to the total relative increase), and each
     * new claim amount comprises the same fraction of the total as it did before the adjustment. Adjustments to the claim
     * and reporting amounts are largely independent.
     * 
     * When this method is called, the system must be configured in multicurrency mode and the check must:
     * <ul>
     *  <li>have already been escalated and sent downstream but not been canceled or transferred
     *  <li>not be part of a multi-payee (grouped) check
     * </ul>
     * 
     * Foreign exchange adjustments only affect total incurred and total paid calculations.  They do not further erode reserves.
     * @param newClaimAmount the value to which this check's claim amount should be adjusted; if null, the claim amount
     *                       is not adjusted
     * @param newReportingAmount the value to which this check's reporting amount should be adjusted; if null, the
     *                           reporting amount is not adjusted
     * @throws IllegalStateException if there is a conflict between the new, adjusted amounts and the currencies:
     *                            if newClaimAmount is different from the current transaction amount and the transaction and claim currencies are the same,
     *                            or if newClaimAmount is different from newReportingAmount and the reporting and claim currencies are the same,
     *                            or if newReportingAmount is different from the current transaction amount and the reporting and transaction currencies are the same
     */
    public void applyForeignExchangeAdjustment(java.math.BigDecimal newClaimAmount, java.math.BigDecimal newReportingAmount) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).applyForeignExchangeAdjustment(newClaimAmount, newReportingAmount);
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
    
    /**
     * Tests whether a foreign exchange adjustment can be applied to this check.  Only checks that have been escalated
     * (i.e., submitted to the downstream system), but not subsequently voided, stopped or transferred can have a foreign
     * exchange adjustment applied to them.  Also, foreign exchange adjustments are not allowed for multi-payee checks
     * in version 5.0.x (joint-payee checks are OK) or if the system is not configured for multicurrency mode.
     * @return <code>true</code> if this check can have a foreign exchange adjustment applied to it, else <code>false</code>
     */
    public boolean canApplyForeignExchangeAdjustment() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).canApplyForeignExchangeAdjustment();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public entity.Check cloneAsNew(entity.CheckSet checkSet) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).cloneAsNew(checkSet);
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    /**
     * Creates a clone of this check in a new CheckSet. The new check can be modified, but prepareForCommit() must be
     * called on its CheckSet before committing. A check cannot be cloned if it is part of a bulk invoice, is part of a
     * recurrence, has been transferred, or is not a primary check. If this check is the primary check of a CheckGroup,
     * the group is cloned and the new primary check is returned. All deductible line items are removed, so the total
     * amount of the check may be greater than the original.
     * @return clone of this check
     */
    public entity.Check cloneCheck() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).cloneCheck();
    }
    
    /**
     * Invokes any deduction adapters in the system to generate deductions for a check and
     *  adds them to the Check. All existing deductions on the Check are replaced.
     * @throws DeductionAdapterException if the configured deduction adapter fails
     */
    public void computeDeductions() throws com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).computeDeductions();
    }
    
    public entity.Check copyCheck(entity.Check copy) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).copyCheck(copy);
    }
    
    public entity.Check copySelfAndVirtualArrays(gw.pl.persistence.core.Bundle bundle, boolean copyDeductions, boolean matchPaymentLifeCycleStates, boolean filterPayments) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).copySelfAndVirtualArrays(bundle, copyDeductions, matchPaymentLifeCycleStates, filterPayments);
    }
    
    /**
     * NOTE: To create a check for reissuance, call <code>createCheckForReissue()</code> instead. This should only be
     * called from the implementation of that method.
     * <p>
     * Returns a copy of this check for reissuance without all of its fields completely initialized, since it
     * is expected that <code>createCheckForReissue()</code> will finish initializing the object. The new check's
     * status is set to {@link TransactionStatus#TC_AWAITINGSUBMISSION}.
     * 
     * If this is a primary check, the returned check will be a secondary check (since it won't have any payments yet) and
     * when {@link entity.Check#voidAndReissue} or {@link entity.Check#stopAndReissue} is eventually called, the checks will swap roles:
     * the old check will become a secondary check, the new check will become the primary check, and the payments and
     * deductions will be moved to the new check.
     * @throws IllegalStateException if the check is not reissuable (i.e., if Check.Reissuable evaluates to false)
     * @return a new Check bean that is a copy of this check for purposes of reissuance.
     */
    public entity.Check coreCreateCheckForReissue() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreCreateCheckForReissue();
    }
    
    /**
     * Deletes a check and all of its payments and deductions via Check.retire().
     * For recurring CheckSets, if the primary check becomes null, then resets it
     * to the first check in the recurrence and resets Recurrence.NumChecks if necessary.
     * The method then calls CheckSet.delete().
     * @throws com.guidewire.pl.system.exception.InsufficientPermissionException If the current user does not have
     *                                                                             the required system permission for deleting checks.
     * @throws IllegalStateException If the check does not have a valid status to be
     *                                                                             deleted.
     */
    public void coreDelete() throws com.guidewire.pl.system.exception.InsufficientPermissionException {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreDelete();
    }
    
    /**
     * NOTE: To stop and reissue a check, call {@link entity.Check#stopAndReissue(entity.Check)}. This should only be called from the
     * implementation of that method.
     * <p>
     * Performs the "core" operations to stop payment on and reissue one Check in a CheckGroup.
     * Each Check in a CheckGroup represents one payee (or set of
     * joint payees)--and therefore one physical check--for a multi-payee "check". The original Check, which is being
     * reissued, is identified by the <code>oldCheck</code> argument, and <em>this</em> (the new Check) becomes its
     * replacement. This check should have been returned by an earlier call to <code>createCheckForReissue()</code>.
     * This method requires that the following criteria are met:
     * <ul>
     *  <li>The user has the "stop" permission.
     *  <li>The original Check is Reissuable and has one of these statuses:<ul>
     *    <li> {@link TransactionStatus#TC_REQUESTING}
     *    <li> {@link TransactionStatus#TC_REQUESTED}
     *    <li> {@link TransactionStatus#TC_ISSUED}
     *    <li> {@link TransactionStatus#TC_NOTIFYING}
     *   </ul>
     * </ul>
     * The status of the original Check is set to {@link TransactionStatus#TC_PENDINGSTOP}, and then reissuance proceeds
     * as follows:
     * <ol>
     *  <li>If the original Check was the primary Check for the CheckGroup, the new Check becomes the primary Check
     *      and the original Check is converted to a secondary Check (still in the same CheckGroup), and all of the
     *      Payments and Deductions are moved to the new Check
     *  <li>Regardless of whether the original Check already had a CheckPortion, a new, fixed-amount CheckPortion is
     *      created for it so that, in case it was not already defined by a fixed portion, its amount will not
     *      fluctuate (e.g., if it previously used a percentage portion)
     *  <li>A CheckRpt is created for the new Check
     *  <li>On the new Check, CheckNumber and IssueDate are cleared, ScheduledSendDate is set to today, and Status is
     *      is set to {@link TransactionStatus#TC_AWAITINGSUBMISSION}
     * </ol>
     * @param oldCheck 
     * @throws IllegalStateException if check status is not one of the allowed statuses or if the check is otherwise not reissuable
     */
    public void coreStopAndReissue(entity.Check oldCheck) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreStopAndReissue(oldCheck);
    }
    
    /**
     * NOTE: To stop a check, call {@link entity.Check#stopCheck()}. This should only be called from the
     * implementation of that method.
     * 
     * Performs the "core" operations to stop payment on a check. Offsetting reserves are created only if
     * the payment is not a supplement (since supplement payments never affect
     * open reserves in the first place) and either of the following holds:
     * - the payment's exposure is closed (open reserves should always be zero for a closed exposure)
     * - the open reserves for the payment's exposure's costtype is zero
     * Offsetting reserves are included in this check's CheckSet.
     * <p/>
     * The status of the check and all payments on the check are set to pending
     * stop.  The status of any offsetting reserves is set to pending submission.
     * <p/>
     * If this check belongs to a CheckGroup, then all checks in the group are stopped.
     * <p/>
     * This action does not require approval.
     * @throws IllegalStateException if check status is not one of the
     *          following: TransactionStatus.TC_NOTIFYING,
     *          TransactionStatus.TC_REQUESTED,
     *          TransactionStatus.TC_REQUESTING,
     *          TransactionStatus.TC_ISSUED
     */
    public void coreStopCheck() {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreStopCheck();
    }
    
    /**
     * NOTE: To void and reissue a check, call {@link entity.Check#voidAndReissue(entity.Check)}. This should only be called from the
     * implementation of that method.
     * <p>
     * Performs the "core" operations to void and reissue one Check in a CheckGroup. Each Check in a CheckGroup represents one payee (or set of
     * joint payees)--and therefore one physical check--for a multi-payee "check". The original Check, which is being
     * reissued, is identified by the <code>oldCheck</code> argument, and <em>this</em> (the new Check) becomes its
     * replacement. This check should have been returned by an earlier call to <code>createCheckForReissue()</code>. This
     * method requires that the following criteria are met:
     * <ul>
     *  <li>The user has the "void" permission.
     *  <li>If the original Check was cleared, the user has the "voidclearedpmt" permission.
     *  <li>The original Check is Reissuable and has one of these statuses:<ul>
     *    <li> {@link TransactionStatus#TC_REQUESTING}
     *    <li> {@link TransactionStatus#TC_REQUESTED}
     *    <li> {@link TransactionStatus#TC_ISSUED}
     *    <li> {@link TransactionStatus#TC_NOTIFYING}
     *    <li> {@link TransactionStatus#TC_CLEARED}
     *   </ul>
     * </ul>
     * The status of the original Check is set to {@link TransactionStatus#TC_PENDINGVOID}, and then reissuance proceeds
     * as follows:
     * <ol>
     *  <li>If the original Check was the primary Check for the CheckGroup, the new Check becomes the primary Check
     *      and the original Check is converted to a secondary Check (still in the same CheckGroup), and all of the
     *      Payments and Deductions are moved to the new Check
     *  <li>Regardless of whether the original Check already had a CheckPortion, a new, fixed-amount CheckPortion is
     *      created for it so that, in case it was not already defined by a fixed portion, its amount will not
     *      fluctuate (e.g., if it previously used a percentage portion)
     *  <li>A CheckRpt is created for the new Check
     *  <li>On the new Check, CheckNumber and IssueDate are cleared, ScheduledSendDate is set to today, and Status is
     *      is set to {@link TransactionStatus#TC_AWAITINGSUBMISSION}
     * </ol>
     * @param oldCheck 
     * @throws IllegalStateException if check status is not one of the allowed statuses or if the check is otherwise not reissuable
     */
    public void coreVoidAndReissue(entity.Check oldCheck) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreVoidAndReissue(oldCheck);
    }
    
    /**
     * NOTE: To void a check, call {@link entity.Check#voidCheck()}. This should only be called from the
     * implementation of that method.
     * 
     * Performs the "core" operations to void a check. This method will normally only be called
     * from {@link entity.Check#voidCheck}. Offsetting reserves are created only if the payment is not
     * a supplement (since supplement payments never affect open reserves in the
     * first place) and either of the following holds:
     * - the payment's exposure is closed (open reserves should always be zero for a closed exposure)
     * - the open reserves for the payment's exposure's costtype is zero
     * Offsetting reserves are included in this check's CheckSet.
     * <p/>
     * The status of the check and all payments on the check are set to pending
     * void.  The status of any offsetting reserves is set to submitting.
     * <p/>
     * If this check belongs to a CheckGroup, then all checks in the group are voided.
     * <p/>
     * This action does not require approval.
     * @throws IllegalStateException if check status is not one of the
     *          following: TransactionStatus.TC_REQUESTING,
     *          TransactionStatus.TC_REQUESTED,
     *          TransactionStatus.TC_ISSUED,
     *          TransactionStatus.TC_NOTIFYING,
     *          TransactionStatus.TC_CLEARED
     */
    public void coreVoidCheck() {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).coreVoidCheck();
    }
    
    /**
     * Creates a new check that is a copy of this check.  Also copies the payments,
     * deductions, and payees of this check to the new check as new objects.
     * <p>
     * Methods to call when Transferring a Check:
     * <ol>
     * <li>oldCheck.createCheckForTransfer() - returns the newCheck</li>
     * <li>newCheck.updateCheckForTransfer(Claim newClaim, Check oldCheck)</li>
     * <li>CheckUtil#transferCheck( newCheck, oldCheck, Location currentLocation )
     *  OR newCheck.prepareForCommitForTransfer(Check oldCheck)</li>
     * </ol>
     * @throws IllegalArgumentException if the bundle of this check is not writeable
     * @return A new Check that is a copy of this check for the purpose of transferring
     *         the original check to a new claim.
     */
    public entity.Check createCheckForTransfer() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).createCheckForTransfer();
    }
    
    public entity.Check createCheckForTransfer(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).createCheckForTransfer(bundle);
    }
    
    public void createValidationFailedActivity(gw.api.financials.CloseValidationException e, entity.TransactionSet checkSet) {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).createValidationFailedActivity(e, checkSet);
    }
    
    public void delete() throws com.guidewire.pl.system.exception.InsufficientPermissionException {
      ((gw.api.financials.DeleteCheckMethods)__getDelegateManager().getImplementation("gw.api.financials.DeleteCheckMethods")).delete();
    }
    
    /**
     * Called when check is denied by downstream system.  This action does not require approval.
     * @throws IllegalStateException if the check status is not one of the
     *          following: TransactionStatus.TC_SUBMITTING,
     *          TransactionStatus.TC_SUBMITTED
     * @throws com.guidewire.pl.system.exception.InsufficientPermissionException 
     */
    public void denyCheck() throws com.guidewire.pl.system.exception.InsufficientPermissionException {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).denyCheck();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public void ensurePaymentLifeCycleStatesConsistentWithSendDate() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).ensurePaymentLifeCycleStatesConsistentWithSendDate();
    }
    
    /**
     * Called by Check to execute check payee validation. Used by check wizard and check creator.
     * Customers may change the implementation of this method.
     */
    public void executePayeeEarlyValidation() {
      ((gw.api.financials.CheckValidationMethods)__getDelegateManager().getImplementation("gw.api.financials.CheckValidationMethods")).executePayeeEarlyValidation();
    }
    
    /**
     * Called by Check to execute check payment validation. Used by check wizard and check creator.
     * Customers may change the implementation of this method.
     */
    public void executePaymentEarlyValidation() {
      ((gw.api.financials.CheckValidationMethods)__getDelegateManager().getImplementation("gw.api.financials.CheckValidationMethods")).executePaymentEarlyValidation();
    }
    
    /**
     * Validates the check payees for every check in the checkset being edited.  Throws a UserDisplayableException with
     * relevant error message if a problem is found.
     */
    public void executeRequiredPayeeEarlyValidation() {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).executeRequiredPayeeEarlyValidation();
    }
    
    /**
     * Verifies that each payment has a reserve line, a payment type, at least one line item, and that each line item
     * has an amount.  If problems are found during this verification, then a UserDisplayableException is thrown containing
     * an appropriate error message.
     */
    public void executeRequiredPaymentEarlyValidation() {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).executeRequiredPaymentEarlyValidation();
    }
    
    public void executeSubmissionActions() throws gw.api.financials.CloseValidationException {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).executeSubmissionActions();
    }
    
    /**
     * Returns the claimant that should be associated with this check.
     */
    public entity.Contact findClaimant() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).findClaimant();
    }
    
    public entity.Contact findClaimantIgnoringPayees() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).findClaimantIgnoringPayees();
    }
    
    /**
     * Get a payment on the check. If no payments exist,
     * then one will be created and added to the Payments array.
     * <p>
     * Warning: The payment returned can change from one call to the next.
     * Used where the Check is guaranteed to have only one payment, or to edit fields which will immediately
     * be synchronized across all Payments, such as Currency and exchange rate. Use with caution.
     * <p>
     * Warning: call this method only on a Primary check.  This method throws on a secondary check.
     */
    public entity.Payment findOrCreatePayment() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).findOrCreatePayment();
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
    
    public gw.api.address.SimpleAddressOwner getAddressOwner() {
      return ((gw.api.financials.CheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CheckMethods")).getAddressOwner();
    }
    
    /**
     * Get the allowed ContactRole values that can be set for the check's payeetype
     * when the check's payee is the given Contact.
     * @param payee The payee for whom to get the allowed types
     * @return the allowed ContactRole values for the check's payeetype given the payee passed in
     */
    public typekey.ContactRole[] getAllowedPayeeTypes(entity.Contact payee) {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getAllowedPayeeTypes(payee);
    }
    
    public entity.Payment getAnyPaymentPreferrablyOld() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getAnyPaymentPreferrablyOld();
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    /**
     * Gets the value of the BankAccount field.
     * Source bank account.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.BankAccount getBankAccount() {
      return (typekey.BankAccount)__getInternalInterface().getFieldValue(BANKACCOUNT_PROP.get());
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
     * Retrieves bulk invoice item associated with current check if any.
     * If there is no associated bulk invoice item, returns null
     * @return The associated BulkInvoiceItem or null
     */
    public entity.BulkInvoiceItem getBulkInvoiceItem() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getBulkInvoiceItem();
    }
    
    /**
     * Gets the value of the BulkInvoiceItemInfo field.
     * If this check was created to act as a record-keeper for a bulk invoice item, this is the item it references.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.BulkInvoiceItemInfo getBulkInvoiceItemInfo() {
      return (entity.BulkInvoiceItemInfo)__getInternalInterface().getFieldValue(BULKINVOICEITEMINFO_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getBulkInvoiceItemInfoID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(BULKINVOICEITEMINFO_PROP.get());
    }
    
    /**
     * Returns the invoice number of the BulkInvoice associated with the BulkInvoiceItem of this Check, or "&lt;none&gt;"
     * if this Check is not bulked.
     * @return BulkInvoice number associated with this Check
     */
    public java.lang.String getBulkInvoiceNumber() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getBulkInvoiceNumber();
    }
    
    /**
     * Primary payee's address if not null, else return the claim's loss location.
     * @return the primary payee's address if not null, else return the claim's loss location
     */
    public entity.Address getBusinessCalendarAddress() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getBusinessCalendarAddress();
    }
    
    /**
     * Gets the value of the CheckBatching field.
     * How the check should be batched for sending.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CheckBatching getCheckBatching() {
      return (typekey.CheckBatching)__getInternalInterface().getFieldValue(CHECKBATCHING_PROP.get());
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
     * The check or EFT identifier.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getCheckNumber() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(CHECKNUMBER_PROP.get());
    }
    
    /**
     * Returns the order that a check occurs in a recurrence set based on its send
     * date.  If the check is not part of a recurrence set, then returns -1.
     * @return the numeric order of this check in the recurrence, as an int.  The ordering
     *         is one based, i.e. the earliest dated check in the recurrence will have an
     *         order of 1.
     */
    public int getCheckOrder() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getCheckOrder();
    }
    
    /**
     * Gets the value of the CheckRpt field.
     * The calculated data for this check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CheckRpt getCheckRpt() {
      return (entity.CheckRpt)__getInternalInterface().getFieldValue(CHECKRPT_PROP.get());
    }
    
    /**
     * Gets the value of the CheckRptArray field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CheckRpt[] getCheckRptArray() {
      return (entity.CheckRpt[])__getInternalInterface().getFieldValue(CHECKRPTARRAY_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCheckRptID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CHECKRPT_PROP.get());
    }
    
    /**
     * Gets the value of the CheckSet field.
     * CheckSet this Check belongs to.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CheckSet getCheckSet() {
      return (entity.CheckSet)__getInternalInterface().getFieldValue(CHECKSET_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCheckSetID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CHECKSET_PROP.get());
    }
    
    /**
     * Gets the value of the CheckType field.
     * Role of the check in the check group (primary or secondary).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.CheckType getCheckType() {
      return (typekey.CheckType)__getInternalInterface().getFieldValue(CHECKTYPE_PROP.get());
    }
    
    public entity.Check[] getChecksInGroup() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getChecksInGroup();
    }
    
    /**
     * Gets the value of the Claim field.
     * The related claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimContact field.
     * Claimant the check is being written for, as a ClaimContact.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimContact getClaimContact() {
      return (entity.ClaimContact)__getInternalInterface().getFieldValue(CLAIMCONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMCONTACT_PROP.get());
    }
    
    /**
     * Returns the foreign-exchange adjustment made to this check's claim currency amount.
     * @return a BigDecimal containing the amount of the claim currency foreign exchange adjustment
     */
    public gw.api.financials.CurrencyAmount getClaimForExAdjustmentAmount() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getClaimForExAdjustmentAmount();
    }
    
    /**
     * Returns the foreign-exchange adjustment made to this check's claim currency amount.
     * @param useOldAmounts if <code>true</code> and the foreign exchange adjustment
     *                      amount was changed, then the prior amount will be returned.
     *                      If <code>false</code> then the current foreign exchange
     *                      amount will always be returned.
     * @return a BigDecimal containing the claim currency amount of the foreign exchange adjustment
     */
    public gw.api.financials.CurrencyAmount getClaimForExAdjustmentAmount(boolean useOldAmounts) {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getClaimForExAdjustmentAmount(useOldAmounts);
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * 
     * @return 
     */
    public entity.ClaimInfo getClaimInfo() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getClaimInfo();
    }
    
    public entity.ExchangeRate getClaimToReportingExchangeRateEntity() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getClaimToReportingExchangeRateEntity();
    }
    
    /**
     * 
     * @return the rate value of the {@link ExchangeRate} returned by
     *         {@link entity.Check#getClaimToReportingExchangeRateEntity} or null if that method returns null
     */
    public java.math.BigDecimal getClaimToReportingExchangeRateEntityRate() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getClaimToReportingExchangeRateEntityRate();
    }
    
    /**
     * Claimant the check is being written for, as a Contact.
     */
    public entity.Contact getClaimant() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getClaimant();
    }
    
    public gw.pl.persistence.core.Key getClaimantID() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getClaimantID();
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
     * The Currency of this check, and all its Payments. If this is a secondary check, the currency will be retrieved
     * from the primary check
     */
    public typekey.Currency getCurrency() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getCurrency();
    }
    
    public typekey.Currency getCurrency(com.guidewire.cc.domain.financials.AmountType amountType) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getCurrency(amountType);
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
     * Gets the value of the DeductionType field.
     * Deduction type for secondary checks.  Always NULL for primary checks.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DeductionType getDeductionType() {
      return (typekey.DeductionType)__getInternalInterface().getFieldValue(DEDUCTIONTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Deductions field.
     * Any deductions related to the check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Deduction[] getDeductions() {
      return (entity.Deduction[])__getInternalInterface().getFieldValue(DEDUCTIONS_PROP.get());
    }
    
    /**
     * Returns the sum of the claim amounts of all deductions on this check.
     * @return the aggregate claim amount of all deductions on this check, as a BigDecimal
     */
    public gw.api.financials.CurrencyAmount getDeductionsClaimTotal() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getDeductionsClaimTotal();
    }
    
    /**
     * Returns the sum of the transaction amounts of all deductions on this check.
     * @return the aggregate transaction amount of all deductions on this check, as a BigDecimal
     */
    public gw.api.financials.CurrencyAmount getDeductionsTotal() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getDeductionsTotal();
    }
    
    public gw.api.financials.CurrencyAmount getDeductionsTotal(com.guidewire.cc.domain.financials.AmountType amountType) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getDeductionsTotal(amountType);
    }
    
    /**
     * Gets the deductions total in the transaction currency paired with the amount in the reserving currency.
     */
    public gw.api.financials.CurrencyAmountPair getDeductionsTotalPair() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getDeductionsTotalPair();
    }
    
    /**
     * Defines the default Reserving Currency to be used while matching Reserve Lines on this payment to those on the
     * target Claim.
     * 
     * NOTE: This API is not intended to be used/extended if Multi Currency Reserving isn't enabled.
     * @param targetClaim the claim to which this check is being transferred to.
     * @return the default Target Reserving Currency. Can be null.
     */
    public typekey.Currency getDefaultTargetReservingCurrencyForTransfer(entity.Claim targetClaim) {
      return ((gw.api.financials.CheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CheckMethods")).getDefaultTargetReservingCurrencyForTransfer(targetClaim);
    }
    
    /**
     * Gets the value of the DeliveryMethod field.
     * Requested delivery method.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DeliveryMethod getDeliveryMethod() {
      return (typekey.DeliveryMethod)__getInternalInterface().getFieldValue(DELIVERYMETHOD_PROP.get());
    }
    
    /**
     * Gets the value of the EnteredTime field.
     * The time the check was created. This is different from CreateTime, which is the time it was stored in the system.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getEnteredTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(ENTEREDTIME_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * 
     * @deprecated use {@link #getTransToClaimExchangeRateEntity} instead
     */
    @java.lang.Deprecated
    public entity.ExchangeRate getExchangeRateEntity() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getExchangeRateEntity();
    }
    
    /**
     * 
     * @deprecated use {@link #getTransToClaimExchangeRateEntityRate} instead
     */
    @java.lang.Deprecated
    public java.math.BigDecimal getExchangeRateEntityRate() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getExchangeRateEntityRate();
    }
    
    public java.util.List<entity.Payment> getFinalPayments() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getFinalPayments();
    }
    
    /**
     * Get the first payee on the check (defined as Payees[0]). If no payees exist,
     * then one will be created and added to the array.
     * @return The first CheckPayee on this check, which may be a new bean.  Note that this method does
     *         not necessarily have a deterministic result, i.e. two calls to this method
     *         in different sessions could return different values if the check has more than one payee.
     */
    public entity.CheckPayee getFirstPayee() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getFirstPayee();
    }
    
    /**
     * Get a payment on the check. If no payments exist,
     * then one will be created and added to the array.
     * <p>
     * Warning: The payment returned can change from one call to the next.
     * Used where the Check is guaranteed to have only one payment, or to edit fields which will immediately
     * be synchronized across all Payments, such as Currency and exchange rate. Use with caution.
     * @return The "first" Payment on this check, which may be added by this call. Note that this property
     *         not necessarily have a deterministic result, i.e. two accesses of this property
     *         in different sessions could return different values if the check has more than one payment.
     * @deprecated Use findOrCreatePayment() method.
     */
    @java.lang.Deprecated
    public entity.Payment getFirstPayment() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getFirstPayment();
    }
    
    /**
     * The gross amount of this check in the transaction currency.  The amount is determined by summing
     * the transaction amounts of all payments that belong to this check.  Deductions are not
     * accounted for.
     * @return the summed transaction amounts of all this check's payments
     */
    public gw.api.financials.CurrencyAmount getGrossAmount() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getGrossAmount();
    }
    
    public gw.api.financials.CurrencyAmount getGrossAmount(com.guidewire.cc.domain.financials.AmountType amountType) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getGrossAmount(amountType);
    }
    
    /**
     * Gets the gross amount in the transaction currency paired with the amount in the reserving currency.
     */
    public gw.api.financials.CurrencyAmountPair getGrossAmountPair() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getGrossAmountPair();
    }
    
    /**
     * Gets the Check GrossAmount. Sets the amount of the first Payment of the Check.
     * Should only be edited when there is only one Payment on the Check, otherwise
     * an IllegalStateException is thrown.
     */
    public gw.api.financials.IMoney getGrossAmountSettableComponent() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getGrossAmountSettableComponent();
    }
    
    /**
     * The gross amount of this check in the claim/default currency.  The amount is
     * determined by summing the claim amounts of all payments that belong to this check.
     * Deductions are not accounted for.
     * @return the summed claim amounts of all this check's payments
     */
    public gw.api.financials.CurrencyAmount getGrossClaimAmount() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getGrossClaimAmount();
    }
    
    public gw.api.financials.CurrencyAmount getGrossReportingAmount() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getGrossReportingAmount();
    }
    
    /**
     * The gross amount of this check in the reserving currency.  The amount is
     * determined by summing the reserving amounts of all payments that belong to this check.
     * Deductions are not accounted for.
     * @return the summed reserving amounts of all this check's payments
     */
    public gw.api.financials.CurrencyAmount getGrossReservingAmount() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getGrossReservingAmount();
    }
    
    /**
     * Gets the value of the Group field.
     * CheckGroup this check belongs to, if it's part of a multi-payee check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CheckGroup getGroup() {
      return (entity.CheckGroup)__getInternalInterface().getFieldValue(GROUP_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getGroupID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(GROUP_PROP.get());
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
     * Gets the value of the InvoiceNumber field.
     * Invoice number associated with the check.
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
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
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
     * Address of the person/company to whom the check should be mailed. This represents an Address entity.
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
     * The net transaction amount of this check.  The amount is determined by subtracting
     * any deductions from the gross check amount.
     */
    public gw.api.financials.CurrencyAmount getNetAmount() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getNetAmount();
    }
    
    public gw.api.financials.CurrencyAmount getNetAmount(com.guidewire.cc.domain.financials.AmountType amountType) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getNetAmount(amountType);
    }
    
    /**
     * Gets the net amount in the transaction currency paired with the amount in the reserving currency.
     */
    public gw.api.financials.CurrencyAmountPair getNetAmountPair() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getNetAmountPair();
    }
    
    /**
     * The net claim amount of this check.  The amount is determined by subtracting
     * any deductions from the gross check amount.
     */
    public gw.api.financials.CurrencyAmount getNetClaimAmount() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getNetClaimAmount();
    }
    
    public entity.CheckRpt getOrCreateCheckRpt(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getOrCreateCheckRpt(bundle);
    }
    
    /**
     * 
     * @deprecated use {@link #getOverrideTransToReservingExchangeRate()} instead
     */
    @java.lang.Deprecated
    public boolean getOverrideExchangeRate() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getOverrideExchangeRate();
    }
    
    /**
     * Override the Transaction to Claim amount ExchangeRate for Payments on this Check.
     * If true, {@link #getTransToClaimExchangeRateEntity()} returns a custom ExchangeRate entity with an editable Rate.
     * If false, it returns the appropriate Market Exchange Rate (which is not editable).
     */
    public boolean getOverrideTransToClaimExchangeRate() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getOverrideTransToClaimExchangeRate();
    }
    
    /**
     * Returns whether the transaction-to-reserving exchange rate has been
     * overridden for the payments on this check.
     */
    public boolean getOverrideTransToReservingExchangeRate() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getOverrideTransToReservingExchangeRate();
    }
    
    /**
     * Gets the value of the PayTo field.
     * Pay to the order of.
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
     * Gets the value of the Payees field.
     * Recipients of the payment; there must be at least one. If there are multiple, each is a 'joint' payee.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CheckPayee[] getPayees() {
      return (entity.CheckPayee[])__getInternalInterface().getFieldValue(PAYEES_PROP.get());
    }
    
    /**
     * Gets the value of the PaymentMethod field.
     * Requested payment method for all payments in the check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.PaymentMethod getPaymentMethod() {
      return (typekey.PaymentMethod)__getInternalInterface().getFieldValue(PAYMENTMETHOD_PROP.get());
    }
    
    /**
     * Gets the value of the Payments field.
     * Payments on the check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Payment[] getPayments() {
      return (entity.Payment[])__getInternalInterface().getFieldValue(PAYMENTS_PROP.get());
    }
    
    public entity.Payment[] getPaymentsSortedbyClaimExposureClosedFlag() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getPaymentsSortedbyClaimExposureClosedFlag();
    }
    
    /**
     * Gets the value of the Portion field.
     * The amount of a multi-payee check applicable to this check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.CheckPortion getPortion() {
      return (entity.CheckPortion)__getInternalInterface().getFieldValue(PORTION_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getPortionID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(PORTION_PROP.get());
    }
    
    /**
     * Returns the previously paid or scheduled service period of the first exposure
     * that is of a type that can have a service period and has a check whose payee
     * is the same as that of the given check.
     */
    public java.lang.String getPrevPaidOrScheduledServicePeriod() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getPrevPaidOrScheduledServicePeriod();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the RecurringCheck field.
     * The recurring check entity, if any, associated with this check.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.RecurringCheck getRecurringCheck() {
      return (entity.RecurringCheck)__getInternalInterface().getFieldValue(RECURRINGCHECK_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getRecurringCheckID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(RECURRINGCHECK_PROP.get());
    }
    
    /**
     * Gets the value of the Reportability field.
     * Whether the payment should be reported to the IRS as income.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ReportabilityType getReportability() {
      return (typekey.ReportabilityType)__getInternalInterface().getFieldValue(REPORTABILITY_PROP.get());
    }
    
    /**
     * Gets the value of the ReportableAmount field.
     * Reportable amount of the check in the transaction currency. Used by the BackupWithholdingCalculator as the amount of the check reportable to the IRS, from which it calculates backup withholding Deductions. It is editable in the UI.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.api.financials.CurrencyAmount getReportableAmount() {
      return (gw.api.financials.CurrencyAmount)__getInternalInterface().getFieldValue(REPORTABLEAMOUNT_PROP.get());
    }
    
    /**
     * The ReportableAmount of the Check. This value is in the Check Currency.
     */
    public gw.api.financials.IMoney getReportableAmountSettableComponent() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getReportableAmountSettableComponent();
    }
    
    /**
     * Returns the foreign-exchange adjustment made to this check's reporting currency amount.
     * @return a BigDecimal containing the amount of the reporting currency foreign exchange adjustment
     */
    public gw.api.financials.CurrencyAmount getReportingForExAdjustmentAmount() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getReportingForExAdjustmentAmount();
    }
    
    /**
     * Returns the foreign-exchange adjustment made to this check's reporting currency amount.
     * @param useOldAmounts if <code>true</code> and the foreign exchange adjustment
     *                      amount was changed, then the prior amount will be returned.
     *                      If <code>false</code> then the current foreign exchange
     *                      amount will always be returned.
     * @return a BigDecimal containing the reporting currency amount of the foreign exchange adjustment
     */
    public gw.api.financials.CurrencyAmount getReportingForExAdjustmentAmount(boolean useOldAmounts) {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getReportingForExAdjustmentAmount(useOldAmounts);
    }
    
    /**
     * Returns the reserving currency, which is assumed to be shared by all
     * payments on this check.
     */
    public typekey.Currency getReservingCurrency() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getReservingCurrency();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the ScheduledSendDate field.
     * Date that the check is scheduled to be sent.  Also used to determine if the check amount is included in Future Payments (tomorrow or later).  Should only be modified in the UI or PreSetup rules.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getScheduledSendDate() {
      return (java.util.Date)__getInternalInterface().getFieldValue(SCHEDULEDSENDDATE_PROP.get());
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
     * Gets the value of the ServiceRequestInvoices field.
     * ServiceRequestInvoices related to this check. All linked invoices are expected to have the same service request specialist and currency.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequestInvoice[] getServiceRequestInvoices() {
      return (entity.ServiceRequestInvoice[])__getInternalInterface().getFieldValue(SERVICEREQUESTINVOICES_PROP.get());
    }
    
    /**
     * Get the only payment on the check; use where the check is expected to have
     * 1 payment and any other state indicates a programming error.  If the check
     * does not have exactly 1 payment, an IllegalStateException is thrown.
     * @return The single payment on the check
     */
    public entity.Payment getSinglePayment() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getSinglePayment();
    }
    
    public entity.Payment getSinglePaymentRelaxed() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getSinglePaymentRelaxed();
    }
    
    public entity.Payment getSinglePaymentStrict() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getSinglePaymentStrict();
    }
    
    /**
     * Gets the value of the Status field.
     * Status of the check (issued, voided, cleared, and so on). Do not update directly. Use methods to initiate operations, or use updateCheckStatus() method.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.TransactionStatus getStatus() {
      return (typekey.TransactionStatus)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Return the suggested Payee type for the given Payee. Used in UI reflection to pre-fill
     * a suggested Payee type if the user selects a particular Payee. A payee type is a contact
     * role, but is restricted to be one of the roles given by the "payee" type filter. This
     * method checks the given payee is a claim contact. If so it searches through the claim
     * contact's roles for the first one (in typekey order - priority/name) that is allowed by
     * the "payee" type filter. If it finds such a role it returns that. If the contact is
     * not a claim contact or it has no suitable role then this method returns "vendor" if
     * the contact is a vendor and "other" otherwise. If the payee argument is null this
     * method returns null.
     * @param payee the payee contact for which to suggest a payee type
     * @return the suggested payee type, or null if no suggestion can be found
     */
    public typekey.ContactRole getSuggestedPayeeType(entity.Contact payee) {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getSuggestedPayeeType(payee);
    }
    
    public gw.api.financials.CurrencyAmountPair getTotalAmount() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getTotalAmount();
    }
    
    public gw.api.financials.CurrencyAmount getTotalAmount(com.guidewire.cc.domain.financials.AmountType amountType) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).getTotalAmount(amountType);
    }
    
    /**
     * The ExchangeRate entity for TransactionAmount to ClaimAmount translation
     * used for all Payments on this Check. See {@link #getOverrideTransToClaimExchangeRate()}
     * When in override mode, you may modify the Description and Name.
     */
    public entity.ExchangeRate getTransToClaimExchangeRateEntity() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransToClaimExchangeRateEntity();
    }
    
    /**
     * The exchange rate in the ExchangeRate entity for TransactionAmount to ClaimAmount translation
     * used for all Payments on this Check. See {@link #getOverrideTransToClaimExchangeRate()}.
     * When in override mode, modify this property to change the exchange rate for the Check.
     */
    @gw.datatype.annotation.DataType(name = "exchangerate")
    public java.math.BigDecimal getTransToClaimExchangeRateEntityRate() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransToClaimExchangeRateEntityRate();
    }
    
    /**
     * Returns the transaction-to-reserving exchange rate entity, which is assumed
     * to be shared by all payments on this check.
     */
    public entity.ExchangeRate getTransToReservingExchangeRate() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransToReservingExchangeRate();
    }
    
    /**
     * Returns the numeric rate of the transaction-to-reserving exchange rate
     * entity, which is assumed to be shared by all payments on this check.
     */
    public java.math.BigDecimal getTransToReservingExchangeRateRate() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransToReservingExchangeRateRate();
    }
    
    /**
     * The gross amount of this check before it was transferred.
     * @return A BigDecimal containing the amount of this check before it was
     * transferred (essentially the sum of all payments on the check that have
     * a status of {@link TransactionStatus#TC_PENDINGTRANSFER} or
     * {@link TransactionStatus#TC_TRANSFERRED}).
     */
    public gw.api.financials.CurrencyAmount getTransferredAmount() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransferredAmount();
    }
    
    /**
     * Gets the transferred amount in the transaction currency paired with the amount in the reserving currency.
     */
    public gw.api.financials.CurrencyAmountPair getTransferredAmountComponent() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransferredAmountComponent();
    }
    
    /**
     * If this check was created due to another check being transferred, this method returns the original check for which this is
     * the transfer copy.  If this check was not created in response to a transfer, then this method returns NULL.
     * @return the original check that was transferred to produce this check, or NULL if this check is not the result of a transfer.
     */
    public entity.Check getTransferredCheck() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransferredCheck();
    }
    
    /**
     * The Check that this check was transferred to.
     * @return The onset check on the new claim that is the result of having transferred
     *         this check.  If this check has not been transferred then this method will
     *         return NULL.
     */
    public entity.Check getTransferredToCheck() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getTransferredToCheck();
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
     * If the any of the payees on this check is a Vendor, then returns the first
     * of those payees.  If none of the payees is a Vendor, then returns null.
     * @return The vendor, if any, found as a payee for this check.
     */
    public entity.Contact getVendor() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).getVendor();
    }
    
    /**
     * Returns true if this check has a service period (as opposed to a single
     * service date.)  A check has a service period if it has a WC Lost Wages,
     * PIP, Bodily Injury, or WC Injury exposure.
     * @return <code>true</code> If this check contains a payment with an exposure that
     *         has a service period, else <code>false</code>.
     */
    public boolean hasExposureWithServicePeriod() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).hasExposureWithServicePeriod();
    }
    
    /**
     * Tests whether this check has been adjusted due to foreign exchange rate changes.
     * @return <code>true</code> if this payment has a foreign exchange adjustment, else <code>false</code>
     */
    public boolean hasForeignExchangeAdjustment() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).hasForeignExchangeAdjustment();
    }
    
    public boolean hasServicePeriod() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).hasServicePeriod();
    }
    
    public boolean hasStoppableStatus() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).hasStoppableStatus();
    }
    
    public boolean hasVoidableStatus() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).hasVoidableStatus();
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    public java.util.List<gw.api.validation.ValidationExecutionResult> innerPrepareForCommitForTransfer(entity.Check oldCheck) {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).innerPrepareForCommitForTransfer(oldCheck);
    }
    
    public boolean isAwaitingToBeSentToday() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).isAwaitingToBeSentToday();
    }
    
    /**
     * Tests whether this check is part of a bulk payment (i.e., it's tied to a BulkInvoiceItem).
     * @return <code>true</code> if this is a bulked check, else <code>false</code>
     */
    public boolean isBulked() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isBulked();
    }
    
    public boolean isCanceled() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).isCanceled();
    }
    
    /**
     * Tests whether the check can be deleted. For the check to be deletable it
     * must have one of the following statuses:
     * <ul>
     * <li> {@link TransactionStatus#TC_DRAFT}
     * <li> {@link TransactionStatus#TC_PENDINGAPPROVAL}
     * <li> {@link TransactionStatus#TC_AWAITINGSUBMISSION}
     * <li> {@link TransactionStatus#TC_REJECTED}
     * <li> {@link TransactionStatus#TC_DENIED}
     * </ul>
     * 
     * If the check is part of a group (i.e., the check was created with one or more
     * secondary payees), then every check in the group must be deletable for this
     * check to be deletable.
     * @return <code>true</code> if this check can be deleted, else <code>false</code>
     */
    public boolean isDeletable() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isDeletable();
    }
    
    /**
     * Tests whether the check can be deleted.
     * @return <code>true</code> if this check can be deleted, else <code>false</code>
     * @deprecated use Deletable instead
     */
    @java.lang.Deprecated
    public boolean isDeleteable() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isDeleteable();
    }
    
    public boolean isDeniable() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).isDeniable();
    }
    
    public boolean isDenied() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).isDenied();
    }
    
    /**
     * Tests whether this check can be edited.  For the check to be editable, it must have
     * one of the following statuses:
     * <ul>
     * <li> {@link TransactionStatus#TC_DRAFT}
     * <li> {@link TransactionStatus#TC_PENDINGAPPROVAL}
     * <li> {@link TransactionStatus#TC_AWAITINGSUBMISSION}
     * <li> {@link TransactionStatus#TC_REJECTED}
     * </ul>
     * @return <code>true</code> if this check can be edited, else <code>false</code>
     */
    public boolean isEditable() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isEditable();
    }
    
    /**
     * Tests whether this check belongs to a CheckGroup (optionally, the number of CheckGroup members is considered as well).
     * @param acceptSingleMemberGroups if <code>true</code>, method will return true even if this check is the only member of
     * the CheckGroup, otherwise if <code>false</code> and this check is only member of the group, will return false.
     * @return <code>true</code> if this check is a member of a CheckGroup, accounting for the passed parameter, else <code>false</code>
     */
    public boolean isGroupMember(boolean acceptSingleMemberGroups) {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isGroupMember(acceptSingleMemberGroups);
    }
    
    /**
     * Gets the value of the IsPrimary field.
     * Indicates if this is the primary EFT record for the contact
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIsPrimary() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(ISPRIMARY_PROP.get());
    }
    
    public boolean isLastSubmittedCheck() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).isLastSubmittedCheck();
    }
    
    /**
     * Tests whether this check was manually entered.
     * @return <code>true</code> if this is a manually entered check, else <code>false</code>
     */
    public boolean isManualCheck() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isManualCheck();
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
     * Gets the value of the PendEscalationForBulk field.
     * Only escalate as part of a BulkInvoice.
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isPendEscalationForBulk() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isPendEscalationForBulk();
    }
    
    /**
     * Tests whether this check is the primary check in a check group or if the
     * check does not belong to a check group at all, in which case it is always
     * a primary check.
     * @return <code>true</code> if this is a primary check, as per the description above, else <code>false</code>
     */
    public boolean isPrimary() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isPrimary();
    }
    
    public boolean isRecurring() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).isRecurring();
    }
    
    /**
     * Returns whether this check can be reissued; i.e., it belongs to a CheckGroup and either Check.Voidable or
     * Check.Stoppable evaluate to true.
     * @return <code>true</code> if this check can be reissued, else <code>false</code>
     */
    public boolean isReissueable() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isReissueable();
    }
    
    /**
     * Tests if the check is a denied check that can be resubmitted as is
     * @return true if check can be resubmitted, else false
     */
    public boolean isResubmittable() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isResubmittable();
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
     * True if the scheduled send date of this check is after today.
     */
    public boolean isScheduledSendDateInFuture() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isScheduledSendDateInFuture();
    }
    
    /**
     * True if a stop payment can be issued against this check. The
     * check status must be one of the following:
     * <ul>
     * <li> {@link TransactionStatus#TC_REQUESTING}
     * <li> {@link TransactionStatus#TC_REQUESTED}
     * <li> {@link TransactionStatus#TC_ISSUED}
     * <li> {@link TransactionStatus#TC_NOTIFYING}
     * </ul>
     * If this check belongs to a check group, then all others checks in the group
     * must be stoppable or already voided/stopped.
     * @return <code>true</code> if this check can be stopped, else <code>false</code>
     */
    public boolean isStoppable() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isStoppable();
    }
    
    /**
     * Tests whether this check can be stopped and reissued.  Note that this is a less strict
     * test than isStoppable(), since it does not verify the status of other checks in the
     * CheckGroup; because the check will be reissued, the payment associated with the
     * CheckGroup will be left unchanged, so no check is necessary.
     * @return <code>true</code> if this check can be stopped and reissued, else </code>false</code>
     */
    public boolean isStoppableForReissue() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isStoppableForReissue();
    }
    
    /**
     * Returns true if the status indicates the check has been stopped.
     * Specifically, if the status is one of the following:
     * <ul>
     * <li> {@link TransactionStatus#TC_PENDINGSTOP}
     * <li> {@link TransactionStatus#TC_STOPPED}
     * </ul>
     */
    public boolean isStopped() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isStopped();
    }
    
    public boolean isSubmitted() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).isSubmitted();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    /**
     * Tests whether this check can be transferred to another claim.  This check
     * is transferable if the following are true:
     * 
     * <ul>
     * <li> it is not a recurring check
     * <li> it does not belong to a check group
     * <li> its status is one of the following:
     * <ul>
     * <li> {@link TransactionStatus#TC_REQUESTING}
     * <li> {@link TransactionStatus#TC_REQUESTED}
     * <li> {@link TransactionStatus#TC_NOTIFYING}
     * <li> {@link TransactionStatus#TC_ISSUED}
     * <li> {@link TransactionStatus#TC_CLEARED}
     * </ul>
     * </ul>
     * @return <code>true</code> if this check can be transferred to a new claim, else </code>false</code>
     */
    public boolean isTransferable() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isTransferable();
    }
    
    /**
     * Tests whether this check has been transferred to another claim.
     * That is, its status is one of the following:
     * <ul>
     * <li> {@link TransactionStatus#TC_PENDINGTRANSFER}
     * <li> {@link TransactionStatus#TC_TRANSFERRED}
     * </ul>
     * @return <code>true</code> if this check has been transferred, else </code>false</code>
     */
    public boolean isTransferred() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isTransferred();
    }
    
    public boolean isUnsubmitted() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).isUnsubmitted();
    }
    
    /**
     * True if this check is can be voided. The check status must be one
     * of the following:
     * <ul>
     * <li> {@link TransactionStatus#TC_REQUESTING}
     * <li> {@link TransactionStatus#TC_REQUESTED}
     * <li> {@link TransactionStatus#TC_ISSUED}
     * <li> {@link TransactionStatus#TC_NOTIFYING}
     * <li> {@link TransactionStatus#TC_CLEARED}
     * </ul>
     * If this check belongs to a check group, then all others checks in the group
     * must be voidable or already voided/stopped.
     * @return <code>true</code> if this check can be voided, else <code>false</code>
     */
    public boolean isVoidable() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isVoidable();
    }
    
    /**
     * Tests whether this check can be voided and reissued.  Note that this is a less strict
     * test than isVoidable(), since it does not verify the status of other checks in the
     * CheckGroup; because the check will be reissued, the payment associated with the
     * CheckGroup will be left unchanged, so no check is necessary.
     * @return <code>true</code> if this check can be voided and reissued, else </code>false</code>
     */
    public boolean isVoidableForReissue() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isVoidableForReissue();
    }
    
    /**
     * Returns true if the status indicates the check has been voided.
     * Specifically, if the status is one of the following:
     * <ul>
     * <li> {@link TransactionStatus#TC_PENDINGVOID}
     * <li> {@link TransactionStatus#TC_VOIDED}
     * </ul>
     */
    public boolean isVoided() {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).isVoided();
    }
    
    public void linkAsRecurringCheck(entity.Check check) {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).linkAsRecurringCheck(check);
    }
    
    public void logDelete() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).logDelete();
    }
    
    /**
     * Writes a debug log message about the check being Stopped.
     * @deprecated this message is now logged internally in {@link #coreStopCheck}
     */
    @java.lang.Deprecated
    public void logStop() {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).logStop();
    }
    
    public void logTransfer() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).logTransfer();
    }
    
    /**
     * Writes a debug log message about this check being Voided.
     * @deprecated this message is now logged internally in {@link #coreVoidCheck}
     */
    @java.lang.Deprecated
    public void logVoid() {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).logVoid();
    }
    
    public void markAsApproved() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).markAsApproved();
    }
    
    public void markAsPendingApproval() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).markAsPendingApproval();
    }
    
    public void markAsRejected() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).markAsRejected();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    /**
     * When transfering a Check in Gosu outside the UI, this is the final call
     * to update the old and new Checks, including the updating of Taccounts.
     * Before calling this method, a new ReserveLine on the target claim can
     * be chosen/set for each payment of newCheck. After this method is called,
     * the Payments on the old and new Checks cannot be modified.
     * <p>
     * See also {CheckUtil#transferCheck( Check newCheck, Check oldCheck, Location currentLocation )}
     * for use in the UI instead of this method.
     * <p>
     * Note that any Final payments on the newCheck will attempt to close their
     * target exposure or claim.
     * <p>
     * Methods to call when Transferring a Check:
     * <ol>
     * <li>oldCheck.createCheckForTransfer() - returns the newCheck</li>
     * <li>newCheck.updateCheckForTransfer(Claim newClaim, Check oldCheck)</li>
     * <li>CheckUtil#transferCheck( newCheck, oldCheck, Location currentLocation )
     *  OR newCheck.prepareForCommitForTransfer(Check oldCheck)</li>
     * </ol>
     * @param oldCheck the original check object representing the check that is being transferred
     * @throws IllegalArgumentException if the amount or transaction statuses are changed.
     * @return List of ValidationExecutionResult objects with any validation
     *  errors or warnings from the Claim or Exposure Closed Validation rules, resulting
     *  from any attempt to close the Exposure or Claim of Final payments.
     */
    public java.util.List<gw.api.validation.ValidationExecutionResult> prepareForCommitForTransfer(entity.Check oldCheck) {
      return ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).prepareForCommitForTransfer(oldCheck);
    }
    
    public java.util.List<gw.api.validation.ValidationExecutionResult> prepareForTransfer(entity.Check oldCheck) throws com.guidewire.pl.system.exception.InsufficientAuthorityException, com.guidewire.pl.system.exception.WorkflowValidationException {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).prepareForTransfer(oldCheck);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    public void recalculatePortionAmounts() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).recalculatePortionAmounts();
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
     * Removes the given element from the CheckRptArray array. This is achieved by marking the element for removal.
     */
    public void removeFromCheckRptArray(entity.CheckRpt element) {
      __getInternalInterface().removeArrayElement(CHECKRPTARRAY_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the CheckRptArray array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromCheckRptArray(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(CHECKRPTARRAY_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Deductions array. This is achieved by marking the element for removal.
     */
    public void removeFromDeductions(entity.Deduction element) {
      __getInternalInterface().removeArrayElement(DEDUCTIONS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Deductions array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromDeductions(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(DEDUCTIONS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Payees array. This is achieved by marking the element for removal.
     */
    public void removeFromPayees(entity.CheckPayee element) {
      __getInternalInterface().removeArrayElement(PAYEES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Payees array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromPayees(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PAYEES_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the Payments array. This is achieved by marking the element for removal.
     */
    public void removeFromPayments(entity.Payment element) {
      __getInternalInterface().removeArrayElement(PAYMENTS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the Payments array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromPayments(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(PAYMENTS_PROP.get(), elementID);
    }
    
    /**
     * Removes the given element from the ServiceRequestInvoices array. This is achieved by marking the element for removal.
     */
    public void removeFromServiceRequestInvoices(entity.ServiceRequestInvoice element) {
      __getInternalInterface().removeArrayElement(SERVICEREQUESTINVOICES_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ServiceRequestInvoices array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromServiceRequestInvoices(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SERVICEREQUESTINVOICES_PROP.get(), elementID);
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Escalates the Check's status to Requesting. Which means the following:
     * <ol>
     * <li> Check is moved to "requesting" status
     * <li> All Payments are moved to "submitting" unless they've already been submitted (I think this the case when a check is transferred?)
     * <li> Zeroing Reserves are created
     * <li> If configured to do so, an attempt is made to close the Exposure. If this fails, an activity is created saying the close was not possible and giving the validation errors.
     * <li> If the Exposure closes and it was the only open exposure, the claim is closed (if configured to close claim after final payment)
     * <li> Transaction post setup rules are executed on this transaction set because new Reserves may have been created
     * <li> A reminder activity is created if this check is the penultimate in a recurrence
     * </ol>
     * Returns without doing anything if the check is not in AWAITINGSUBMISSION state.
     * @throws IllegalArgumentException if the check is not scheduled to be sent today
     */
    public void requestCheck() {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).requestCheck();
    }
    
    public void requestCheckWithoutExecutingSubmissionActions() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).requestCheckWithoutExecutingSubmissionActions();
    }
    
    public void resetToDraft() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).resetToDraft();
    }
    
    /**
     * Called when check is being resubmitted.  This action does not require approval.
     * @throws IllegalStateException if the check status is not one of the
     *          following: TransactionStatus.TC_DENIED
     * @throws com.guidewire.pl.system.exception.InsufficientPermissionException is the financials version parameter is read-only
     */
    public void resubmit() throws com.guidewire.pl.system.exception.InsufficientPermissionException {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).resubmit();
    }
    
    public void retire() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).retire();
    }
    
    public void retireDeductions() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).retireDeductions();
    }
    
    public void retireGroup() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).retireGroup();
    }
    
    public void retirePayments() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).retirePayments();
    }
    
    public void retirePortion() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).retirePortion();
    }
    
    /**
     * Sets the value of the AccountName field.
     */
    public void setAccountName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(ACCOUNTNAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BankAccount field.
     */
    public void setBankAccount(typekey.BankAccount value) {
      __getInternalInterface().setFieldValue(BANKACCOUNT_PROP.get(), value);
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
     * Associates a BulkInvoiceItem with the current check.
     * @param item The BulkInvoiceItem to be set of BulkInvoiceItemInfo
     */
    public void setBulkInvoiceItem(entity.BulkInvoiceItem item) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setBulkInvoiceItem(item);
    }
    
    /**
     * Sets the value of the BulkInvoiceItemInfo field.
     */
    public void setBulkInvoiceItemInfo(entity.BulkInvoiceItemInfo value) {
      __getInternalInterface().setFieldValue(BULKINVOICEITEMINFO_PROP.get(), value);
    }
    
    public void setBulkInvoiceItemInfoID(gw.pl.persistence.core.Key value) {
      setFieldValue(BULKINVOICEITEMINFO_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CheckBatching field.
     */
    public void setCheckBatching(typekey.CheckBatching value) {
      __getInternalInterface().setFieldValue(CHECKBATCHING_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CheckInstructions field.
     */
    public void setCheckInstructions(typekey.CheckHandlingInstructions value) {
      __getInternalInterface().setFieldValue(CHECKINSTRUCTIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CheckNumber field.
     */
    public void setCheckNumber(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(CHECKNUMBER_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setCheckRpt(entity.CheckRpt value) {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).setCheckRpt(value);
    }
    
    /**
     * Sets the value of the CheckRptArray field.
     */
    public void setCheckRptArray(entity.CheckRpt[] value) {
      __getInternalInterface().setFieldValue(CHECKRPTARRAY_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setCheckRptID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).setCheckRptID(value);
    }
    
    /**
     * Sets the value of the CheckSet field.
     */
    public void setCheckSet(entity.CheckSet value) {
      __getInternalInterface().setFieldValue(CHECKSET_PROP.get(), value);
    }
    
    public void setCheckSetID(gw.pl.persistence.core.Key value) {
      setFieldValue(CHECKSET_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CheckType field.
     */
    public void setCheckType(typekey.CheckType value) {
      __getInternalInterface().setFieldValue(CHECKTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimContact field.
     */
    public void setClaimContact(entity.ClaimContact value) {
      __getInternalInterface().setFieldValue(CLAIMCONTACT_PROP.get(), value);
    }
    
    public void setClaimContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMCONTACT_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * 
     * @param claimInfo 
     */
    public void setClaimInfo(entity.ClaimInfo claimInfo) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setClaimInfo(claimInfo);
    }
    
    /**
     * Sets the ExchangeRate entity for ClaimAmount to ReportingAmount translation
     * on all Payments on this Check. This triggers recalculation of the reporting amounts for the {@link
     * Payment}s and claim and reporting amounts on the {@link entity.CheckPortion} (if applicable). This must be a primary check.
     * @param rateEntity the ExchangeRate entity to set for all payments in this check
     */
    public void setClaimToReportingExchangeRateEntity(entity.ExchangeRate rateEntity) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setClaimToReportingExchangeRateEntity(rateEntity);
    }
    
    /**
     * Claimant the check is being written for, as a Contact.
     * @param value 
     */
    public void setClaimant(entity.Contact value) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setClaimant(value);
    }
    
    public void setClaimantID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).setClaimantID(value);
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
     * The Currency of this check, and all its Payments. This must be a primary check.
     * @param currency 
     */
    public void setCurrency(typekey.Currency currency) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setCurrency(currency);
    }
    
    /**
     * Sets the value of the DateOfService field.
     */
    public void setDateOfService(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEOFSERVICE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DeductionType field.
     */
    public void setDeductionType(typekey.DeductionType value) {
      __getInternalInterface().setFieldValue(DEDUCTIONTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Deductions field.
     */
    public void setDeductions(entity.Deduction[] value) {
      __getInternalInterface().setFieldValue(DEDUCTIONS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DeliveryMethod field.
     */
    public void setDeliveryMethod(typekey.DeliveryMethod value) {
      __getInternalInterface().setFieldValue(DELIVERYMETHOD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the EnteredTime field.
     */
    public void setEnteredTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(ENTEREDTIME_PROP.get(), value);
    }
    
    /**
     * 
     * @param exchangeRate 
     * @deprecated use {@link #setTransToClaimExchangeRateEntityRate(BigDecimal)} instead
     */
    @java.lang.Deprecated
    public void setExchangeRateEntityRate(java.math.BigDecimal exchangeRate) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setExchangeRateEntityRate(exchangeRate);
    }
    
    /**
     * Sets the value of the Group field.
     */
    public void setGroup(entity.CheckGroup value) {
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
     */
    public void setIssueDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(ISSUEDATE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
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
     * 
     * @param value 
     * @deprecated use {@link #setOverrideTransToReservingExchangeRate(boolean)} instead
     */
    @java.lang.Deprecated
    public void setOverrideExchangeRate(boolean value) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setOverrideExchangeRate(value);
    }
    
    /**
     * Triggers recalculation of the claim and reporting amounts for the {@link Payment}s and {@link entity.CheckPortion} (if
     * applicable). This must be a primary check.
     * @param value 
     */
    public void setOverrideTransToClaimExchangeRate(boolean value) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setOverrideTransToClaimExchangeRate(value);
    }
    
    /**
     * Specifies whether the transaction-to-reserving exchange rate shall be
     * overridden for the payments on this check. If changing from false to true,
     * a new manual exchange rate is created. If changing from true to false, the
     * manual exchange rate is discarded and replaced with the current market
     * rate.
     * @param value 
     */
    public void setOverrideTransToReservingExchangeRate(boolean value) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setOverrideTransToReservingExchangeRate(value);
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
     * Sets the value of the Payees field.
     */
    public void setPayees(entity.CheckPayee[] value) {
      __getInternalInterface().setFieldValue(PAYEES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PaymentMethod field.
     */
    public void setPaymentMethod(typekey.PaymentMethod value) {
      __getInternalInterface().setFieldValue(PAYMENTMETHOD_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Payments field.
     */
    public void setPayments(entity.Payment[] value) {
      __getInternalInterface().setFieldValue(PAYMENTS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PendEscalationForBulk field.
     */
    public void setPendEscalationForBulk(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(PENDESCALATIONFORBULK_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Portion field.
     */
    public void setPortion(entity.CheckPortion value) {
      __getInternalInterface().setFieldValue(PORTION_PROP.get(), value);
    }
    
    public void setPortionID(gw.pl.persistence.core.Key value) {
      setFieldValue(PORTION_PROP.get(), value);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the RecurringCheck field.
     */
    public void setRecurringCheck(entity.RecurringCheck value) {
      __getInternalInterface().setFieldValue(RECURRINGCHECK_PROP.get(), value);
    }
    
    public void setRecurringCheckID(gw.pl.persistence.core.Key value) {
      setFieldValue(RECURRINGCHECK_PROP.get(), value);
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
    public void setReportableAmount(gw.api.financials.CurrencyAmount value) {
      __getInternalInterface().setFieldValue(REPORTABLEAMOUNT_PROP.get(), value);
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
     */
    public void setScheduledSendDate(java.util.Date value) {
      __getInternalInterface().setFieldValue(SCHEDULEDSENDDATE_PROP.get(), value);
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
     * Sets the value of the ServiceRequestInvoices field.
     */
    public void setServiceRequestInvoices(entity.ServiceRequestInvoice[] value) {
      __getInternalInterface().setFieldValue(SERVICEREQUESTINVOICES_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setStatus(typekey.TransactionStatus value) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setStatus(value);
    }
    
    /**
     * Sets the ExchangeRate entity for TransactionAmount to ClaimAmount translation
     * on all Payments on this Check. This triggers recalculation of the claim and reporting amounts for the {@link
     * Payment}s and {@link entity.CheckPortion} (if applicable). This must be a primary check.
     * @param rateEntity the ExchangeRate entity to set for all payments in this check
     */
    public void setTransToClaimExchangeRateEntity(entity.ExchangeRate rateEntity) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setTransToClaimExchangeRateEntity(rateEntity);
    }
    
    /**
     * The exchange rate in the ExchangeRate entity for TransactionAmount to ClaimAmount translation
     * used for all Payments on this Check. See {@link #getOverrideTransToClaimExchangeRate()}
     * When in override mode, modify this property to change the exchange rate for the Check. This must be a primary
     * check.
     * @param exchangeRate 
     */
    public void setTransToClaimExchangeRateEntityRate(java.math.BigDecimal exchangeRate) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setTransToClaimExchangeRateEntityRate(exchangeRate);
    }
    
    /**
     * Sets the transaction-to-reserving exchange rate entity on all of the
     * payments on this check, and recomputes the reserving, claim, and
     * reporting amounts of all of the payments and fixed check portions
     * accordingly.
     * @param entity 
     */
    public void setTransToReservingExchangeRate(entity.ExchangeRate entity) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setTransToReservingExchangeRate(entity);
    }
    
    /**
     * Creates a new manual exchange rate entity with the given numeric rate, sets
     * it as the transaction-to-reserving exchange rate entity on all of the
     * payments on this check, and recomputes the reserving, claim, and reporting
     * amounts of all of the payments and fixed check portions accordingly.
     * @param rate 
     */
    public void setTransToReservingExchangeRateRate(java.math.BigDecimal rate) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).setTransToReservingExchangeRateRate(rate);
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
     * Stops and reissues a check, deferring to {@link Check#coreStopAndReissue}. Customers may change the implementation
     * of this method.
     * Note: this method has been changed to take a Check, rather than a Key
     * @param oldCheck 
     */
    public void stopAndReissue(entity.Check oldCheck) {
      ((gw.api.financials.CancelCheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CancelCheckMethods")).stopAndReissue(oldCheck);
    }
    
    /**
     * Stops a check, deferring to {@link entity.Check#coreStopCheck}. Customers may change the implementation of this method.
     */
    public void stopCheck() {
      ((gw.api.financials.CancelCheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CancelCheckMethods")).stopCheck();
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
    
    public void uncancelCheck() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).uncancelCheck();
    }
    
    /**
     * Sets the claim of the payments, checkset, and claimcontacts of this check to the claim given. Also, for every
     * payment:
     * <ul>
     *   <li>
     *     Sets the exposure to the first matching exposure (by PrimaryCoverage and LossParty) on the given claim, if
     *     one exists. Otherwise, sets it to null.
     *   </li>
     *   <li>
     *     Sets the ReserveLine to the best matching Reserve Line on the given claim. Otherwise, sets it to null.
     *   </li>
     * </ul>
     * <p>
     * Methods to call when Transferring a Check:
     * <ol>
     * <li>oldCheck.createCheckForTransfer() - returns the newCheck</li>
     * <li>newCheck.updateCheckForTransfer(Claim newClaim, Check oldCheck)</li>
     * <li>CheckUtil#transferCheck( newCheck, oldCheck, Location currentLocation )
     *  OR newCheck.prepareForCommitForTransfer(Check oldCheck)</li>
     * </ol>
     * @param newClaim the claim to which this check is being transferred
     * @param oldCheck the original check object representing the check that is being transferred
     * @throws IllegalArgumentException if the original check id null
     */
    public void updateCheckForTransfer(entity.Claim newClaim, entity.Check oldCheck) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).updateCheckForTransfer(newClaim, oldCheck);
    }
    
    /**
     * Sets the claim of the payments, checkset, and claimcontacts of this check to the claim on this check. Also, for
     * every payment:
     * <ul>
     *   <li>
     *     Sets the exposure to the first matching exposure (by PrimaryCoverage and LossParty) on the given claim, if
     *     one exists. Otherwise, sets it to null.
     *   </li>
     *   <li>
     *     Sets the ReserveLine to the best matching Reserve Line on the given claim. Otherwise, sets it to null. The
     *     targetReservingCurrency is included in the matching logic.
     *   </li>
     * </ul>
     * <p>
     * Methods to call when Transferring a Check:
     * <ol>
     * <li>oldCheck.createCheckForTransfer() - returns the newCheck</li>
     * <li>newCheck.updateCheckForTransfer(Claim newClaim, Check oldCheck)</li>
     * <li>CheckUtil#transferCheck( newCheck, oldCheck, Location currentLocation )
     *  OR newCheck.prepareForCommitForTransfer(Check oldCheck)</li>
     * </ol>
     * @param newClaim the claim to which this check is being transferred
     * @param oldCheck the original check object representing the check that is being transferred
     * @param targetReservingCurrency the Reserving Currency to be used for matching the payment Reserve Lines on the new
     *                                Claim.
     * @throws IllegalArgumentException if the original check id null
     */
    public void updateCheckForTransfer(entity.Claim newClaim, entity.Check oldCheck, typekey.Currency targetReservingCurrency) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).updateCheckForTransfer(newClaim, oldCheck, targetReservingCurrency);
    }
    
    /**
     * Updates the status of a check.
     * <p/>
     * Allowed check status are "issued", "cleared", "voided", and "stopped".  The "Issued" and "Cleared" statuses
     * are not legal options if this check is part of a multi-payee check group that has been voided or stopped.
     * <p/>
     * If the check status is changed to "voided" or "stopped", the status of "pending void" or "pending stop"
     * payments are updated as well.
     * <p/>
     * checkNumber and issueDate is used when updating the check status to "issued".
     * For other updates, these two fields can be left as NULL.
     * <p/>
     * Note that if the check is pending stop or pending void and the new status
     * is issued or cleared, the statuses of the check and its payments are updated
     * and a warning activity is created and assigned to the user who attempted to
     * void or stop the check so that the user knows that the check was not voided.
     * <p/>
     * If the Check is linked to a BulkInvoiceItem (check.Bulked == true), updating the Check status will also
     * update the BulkInvoiceItem status, if appropriate.
     * @param checkNumber the checkNumber to update to
     * @param issueDate the issueDate to updated to
     * @param status the status to update to
     */
    public void updateCheckStatus(java.lang.String checkNumber, java.util.Calendar issueDate, typekey.TransactionStatus status) {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).updateCheckStatus(checkNumber, issueDate, status);
    }
    
    public void updateDenormalizedCheckPayeeFields() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).updateDenormalizedCheckPayeeFields();
    }
    
    public void updatePendingCancelPaymentStatuses(typekey.TransactionStatus status) {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).updatePendingCancelPaymentStatuses(status);
    }
    
    /**
     * Updates this check's reportable amount to match the gross amount. Also computes and sets deductions, if any. Any
     * already existing deductions are replaced.
     */
    public void updateReportableAmountAndDeductions() throws com.guidewire.cc.domain.financials.adapter.exception.DeductionAdapterException {
      ((gw.cc.financials.check.entity.Check)__getDelegateManager().getImplementation("gw.cc.financials.check.entity.Check")).updateReportableAmountAndDeductions();
    }
    
    public void updateStatus() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).updateStatus();
    }
    
    /**
     * Performs various validation tests on the payees for a check.  These include whether the same payee is used more than once on a check, and whether
     * the check has more than one vendor as a payee.  If any problems are found, a UserDisplayableException with the proper error message is thrown.
     */
    public void validateCheckPayees() {
      ((gw.api.financials.CheckValidationMethods)__getDelegateManager().getImplementation("gw.api.financials.CheckValidationMethods")).validateCheckPayees();
    }
    
    public void verifyMultiplePaymentsParameterObeyed() throws com.guidewire.cc.system.exception.MultiplePaymentsException {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).verifyMultiplePaymentsParameterObeyed();
    }
    
    public void verifyStatusUnchanged() {
      ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).verifyStatusUnchanged();
    }
    
    /**
     * Voids and reissues a check, deferring to {@link entity.Check#coreVoidAndReissue}. Customers may change the implementation
     * of this method.
     * Note: this method has been changed to take a Check, rather than a Key
     * @param oldCheck 
     */
    public void voidAndReissue(entity.Check oldCheck) {
      ((gw.api.financials.CancelCheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CancelCheckMethods")).voidAndReissue(oldCheck);
    }
    
    /**
     * Voids a check, deferring to {@link Check#coreVoidCheck}. Customers may change the implementation of this method.
     */
    public void voidCheck() {
      ((gw.api.financials.CancelCheckMethods)__getDelegateManager().getImplementation("gw.api.financials.CancelCheckMethods")).voidCheck();
    }
    
    public entity.Reserve[] zeroReserves() {
      return ((com.guidewire.cc.domain.financials.check.impl.CheckInternal)__getDelegateManager().getImplementation("com.guidewire.cc.domain.financials.check.impl.CheckInternal")).zeroReserves();
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.financials.check.impl.CheckInternal", "com.guidewire.cc.domain.financials.check.impl.CheckImpl");
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
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.cc.domain.financials.check.impl.CheckImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.cc.domain.financials.check.impl.CheckImpl");
    config.put("gw.api.financials.CancelCheckMethods", "gw.entity.CancelCheckMethodsImpl");
    config.put("gw.api.financials.CheckMethods", "gw.api.financials.CheckMethodsImpl");
    config.put("gw.api.financials.CheckValidationMethods", "gw.api.financials.CheckValidationMethodsImpl");
    config.put("gw.api.financials.DeleteCheckMethods", "gw.entity.DeleteCheckMethodsImpl");
    config.put("gw.cc.contact.entity.EFTDataDelegate", "com.guidewire.cc.domain.contact.impl.EFTDataDelegateImpl");
    config.put("gw.cc.financials.check.entity.Check", "com.guidewire.cc.domain.financials.check.impl.CheckImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Check.class, config);
    com.guidewire._generated.entity.CheckInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Check, com.guidewire._generated.entity.CheckInternal>() {
      public java.lang.Object getImplementation(entity.Check bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.CheckInternal getInternalInterface(entity.Check bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Check newEmptyInstance() {
        return new entity.Check((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}