package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Credential.eti;Credential.eix;Credential.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CredentialInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.pl.domain.community.CredentialPublicMethods {
  /**
   * Gets the value of the AccountCode_Ext field.
   * The Account Code that the CLASS User ID belongs to of the person making the response.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAccountCode_Ext();
  
  
  /**
   * Gets the value of the ClassUserId_Ext field.
   * The CLASS User ID of the person making the response.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClassUserId_Ext();
  
  
  /**
   * Gets the value of the FailedAttempts field.
   * The number of consecutive failed login attempts, or 0 if the last login attempt was successful.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFailedAttempts();
  
  
  /**
   * Gets the value of the FailedTime field.
   * The time the last failed login attempt was made, or null if the last login attempt was successful.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getFailedTime();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LockDate field.
   * The time at which this credential was locked, or null if the credential is not locked.  A user cannot log in if their credential was locked within the lockout interval, which is paramaterizeable.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLockDate();
  
  
  /**
   * Gets the value of the Password field.
   * User password.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPassword();
  
  
  /**
   * Gets the value of the UserName field.
   * User login name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUserName();
  
  
  /**
   * Gets the value of the UserNameDenorm field.
   * denorm field for UserName
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUserNameDenorm();
  
  
  /**
   * Gets the value of the Active field.
   * Whether this credential is active. Inactive credentials are not allowed to log in.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isActive();
  
  
  /**
   * Sets the value of the AccountCode_Ext field.
   */
  public void setAccountCode_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the Active field.
   */
  public void setActive(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ClassUserId_Ext field.
   */
  public void setClassUserId_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the FailedAttempts field.
   */
  public void setFailedAttempts(java.lang.Integer value);
  
  
  /**
   * Sets the value of the FailedTime field.
   */
  public void setFailedTime(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LockDate field.
   */
  public void setLockDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Password field.
   */
  public void setPassword(java.lang.String value);
  
  
  /**
   * Sets the value of the UserName field.
   */
  public void setUserName(java.lang.String value);
  
  
  /**
   * Sets the value of the UserNameDenorm field.
   */
  public void setUserNameDenorm(java.lang.String value);
  
  
  
}