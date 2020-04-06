package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpTAccountCreateJoin.eti;TmpTAccountCreateJoin.eix;TmpTAccountCreateJoin.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpTAccountCreateJoinInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.taccount.entity.TmpTAccountCreateJoin {
  /**
   * Gets the value of the NormalBalance field.
   * Normal balance of the TAccount (i.e., Credit or Debit)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNormalBalance();
  
  
  /**
   * Gets the value of the Type field.
   * Type of a TAccount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getType();
  
  
  /**
   * Sets the value of the NormalBalance field.
   */
  public void setNormalBalance(java.lang.String value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(java.lang.String value);
  
  
  
}