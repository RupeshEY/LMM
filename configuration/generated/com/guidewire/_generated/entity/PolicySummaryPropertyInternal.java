package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicySummaryProperty.eti;PolicySummaryProperty.eix;PolicySummaryProperty.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicySummaryPropertyInternal extends com.guidewire._generated.entity.PolicySummaryRiskUnitInternal, gw.cc.policy.entity.PolicySummaryProperty {
  /**
   * Gets the value of the Address field.
   * @deprecated Deprecated, please use AddressLine1, AddressLine2 instead
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddress();
  
  
  /**
   * Gets the value of the AddressLine1 field.
   * First line of mailing address
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine1();
  
  
  /**
   * Gets the value of the AddressLine1Kanji field.
   * First line of mailing address Kanji
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine1Kanji();
  
  
  /**
   * Gets the value of the AddressLine2 field.
   * Second line of mailing address
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine2();
  
  
  /**
   * Gets the value of the AddressLine2Kanji field.
   * Second line of mailing address Kanji
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine2Kanji();
  
  
  /**
   * Gets the value of the BuildingNumber field.
   * Building number of the property.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBuildingNumber();
  
  
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
   * Gets the value of the Description field.
   * Description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Location field.
   * Location number of the property.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLocation();
  
  
  /**
   * Gets the value of the Notes field.
   * Other notes on the property.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNotes();
  
  
  /**
   * Gets the value of the PropertyNumber field.
   * Number of the property on the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPropertyNumber();
  
  
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
   * Sets the value of the BuildingNumber field.
   */
  public void setBuildingNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the City field.
   */
  public void setCity(java.lang.String value);
  
  
  /**
   * Sets the value of the CityKanji field.
   */
  public void setCityKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Location field.
   */
  public void setLocation(java.lang.String value);
  
  
  /**
   * Sets the value of the Notes field.
   */
  public void setNotes(java.lang.String value);
  
  
  /**
   * Sets the value of the PropertyNumber field.
   */
  public void setPropertyNumber(java.lang.Integer value);
  
  
  
}