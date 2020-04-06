package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RecTAccountTransaction.eti;RecTAccountTransaction.eix;RecTAccountTransaction.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RecTAccountTransactionInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountTransactionDelegateInternal, com.guidewire.cc.domain.financials.taccount.TAccountTransactionDelegateAdapter, com.guidewire.cc.domain.financials.taccount.impl.TAccountTransactionDelegateInternal {
  /**
   * Adds the given element to the CreditingLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCreditingLineItems(entity.RecoveryTAccountLineItem element);
  
  
  /**
   * Adds the given element to the DebitingLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDebitingLineItems(entity.RecoveryTAccountLineItem element);
  
  
  /**
   * Adds the given element to the RectaccttxnhistArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRectaccttxnhistArray(entity.Rectaccttxnhist element);
  
  
  /**
   * Gets the value of the CreditingLineItems field.
   * Set of TAccountLineItems that are used by this TAccountTransaction to credit a TAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryTAccountLineItem[] getCreditingLineItems();
  
  
  /**
   * Gets the value of the DebitingLineItems field.
   * Set of TAccountLineItems that are used by this TAccountTransaction to debit a TAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryTAccountLineItem[] getDebitingLineItems();
  
  
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
  public entity.RecTAccountTransaction getNextTransaction();
  
  
  public gw.pl.persistence.core.Key getNextTransactionID();
  
  
  /**
   * Gets the value of the RectaccttxnhistArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Rectaccttxnhist[] getRectaccttxnhistArray();
  
  
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
  public void removeFromCreditingLineItems(entity.RecoveryTAccountLineItem element);
  
  
  /**
   * Removes the given element from the CreditingLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCreditingLineItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the DebitingLineItems array. This is achieved by marking the element for removal.
   */
  public void removeFromDebitingLineItems(entity.RecoveryTAccountLineItem element);
  
  
  /**
   * Removes the given element from the DebitingLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDebitingLineItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RectaccttxnhistArray array. This is achieved by marking the element for removal.
   */
  public void removeFromRectaccttxnhistArray(entity.Rectaccttxnhist element);
  
  
  /**
   * Removes the given element from the RectaccttxnhistArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRectaccttxnhistArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CreditingLineItems field.
   */
  public void setCreditingLineItems(entity.RecoveryTAccountLineItem[] value);
  
  
  /**
   * Sets the value of the DebitingLineItems field.
   */
  public void setDebitingLineItems(entity.RecoveryTAccountLineItem[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the NextTransaction field.
   */
  public void setNextTransaction(entity.RecTAccountTransaction value);
  
  
  public void setNextTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RectaccttxnhistArray field.
   */
  public void setRectaccttxnhistArray(entity.Rectaccttxnhist[] value);
  
  
  /**
   * Sets the value of the Transaction field.
   */
  public void setTransaction(entity.Transaction value);
  
  
  public void setTransactionID(gw.pl.persistence.core.Key value);
  
  
  
}