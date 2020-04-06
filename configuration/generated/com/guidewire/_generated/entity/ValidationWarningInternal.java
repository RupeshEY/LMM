package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ValidationWarning.eti;ValidationWarning.eix;ValidationWarning.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ValidationWarningInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the UpdateBatch field.
   * Associated UpdateBatch.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpdateBatch getUpdateBatch();
  
  
  public gw.pl.persistence.core.Key getUpdateBatchID();
  
  
  /**
   * Gets the value of the Warning field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWarning();
  
  
  /**
   * Sets the value of the UpdateBatch field.
   */
  public void setUpdateBatch(entity.UpdateBatch value);
  
  
  public void setUpdateBatchID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Warning field.
   */
  public void setWarning(java.lang.String value);
  
  
  
}