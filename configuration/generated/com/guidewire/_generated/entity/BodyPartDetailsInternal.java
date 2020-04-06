package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BodyPartDetails.eti;BodyPartDetails.eix;BodyPartDetails.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BodyPartDetailsInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.BodyPartDetails {
  /**
   * Gets the value of the CompensabilityComments field.
   * Comments on compensability of injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCompensabilityComments();
  
  
  /**
   * Gets the value of the CompensabilityDecision field.
   * Decision on compensability for this body part.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CompensabilityDecision getCompensabilityDecision();
  
  
  /**
   * Gets the value of the CompensabilityDecisionDate field.
   * Decision Date of compensability.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCompensabilityDecisionDate();
  
  
  /**
   * Gets the value of the DetailedBodyPart field.
   * Specific body part. Choices filtered by PrimaryBodyPart.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DetailedBodyPartType getDetailedBodyPart();
  
  
  /**
   * Gets the value of the DetailedBodyPartDesc field.
   * Description of Detailed Body Part
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DetailedBodyPartDesc getDetailedBodyPartDesc();
  
  
  /**
   * Gets the value of the ImpairmentPercentage field.
   * Percentage of Permanment Impairment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getImpairmentPercentage();
  
  
  /**
   * Gets the value of the Incident field.
   * The foreign key to the Indicent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.InjuryIncident getIncident();
  
  
  public gw.pl.persistence.core.Key getIncidentID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Ordering field.
   * Order of the body parts (i.e. First BodyPart should be lowest), based on importance or order entered.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOrdering();
  
  
  /**
   * Gets the value of the PrimaryBodyPart field.
   * Area of the body where the body part is located.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BodyPartType getPrimaryBodyPart();
  
  
  /**
   * Gets the value of the SideOfBody field.
   * Side Of Body
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SideOfBody getSideOfBody();
  
  
  /**
   * Sets the value of the CompensabilityComments field.
   */
  public void setCompensabilityComments(java.lang.String value);
  
  
  /**
   * Sets the value of the CompensabilityDecision field.
   */
  public void setCompensabilityDecision(typekey.CompensabilityDecision value);
  
  
  /**
   * Sets the value of the CompensabilityDecisionDate field.
   */
  public void setCompensabilityDecisionDate(java.util.Date value);
  
  
  /**
   * Sets the value of the DetailedBodyPart field.
   */
  public void setDetailedBodyPart(typekey.DetailedBodyPartType value);
  
  
  /**
   * Sets the value of the DetailedBodyPartDesc field.
   */
  public void setDetailedBodyPartDesc(typekey.DetailedBodyPartDesc value);
  
  
  /**
   * Sets the value of the ImpairmentPercentage field.
   */
  public void setImpairmentPercentage(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Incident field.
   */
  public void setIncident(entity.InjuryIncident value);
  
  
  public void setIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Ordering field.
   */
  public void setOrdering(java.lang.Integer value);
  
  
  /**
   * Sets the value of the PrimaryBodyPart field.
   */
  public void setPrimaryBodyPart(typekey.BodyPartType value);
  
  
  /**
   * Sets the value of the SideOfBody field.
   */
  public void setSideOfBody(typekey.SideOfBody value);
  
  
  
}