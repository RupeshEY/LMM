package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpCheckRpt.eti;TmpCheckRpt.eix;TmpCheckRpt.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpCheckRptInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.financials.check.entity.TmpCheckRpt {
  /**
   * Gets the value of the CheckID field.
   * The ID of the check to which the gross amount corresponds
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCheckID();
  
  
  /**
   * Gets the value of the Currency field.
   * The transaction currency of the Check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the GrossAmount field.
   * The gross amount of the check, in the check currency, to be updated to the CheckRpt table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossAmount();
  
  
  /**
   * Gets the value of the GrossClaimAmount field.
   * The gross amount of the check, in the claim currency, to be updated to the CheckRpt table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossClaimAmount();
  
  
  /**
   * Gets the value of the GrossReservingAmount field.
   * The gross amount of the check, in the reserving currency, to be updated to the CheckRpt table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossReservingAmount();
  
  
  /**
   * Gets the value of the ReservingCurrency field.
   * The reserving currency of the Check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency();
  
  
  /**
   * Sets the value of the CheckID field.
   */
  public void setCheckID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the GrossAmount field.
   */
  public void setGrossAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the GrossClaimAmount field.
   */
  public void setGrossClaimAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the GrossReservingAmount field.
   */
  public void setGrossReservingAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  public void setReservingCurrency(typekey.Currency value);
  
  
  
}