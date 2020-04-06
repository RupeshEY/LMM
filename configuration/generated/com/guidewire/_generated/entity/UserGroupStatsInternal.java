package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "UserGroupStats.eti;UserGroupStats.eix;UserGroupStats.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface UserGroupStatsInternal extends com.guidewire._generated.entity.KeyableBeanInternal {
  /**
   * Gets the value of the AllActOpen field.
   * Number of open activities for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAllActOpen();
  
  
  /**
   * Gets the value of the AllMatterOpen field.
   * Number of open matters for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAllMatterOpen();
  
  
  /**
   * Gets the value of the AllOpen field.
   * Number of open claims for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAllOpen();
  
  
  /**
   * Gets the value of the AllSubOpen field.
   * Number of open exposures for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getAllSubOpen();
  
  
  /**
   * Gets the value of the CalculateDate field.
   * Date when statistics were calculated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCalculateDate();
  
  
  /**
   * Gets the value of the ClaimAgingFour field.
   * Number of open claims falling into the fourth aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimAgingFour();
  
  
  /**
   * Gets the value of the ClaimAgingOne field.
   * Number of open claims falling into the first aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimAgingOne();
  
  
  /**
   * Gets the value of the ClaimAgingThree field.
   * Number of open claims falling into the third aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimAgingThree();
  
  
  /**
   * Gets the value of the ClaimAgingTwo field.
   * Number of open claims falling into the second aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimAgingTwo();
  
  
  /**
   * Gets the value of the ClaimWorkload field.
   * Total Claim Workload for Group/User
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClaimWorkload();
  
  
  /**
   * Gets the value of the ClosedThisWeek field.
   * Number of claims closed in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClosedThisWeek();
  
  
  /**
   * Gets the value of the CompletedToday field.
   * Number of activities completed today.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getCompletedToday();
  
  
  /**
   * Gets the value of the DueToday field.
   * Number of activities due today.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getDueToday();
  
  
  /**
   * Gets the value of the ExpAgingFour field.
   * Number of open exposures falling into the fourth aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExpAgingFour();
  
  
  /**
   * Gets the value of the ExpAgingOne field.
   * Number of open exposures falling into the first aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExpAgingOne();
  
  
  /**
   * Gets the value of the ExpAgingThree field.
   * Number of open exposures falling into the third aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExpAgingThree();
  
  
  /**
   * Gets the value of the ExpAgingTwo field.
   * Number of open exposures falling into the second aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExpAgingTwo();
  
  
  /**
   * Gets the value of the ExposureWorkload field.
   * Total Exposure Workload for Group/User
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExposureWorkload();
  
  
  /**
   * Gets the value of the Flagged field.
   * Number of flagged claims for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFlagged();
  
  
  /**
   * Gets the value of the Group field.
   * The given group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the LitAgingFour field.
   * Number of open and litigated claims falling into the fourth aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLitAgingFour();
  
  
  /**
   * Gets the value of the LitAgingOne field.
   * Number of open and litigated claims falling into the first aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLitAgingOne();
  
  
  /**
   * Gets the value of the LitAgingThree field.
   * Number of open and litigated claims falling into the third aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLitAgingThree();
  
  
  /**
   * Gets the value of the LitAgingTwo field.
   * Number of open and litigated claims falling into the second aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLitAgingTwo();
  
  
  /**
   * Gets the value of the MatterClosedThisWeek field.
   * Number of matters closed in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getMatterClosedThisWeek();
  
  
  /**
   * Gets the value of the NewThisWeek field.
   * Number of claims created in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewThisWeek();
  
  
  /**
   * Gets the value of the Overdue field.
   * Number of overdue activities for the given user/group.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOverdue();
  
  
  /**
   * Gets the value of the SubAgingFour field.
   * Number of active subrogations falling into the fourth aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubAgingFour();
  
  
  /**
   * Gets the value of the SubAgingOne field.
   * Number of active subrogations falling into the first aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubAgingOne();
  
  
  /**
   * Gets the value of the SubAgingThree field.
   * Number of active subrogations falling into the third aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubAgingThree();
  
  
  /**
   * Gets the value of the SubAgingTwo field.
   * Number of active subrogations falling into the second aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubAgingTwo();
  
  
  /**
   * Gets the value of the SubClosedThisWeek field.
   * Number of exposures closed in the time window. Note that the window is now customizable, so this may not actually correspond to the current week, but the column name cannot be easily changed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubClosedThisWeek();
  
  
  /**
   * Gets the value of the SubLitAgingFour field.
   * Number of active subrogations with a related litigation falling into the fourth aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubLitAgingFour();
  
  
  /**
   * Gets the value of the SubLitAgingOne field.
   * Number of active subrogations with a related litigation falling into the first aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubLitAgingOne();
  
  
  /**
   * Gets the value of the SubLitAgingThree field.
   * Number of active subrogations with a related litigation falling into the third aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubLitAgingThree();
  
  
  /**
   * Gets the value of the SubLitAgingTwo field.
   * Number of active subrogations with a related litigation falling into the second aging bucket (the divisions are customer-configurable).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubLitAgingTwo();
  
  
  /**
   * Gets the value of the SubroActiveAll field.
   * Active subrogations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubroActiveAll();
  
  
  /**
   * Gets the value of the SubroActiveClaim field.
   * Active claim-level subrogations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubroActiveClaim();
  
  
  /**
   * Gets the value of the SubroActiveExposure field.
   * Active exposure-level subrogations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubroActiveExposure();
  
  
  /**
   * Gets the value of the SubroClosed field.
   * Subrogations closed within the statistics window
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getSubroClosed();
  
  
  /**
   * Gets the value of the TotalWorkload field.
   * Total Workload for Group/User
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalWorkload();
  
  
  /**
   * Gets the value of the User field.
   * The given user.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUser();
  
  
  public gw.pl.persistence.core.Key getUserID();
  
  
  /**
   * Sets the value of the AllActOpen field.
   */
  public void setAllActOpen(java.lang.Integer value);
  
  
  /**
   * Sets the value of the AllMatterOpen field.
   */
  public void setAllMatterOpen(java.lang.Integer value);
  
  
  /**
   * Sets the value of the AllOpen field.
   */
  public void setAllOpen(java.lang.Integer value);
  
  
  /**
   * Sets the value of the AllSubOpen field.
   */
  public void setAllSubOpen(java.lang.Integer value);
  
  
  /**
   * Sets the value of the CalculateDate field.
   */
  public void setCalculateDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ClaimAgingFour field.
   */
  public void setClaimAgingFour(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ClaimAgingOne field.
   */
  public void setClaimAgingOne(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ClaimAgingThree field.
   */
  public void setClaimAgingThree(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ClaimAgingTwo field.
   */
  public void setClaimAgingTwo(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ClaimWorkload field.
   */
  public void setClaimWorkload(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ClosedThisWeek field.
   */
  public void setClosedThisWeek(java.lang.Integer value);
  
  
  /**
   * Sets the value of the CompletedToday field.
   */
  public void setCompletedToday(java.lang.Integer value);
  
  
  /**
   * Sets the value of the DueToday field.
   */
  public void setDueToday(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ExpAgingFour field.
   */
  public void setExpAgingFour(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ExpAgingOne field.
   */
  public void setExpAgingOne(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ExpAgingThree field.
   */
  public void setExpAgingThree(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ExpAgingTwo field.
   */
  public void setExpAgingTwo(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ExposureWorkload field.
   */
  public void setExposureWorkload(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Flagged field.
   */
  public void setFlagged(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Group field.
   */
  public void setGroup(entity.Group value);
  
  
  public void setGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LitAgingFour field.
   */
  public void setLitAgingFour(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LitAgingOne field.
   */
  public void setLitAgingOne(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LitAgingThree field.
   */
  public void setLitAgingThree(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LitAgingTwo field.
   */
  public void setLitAgingTwo(java.lang.Integer value);
  
  
  /**
   * Sets the value of the MatterClosedThisWeek field.
   */
  public void setMatterClosedThisWeek(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NewThisWeek field.
   */
  public void setNewThisWeek(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Overdue field.
   */
  public void setOverdue(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubAgingFour field.
   */
  public void setSubAgingFour(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubAgingOne field.
   */
  public void setSubAgingOne(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubAgingThree field.
   */
  public void setSubAgingThree(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubAgingTwo field.
   */
  public void setSubAgingTwo(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubClosedThisWeek field.
   */
  public void setSubClosedThisWeek(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubLitAgingFour field.
   */
  public void setSubLitAgingFour(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubLitAgingOne field.
   */
  public void setSubLitAgingOne(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubLitAgingThree field.
   */
  public void setSubLitAgingThree(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubLitAgingTwo field.
   */
  public void setSubLitAgingTwo(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubroActiveAll field.
   */
  public void setSubroActiveAll(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubroActiveClaim field.
   */
  public void setSubroActiveClaim(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubroActiveExposure field.
   */
  public void setSubroActiveExposure(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SubroClosed field.
   */
  public void setSubroClosed(java.lang.Integer value);
  
  
  /**
   * Sets the value of the TotalWorkload field.
   */
  public void setTotalWorkload(java.lang.Integer value);
  
  
  /**
   * Sets the value of the User field.
   */
  public void setUser(entity.User value);
  
  
  public void setUserID(gw.pl.persistence.core.Key value);
  
  
  
}