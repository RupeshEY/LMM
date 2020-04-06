package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WCWaitingPeriod.eti;WCWaitingPeriod.eix;WCWaitingPeriod.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WCWaitingPeriodInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.WCWaitingPeriod {
  /**
   * Gets the value of the ClaimWorkComp field.
   * Claim this diagnosis is related to
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimWorkComp getClaimWorkComp();
  
  
  public gw.pl.persistence.core.Key getClaimWorkCompID();
  
  
  /**
   * Gets the value of the Comments field.
   * Comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the DateEnded field.
   * The date this portion of the Waiting Period was ended
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateEnded();
  
  
  /**
   * Gets the value of the DateStarted field.
   * The date this portion of the Waiting Period was started
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateStarted();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the WaitingDaysApplied field.
   * Number of days applied to Waiting Period
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getWaitingDaysApplied();
  
  
  /**
   * Gets the value of the WaitingDaysRepaid field.
   * Number of days Waiting Days retroactiviey paid
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getWaitingDaysRepaid();
  
  
  /**
   * Sets the value of the ClaimWorkComp field.
   */
  public void setClaimWorkComp(entity.ClaimWorkComp value);
  
  
  public void setClaimWorkCompID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the DateEnded field.
   */
  public void setDateEnded(java.util.Date value);
  
  
  /**
   * Sets the value of the DateStarted field.
   */
  public void setDateStarted(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the WaitingDaysApplied field.
   */
  public void setWaitingDaysApplied(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the WaitingDaysRepaid field.
   */
  public void setWaitingDaysRepaid(java.math.BigDecimal value);
  
  
  
}