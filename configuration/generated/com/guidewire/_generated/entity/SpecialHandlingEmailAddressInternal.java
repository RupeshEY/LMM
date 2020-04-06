package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SpecialHandlingEmailAddress.eti;SpecialHandlingEmailAddress.eix;SpecialHandlingEmailAddress.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SpecialHandlingEmailAddressInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.specialhandling.entity.SpecialHandlingEmailAddress {
  /**
   * Gets the value of the AutomatedNotificationHandler field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AutomatedNotificationHandler getAutomatedNotificationHandler();
  
  
  public gw.pl.persistence.core.Key getAutomatedNotificationHandlerID();
  
  
  /**
   * Gets the value of the EmailAddress field.
   * An email address included in a special handling notification rule.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailAddress();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the AutomatedNotificationHandler field.
   */
  public void setAutomatedNotificationHandler(entity.AutomatedNotificationHandler value);
  
  
  public void setAutomatedNotificationHandlerID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the EmailAddress field.
   */
  public void setEmailAddress(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}