package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CustomDataDistRequest.eti;CustomDataDistRequest.eix;CustomDataDistRequest.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CustomDataDistRequestInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.database.impl.CustomDataDistRequestInternalMethods {
  /**
   * Adds the given element to the CustomDDColumns array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCustomDDColumns(entity.CustomDDColumn element);
  
  
  /**
   * Adds the given element to the CustomDDResults array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCustomDDResults(entity.CustomDDResult element);
  
  
  /**
   * Gets the value of the CustomDDColumns field.
   * Collection of CustomDDColumns linked to this CustomDataDistRequest.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CustomDDColumn[] getCustomDDColumns();
  
  
  /**
   * Gets the value of the CustomDDResults field.
   * Collection of CustomDDResults linked to this CustomDataDistRequest.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CustomDDResult[] getCustomDDResults();
  
  
  /**
   * Gets the value of the Description field.
   * Description.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the DistType field.
   * Data distribution type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DataDistributionType getDistType();
  
  
  /**
   * Gets the value of the Query field.
   * Query.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getQuery();
  
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist();
  
  
  public gw.pl.persistence.core.Key getTableDataDistID();
  
  
  /**
   * Removes the given element from the CustomDDColumns array. This is achieved by marking the element for removal.
   */
  public void removeFromCustomDDColumns(entity.CustomDDColumn element);
  
  
  /**
   * Removes the given element from the CustomDDColumns array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCustomDDColumns(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the CustomDDResults array. This is achieved by marking the element for removal.
   */
  public void removeFromCustomDDResults(entity.CustomDDResult element);
  
  
  /**
   * Removes the given element from the CustomDDResults array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCustomDDResults(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CustomDDColumns field.
   */
  public void setCustomDDColumns(entity.CustomDDColumn[] value);
  
  
  /**
   * Sets the value of the CustomDDResults field.
   */
  public void setCustomDDResults(entity.CustomDDResult[] value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the DistType field.
   */
  public void setDistType(typekey.DataDistributionType value);
  
  
  /**
   * Sets the value of the Query field.
   */
  public void setQuery(java.lang.String value);
  
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value);
  
  
  public void setTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  
}