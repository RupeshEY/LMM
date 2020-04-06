package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAccountReserveLine.eti;TmpTAccountReserveLine.eix;TmpTAccountReserveLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpTAccountReserveLineInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.taccount.entity.TmpTAccountReserveLine {
  /**
   * Gets the value of the TAccountID field.
   * Temp TAccount ID.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTAccountID();
  
  
  /**
   * Gets the value of the TAccountType field.
   * type of the taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TAccountType getTAccountType();
  
  
  /**
   * Gets the value of the TmpNumContributingTxns field.
   * The number of transactions currently contributing to this taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTmpNumContributingTxns();
  
  
  /**
   * Gets the value of the TmpReserveLineID field.
   * Temp ReserveLine ID.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTmpReserveLineID();
  
  
  /**
   * Sets the value of the TAccountID field.
   */
  public void setTAccountID(java.lang.Long value);
  
  
  /**
   * Sets the value of the TAccountType field.
   */
  public void setTAccountType(typekey.TAccountType value);
  
  
  /**
   * Sets the value of the TmpNumContributingTxns field.
   */
  public void setTmpNumContributingTxns(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TmpReserveLineID field.
   */
  public void setTmpReserveLineID(java.lang.Long value);
  
  
  
}