package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TypeKeyDataDist.eti;TypeKeyDataDist.eix;TypeKeyDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TypeKeyDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Adds the given element to the TypeCodeCountDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTypeCodeCountDataDists(entity.TypeCodeCountDataDist element);
  
  
  /**
   * Gets the value of the NumNonNull field.
   * Count of # of non null values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumNonNull();
  
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist();
  
  
  public gw.pl.persistence.core.Key getTableDataDistID();
  
  
  /**
   * Gets the value of the TypeCodeCountDataDists field.
   * Collection of TypeCodeCountDataDists linked to this ArrayDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TypeCodeCountDataDist[] getTypeCodeCountDataDists();
  
  
  /**
   * Gets the value of the TypeKeyName field.
   * Name of type key.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTypeKeyName();
  
  
  /**
   * Removes the given element from the TypeCodeCountDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromTypeCodeCountDataDists(entity.TypeCodeCountDataDist element);
  
  
  /**
   * Removes the given element from the TypeCodeCountDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTypeCodeCountDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the NumNonNull field.
   */
  public void setNumNonNull(java.lang.Long value);
  
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value);
  
  
  public void setTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TypeCodeCountDataDists field.
   */
  public void setTypeCodeCountDataDists(entity.TypeCodeCountDataDist[] value);
  
  
  /**
   * Sets the value of the TypeKeyName field.
   */
  public void setTypeKeyName(java.lang.String value);
  
  
  
}