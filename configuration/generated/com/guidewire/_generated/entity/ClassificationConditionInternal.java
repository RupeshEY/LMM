package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClassificationCondition.eti;ClassificationCondition.eix;ClassificationCondition.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClassificationConditionInternal extends com.guidewire._generated.entity.EditableInternal {
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
  public typekey.ClassificationCondition getSubtype();
  
  
  /**
   * Gets the value of the WorkloadClassification field.
   * Classification which this condition is related.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WorkloadClassification getWorkloadClassification();
  
  
  public gw.pl.persistence.core.Key getWorkloadClassificationID();
  
  
  /**
   * Gets the value of the IncludeAll field.
   * flag determining if all entities or only selected few are considered by weight filter
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeAll();
  
  
  /**
   * Sets the value of the IncludeAll field.
   */
  public void setIncludeAll(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ClassificationCondition value);
  
  
  /**
   * Sets the value of the WorkloadClassification field.
   */
  public void setWorkloadClassification(entity.WorkloadClassification value);
  
  
  public void setWorkloadClassificationID(gw.pl.persistence.core.Key value);
  
  
  
}