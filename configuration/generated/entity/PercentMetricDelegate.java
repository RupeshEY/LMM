package entity;

/**
 * PercentMetricDelegate
 * Delegate used by percent claim and exposure metrics to store a percent value
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PercentMetricDelegate.eti;PercentMetricDelegate.eix;PercentMetricDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface PercentMetricDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.PercentMetricDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.PercentMetricDelegate>("entity.PercentMetricDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PERCENTVALUE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("PercentValue", "PercentValue");
  
  /**
   * Gets the value of the PercentValue field.
   * Percent field to store the value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentValue();
  
  
  /**
   * Sets the value of the PercentValue field.
   */
  public void setPercentValue(java.math.BigDecimal value);
  
  
  
}