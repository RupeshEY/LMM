package entity;

/**
 * WorkloadDelegate
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkloadDelegate.eti;WorkloadDelegate.eix;WorkloadDelegate.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
public interface WorkloadDelegate extends gw.pl.persistence.core.Bean {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.WorkloadDelegate> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.WorkloadDelegate>("entity.WorkloadDelegate");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> SUPPLEMENTALWORKLOADWEIGHT_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("SupplementalWorkloadWeight", "SupplementalWorkloadWeight");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKLOADUPDATED_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("WorkloadUpdated", "WorkloadUpdated");
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> WORKLOADWEIGHT_DYNPROP = new com.guidewire.commons.metadata.types.ColumnDynPropertyInfo("WorkloadWeight", "WorkloadWeight");
  
  /**
   * Gets the value of the SupplementalWorkloadWeight field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSupplementalWorkloadWeight();
  
  
  /**
   * Gets the value of the WorkloadUpdated field.
   * Last time user workload was calculated and updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWorkloadUpdated();
  
  
  /**
   * Gets the value of the WorkloadWeight field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkloadWeight();
  
  
  /**
   * Sets the value of the SupplementalWorkloadWeight field.
   */
  public void setSupplementalWorkloadWeight(java.lang.Integer value);
  
  
  /**
   * Sets the value of the WorkloadUpdated field.
   */
  public void setWorkloadUpdated(java.util.Date value);
  
  
  /**
   * Sets the value of the WorkloadWeight field.
   */
  public void setWorkloadWeight(java.lang.Integer value);
  
  
  
}