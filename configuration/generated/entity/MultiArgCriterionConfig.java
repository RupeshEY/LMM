package entity;

/**
 * MultiArgCriterionConfig
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MultiArgCriterionConfig.eti;MultiArgCriterionConfig.eix;MultiArgCriterionConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class MultiArgCriterionConfig extends entity.BaseCriterionConfig {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MultiArgCriterionConfig> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MultiArgCriterionConfig>("entity.MultiArgCriterionConfig");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> VALUES_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "Values");
  
  protected MultiArgCriterionConfig(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.MultiArgCriterionConfigInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.MultiArgCriterionConfigInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.MultiArgCriterionConfigInternal)super.__getInternalInterface();
  }
  
  /**
   * Adds the given element to the Values array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToValues(entity.CriterionValue element) {
    __getInternalInterface().addArrayElement(VALUES_PROP.get(), element);
  }
  
  /**
   * Gets the value of the Values field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CriterionValue[] getValues() {
    return (entity.CriterionValue[])__getInternalInterface().getFieldValue(VALUES_PROP.get());
  }
  
  /**
   * Removes the given element from the Values array. This is achieved by marking the element for removal.
   */
  public void removeFromValues(entity.CriterionValue element) {
    __getInternalInterface().removeArrayElement(VALUES_PROP.get(), element);
  }
  
  /**
   * Removes the given element from the Values array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromValues(gw.pl.persistence.core.Key elementID) {
    __getInternalInterface().removeArrayElement(VALUES_PROP.get(), elementID);
  }
  
  /**
   * Sets the value of the Values field.
   */
  public void setValues(entity.CriterionValue[] value) {
    __getInternalInterface().setFieldValue(VALUES_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.MultiArgCriterionConfigInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.MultiArgCriterionConfig, com.guidewire._generated.entity.MultiArgCriterionConfigInternal>() {
      public java.lang.Object getImplementation(entity.MultiArgCriterionConfig bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.MultiArgCriterionConfigInternal getInternalInterface(entity.MultiArgCriterionConfig bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}