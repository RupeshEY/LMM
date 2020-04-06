package entity;

/**
 * TimeBasedMetricDelegate
 * Delegate used by time based claim, service request, and exposure metrics to store a start time and an open flag
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TimeBasedMetricDelegate.eti;TimeBasedMetricDelegate.eix;TimeBasedMetricDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface TimeBasedMetricDelegate extends entity.IntegerMetricDelegate {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TimeBasedMetricDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TimeBasedMetricDelegate>("entity.TimeBasedMetricDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ISOPEN_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("IsOpen", "IsOpen");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SKIPPED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("Skipped", "Skipped");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("StartTime", "StartTime");
  
  /**
   * Gets the value of the StartTime field.
   * Starting time of the metric.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Gets the value of the IsOpen field.
   * The value of an open time based metric is now - start time, once closed it has a fixed integer value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsOpen();
  
  
  /**
   * Gets the value of the Skipped field.
   * True if the metric is closed because the normal closing event was skipped.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSkipped();
  
  
  /**
   * Sets the value of the IsOpen field.
   */
  public void setIsOpen(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Skipped field.
   */
  public void setSkipped(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  
}