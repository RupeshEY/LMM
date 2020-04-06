package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicySummary.eti;PolicySummary.eix;PolicySummary.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicySummaryInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.policy.entity.PolicySummary {
  /**
   * Adds the given element to the Properties array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToProperties(entity.PolicySummaryProperty element);
  
  
  /**
   * Adds the given element to the Vehicles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToVehicles(entity.PolicySummaryVehicle element);
  
  
  /**
   * Gets the value of the Address field.
   * @deprecated Deprecated, please use AddressLine1, AddressLine2 instead
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddress();
  
  
  /**
   * Gets the value of the AddressLine1 field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine1();
  
  
  /**
   * Gets the value of the AddressLine1Kanji field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine1Kanji();
  
  
  /**
   * Gets the value of the AddressLine2 field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine2();
  
  
  /**
   * Gets the value of the AddressLine2Kanji field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine2Kanji();
  
  
  /**
   * Gets the value of the City field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCity();
  
  
  /**
   * Gets the value of the CityKanji field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCityKanji();
  
  
  /**
   * Gets the value of the EffectiveDate field.
   * Date on which the policy is effective.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEffectiveDate();
  
  
  /**
   * Gets the value of the ExpirationDate field.
   * Date on which the policy expires.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpirationDate();
  
  
  /**
   * Gets the value of the InsuredName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInsuredName();
  
  
  /**
   * Gets the value of the LossDate field.
   * Loss date on the Claim for which the summary was retrieved. Useful in some policy systems to determine what policy version this summary represents.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossDate();
  
  
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
   * Gets the value of the PostalCode field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPostalCode();
  
  
  /**
   * Gets the value of the ProducerCode field.
   * Agency that sold the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getProducerCode();
  
  
  /**
   * Gets the value of the Properties field.
   * List of properties (in summary form) covered by the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicySummaryProperty[] getProperties();
  
  
  /**
   * Gets the value of the PropertyInvolved field.
   * If non-null, only this property is required for the Claim; others should be omitted from the returned Policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicySummaryProperty getPropertyInvolved();
  
  
  public gw.pl.persistence.core.Key getPropertyInvolvedID();
  
  
  /**
   * Gets the value of the State field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getState();
  
  
  /**
   * Gets the value of the Status field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyStatus getStatus();
  
  
  /**
   * Gets the value of the VehicleInvolved field.
   * If non-null, only this vehicle is required for the Claim; others should be omitted from the returned Policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicySummaryVehicle getVehicleInvolved();
  
  
  public gw.pl.persistence.core.Key getVehicleInvolvedID();
  
  
  /**
   * Gets the value of the Vehicles field.
   * List of vehicles (in summary form) covered by the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicySummaryVehicle[] getVehicles();
  
  
  /**
   * Removes the given element from the Properties array. This is achieved by marking the element for removal.
   */
  public void removeFromProperties(entity.PolicySummaryProperty element);
  
  
  /**
   * Removes the given element from the Properties array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromProperties(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Vehicles array. This is achieved by marking the element for removal.
   */
  public void removeFromVehicles(entity.PolicySummaryVehicle element);
  
  
  /**
   * Removes the given element from the Vehicles array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromVehicles(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Address field.
   * @deprecated Deprecated, please use AddressLine1, AddressLine2 instead
   */
  @java.lang.Deprecated
  public void setAddress(java.lang.String value);
  
  
  /**
   * Sets the value of the AddressLine1 field.
   */
  public void setAddressLine1(java.lang.String value);
  
  
  /**
   * Sets the value of the AddressLine1Kanji field.
   */
  public void setAddressLine1Kanji(java.lang.String value);
  
  
  /**
   * Sets the value of the AddressLine2 field.
   */
  public void setAddressLine2(java.lang.String value);
  
  
  /**
   * Sets the value of the AddressLine2Kanji field.
   */
  public void setAddressLine2Kanji(java.lang.String value);
  
  
  /**
   * Sets the value of the City field.
   */
  public void setCity(java.lang.String value);
  
  
  /**
   * Sets the value of the CityKanji field.
   */
  public void setCityKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the EffectiveDate field.
   */
  public void setEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExpirationDate field.
   */
  public void setExpirationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the InsuredName field.
   */
  public void setInsuredName(java.lang.String value);
  
  
  /**
   * Sets the value of the LossDate field.
   */
  public void setLossDate(java.util.Date value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the PostalCode field.
   */
  public void setPostalCode(java.lang.String value);
  
  
  /**
   * Sets the value of the ProducerCode field.
   */
  public void setProducerCode(java.lang.String value);
  
  
  /**
   * Sets the value of the Properties field.
   */
  public void setProperties(entity.PolicySummaryProperty[] value);
  
  
  /**
   * Sets the value of the PropertyInvolved field.
   */
  public void setPropertyInvolved(entity.PolicySummaryProperty value);
  
  
  public void setPropertyInvolvedID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.State value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.PolicyStatus value);
  
  
  /**
   * Sets the value of the VehicleInvolved field.
   */
  public void setVehicleInvolved(entity.PolicySummaryVehicle value);
  
  
  public void setVehicleInvolvedID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Vehicles field.
   */
  public void setVehicles(entity.PolicySummaryVehicle[] value);
  
  
  
}