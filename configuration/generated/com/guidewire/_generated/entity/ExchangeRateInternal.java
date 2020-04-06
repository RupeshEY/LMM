package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExchangeRate.eti;ExchangeRate.eix;ExchangeRate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExchangeRateInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.pl.domain.currency.ExchangeRatePublicMethods, com.guidewire.pl.domain.currency.impl.ExchangeRateInternalMethods {
  /**
   * Gets the value of the BaseCurrency field.
   * From Currency. The Currency this ExchangeRate converts from.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getBaseCurrency();
  
  
  /**
   * Gets the value of the ExchangeRateSet field.
   * The ExchangeRateSet this ExchangeRate belongs to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExchangeRateSet getExchangeRateSet();
  
  
  public gw.pl.persistence.core.Key getExchangeRateSetID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the NormalizedRate field.
   * BaseUnits of BaseCurrency = NormalizedRate * 10^-RateScale * PriceUnits of PriceCurrency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNormalizedRate();
  
  
  /**
   * Gets the value of the PriceCurrency field.
   * To Currency. The Currency this ExchangeRate converts to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPriceCurrency();
  
  
  /**
   * Gets the value of the RateScale field.
   * Amount by which NormalizedRate was scaled. ExchangeRates are stored as a normalized value plus a scale so that exact floating-point exchange rates can be stored in fixed-width database columnns.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRateScale();
  
  
  /**
   * Sets the value of the BaseCurrency field.
   */
  public void setBaseCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the ExchangeRateSet field.
   */
  public void setExchangeRateSet(entity.ExchangeRateSet value);
  
  
  public void setExchangeRateSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the NormalizedRate field.
   */
  public void setNormalizedRate(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PriceCurrency field.
   */
  public void setPriceCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the RateScale field.
   */
  public void setRateScale(java.lang.Integer value);
  
  
  
}