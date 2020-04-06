package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MedicalContactStatus.eti;MedicalContactStatus.eix;MedicalContactStatus.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MedicalContactStatusInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.MedicalContactStatus {
  /**
   * Gets the value of the Claim field.
   * Foreign key to Claim entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimContact field.
   * Foreign key to Contact entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the CommunicationDate field.
   * Date of contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCommunicationDate();
  
  
  /**
   * Gets the value of the InfoSource field.
   * Medical information source.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InfoSource getInfoSource();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the MedicalTreatmentStatus field.
   * Medical treatment status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MedicalTreatmentStatus getMedicalTreatmentStatus();
  
  
  /**
   * Gets the value of the NextFollowUpDate field.
   * Date of next follow-up.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getNextFollowUpDate();
  
  
  /**
   * Gets the value of the TreatmentOutcome field.
   * Medical treatment outcome.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TreatmentOutcome getTreatmentOutcome();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value);
  
  
  public void setClaimContactID(gw.pl.persistence.core.Key value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CommunicationDate field.
   */
  public void setCommunicationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the InfoSource field.
   */
  public void setInfoSource(typekey.InfoSource value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the MedicalTreatmentStatus field.
   */
  public void setMedicalTreatmentStatus(typekey.MedicalTreatmentStatus value);
  
  
  /**
   * Sets the value of the NextFollowUpDate field.
   */
  public void setNextFollowUpDate(java.util.Date value);
  
  
  /**
   * Sets the value of the TreatmentOutcome field.
   */
  public void setTreatmentOutcome(typekey.TreatmentOutcome value);
  
  
  
}