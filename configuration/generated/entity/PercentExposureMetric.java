package entity;

/**
 * PercentExposureMetric
 * Percent based exposure metric.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PercentExposureMetric.eti;PercentExposureMetric.eix;PercentExposureMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class PercentExposureMetric extends entity.ExposureMetric implements entity.PercentMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.PercentExposureMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.PercentExposureMetric>("entity.PercentExposureMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERCENTVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PercentValue");
  
  protected PercentExposureMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.PercentExposureMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.PercentExposureMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.PercentExposureMetricInternal)super.__getInternalInterface();
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
    com.guidewire._generated.entity.PercentExposureMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.PercentExposureMetric, com.guidewire._generated.entity.PercentExposureMetricInternal>() {
      public java.lang.Object getImplementation(entity.PercentExposureMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.PercentExposureMetricInternal getInternalInterface(entity.PercentExposureMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}