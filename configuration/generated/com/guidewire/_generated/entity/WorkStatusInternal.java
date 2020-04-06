package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WorkStatus.eti;WorkStatus.eix;WorkStatus.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WorkStatusInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.WorkStatus {
  /**
   * Gets the value of the Comments field.
   * Additional comments.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the EmploymentData field.
   * The related employee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.EmploymentData getEmploymentData();
  
  
  public gw.pl.persistence.core.Key getEmploymentDataID();
  
  
  /**
   * Gets the value of the LastWorkedDate field.
   * The date the employee last worked. Utilized if WorkCapacity == Off-work
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLastWorkedDate();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the NumDaysWorked field.
   * Number of days worked per week.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNumDaysWorked();
  
  
  /**
   * Gets the value of the NumHoursWorked field.
   * Number of hours worked per week during this period
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNumHoursWorked();
  
  
  /**
   * Gets the value of the Status field.
   * Work capacity status for the employee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.WorkCapacity getStatus();
  
  
  /**
   * Gets the value of the StatusDate field.
   * Date when status changed to this entity's WorkCapacity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStatusDate();
  
  
  /**
   * Gets the value of the StatusEndDate field.
   * Last day at this WorkCapacity status. Null indicates current status.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStatusEndDate();
  
  
  /**
   * Gets the value of the WageAmountPostInjury field.
   * Amount of wages per week post-injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getWageAmountPostInjury();
  
  
  /**
   * Gets the value of the PaidFullForLastWorked field.
   * Indicates if the employee was paid in full for the Last day worked. Utilized if WorkCapacity == Off-work
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPaidFullForLastWorked();
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the EmploymentData field.
   */
  public void setEmploymentData(entity.EmploymentData value);
  
  
  public void setEmploymentDataID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LastWorkedDate field.
   */
  public void setLastWorkedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the NumDaysWorked field.
   */
  public void setNumDaysWorked(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the NumHoursWorked field.
   */
  public void setNumHoursWorked(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PaidFullForLastWorked field.
   */
  public void setPaidFullForLastWorked(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.WorkCapacity value);
  
  
  /**
   * Sets the value of the StatusDate field.
   */
  public void setStatusDate(java.util.Date value);
  
  
  /**
   * Sets the value of the StatusEndDate field.
   */
  public void setStatusEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the WageAmountPostInjury field.
   */
  public void setWageAmountPostInjury(gw.api.financials.CurrencyAmount value);
  
  
  
}