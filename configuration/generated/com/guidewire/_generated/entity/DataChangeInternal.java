package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DataChange.eti;DataChange.eix;DataChange.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DataChangeInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.pl.domain.history.DataChangePublicMethods {
  java.lang.String DATACHANGEADDED_EVENT = "DataChangeAdded";
  
  java.lang.String DATACHANGECHANGED_EVENT = "DataChangeChanged";
  
  java.lang.String DATACHANGEEDITORISEXECUTOR_EVENT = "DataChangeEditorIsExecutor";
  
  java.lang.String DATACHANGEREMOVED_EVENT = "DataChangeRemoved";
  
  /**
   * Gets the value of the CreateDate field.
   * Date the gosu was added.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateDate();
  
  
  /**
   * Gets the value of the CreateUser field.
   * The user who created the gosu.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreateUser();
  
  
  public gw.pl.persistence.core.Key getCreateUserID();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the change requested.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the ExecuteDate field.
   * The time the gosu was executed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExecuteDate();
  
  
  /**
   * Gets the value of the ExecuteUser field.
   * The user who executed the gosu.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getExecuteUser();
  
  
  public gw.pl.persistence.core.Key getExecuteUserID();
  
  
  /**
   * Gets the value of the ExternalReference field.
   * An external reference for tracking change requests.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExternalReference();
  
  
  /**
   * Gets the value of the Gosu field.
   * The gosu to execute.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getGosu();
  
  
  /**
   * Gets the value of the Result field.
   * The result of executing the gosu.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getResult();
  
  
  /**
   * Gets the value of the Status field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DataChangeStatus getStatus();
  
  
  /**
   * Sets the value of the CreateDate field.
   */
  public void setCreateDate(java.util.Date value);
  
  
  /**
   * Sets the value of the CreateUser field.
   */
  public void setCreateUser(entity.User value);
  
  
  public void setCreateUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the ExecuteDate field.
   */
  public void setExecuteDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExecuteUser field.
   */
  public void setExecuteUser(entity.User value);
  
  
  public void setExecuteUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ExternalReference field.
   */
  public void setExternalReference(java.lang.String value);
  
  
  /**
   * Sets the value of the Gosu field.
   */
  public void setGosu(java.lang.String value);
  
  
  /**
   * Sets the value of the Result field.
   */
  public void setResult(java.lang.String value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.DataChangeStatus value);
  
  
  
}