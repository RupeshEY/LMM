package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ConcurrentEmployment.eti;ConcurrentEmployment.eix;ConcurrentEmployment.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ConcurrentEmploymentInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.ConcurrentEmployment {
  /**
   * Gets the value of the Claim field.
   * The foreign key to the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the CompanyName field.
   * Name of employer company.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCompanyName();
  
  
  /**
   * Gets the value of the ContactNumber field.
   * Contact number during employment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactNumber();
  
  
  /**
   * Gets the value of the EndDate field.
   * End date of employment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate();
  
  
  /**
   * Gets the value of the JobTitle field.
   * Job title.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getJobTitle();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the StartDate field.
   * Start date of employment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Gets the value of the WeeklyWage field.
   * Weekly wage during employment
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getWeeklyWage();
  
  
  /**
   * Gets the value of the FullTime field.
   * Full time employment?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFullTime();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CompanyName field.
   */
  public void setCompanyName(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactNumber field.
   */
  public void setContactNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the FullTime field.
   */
  public void setFullTime(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the JobTitle field.
   */
  public void setJobTitle(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  /**
   * Sets the value of the WeeklyWage field.
   */
  public void setWeeklyWage(gw.api.financials.CurrencyAmount value);
  
  
  
}