package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DateBinnedDataDist.eti;DateBinnedDataDist.eix;DateBinnedDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DateBinnedDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Adds the given element to the ValueBins array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToValueBins(entity.DateBinnedDDValue element);
  
  
  /**
   * Gets the value of the AddlColumnName field.
   * Additional value column name (optional)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddlColumnName();
  
  
  /**
   * Gets the value of the DataType field.
   * Data type of primary column in value bins.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DateBinDataType getDataType();
  
  
  /**
   * Gets the value of the DateColumnName field.
   * Date column name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDateColumnName();
  
  
  /**
   * Gets the value of the Description field.
   * Description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist();
  
  
  public gw.pl.persistence.core.Key getTableDataDistID();
  
  
  /**
   * Gets the value of the ValueBins field.
   * Value of MainColumn and Addlcolumn (these must be bounded)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateBinnedDDValue[] getValueBins();
  
  
  /**
   * Gets the value of the ValueColumnName field.
   * Main value column name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getValueColumnName();
  
  
  /**
   * Removes the given element from the ValueBins array. This is achieved by marking the element for removal.
   */
  public void removeFromValueBins(entity.DateBinnedDDValue element);
  
  
  /**
   * Removes the given element from the ValueBins array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromValueBins(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AddlColumnName field.
   */
  public void setAddlColumnName(java.lang.String value);
  
  
  /**
   * Sets the value of the DataType field.
   */
  public void setDataType(typekey.DateBinDataType value);
  
  
  /**
   * Sets the value of the DateColumnName field.
   */
  public void setDateColumnName(java.lang.String value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value);
  
  
  public void setTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ValueBins field.
   */
  public void setValueBins(entity.DateBinnedDDValue[] value);
  
  
  /**
   * Sets the value of the ValueColumnName field.
   */
  public void setValueColumnName(java.lang.String value);
  
  
  
}