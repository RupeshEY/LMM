package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UpgradeDBStorageSet.eti;UpgradeDBStorageSet.eix;UpgradeDBStorageSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UpgradeDBStorageSetInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.upgrader.UpgradeDBStorageSetPublicMethods {
  /**
   * Adds the given element to the UpgradeDBStorageSetColumns array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpgradeDBStorageSetColumns(entity.UpgradeDBStorageSetColumn element);
  
  
  /**
   * Adds the given element to the UpgradeDBStorageSetResults array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToUpgradeDBStorageSetResults(entity.UpgradeDBStorageSetResult element);
  
  
  /**
   * Gets the value of the Name field.
   * Name of storage set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the TimeTaken field.
   * Time storage set taken.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getTimeTaken();
  
  
  /**
   * Gets the value of the UpgradeDBStorageSetColumns field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeDBStorageSetColumn[] getUpgradeDBStorageSetColumns();
  
  
  /**
   * Gets the value of the UpgradeDBStorageSetResults field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeDBStorageSetResult[] getUpgradeDBStorageSetResults();
  
  
  /**
   * Gets the value of the UpgradeDBStorageSetType field.
   * Database storage set type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UpgradeDBStorageSetType getUpgradeDBStorageSetType();
  
  
  /**
   * Gets the value of the UpgradeInstance field.
   * Upgrade instance for this object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.UpgradeInstance getUpgradeInstance();
  
  
  public gw.pl.persistence.core.Key getUpgradeInstanceID();
  
  
  /**
   * Gets the value of the AfterUpgrade field.
   * True is set created after the process, false if before
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAfterUpgrade();
  
  
  /**
   * Removes the given element from the UpgradeDBStorageSetColumns array. This is achieved by marking the element for removal.
   */
  public void removeFromUpgradeDBStorageSetColumns(entity.UpgradeDBStorageSetColumn element);
  
  
  /**
   * Removes the given element from the UpgradeDBStorageSetColumns array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpgradeDBStorageSetColumns(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the UpgradeDBStorageSetResults array. This is achieved by marking the element for removal.
   */
  public void removeFromUpgradeDBStorageSetResults(entity.UpgradeDBStorageSetResult element);
  
  
  /**
   * Removes the given element from the UpgradeDBStorageSetResults array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromUpgradeDBStorageSetResults(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AfterUpgrade field.
   */
  public void setAfterUpgrade(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the TimeTaken field.
   */
  public void setTimeTaken(java.util.Date value);
  
  
  /**
   * Sets the value of the UpgradeDBStorageSetColumns field.
   */
  public void setUpgradeDBStorageSetColumns(entity.UpgradeDBStorageSetColumn[] value);
  
  
  /**
   * Sets the value of the UpgradeDBStorageSetResults field.
   */
  public void setUpgradeDBStorageSetResults(entity.UpgradeDBStorageSetResult[] value);
  
  
  /**
   * Sets the value of the UpgradeDBStorageSetType field.
   */
  public void setUpgradeDBStorageSetType(typekey.UpgradeDBStorageSetType value);
  
  
  /**
   * Sets the value of the UpgradeInstance field.
   */
  public void setUpgradeInstance(entity.UpgradeInstance value);
  
  
  public void setUpgradeInstanceID(gw.pl.persistence.core.Key value);
  
  
  
}