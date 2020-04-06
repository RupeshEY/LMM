package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AssessmentItem.eti;AssessmentItem.eix;AssessmentItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AssessmentItemInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.AssessmentItem {
  /**
   * Gets the value of the Action field.
   * AssessmentAction
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssessmentAction getAction();
  
  
  /**
   * Gets the value of the AssessmentSource field.
   * Related AssessmentSource if applicable
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssessmentSource getAssessmentSource();
  
  
  public gw.pl.persistence.core.Key getAssessmentSourceID();
  
  
  /**
   * Gets the value of the Description field.
   * Assessment line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the EstimateAmount field.
   * Assessment Amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getEstimateAmount();
  
  
  /**
   * Gets the value of the Incident field.
   * Related Incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident getIncident();
  
  
  public gw.pl.persistence.core.Key getIncidentID();
  
  
  /**
   * Gets the value of the ItemComment field.
   * Assessment Item Comment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getItemComment();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PropertyCategory field.
   * Assessment Category for Property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PropertyLineItemCategory getPropertyCategory();
  
  
  /**
   * Gets the value of the VehicleCategory field.
   * AssessmentCatetory for Vehicles
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehicleLineItemCategory getVehicleCategory();
  
  
  /**
   * Sets the value of the Action field.
   */
  public void setAction(typekey.AssessmentAction value);
  
  
  /**
   * Sets the value of the AssessmentSource field.
   */
  public void setAssessmentSource(entity.AssessmentSource value);
  
  
  public void setAssessmentSourceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the EstimateAmount field.
   */
  public void setEstimateAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Incident field.
   */
  public void setIncident(entity.Incident value);
  
  
  public void setIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ItemComment field.
   */
  public void setItemComment(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PropertyCategory field.
   */
  public void setPropertyCategory(typekey.PropertyLineItemCategory value);
  
  
  /**
   * Sets the value of the VehicleCategory field.
   */
  public void setVehicleCategory(typekey.VehicleLineItemCategory value);
  
  
  
}