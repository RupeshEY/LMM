package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TAccountTransaction.eti;TAccountTransaction.eix;TAccountTransaction.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TAccountTransactionInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountTransactionDelegateInternal, com.guidewire.cc.domain.financials.taccount.TAccountTransactionDelegateAdapter, com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.taccount.entity.TAccountTransaction {
  /**
   * Adds the given element to the CreditingLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCreditingLineItems(entity.TAccountLineItem element);
  
  
  /**
   * Adds the given element to the DebitingLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDebitingLineItems(entity.TAccountLineItem element);
  
  
  /**
   * Adds the given element to the TaccttxnhistoryArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTaccttxnhistoryArray(entity.Taccttxnhistory element);
  
  
  /**
   * Gets the value of the CreditingLineItems field.
   * Set of TAccountLineItems that are used by this TAccountTransaction to credit a TAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccountLineItem[] getCreditingLineItems();
  
  
  /**
   * Gets the value of the DebitingLineItems field.
   * Set of TAccountLineItems that are used by this TAccountTransaction to debit a TAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccountLineItem[] getDebitingLineItems();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the NextTransaction field.
   * The t-account transaction that chronologically succeeds this one in a Transaction's lifecycle.  For the most recent TAccountTransaction, this will be NULL.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccountTransaction getNextTransaction();
  
  
  public gw.pl.persistence.core.Key getNextTransactionID();
  
  
  /**
   * Gets the value of the TaccttxnhistoryArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Taccttxnhistory[] getTaccttxnhistoryArray();
  
  
  /**
   * Gets the value of the Transaction field.
   * The higher-level financial transaction for which this t-account transaction was created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction getTransaction();
  
  
  public gw.pl.persistence.core.Key getTransactionID();
  
  
  /**
   * Removes the given element from the CreditingLineItems array. This is achieved by marking the element for removal.
   */
  public void removeFromCreditingLineItems(entity.TAccountLineItem element);
  
  
  /**
   * Removes the given element from the CreditingLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCreditingLineItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the DebitingLineItems array. This is achieved by marking the element for removal.
   */
  public void removeFromDebitingLineItems(entity.TAccountLineItem element);
  
  
  /**
   * Removes the given element from the DebitingLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDebitingLineItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the TaccttxnhistoryArray array. This is achieved by marking the element for removal.
   */
  public void removeFromTaccttxnhistoryArray(entity.Taccttxnhistory element);
  
  
  /**
   * Removes the given element from the TaccttxnhistoryArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTaccttxnhistoryArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CreditingLineItems field.
   */
  public void setCreditingLineItems(entity.TAccountLineItem[] value);
  
  
  /**
   * Sets the value of the DebitingLineItems field.
   */
  public void setDebitingLineItems(entity.TAccountLineItem[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the NextTransaction field.
   */
  public void setNextTransaction(entity.TAccountTransaction value);
  
  
  public void setNextTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TaccttxnhistoryArray field.
   */
  public void setTaccttxnhistoryArray(entity.Taccttxnhistory[] value);
  
  
  /**
   * Sets the value of the Transaction field.
   */
  public void setTransaction(entity.Transaction value);
  
  
  public void setTransactionID(gw.pl.persistence.core.Key value);
  
  
  
}