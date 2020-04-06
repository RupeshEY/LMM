package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Attorney.eti;Attorney.eix;Attorney.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AttorneyInternal extends com.guidewire._generated.entity.PersonVendorInternal {
  /**
   * Gets the value of the AttorneyLicense field.
   * Attorney's business license number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAttorneyLicense();
  
  
  /**
   * Gets the value of the AttorneySpecialty field.
   * Attorney's specialty
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LegalSpecialty getAttorneySpecialty();
  
  
  /**
   * Sets the value of the AttorneyLicense field.
   */
  public void setAttorneyLicense(java.lang.String value);
  
  
  /**
   * Sets the value of the AttorneySpecialty field.
   */
  public void setAttorneySpecialty(typekey.LegalSpecialty value);
  
  
  
}