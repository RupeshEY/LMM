package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "EFTDataDelegate.eti;EFTDataDelegate.eix;EFTDataDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface EFTDataDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.contact.entity.EFTDataDelegate {
  /**
   * Gets the value of the AccountName field.
   * The name on the account
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAccountName();
  
  
  /**
   * Gets the value of the BankAccountNumber field.
   * The bank account number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBankAccountNumber();
  
  
  /**
   * Gets the value of the BankAccountType field.
   * The type of bank accout e.g. checking, savings etc
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BankAccountType getBankAccountType();
  
  
  /**
   * Gets the value of the BankName field.
   * The name of the bank
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBankName();
  
  
  /**
   * Gets the value of the BankRoutingNumber field.
   * The routing number is a nine digit bank code used in the United States
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBankRoutingNumber();
  
  
  /**
   * Gets the value of the IsPrimary field.
   * Indicates if this is the primary EFT record for the contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsPrimary();
  
  
  /**
   * Sets the value of the AccountName field.
   */
  public void setAccountName(java.lang.String value);
  
  
  /**
   * Sets the value of the BankAccountNumber field.
   */
  public void setBankAccountNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the BankAccountType field.
   */
  public void setBankAccountType(typekey.BankAccountType value);
  
  
  /**
   * Sets the value of the BankName field.
   */
  public void setBankName(java.lang.String value);
  
  
  /**
   * Sets the value of the BankRoutingNumber field.
   */
  public void setBankRoutingNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the IsPrimary field.
   */
  public void setIsPrimary(java.lang.Boolean value);
  
  
  
}