package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ConditionFilter.eti;ConditionFilter.eix;ConditionFilter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ConditionFilterInternal extends com.guidewire._generated.entity.EditableInternal {
  /**
   * Gets the value of the Condition field.
   * Classification condition associated with this filter
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClassificationCondition getCondition();
  
  
  public gw.pl.persistence.core.Key getConditionID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ConditionFilter getSubtype();
  
  
  /**
   * Sets the value of the Condition field.
   */
  public void setCondition(entity.ClassificationCondition value);
  
  
  public void setConditionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ConditionFilter value);
  
  
  
}