package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "GenericGroupDataDist.eti;GenericGroupDataDist.eix;GenericGroupDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface GenericGroupDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.database.impl.GenericGroupDataDistInternalMethods {
  /**
   * Adds the given element to the GenericGroupColumnNameDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToGenericGroupColumnNameDataDists(entity.GenericGroupColumnNameDataDist element);
  
  
  /**
   * Adds the given element to the GenericGroupCountDataDists array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToGenericGroupCountDataDists(entity.GenericGroupCountDataDist element);
  
  
  /**
   * Gets the value of the Description field.
   * Description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the ExtendedDescription field.
   * Extended description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getExtendedDescription();
  
  
  /**
   * Gets the value of the GenericGroupColumnNameDataDists field.
   * Collection of GenericGroupColumnNameDataDists linked to this ArrayDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GenericGroupColumnNameDataDist[] getGenericGroupColumnNameDataDists();
  
  
  /**
   * Gets the value of the GenericGroupCountDataDists field.
   * Collection of GenericGroupCountDataDists linked to this ArrayDataDist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GenericGroupCountDataDist[] getGenericGroupCountDataDists();
  
  
  /**
   * Gets the value of the OptionalPredicate field.
   * Optional predicate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOptionalPredicate();
  
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist();
  
  
  public gw.pl.persistence.core.Key getTableDataDistID();
  
  
  /**
   * Removes the given element from the GenericGroupColumnNameDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromGenericGroupColumnNameDataDists(entity.GenericGroupColumnNameDataDist element);
  
  
  /**
   * Removes the given element from the GenericGroupColumnNameDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromGenericGroupColumnNameDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the GenericGroupCountDataDists array. This is achieved by marking the element for removal.
   */
  public void removeFromGenericGroupCountDataDists(entity.GenericGroupCountDataDist element);
  
  
  /**
   * Removes the given element from the GenericGroupCountDataDists array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromGenericGroupCountDataDists(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the ExtendedDescription field.
   */
  public void setExtendedDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the GenericGroupColumnNameDataDists field.
   */
  public void setGenericGroupColumnNameDataDists(entity.GenericGroupColumnNameDataDist[] value);
  
  
  /**
   * Sets the value of the GenericGroupCountDataDists field.
   */
  public void setGenericGroupCountDataDists(entity.GenericGroupCountDataDist[] value);
  
  
  /**
   * Sets the value of the OptionalPredicate field.
   */
  public void setOptionalPredicate(java.lang.String value);
  
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value);
  
  
  public void setTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  
}