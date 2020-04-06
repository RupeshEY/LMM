package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PaymentView.eti;PaymentView.eix;PaymentView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PaymentViewInternal extends com.guidewire._generated.entity.TransactionViewInternal, gw.cc.financials.entity.PaymentView {
  /**
   * Gets the value of the Check_CheckNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheck_CheckNumber();
  
  
  /**
   * Gets the value of the Check_IssueDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCheck_IssueDate();
  
  
  /**
   * Gets the value of the Check_PayTo field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheck_PayTo();
  
  
  /**
   * Gets the value of the Check_ScheduledSendDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCheck_ScheduledSendDate();
  
  
  /**
   * Gets the value of the PaymentType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PaymentType getPaymentType();
  
  
  /**
   * Sets the value of the Check_CheckNumber field.
   */
  public void setCheck_CheckNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Check_IssueDate field.
   */
  public void setCheck_IssueDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Check_PayTo field.
   */
  public void setCheck_PayTo(java.lang.String value);
  
  
  /**
   * Sets the value of the Check_ScheduledSendDate field.
   */
  public void setCheck_ScheduledSendDate(java.util.Date value);
  
  
  /**
   * Sets the value of the PaymentType field.
   */
  public void setPaymentType(typekey.PaymentType value);
  
  
  
}