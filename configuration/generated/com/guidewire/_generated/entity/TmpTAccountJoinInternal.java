package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAccountJoin.eti;TmpTAccountJoin.eix;TmpTAccountJoin.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpTAccountJoinInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.taccount.entity.TmpTAccountJoin {
  /**
   * Gets the value of the NewTAccountID field.
   * ID of the new taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNewTAccountID();
  
  
  /**
   * Gets the value of the OldTAccountID field.
   * ID of the old taccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getOldTAccountID();
  
  
  /**
   * Gets the value of the OldTAccountType field.
   * Type of the old taccount (i.e., either Reserves or RecoveryReserves)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TAccountType getOldTAccountType();
  
  
  /**
   * Sets the value of the NewTAccountID field.
   */
  public void setNewTAccountID(java.lang.Long value);
  
  
  /**
   * Sets the value of the OldTAccountID field.
   */
  public void setOldTAccountID(java.lang.Long value);
  
  
  /**
   * Sets the value of the OldTAccountType field.
   */
  public void setOldTAccountType(typekey.TAccountType value);
  
  
  
}