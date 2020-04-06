package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BulkInvoice.eti;BulkInvoice.eix;BulkInvoice.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BulkInvoiceInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ApprovableInternal, com.guidewire._generated.entity.EFTDataDelegateInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.bulkpay.entity.BulkInvoice {
  java.lang.String BULKINVOICEADDED_EVENT = "BulkInvoiceAdded";
  
  java.lang.String BULKINVOICECHANGED_EVENT = "BulkInvoiceChanged";
  
  java.lang.String BULKINVOICEREMOVED_EVENT = "BulkInvoiceRemoved";
  
  java.lang.String BULKINVOICESTATUSCHANGED_EVENT = "BulkInvoiceStatusChanged";
  
  /**
   * Adds the given element to the InvoiceItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInvoiceItems(entity.BulkInvoiceItem element);
  
  
  /**
   * Adds the given element to the ValidationAlerts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToValidationAlerts(entity.BIValidationAlert element);
  
  
  /**
   * Gets the value of the ApprovedReportingAmount field.
   * Denormalized value of amount in reporting currency of all approved invoice items.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getApprovedReportingAmount();
  
  
  /**
   * Gets the value of the ApprovedTransactionAmount field.
   * Denormalized value of amount in transaction currency of all approved invoice items.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getApprovedTransactionAmount();
  
  
  /**
   * Gets the value of the BulkInvoiceTotal field.
   * Amount to be split evenly across all invoice items, or zero if item amounts are to be entered individually.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getBulkInvoiceTotal();
  
  
  /**
   * Gets the value of the CheckInstructions field.
   * Special handling instructions for the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CheckHandlingInstructions getCheckInstructions();
  
  
  /**
   * Gets the value of the CheckNumber field.
   * The check or EFT identifier for the single large check generated for this invoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckNumber();
  
  
  /**
   * Gets the value of the Comments field.
   * Comments about the check, such as a reason it was voided.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the Currency field.
   * Currency that the line items on this BulkInvoice should use.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the DefaultCostCategory field.
   * The CostCategory, if any, shared by every payment on this BulkInvoice unless overriden by a particular line-item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostCategory getDefaultCostCategory();
  
  
  /**
   * Gets the value of the DefaultCostType field.
   * The CostType, if any, shared by every payment on this BulkInvoice unless overriden by a particular line-item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostType getDefaultCostType();
  
  
  /**
   * Gets the value of the DefaultPaymentType field.
   *  The PaymentType, if any, shared by every payment on this BulkInvoice unless overriden by a particular line-item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentType getDefaultPaymentType();
  
  
  /**
   * Gets the value of the DeliveryMethod field.
   * Requested delivery method for the bulk check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DeliveryMethod getDeliveryMethod();
  
  
  /**
   * Gets the value of the InvoiceItems field.
   * The collection of BulkInvoiceItems on this invoice, corresponding to the line-items on the real-world invoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoiceItem[] getInvoiceItems();
  
  
  /**
   * Gets the value of the InvoiceNumber field.
   * Unique number of the physical invoice related to this bulk pay invoice.
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
   * Gets the value of the LastValidatedDate field.
   * The date that this BulkInvoice was last validated. This property is always non-null when Valid is true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLastValidatedDate();
  
  
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
   * Address of the person/company to whom this invoice should be mailed. This represents an Address entity.
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
   * Pay to the order of value for the bulk check.
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
   * Gets the value of the Payee field.
   * The Payee for all the bulkinvoiceitems on this bulkinvoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getPayee();
  
  
  public gw.pl.persistence.core.Key getPayeeID();
  
  
  /**
   * Gets the value of the PaymentMethod field.
   * Requested payment method for all payments in the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentMethod getPaymentMethod();
  
  
  /**
   * Gets the value of the ReceivedDate field.
   * Date that the invoice was received or entered.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReceivedDate();
  
  
  /**
   * Gets the value of the Reportability field.
   * Whether the bulk payment should be reported to the IRS as income.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ReportabilityType getReportability();
  
  
  /**
   * Gets the value of the ReportableAmount field.
   * (Unused. May be removed in a future release.) Reportable amount of the BI check (for deductions).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getReportableAmount();
  
  
  /**
   * Gets the value of the ScheduledSendDate field.
   * Date that the bulk invoice should be submitted to the downstream system.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getScheduledSendDate();
  
  
  /**
   * Gets the value of the Status field.
   * Business status of this bulk invoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BulkInvoiceStatus getStatus();
  
  
  /**
   * Gets the value of the TotalReportingAmount field.
   * Denormalized value of total amount in reporting currency of all invoice items.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalReportingAmount();
  
  
  /**
   * Gets the value of the TotalTransactionAmount field.
   * Denormalized value of total amount in transaction currency of all invoice items.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalTransactionAmount();
  
  
  /**
   * Gets the value of the TransToReportingExchangeRate field.
   * The Transaction-to-Reporting exchange rate used to select Transaction-to-Claim and Transaction-to-Reporting exchange rates for the checks created for this bulk invoice. If this refers to a market exchange rate, current market rates will be selected. Otherwise, a market Claim-to-Reporting exchange rate will be selected and a custom Transaction-to-Claim rate will be created such that, when multiplied together, they equal this rate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExchangeRate getTransToReportingExchangeRate();
  
  
  public gw.pl.persistence.core.Key getTransToReportingExchangeRateID();
  
  
  /**
   * Gets the value of the ValidationAlerts field.
   * Any alerts returned by the most recent validation call.  If empty, then the BulkInvoice is considered valid.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BIValidationAlert[] getValidationAlerts();
  
  
  /**
   * Gets the value of the ProcessingItems field.
   * Boolean flag to indicate whether the invoice's items are currently being processed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isProcessingItems();
  
  
  /**
   * Gets the value of the SplitEqually field.
   * Designates whether or not the amount for each individual line-item should be automatically calculated as an even share of the total amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSplitEqually();
  
  
  /**
   * Gets the value of the Valid field.
   * Indicates whether this BulkInvoice has been validated and if so whether the validation was successful.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isValid();
  
  
  /**
   * Removes the given element from the InvoiceItems array. This is achieved by marking the element for removal.
   */
  public void removeFromInvoiceItems(entity.BulkInvoiceItem element);
  
  
  /**
   * Removes the given element from the InvoiceItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInvoiceItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ValidationAlerts array. This is achieved by marking the element for removal.
   */
  public void removeFromValidationAlerts(entity.BIValidationAlert element);
  
  
  /**
   * Removes the given element from the ValidationAlerts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromValidationAlerts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ApprovedReportingAmount field.
   */
  public void setApprovedReportingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ApprovedTransactionAmount field.
   */
  public void setApprovedTransactionAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the BulkInvoiceTotal field.
   */
  public void setBulkInvoiceTotal(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the CheckInstructions field.
   */
  public void setCheckInstructions(typekey.CheckHandlingInstructions value);
  
  
  /**
   * Sets the value of the CheckNumber field.
   */
  public void setCheckNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the DefaultCostCategory field.
   */
  public void setDefaultCostCategory(typekey.CostCategory value);
  
  
  /**
   * Sets the value of the DefaultCostType field.
   */
  public void setDefaultCostType(typekey.CostType value);
  
  
  /**
   * Sets the value of the DefaultPaymentType field.
   */
  public void setDefaultPaymentType(typekey.PaymentType value);
  
  
  /**
   * Sets the value of the DeliveryMethod field.
   */
  public void setDeliveryMethod(typekey.DeliveryMethod value);
  
  
  /**
   * Sets the value of the InvoiceItems field.
   */
  public void setInvoiceItems(entity.BulkInvoiceItem[] value);
  
  
  /**
   * Sets the value of the InvoiceNumber field.
   */
  public void setInvoiceNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the IssueDate field.
   */
  public void setIssueDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LastValidatedDate field.
   */
  public void setLastValidatedDate(java.util.Date value);
  
  
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
   * Sets the value of the Payee field.
   */
  public void setPayee(entity.Contact value);
  
  
  public void setPayeeID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PaymentMethod field.
   */
  public void setPaymentMethod(typekey.PaymentMethod value);
  
  
  /**
   * Sets the value of the ProcessingItems field.
   */
  public void setProcessingItems(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ReceivedDate field.
   */
  public void setReceivedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Reportability field.
   */
  public void setReportability(typekey.ReportabilityType value);
  
  
  /**
   * Sets the value of the ReportableAmount field.
   */
  public void setReportableAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ScheduledSendDate field.
   */
  public void setScheduledSendDate(java.util.Date value);
  
  
  /**
   * Sets the value of the SplitEqually field.
   */
  public void setSplitEqually(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.BulkInvoiceStatus value);
  
  
  /**
   * Sets the value of the TotalReportingAmount field.
   */
  public void setTotalReportingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the TotalTransactionAmount field.
   */
  public void setTotalTransactionAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the TransToReportingExchangeRate field.
   */
  public void setTransToReportingExchangeRate(entity.ExchangeRate value);
  
  
  public void setTransToReportingExchangeRateID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Valid field.
   */
  public void setValid(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ValidationAlerts field.
   */
  public void setValidationAlerts(entity.BIValidationAlert[] value);
  
  
  
}