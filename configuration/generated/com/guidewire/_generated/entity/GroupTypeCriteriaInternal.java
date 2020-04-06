package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GroupTypeCriteria.eti;GroupTypeCriteria.eix;GroupTypeCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GroupTypeCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Group field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the RequiredGroupType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GroupType getRequiredGroupType();
  
  
  /**
   * Gets the value of the IncludeSubGroups field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIncludeSubGroups();
  
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the IncludeSubGroups field.
   */
  public void setIncludeSubGroups(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the RequiredGroupType field.
   */
  public void setRequiredGroupType(typekey.GroupType value);
  
  
  
}