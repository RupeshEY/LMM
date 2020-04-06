package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MedicalTreatment.eti;MedicalTreatment.eix;MedicalTreatment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MedicalTreatmentInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.MedicalTreatment {
  /**
   * Gets the value of the ActionDate field.
   * Date of the medical action.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getActionDate();
  
  
  /**
   * Gets the value of the ApprovedTreatment field.
   * Approved treatment for injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ApprovedTreatment getApprovedTreatment();
  
  
  /**
   * Gets the value of the Claim field.
   * Foreign key to Claim entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimContact field.
   * Foreign key to ClaimContact entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ICD1 field.
   * ICD-1.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getICD1();
  
  
  /**
   * Gets the value of the ICD2 field.
   * ICD-2.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getICD2();
  
  
  /**
   * Gets the value of the ICD3 field.
   * ICD-3.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getICD3();
  
  
  /**
   * Gets the value of the ICD4 field.
   * ICD-4.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getICD4();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the TreatmentQuantity field.
   * Quantity of treatments approved.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTreatmentQuantity();
  
  
  /**
   * Sets the value of the ActionDate field.
   */
  public void setActionDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ApprovedTreatment field.
   */
  public void setApprovedTreatment(typekey.ApprovedTreatment value);
  
  
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
   * Sets the value of the ICD1 field.
   */
  public void setICD1(java.lang.String value);
  
  
  /**
   * Sets the value of the ICD2 field.
   */
  public void setICD2(java.lang.String value);
  
  
  /**
   * Sets the value of the ICD3 field.
   */
  public void setICD3(java.lang.String value);
  
  
  /**
   * Sets the value of the ICD4 field.
   */
  public void setICD4(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the TreatmentQuantity field.
   */
  public void setTreatmentQuantity(java.lang.Integer value);
  
  
  
}