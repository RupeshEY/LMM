package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TAccountTransactionDelegate.eti;TAccountTransactionDelegate.eix;TAccountTransactionDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TAccountTransactionDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.financials.taccount.TAccountTransactionDelegateAdapter, com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal, gw.cc.financials.taccount.entity.TAccountTransactionDelegate {
  /**
   * Gets the value of the Comments field.
   * Comments about the transaction, such as the LifeCycleState transition for which it was created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  
}