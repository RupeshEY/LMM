package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "EmploymentData.eti;EmploymentData.eix;EmploymentData.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface EmploymentDataInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.EmploymentData {
  /**
   * Adds the given element to the WorkStatusChanges array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToWorkStatusChanges(entity.WorkStatus element);
  
  
  /**
   * Gets the value of the Claim field.
   * The Claim that owns this EmploymentData
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClassCode field.
   * Classification of employee, based on state codes or NCCI codes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClassCode getClassCode();
  
  
  public gw.pl.persistence.core.Key getClassCodeID();
  
  
  /**
   * Gets the value of the DaysWorkedWeek field.
   * Text description of the days the employee normally works. For example, Monday-Friday or MWF.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDaysWorkedWeek();
  
  
  /**
   * Gets the value of the DepartmentCode field.
   * Code of department in which employee was working.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDepartmentCode();
  
  
  /**
   * Gets the value of the EmploymentStatus field.
   * Status of employment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.EmploymentStatusType getEmploymentStatus();
  
  
  /**
   * Gets the value of the HireDate field.
   * Employee's date of hire.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getHireDate();
  
  
  /**
   * Gets the value of the HireState field.
   * State in which the employee was hired.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getHireState();
  
  
  /**
   * Gets the value of the InjuryStartTime field.
   * Start time on day of injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getInjuryStartTime();
  
  
  /**
   * Gets the value of the LastWorkedDate field.
   * Date employee last worked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLastWorkedDate();
  
  
  /**
   * Gets the value of the LastYearIncome field.
   * Income in the last calendar year.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLastYearIncome();
  
  
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
   * Number of hours worked per day.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getNumHoursWorked();
  
  
  /**
   * Gets the value of the Occupation field.
   * Description of the employee's job.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOccupation();
  
  
  /**
   * Gets the value of the OvertimeRate field.
   * Overtime wage rate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getOvertimeRate();
  
  
  /**
   * Gets the value of the PayPeriod field.
   * Pay period of employee.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PayPeriodType getPayPeriod();
  
  
  /**
   * Gets the value of the SSBenefitsAmnt field.
   * Amount of Social Security benefits.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getSSBenefitsAmnt();
  
  
  /**
   * Gets the value of the ScndInjryFndAmnt field.
   * Amount of second injury fund benefits.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getScndInjryFndAmnt();
  
  
  /**
   * Gets the value of the ScndInjryFndDate field.
   * Date of initial notice to second injury fund.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getScndInjryFndDate();
  
  
  /**
   * Gets the value of the WageAmount field.
   * Amount of wages per pay period pre-injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getWageAmount();
  
  
  /**
   * Gets the value of the WageAmountPostInjury field.
   * Amount of wages per pay period post-injury.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getWageAmountPostInjury();
  
  
  /**
   * Gets the value of the WorkStatusChanges field.
   * Periods of time employee returned to work.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.WorkStatus[] getWorkStatusChanges();
  
  
  /**
   * Gets the value of the PaidFull field.
   * Whether the employee was paid full wages for the day of injury or last day worked.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPaidFull();
  
  
  /**
   * Gets the value of the SSBenefits field.
   * Whether Social Security benefits apply.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSSBenefits();
  
  
  /**
   * Gets the value of the ScndInjryFnd field.
   * Whether second injury fund benefits apply.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isScndInjryFnd();
  
  
  /**
   * Gets the value of the WagePaymentCont field.
   * Whether claimant's salary was continued.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWagePaymentCont();
  
  
  /**
   * Removes the given element from the WorkStatusChanges array. This is achieved by marking the element for removal.
   */
  public void removeFromWorkStatusChanges(entity.WorkStatus element);
  
  
  /**
   * Removes the given element from the WorkStatusChanges array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromWorkStatusChanges(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClassCode field.
   */
  public void setClassCode(entity.ClassCode value);
  
  
  public void setClassCodeID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DaysWorkedWeek field.
   */
  public void setDaysWorkedWeek(java.lang.String value);
  
  
  /**
   * Sets the value of the DepartmentCode field.
   */
  public void setDepartmentCode(java.lang.String value);
  
  
  /**
   * Sets the value of the EmploymentStatus field.
   */
  public void setEmploymentStatus(typekey.EmploymentStatusType value);
  
  
  /**
   * Sets the value of the HireDate field.
   */
  public void setHireDate(java.util.Date value);
  
  
  /**
   * Sets the value of the HireState field.
   */
  public void setHireState(typekey.State value);
  
  
  /**
   * Sets the value of the InjuryStartTime field.
   */
  public void setInjuryStartTime(java.util.Date value);
  
  
  /**
   * Sets the value of the LastWorkedDate field.
   */
  public void setLastWorkedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LastYearIncome field.
   */
  public void setLastYearIncome(gw.api.financials.CurrencyAmount value);
  
  
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
   * Sets the value of the Occupation field.
   */
  public void setOccupation(java.lang.String value);
  
  
  /**
   * Sets the value of the OvertimeRate field.
   */
  public void setOvertimeRate(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the PaidFull field.
   */
  public void setPaidFull(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PayPeriod field.
   */
  public void setPayPeriod(typekey.PayPeriodType value);
  
  
  /**
   * Sets the value of the SSBenefits field.
   */
  public void setSSBenefits(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the SSBenefitsAmnt field.
   */
  public void setSSBenefitsAmnt(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ScndInjryFnd field.
   */
  public void setScndInjryFnd(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ScndInjryFndAmnt field.
   */
  public void setScndInjryFndAmnt(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the ScndInjryFndDate field.
   */
  public void setScndInjryFndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the WageAmount field.
   */
  public void setWageAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the WageAmountPostInjury field.
   */
  public void setWageAmountPostInjury(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the WagePaymentCont field.
   */
  public void setWagePaymentCont(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the WorkStatusChanges field.
   */
  public void setWorkStatusChanges(entity.WorkStatus[] value);
  
  
  
}