package entity;

/**
 * PercentClaimMetric
 * Percent based claim metric.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PercentClaimMetric.eti;PercentClaimMetric.eix;PercentClaimMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class PercentClaimMetric extends entity.ClaimMetric implements entity.PercentMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.PercentClaimMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.PercentClaimMetric>("entity.PercentClaimMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERCENTVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PercentValue");
  
  protected PercentClaimMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.PercentClaimMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.PercentClaimMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.PercentClaimMetricInternal)super.__getInternalInterface();
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
    com.guidewire._generated.entity.PercentClaimMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.PercentClaimMetric, com.guidewire._generated.entity.PercentClaimMetricInternal>() {
      public java.lang.Object getImplementation(entity.PercentClaimMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.PercentClaimMetricInternal getInternalInterface(entity.PercentClaimMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}