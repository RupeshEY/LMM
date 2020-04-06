package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMarketFinancialAmount_Ext.eti;ECFMarketFinancialAmount_Ext.eix;ECFMarketFinancialAmount_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMarketFinancialAmount_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the Carrier field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimDataCarrier_Ext getCarrier();
  
  
  public gw.pl.persistence.core.Key getCarrierID();
  
  
  /**
   * Gets the value of the CashSettlementAmount field.
   * The amount to be settled in cash by the company, in settlement currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getCashSettlementAmount();
  
  
  /**
   * Gets the value of the CashSettlementAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCashSettlementAmount_amt();
  
  
  /**
   * Gets the value of the CashSettlementAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCashSettlementAmount_cur();
  
  
  /**
   * Gets the value of the LetterOfCreditAmount field.
   * The amount to be settled by Letter of Credit by the company, in settlement currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLetterOfCreditAmount();
  
  
  /**
   * Gets the value of the LetterOfCreditAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLetterOfCreditAmount_amt();
  
  
  /**
   * Gets the value of the LetterOfCreditAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLetterOfCreditAmount_cur();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the Carrier field.
   */
  public void setCarrier(entity.ECFMessageClaimDataCarrier_Ext value);
  
  
  public void setCarrierID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CashSettlementAmount field.
   */
  public void setCashSettlementAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the CashSettlementAmount_amt field.
   */
  public void setCashSettlementAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the CashSettlementAmount_cur field.
   */
  public void setCashSettlementAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LetterOfCreditAmount field.
   */
  public void setLetterOfCreditAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the LetterOfCreditAmount_amt field.
   */
  public void setLetterOfCreditAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LetterOfCreditAmount_cur field.
   */
  public void setLetterOfCreditAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}