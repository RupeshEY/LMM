package entity;

/**
 * DecimalMetricDelegate
 * Delegate used by decimal claim, exposure, and service request metrics to store a decimal value
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DecimalMetricDelegate.eti;DecimalMetricDelegate.eix;DecimalMetricDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface DecimalMetricDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.DecimalMetricDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.DecimalMetricDelegate>("entity.DecimalMetricDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DECIMALVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("DecimalValue", "DecimalValue");
  
  /**
   * Gets the value of the DecimalValue field.
   * Decimal field to store the value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDecimalValue();
  
  
  /**
   * Sets the value of the DecimalValue field.
   */
  public void setDecimalValue(java.math.BigDecimal value);
  
  
  
}