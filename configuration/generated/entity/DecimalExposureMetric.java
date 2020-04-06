package entity;

/**
 * DecimalExposureMetric
 * Decimal based exposure metric.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DecimalExposureMetric.eti;DecimalExposureMetric.eix;DecimalExposureMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class DecimalExposureMetric extends entity.ExposureMetric implements entity.DecimalMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DecimalExposureMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DecimalExposureMetric>("entity.DecimalExposureMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DecimalValue");
  
  protected DecimalExposureMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.DecimalExposureMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.DecimalExposureMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.DecimalExposureMetricInternal)super.__getInternalInterface();
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
    com.guidewire._generated.entity.DecimalExposureMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.DecimalExposureMetric, com.guidewire._generated.entity.DecimalExposureMetricInternal>() {
      public java.lang.Object getImplementation(entity.DecimalExposureMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DecimalExposureMetricInternal getInternalInterface(entity.DecimalExposureMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}