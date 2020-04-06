package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AddressCorrection.eti;AddressCorrection.eix;AddressCorrection.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AddressCorrectionInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.OverlapTableInternal, com.guidewire.pl.domain.contact.impl.AddressCorrectionInternalMethods {
  /**
   * Gets the value of the Address field.
   * The Address that has been corrected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getAddress();
  
  
  public gw.pl.persistence.core.Key getAddressID();
  
  
  /**
   * Gets the value of the AddressLine1 field.
   * First line of original mailing address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine1();
  
  
  /**
   * Gets the value of the AddressLine2 field.
   * Second line of original mailing address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine2();
  
  
  /**
   * Gets the value of the City field.
   * Original City.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCity();
  
  
  /**
   * Gets the value of the CorrectedAddressLine1 field.
   * First line of corrected mailing address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCorrectedAddressLine1();
  
  
  /**
   * Gets the value of the CorrectedAddressLine2 field.
   * Second line of corrected mailing address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCorrectedAddressLine2();
  
  
  /**
   * Gets the value of the CorrectedCity field.
   * Corrected City.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCorrectedCity();
  
  
  /**
   * Gets the value of the CorrectedCountry field.
   * Corrected Country.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCorrectedCountry();
  
  
  /**
   * Gets the value of the CorrectedCounty field.
   * Corrected County.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCorrectedCounty();
  
  
  /**
   * Gets the value of the CorrectedPostalCode field.
   * Corrected Postal code; string to handle Zip+4 and international codes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCorrectedPostalCode();
  
  
  /**
   * Gets the value of the CorrectedState field.
   * Corrected State.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCorrectedState();
  
  
  /**
   * Gets the value of the Country field.
   * Original Country.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Country getCountry();
  
  
  /**
   * Gets the value of the County field.
   * Original County.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCounty();
  
  
  /**
   * Gets the value of the PostalCode field.
   * Original Postal code; string to handle Zip+4 and international codes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPostalCode();
  
  
  /**
   * Gets the value of the State field.
   * Original State.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getState();
  
  
  /**
   * Sets the value of the Address field.
   */
  public void setAddress(entity.Address value);
  
  
  public void setAddressID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the AddressLine1 field.
   */
  public void setAddressLine1(java.lang.String value);
  
  
  /**
   * Sets the value of the AddressLine2 field.
   */
  public void setAddressLine2(java.lang.String value);
  
  
  /**
   * Sets the value of the City field.
   */
  public void setCity(java.lang.String value);
  
  
  /**
   * Sets the value of the CorrectedAddressLine1 field.
   */
  public void setCorrectedAddressLine1(java.lang.String value);
  
  
  /**
   * Sets the value of the CorrectedAddressLine2 field.
   */
  public void setCorrectedAddressLine2(java.lang.String value);
  
  
  /**
   * Sets the value of the CorrectedCity field.
   */
  public void setCorrectedCity(java.lang.String value);
  
  
  /**
   * Sets the value of the CorrectedCountry field.
   */
  public void setCorrectedCountry(java.lang.String value);
  
  
  /**
   * Sets the value of the CorrectedCounty field.
   */
  public void setCorrectedCounty(java.lang.String value);
  
  
  /**
   * Sets the value of the CorrectedPostalCode field.
   */
  public void setCorrectedPostalCode(java.lang.String value);
  
  
  /**
   * Sets the value of the CorrectedState field.
   */
  public void setCorrectedState(java.lang.String value);
  
  
  /**
   * Sets the value of the Country field.
   */
  public void setCountry(typekey.Country value);
  
  
  /**
   * Sets the value of the County field.
   */
  public void setCounty(java.lang.String value);
  
  
  /**
   * Sets the value of the PostalCode field.
   */
  public void setPostalCode(java.lang.String value);
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.State value);
  
  
  
}