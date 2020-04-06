package entity;

/**
 * TripAccommodationDelegate
 * Fields common to both TripAccommodation and AddnlTripAccommodation
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TripAccommodationDelegate.eti;TripAccommodationDelegate.eix;TripAccommodationDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface TripAccommodationDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TripAccommodationDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TripAccommodationDelegate>("entity.TripAccommodationDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ADDRESS_DYNPROP = new com.guidewire.commons.metadata.types.LinkDynPropertyInfo("Address", "AddressID");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PROPERTYNAME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PropertyName", "PropertyName");
  
  /**
   * Gets the value of the Address field.
   * Address for the planned accommodation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getAddress();
  
  
  /**
   * Gets the value of the PropertyName field.
   * Name of the accommodation booked
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPropertyName();
  
  
  /**
   * Sets the value of the Address field.
   */
  public void setAddress(entity.Address value);
  
  
  /**
   * Sets the value of the PropertyName field.
   */
  public void setPropertyName(java.lang.String value);
  
  
  
}