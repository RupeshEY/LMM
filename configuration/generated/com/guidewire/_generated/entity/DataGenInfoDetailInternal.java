package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DataGenInfoDetail.eti;DataGenInfoDetail.eix;DataGenInfoDetail.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DataGenInfoDetailInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the DataGenInfo field.
   * Parent.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DataGenInfo getDataGenInfo();
  
  
  public gw.pl.persistence.core.Key getDataGenInfoID();
  
  
  /**
   * Gets the value of the Description field.
   * Line for detailed description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the DisplayOrder field.
   * display order within parent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDisplayOrder();
  
  
  /**
   * Gets the value of the NumIndents field.
   * # of tabs for readability
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumIndents();
  
  
  /**
   * Sets the value of the DataGenInfo field.
   */
  public void setDataGenInfo(entity.DataGenInfo value);
  
  
  public void setDataGenInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the DisplayOrder field.
   */
  public void setDisplayOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NumIndents field.
   */
  public void setNumIndents(java.lang.Integer value);
  
  
  
}