package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DataGenInfo.eti;DataGenInfo.eix;DataGenInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DataGenInfoInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Adds the given element to the Details array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDetails(entity.DataGenInfoDetail element);
  
  
  /**
   * Gets the value of the Action field.
   * the action type this data-gen performed
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DataGenActionType getAction();
  
  
  /**
   * Gets the value of the BuildVersion field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBuildVersion();
  
  
  /**
   * Gets the value of the Description field.
   * Info logged by the generation process.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the Details field.
   * Detailed description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DataGenInfoDetail[] getDetails();
  
  
  /**
   * Gets the value of the PerformDate field.
   * Time this generation happened.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPerformDate();
  
  
  /**
   * Gets the value of the Status field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DataGenStatusType getStatus();
  
  
  /**
   * Removes the given element from the Details array. This is achieved by marking the element for removal.
   */
  public void removeFromDetails(entity.DataGenInfoDetail element);
  
  
  /**
   * Removes the given element from the Details array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDetails(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Action field.
   */
  public void setAction(typekey.DataGenActionType value);
  
  
  /**
   * Sets the value of the BuildVersion field.
   */
  public void setBuildVersion(java.lang.String value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the Details field.
   */
  public void setDetails(entity.DataGenInfoDetail[] value);
  
  
  /**
   * Sets the value of the PerformDate field.
   */
  public void setPerformDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.DataGenStatusType value);
  
  
  
}