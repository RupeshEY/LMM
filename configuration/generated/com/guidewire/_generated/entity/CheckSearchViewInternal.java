package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CheckSearchView.eti;CheckSearchView.eix;CheckSearchView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CheckSearchViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.financials.check.entity.CheckSearchView {
  /**
   * Gets the value of the BulkInvoiceItem field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BulkInvoiceItem getBulkInvoiceItem();
  
  
  public gw.pl.persistence.core.Key getBulkInvoiceItemID();
  
  
  /**
   * Gets the value of the BulkInvoiceNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBulkInvoiceNumber();
  
  
  /**
   * Gets the value of the Check field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check getCheck();
  
  
  public gw.pl.persistence.core.Key getCheckID();
  
  
  /**
   * Gets the value of the Claim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimCurrency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimCurrency();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the Claimant field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimant();
  
  
  /**
   * Gets the value of the Currency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the DateOfService field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfService();
  
  
  /**
   * Gets the value of the GrossAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossAmount();
  
  
  /**
   * Gets the value of the GrossClaimAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossClaimAmount();
  
  
  /**
   * Gets the value of the GrossReservingAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossReservingAmount();
  
  
  /**
   * Gets the value of the IssueDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getIssueDate();
  
  
  /**
   * Gets the value of the PayTo field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPayTo();
  
  
  /**
   * Gets the value of the ReservingCurrency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency();
  
  
  /**
   * Gets the value of the ScheduledSendDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getScheduledSendDate();
  
  
  /**
   * Gets the value of the ServicePdEnd field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServicePdEnd();
  
  
  /**
   * Gets the value of the ServicePdStart field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getServicePdStart();
  
  
  /**
   * Gets the value of the Status field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionStatus getStatus();
  
  
  /**
   * Sets the value of the BulkInvoiceItem field.
   */
  public void setBulkInvoiceItem(entity.BulkInvoiceItem value);
  
  
  public void setBulkInvoiceItemID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the BulkInvoiceNumber field.
   */
  public void setBulkInvoiceNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Check field.
   */
  public void setCheck(entity.Check value);
  
  
  public void setCheckID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimCurrency field.
   */
  public void setClaimCurrency(typekey.Currency value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Claimant field.
   */
  public void setClaimant(java.lang.String value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the DateOfService field.
   */
  public void setDateOfService(java.util.Date value);
  
  
  /**
   * Sets the value of the GrossAmount field.
   */
  public void setGrossAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the GrossClaimAmount field.
   */
  public void setGrossClaimAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the GrossReservingAmount field.
   */
  public void setGrossReservingAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the IssueDate field.
   */
  public void setIssueDate(java.util.Date value);
  
  
  /**
   * Sets the value of the PayTo field.
   */
  public void setPayTo(java.lang.String value);
  
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  public void setReservingCurrency(typekey.Currency value);
  
  
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
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.TransactionStatus value);
  
  
  
}