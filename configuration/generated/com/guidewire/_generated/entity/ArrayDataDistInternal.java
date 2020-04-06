package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ArrayDataDist.eti;ArrayDataDist.eix;ArrayDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ArrayDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.database.impl.ArrayDataDistInternalMethods {
  /**
   * Adds the given element to the ArraySizeCntDDs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToArraySizeCntDDs(entity.ArraySizeCntDD element);
  
  
  /**
   * Gets the value of the ArrayEntityName field.
   * Entity associated with array
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getArrayEntityName();
  
  
  /**
   * Gets the value of the ArrayEntityTableName field.
   * Table for array entity
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getArrayEntityTableName();
  
  
  /**
   * Gets the value of the ArrayName field.
   * Name of array.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getArrayName();
  
  
  /**
   * Gets the value of the ArraySizeCntDDs field.
   * Collection of ArraySizeCntDDs linked to this ArrayDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ArraySizeCntDD[] getArraySizeCntDDs();
  
  
  /**
   * Gets the value of the MaxSize field.
   * Maximum array size.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMaxSize();
  
  
  /**
   * Gets the value of the MeanSize field.
   * Mean size of arrays.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getMeanSize();
  
  
  /**
   * Gets the value of the MedianSize field.
   * Median size of arrays.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMedianSize();
  
  
  /**
   * Gets the value of the MinSize field.
   * Minimum array size.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMinSize();
  
  
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
   * Removes the given element from the ArraySizeCntDDs array. This is achieved by marking the element for removal.
   */
  public void removeFromArraySizeCntDDs(entity.ArraySizeCntDD element);
  
  
  /**
   * Removes the given element from the ArraySizeCntDDs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromArraySizeCntDDs(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ArrayEntityName field.
   */
  public void setArrayEntityName(java.lang.String value);
  
  
  /**
   * Sets the value of the ArrayEntityTableName field.
   */
  public void setArrayEntityTableName(java.lang.String value);
  
  
  /**
   * Sets the value of the ArrayName field.
   */
  public void setArrayName(java.lang.String value);
  
  
  /**
   * Sets the value of the ArraySizeCntDDs field.
   */
  public void setArraySizeCntDDs(entity.ArraySizeCntDD[] value);
  
  
  /**
   * Sets the value of the MaxSize field.
   */
  public void setMaxSize(java.lang.Long value);
  
  
  /**
   * Sets the value of the MeanSize field.
   */
  public void setMeanSize(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the MedianSize field.
   */
  public void setMedianSize(java.lang.Long value);
  
  
  /**
   * Sets the value of the MinSize field.
   */
  public void setMinSize(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumNonNull field.
   */
  public void setNumNonNull(java.lang.Long value);
  
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value);
  
  
  public void setTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  
}