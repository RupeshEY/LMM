package entity;

/**
 * AutomatedActivityHandler
 * 
 *         A subtype of AutomatedHandler that causes activities to be generated when the associated trigger is executed by
 *         changes to a Claim.
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AutomatedActivityHandler.eti;AutomatedActivityHandler.eix;AutomatedActivityHandler.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class AutomatedActivityHandler extends entity.AutomatedHandler implements gw.api.specialhandling.AutomatedHandlerMethods {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.AutomatedActivityHandler> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.AutomatedActivityHandler>("entity.AutomatedActivityHandler");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> ACTIVITYPATTERN_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ActivityPattern");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> EMAILTEMPLATEOVERRIDE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "EmailTemplateOverride");
  
  protected AutomatedActivityHandler(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.AutomatedActivityHandlerInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.AutomatedActivityHandlerInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.AutomatedActivityHandlerInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the ActivityPattern field.
   * Activity pattern to use for activity generation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityPattern getActivityPattern() {
    return (entity.ActivityPattern)__getInternalInterface().getFieldValue(ACTIVITYPATTERN_PROP.get());
  }
  
  /**
   * Gets the value of the EmailTemplateOverride field.
   * Optional alternate template to use for activity generation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailTemplateOverride() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(EMAILTEMPLATEOVERRIDE_PROP.get());
  }
  
  /**
   * Sets the value of the ActivityPattern field.
   */
  public void setActivityPattern(entity.ActivityPattern value) {
    __getInternalInterface().setFieldValue(ACTIVITYPATTERN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the EmailTemplateOverride field.
   */
  public void setEmailTemplateOverride(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(EMAILTEMPLATEOVERRIDE_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.AutomatedActivityHandlerInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.AutomatedActivityHandler, com.guidewire._generated.entity.AutomatedActivityHandlerInternal>() {
      public java.lang.Object getImplementation(entity.AutomatedActivityHandler bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.AutomatedActivityHandlerInternal getInternalInterface(entity.AutomatedActivityHandler bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}