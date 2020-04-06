package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GroupParentView.eti;GroupParentView.eix;GroupParentView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GroupParentViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.community.GroupParentViewPublicMethods {
  /**
   * Gets the value of the Group field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the Parent field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getParent();
  
  
  public gw.pl.persistence.core.Key getParentID();
  
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Parent field.
   */
  public void setParent(entity.Group value);
  
  
  public void setParentID(gw.pl.persistence.core.Key value);
  
  
  
}