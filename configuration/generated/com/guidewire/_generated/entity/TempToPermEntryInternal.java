package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TempToPermEntry.eti;TempToPermEntry.eix;TempToPermEntry.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TempToPermEntryInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the ContactUpdateResult field.
   * The ContactUpdateResult which owns this entry.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactUpdateResult getContactUpdateResult();
  
  
  public gw.pl.persistence.core.Key getContactUpdateResultID();
  
  
  /**
   * Gets the value of the PermId field.
   * The permanent AddressBookUId given by the address book
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPermId();
  
  
  /**
   * Gets the value of the TempId field.
   * The temporary id given by an UpdateBatch CreateUpdateOp
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTempId();
  
  
  /**
   * Sets the value of the ContactUpdateResult field.
   */
  public void setContactUpdateResult(entity.ContactUpdateResult value);
  
  
  public void setContactUpdateResultID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PermId field.
   */
  public void setPermId(java.lang.String value);
  
  
  /**
   * Sets the value of the TempId field.
   */
  public void setTempId(java.lang.String value);
  
  
  
}