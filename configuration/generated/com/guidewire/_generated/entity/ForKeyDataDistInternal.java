package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ForKeyDataDist.eti;ForKeyDataDist.eix;ForKeyDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ForKeyDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the ForeignKeyEntityName field.
   * Name of foreign key entity
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getForeignKeyEntityName();
  
  
  /**
   * Gets the value of the ForeignKeyName field.
   * Name of foreign key.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getForeignKeyName();
  
  
  /**
   * Gets the value of the ForeignKeyTableName field.
   * Name of table of foreign key
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getForeignKeyTableName();
  
  
  /**
   * Gets the value of the NumNonNull field.
   * Count of # of non null values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumNonNull();
  
  
  /**
   * Gets the value of the RatioFKtoPKValues field.
   * Ratio of non-null foreign key values to primary key values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRatioFKtoPKValues();
  
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist();
  
  
  public gw.pl.persistence.core.Key getTableDataDistID();
  
  
  /**
   * Sets the value of the ForeignKeyEntityName field.
   */
  public void setForeignKeyEntityName(java.lang.String value);
  
  
  /**
   * Sets the value of the ForeignKeyName field.
   */
  public void setForeignKeyName(java.lang.String value);
  
  
  /**
   * Sets the value of the ForeignKeyTableName field.
   */
  public void setForeignKeyTableName(java.lang.String value);
  
  
  /**
   * Sets the value of the NumNonNull field.
   */
  public void setNumNonNull(java.lang.Long value);
  
  
  /**
   * Sets the value of the RatioFKtoPKValues field.
   */
  public void setRatioFKtoPKValues(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value);
  
  
  public void setTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  
}