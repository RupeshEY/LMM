package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LoadCallback.eti;LoadCallback.eix;LoadCallback.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LoadCallbackInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.TimedLoaderObjectInternal, com.guidewire._generated.entity.OrdereddLoaderObjectInternal, com.guidewire.pl.domain.staging.LoadCallbackPublicMethods {
  /**
   * Adds the given element to the CallbackResults array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCallbackResults(entity.LoadCallbackResult element);
  
  
  /**
   * Gets the value of the CallbackResults field.
   * Timed loader callback results.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCallbackResult[] getCallbackResults();
  
  
  /**
   * Gets the value of the Description field.
   * Description of loader callback.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the ExecutionTime field.
   * Execution time of LoaderCallback.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LoaderCallbackTimeType getExecutionTime();
  
  
  /**
   * Gets the value of the LoadCommand field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadCommand getLoadCommand();
  
  
  public gw.pl.persistence.core.Key getLoadCommandID();
  
  
  /**
   * Gets the value of the LoadOperation field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LoadOperation getLoadOperation();
  
  
  public gw.pl.persistence.core.Key getLoadOperationID();
  
  
  /**
   * Gets the value of the Name field.
   * Name of loader callback.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Removes the given element from the CallbackResults array. This is achieved by marking the element for removal.
   */
  public void removeFromCallbackResults(entity.LoadCallbackResult element);
  
  
  /**
   * Removes the given element from the CallbackResults array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCallbackResults(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CallbackResults field.
   */
  public void setCallbackResults(entity.LoadCallbackResult[] value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the ExecutionTime field.
   */
  public void setExecutionTime(typekey.LoaderCallbackTimeType value);
  
  
  /**
   * Sets the value of the LoadCommand field.
   */
  public void setLoadCommand(entity.LoadCommand value);
  
  
  public void setLoadCommandID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadOperation field.
   */
  public void setLoadOperation(entity.LoadOperation value);
  
  
  public void setLoadOperationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  
}