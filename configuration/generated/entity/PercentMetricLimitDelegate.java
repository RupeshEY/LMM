package entity;

/**
 * PercentMetricLimitDelegate
 * Delegate used by percent claim and exposure metric limits
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PercentMetricLimitDelegate.eti;PercentMetricLimitDelegate.eix;PercentMetricLimitDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface PercentMetricLimitDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.PercentMetricLimitDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.PercentMetricLimitDelegate>("entity.PercentMetricLimitDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERCENTREDVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PercentRedValue", "PercentRedValue");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERCENTTARGETVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PercentTargetValue", "PercentTargetValue");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERCENTYELLOWVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PercentYellowValue", "PercentYellowValue");
  
  /**
   * Gets the value of the PercentRedValue field.
   * Percent field to store the red value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentRedValue();
  
  
  /**
   * Gets the value of the PercentTargetValue field.
   * Percent field to store the target value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentTargetValue();
  
  
  /**
   * Gets the value of the PercentYellowValue field.
   * Percent field to store the yellow value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentYellowValue();
  
  
  /**
   * Sets the value of the PercentRedValue field.
   */
  public void setPercentRedValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PercentTargetValue field.
   */
  public void setPercentTargetValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PercentYellowValue field.
   */
  public void setPercentYellowValue(java.math.BigDecimal value);
  
  
  
}