package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Deduction.eti;Deduction.eix;Deduction.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DeductionInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.check.impl.DeductionInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.check.entity.Deduction {
  /**
   * Gets the value of the Check field.
   * Check to which the deduction belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check getCheck();
  
  
  public gw.pl.persistence.core.Key getCheckID();
  
  
  /**
   * Gets the value of the ClaimAmount field.
   * Amount of the deduction in the claim currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getClaimAmount();
  
  
  /**
   * Gets the value of the Comments field.
   * Description of the deduction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the DeductionType field.
   * Type of deduction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DeductionType getDeductionType();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ReportingAmount field.
   * Amount of the deduction in the reporting currency).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReportingAmount();
  
  
  /**
   * Gets the value of the ReservingAmount field.
   * Amount of the deduction in the reserving currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReservingAmount();
  
  
  /**
   * Gets the value of the TransactionAmount field.
   * Amount of the deduction in the transaction/check currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTransactionAmount();
  
  
  /**
   * Sets the value of the Check field.
   */
  public void setCheck(entity.Check value);
  
  
  public void setCheckID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimAmount field.
   */
  public void setClaimAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the DeductionType field.
   */
  public void setDeductionType(typekey.DeductionType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReportingAmount field.
   */
  public void setReportingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReservingAmount field.
   */
  public void setReservingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the TransactionAmount field.
   */
  public void setTransactionAmount(gw.api.financials.CurrencyAmount value);
  
  
  
}