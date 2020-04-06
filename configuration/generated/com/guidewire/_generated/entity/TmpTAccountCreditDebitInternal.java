package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAccountCreditDebit.eti;TmpTAccountCreditDebit.eix;TmpTAccountCreditDebit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpTAccountCreditDebitInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.financials.taccount.entity.TmpTAccountCreditDebit {
  /**
   * Gets the value of the TmpCreditBalance field.
   * Temp credit balance for claim amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpCreditBalance();
  
  
  /**
   * Gets the value of the TmpCreditBalanceReporting field.
   * Temp credit balance for reporting amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpCreditBalanceReporting();
  
  
  /**
   * Gets the value of the TmpCreditBalanceReserving field.
   * Temp credit balance for reserving amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpCreditBalanceReserving();
  
  
  /**
   * Gets the value of the TmpDebitBalance field.
   * Temp debit balance for claim amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpDebitBalance();
  
  
  /**
   * Gets the value of the TmpDebitBalanceReporting field.
   * Temp debit balance for reporting amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpDebitBalanceReporting();
  
  
  /**
   * Gets the value of the TmpDebitBalanceReserving field.
   * Temp debit balance for reserving amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTmpDebitBalanceReserving();
  
  
  /**
   * Gets the value of the TmpNumContributingTxns field.
   * temp field for the number of contributing transactions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTmpNumContributingTxns();
  
  
  /**
   * Sets the value of the TmpCreditBalance field.
   */
  public void setTmpCreditBalance(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TmpCreditBalanceReporting field.
   */
  public void setTmpCreditBalanceReporting(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TmpCreditBalanceReserving field.
   */
  public void setTmpCreditBalanceReserving(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TmpDebitBalance field.
   */
  public void setTmpDebitBalance(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TmpDebitBalanceReporting field.
   */
  public void setTmpDebitBalanceReporting(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TmpDebitBalanceReserving field.
   */
  public void setTmpDebitBalanceReserving(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TmpNumContributingTxns field.
   */
  public void setTmpNumContributingTxns(java.lang.Integer value);
  
  
  
}