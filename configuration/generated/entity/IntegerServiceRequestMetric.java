package entity;

/**
 * IntegerServiceRequestMetric
 * Integer based service request metric
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "IntegerServiceRequestMetric.eti;IntegerServiceRequestMetric.eix;IntegerServiceRequestMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class IntegerServiceRequestMetric extends entity.ServiceRequestMetric implements entity.IntegerMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.IntegerServiceRequestMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.IntegerServiceRequestMetric>("entity.IntegerServiceRequestMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTEGERVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IntegerValue");
  
  protected IntegerServiceRequestMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.IntegerServiceRequestMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.IntegerServiceRequestMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.IntegerServiceRequestMetricInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the IntegerValue field.
   * Integer field to store the value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntegerValue() {
    return (java.lang.Integer)__getInternalInterface().getFieldValue(INTEGERVALUE_PROP.get());
  }
  
  /**
   * Sets the value of the IntegerValue field.
   */
  public void setIntegerValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(INTEGERVALUE_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.IntegerServiceRequestMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.IntegerServiceRequestMetric, com.guidewire._generated.entity.IntegerServiceRequestMetricInternal>() {
      public java.lang.Object getImplementation(entity.IntegerServiceRequestMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.IntegerServiceRequestMetricInternal getInternalInterface(entity.IntegerServiceRequestMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}