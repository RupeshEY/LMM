package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CCNameCriteria.eti;CCNameCriteria.eix;CCNameCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CCNameCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.custom.impl.CCNameCriteriaInternal, gw.cc.custom.entity.CCNameCriteria {
  /**
   * Gets the value of the CompanyName field.
   * The company name, if searching for a company.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCompanyName();
  
  
  /**
   * Gets the value of the FirstName field.
   * The first name, if searching for a person.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstName();
  
  
  /**
   * Gets the value of the FirstNameKanji field.
   * First name in kanji.  Used only for Japanese names and will be null otherwise.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstNameKanji();
  
  
  /**
   * Gets the value of the LastName field.
   * The last name, if searching for a person.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastName();
  
  
  /**
   * Gets the value of the LastNameKanji field.
   * Last name in kanji.  Used only for Japanese names and will be null otherwise.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastNameKanji();
  
  
  /**
   * Gets the value of the LicenseNumber field.
   * License Number to search on.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLicenseNumber();
  
  
  /**
   * Gets the value of the Name field.
   * The last name or the first name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the NameKanji field.
   * This contact's name in kanji.  Used only for Japanese names and will be null otherwise.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameKanji();
  
  
  /**
   * Gets the value of the OfficialId field.
   * Field matched against the OfficialIDValue of the OfficialID objects associated with Contacts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOfficialId();
  
  
  /**
   * Gets the value of the Phone field.
   * Phone number to search on.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPhone();
  
  
  /**
   * Gets the value of the TaxId field.
   * The contact's tax identification number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTaxId();
  
  
  /**
   * Sets the value of the CompanyName field.
   */
  public void setCompanyName(java.lang.String value);
  
  
  /**
   * Sets the value of the FirstName field.
   */
  public void setFirstName(java.lang.String value);
  
  
  /**
   * Sets the value of the FirstNameKanji field.
   */
  public void setFirstNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the LastName field.
   */
  public void setLastName(java.lang.String value);
  
  
  /**
   * Sets the value of the LastNameKanji field.
   */
  public void setLastNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the LicenseNumber field.
   */
  public void setLicenseNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the NameKanji field.
   */
  public void setNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the OfficialId field.
   */
  public void setOfficialId(java.lang.String value);
  
  
  /**
   * Sets the value of the Phone field.
   */
  public void setPhone(java.lang.String value);
  
  
  /**
   * Sets the value of the TaxId field.
   */
  public void setTaxId(java.lang.String value);
  
  
  
}