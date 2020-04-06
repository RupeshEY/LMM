package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GroupUserWorkload.eti;GroupUserWorkload.eix;GroupUserWorkload.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GroupUserWorkloadInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Workload field.
   * Total workload assigned to group user
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWorkload();
  
  
  /**
   * Gets the value of the WorkloadUpdated field.
   * Last time user workload was calculated and updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getWorkloadUpdated();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Workload field.
   */
  public void setWorkload(java.lang.Integer value);
  
  
  /**
   * Sets the value of the WorkloadUpdated field.
   */
  public void setWorkloadUpdated(java.util.Date value);
  
  
  
}