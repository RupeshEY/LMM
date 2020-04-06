package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BaseCriterionConfig.eti;BaseCriterionConfig.eix;BaseCriterionConfig.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BaseCriterionConfigInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire.cc.system.dynaction.config.CriterionOperatorRestriction {
  /**
   * Gets the value of the BeanPath field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBeanPath();
  
  
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
   * Gets the value of the Operator field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CriterionOperator getOperator();
  
  
  /**
   * Gets the value of the Owner field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DynamicActionConfig getOwner();
  
  
  public gw.pl.persistence.core.Key getOwnerID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BaseCriterionConfig getSubtype();
  
  
  /**
   * Sets the value of the BeanPath field.
   */
  public void setBeanPath(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Operator field.
   */
  public void setOperator(typekey.CriterionOperator value);
  
  
  /**
   * Sets the value of the Owner field.
   */
  public void setOwner(entity.DynamicActionConfig value);
  
  
  public void setOwnerID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.BaseCriterionConfig value);
  
  
  
}