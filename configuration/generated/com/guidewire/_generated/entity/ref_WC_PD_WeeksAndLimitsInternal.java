package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ref_WC_PD_WeeksAndLimits.eti;ref_WC_PD_WeeksAndLimits.eix;ref_WC_PD_WeeksAndLimits.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ref_WC_PD_WeeksAndLimitsInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.WC_PD_LimitsDelegateInternal, com.guidewire.cc.domain.exposure.impl.WC_PD_LimitsDelegateInternal, gw.cc.exposure.entity.ref_WC_PD_WeeksAndLimits {
  /**
   * Gets the value of the DisabilityPercent field.
   * PD Disability Percentage
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDisabilityPercent();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PD_NumWeeks field.
   * Number of weeks of PD Benefit to be paid
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPD_NumWeeks();
  
  
  /**
   * Sets the value of the DisabilityPercent field.
   */
  public void setDisabilityPercent(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PD_NumWeeks field.
   */
  public void setPD_NumWeeks(java.math.BigDecimal value);
  
  
  
}