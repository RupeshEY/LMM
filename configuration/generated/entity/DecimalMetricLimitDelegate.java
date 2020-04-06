package entity;

/**
 * DecimalMetricLimitDelegate
 * Delegate used by decimal claim and exposure metric limits
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DecimalMetricLimitDelegate.eti;DecimalMetricLimitDelegate.eix;DecimalMetricLimitDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface DecimalMetricLimitDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DecimalMetricLimitDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DecimalMetricLimitDelegate>("entity.DecimalMetricLimitDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALREDVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("DecimalRedValue", "DecimalRedValue");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALTARGETVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("DecimalTargetValue", "DecimalTargetValue");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALYELLOWVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("DecimalYellowValue", "DecimalYellowValue");
  
  /**
   * Gets the value of the DecimalRedValue field.
   * Decimal field to store the red value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalRedValue();
  
  
  /**
   * Gets the value of the DecimalTargetValue field.
   * Decimal field to store the target value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalTargetValue();
  
  
  /**
   * Gets the value of the DecimalYellowValue field.
   * Decimal field to store the yellow value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalYellowValue();
  
  
  /**
   * Sets the value of the DecimalRedValue field.
   */
  public void setDecimalRedValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DecimalTargetValue field.
   */
  public void setDecimalTargetValue(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DecimalYellowValue field.
   */
  public void setDecimalYellowValue(java.math.BigDecimal value);
  
  
  
}