package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactFingerprint.eti;ContactFingerprint.eix;ContactFingerprint.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactFingerprintInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.OverlapTableInternal, com.guidewire.pl.system.bundle.InsertCallback {
  /**
   * Gets the value of the AddressBookFingerprint field.
   * Fingerprint allowing for a convertible object to check its last sync status locally.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressBookFingerprint();
  
  
  /**
   * Gets the value of the Contact field.
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
   * Sets the value of the AddressBookFingerprint field.
   */
  public void setAddressBookFingerprint(java.lang.String value);
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}