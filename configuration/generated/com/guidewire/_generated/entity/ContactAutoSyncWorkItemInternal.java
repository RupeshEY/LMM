package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactAutoSyncWorkItem.eti;ContactAutoSyncWorkItem.eix;ContactAutoSyncWorkItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactAutoSyncWorkItemInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.WorkItemInternal, com.guidewire._generated.entity.EventAwareInternal {
  java.lang.String CONTACTAUTOSYNCFAILED_EVENT = "ContactAutoSyncFailed";
  
  java.lang.String CONTACTAUTOSYNCWORKITEMADDED_EVENT = "ContactAutoSyncWorkItemAdded";
  
  java.lang.String CONTACTAUTOSYNCWORKITEMCHANGED_EVENT = "ContactAutoSyncWorkItemChanged";
  
  java.lang.String CONTACTAUTOSYNCWORKITEMREMOVED_EVENT = "ContactAutoSyncWorkItemRemoved";
  
  /**
   * Gets the value of the AddressBookUID field.
   * Represents the AddressBookUID to be synced.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddressBookUID();
  
  
  /**
   * Gets the value of the MaxContactRef field.
   * The upper bound for the ID value in the Contact table for this work item
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMaxContactRef();
  
  
  /**
   * Gets the value of the MinContactRef field.
   * The lower bound for the ID value in the Contact table for this work item
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMinContactRef();
  
  
  /**
   * Gets the value of the NewAddressBookUID field.
   * Represents the AddressBookUID to replace the contact AddressBookUID with
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNewAddressBookUID();
  
  
  /**
   * Gets the value of the Skip field.
   * Should work item be skipped
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSkip();
  
  
  /**
   * Sets the value of the AddressBookUID field.
   */
  public void setAddressBookUID(java.lang.String value);
  
  
  /**
   * Sets the value of the MaxContactRef field.
   */
  public void setMaxContactRef(java.lang.Long value);
  
  
  /**
   * Sets the value of the MinContactRef field.
   */
  public void setMinContactRef(java.lang.Long value);
  
  
  /**
   * Sets the value of the NewAddressBookUID field.
   */
  public void setNewAddressBookUID(java.lang.String value);
  
  
  /**
   * Sets the value of the Skip field.
   */
  public void setSkip(java.lang.Boolean value);
  
  
  
}