package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ExchangeRateSet.eti;ExchangeRateSet.eix;ExchangeRateSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ExchangeRateSetInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.pl.domain.currency.ExchangeRateSetPublicMethods, com.guidewire.pl.domain.currency.impl.ExchangeRateSetInternalMethods, com.guidewire.pl.system.bundle.InsertCallback {
  /**
   * Adds the given element to the ExchangeRates array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToExchangeRates(entity.ExchangeRate element);
  
  
  /**
   * Gets the value of the Description field.
   * A longer description of the rate set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the EffectiveDate field.
   * The date and time this rate set becomes effective.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEffectiveDate();
  
  
  /**
   * Gets the value of the ExchangeRates field.
   * ExchangeRates in this ExchangeRateSet.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExchangeRate[] getExchangeRates();
  
  
  /**
   * Gets the value of the ExpireDate field.
   * The date and time this rate set is no longer effective.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpireDate();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * The name of the rate set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the MarketRates field.
   * True if this rate set should be included in search for latest market rates.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMarketRates();
  
  
  /**
   * Removes the given element from the ExchangeRates array. This is achieved by marking the element for removal.
   */
  public void removeFromExchangeRates(entity.ExchangeRate element);
  
  
  /**
   * Removes the given element from the ExchangeRates array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromExchangeRates(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the EffectiveDate field.
   */
  public void setEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExchangeRates field.
   */
  public void setExchangeRates(entity.ExchangeRate[] value);
  
  
  /**
   * Sets the value of the ExpireDate field.
   */
  public void setExpireDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MarketRates field.
   */
  public void setMarketRates(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  
}