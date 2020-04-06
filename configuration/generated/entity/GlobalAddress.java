package entity;

/**
 * GlobalAddress
 * 
 *     This is a shared delegate/interface that allows multiple entities to share definitions of removable globalization fields associated with Addresses.
 *   
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GlobalAddress.eti;GlobalAddress.eix;GlobalAddress.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface GlobalAddress extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.GlobalAddress> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.GlobalAddress>("entity.GlobalAddress");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSLINE1KANJI_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("AddressLine1Kanji", "AddressLine1Kanji");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ADDRESSLINE2KANJI_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("AddressLine2Kanji", "AddressLine2Kanji");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CEDEX_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CEDEX", "CEDEX");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CEDEXBUREAU_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CEDEXBureau", "CEDEXBureau");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CITYKANJI_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CityKanji", "CityKanji");
  
  /**
   * Gets the value of the AddressLine1Kanji field.
   * First line of mailing address in kanji (used only for Japanese addresses and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine1Kanji();
  
  
  /**
   * Gets the value of the AddressLine2Kanji field.
   * Second line of mailing address in kanji (used only for Japanese addresses and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressLine2Kanji();
  
  
  /**
   * Gets the value of the CEDEXBureau field.
   * CEDEX: Special business mail delivery bureau (used only for French addresses and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCEDEXBureau();
  
  
  /**
   * Gets the value of the CityKanji field.
   * City in kanji (used only for Japanese addresses and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCityKanji();
  
  
  /**
   * Gets the value of the CEDEX field.
   * CEDEX: Special business mail delivery flag (used only for French addresses and will be null otherwise)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCEDEX();
  
  
  /**
   * Sets the value of the AddressLine1Kanji field.
   */
  public void setAddressLine1Kanji(java.lang.String value);
  
  
  /**
   * Sets the value of the AddressLine2Kanji field.
   */
  public void setAddressLine2Kanji(java.lang.String value);
  
  
  /**
   * Sets the value of the CEDEX field.
   */
  public void setCEDEX(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the CEDEXBureau field.
   */
  public void setCEDEXBureau(java.lang.String value);
  
  
  /**
   * Sets the value of the CityKanji field.
   */
  public void setCityKanji(java.lang.String value);
  
  
  
}