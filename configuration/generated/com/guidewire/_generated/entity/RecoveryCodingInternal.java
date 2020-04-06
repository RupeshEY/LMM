package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RecoveryCoding.eti;RecoveryCoding.eix;RecoveryCoding.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RecoveryCodingInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountOwnerDelegateInternal, com.guidewire.cc.domain.financials.impl.RecoveryCodingInternal, com.guidewire.cc.domain.financials.taccount.TAccountOwnerDelegateAdapter, com.guidewire.pl.system.bundle.InsertCallback {
  /**
   * Adds the given element to the RecoveryTAccounts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRecoveryTAccounts(entity.RecoveryTAccount element);
  
  
  /**
   * Adds the given element to the Transactions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTransactions(entity.Transaction element);
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the RecoveryCategory field.
   * The RecoveryCategory to which all associated transactions should be coded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecoveryCategory getRecoveryCategory();
  
  
  /**
   * Gets the value of the RecoveryTAccounts field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryTAccount[] getRecoveryTAccounts();
  
  
  /**
   * Array association for partition RecoveryTAccountsByTAccountType on array RecoveryTAccounts
   */
  public entity.RecoveryTAccount getRecoveryTAccountsByTAccountType(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the ReserveLine field.
   * The ReserveLine to which all associated transactions should be coded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveLine getReserveLine();
  
  
  public gw.pl.persistence.core.Key getReserveLineID();
  
  
  /**
   * Gets the value of the Transactions field.
   * Set of transactions that coded to this RecoveryCoding.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction[] getTransactions();
  
  
  /**
   * Removes the given element from the RecoveryTAccounts array. This is achieved by marking the element for removal.
   */
  public void removeFromRecoveryTAccounts(entity.RecoveryTAccount element);
  
  
  /**
   * Removes the given element from the RecoveryTAccounts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRecoveryTAccounts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   */
  public void removeFromTransactions(entity.Transaction element);
  
  
  /**
   * Removes the given element from the Transactions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTransactions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the RecoveryCategory field.
   */
  public void setRecoveryCategory(typekey.RecoveryCategory value);
  
  
  /**
   * Sets the value of the RecoveryTAccounts field.
   */
  public void setRecoveryTAccounts(entity.RecoveryTAccount[] value);
  
  
  /**
   * Sets the value of the ReserveLine field.
   */
  public void setReserveLine(entity.ReserveLine value);
  
  
  public void setReserveLineID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Transactions field.
   */
  public void setTransactions(entity.Transaction[] value);
  
  
  
}