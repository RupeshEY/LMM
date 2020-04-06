package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WCBenefitFactorDetail.eti;WCBenefitFactorDetail.eix;WCBenefitFactorDetail.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WCBenefitFactorDetailInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.exposure.entity.WCBenefitFactorDetail {
  /**
   * Gets the value of the DetailedFactor field.
   * Used to track notes, exceptions, etc. related to WC Benefits
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WCBenefitFactorType getDetailedFactor();
  
  
  /**
   * Gets the value of the FactorCategory field.
   * Category of the factor: Duration, EE attribute, etc.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WCBenefitFactorCategory getFactorCategory();
  
  
  /**
   * Gets the value of the FactorComment field.
   * Comment explaining the reasoning behind this event status line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFactorComment();
  
  
  /**
   * Gets the value of the FactorValue field.
   * Tracks a value related to the Footnote
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFactorValue();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the WCBenefitParameterSet field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WCBenefitParameterSet getWCBenefitParameterSet();
  
  
  public gw.pl.persistence.core.Key getWCBenefitParameterSetID();
  
  
  /**
   * Gets the value of the AppliesToPPD field.
   * If true, this footnote does not apply to PPD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToPPD();
  
  
  /**
   * Gets the value of the AppliesToPTD field.
   * If true, this footnote does not apply to PTD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToPTD();
  
  
  /**
   * Gets the value of the AppliesToTPD field.
   * If true, this footnote does not apply to TPD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToTPD();
  
  
  /**
   * Gets the value of the AppliesToTTD field.
   * If true, this footnote does not apply to TTD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAppliesToTTD();
  
  
  /**
   * Sets the value of the AppliesToPPD field.
   */
  public void setAppliesToPPD(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the AppliesToPTD field.
   */
  public void setAppliesToPTD(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the AppliesToTPD field.
   */
  public void setAppliesToTPD(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the AppliesToTTD field.
   */
  public void setAppliesToTTD(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DetailedFactor field.
   */
  public void setDetailedFactor(typekey.WCBenefitFactorType value);
  
  
  /**
   * Sets the value of the FactorCategory field.
   */
  public void setFactorCategory(typekey.WCBenefitFactorCategory value);
  
  
  /**
   * Sets the value of the FactorComment field.
   */
  public void setFactorComment(java.lang.String value);
  
  
  /**
   * Sets the value of the FactorValue field.
   */
  public void setFactorValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the WCBenefitParameterSet field.
   */
  public void setWCBenefitParameterSet(entity.WCBenefitParameterSet value);
  
  
  public void setWCBenefitParameterSetID(gw.pl.persistence.core.Key value);
  
  
  
}