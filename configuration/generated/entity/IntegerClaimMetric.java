package entity;

/**
 * IntegerClaimMetric
 * Integer based claim metric.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "IntegerClaimMetric.eti;IntegerClaimMetric.eix;IntegerClaimMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class IntegerClaimMetric extends entity.ClaimMetric implements entity.IntegerMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.IntegerClaimMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.IntegerClaimMetric>("entity.IntegerClaimMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTEGERVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IntegerValue");
  
  protected IntegerClaimMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.IntegerClaimMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.IntegerClaimMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.IntegerClaimMetricInternal)super.__getInternalInterface();
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
    com.guidewire._generated.entity.IntegerClaimMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.IntegerClaimMetric, com.guidewire._generated.entity.IntegerClaimMetricInternal>() {
      public java.lang.Object getImplementation(entity.IntegerClaimMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.IntegerClaimMetricInternal getInternalInterface(entity.IntegerClaimMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}