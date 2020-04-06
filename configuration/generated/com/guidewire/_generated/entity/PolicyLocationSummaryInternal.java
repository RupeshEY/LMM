package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicyLocationSummary.eti;PolicyLocationSummary.eix;PolicyLocationSummary.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicyLocationSummaryInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.AddressAutofillableInternal, gw.cc.catastrophe.entity.PolicyLocationSummary {
  /**
   * Adds the given element to the ClaimJoin array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimJoin(entity.PolicyLocationSummaryJoin element);
  
  
  /**
   * Gets the value of the Catastrophe field.
   * Associated catastrophe.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Catastrophe getCatastrophe();
  
  
  public gw.pl.persistence.core.Key getCatastropheID();
  
  
  /**
   * Gets the value of the ClaimJoin field.
   * Link to get to associated claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocationSummaryJoin[] getClaimJoin();
  
  
  /**
   * Gets the value of the EmailAddress field.
   * Email address of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailAddress();
  
  
  /**
   * Gets the value of the GeocodeStatus field.
   * Enum giving the status of the latitude and longitude data.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GeocodeStatus getGeocodeStatus();
  
  
  /**
   * Gets the value of the InsuredAddressLine1 field.
   * First line of primary insured address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredAddressLine1();
  
  
  /**
   * Gets the value of the InsuredAddressLine2 field.
   * Second line of primary insured address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredAddressLine2();
  
  
  /**
   * Gets the value of the InsuredAddressLine3 field.
   * Third line of primary insured address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredAddressLine3();
  
  
  /**
   * Gets the value of the InsuredCity field.
   * City of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredCity();
  
  
  /**
   * Gets the value of the InsuredCityDenorm field.
   * denorm field for InsuredCity
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredCityDenorm();
  
  
  /**
   * Gets the value of the InsuredCountry field.
   * Country of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Country getInsuredCountry();
  
  
  /**
   * Gets the value of the InsuredCounty field.
   * County of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredCounty();
  
  
  /**
   * Gets the value of the InsuredName field.
   * Name of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredName();
  
  
  /**
   * Gets the value of the InsuredPostalCode field.
   * Postal code of the primary insured; string to handle Zip+4 and international codes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredPostalCode();
  
  
  /**
   * Gets the value of the InsuredPostalCodeDenorm field.
   * denorm field for InsuredPostalCode
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredPostalCodeDenorm();
  
  
  /**
   * Gets the value of the InsuredState field.
   * State of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getInsuredState();
  
  
  /**
   * Gets the value of the Latitude field.
   * Latitude expressed in degrees.  Positive = North; Negative = South: -90 <= x <= 90
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLatitude();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Longitude field.
   * Longitude expressed in degrees relative to the prime meridian.  Positive = East; Negative = West: -180 <= x < 180
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLongitude();
  
  
  /**
   * Gets the value of the Phone field.
   * Phone number of the primary insured.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPhone();
  
  
  /**
   * Gets the value of the PhoneCountry field.
   * The phone country of the primary insured
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PhoneCountryCode getPhoneCountry();
  
  
  /**
   * Gets the value of the PhoneExtension field.
   * The phone extension of the primary insured
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPhoneExtension();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   * Number of the policy (generally a string).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the policy location in an external policy system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySystemId();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Gets the value of the TotalInsured field.
   * The total insured value for the policy location, in Reporting/Default Currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getTotalInsured();
  
  
  /**
   * Removes the given element from the ClaimJoin array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimJoin(entity.PolicyLocationSummaryJoin element);
  
  
  /**
   * Removes the given element from the ClaimJoin array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimJoin(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Catastrophe field.
   */
  public void setCatastrophe(entity.Catastrophe value);
  
  
  public void setCatastropheID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimJoin field.
   */
  public void setClaimJoin(entity.PolicyLocationSummaryJoin[] value);
  
  
  /**
   * Sets the value of the EmailAddress field.
   */
  public void setEmailAddress(java.lang.String value);
  
  
  /**
   * Sets the value of the GeocodeStatus field.
   */
  public void setGeocodeStatus(typekey.GeocodeStatus value);
  
  
  /**
   * Sets the value of the InsuredAddressLine1 field.
   */
  public void setInsuredAddressLine1(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuredAddressLine2 field.
   */
  public void setInsuredAddressLine2(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuredAddressLine3 field.
   */
  public void setInsuredAddressLine3(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuredCity field.
   */
  public void setInsuredCity(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuredCityDenorm field.
   */
  public void setInsuredCityDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuredCountry field.
   */
  public void setInsuredCountry(typekey.Country value);
  
  
  /**
   * Sets the value of the InsuredCounty field.
   */
  public void setInsuredCounty(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuredName field.
   */
  public void setInsuredName(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuredPostalCode field.
   */
  public void setInsuredPostalCode(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuredPostalCodeDenorm field.
   */
  public void setInsuredPostalCodeDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the InsuredState field.
   */
  public void setInsuredState(typekey.State value);
  
  
  /**
   * Sets the value of the Latitude field.
   */
  public void setLatitude(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Longitude field.
   */
  public void setLongitude(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Phone field.
   */
  public void setPhone(java.lang.String value);
  
  
  /**
   * Sets the value of the PhoneCountry field.
   */
  public void setPhoneCountry(typekey.PhoneCountryCode value);
  
  
  /**
   * Sets the value of the PhoneExtension field.
   */
  public void setPhoneExtension(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicySystemId field.
   */
  public void setPolicySystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the TotalInsured field.
   */
  public void setTotalInsured(gw.api.financials.CurrencyAmount value);
  
  
  
}