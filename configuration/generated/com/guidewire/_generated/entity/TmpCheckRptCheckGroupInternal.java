package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpCheckRptCheckGroup.eti;TmpCheckRptCheckGroup.eix;TmpCheckRptCheckGroup.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpCheckRptCheckGroupInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.check.entity.TmpCheckRptCheckGroup {
  /**
   * Gets the value of the CheckGroupID field.
   * The ID of the CheckGroup to which the aggregates correspond
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCheckGroupID();
  
  
  /**
   * Gets the value of the Currency field.
   * The transaction currency of the checks in this group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the ReservingCurrency field.
   * The reserving currency of the checks in this group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency();
  
  
  /**
   * Gets the value of the TotalPayments field.
   * Total payments for the primary check of the CheckGroup in the Check Currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPayments();
  
  
  /**
   * Gets the value of the TotalPaymentsClaimAmount field.
   * Total payments for the primary check of the CheckGroup in the Claim Currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPaymentsClaimAmount();
  
  
  /**
   * Gets the value of the TotalPaymentsReservingAmount field.
   * Total payments for the primary check of the CheckGroup in the Reserving Currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalPaymentsReservingAmount();
  
  
  /**
   * Sets the value of the CheckGroupID field.
   */
  public void setCheckGroupID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  public void setReservingCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the TotalPayments field.
   */
  public void setTotalPayments(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalPaymentsClaimAmount field.
   */
  public void setTotalPaymentsClaimAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TotalPaymentsReservingAmount field.
   */
  public void setTotalPaymentsReservingAmount(java.math.BigDecimal value);
  
  
  
}