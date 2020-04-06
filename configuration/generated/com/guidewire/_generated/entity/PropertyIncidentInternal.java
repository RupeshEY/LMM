package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PropertyIncident.eti;PropertyIncident.eix;PropertyIncident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PropertyIncidentInternal extends com.guidewire._generated.entity.IncidentInternal, gw.cc.exposure.entity.PropertyIncident {
  /**
   * Adds the given element to the LodgingProviders array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLodgingProviders(entity.LodgingProvider element);
  
  
  /**
   * Adds the given element to the TypeofProperty array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTypeofProperty(entity.TypeofProperty element);
  
  
  /**
   * Gets the value of the AppraisalFirstAppointment field.
   * @deprecated Scheduled time for the Appraisal from First Notice.  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the RequestedQuoteCompletionDate of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAppraisalFirstAppointment();
  
  
  /**
   * Gets the value of the DescOther field.
   * Other Description
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescOther();
  
  
  /**
   * Gets the value of the EstDamageType field.
   * Total estimate of damage for the event, if known, at the time that the loss was reported. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.EstDamageType getEstDamageType();
  
  
  /**
   * Gets the value of the EstRepairCost field.
   * Estimated Repair Cost
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getEstRepairCost();
  
  
  /**
   * Gets the value of the EstRepairTime field.
   * Estimated Repair Time
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEstRepairTime();
  
  
  /**
   * Gets the value of the EstimatesReceived field.
   * Have the repair estimates been received
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.YesNo getEstimatesReceived();
  
  
  /**
   * Gets the value of the ExtDamagetxt field.
   * extent of damage to property text
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExtDamagetxt();
  
  
  /**
   * Gets the value of the LodgingProviders field.
   * Lodging providers for this incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LodgingProvider[] getLodgingProviders();
  
  
  /**
   * Gets the value of the MealsDays field.
   * Number of days of meals
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMealsDays();
  
  
  /**
   * Gets the value of the MealsPeople field.
   * Number of people requiring meals
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMealsPeople();
  
  
  /**
   * Gets the value of the MealsRate field.
   * Daily rate of meals
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getMealsRate();
  
  
  /**
   * Gets the value of the PropertyDesc field.
   * Description of property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPropertyDesc();
  
  
  /**
   * Gets the value of the TypeofProperty field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TypeofProperty[] getTypeofProperty();
  
  
  /**
   * Gets the value of the WhenToView field.
   * @deprecated Possible dates when the damage may be viewed.  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the RequestedQuoteCompletionDate of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWhenToView();
  
  
  /**
   * Gets the value of the AlreadyRepaired field.
   * Has the item been repaired already?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAlreadyRepaired();
  
  
  /**
   * Gets the value of the InspectionRequired field.
   * @deprecated Is an inspection required? Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInspectionRequired();
  
  
  /**
   * Gets the value of the LossofUse field.
   * Whether there has been loss of use
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLossofUse();
  
  
  /**
   * Removes the given element from the LodgingProviders array. This is achieved by marking the element for removal.
   */
  public void removeFromLodgingProviders(entity.LodgingProvider element);
  
  
  /**
   * Removes the given element from the LodgingProviders array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLodgingProviders(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the TypeofProperty array. This is achieved by marking the element for removal.
   */
  public void removeFromTypeofProperty(entity.TypeofProperty element);
  
  
  /**
   * Removes the given element from the TypeofProperty array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTypeofProperty(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AlreadyRepaired field.
   */
  public void setAlreadyRepaired(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the AppraisalFirstAppointment field.
   * @deprecated Scheduled time for the Appraisal from First Notice.  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the RequestedQuoteCompletionDate of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
   */
  @java.lang.Deprecated
  public void setAppraisalFirstAppointment(java.util.Date value);
  
  
  /**
   * Sets the value of the DescOther field.
   */
  public void setDescOther(java.lang.String value);
  
  
  /**
   * Sets the value of the EstDamageType field.
   */
  public void setEstDamageType(typekey.EstDamageType value);
  
  
  /**
   * Sets the value of the EstRepairCost field.
   */
  public void setEstRepairCost(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the EstRepairTime field.
   */
  public void setEstRepairTime(java.lang.String value);
  
  
  /**
   * Sets the value of the EstimatesReceived field.
   */
  public void setEstimatesReceived(typekey.YesNo value);
  
  
  /**
   * Sets the value of the ExtDamagetxt field.
   */
  public void setExtDamagetxt(java.lang.String value);
  
  
  /**
   * Sets the value of the InspectionRequired field.
   * @deprecated Is an inspection required? Deprecated: No longer used in the base configuration.  The equivalent of a true value for this field in 8.0 is the presence of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
   */
  @java.lang.Deprecated
  public void setInspectionRequired(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LodgingProviders field.
   */
  public void setLodgingProviders(entity.LodgingProvider[] value);
  
  
  /**
   * Sets the value of the LossofUse field.
   */
  public void setLossofUse(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the MealsDays field.
   */
  public void setMealsDays(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MealsPeople field.
   */
  public void setMealsPeople(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MealsRate field.
   */
  public void setMealsRate(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the PropertyDesc field.
   */
  public void setPropertyDesc(java.lang.String value);
  
  
  /**
   * Sets the value of the TypeofProperty field.
   */
  public void setTypeofProperty(entity.TypeofProperty[] value);
  
  
  /**
   * Sets the value of the WhenToView field.
   * @deprecated Possible dates when the damage may be viewed.  Deprecated: No longer used in the base configuration.  The equivalent of this field in 8.0 is the RequestedQuoteCompletionDate of a ServiceRequest with the 'Property - Inspection - Appraisal' service.
   */
  @java.lang.Deprecated
  public void setWhenToView(java.lang.String value);
  
  
  
}