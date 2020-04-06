package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AssessmentContentItem.eti;AssessmentContentItem.eix;AssessmentContentItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AssessmentContentItemInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.AssessmentContentItem {
  /**
   * Gets the value of the Action field.
   * AssessmentContentAction
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AssessmentContentAction getAction();
  
  
  /**
   * Gets the value of the AmountAfterLimit field.
   * The amount payable on the item(s)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAmountAfterLimit();
  
  
  /**
   * Gets the value of the AssessmentSource field.
   * Related AssessmentSource if applicable
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssessmentSource getAssessmentSource();
  
  
  public gw.pl.persistence.core.Key getAssessmentSourceID();
  
  
  /**
   * Gets the value of the Brand field.
   * Brand Name / Manufacturer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBrand();
  
  
  /**
   * Gets the value of the ContentCategory field.
   * Assessment Category for Property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContentLineItemCategory getContentCategory();
  
  
  /**
   * Gets the value of the ContentSchedule field.
   * Assessment Schedule for Property
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContentLineItemSchedule getContentSchedule();
  
  
  /**
   * Gets the value of the DateAcquired field.
   * Date when this item was acquired
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateAcquired();
  
  
  /**
   * Gets the value of the Depreciation field.
   * Depreciation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getDepreciation();
  
  
  /**
   * Gets the value of the DepreciationPercentage field.
   * Depreciation percentage, per year
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDepreciationPercentage();
  
  
  /**
   * Gets the value of the Description field.
   * Assessment line.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Incident field.
   * Related Incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident getIncident();
  
  
  public gw.pl.persistence.core.Key getIncidentID();
  
  
  /**
   * Gets the value of the IncidentOrder field.
   * Order of the item on the Incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIncidentOrder();
  
  
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
   * Gets the value of the NumberOfItems field.
   * Number of Items
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumberOfItems();
  
  
  /**
   * Gets the value of the PurchaseCost field.
   * PurchaseCost
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getPurchaseCost();
  
  
  /**
   * Gets the value of the ReplacementValue field.
   * Estimated cost of replacing item(s)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReplacementValue();
  
  
  /**
   * Gets the value of the Salvage field.
   * Salvage
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSalvage();
  
  
  /**
   * Gets the value of the VehicleCategory field.
   * AssessmentCatetory for Vehicles
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VehicleLineItemCategory getVehicleCategory();
  
  
  /**
   * Gets the value of the ProofOfOwnershipProvided field.
   * Did the loss occur on this leg of the schedule
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isProofOfOwnershipProvided();
  
  
  /**
   * Sets the value of the Action field.
   */
  public void setAction(typekey.AssessmentContentAction value);
  
  
  /**
   * Sets the value of the AmountAfterLimit field.
   */
  public void setAmountAfterLimit(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the AssessmentSource field.
   */
  public void setAssessmentSource(entity.AssessmentSource value);
  
  
  public void setAssessmentSourceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Brand field.
   */
  public void setBrand(java.lang.String value);
  
  
  /**
   * Sets the value of the ContentCategory field.
   */
  public void setContentCategory(typekey.ContentLineItemCategory value);
  
  
  /**
   * Sets the value of the ContentSchedule field.
   */
  public void setContentSchedule(typekey.ContentLineItemSchedule value);
  
  
  /**
   * Sets the value of the DateAcquired field.
   */
  public void setDateAcquired(java.util.Date value);
  
  
  /**
   * Sets the value of the Depreciation field.
   */
  public void setDepreciation(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the DepreciationPercentage field.
   */
  public void setDepreciationPercentage(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Incident field.
   */
  public void setIncident(entity.Incident value);
  
  
  public void setIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the IncidentOrder field.
   */
  public void setIncidentOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ItemComment field.
   */
  public void setItemComment(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumberOfItems field.
   */
  public void setNumberOfItems(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ProofOfOwnershipProvided field.
   */
  public void setProofOfOwnershipProvided(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PurchaseCost field.
   */
  public void setPurchaseCost(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ReplacementValue field.
   */
  public void setReplacementValue(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Salvage field.
   */
  public void setSalvage(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the VehicleCategory field.
   */
  public void setVehicleCategory(typekey.VehicleLineItemCategory value);
  
  
  
}