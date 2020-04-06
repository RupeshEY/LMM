package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Editable.eti;Editable.eix;Editable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface EditableInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.persistence.core.impl.VersionableInternal {
  /**
   * Gets the value of the CreateTime field.
   * Timestamp when the object was created
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime();
  
  
  /**
   * Gets the value of the CreateUser field.
   * User who created the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreateUser();
  
  
  public gw.pl.persistence.core.Key getCreateUserID();
  
  
  /**
   * Gets the value of the UpdateTime field.
   * Timestamp when the object was last updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime();
  
  
  /**
   * Gets the value of the UpdateUser field.
   * User who last updated the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUpdateUser();
  
  
  public gw.pl.persistence.core.Key getUpdateUserID();
  
  
  /**
   * Sets the value of the CreateTime field.
   */
  public void setCreateTime(java.util.Date value);
  
  
  /**
   * Sets the value of the CreateUser field.
   */
  public void setCreateUser(entity.User value);
  
  
  public void setCreateUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the UpdateTime field.
   */
  public void setUpdateTime(java.util.Date value);
  
  
  /**
   * Sets the value of the UpdateUser field.
   */
  public void setUpdateUser(entity.User value);
  
  
  public void setUpdateUserID(gw.pl.persistence.core.Key value);
  
  
  
}