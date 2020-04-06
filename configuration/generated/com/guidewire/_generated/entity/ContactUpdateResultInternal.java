package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactUpdateResult.eti;ContactUpdateResult.eix;ContactUpdateResult.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactUpdateResultInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Adds the given element to the TempToPermEntrys array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTempToPermEntrys(entity.TempToPermEntry element);
  
  
  /**
   * Gets the value of the Contact field.
   * Gets the Contact that was created or updated. Ignored if errors occurred.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact();
  
  
  public gw.pl.persistence.core.Key getContactID();
  
  
  /**
   * Gets the value of the ContactValidationResult field.
   * Used to report any errors that occurred during creation or update. May be null to report no errors.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ValidationResult getContactValidationResult();
  
  
  public gw.pl.persistence.core.Key getContactValidationResultID();
  
  
  /**
   * Gets the value of the TempToPermEntrys field.
   * The address book's mapping of the given temp ids to permanent ids
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TempToPermEntry[] getTempToPermEntrys();
  
  
  /**
   * Removes the given element from the TempToPermEntrys array. This is achieved by marking the element for removal.
   */
  public void removeFromTempToPermEntrys(entity.TempToPermEntry element);
  
  
  /**
   * Removes the given element from the TempToPermEntrys array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTempToPermEntrys(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ContactValidationResult field.
   */
  public void setContactValidationResult(entity.ValidationResult value);
  
  
  public void setContactValidationResultID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TempToPermEntrys field.
   */
  public void setTempToPermEntrys(entity.TempToPermEntry[] value);
  
  
  
}