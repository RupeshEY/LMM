package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PaymentReserve.eti;PaymentReserve.eix;PaymentReserve.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PaymentReserveInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.financials.payment.entity.PaymentReserve {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Payment field.
   * The payment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Payment getPayment();
  
  
  public gw.pl.persistence.core.Key getPaymentID();
  
  
  /**
   * Gets the value of the Reserve field.
   * The reserve.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Reserve getReserve();
  
  
  public gw.pl.persistence.core.Key getReserveID();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Payment field.
   */
  public void setPayment(entity.Payment value);
  
  
  public void setPaymentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Reserve field.
   */
  public void setReserve(entity.Reserve value);
  
  
  public void setReserveID(gw.pl.persistence.core.Key value);
  
  
  
}