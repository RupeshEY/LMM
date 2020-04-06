package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DateAnalysisDataDist.eti;DateAnalysisDataDist.eix;DateAnalysisDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DateAnalysisDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.database.DateAnalysisDataDistPublicMethods {
  /**
   * Gets the value of the AvgRowsPerDate field.
   * Average number of rows per date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAvgRowsPerDate();
  
  
  /**
   * Gets the value of the DatetimeColumnName field.
   * Name of datetime column.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDatetimeColumnName();
  
  
  /**
   * Gets the value of the MaxRowsPerDate field.
   * Maximum number of rows per date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMaxRowsPerDate();
  
  
  /**
   * Gets the value of the MinRowsPerDate field.
   * Minimum number of rows per date.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMinRowsPerDate();
  
  
  /**
   * Gets the value of the NumDistinctDates field.
   * Number of distinct non-null dates.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumDistinctDates();
  
  
  /**
   * Gets the value of the NumNonNullNonLoadableDates field.
   * Number of non-null, non-loadable rows.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumNonNullNonLoadableDates();
  
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist();
  
  
  public gw.pl.persistence.core.Key getTableDataDistID();
  
  
  /**
   * Gets the value of the mnth field.
   * Month
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getmnth();
  
  
  /**
   * Gets the value of the yr field.
   * Year
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getyr();
  
  
  /**
   * Sets the value of the AvgRowsPerDate field.
   */
  public void setAvgRowsPerDate(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DatetimeColumnName field.
   */
  public void setDatetimeColumnName(java.lang.String value);
  
  
  /**
   * Sets the value of the MaxRowsPerDate field.
   */
  public void setMaxRowsPerDate(java.lang.Long value);
  
  
  /**
   * Sets the value of the MinRowsPerDate field.
   */
  public void setMinRowsPerDate(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumDistinctDates field.
   */
  public void setNumDistinctDates(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumNonNullNonLoadableDates field.
   */
  public void setNumNonNullNonLoadableDates(java.lang.Long value);
  
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value);
  
  
  public void setTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the mnth field.
   */
  public void setmnth(java.lang.Integer value);
  
  
  /**
   * Sets the value of the yr field.
   */
  public void setyr(java.lang.Integer value);
  
  
  
}