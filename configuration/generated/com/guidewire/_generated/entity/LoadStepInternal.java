package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadStep.eti;LoadStep.eix;LoadStep.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadStepInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedLoaderObjectInternal, com.guidewire._generated.entity.OrdereddLoaderObjectInternal, com.guidewire.pl.domain.staging.LoadStepPublicMethods {
  /**
   * Adds the given element to the LoadparentstepArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLoadparentstepArray(entity.Loadparentstep element);
  
  
  /**
   * Adds the given element to the Operations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOperations(entity.LoadOperation element);
  
  
  /**
   * Gets the value of the LoadCommand field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCommand getLoadCommand();
  
  
  public gw.pl.persistence.core.Key getLoadCommandID();
  
  
  /**
   * Gets the value of the LoadparentstepArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Loadparentstep[] getLoadparentstepArray();
  
  
  /**
   * Gets the value of the Operations field.
   * Detailed operations.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadOperation[] getOperations();
  
  
  /**
   * Gets the value of the ParentStep field.
   * For non-root steps, points to parent step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadStep getParentStep();
  
  
  public gw.pl.persistence.core.Key getParentStepID();
  
  
  /**
   * Gets the value of the StepType field.
   * Type of load step.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LoadStepType getStepType();
  
  
  /**
   * Removes the given element from the LoadparentstepArray array. This is achieved by marking the element for removal.
   */
  public void removeFromLoadparentstepArray(entity.Loadparentstep element);
  
  
  /**
   * Removes the given element from the LoadparentstepArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLoadparentstepArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Operations array. This is achieved by marking the element for removal.
   */
  public void removeFromOperations(entity.LoadOperation element);
  
  
  /**
   * Removes the given element from the Operations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOperations(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the LoadCommand field.
   */
  public void setLoadCommand(entity.LoadCommand value);
  
  
  public void setLoadCommandID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadparentstepArray field.
   */
  public void setLoadparentstepArray(entity.Loadparentstep[] value);
  
  
  /**
   * Sets the value of the Operations field.
   */
  public void setOperations(entity.LoadOperation[] value);
  
  
  /**
   * Sets the value of the ParentStep field.
   */
  public void setParentStep(entity.LoadStep value);
  
  
  public void setParentStepID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the StepType field.
   */
  public void setStepType(typekey.LoadStepType value);
  
  
  
}