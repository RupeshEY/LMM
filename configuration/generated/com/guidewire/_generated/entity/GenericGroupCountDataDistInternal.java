package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GenericGroupCountDataDist.eti;GenericGroupCountDataDist.eix;GenericGroupCountDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GenericGroupCountDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the GenericGroupDataDist field.
   * GenericGroupDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GenericGroupDataDist getGenericGroupDataDist();
  
  
  public gw.pl.persistence.core.Key getGenericGroupDataDistID();
  
  
  /**
   * Gets the value of the GroupSize field.
   * Size of the group of duplicate values on this this column group and table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getGroupSize();
  
  
  /**
   * Gets the value of the GroupSizeCount field.
   * Number of groups for this size for this table.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getGroupSizeCount();
  
  
  /**
   * Sets the value of the GenericGroupDataDist field.
   */
  public void setGenericGroupDataDist(entity.GenericGroupDataDist value);
  
  
  public void setGenericGroupDataDistID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the GroupSize field.
   */
  public void setGroupSize(java.lang.Long value);
  
  
  /**
   * Sets the value of the GroupSizeCount field.
   */
  public void setGroupSizeCount(java.lang.Long value);
  
  
  
}