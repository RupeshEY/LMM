package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RecoveryReserveSet.eti;RecoveryReserveSet.eix;RecoveryReserveSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RecoveryReserveSetInternal extends com.guidewire._generated.entity.TransactionSetInternal, com.guidewire.cc.domain.financials.recovery.impl.RecoveryReserveSetInternal, gw.cc.financials.recovery.entity.RecoveryReserveSet {
  /**
   * Adds the given element to the RecoveryReserves array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRecoveryReserves(entity.RecoveryReserve element);
  
  
  /**
   * Gets the value of the RecoveryReserves field.
   * Recovery reserves in the set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryReserve[] getRecoveryReserves();
  
  
  /**
   * Removes the given element from the RecoveryReserves array. This is achieved by marking the element for removal.
   */
  public void removeFromRecoveryReserves(entity.RecoveryReserve element);
  
  
  /**
   * Removes the given element from the RecoveryReserves array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRecoveryReserves(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the RecoveryReserves field.
   */
  public void setRecoveryReserves(entity.RecoveryReserve[] value);
  
  
  
}