package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "InjuryDiagnosis.eti;InjuryDiagnosis.eix;InjuryDiagnosis.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface InjuryDiagnosisInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.InjuryDiagnosis {
  /**
   * Gets the value of the Comments field.
   * Comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the Contact field.
   * Provider name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact();
  
  
  public gw.pl.persistence.core.Key getContactID();
  
  
  /**
   * Gets the value of the DateEnded field.
   * The date this diagnosis was ended
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateEnded();
  
  
  /**
   * Gets the value of the DateStarted field.
   * The date this diagnosis was started
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateStarted();
  
  
  /**
   * Gets the value of the ICDCode field.
   * Key to selected ICD
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ICDCode getICDCode();
  
  
  public gw.pl.persistence.core.Key getICDCodeID();
  
  
  /**
   * Gets the value of the InjuryIncident field.
   * Injury incident this diagnosis is related to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.InjuryIncident getInjuryIncident();
  
  
  public gw.pl.persistence.core.Key getInjuryIncidentID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Compensable field.
   * Is this diagnosis compensable
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCompensable();
  
  
  /**
   * Gets the value of the IsPrimary field.
   * Indicates if this is the primary diagnosis on the incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsPrimary();
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the Compensable field.
   */
  public void setCompensable(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DateEnded field.
   */
  public void setDateEnded(java.util.Date value);
  
  
  /**
   * Sets the value of the DateStarted field.
   */
  public void setDateStarted(java.util.Date value);
  
  
  /**
   * Sets the value of the ICDCode field.
   */
  public void setICDCode(entity.ICDCode value);
  
  
  public void setICDCodeID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InjuryIncident field.
   */
  public void setInjuryIncident(entity.InjuryIncident value);
  
  
  public void setInjuryIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the IsPrimary field.
   */
  public void setIsPrimary(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}