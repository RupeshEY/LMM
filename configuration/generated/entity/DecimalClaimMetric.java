package entity;

/**
 * DecimalClaimMetric
 * Decimal based claim metric.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DecimalClaimMetric.eti;DecimalClaimMetric.eix;DecimalClaimMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class DecimalClaimMetric extends entity.ClaimMetric implements entity.DecimalMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DecimalClaimMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DecimalClaimMetric>("entity.DecimalClaimMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DecimalValue");
  
  protected DecimalClaimMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.DecimalClaimMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.DecimalClaimMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.DecimalClaimMetricInternal)super.__getInternalInterface();
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
    com.guidewire._generated.entity.DecimalClaimMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.DecimalClaimMetric, com.guidewire._generated.entity.DecimalClaimMetricInternal>() {
      public java.lang.Object getImplementation(entity.DecimalClaimMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DecimalClaimMetricInternal getInternalInterface(entity.DecimalClaimMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}