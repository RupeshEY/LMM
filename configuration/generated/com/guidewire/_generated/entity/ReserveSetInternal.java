package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReserveSet.eti;ReserveSet.eix;ReserveSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReserveSetInternal extends com.guidewire._generated.entity.TransactionSetInternal, com.guidewire.cc.domain.financials.reserve.impl.ReserveSetInternal, gw.cc.financials.reserve.entity.ReserveSet {
  /**
   * Adds the given element to the Reserves array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToReserves(entity.Reserve element);
  
  
  /**
   * Gets the value of the Reserves field.
   * Reserves in the set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Reserve[] getReserves();
  
  
  /**
   * Removes the given element from the Reserves array. This is achieved by marking the element for removal.
   */
  public void removeFromReserves(entity.Reserve element);
  
  
  /**
   * Removes the given element from the Reserves array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromReserves(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Reserves field.
   */
  public void setReserves(entity.Reserve[] value);
  
  
  
}