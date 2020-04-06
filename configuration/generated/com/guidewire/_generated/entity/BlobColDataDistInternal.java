package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BlobColDataDist.eti;BlobColDataDist.eix;BlobColDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BlobColDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the AverageLength field.
   * Average length of blob values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAverageLength();
  
  
  /**
   * Gets the value of the BlobColName field.
   * Blob column name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBlobColName();
  
  
  /**
   * Gets the value of the MaximumLength field.
   * Maximum length of blob values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMaximumLength();
  
  
  /**
   * Gets the value of the MinimumLength field.
   * Minimum length of blob values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMinimumLength();
  
  
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
   * Sets the value of the AverageLength field.
   */
  public void setAverageLength(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the BlobColName field.
   */
  public void setBlobColName(java.lang.String value);
  
  
  /**
   * Sets the value of the MaximumLength field.
   */
  public void setMaximumLength(java.lang.Long value);
  
  
  /**
   * Sets the value of the MinimumLength field.
   */
  public void setMinimumLength(java.lang.Long value);
  
  
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