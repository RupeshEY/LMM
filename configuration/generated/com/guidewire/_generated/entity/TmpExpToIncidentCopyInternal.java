package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpExpToIncidentCopy.eti;TmpExpToIncidentCopy.eix;TmpExpToIncidentCopy.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpExpToIncidentCopyInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.exposure.entity.TmpExpToIncidentCopy {
  /**
   * Gets the value of the DetailedInjuryTypeTmp field.
   * The DetailedInjuryType value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DetailedInjuryType getDetailedInjuryTypeTmp();
  
  
  /**
   * Gets the value of the GeneralInjuryTypeTmp field.
   * The GeneralInjuryType value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InjuryType getGeneralInjuryTypeTmp();
  
  
  /**
   * Gets the value of the ImpairmentTmp field.
   * The Impairment value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getImpairmentTmp();
  
  
  /**
   * Gets the value of the IncidentID field.
   * The ID of the incident to be updated by a join to this temp table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getIncidentID();
  
  
  /**
   * Gets the value of the MedicaltrtmntTypeTmp field.
   * The MedicalTreatmentType value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MedicalTreatmentType getMedicaltrtmntTypeTmp();
  
  
  /**
   * Gets the value of the SeverityTmp field.
   * The SeverityType value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SeverityType getSeverityTmp();
  
  
  /**
   * Gets the value of the LostWagesTmp field.
   * The LostWages value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLostWagesTmp();
  
  
  /**
   * Sets the value of the DetailedInjuryTypeTmp field.
   */
  public void setDetailedInjuryTypeTmp(typekey.DetailedInjuryType value);
  
  
  /**
   * Sets the value of the GeneralInjuryTypeTmp field.
   */
  public void setGeneralInjuryTypeTmp(typekey.InjuryType value);
  
  
  /**
   * Sets the value of the ImpairmentTmp field.
   */
  public void setImpairmentTmp(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the IncidentID field.
   */
  public void setIncidentID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LostWagesTmp field.
   */
  public void setLostWagesTmp(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the MedicaltrtmntTypeTmp field.
   */
  public void setMedicaltrtmntTypeTmp(typekey.MedicalTreatmentType value);
  
  
  /**
   * Sets the value of the SeverityTmp field.
   */
  public void setSeverityTmp(typekey.SeverityType value);
  
  
  
}