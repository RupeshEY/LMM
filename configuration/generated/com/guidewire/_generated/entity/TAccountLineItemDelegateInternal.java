package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TAccountLineItemDelegate.eti;TAccountLineItemDelegate.eix;TAccountLineItemDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TAccountLineItemDelegateInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.cc.domain.financials.taccount.TAccountLineItemDelegateAdapter, com.guidewire.cc.domain.financials.taccount.impl.TAccountLineItemDelegateInternal, gw.cc.financials.taccount.entity.TAccountLineItemDelegate {
  /**
   * Gets the value of the Amount field.
   * The amount of money (in the claim currency) in this line item that was either credited or debited against a TAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAmount();
  
  
  /**
   * Gets the value of the RptAmount field.
   * The amount of money (in the reporting currency) in this line item that was either credited or debited against a TAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRptAmount();
  
  
  /**
   * Sets the value of the Amount field.
   */
  public void setAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the RptAmount field.
   */
  public void setRptAmount(java.math.BigDecimal value);
  
  
  
}