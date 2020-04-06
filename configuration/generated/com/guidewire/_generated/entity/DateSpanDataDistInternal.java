package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DateSpanDataDist.eti;DateSpanDataDist.eix;DateSpanDataDist.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DateSpanDataDistInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the DateColName field.
   * Date column name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDateColName();
  
  
  /**
   * Gets the value of the MaxDate field.
   * Latest date stored.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMaxDate();
  
  
  /**
   * Gets the value of the MinDate field.
   * Earliest date stored.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getMinDate();
  
  
  /**
   * Gets the value of the TableDataDist field.
   * TableDataDist for this object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TableDataDist getTableDataDist();
  
  
  public gw.pl.persistence.core.Key getTableDataDistID();
  
  
  /**
   * Sets the value of the DateColName field.
   */
  public void setDateColName(java.lang.String value);
  
  
  /**
   * Sets the value of the MaxDate field.
   */
  public void setMaxDate(java.util.Date value);
  
  
  /**
   * Sets the value of the MinDate field.
   */
  public void setMinDate(java.util.Date value);
  
  
  /**
   * Sets the value of the TableDataDist field.
   */
  public void setTableDataDist(entity.TableDataDist value);
  
  
  public void setTableDataDistID(gw.pl.persistence.core.Key value);
  
  
  
}