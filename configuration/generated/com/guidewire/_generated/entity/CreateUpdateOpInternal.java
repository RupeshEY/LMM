package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CreateUpdateOp.eti;CreateUpdateOp.eix;CreateUpdateOp.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CreateUpdateOpInternal extends com.guidewire._generated.entity.UpdateOpInternal {
  /**
   * Gets the value of the EntityTypeName field.
   * Identifies the entity type.  e.g. Person, Company, or Adjudicator.  (Entity type on the application side not a ContactManager entity type)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEntityTypeName();
  
  
  /**
   * Gets the value of the ObjectUId field.
   * Temporary ID for the newly created object.  Needs to be unique within this UpdateBatch.  Can be referenced from the FieldUpdateOps.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getObjectUId();
  
  
  /**
   * Gets the value of the UpdateBatch field.
   * Associated UpdateBatch.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpdateBatch getUpdateBatch();
  
  
  public gw.pl.persistence.core.Key getUpdateBatchID();
  
  
  /**
   * Sets the value of the EntityTypeName field.
   */
  public void setEntityTypeName(java.lang.String value);
  
  
  /**
   * Sets the value of the ObjectUId field.
   */
  public void setObjectUId(java.lang.String value);
  
  
  /**
   * Sets the value of the UpdateBatch field.
   */
  public void setUpdateBatch(entity.UpdateBatch value);
  
  
  public void setUpdateBatchID(gw.pl.persistence.core.Key value);
  
  
  
}