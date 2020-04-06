package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpdateBatch.eti;UpdateBatch.eix;UpdateBatch.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpdateBatchInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.addressbook.impl.UpdateBatchInternalMethods {
  /**
   * Adds the given element to the CreateUpdateOps array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCreateUpdateOps(entity.CreateUpdateOp element);
  
  
  /**
   * Adds the given element to the DeleteUpdateOps array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDeleteUpdateOps(entity.DeleteUpdateOp element);
  
  
  /**
   * Adds the given element to the FieldChangeUpdateOps array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToFieldChangeUpdateOps(entity.FieldChangeUpdateOp element);
  
  
  /**
   * Adds the given element to the ValidationWarningsToIgnore array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToValidationWarningsToIgnore(entity.ValidationWarning element);
  
  
  /**
   * Gets the value of the CreateUpdateOps field.
   * List of objects to be created in the Address Book.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CreateUpdateOp[] getCreateUpdateOps();
  
  
  /**
   * Gets the value of the DeleteUpdateOps field.
   * List of entities to be deleted from the Address Book.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DeleteUpdateOp[] getDeleteUpdateOps();
  
  
  /**
   * Gets the value of the FieldChangeUpdateOps field.
   * List of changes to fields' values in different entities.  Notice that in this list every entry may apply to a different entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FieldChangeUpdateOp[] getFieldChangeUpdateOps();
  
  
  /**
   * Gets the value of the ValidationWarningsToIgnore field.
   * List of validation warnings to be ignored by Address Book
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ValidationWarning[] getValidationWarningsToIgnore();
  
  
  /**
   * Removes the given element from the CreateUpdateOps array. This is achieved by marking the element for removal.
   */
  public void removeFromCreateUpdateOps(entity.CreateUpdateOp element);
  
  
  /**
   * Removes the given element from the CreateUpdateOps array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCreateUpdateOps(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the DeleteUpdateOps array. This is achieved by marking the element for removal.
   */
  public void removeFromDeleteUpdateOps(entity.DeleteUpdateOp element);
  
  
  /**
   * Removes the given element from the DeleteUpdateOps array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDeleteUpdateOps(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the FieldChangeUpdateOps array. This is achieved by marking the element for removal.
   */
  public void removeFromFieldChangeUpdateOps(entity.FieldChangeUpdateOp element);
  
  
  /**
   * Removes the given element from the FieldChangeUpdateOps array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromFieldChangeUpdateOps(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ValidationWarningsToIgnore array. This is achieved by marking the element for removal.
   */
  public void removeFromValidationWarningsToIgnore(entity.ValidationWarning element);
  
  
  /**
   * Removes the given element from the ValidationWarningsToIgnore array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromValidationWarningsToIgnore(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CreateUpdateOps field.
   */
  public void setCreateUpdateOps(entity.CreateUpdateOp[] value);
  
  
  /**
   * Sets the value of the DeleteUpdateOps field.
   */
  public void setDeleteUpdateOps(entity.DeleteUpdateOp[] value);
  
  
  /**
   * Sets the value of the FieldChangeUpdateOps field.
   */
  public void setFieldChangeUpdateOps(entity.FieldChangeUpdateOp[] value);
  
  
  /**
   * Sets the value of the ValidationWarningsToIgnore field.
   */
  public void setValidationWarningsToIgnore(entity.ValidationWarning[] value);
  
  
  
}