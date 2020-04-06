package entity;

/**
 * AutomatedNotificationHandler
 * 
 *         A subtype of AutomatedHandler that causes emails to be generated when the associated trigger is executed by changes to a Claim.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AutomatedNotificationHandler.eti;AutomatedNotificationHandler.eix;AutomatedNotificationHandler.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class AutomatedNotificationHandler extends entity.AutomatedHandler implements gw.api.specialhandling.AutomatedHandlerMethods {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.AutomatedNotificationHandler> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.AutomatedNotificationHandler>("entity.AutomatedNotificationHandler");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EMAILADDRESS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EmailAddress");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> EMAILADDRESSES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "EmailAddresses");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> EMAILROLE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "EmailRole");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EMAILTEMPLATE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EmailTemplate");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> NOTIFICATIONTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "NotificationType");
  
  protected AutomatedNotificationHandler(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.AutomatedNotificationHandlerInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.AutomatedNotificationHandlerInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.AutomatedNotificationHandlerInternal)super.__getInternalInterface();
  }
  
  /**
   * Adds the given element to the EmailAddresses array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToEmailAddresses(entity.SpecialHandlingEmailAddress element) {
    __getInternalInterface().addArrayElement(EMAILADDRESSES_PROP.get(), element);
  }
  
  /**
   * Gets the value of the EmailAddress field.
   * Email address to which the generated email should be sent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailAddress() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMAILADDRESS_PROP.get());
  }
  
  /**
   * Gets the value of the EmailAddresses field.
   * Email addresses for multi-recipient lists.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialHandlingEmailAddress[] getEmailAddresses() {
    return (entity.SpecialHandlingEmailAddress[])__getInternalInterface().getFieldValue(EMAILADDRESSES_PROP.get());
  }
  
  /**
   * Gets the value of the EmailRole field.
   * This is set when email address should be determined dynamically based on the contact assigned to this role.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactRole getEmailRole() {
    return (typekey.ContactRole)__getInternalInterface().getFieldValue(EMAILROLE_PROP.get());
  }
  
  /**
   * Gets the value of the EmailTemplate field.
   * The ID of the email template to use when generating the email after the associated trigger fires.  The id gets passed to IEmailTemplateSource to retrieve the EmailTemplateDescriptor.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailTemplate() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMAILTEMPLATE_PROP.get());
  }
  
  /**
   * Gets the value of the NotificationType field.
   * Notification type for either notification to a fixed email address or a specific contact on a claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NotificationType getNotificationType() {
    return (typekey.NotificationType)__getInternalInterface().getFieldValue(NOTIFICATIONTYPE_PROP.get());
  }
  
  /**
   * Removes the given element from the EmailAddresses array. This is achieved by marking the element for removal.
   */
  public void removeFromEmailAddresses(entity.SpecialHandlingEmailAddress element) {
    __getInternalInterface().removeArrayElement(EMAILADDRESSES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the EmailAddresses array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromEmailAddresses(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(EMAILADDRESSES_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the EmailAddress field.
   */
  public void setEmailAddress(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EMAILADDRESS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmailAddresses field.
   */
  public void setEmailAddresses(entity.SpecialHandlingEmailAddress[] value) {
    __getInternalInterface().setFieldValue(EMAILADDRESSES_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmailRole field.
   */
  public void setEmailRole(typekey.ContactRole value) {
    __getInternalInterface().setFieldValue(EMAILROLE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmailTemplate field.
   */
  public void setEmailTemplate(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EMAILTEMPLATE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NotificationType field.
   */
  public void setNotificationType(typekey.NotificationType value) {
    __getInternalInterface().setFieldValue(NOTIFICATIONTYPE_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.AutomatedNotificationHandlerInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.AutomatedNotificationHandler, com.guidewire._generated.entity.AutomatedNotificationHandlerInternal>() {
      public java.lang.Object getImplementation(entity.AutomatedNotificationHandler bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.AutomatedNotificationHandlerInternal getInternalInterface(entity.AutomatedNotificationHandler bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}