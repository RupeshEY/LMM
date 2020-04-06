package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkloadClassification.eti;WorkloadClassification.eix;WorkloadClassification.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkloadClassificationInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ValidatableInternal {
  /**
   * Adds the given element to the Conditions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToConditions(entity.ClassificationCondition element);
  
  
  /**
   * Adds the given element to the Description_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDescription_L10N_ARRAY(entity.WorkloadClassification_Description_L10N element);
  
  
  /**
   * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToName_L10N_ARRAY(entity.WorkloadClassification_Name_L10N element);
  
  
  /**
   * Gets the value of the ClaimLOBCode field.
   * Line of Business code; typically related to the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LOBCode getClaimLOBCode();
  
  
  /**
   * Gets the value of the ClaimLossType field.
   * Loss Type of Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getClaimLossType();
  
  
  /**
   * Gets the value of the ClaimPolicyType field.
   * Type of Policy
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getClaimPolicyType();
  
  
  /**
   * Gets the value of the Conditions field.
   * Filtering criteria associated with this classification
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClassificationCondition[] getConditions();
  
  
  /**
   * Array association for partition ConditionsBySubtype on array Conditions
   */
  public entity.ClassificationCondition getConditionsBySubtype(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Description field.
   * Description
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Description_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WorkloadClassification_Description_L10N[] getDescription_L10N_ARRAY();
  
  
  /**
   * Array association for partition Description_L10N_ARRAYByLanguage on array Description_L10N_ARRAY
   */
  public entity.WorkloadClassification_Description_L10N getDescription_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * Name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Name_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WorkloadClassification_Name_L10N[] getName_L10N_ARRAY();
  
  
  /**
   * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
   */
  public entity.WorkloadClassification_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the Priority field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getPriority();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkloadClassification getSubtype();
  
  
  /**
   * Gets the value of the Weight field.
   * Weight that matching assignables will be given
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getWeight();
  
  
  /**
   * Gets the value of the Active field.
   * True if this rule is active.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isActive();
  
  
  /**
   * Removes the given element from the Conditions array. This is achieved by marking the element for removal.
   */
  public void removeFromConditions(entity.ClassificationCondition element);
  
  
  /**
   * Removes the given element from the Conditions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromConditions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromDescription_L10N_ARRAY(entity.WorkloadClassification_Description_L10N element);
  
  
  /**
   * Removes the given element from the Description_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDescription_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromName_L10N_ARRAY(entity.WorkloadClassification_Name_L10N element);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromName_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Active field.
   */
  public void setActive(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ClaimLOBCode field.
   */
  public void setClaimLOBCode(typekey.LOBCode value);
  
  
  /**
   * Sets the value of the ClaimLossType field.
   */
  public void setClaimLossType(typekey.LossType value);
  
  
  /**
   * Sets the value of the ClaimPolicyType field.
   */
  public void setClaimPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the Conditions field.
   */
  public void setConditions(entity.ClassificationCondition[] value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Description_L10N_ARRAY field.
   */
  public void setDescription_L10N_ARRAY(entity.WorkloadClassification_Description_L10N[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Name_L10N_ARRAY field.
   */
  public void setName_L10N_ARRAY(entity.WorkloadClassification_Name_L10N[] value);
  
  
  /**
   * Sets the value of the Priority field.
   */
  public void setPriority(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.WorkloadClassification value);
  
  
  /**
   * Sets the value of the Weight field.
   */
  public void setWeight(java.lang.Integer value);
  
  
  
}