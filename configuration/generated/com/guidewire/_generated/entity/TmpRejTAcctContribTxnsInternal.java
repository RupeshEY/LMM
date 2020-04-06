package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpRejTAcctContribTxns.eti;TmpRejTAcctContribTxns.eix;TmpRejTAcctContribTxns.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpRejTAcctContribTxnsInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.taccount.entity.TmpRejTAcctContribTxns {
  /**
   * Gets the value of the NumCreditingTxns field.
   * The number of transactions currently crediting this taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumCreditingTxns();
  
  
  /**
   * Gets the value of the NumDebitingTxns field.
   * The number of transactions currently debiting this taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumDebitingTxns();
  
  
  /**
   * Gets the value of the TAccountID field.
   * The ID of the t-account in question
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTAccountID();
  
  
  /**
   * Sets the value of the NumCreditingTxns field.
   */
  public void setNumCreditingTxns(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumDebitingTxns field.
   */
  public void setNumDebitingTxns(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TAccountID field.
   */
  public void setTAccountID(java.lang.Long value);
  
  
  
}