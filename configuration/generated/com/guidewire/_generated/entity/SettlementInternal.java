package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Settlement.eti;Settlement.eix;Settlement.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SettlementInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.Settlement {
  /**
   * Gets the value of the BenefitType field.
   * Type of lost wages benefit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LostWagesBenefitType getBenefitType();
  
  
  /**
   * Gets the value of the Description field.
   * Additional information.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Exposure field.
   * The related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the SettleAmount field.
   * Settlement amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSettleAmount();
  
  
  /**
   * Gets the value of the SettleDate field.
   * Date of settlement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSettleDate();
  
  
  /**
   * Gets the value of the SettleMethod field.
   * Method of settlement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SettleMethod getSettleMethod();
  
  
  /**
   * Sets the value of the BenefitType field.
   */
  public void setBenefitType(typekey.LostWagesBenefitType value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the SettleAmount field.
   */
  public void setSettleAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the SettleDate field.
   */
  public void setSettleDate(java.util.Date value);
  
  
  /**
   * Sets the value of the SettleMethod field.
   */
  public void setSettleMethod(typekey.SettleMethod value);
  
  
  
}