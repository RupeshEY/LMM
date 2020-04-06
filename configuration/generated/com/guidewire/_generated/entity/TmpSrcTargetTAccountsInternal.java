package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpSrcTargetTAccounts.eti;TmpSrcTargetTAccounts.eix;TmpSrcTargetTAccounts.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpSrcTargetTAccountsInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.taccount.entity.TmpSrcTargetTAccounts {
  /**
   * Gets the value of the LineItemID field.
   * The taccountlineitem to update
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLineItemID();
  
  
  /**
   * Gets the value of the TargetTAccountID field.
   * The ID of the new TAccount to set into the lineitem
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTargetTAccountID();
  
  
  /**
   * Sets the value of the LineItemID field.
   */
  public void setLineItemID(java.lang.Long value);
  
  
  /**
   * Sets the value of the TargetTAccountID field.
   */
  public void setTargetTAccountID(java.lang.Long value);
  
  
  
}