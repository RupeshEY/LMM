package entity;

/**
 * IntegerExposureMetric
 * Integer based exposure metric.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "IntegerExposureMetric.eti;IntegerExposureMetric.eix;IntegerExposureMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class IntegerExposureMetric extends entity.ExposureMetric implements entity.IntegerMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.IntegerExposureMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.IntegerExposureMetric>("entity.IntegerExposureMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTEGERVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IntegerValue");
  
  protected IntegerExposureMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.IntegerExposureMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.IntegerExposureMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.IntegerExposureMetricInternal)super.__getInternalInterface();
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
    com.guidewire._generated.entity.IntegerExposureMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.IntegerExposureMetric, com.guidewire._generated.entity.IntegerExposureMetricInternal>() {
      public java.lang.Object getImplementation(entity.IntegerExposureMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.IntegerExposureMetricInternal getInternalInterface(entity.IntegerExposureMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}