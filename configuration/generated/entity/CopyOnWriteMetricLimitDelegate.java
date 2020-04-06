package entity;

/**
 * CopyOnWriteMetricLimitDelegate
 * Delegate used by integer claim and exposure metric limits to implement copy on write behavior
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CopyOnWriteMetricLimitDelegate.eti;CopyOnWriteMetricLimitDelegate.eix;CopyOnWriteMetricLimitDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface CopyOnWriteMetricLimitDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.CopyOnWriteMetricLimitDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.CopyOnWriteMetricLimitDelegate>("entity.CopyOnWriteMetricLimitDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATEDGENERATION_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("CreatedGeneration", "CreatedGeneration");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDDATE_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("RetiredDate", "RetiredDate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDGENERATION_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("RetiredGeneration", "RetiredGeneration");
  
  /**
   * Gets the value of the CreatedGeneration field.
   * Generation number at which this limit was created
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getCreatedGeneration();
  
  
  /**
   * Gets the value of the RetiredDate field.
   * Date at which this limit was retired, or null if still active.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getRetiredDate();
  
  
  /**
   * Gets the value of the RetiredGeneration field.
   * Generation number at which this limit was retired, or null if still active
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRetiredGeneration();
  
  
  /**
   * Sets the value of the CreatedGeneration field.
   */
  public void setCreatedGeneration(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RetiredDate field.
   */
  public void setRetiredDate(java.util.Date value);
  
  
  /**
   * Sets the value of the RetiredGeneration field.
   */
  public void setRetiredGeneration(java.lang.Integer value);
  
  
  
}