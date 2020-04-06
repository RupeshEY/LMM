package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TypecodeUsageReport.eti;TypecodeUsageReport.eix;TypecodeUsageReport.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TypecodeUsageReportInternal extends com.guidewire._generated.entity.KeyableBeanInternal, com.guidewire.pl.domain.upgrade.TypecodeUsageReportPublicMethods {
  /**
   * Gets the value of the ColumnName field.
   * Name of the column
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getColumnName();
  
  
  /**
   * Gets the value of the Count field.
   * Number of typekey references for this (entity, column, typelist) tuple
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getCount();
  
  
  /**
   * Gets the value of the ReportItem field.
   * One line item in the report
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReportItem();
  
  
  /**
   * Gets the value of the TableName field.
   * Name of the entity
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTableName();
  
  
  /**
   * Gets the value of the Typelist field.
   * Name of the typelist
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTypelist();
  
  
  /**
   * Sets the value of the ColumnName field.
   */
  public void setColumnName(java.lang.String value);
  
  
  /**
   * Sets the value of the Count field.
   */
  public void setCount(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReportItem field.
   */
  public void setReportItem(java.lang.String value);
  
  
  /**
   * Sets the value of the TableName field.
   */
  public void setTableName(java.lang.String value);
  
  
  /**
   * Sets the value of the Typelist field.
   */
  public void setTypelist(java.lang.String value);
  
  
  
}