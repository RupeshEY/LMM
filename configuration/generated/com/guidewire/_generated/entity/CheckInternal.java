package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Check.eti;Check.eix;Check.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CheckInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.EFTDataDelegateInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.financials.check.impl.CheckInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.api.financials.CancelCheckMethods, gw.api.financials.CheckMethods, gw.api.financials.CheckValidationMethods, gw.api.financials.DeleteCheckMethods, gw.cc.financials.check.entity.Check {
  java.lang.String CHECKADDED_EVENT = "CheckAdded";
  
  java.lang.String CHECKCHANGED_EVENT = "CheckChanged";
  
  java.lang.String CHECKISSUED_EVENT = "CheckIssued";
  
  java.lang.String CHECKREMOVED_EVENT = "CheckRemoved";
  
  java.lang.String CHECKSTATUSCHANGED_EVENT = "CheckStatusChanged";
  
  java.lang.String CHECKSTOPPED_EVENT = "CheckStopped";
  
  java.lang.String CHECKSUBMITTED_EVENT = "CheckSubmitted";
  
  java.lang.String CHECKTRANSFERRED_EVENT = "CheckTransferred";
  
  java.lang.String CHECKVOIDED_EVENT = "CheckVoided";
  
  /**
   * Adds the given element to the CheckRptArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCheckRptArray(entity.CheckRpt element);
  
  
  /**
   * Adds the given element to the Deductions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDeductions(entity.Deduction element);
  
  
  /**
   * Adds the given element to the Payees array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPayees(entity.CheckPayee element);
  
  
  /**
   * Adds the given element to the Payments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPayments(entity.Payment element);
  
  
  /**
   * Adds the given element to the ServiceRequestInvoices array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServiceRequestInvoices(entity.ServiceRequestInvoice element);
  
  
  /**
   * Gets the value of the BankAccount field.
   * Source bank account.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BankAccount getBankAccount();
  
  
  /**
   * Gets the value of the BulkInvoiceItemInfo field.
   * If this check was created to act as a record-keeper for a bulk invoice item, this is the item it references.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoiceItemInfo getBulkInvoiceItemInfo();
  
  
  public gw.pl.persistence.core.Key getBulkInvoiceItemInfoID();
  
  
  /**
   * Gets the value of the CheckBatching field.
   * How the check should be batched for sending.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CheckBatching getCheckBatching();
  
  
  /**
   * Gets the value of the CheckInstructions field.
   * Special handling instructions for the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CheckHandlingInstructions getCheckInstructions();
  
  
  /**
   * Gets the value of the CheckNumber field.
   * The check or EFT identifier.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckNumber();
  
  
  /**
   * Gets the value of the CheckRpt field.
   * The calculated data for this check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckRpt getCheckRpt();
  
  
  /**
   * Gets the value of the CheckRptArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckRpt[] getCheckRptArray();
  
  
  public gw.pl.persistence.core.Key getCheckRptID();
  
  
  /**
   * Gets the value of the CheckSet field.
   * CheckSet this Check belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckSet getCheckSet();
  
  
  public gw.pl.persistence.core.Key getCheckSetID();
  
  
  /**
   * Gets the value of the CheckType field.
   * Role of the check in the check group (primary or secondary).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CheckType getCheckType();
  
  
  /**
   * Gets the value of the Claim field.
   * The related claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimContact field.
   * Claimant the check is being written for, as a ClaimContact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Comments field.
   * Comments about the check, such as a reason it was voided.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the DateOfService field.
   * Date that the service was performed (if this check is for a service).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfService();
  
  
  /**
   * Gets the value of the DeductionType field.
   * Deduction type for secondary checks.  Always NULL for primary checks.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DeductionType getDeductionType();
  
  
  /**
   * Gets the value of the Deductions field.
   * Any deductions related to the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Deduction[] getDeductions();
  
  
  /**
   * Gets the value of the DeliveryMethod field.
   * Requested delivery method.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DeliveryMethod getDeliveryMethod();
  
  
  /**
   * Gets the value of the EnteredTime field.
   * The time the check was created. This is different from CreateTime, which is the time it was stored in the system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEnteredTime();
  
  
  /**
   * Gets the value of the Group field.
   * CheckGroup this check belongs to, if it's part of a multi-payee check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckGroup getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the InvoiceNumber field.
   * Invoice number associated with the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInvoiceNumber();
  
  
  /**
   * Gets the value of the IssueDate field.
   * Date the check was issued.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getIssueDate();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the MailTo field.
   * Name of the person/company to whom the check should be mailed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMailTo();
  
  
  /**
   * Gets the value of the MailToAddress field.
   * @deprecated Address of the person/company to whom the check should be mailed.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMailToAddress();
  
  
  /**
   * Gets the value of the MailingAddress field.
   * Address of the person/company to whom the check should be mailed. This represents an Address entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getMailingAddress();
  
  
  public gw.pl.persistence.core.Key getMailingAddressID();
  
  
  /**
   * Gets the value of the Memo field.
   * Memo to include on the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMemo();
  
  
  /**
   * Gets the value of the PayTo field.
   * Pay to the order of.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPayTo();
  
  
  /**
   * Gets the value of the PayToDenorm field.
   * denorm field for PayTo
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPayToDenorm();
  
  
  /**
   * Gets the value of the Payees field.
   * Recipients of the payment; there must be at least one. If there are multiple, each is a 'joint' payee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckPayee[] getPayees();
  
  
  /**
   * Gets the value of the PaymentMethod field.
   * Requested payment method for all payments in the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentMethod getPaymentMethod();
  
  
  /**
   * Gets the value of the Payments field.
   * Payments on the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Payment[] getPayments();
  
  
  /**
   * Gets the value of the Portion field.
   * The amount of a multi-payee check applicable to this check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CheckPortion getPortion();
  
  
  public gw.pl.persistence.core.Key getPortionID();
  
  
  /**
   * Gets the value of the RecurringCheck field.
   * The recurring check entity, if any, associated with this check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecurringCheck getRecurringCheck();
  
  
  public gw.pl.persistence.core.Key getRecurringCheckID();
  
  
  /**
   * Gets the value of the Reportability field.
   * Whether the payment should be reported to the IRS as income.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReportabilityType getReportability();
  
  
  /**
   * Gets the value of the ReportableAmount field.
   * Reportable amount of the check in the transaction currency. Used by the BackupWithholdingCalculator as the amount of the check reportable to the IRS, from which it calculates backup withholding Deductions. It is editable in the UI.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReportableAmount();
  
  
  /**
   * Gets the value of the ScheduledSendDate field.
   * Date that the check is scheduled to be sent.  Also used to determine if the check amount is included in Future Payments (tomorrow or later).  Should only be modified in the UI or PreSetup rules.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getScheduledSendDate();
  
  
  /**
   * Gets the value of the ServicePdEnd field.
   * End date of the service period for the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServicePdEnd();
  
  
  /**
   * Gets the value of the ServicePdStart field.
   * Start date of the service period for the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServicePdStart();
  
  
  /**
   * Gets the value of the ServiceRequestInvoices field.
   * ServiceRequestInvoices related to this check. All linked invoices are expected to have the same service request specialist and currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestInvoice[] getServiceRequestInvoices();
  
  
  /**
   * Gets the value of the Status field.
   * Status of the check (issued, voided, cleared, and so on). Do not update directly. Use methods to initiate operations, or use updateCheckStatus() method.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionStatus getStatus();
  
  
  /**
   * Gets the value of the PendEscalationForBulk field.
   * Only escalate as part of a BulkInvoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPendEscalationForBulk();
  
  
  /**
   * Removes the given element from the CheckRptArray array. This is achieved by marking the element for removal.
   */
  public void removeFromCheckRptArray(entity.CheckRpt element);
  
  
  /**
   * Removes the given element from the CheckRptArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCheckRptArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Deductions array. This is achieved by marking the element for removal.
   */
  public void removeFromDeductions(entity.Deduction element);
  
  
  /**
   * Removes the given element from the Deductions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDeductions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Payees array. This is achieved by marking the element for removal.
   */
  public void removeFromPayees(entity.CheckPayee element);
  
  
  /**
   * Removes the given element from the Payees array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPayees(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Payments array. This is achieved by marking the element for removal.
   */
  public void removeFromPayments(entity.Payment element);
  
  
  /**
   * Removes the given element from the Payments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPayments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ServiceRequestInvoices array. This is achieved by marking the element for removal.
   */
  public void removeFromServiceRequestInvoices(entity.ServiceRequestInvoice element);
  
  
  /**
   * Removes the given element from the ServiceRequestInvoices array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServiceRequestInvoices(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the BankAccount field.
   */
  public void setBankAccount(typekey.BankAccount value);
  
  
  /**
   * Sets the value of the BulkInvoiceItemInfo field.
   */
  public void setBulkInvoiceItemInfo(entity.BulkInvoiceItemInfo value);
  
  
  public void setBulkInvoiceItemInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CheckBatching field.
   */
  public void setCheckBatching(typekey.CheckBatching value);
  
  
  /**
   * Sets the value of the CheckInstructions field.
   */
  public void setCheckInstructions(typekey.CheckHandlingInstructions value);
  
  
  /**
   * Sets the value of the CheckNumber field.
   */
  public void setCheckNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the CheckRpt field.
   */
  public void setCheckRpt(entity.CheckRpt value);
  
  
  /**
   * Sets the value of the CheckRptArray field.
   */
  public void setCheckRptArray(entity.CheckRpt[] value);
  
  
  public void setCheckRptID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CheckSet field.
   */
  public void setCheckSet(entity.CheckSet value);
  
  
  public void setCheckSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CheckType field.
   */
  public void setCheckType(typekey.CheckType value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value);
  
  
  public void setClaimContactID(gw.pl.persistence.core.Key value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the DateOfService field.
   */
  public void setDateOfService(java.util.Date value);
  
  
  /**
   * Sets the value of the DeductionType field.
   */
  public void setDeductionType(typekey.DeductionType value);
  
  
  /**
   * Sets the value of the Deductions field.
   */
  public void setDeductions(entity.Deduction[] value);
  
  
  /**
   * Sets the value of the DeliveryMethod field.
   */
  public void setDeliveryMethod(typekey.DeliveryMethod value);
  
  
  /**
   * Sets the value of the EnteredTime field.
   */
  public void setEnteredTime(java.util.Date value);
  
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.CheckGroup value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InvoiceNumber field.
   */
  public void setInvoiceNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the IssueDate field.
   */
  public void setIssueDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MailTo field.
   */
  public void setMailTo(java.lang.String value);
  
  
  /**
   * Sets the value of the MailToAddress field.
   * @deprecated Address of the person/company to whom the check should be mailed.
   */
  @java.lang.Deprecated
  public void setMailToAddress(java.lang.String value);
  
  
  /**
   * Sets the value of the MailingAddress field.
   */
  public void setMailingAddress(entity.Address value);
  
  
  public void setMailingAddressID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Memo field.
   */
  public void setMemo(java.lang.String value);
  
  
  /**
   * Sets the value of the PayTo field.
   */
  public void setPayTo(java.lang.String value);
  
  
  /**
   * Sets the value of the PayToDenorm field.
   */
  public void setPayToDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the Payees field.
   */
  public void setPayees(entity.CheckPayee[] value);
  
  
  /**
   * Sets the value of the PaymentMethod field.
   */
  public void setPaymentMethod(typekey.PaymentMethod value);
  
  
  /**
   * Sets the value of the Payments field.
   */
  public void setPayments(entity.Payment[] value);
  
  
  /**
   * Sets the value of the PendEscalationForBulk field.
   */
  public void setPendEscalationForBulk(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Portion field.
   */
  public void setPortion(entity.CheckPortion value);
  
  
  public void setPortionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RecurringCheck field.
   */
  public void setRecurringCheck(entity.RecurringCheck value);
  
  
  public void setRecurringCheckID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Reportability field.
   */
  public void setReportability(typekey.ReportabilityType value);
  
  
  /**
   * Sets the value of the ReportableAmount field.
   */
  public void setReportableAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ScheduledSendDate field.
   */
  public void setScheduledSendDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ServicePdEnd field.
   */
  public void setServicePdEnd(java.util.Date value);
  
  
  /**
   * Sets the value of the ServicePdStart field.
   */
  public void setServicePdStart(java.util.Date value);
  
  
  /**
   * Sets the value of the ServiceRequestInvoices field.
   */
  public void setServiceRequestInvoices(entity.ServiceRequestInvoice[] value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.TransactionStatus value);
  
  
  
}