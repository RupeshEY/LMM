package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MedicalCareOrg.eti;MedicalCareOrg.eix;MedicalCareOrg.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MedicalCareOrgInternal extends com.guidewire._generated.entity.CompanyVendorInternal {
  /**
   * Gets the value of the MedicalOrgSpecialty field.
   * Medical specialty
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SpecialtyType getMedicalOrgSpecialty();
  
  
  /**
   * Sets the value of the MedicalOrgSpecialty field.
   */
  public void setMedicalOrgSpecialty(typekey.SpecialtyType value);
  
  
  
}