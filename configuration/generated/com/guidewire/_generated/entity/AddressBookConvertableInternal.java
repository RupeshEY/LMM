package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AddressBookConvertable.eti;AddressBookConvertable.eix;AddressBookConvertable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AddressBookConvertableInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, com.guidewire.pl.domain.contact.AddressBookConvertablePublicMethods, com.guidewire.pl.domain.contact.impl.AddressBookConvertableImplCallback, com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods {
  /**
   * Gets the value of the AddressBookUID field.
   * Represents the ID of the associated object in Address Book.  Null if the object is not linked to Address Book.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressBookUID();
  
  
  /**
   * Sets the value of the AddressBookUID field.
   */
  public void setAddressBookUID(java.lang.String value);
  
  
  
}