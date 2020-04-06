package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AutomatedNotificationHandler.eti;AutomatedNotificationHandler.eix;AutomatedNotificationHandler.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AutomatedNotificationHandlerInternal extends com.guidewire._generated.entity.AutomatedHandlerInternal, gw.api.specialhandling.AutomatedHandlerMethods, gw.cc.specialhandling.entity.AutomatedNotificationHandler {
  /**
   * Adds the given element to the EmailAddresses array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToEmailAddresses(entity.SpecialHandlingEmailAddress element);
  
  
  /**
   * Gets the value of the EmailAddress field.
   * Email address to which the generated email should be sent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailAddress();
  
  
  /**
   * Gets the value of the EmailAddresses field.
   * Email addresses for multi-recipient lists.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialHandlingEmailAddress[] getEmailAddresses();
  
  
  /**
   * Gets the value of the EmailRole field.
   * This is set when email address should be determined dynamically based on the contact assigned to this role.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactRole getEmailRole();
  
  
  /**
   * Gets the value of the EmailTemplate field.
   * The ID of the email template to use when generating the email after the associated trigger fires.  The id gets passed to IEmailTemplateSource to retrieve the EmailTemplateDescriptor.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailTemplate();
  
  
  /**
   * Gets the value of the NotificationType field.
   * Notification type for either notification to a fixed email address or a specific contact on a claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NotificationType getNotificationType();
  
  
  /**
   * Removes the given element from the EmailAddresses array. This is achieved by marking the element for removal.
   */
  public void removeFromEmailAddresses(entity.SpecialHandlingEmailAddress element);
  
  
  /**
   * Removes the given element from the EmailAddresses array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromEmailAddresses(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the EmailAddress field.
   */
  public void setEmailAddress(java.lang.String value);
  
  
  /**
   * Sets the value of the EmailAddresses field.
   */
  public void setEmailAddresses(entity.SpecialHandlingEmailAddress[] value);
  
  
  /**
   * Sets the value of the EmailRole field.
   */
  public void setEmailRole(typekey.ContactRole value);
  
  
  /**
   * Sets the value of the EmailTemplate field.
   */
  public void setEmailTemplate(java.lang.String value);
  
  
  /**
   * Sets the value of the NotificationType field.
   */
  public void setNotificationType(typekey.NotificationType value);
  
  
  
}