package entity;

/**
 * DecimalServiceRequestMetric
 * Decimal based service request metric.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DecimalServiceRequestMetric.eti;DecimalServiceRequestMetric.eix;DecimalServiceRequestMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class DecimalServiceRequestMetric extends entity.ServiceRequestMetric implements entity.DecimalMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DecimalServiceRequestMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DecimalServiceRequestMetric>("entity.DecimalServiceRequestMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DecimalValue");
  
  protected DecimalServiceRequestMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.DecimalServiceRequestMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.DecimalServiceRequestMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.DecimalServiceRequestMetricInternal)super.__getInternalInterface();
  }
  
  /**
   * Gets the value of the DecimalValue field.
   * Decimal field to store the value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalValue() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(DECIMALVALUE_PROP.get());
  }
  
  /**
   * Sets the value of the DecimalValue field.
   */
  public void setDecimalValue(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(DECIMALVALUE_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.DecimalServiceRequestMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.DecimalServiceRequestMetric, com.guidewire._generated.entity.DecimalServiceRequestMetricInternal>() {
      public java.lang.Object getImplementation(entity.DecimalServiceRequestMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DecimalServiceRequestMetricInternal getInternalInterface(entity.DecimalServiceRequestMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}