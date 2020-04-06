package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GroupSearchCriterion.eti;GroupSearchCriterion.eix;GroupSearchCriterion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GroupSearchCriterionInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.custom.GroupSearchCriterionPublicMethods, com.guidewire.pl.domain.custom.impl.GroupSearchCriterionInternalMethods {
  /**
   * Gets the value of the AssignedToGroup field.
   * The id of the group to which the search should be restricted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getAssignedToGroup();
  
  
  public gw.pl.persistence.core.Key getAssignedToGroupID();
  
  
  /**
   * Gets the value of the IncludeSubGroups field.
   * Should the search be restricted to just the given group, or to the group and all its sub-groups.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeSubGroups();
  
  
  /**
   * Sets the value of the AssignedToGroup field.
   */
  public void setAssignedToGroup(entity.Group value);
  
  
  public void setAssignedToGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the IncludeSubGroups field.
   */
  public void setIncludeSubGroups(java.lang.Boolean value);
  
  
  
}