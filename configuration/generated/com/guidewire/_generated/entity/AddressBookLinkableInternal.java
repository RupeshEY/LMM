package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AddressBookLinkable.eti;AddressBookLinkable.eix;AddressBookLinkable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AddressBookLinkableInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the AddressBookUID field.
   * The system uses this value when it is integrated with ContactManager and the related contact is linked.  In this case, the ID represents the ID of the corresponding entity in ContactManager. This value is null if the object is not linked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressBookUID();
  
  
  /**
   * Gets the value of the ExternalLinkID field.
   * The external link ID suggested by CC to CM when linkID is null but has been created in CC. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExternalLinkID();
  
  
  /**
   * Sets the value of the AddressBookUID field.
   */
  public void setAddressBookUID(java.lang.String value);
  
  
  /**
   * Sets the value of the ExternalLinkID field.
   */
  public void setExternalLinkID(java.lang.String value);
  
  
  
}