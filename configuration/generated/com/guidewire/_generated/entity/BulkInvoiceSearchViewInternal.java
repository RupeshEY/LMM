package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BulkInvoiceSearchView.eti;BulkInvoiceSearchView.eix;BulkInvoiceSearchView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BulkInvoiceSearchViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.financials.bulkpay.entity.BulkInvoiceSearchView {
  /**
   * Gets the value of the ApprovedReportingAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getApprovedReportingAmount();
  
  
  /**
   * Gets the value of the ApprovedTransactionAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getApprovedTransactionAmount();
  
  
  /**
   * Gets the value of the BulkInvoice field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoice getBulkInvoice();
  
  
  public gw.pl.persistence.core.Key getBulkInvoiceID();
  
  
  /**
   * Gets the value of the BulkInvoiceTotal field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getBulkInvoiceTotal();
  
  
  /**
   * Gets the value of the CheckNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckNumber();
  
  
  /**
   * Gets the value of the Currency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the InvoiceNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInvoiceNumber();
  
  
  /**
   * Gets the value of the PayTo field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPayTo();
  
  
  /**
   * Gets the value of the ReceivedDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReceivedDate();
  
  
  /**
   * Gets the value of the ScheduledSendDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getScheduledSendDate();
  
  
  /**
   * Gets the value of the TotalReportingAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalReportingAmount();
  
  
  /**
   * Gets the value of the TotalTransactionAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalTransactionAmount();
  
  
  /**
   * Sets the value of the ApprovedReportingAmount field.
   */
  public void setApprovedReportingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ApprovedTransactionAmount field.
   */
  public void setApprovedTransactionAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the BulkInvoice field.
   */
  public void setBulkInvoice(entity.BulkInvoice value);
  
  
  public void setBulkInvoiceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the BulkInvoiceTotal field.
   */
  public void setBulkInvoiceTotal(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the CheckNumber field.
   */
  public void setCheckNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the InvoiceNumber field.
   */
  public void setInvoiceNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the PayTo field.
   */
  public void setPayTo(java.lang.String value);
  
  
  /**
   * Sets the value of the ReceivedDate field.
   */
  public void setReceivedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ScheduledSendDate field.
   */
  public void setScheduledSendDate(java.util.Date value);
  
  
  /**
   * Sets the value of the TotalReportingAmount field.
   */
  public void setTotalReportingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the TotalTransactionAmount field.
   */
  public void setTotalTransactionAmount(gw.api.financials.CurrencyAmount value);
  
  
  
}