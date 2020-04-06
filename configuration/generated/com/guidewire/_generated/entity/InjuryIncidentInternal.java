package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InjuryIncident.eti;InjuryIncident.eix;InjuryIncident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface InjuryIncidentInternal extends com.guidewire._generated.entity.IncidentInternal, gw.cc.exposure.entity.InjuryIncident {
  /**
   * Adds the given element to the BodyParts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBodyParts(entity.BodyPartDetails element);
  
  
  /**
   * Adds the given element to the InjuryDiagnoses array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToInjuryDiagnoses(entity.InjuryDiagnosis element);
  
  
  /**
   * Gets the value of the BodyParts field.
   * Details of body parts injured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BodyPartDetails[] getBodyParts();
  
  
  /**
   * Gets the value of the DetailedInjuryType field.
   * Detailed Injury category.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DetailedInjuryType getDetailedInjuryType();
  
  
  /**
   * Gets the value of the DisabledDueToAccident field.
   * For non-WC, to characterize the disability.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DisabledDueToAccident getDisabledDueToAccident();
  
  
  /**
   * Gets the value of the GeneralInjuryType field.
   * High-level categorization of the injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InjuryType getGeneralInjuryType();
  
  
  /**
   * Gets the value of the Impairment field.
   * Percentage impairment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getImpairment();
  
  
  /**
   * Gets the value of the InjuryDiagnoses field.
   * All ICD codes associated with this incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.InjuryDiagnosis[] getInjuryDiagnoses();
  
  
  /**
   * Gets the value of the MedicalTreatmentType field.
   * Type of treatment received.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MedicalTreatmentType getMedicalTreatmentType();
  
  
  /**
   * Gets the value of the ReturnToModWorkDate field.
   * the Return to Modified Work date for this claim, if ReturnToModWorkActual is true, this date is actual, otherwise it is projected 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReturnToModWorkDate();
  
  
  /**
   * Gets the value of the ReturnToWorkDate field.
   * the Return to Work date for this claim, if ReturnToWorkActual is true, this date is actual, otherwise it is projected 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReturnToWorkDate();
  
  
  /**
   * Gets the value of the AmbulanceUsed field.
   * Ambulance arrived during the loss or not.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAmbulanceUsed();
  
  
  /**
   * Gets the value of the ClaimIncident field.
   * True for the one InjuryIncident per claim that holds injury fields formerly on Claim, for Workers Comp.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isClaimIncident();
  
  
  /**
   * Gets the value of the LostWages field.
   * True if the injured person lost wages as a result of the injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLostWages();
  
  
  /**
   * Gets the value of the ReturnToModWorkActual field.
   * If true, the field, ReturnToModWorkDate, is actual; if false, then date is projected 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReturnToModWorkActual();
  
  
  /**
   * Gets the value of the ReturnToModWorkValid field.
   * True indicates that Modified Duty is applicable for this injured person and will be tracked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReturnToModWorkValid();
  
  
  /**
   * Gets the value of the ReturnToWorkActual field.
   * If true, the field, ReturnToWorkDate, is actual; if false, then date is projected 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReturnToWorkActual();
  
  
  /**
   * Gets the value of the ReturnToWorkValid field.
   * True indicates that Return to Work will be tracked for this person
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReturnToWorkValid();
  
  
  /**
   * Removes the given element from the BodyParts array. This is achieved by marking the element for removal.
   */
  public void removeFromBodyParts(entity.BodyPartDetails element);
  
  
  /**
   * Removes the given element from the BodyParts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBodyParts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the InjuryDiagnoses array. This is achieved by marking the element for removal.
   */
  public void removeFromInjuryDiagnoses(entity.InjuryDiagnosis element);
  
  
  /**
   * Removes the given element from the InjuryDiagnoses array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromInjuryDiagnoses(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AmbulanceUsed field.
   */
  public void setAmbulanceUsed(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the BodyParts field.
   */
  public void setBodyParts(entity.BodyPartDetails[] value);
  
  
  /**
   * Sets the value of the ClaimIncident field.
   */
  public void setClaimIncident(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DetailedInjuryType field.
   */
  public void setDetailedInjuryType(typekey.DetailedInjuryType value);
  
  
  /**
   * Sets the value of the DisabledDueToAccident field.
   */
  public void setDisabledDueToAccident(typekey.DisabledDueToAccident value);
  
  
  /**
   * Sets the value of the GeneralInjuryType field.
   */
  public void setGeneralInjuryType(typekey.InjuryType value);
  
  
  /**
   * Sets the value of the Impairment field.
   */
  public void setImpairment(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the InjuryDiagnoses field.
   */
  public void setInjuryDiagnoses(entity.InjuryDiagnosis[] value);
  
  
  /**
   * Sets the value of the LostWages field.
   */
  public void setLostWages(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the MedicalTreatmentType field.
   */
  public void setMedicalTreatmentType(typekey.MedicalTreatmentType value);
  
  
  /**
   * Sets the value of the ReturnToModWorkActual field.
   */
  public void setReturnToModWorkActual(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ReturnToModWorkDate field.
   */
  public void setReturnToModWorkDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ReturnToModWorkValid field.
   */
  public void setReturnToModWorkValid(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ReturnToWorkActual field.
   */
  public void setReturnToWorkActual(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ReturnToWorkDate field.
   */
  public void setReturnToWorkDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ReturnToWorkValid field.
   */
  public void setReturnToWorkValid(java.lang.Boolean value);
  
  
  
}