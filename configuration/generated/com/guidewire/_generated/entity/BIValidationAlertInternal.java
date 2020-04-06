package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BIValidationAlert.eti;BIValidationAlert.eix;BIValidationAlert.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BIValidationAlertInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.financials.bulkpay.entity.BIValidationAlert {
  /**
   * Gets the value of the AlertMsg field.
   * Text description of this BulkInvoice validation failure alert, i.e. the reason for the validation failure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAlertMsg();
  
  
  /**
   * Gets the value of the AlertType field.
   * The type of this BulkInvoice validation alert.  Typically customer defined.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BIValidationAlertType getAlertType();
  
  
  /**
   * Gets the value of the BulkInvoice field.
   * The BulkInvoice with which this validation alert is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoice getBulkInvoice();
  
  
  public gw.pl.persistence.core.Key getBulkInvoiceID();
  
  
  /**
   * Sets the value of the AlertMsg field.
   */
  public void setAlertMsg(java.lang.String value);
  
  
  /**
   * Sets the value of the AlertType field.
   */
  public void setAlertType(typekey.BIValidationAlertType value);
  
  
  /**
   * Sets the value of the BulkInvoice field.
   */
  public void setBulkInvoice(entity.BulkInvoice value);
  
  
  public void setBulkInvoiceID(gw.pl.persistence.core.Key value);
  
  
  
}