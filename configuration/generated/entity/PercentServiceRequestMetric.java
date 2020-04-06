package entity;

/**
 * PercentServiceRequestMetric
 * Percent based service request metric.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PercentServiceRequestMetric.eti;PercentServiceRequestMetric.eix;PercentServiceRequestMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class PercentServiceRequestMetric extends entity.ServiceRequestMetric implements entity.PercentMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.PercentServiceRequestMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.PercentServiceRequestMetric>("entity.PercentServiceRequestMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERCENTVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PercentValue");
  
  protected PercentServiceRequestMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.PercentServiceRequestMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.PercentServiceRequestMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.PercentServiceRequestMetricInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the PercentValue field.
   * Percent field to store the value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentValue() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(PERCENTVALUE_PROP.get());
  }
  
  /**
   * Sets the value of the PercentValue field.
   */
  public void setPercentValue(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(PERCENTVALUE_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.PercentServiceRequestMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.PercentServiceRequestMetric, com.guidewire._generated.entity.PercentServiceRequestMetricInternal>() {
      public java.lang.Object getImplementation(entity.PercentServiceRequestMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.PercentServiceRequestMetricInternal getInternalInterface(entity.PercentServiceRequestMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}