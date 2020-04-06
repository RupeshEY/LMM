package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CheckRpt.eti;CheckRpt.eix;CheckRpt.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CheckRptInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.check.impl.CheckRptInternal, gw.cc.financials.check.entity.CheckRpt {
  /**
   * Gets the value of the Check field.
   * The check that the calculations are on.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check getCheck();
  
  
  public gw.pl.persistence.core.Key getCheckID();
  
  
  /**
   * Gets the value of the Currency field.
   * The transaction currency of the Check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the GrossAmount field.
   * The gross amount of the check in the transaction currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossAmount();
  
  
  /**
   * Gets the value of the GrossClaimAmount field.
   * The gross amount of the check in the claim currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getGrossClaimAmount();
  
  
  /**
   * Gets the value of the GrossReservingAmount field.
   * The gross amount of the check in the reserving currency.
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
   * Sets the value of the Check field.
   */
  public void setCheck(entity.Check value);
  
  
  public void setCheckID(gw.pl.persistence.core.Key value);
  
  
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