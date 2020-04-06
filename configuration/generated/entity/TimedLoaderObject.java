package entity;

/**
 * TimedLoaderObject
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TimedLoaderObject.eti;TimedLoaderObject.eix;TimedLoaderObject.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface TimedLoaderObject extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.TimedLoaderObject> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.TimedLoaderObject>("entity.TimedLoaderObject");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ENDTIME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("EndTime", "EndTime");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> STARTTIME_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("StartTime", "StartTime");
  
  /**
   * Gets the value of the EndTime field.
   * Timestamp when the timing completed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndTime();
  
  
  /**
   * Gets the value of the StartTime field.
   * Timestamp when the timing began.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartTime();
  
  
  /**
   * Sets the value of the EndTime field.
   */
  public void setEndTime(java.util.Date value);
  
  
  /**
   * Sets the value of the StartTime field.
   */
  public void setStartTime(java.util.Date value);
  
  
  
}