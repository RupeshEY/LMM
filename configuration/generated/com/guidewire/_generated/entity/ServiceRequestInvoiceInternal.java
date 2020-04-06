package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestInvoice.eti;ServiceRequestInvoice.eix;ServiceRequestInvoice.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceRequestInvoiceInternal extends com.guidewire._generated.entity.ServiceRequestStatementInternal, com.guidewire._generated.entity.EventAwareInternal {
  java.lang.String SERVICEREQUESTINVOICEADDED_EVENT = "ServiceRequestInvoiceAdded";
  
  java.lang.String SERVICEREQUESTINVOICECHANGED_EVENT = "ServiceRequestInvoiceChanged";
  
  java.lang.String SERVICEREQUESTINVOICEOPERATION_APPROVEINVOICE_EVENT = "ServiceRequestInvoiceOperation_approveinvoice";
  
  java.lang.String SERVICEREQUESTINVOICEOPERATION_PAYINVOICE_EVENT = "ServiceRequestInvoiceOperation_payinvoice";
  
  java.lang.String SERVICEREQUESTINVOICEOPERATION_REJECTINVOICE_EVENT = "ServiceRequestInvoiceOperation_rejectinvoice";
  
  java.lang.String SERVICEREQUESTINVOICEOPERATION_UNPAYINVOICE_EVENT = "ServiceRequestInvoiceOperation_unpayinvoice";
  
  java.lang.String SERVICEREQUESTINVOICEOPERATION_WITHDRAWINVOICE_EVENT = "ServiceRequestInvoiceOperation_withdrawinvoice";
  
  java.lang.String SERVICEREQUESTINVOICEREMOVED_EVENT = "ServiceRequestInvoiceRemoved";
  
  /**
   * Gets the value of the Check field.
   * The check that paid this invoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check getCheck();
  
  
  public gw.pl.persistence.core.Key getCheckID();
  
  
  /**
   * Gets the value of the PaidBy field.
   * The user who paid this invoice.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getPaidBy();
  
  
  public gw.pl.persistence.core.Key getPaidByID();
  
  
  /**
   * Gets the value of the PaymentDate field.
   * The time at which this invoice was paid.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPaymentDate();
  
  
  /**
   * Gets the value of the Status field.
   * The current invoice status
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestInvoiceStatus getStatus();
  
  
  /**
   * Sets the value of the Check field.
   */
  public void setCheck(entity.Check value);
  
  
  public void setCheckID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PaidBy field.
   */
  public void setPaidBy(entity.User value);
  
  
  public void setPaidByID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PaymentDate field.
   */
  public void setPaymentDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.ServiceRequestInvoiceStatus value);
  
  
  
}