package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicySearchCriteria.eti;PolicySearchCriteria.eix;PolicySearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicySearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.policy.impl.PolicySearchCriteriaInternal, gw.cc.policy.entity.PolicySearchCriteria, java.io.Serializable {
  /**
   * Gets the value of the CompanyName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCompanyName();
  
  
  /**
   * Gets the value of the ContactType field.
   * Type of contact to search for
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SearchContactType getContactType();
  
  
  /**
   * Gets the value of the FirstName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstName();
  
  
  /**
   * Gets the value of the FirstNameKanji field.
   * First name in kanji (used only for Japanese names and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstNameKanji();
  
  
  /**
   * Gets the value of the InsuredAddress field.
   * The address of the insured.  Supercedes the separate fields of City, State, and PostalCode.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getInsuredAddress();
  
  
  public gw.pl.persistence.core.Key getInsuredAddressID();
  
  
  /**
   * Gets the value of the LastName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastName();
  
  
  /**
   * Gets the value of the LastNameKanji field.
   * Last name in kanji (used only for Japanese names and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastNameKanji();
  
  
  /**
   * Gets the value of the LossDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate();
  
  
  /**
   * Gets the value of the LossType field.
   * Type of loss.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType();
  
  
  /**
   * Gets the value of the NameKanji field.
   * This contact's name in kanji (used only for Japanese names and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameKanji();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Gets the value of the PropertyAddress field.
   * The address of the property.  Generalizes and supercedes the existing PropertyCity field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getPropertyAddress();
  
  
  public gw.pl.persistence.core.Key getPropertyAddressID();
  
  
  /**
   * Gets the value of the TaxIdString field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTaxIdString();
  
  
  /**
   * Gets the value of the Vin field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVin();
  
  
  /**
   * Gets the value of the IncludeArchived field.
   * Include archived olicies in results
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeArchived();
  
  
  /**
   * Sets the value of the CompanyName field.
   */
  public void setCompanyName(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactType field.
   */
  public void setContactType(typekey.SearchContactType value);
  
  
  /**
   * Sets the value of the FirstName field.
   */
  public void setFirstName(java.lang.String value);
  
  
  /**
   * Sets the value of the FirstNameKanji field.
   */
  public void setFirstNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the IncludeArchived field.
   */
  public void setIncludeArchived(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the InsuredAddress field.
   */
  public void setInsuredAddress(entity.Address value);
  
  
  public void setInsuredAddressID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LastName field.
   */
  public void setLastName(java.lang.String value);
  
  
  /**
   * Sets the value of the LastNameKanji field.
   */
  public void setLastNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the LossDate field.
   */
  public void setLossDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value);
  
  
  /**
   * Sets the value of the NameKanji field.
   */
  public void setNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the PropertyAddress field.
   */
  public void setPropertyAddress(entity.Address value);
  
  
  public void setPropertyAddressID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TaxIdString field.
   */
  public void setTaxIdString(java.lang.String value);
  
  
  /**
   * Sets the value of the Vin field.
   */
  public void setVin(java.lang.String value);
  
  
  
}