package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionView.eti;TransactionView.eix;TransactionView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TransactionViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.financials.entity.TransactionView {
  /**
   * Gets the value of the Amount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAmount();
  
  
  /**
   * Gets the value of the ClaimAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getClaimAmount();
  
  
  /**
   * Gets the value of the ClaimCurrency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimCurrency();
  
  
  /**
   * Gets the value of the CostCategory field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostCategory getCostCategory();
  
  
  /**
   * Gets the value of the CostType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostType getCostType();
  
  
  /**
   * Gets the value of the CoverageType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getCoverageType();
  
  
  /**
   * Gets the value of the CreateTime field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime();
  
  
  /**
   * Gets the value of the Currency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the Exposure field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the ExposureName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExposureName();
  
  
  /**
   * Gets the value of the ReservingAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReservingAmount();
  
  
  /**
   * Gets the value of the ReservingCurrency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency();
  
  
  /**
   * Gets the value of the Status field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionStatus getStatus();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionView getSubtype();
  
  
  /**
   * Gets the value of the Transaction field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction getTransaction();
  
  
  public gw.pl.persistence.core.Key getTransactionID();
  
  
  /**
   * Gets the value of the User field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUser();
  
  
  /**
   * Sets the value of the Amount field.
   */
  public void setAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ClaimAmount field.
   */
  public void setClaimAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ClaimCurrency field.
   */
  public void setClaimCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the CostCategory field.
   */
  public void setCostCategory(typekey.CostCategory value);
  
  
  /**
   * Sets the value of the CostType field.
   */
  public void setCostType(typekey.CostType value);
  
  
  /**
   * Sets the value of the CoverageType field.
   */
  public void setCoverageType(typekey.CoverageType value);
  
  
  /**
   * Sets the value of the CreateTime field.
   */
  public void setCreateTime(java.util.Date value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ExposureName field.
   */
  public void setExposureName(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ReservingAmount field.
   */
  public void setReservingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  public void setReservingCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.TransactionStatus value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.TransactionView value);
  
  
  /**
   * Sets the value of the Transaction field.
   */
  public void setTransaction(entity.Transaction value);
  
  
  public void setTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(java.lang.String value);
  
  
  
}