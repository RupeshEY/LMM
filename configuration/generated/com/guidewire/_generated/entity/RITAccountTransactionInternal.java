package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RITAccountTransaction.eti;RITAccountTransaction.eix;RITAccountTransaction.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RITAccountTransactionInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountTransactionDelegateInternal, com.guidewire.cc.domain.financials.taccount.TAccountTransactionDelegateAdapter, com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal, gw.cc.financials.taccount.entity.RITAccountTransaction {
  /**
   * Adds the given element to the CreditingLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCreditingLineItems(entity.RITAccountLineItem element);
  
  
  /**
   * Adds the given element to the DebitingLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDebitingLineItems(entity.RITAccountLineItem element);
  
  
  /**
   * Adds the given element to the RitaccttxnhistArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRitaccttxnhistArray(entity.Ritaccttxnhist element);
  
  
  /**
   * Gets the value of the CreditingLineItems field.
   * Set of TAccountLineItems that are used by this TAccountTransaction to credit a TAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITAccountLineItem[] getCreditingLineItems();
  
  
  /**
   * Gets the value of the DebitingLineItems field.
   * Set of TAccountLineItems that are used by this TAccountTransaction to debit a TAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITAccountLineItem[] getDebitingLineItems();
  
  
  /**
   * Gets the value of the NextTransaction field.
   * The t-account transaction that chronologically succeeds this one in a Transaction's lifecycle.  For the most recent TAccountTransaction, this will be NULL.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITAccountTransaction getNextTransaction();
  
  
  public gw.pl.persistence.core.Key getNextTransactionID();
  
  
  /**
   * Gets the value of the RitaccttxnhistArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Ritaccttxnhist[] getRitaccttxnhistArray();
  
  
  /**
   * Gets the value of the Transaction field.
   * The higher-level financial transaction for which this t-account transaction was created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITransaction getTransaction();
  
  
  public gw.pl.persistence.core.Key getTransactionID();
  
  
  /**
   * Removes the given element from the CreditingLineItems array. This is achieved by marking the element for removal.
   */
  public void removeFromCreditingLineItems(entity.RITAccountLineItem element);
  
  
  /**
   * Removes the given element from the CreditingLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCreditingLineItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the DebitingLineItems array. This is achieved by marking the element for removal.
   */
  public void removeFromDebitingLineItems(entity.RITAccountLineItem element);
  
  
  /**
   * Removes the given element from the DebitingLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDebitingLineItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RitaccttxnhistArray array. This is achieved by marking the element for removal.
   */
  public void removeFromRitaccttxnhistArray(entity.Ritaccttxnhist element);
  
  
  /**
   * Removes the given element from the RitaccttxnhistArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRitaccttxnhistArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CreditingLineItems field.
   */
  public void setCreditingLineItems(entity.RITAccountLineItem[] value);
  
  
  /**
   * Sets the value of the DebitingLineItems field.
   */
  public void setDebitingLineItems(entity.RITAccountLineItem[] value);
  
  
  /**
   * Sets the value of the NextTransaction field.
   */
  public void setNextTransaction(entity.RITAccountTransaction value);
  
  
  public void setNextTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RitaccttxnhistArray field.
   */
  public void setRitaccttxnhistArray(entity.Ritaccttxnhist[] value);
  
  
  /**
   * Sets the value of the Transaction field.
   */
  public void setTransaction(entity.RITransaction value);
  
  
  public void setTransactionID(gw.pl.persistence.core.Key value);
  
  
  
}