package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Person.eti;Person.eix;Person.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PersonInternal extends com.guidewire._generated.entity.ContactInternal, com.guidewire._generated.entity.GlobalPersonNameInternal, com.guidewire.pl.domain.contact.ContactPublicMethods {
  /**
   * Gets the value of the CellPhone field.
   * Mobile phone number associated with the contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCellPhone();
  
  
  /**
   * Gets the value of the CellPhoneCountry field.
   * Mobile phone country.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PhoneCountryCode getCellPhoneCountry();
  
  
  /**
   * Gets the value of the CellPhoneExtension field.
   * Mobile phone extension.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCellPhoneExtension();
  
  
  /**
   * Gets the value of the ClaimantIDType field.
   * Workers' Comp only. Claimant ID Type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimantIDType getClaimantIDType();
  
  
  /**
   * Gets the value of the DateOfBirth field.
   * Date of birth.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateOfBirth();
  
  
  /**
   * Gets the value of the EducationLevel field.
   * Workers' Comp only. The highest number of years or equivalency level of formal education completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEducationLevel();
  
  
  /**
   * Gets the value of the EmployeeSecurityID field.
   *  A unique number designated by the jurisdiction to be used in conjunction with or in the place of the Employee ID. If the jurisdiction requires the Employee Security ID, the jurisdiction must return the Employee Security ID in the acknowledgment to promote future reporting of the designated value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmployeeSecurityID();
  
  
  /**
   * Gets the value of the FirstName field.
   * First name.
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
   * Gets the value of the FormerName field.
   * Person's former name, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFormerName();
  
  
  /**
   * Gets the value of the Gender field.
   * Gender.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GenderType getGender();
  
  
  /**
   * Gets the value of the GreenCardNumber field.
   * Workers' Comp only. Employee Green Card Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getGreenCardNumber();
  
  
  /**
   * Gets the value of the JurisdictionAssignedID field.
   * Workers' Comp only. Employee ID Assigned by Jurisdiction
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getJurisdictionAssignedID();
  
  
  /**
   * Gets the value of the LastName field.
   * Last name.
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
   * Gets the value of the LicenseNumber field.
   * Driver's license number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLicenseNumber();
  
  
  /**
   * Gets the value of the LicenseState field.
   * Driver's license jurisdiction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getLicenseState();
  
  
  /**
   * Gets the value of the MaritalStatus field.
   * Marital status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.MaritalStatus getMaritalStatus();
  
  
  /**
   * Gets the value of the MiddleName field.
   * Middle name or initial.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMiddleName();
  
  
  /**
   * Gets the value of the NumDependents field.
   * Number of dependents the employee has.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumDependents();
  
  
  /**
   * Gets the value of the NumDependentsU18 field.
   * Number of dependents under 18.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumDependentsU18();
  
  
  /**
   * Gets the value of the NumDependentsU25 field.
   * Number of dependents over 18 and under 25.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumDependentsU25();
  
  
  /**
   * Gets the value of the Occupation field.
   * Occupation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOccupation();
  
  
  /**
   * Gets the value of the PassportNumber field.
   * Workers' Comp only. Employee Passport Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPassportNumber();
  
  
  /**
   * Gets the value of the Prefix field.
   * Prefix for the person's name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NamePrefix getPrefix();
  
  
  /**
   * Gets the value of the Suffix field.
   * Suffix for the person's name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NameSuffix getSuffix();
  
  
  /**
   * Gets the value of the TaxExemptionsEntitled field.
   * Workers' Comp only. Tax Exemptions Entitled.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTaxExemptionsEntitled();
  
  
  /**
   * Gets the value of the TaxFilingStatus field.
   * State-specific field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TaxFilingStatusType getTaxFilingStatus();
  
  
  /**
   * Gets the value of the VisaNumber field.
   * Workers' Comp only. Employee Employment Visa Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVisaNumber();
  
  
  /**
   * Gets the value of the SSNReleaseAuthorized field.
   * Workers' Comp only. SSN Release Authorized
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSSNReleaseAuthorized();
  
  
  /**
   * Sets the value of the CellPhone field.
   */
  public void setCellPhone(java.lang.String value);
  
  
  /**
   * Sets the value of the CellPhoneCountry field.
   */
  public void setCellPhoneCountry(typekey.PhoneCountryCode value);
  
  
  /**
   * Sets the value of the CellPhoneExtension field.
   */
  public void setCellPhoneExtension(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimantIDType field.
   */
  public void setClaimantIDType(typekey.ClaimantIDType value);
  
  
  /**
   * Sets the value of the DateOfBirth field.
   */
  public void setDateOfBirth(java.util.Date value);
  
  
  /**
   * Sets the value of the EducationLevel field.
   */
  public void setEducationLevel(java.lang.String value);
  
  
  /**
   * Sets the value of the EmployeeSecurityID field.
   */
  public void setEmployeeSecurityID(java.lang.String value);
  
  
  /**
   * Sets the value of the FirstName field.
   */
  public void setFirstName(java.lang.String value);
  
  
  /**
   * Sets the value of the FirstNameDenorm field.
   */
  public void setFirstNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the FormerName field.
   */
  public void setFormerName(java.lang.String value);
  
  
  /**
   * Sets the value of the Gender field.
   */
  public void setGender(typekey.GenderType value);
  
  
  /**
   * Sets the value of the GreenCardNumber field.
   */
  public void setGreenCardNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the JurisdictionAssignedID field.
   */
  public void setJurisdictionAssignedID(java.lang.String value);
  
  
  /**
   * Sets the value of the LastName field.
   */
  public void setLastName(java.lang.String value);
  
  
  /**
   * Sets the value of the LastNameDenorm field.
   */
  public void setLastNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the LicenseNumber field.
   */
  public void setLicenseNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the LicenseState field.
   */
  public void setLicenseState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the MaritalStatus field.
   */
  public void setMaritalStatus(typekey.MaritalStatus value);
  
  
  /**
   * Sets the value of the MiddleName field.
   */
  public void setMiddleName(java.lang.String value);
  
  
  /**
   * Sets the value of the NumDependents field.
   */
  public void setNumDependents(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumDependentsU18 field.
   */
  public void setNumDependentsU18(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumDependentsU25 field.
   */
  public void setNumDependentsU25(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Occupation field.
   */
  public void setOccupation(java.lang.String value);
  
  
  /**
   * Sets the value of the PassportNumber field.
   */
  public void setPassportNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Prefix field.
   */
  public void setPrefix(typekey.NamePrefix value);
  
  
  /**
   * Sets the value of the SSNReleaseAuthorized field.
   */
  public void setSSNReleaseAuthorized(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Suffix field.
   */
  public void setSuffix(typekey.NameSuffix value);
  
  
  /**
   * Sets the value of the TaxExemptionsEntitled field.
   */
  public void setTaxExemptionsEntitled(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TaxFilingStatus field.
   */
  public void setTaxFilingStatus(typekey.TaxFilingStatusType value);
  
  
  /**
   * Sets the value of the VisaNumber field.
   */
  public void setVisaNumber(java.lang.String value);
  
  
  
}