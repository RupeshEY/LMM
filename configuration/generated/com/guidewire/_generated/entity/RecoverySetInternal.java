package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RecoverySet.eti;RecoverySet.eix;RecoverySet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RecoverySetInternal extends com.guidewire._generated.entity.TransactionSetInternal, com.guidewire.cc.domain.financials.recovery.impl.RecoverySetInternal, gw.cc.financials.recovery.entity.RecoverySet {
  /**
   * Adds the given element to the Recoveries array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRecoveries(entity.Recovery element);
  
  
  /**
   * Gets the value of the Recoveries field.
   * The recoveries in the set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Recovery[] getRecoveries();
  
  
  /**
   * Removes the given element from the Recoveries array. This is achieved by marking the element for removal.
   */
  public void removeFromRecoveries(entity.Recovery element);
  
  
  /**
   * Removes the given element from the Recoveries array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRecoveries(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Recoveries field.
   */
  public void setRecoveries(entity.Recovery[] value);
  
  
  
}