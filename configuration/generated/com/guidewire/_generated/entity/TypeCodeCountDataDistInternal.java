package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TypeCodeCountDataDist.eti;TypeCodeCountDataDist.eix;TypeCodeCountDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TypeCodeCountDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the TypeCode field.
   * Name of type code.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTypeCode();
  
  
  /**
   * Gets the value of the TypeCodeCount field.
   * Count of type code for this table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getTypeCodeCount();
  
  
  /**
   * Gets the value of the TypeKeyDataDist field.
   * TypeKeyDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TypeKeyDataDist getTypeKeyDataDist();
  
  
  public gw.pl.persistence.core.Key getTypeKeyDataDistID();
  
  
  /**
   * Sets the value of the TypeCode field.
   */
  public void setTypeCode(java.lang.String value);
  
  
  /**
   * Sets the value of the TypeCodeCount field.
   */
  public void setTypeCodeCount(java.lang.Long value);
  
  
  /**
   * Sets the value of the TypeKeyDataDist field.
   */
  public void setTypeKeyDataDist(entity.TypeKeyDataDist value);
  
  
  public void setTypeKeyDataDistID(gw.pl.persistence.core.Key value);
  
  
  
}