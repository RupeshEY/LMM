package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SCMRiskCode_Ext.eti;SCMRiskCode_Ext.eix;SCMRiskCode_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SCMRiskCode_ExtInternal extends com.guidewire._generated.entity.RetireableInternal {
  /**
   * Gets the value of the Category field.
   * The category the code belongs to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFClassOfBusiness_Ext getCategory();
  
  
  /**
   * Gets the value of the Code field.
   * The entity's code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCode();
  
  
  /**
   * Gets the value of the Description field.
   * The description of the risk the code applies to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * The name of the code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Sets the value of the Category field.
   */
  public void setCategory(typekey.ECFClassOfBusiness_Ext value);
  
  
  /**
   * Sets the value of the Code field.
   */
  public void setCode(java.lang.String value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  
}