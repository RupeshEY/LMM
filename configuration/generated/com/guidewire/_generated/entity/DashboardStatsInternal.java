package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DashboardStats.eti;DashboardStats.eix;DashboardStats.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DashboardStatsInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.statistics.entity.DashboardStats {
  /**
   * Gets the value of the ClaimCostsInPeriod field.
   * Claim costs paid in this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimCostsInPeriod();
  
  
  /**
   * Gets the value of the ClaimCostsOnClosed field.
   * Claim costs paid on claims closed in this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimCostsOnClosed();
  
  
  /**
   * Gets the value of the ClaimCostsPaid field.
   * Claim costs paid on open claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimCostsPaid();
  
  
  /**
   * Gets the value of the CloseTime field.
   * Total of days from CreateDate to CloseDate for all claims closed in period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getCloseTime();
  
  
  /**
   * Gets the value of the ClosedClaims field.
   * Number of claims closed in period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClosedClaims();
  
  
  /**
   * Gets the value of the ClosedExposures field.
   * Number of exposures closed in period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getClosedExposures();
  
  
  /**
   * Gets the value of the CoverageType field.
   * CoverageType this statistic is for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getCoverageType();
  
  
  /**
   * Gets the value of the ExpensesInPeriod field.
   * Expenses paid in this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getExpensesInPeriod();
  
  
  /**
   * Gets the value of the ExpensesOnClosed field.
   * Expenses paid on claims closed in this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getExpensesOnClosed();
  
  
  /**
   * Gets the value of the ExpensesPaid field.
   * Expenses paid on open claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getExpensesPaid();
  
  
  /**
   * Gets the value of the Flagged field.
   * Number of claims with Flagged = isFlagged.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getFlagged();
  
  
  /**
   * Gets the value of the Group field.
   * Group this statistic is for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Group getGroup();
  
  
  public gw.pl.persistence.core.Key getGroupID();
  
  
  /**
   * Gets the value of the Handlers field.
   * Number of users in each group as the primary owner of at least one claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getHandlers();
  
  
  /**
   * Gets the value of the LOBCode field.
   * LOB this statistic is for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LOBCode getLOBCode();
  
  
  /**
   * Gets the value of the Litigated field.
   * Number of litigated claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLitigated();
  
  
  /**
   * Gets the value of the LossType field.
   * LossType this statistic is for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossType getLossType();
  
  
  /**
   * Gets the value of the NewClaims field.
   * Number of new claims opened in period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewClaims();
  
  
  /**
   * Gets the value of the NewExposures field.
   * Number of new exposures opened in period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewExposures();
  
  
  /**
   * Gets the value of the NewLitigation field.
   * Number of litigated claims in period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewLitigation();
  
  
  /**
   * Gets the value of the NewNoticeOnly field.
   * Number of new claims opened in period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNewNoticeOnly();
  
  
  /**
   * Gets the value of the NoticeOnly field.
   * Number of claims with IncidentReport = true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNoticeOnly();
  
  
  /**
   * Gets the value of the OpenClaims field.
   * Number of open claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOpenClaims();
  
  
  /**
   * Gets the value of the OpenExposures field.
   * Number of open exposures.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOpenExposures();
  
  
  /**
   * Gets the value of the OpenReserves field.
   * Open reserve amount for open claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOpenReserves();
  
  
  /**
   * Gets the value of the OverIncurredLimit field.
   * Number of claims that have incurred over a certain amount of money.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getOverIncurredLimit();
  
  
  /**
   * Gets the value of the RecoveredInPeriod field.
   * Recoveries made in this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getRecoveredInPeriod();
  
  
  /**
   * Gets the value of the ReopenedClaims field.
   * Number of claims reopened in period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getReopenedClaims();
  
  
  /**
   * Gets the value of the StatType field.
   * Whether this stat is for a group, LOB, losstype, or coveragetype.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DashboardStatType getStatType();
  
  
  /**
   * Gets the value of the TotalIncurredNet field.
   * Net total incurred for open claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTotalIncurredNet();
  
  
  /**
   * Gets the value of the TtlIncNetMinusOpenRecReserves field.
   * Net total incurred minus open recovery reserves for open claims.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getTtlIncNetMinusOpenRecReserves();
  
  
  /**
   * Sets the value of the ClaimCostsInPeriod field.
   */
  public void setClaimCostsInPeriod(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ClaimCostsOnClosed field.
   */
  public void setClaimCostsOnClosed(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ClaimCostsPaid field.
   */
  public void setClaimCostsPaid(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the CloseTime field.
   */
  public void setCloseTime(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ClosedClaims field.
   */
  public void setClosedClaims(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ClosedExposures field.
   */
  public void setClosedExposures(java.lang.Integer value);
  
  
  /**
   * Sets the value of the CoverageType field.
   */
  public void setCoverageType(typekey.CoverageType value);
  
  
  /**
   * Sets the value of the ExpensesInPeriod field.
   */
  public void setExpensesInPeriod(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ExpensesOnClosed field.
   */
  public void setExpensesOnClosed(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ExpensesPaid field.
   */
  public void setExpensesPaid(java.math.BigDecimal value);
  
  
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
   * Sets the value of the Handlers field.
   */
  public void setHandlers(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LOBCode field.
   */
  public void setLOBCode(typekey.LOBCode value);
  
  
  /**
   * Sets the value of the Litigated field.
   */
  public void setLitigated(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LossType field.
   */
  public void setLossType(typekey.LossType value);
  
  
  /**
   * Sets the value of the NewClaims field.
   */
  public void setNewClaims(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NewExposures field.
   */
  public void setNewExposures(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NewLitigation field.
   */
  public void setNewLitigation(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NewNoticeOnly field.
   */
  public void setNewNoticeOnly(java.lang.Integer value);
  
  
  /**
   * Sets the value of the NoticeOnly field.
   */
  public void setNoticeOnly(java.lang.Integer value);
  
  
  /**
   * Sets the value of the OpenClaims field.
   */
  public void setOpenClaims(java.lang.Integer value);
  
  
  /**
   * Sets the value of the OpenExposures field.
   */
  public void setOpenExposures(java.lang.Integer value);
  
  
  /**
   * Sets the value of the OpenReserves field.
   */
  public void setOpenReserves(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the OverIncurredLimit field.
   */
  public void setOverIncurredLimit(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RecoveredInPeriod field.
   */
  public void setRecoveredInPeriod(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ReopenedClaims field.
   */
  public void setReopenedClaims(java.lang.Integer value);
  
  
  /**
   * Sets the value of the StatType field.
   */
  public void setStatType(typekey.DashboardStatType value);
  
  
  /**
   * Sets the value of the TotalIncurredNet field.
   */
  public void setTotalIncurredNet(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TtlIncNetMinusOpenRecReserves field.
   */
  public void setTtlIncNetMinusOpenRecReserves(java.math.BigDecimal value);
  
  
  
}