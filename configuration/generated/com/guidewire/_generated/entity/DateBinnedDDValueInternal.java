package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DateBinnedDDValue.eti;DateBinnedDDValue.eix;DateBinnedDDValue.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DateBinnedDDValueInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.database.impl.DateBinnedDDValueInternalMethods {
  /**
   * Adds the given element to the DateBins array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToDateBins(entity.DateBinnedDDDateBin element);
  
  
  /**
   * Gets the value of the AddlValue field.
   * Additional column value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAddlValue();
  
  
  /**
   * Gets the value of the DateBinnedDataDist field.
   * TypeKeyDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateBinnedDataDist getDateBinnedDataDist();
  
  
  public gw.pl.persistence.core.Key getDateBinnedDataDistID();
  
  
  /**
   * Gets the value of the DateBins field.
   * Date bins for this value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateBinnedDDDateBin[] getDateBins();
  
  
  /**
   * Gets the value of the MaximumDate field.
   * Maximum date and time for this date column and value bin
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMaximumDate();
  
  
  /**
   * Gets the value of the MinimumDate field.
   * Minimum date and time for this date column and value bin
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMinimumDate();
  
  
  /**
   * Gets the value of the NullValues field.
   * Count of items in this value bin with null date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNullValues();
  
  
  /**
   * Gets the value of the Value field.
   * Main column value.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getValue();
  
  
  /**
   * Removes the given element from the DateBins array. This is achieved by marking the element for removal.
   */
  public void removeFromDateBins(entity.DateBinnedDDDateBin element);
  
  
  /**
   * Removes the given element from the DateBins array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromDateBins(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AddlValue field.
   */
  public void setAddlValue(java.lang.String value);
  
  
  /**
   * Sets the value of the DateBinnedDataDist field.
   */
  public void setDateBinnedDataDist(entity.DateBinnedDataDist value);
  
  
  public void setDateBinnedDataDistID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DateBins field.
   */
  public void setDateBins(entity.DateBinnedDDDateBin[] value);
  
  
  /**
   * Sets the value of the MaximumDate field.
   */
  public void setMaximumDate(java.util.Date value);
  
  
  /**
   * Sets the value of the MinimumDate field.
   */
  public void setMinimumDate(java.util.Date value);
  
  
  /**
   * Sets the value of the NullValues field.
   */
  public void setNullValues(java.lang.Long value);
  
  
  /**
   * Sets the value of the Value field.
   */
  public void setValue(java.lang.String value);
  
  
  
}