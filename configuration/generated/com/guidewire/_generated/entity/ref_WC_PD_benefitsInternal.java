package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ref_WC_PD_benefits.eti;ref_WC_PD_benefits.eix;ref_WC_PD_benefits.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ref_WC_PD_benefitsInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.WC_PD_LimitsDelegateInternal, com.guidewire.cc.domain.exposure.impl.ref_WC_PD_benefitsInternal, gw.cc.exposure.entity.ref_WC_PD_benefits {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Max_DisabilityPercent field.
   * Maximum PD Disability Percentage
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getMax_DisabilityPercent();
  
  
  /**
   * Gets the value of the Min_DisabilityPercent field.
   * Minimum PD Disability Percentage
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getMin_DisabilityPercent();
  
  
  /**
   * Gets the value of the PD_MaxBenefit field.
   * State PD Benefit Maximum
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPD_MaxBenefit();
  
  
  /**
   * Gets the value of the PD_MinBenefit field.
   * State PD Benefit Minimum
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPD_MinBenefit();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Max_DisabilityPercent field.
   */
  public void setMax_DisabilityPercent(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Min_DisabilityPercent field.
   */
  public void setMin_DisabilityPercent(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PD_MaxBenefit field.
   */
  public void setPD_MaxBenefit(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PD_MinBenefit field.
   */
  public void setPD_MinBenefit(java.math.BigDecimal value);
  
  
  
}