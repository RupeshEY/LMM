package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpNewTAcctJoinTbl.eti;TmpNewTAcctJoinTbl.eix;TmpNewTAcctJoinTbl.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpNewTAcctJoinTblInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.taccount.entity.TmpNewTAcctJoinTbl {
  /**
   * Gets the value of the TAccountType field.
   * Either the new Recoveries or new CommittedErodingPmts TAccountType
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TAccountType getTAccountType();
  
  
  /**
   * Sets the value of the TAccountType field.
   */
  public void setTAccountType(typekey.TAccountType value);
  
  
  
}