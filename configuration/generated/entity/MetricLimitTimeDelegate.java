package entity;

/**
 * MetricLimitTimeDelegate
 * Delegate used to store the time a metric reached or will reach its limits
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MetricLimitTimeDelegate.eti;MetricLimitTimeDelegate.eix;MetricLimitTimeDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface MetricLimitTimeDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.MetricLimitTimeDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.MetricLimitTimeDelegate>("entity.MetricLimitTimeDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REACHREDTIME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ReachRedTime", "ReachRedTime");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> REACHYELLOWTIME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("ReachYellowTime", "ReachYellowTime");
  
  /**
   * Gets the value of the ReachRedTime field.
   * Time the red limit was or will be reached
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReachRedTime();
  
  
  /**
   * Gets the value of the ReachYellowTime field.
   * Time the yellow limit was or will be reached.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getReachYellowTime();
  
  
  /**
   * Sets the value of the ReachRedTime field.
   */
  public void setReachRedTime(java.util.Date value);
  
  
  /**
   * Sets the value of the ReachYellowTime field.
   */
  public void setReachYellowTime(java.util.Date value);
  
  
  
}