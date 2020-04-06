package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpCheckSet.eti;TmpCheckSet.eix;TmpCheckSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpCheckSetInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.check.entity.TmpCheckSet {
  /**
   * Gets the value of the CheckID field.
   * Check id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCheckID();
  
  
  /**
   * Gets the value of the TransactionSetID field.
   * TransactionSet id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTransactionSetID();
  
  
  /**
   * Sets the value of the CheckID field.
   */
  public void setCheckID(java.lang.Long value);
  
  
  /**
   * Sets the value of the TransactionSetID field.
   */
  public void setTransactionSetID(java.lang.Long value);
  
  
  
}