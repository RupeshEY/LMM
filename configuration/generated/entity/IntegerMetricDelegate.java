package entity;

/**
 * IntegerMetricDelegate
 * Delegate used by integer claim, service request, and exposure metrics to store an integer value
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "IntegerMetricDelegate.eti;IntegerMetricDelegate.eix;IntegerMetricDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface IntegerMetricDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.IntegerMetricDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.IntegerMetricDelegate>("entity.IntegerMetricDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTEGERVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("IntegerValue", "IntegerValue");
  
  /**
   * Gets the value of the IntegerValue field.
   * Integer field to store the value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntegerValue();
  
  
  /**
   * Sets the value of the IntegerValue field.
   */
  public void setIntegerValue(java.lang.Integer value);
  
  
  
}