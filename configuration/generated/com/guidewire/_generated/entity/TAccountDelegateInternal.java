package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TAccountDelegate.eti;TAccountDelegate.eix;TAccountDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TAccountDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.financials.taccount.TAccountDelegateAdapter, com.guidewire.cc.domain.financials.taccount.impl.TAccountDelegateInternal, gw.cc.financials.taccount.entity.TAccountDelegate {
  /**
   * Gets the value of the CreditBalance field.
   * The balance of the claim currency credit side of this t-account's ledger.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCreditBalance();
  
  
  /**
   * Gets the value of the CreditRptBalance field.
   * The balance of the reporting currency credit side of this t-account's ledger.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCreditRptBalance();
  
  
  /**
   * Gets the value of the DebitBalance field.
   * The balance of the claim currency debit side of this t-account's ledger.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDebitBalance();
  
  
  /**
   * Gets the value of the DebitRptBalance field.
   * The balance of the reporting currency debit side of this t-account's ledger.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDebitRptBalance();
  
  
  /**
   * Gets the value of the NormalBalance field.
   * Indicates whether this t-account's normal balance is 'credit normal' or 'debit normal'.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LedgerSide getNormalBalance();
  
  
  /**
   * Gets the value of the NumContributingTxns field.
   * Stores a denormalized counter of the number of financial transactions currently contributing to this taccount's net balance
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumContributingTxns();
  
  
  /**
   * Gets the value of the TAccountType field.
   * The type of this t-account, i.e., the transaction subtype(s) and lifecycle state that it reflects.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TAccountType getTAccountType();
  
  
  /**
   * Sets the value of the CreditBalance field.
   */
  public void setCreditBalance(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the CreditRptBalance field.
   */
  public void setCreditRptBalance(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DebitBalance field.
   */
  public void setDebitBalance(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DebitRptBalance field.
   */
  public void setDebitRptBalance(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the NormalBalance field.
   */
  public void setNormalBalance(typekey.LedgerSide value);
  
  
  /**
   * Sets the value of the NumContributingTxns field.
   */
  public void setNumContributingTxns(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TAccountType field.
   */
  public void setTAccountType(typekey.TAccountType value);
  
  
  
}