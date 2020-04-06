package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAcctContribTxns.eti;TmpTAcctContribTxns.eix;TmpTAcctContribTxns.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpTAcctContribTxnsInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.taccount.entity.TmpTAcctContribTxns {
  /**
   * Gets the value of the TAccountID field.
   * primary key of the taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTAccountID();
  
  
  /**
   * Gets the value of the TmpNumContributingTxns field.
   * count of the # of contributing txns
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTmpNumContributingTxns();
  
  
  /**
   * Sets the value of the TAccountID field.
   */
  public void setTAccountID(java.lang.Long value);
  
  
  /**
   * Sets the value of the TmpNumContributingTxns field.
   */
  public void setTmpNumContributingTxns(java.lang.Integer value);
  
  
  
}