package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageBulkClaimDetail_Ext.eti;ECFMessageBulkClaimDetail_Ext.eix;ECFMessageBulkClaimDetail_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageBulkClaimDetail_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the BulkClaim field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageBulkClaim_Ext getBulkClaim();
  
  
  public gw.pl.persistence.core.Key getBulkClaimID();
  
  
  /**
   * Gets the value of the ComponentLineNo field.
   * The component line number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getComponentLineNo();
  
  
  /**
   * Gets the value of the Currency field.
   * Reference Currency i.e. Original Currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the ImportedServicesAmount field.
   * The component claim imported services amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getImportedServicesAmount();
  
  
  /**
   * Gets the value of the ImportedServicesAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getImportedServicesAmount_amt();
  
  
  /**
   * Gets the value of the ImportedServicesAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getImportedServicesAmount_cur();
  
  
  /**
   * Gets the value of the ImportedServicesNarrative field.
   * Free format narrative to support the component claim imported services amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getImportedServicesNarrative();
  
  
  /**
   * Gets the value of the IncurredAmount field.
   * 100 % incurred amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getIncurredAmount();
  
  
  /**
   * Gets the value of the IncurredAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getIncurredAmount_amt();
  
  
  /**
   * Gets the value of the IncurredAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getIncurredAmount_cur();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the OutstandingAmount field.
   * 100 % outstanding amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getOutstandingAmount();
  
  
  /**
   * Gets the value of the OutstandingAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOutstandingAmount_amt();
  
  
  /**
   * Gets the value of the OutstandingAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getOutstandingAmount_cur();
  
  
  /**
   * Gets the value of the PaidThisTimeAmount field.
   * 100 % paid this time amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getPaidThisTimeAmount();
  
  
  /**
   * Gets the value of the PaidThisTimeAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPaidThisTimeAmount_amt();
  
  
  /**
   * Gets the value of the PaidThisTimeAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPaidThisTimeAmount_cur();
  
  
  /**
   * Gets the value of the PreviouslyPaidAmount field.
   * 100% previously paid amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getPreviouslyPaidAmount();
  
  
  /**
   * Gets the value of the PreviouslyPaidAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPreviouslyPaidAmount_amt();
  
  
  /**
   * Gets the value of the PreviouslyPaidAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPreviouslyPaidAmount_cur();
  
  
  /**
   * Gets the value of the SettlementAmount field.
   * The 100% settlement amount in settlement currency for the component claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getSettlementAmount();
  
  
  /**
   * Gets the value of the SettlementAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getSettlementAmount_amt();
  
  
  /**
   * Gets the value of the SettlementAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementAmount_cur();
  
  
  /**
   * Gets the value of the SettlementCurrency field.
   * The target currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementCurrency();
  
  
  /**
   * Gets the value of the VatAmount field.
   * The VAT amount which is included in the settlement amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getVatAmount();
  
  
  /**
   * Gets the value of the VatAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getVatAmount_amt();
  
  
  /**
   * Gets the value of the VatAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getVatAmount_cur();
  
  
  /**
   * Sets the value of the BulkClaim field.
   */
  public void setBulkClaim(entity.ECFMessageBulkClaim_Ext value);
  
  
  public void setBulkClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ComponentLineNo field.
   */
  public void setComponentLineNo(java.lang.Long value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount field.
   */
  public void setImportedServicesAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount_amt field.
   */
  public void setImportedServicesAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount_cur field.
   */
  public void setImportedServicesAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ImportedServicesNarrative field.
   */
  public void setImportedServicesNarrative(java.lang.String value);
  
  
  /**
   * Sets the value of the IncurredAmount field.
   */
  public void setIncurredAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the IncurredAmount_amt field.
   */
  public void setIncurredAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the IncurredAmount_cur field.
   */
  public void setIncurredAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the OutstandingAmount field.
   */
  public void setOutstandingAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the OutstandingAmount_amt field.
   */
  public void setOutstandingAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the OutstandingAmount_cur field.
   */
  public void setOutstandingAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the PaidThisTimeAmount field.
   */
  public void setPaidThisTimeAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the PaidThisTimeAmount_amt field.
   */
  public void setPaidThisTimeAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PaidThisTimeAmount_cur field.
   */
  public void setPaidThisTimeAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the PreviouslyPaidAmount field.
   */
  public void setPreviouslyPaidAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the PreviouslyPaidAmount_amt field.
   */
  public void setPreviouslyPaidAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PreviouslyPaidAmount_cur field.
   */
  public void setPreviouslyPaidAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the SettlementAmount field.
   */
  public void setSettlementAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the SettlementAmount_amt field.
   */
  public void setSettlementAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the SettlementAmount_cur field.
   */
  public void setSettlementAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the SettlementCurrency field.
   */
  public void setSettlementCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the VatAmount field.
   */
  public void setVatAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the VatAmount_amt field.
   */
  public void setVatAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the VatAmount_cur field.
   */
  public void setVatAmount_cur(typekey.Currency value);
  
  
  
}