package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "HourAnalysisDataDist.eti;HourAnalysisDataDist.eix;HourAnalysisDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface HourAnalysisDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the AvgRowsPerHour field.
   * Average number of rows per hour.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAvgRowsPerHour();
  
  
  /**
   * Gets the value of the DatetimeColumnName field.
   * Name of datetime column.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDatetimeColumnName();
  
  
  /**
   * Gets the value of the MaxRowsPerHour field.
   * Maximum number of rows per hour.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMaxRowsPerHour();
  
  
  /**
   * Gets the value of the MinRowsPerHour field.
   * Minimum number of rows per hour.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getMinRowsPerHour();
  
  
  /**
   * Gets the value of the NumDistinctDates field.
   * Number of distinct hours in month.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumDistinctDates();
  
  
  /**
   * Gets the value of the NumDistinctHoursInDay field.
   * Number of distinct hours in day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getNumDistinctHoursInDay();
  
  
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
   * Sets the value of the AvgRowsPerHour field.
   */
  public void setAvgRowsPerHour(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DatetimeColumnName field.
   */
  public void setDatetimeColumnName(java.lang.String value);
  
  
  /**
   * Sets the value of the MaxRowsPerHour field.
   */
  public void setMaxRowsPerHour(java.lang.Long value);
  
  
  /**
   * Sets the value of the MinRowsPerHour field.
   */
  public void setMinRowsPerHour(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumDistinctDates field.
   */
  public void setNumDistinctDates(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumDistinctHoursInDay field.
   */
  public void setNumDistinctHoursInDay(java.lang.Long value);
  
  
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