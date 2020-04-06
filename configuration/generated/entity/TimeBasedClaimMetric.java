package entity;

/**
 * TimeBasedClaimMetric
 * Time based claim metric.
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TimeBasedClaimMetric.eti;TimeBasedClaimMetric.eix;TimeBasedClaimMetric.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public abstract class TimeBasedClaimMetric extends entity.ClaimMetric implements entity.TimeBasedMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TimeBasedClaimMetric> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TimeBasedClaimMetric>("entity.TimeBasedClaimMetric");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTEGERVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IntegerValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISOPEN_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IsOpen");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SKIPPED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Skipped");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "StartTime");
  
  protected TimeBasedClaimMetric(java.lang.Void ignored)  {
    super(ignored);
  }
  
  protected abstract com.guidewire._generated.entity.TimeBasedClaimMetricInternal __createInternalInterface();
  
  
  protected com.guidewire._generated.entity.TimeBasedClaimMetricInternal __getInternalInterface() {
    return (com.guidewire._generated.entity.TimeBasedClaimMetricInternal)super.__getInternalInterface();
  }
  
  /**
   * Timestamp when the object was created
   * @param bean 
   */
  public java.util.Date getCreateTime(entity.Editable bean) {
    return ((gw.cc.claim.metric.entity.TimeBasedClaimMetric)__getDelegateManager().getImplementation("gw.cc.claim.metric.entity.TimeBasedClaimMetric")).getCreateTime(bean);
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
   * Gets the value of the StartTime field.
   * Starting time of the metric.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(STARTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the IsOpen field.
   * The value of an open time based metric is now - start time, once closed it has a fixed integer value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsOpen() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(ISOPEN_PROP.get());
  }
  
  /**
   * Gets the value of the Skipped field.
   * True if the metric is closed because the normal closing event was skipped.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSkipped() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(SKIPPED_PROP.get());
  }
  
  /**
   * Sets the value of the IntegerValue field.
   */
  public void setIntegerValue(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(INTEGERVALUE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IsOpen field.
   */
  public void setIsOpen(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(ISOPEN_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Skipped field.
   */
  public void setSkipped(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(SKIPPED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(STARTTIME_PROP.get(), value);
  }
  
  static {
    com.guidewire._generated.entity.TimeBasedClaimMetricInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.EntityFriendAccess<entity.TimeBasedClaimMetric, com.guidewire._generated.entity.TimeBasedClaimMetricInternal>() {
      public java.lang.Object getImplementation(entity.TimeBasedClaimMetric bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.TimeBasedClaimMetricInternal getInternalInterface(entity.TimeBasedClaimMetric bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      
    });
  }
}