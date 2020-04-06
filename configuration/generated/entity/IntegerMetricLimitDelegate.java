package entity;

/**
 * IntegerMetricLimitDelegate
 * Delegate used by integer claim and exposure metric limits
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "IntegerMetricLimitDelegate.eti;IntegerMetricLimitDelegate.eix;IntegerMetricLimitDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface IntegerMetricLimitDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.IntegerMetricLimitDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.IntegerMetricLimitDelegate>("entity.IntegerMetricLimitDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTEGERREDVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("IntegerRedValue", "IntegerRedValue");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTEGERTARGETVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("IntegerTargetValue", "IntegerTargetValue");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INTEGERYELLOWVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("IntegerYellowValue", "IntegerYellowValue");
  
  /**
   * Gets the value of the IntegerRedValue field.
   * Integer field to store the red value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntegerRedValue();
  
  
  /**
   * Gets the value of the IntegerTargetValue field.
   * Integer field to store the target value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntegerTargetValue();
  
  
  /**
   * Gets the value of the IntegerYellowValue field.
   * Integer field to store the yellow value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getIntegerYellowValue();
  
  
  /**
   * Sets the value of the IntegerRedValue field.
   */
  public void setIntegerRedValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the IntegerTargetValue field.
   */
  public void setIntegerTargetValue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the IntegerYellowValue field.
   */
  public void setIntegerYellowValue(java.lang.Integer value);
  
  
  
}