package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Reserve.eti;Reserve.eix;Reserve.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReserveInternal extends com.guidewire._generated.entity.TransactionInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.financials.reserve.impl.ReserveInternal, gw.cc.financials.reserve.entity.Reserve {
  java.lang.String RESERVEADDED_EVENT = "ReserveAdded";
  
  java.lang.String RESERVECHANGED_EVENT = "ReserveChanged";
  
  java.lang.String RESERVEREMOVED_EVENT = "ReserveRemoved";
  
  java.lang.String RESERVESTATUSCHANGED_EVENT = "ReserveStatusChanged";
  
  java.lang.String RESERVESUBMITTED_EVENT = "ReserveSubmitted";
  
  /**
   * Adds the given element to the OffsetPayments array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOffsetPayments(entity.PaymentReserve element);
  
  
  /**
   * Gets the value of the OffsetPayments field.
   * The payments for which this reserve is the offset.  Should only be one.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PaymentReserve[] getOffsetPayments();
  
  
  /**
   * Removes the given element from the OffsetPayments array. This is achieved by marking the element for removal.
   */
  public void removeFromOffsetPayments(entity.PaymentReserve element);
  
  
  /**
   * Removes the given element from the OffsetPayments array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOffsetPayments(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the OffsetPayments field.
   */
  public void setOffsetPayments(entity.PaymentReserve[] value);
  
  
  
}