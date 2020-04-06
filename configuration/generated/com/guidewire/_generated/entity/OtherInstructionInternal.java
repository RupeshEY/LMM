package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OtherInstruction.eti;OtherInstruction.eix;OtherInstruction.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface OtherInstructionInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.specialhandling.entity.OtherInstruction {
  /**
   * Adds the given element to the Comments_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToComments_L10N_ARRAY(entity.OtherInstruction_Comments_L10N element);
  
  
  /**
   * Gets the value of the Comments field.
   * Special handling other instruction comment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the Comments_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OtherInstruction_Comments_L10N[] getComments_L10N_ARRAY();
  
  
  /**
   * Array association for partition Comments_L10N_ARRAYByLanguage on array Comments_L10N_ARRAY
   */
  public entity.OtherInstruction_Comments_L10N getComments_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the InstructionCategory field.
   * The instruction category this instruction relates to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InstructionCategory getInstructionCategory();
  
  
  /**
   * Gets the value of the InstructionType field.
   * The specific instruction type this instruction relates to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.InstructionType getInstructionType();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PolicyType field.
   * The policy type this instruction relates to. If no policy type is specified, it will relate to all types.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Gets the value of the SpecialHandling field.
   * The special handling object this other instruction relates to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialHandling getSpecialHandling();
  
  
  public gw.pl.persistence.core.Key getSpecialHandlingID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OtherInstruction getSubtype();
  
  
  /**
   * Removes the given element from the Comments_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromComments_L10N_ARRAY(entity.OtherInstruction_Comments_L10N element);
  
  
  /**
   * Removes the given element from the Comments_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromComments_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the Comments_L10N_ARRAY field.
   */
  public void setComments_L10N_ARRAY(entity.OtherInstruction_Comments_L10N[] value);
  
  
  /**
   * Sets the value of the InstructionCategory field.
   */
  public void setInstructionCategory(typekey.InstructionCategory value);
  
  
  /**
   * Sets the value of the InstructionType field.
   */
  public void setInstructionType(typekey.InstructionType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the SpecialHandling field.
   */
  public void setSpecialHandling(entity.SpecialHandling value);
  
  
  public void setSpecialHandlingID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.OtherInstruction value);
  
  
  
}