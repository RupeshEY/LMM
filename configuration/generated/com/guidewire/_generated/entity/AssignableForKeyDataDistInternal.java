package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AssignableForKeyDataDist.eti;AssignableForKeyDataDist.eix;AssignableForKeyDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AssignableForKeyDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.database.impl.AssignableForKeyDataDistInternalMethods {
  /**
   * Adds the given element to the AssignableForKeySizeCntDDs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAssignableForKeySizeCntDDs(entity.AssignableForKeySizeCntDD element);
  
  
  /**
   * Gets the value of the AssignableForKeyName field.
   * Name of assignable foreign key.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAssignableForKeyName();
  
  
  /**
   * Gets the value of the AssignableForKeySizeCntDDs field.
   * Collection of AssignableForKeySizeCntDDs linked to this AssignableForKeyDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AssignableForKeySizeCntDD[] getAssignableForKeySizeCntDDs();
  
  
  /**
   * Gets the value of the MeanSize field.
   * Mean size of assignable foreign keys.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getMeanSize();
  
  
  /**
   * Gets the value of the MedianSize field.
   * Median size of assignable foreign keys.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMedianSize();
  
  
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
   * Removes the given element from the AssignableForKeySizeCntDDs array. This is achieved by marking the element for removal.
   */
  public void removeFromAssignableForKeySizeCntDDs(entity.AssignableForKeySizeCntDD element);
  
  
  /**
   * Removes the given element from the AssignableForKeySizeCntDDs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAssignableForKeySizeCntDDs(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AssignableForKeyName field.
   */
  public void setAssignableForKeyName(java.lang.String value);
  
  
  /**
   * Sets the value of the AssignableForKeySizeCntDDs field.
   */
  public void setAssignableForKeySizeCntDDs(entity.AssignableForKeySizeCntDD[] value);
  
  
  /**
   * Sets the value of the MeanSize field.
   */
  public void setMeanSize(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the MedianSize field.
   */
  public void setMedianSize(java.lang.Long value);
  
  
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