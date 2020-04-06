package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionEditWrapper.eti;TransactionEditWrapper.eix;TransactionEditWrapper.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TransactionEditWrapperInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.financials.impl.TransactionEditWrapperInternal, gw.cc.financials.entity.TransactionEditWrapper {
  /**
   * Gets the value of the NewReservingAmount field.
   * Internal storage of the amount in the reserving currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNewReservingAmount();
  
  
  /**
   * Gets the value of the NewTransactionAmount field.
   * Internal storage of the amount in the transaction currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNewTransactionAmount();
  
  
  /**
   * Gets the value of the PrevBaseAmount field.
   * The base amount in the reserving currency for the reserve line corresponding to this row. This is intended to help determine whether the base amount has changed and therefore whether the amount properties should be reset when the reserve line changes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPrevBaseAmount();
  
  
  /**
   * Gets the value of the PrevReservingCurrency field.
   * The previous reserving currency for the reserve line corresponding to this row. This is intended to help determine whether the reserving currency has changed and therefore whether the amount properties should be reset when the reserve line changes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPrevReservingCurrency();
  
  
  /**
   * Gets the value of the Transaction field.
   * Wrapped transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction getTransaction();
  
  
  public gw.pl.persistence.core.Key getTransactionID();
  
  
  /**
   * Sets the value of the NewReservingAmount field.
   */
  public void setNewReservingAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the NewTransactionAmount field.
   */
  public void setNewTransactionAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PrevBaseAmount field.
   */
  public void setPrevBaseAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PrevReservingCurrency field.
   */
  public void setPrevReservingCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the Transaction field.
   */
  public void setTransaction(entity.Transaction value);
  
  
  public void setTransactionID(gw.pl.persistence.core.Key value);
  
  
  
}