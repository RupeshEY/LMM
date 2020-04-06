package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Company.eti;Company.eix;Company.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CompanyInternal extends com.guidewire._generated.entity.ContactInternal {
  /**
   * Gets the value of the ECFBureauId_Ext field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getECFBureauId_Ext();
  
  
  /**
   * Gets the value of the ECFBureauType_Ext field.
   * Coded indication of the maintenance agency (Bureau).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFBureauType_Ext getECFBureauType_Ext();
  
  
  /**
   * Sets the value of the ECFBureauId_Ext field.
   */
  public void setECFBureauId_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the ECFBureauType_Ext field.
   */
  public void setECFBureauType_Ext(typekey.ECFBureauType_Ext value);
  
  
  
}