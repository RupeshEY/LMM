package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpBulkInvoiceSums.eti;TmpBulkInvoiceSums.eix;TmpBulkInvoiceSums.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpBulkInvoiceSumsInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.financials.bulkpay.entity.TmpBulkInvoiceSums {
  /**
   * Gets the value of the ApprovedAmount field.
   * Temp BulkInvoice Approved Amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getApprovedAmount();
  
  
  /**
   * Gets the value of the TmpCurrency field.
   * Temp BulkInvoice Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getTmpCurrency();
  
  
  /**
   * Gets the value of the TotalAmount field.
   * Temp BulkInvoice Total Amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalAmount();
  
  
  /**
   * Sets the value of the ApprovedAmount field.
   */
  public void setApprovedAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TmpCurrency field.
   */
  public void setTmpCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the TotalAmount field.
   */
  public void setTotalAmount(java.math.BigDecimal value);
  
  
  
}