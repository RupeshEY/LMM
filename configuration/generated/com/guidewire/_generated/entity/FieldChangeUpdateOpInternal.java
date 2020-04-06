package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FieldChangeUpdateOp.eti;FieldChangeUpdateOp.eix;FieldChangeUpdateOp.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface FieldChangeUpdateOpInternal extends com.guidewire._generated.entity.UpdateOpInternal {
  /**
   * Gets the value of the EntityTypeName field.
   * Identifies the entity type.  e.g. Person, Company, or Adjudicator.  (Entity type on the application side not a ContactManager entity type)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEntityTypeName();
  
  
  /**
   * Gets the value of the Field field.
   * Identifies the field for the application side.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getField();
  
  
  /**
   * Gets the value of the ObjectUId field.
   * Uniquely identifies target object of the operation.  Can be either an AddressBookUId or a temporary ObjectId that was defined in a CreateUpdateOp.
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
   * Gets the value of the Value field.
   * Identifies the value of the field on the app side.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getValue();
  
  
  /**
   * Sets the value of the EntityTypeName field.
   */
  public void setEntityTypeName(java.lang.String value);
  
  
  /**
   * Sets the value of the Field field.
   */
  public void setField(java.lang.String value);
  
  
  /**
   * Sets the value of the ObjectUId field.
   */
  public void setObjectUId(java.lang.String value);
  
  
  /**
   * Sets the value of the UpdateBatch field.
   */
  public void setUpdateBatch(entity.UpdateBatch value);
  
  
  public void setUpdateBatchID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Value field.
   */
  public void setValue(java.lang.String value);
  
  
  
}