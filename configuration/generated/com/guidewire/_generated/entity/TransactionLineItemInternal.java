package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionLineItem.eti;TransactionLineItem.eix;TransactionLineItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TransactionLineItemInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.impl.TransactionLineItemInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.entity.TransactionLineItem {
  /**
   * Gets the value of the ClaimAmount field.
   * The amount of this line item in the Claim's currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getClaimAmount();
  
  
  /**
   * Gets the value of the ClaimForExAmount field.
   * The foreign exchange adjustment for this line item in the claim currency. This stores the amount by which the current value of ClaimAmount exceeds its original value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getClaimForExAmount();
  
  
  /**
   * Gets the value of the Comments field.
   * A note or description of the line item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the Deductible field.
   * The deductible for which this transaction line item is applied, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Deductible getDeductible();
  
  
  public gw.pl.persistence.core.Key getDeductibleID();
  
  
  /**
   * Gets the value of the LineCategory field.
   * The category of this line item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LineCategory getLineCategory();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ReportingAmount field.
   * The amount of this line item in the app's default currency (reporting currency).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReportingAmount();
  
  
  /**
   * Gets the value of the ReportingForExAmount field.
   * The foreign exchange adjustment for this line item in the reporting currency. This stores the amount by which the current value of ReportingAmount exceeds its original value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReportingForExAmount();
  
  
  /**
   * Gets the value of the ReservingAmount field.
   * The amount of this line item in the Currency of the ReserveLine (ReservingCurrency).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReservingAmount();
  
  
  /**
   * Gets the value of the ReservingForExAmount field.
   * The foreign exchange adjustment for this line item in the reserving currency. This stores the amount by which the current value of ReservingAmount exceeds its original value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReservingForExAmount();
  
  
  /**
   * Gets the value of the Transaction field.
   * The parent transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Transaction getTransaction();
  
  
  /**
   * Gets the value of the TransactionAmount field.
   * The amount of this line item, in the transaction currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTransactionAmount();
  
  
  public gw.pl.persistence.core.Key getTransactionID();
  
  
  /**
   * Sets the value of the ClaimAmount field.
   */
  public void setClaimAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ClaimForExAmount field.
   */
  public void setClaimForExAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the Deductible field.
   */
  public void setDeductible(entity.Deductible value);
  
  
  public void setDeductibleID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LineCategory field.
   */
  public void setLineCategory(typekey.LineCategory value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReportingAmount field.
   */
  public void setReportingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReportingForExAmount field.
   */
  public void setReportingForExAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReservingAmount field.
   */
  public void setReservingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReservingForExAmount field.
   */
  public void setReservingForExAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Transaction field.
   */
  public void setTransaction(entity.Transaction value);
  
  
  /**
   * Sets the value of the TransactionAmount field.
   */
  public void setTransactionAmount(gw.api.financials.CurrencyAmount value);
  
  
  public void setTransactionID(gw.pl.persistence.core.Key value);
  
  
  
}