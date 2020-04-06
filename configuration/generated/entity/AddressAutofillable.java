package entity;

/**
 * AddressAutofillable
 * 
 *       This is a shared delegate/interface which allows multiple entities that have address information
 *       to be able to use the autofill functionality.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AddressAutofillable.eti;AddressAutofillable.eix;AddressAutofillable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface AddressAutofillable extends entity.GlobalAddress, gw.api.address.AddressFillable {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.AddressAutofillable> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.AddressAutofillable>("entity.AddressAutofillable");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSLINE1_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("AddressLine1", "AddressLine1");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSLINE2_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("AddressLine2", "AddressLine2");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSLINE3_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("AddressLine3", "AddressLine3");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CITY_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("City", "City");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CITYDENORM_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CityDenorm", "CityDenorm");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> COUNTRY_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("Country", "Country");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> COUNTY_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("County", "County");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POSTALCODE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PostalCode", "PostalCode");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> POSTALCODEDENORM_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PostalCodeDenorm", "PostalCodeDenorm");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATE_DYNPROP = new com.guidewire.commons.metadata.types.TypekeyDynPropertyInfo("State", "State");
  
  /**
   * Gets the value of the AddressLine1 field.
   * First line of mailing address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine1();
  
  
  /**
   * Gets the value of the AddressLine2 field.
   * Second line of mailing address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine2();
  
  
  /**
   * Gets the value of the AddressLine3 field.
   * Third line of mailing address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine3();
  
  
  /**
   * Gets the value of the City field.
   * City.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCity();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCityDenorm();
  
  
  /**
   * Gets the value of the Country field.
   * Country.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Country getCountry();
  
  
  /**
   * Gets the value of the County field.
   * County.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCounty();
  
  
  /**
   * Gets the value of the PostalCode field.
   * Postal code; string to handle Zip+4 and international codes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPostalCode();
  
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPostalCodeDenorm();
  
  
  /**
   * Gets the value of the State field.
   * State.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getState();
  
  
  /**
   * Sets the value of the AddressLine1 field.
   */
  public void setAddressLine1(java.lang.String value);
  
  
  /**
   * Sets the value of the AddressLine2 field.
   */
  public void setAddressLine2(java.lang.String value);
  
  
  /**
   * Sets the value of the AddressLine3 field.
   */
  public void setAddressLine3(java.lang.String value);
  
  
  /**
   * Sets the value of the City field.
   */
  public void setCity(java.lang.String value);
  
  
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