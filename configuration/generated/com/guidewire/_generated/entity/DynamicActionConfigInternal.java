package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DynamicActionConfig.eti;DynamicActionConfig.eix;DynamicActionConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DynamicActionConfigInternal extends com.guidewire._generated.entity.EditableInternal {
  /**
   * Adds the given element to the Criteria array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCriteria(entity.BaseCriterionConfig element);
  
  
  /**
   * Gets the value of the Action field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ResultingAction getAction();
  
  
  /**
   * Gets the value of the Category field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DynamicActionCategory getCategory();
  
  
  /**
   * Gets the value of the Criteria field.
   * The ANDed criteria for determining whether or not to execute the Action
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.BaseCriterionConfig[] getCriteria();
  
  
  /**
   * Gets the value of the Description field.
   * The description for the dynamic action
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the EffectiveDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEffectiveDate();
  
  
  /**
   * Gets the value of the ExpirationDate field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpirationDate();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LockingColumn field.
   * Meaningless column for locking
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn();
  
  
  /**
   * Gets the value of the Name field.
   * The name for the dynamic action
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the RootEntity field.
   * The root entity for the dynamic action
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRootEntity();
  
  
  /**
   * Gets the value of the Enabled field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEnabled();
  
  
  /**
   * Removes the given element from the Criteria array. This is achieved by marking the element for removal.
   */
  public void removeFromCriteria(entity.BaseCriterionConfig element);
  
  
  /**
   * Removes the given element from the Criteria array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCriteria(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Action field.
   */
  public void setAction(typekey.ResultingAction value);
  
  
  /**
   * Sets the value of the Category field.
   */
  public void setCategory(typekey.DynamicActionCategory value);
  
  
  /**
   * Sets the value of the Criteria field.
   */
  public void setCriteria(entity.BaseCriterionConfig[] value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the EffectiveDate field.
   */
  public void setEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Enabled field.
   */
  public void setEnabled(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ExpirationDate field.
   */
  public void setExpirationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the RootEntity field.
   */
  public void setRootEntity(java.lang.String value);
  
  
  
}