package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactInfo.eti;ContactInfo.eix;ContactInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactInfoInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.GlobalContactNameInternal, com.guidewire._generated.entity.GlobalPersonNameInternal, gw.cc.claim.archiving.entity.ContactInfo {
  /**
   * Gets the value of the ClaimInfo field.
   * The contact for the archived claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo();
  
  
  public gw.pl.persistence.core.Key getClaimInfoID();
  
  
  /**
   * Gets the value of the FirstName field.
   * First name on Person.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstName();
  
  
  /**
   * Gets the value of the FirstNameDenorm field.
   * denorm field for FirstName
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstNameDenorm();
  
  
  /**
   * Gets the value of the LastName field.
   * Last name on Person.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastName();
  
  
  /**
   * Gets the value of the LastNameDenorm field.
   * denorm field for LastName
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastNameDenorm();
  
  
  /**
   * Gets the value of the MiddleName field.
   * Middle name or initial.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMiddleName();
  
  
  /**
   * Gets the value of the Name field.
   * This contact's name on Contact or Last name on person.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the NameDenorm field.
   * denorm field for Name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameDenorm();
  
  
  /**
   * Gets the value of the Prefix field.
   * Prefix for the person's name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NamePrefix getPrefix();
  
  
  /**
   * Gets the value of the Role field.
   * The role of the contact in relation to the claim, exposure, or matter.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactRole getRole();
  
  
  /**
   * Gets the value of the Suffix field.
   * Suffix for the person's name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NameSuffix getSuffix();
  
  
  /**
   * Gets the value of the TaxID field.
   * Tax ID for the contact (SSN or EIN) on contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTaxID();
  
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  public void setClaimInfo(entity.ClaimInfo value);
  
  
  public void setClaimInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FirstName field.
   */
  public void setFirstName(java.lang.String value);
  
  
  /**
   * Sets the value of the FirstNameDenorm field.
   */
  public void setFirstNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the LastName field.
   */
  public void setLastName(java.lang.String value);
  
  
  /**
   * Sets the value of the LastNameDenorm field.
   */
  public void setLastNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the MiddleName field.
   */
  public void setMiddleName(java.lang.String value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the NameDenorm field.
   */
  public void setNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the Prefix field.
   */
  public void setPrefix(typekey.NamePrefix value);
  
  
  /**
   * Sets the value of the Role field.
   */
  public void setRole(typekey.ContactRole value);
  
  
  /**
   * Sets the value of the Suffix field.
   */
  public void setSuffix(typekey.NameSuffix value);
  
  
  /**
   * Sets the value of the TaxID field.
   */
  public void setTaxID(java.lang.String value);
  
  
  
}