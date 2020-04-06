package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionTAccountOperationsDelegate.eti;TransactionTAccountOperationsDelegate.eix;TransactionTAccountOperationsDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TransactionTAccountOperationsDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter, com.guidewire.cc.domain.financials.taccount.impl.TransactionTAccountOperationsDelegateInternal, gw.cc.financials.taccount.entity.TransactionTAccountOperationsDelegate {
  /**
   * Gets the value of the LifeCycleState field.
   * Current internal lifecycle state of the transaction. Changing state affects T-accounts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionLifeCycleState getLifeCycleState();
  
  
  /**
   * Gets the value of the Status field.
   * Status of the transaction. Further refines the LifeCycleState. Can only change status directly to another status in the same LifeCycleState, which does not affect Taccounts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionStatus getStatus();
  
  
  /**
   * Sets the value of the LifeCycleState field.
   */
  public void setLifeCycleState(typekey.TransactionLifeCycleState value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.TransactionStatus value);
  
  
  
}