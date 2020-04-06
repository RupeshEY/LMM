package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactTag.eti;ContactTag.eix;ContactTag.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactTagInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.AddressBookLinkableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.OverlapTableInternal, com.guidewire.cc.domain.contact.impl.ContactTagCoreExtMethods {
  /**
   * Gets the value of the Contact field.
   * Contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact();
  
  
  public gw.pl.persistence.core.Key getContactID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Type field.
   * Type of this ContactTag.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactTagType getType();
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.ContactTagType value);
  
  
  
}