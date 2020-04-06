package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UserBackup.eti;UserBackup.eix;UserBackup.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UserBackupInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the BackupUser field.
   * User that will serve as backup.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getBackupUser();
  
  
  public gw.pl.persistence.core.Key getBackupUserID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the User field.
   * User.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
  /**
   * Sets the value of the BackupUser field.
   */
  public void setBackupUser(entity.User value);
  
  
  public void setBackupUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  
}