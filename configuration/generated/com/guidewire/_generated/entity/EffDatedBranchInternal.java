package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "EffDatedBranch.eti;EffDatedBranch.eix;EffDatedBranch.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface EffDatedBranchInternal extends com.guidewire._generated.entity.EffDatedBaseInternal, com.guidewire._generated.entity.RetireableInternal, com.guidewire.pl.domain.persistence.core.RetireablePublicMethods, com.guidewire.pl.domain.persistence.core.effdate.EffDatedBasePublicMethods, com.guidewire.pl.domain.persistence.core.effdate.EffDatedBranch, com.guidewire.pl.domain.persistence.core.effdate.impl.EffDatedBaseInternalMethods, com.guidewire.pl.domain.persistence.core.effdate.impl.EffDatedBranchInternal, com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods {
  /**
   * Gets the value of the BasedOnDate field.
   * If this is a renewal, date it was based on
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBasedOnDate();
  
  
  /**
   * Gets the value of the CancellationDate field.
   * Date this period was canceled, or null if still active
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCancellationDate();
  
  
  /**
   * Gets the value of the EditEffectiveDate field.
   * Dates edits are effective
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEditEffectiveDate();
  
  
  /**
   * Gets the value of the ModelDate field.
   * Date corresponding to the model number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getModelDate();
  
  
  /**
   * Gets the value of the ModelNumber field.
   * Modelnumber.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getModelNumber();
  
  
  /**
   * Gets the value of the ModelNumberIndex field.
   * Used as non-null unique index with PeriodId.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getModelNumberIndex();
  
  
  /**
   * Gets the value of the MostRecentModelIndex field.
   * Used as non-null unique index with PeriodId.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMostRecentModelIndex();
  
  
  /**
   * Gets the value of the PeriodEnd field.
   * Upper bound of all expiration dates of this root
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPeriodEnd();
  
  
  /**
   * Gets the value of the PeriodStart field.
   * Lower bound of all effective dates of this root
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getPeriodStart();
  
  
  /**
   * Gets the value of the AllowGapsBefore field.
   * True if a gap is allowed between this period and its previous period (if one exists)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAllowGapsBefore();
  
  
  /**
   * Gets the value of the FuturePeriods field.
   * True if when bound this branch had future bound periods
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFuturePeriods();
  
  
  /**
   * Gets the value of the Locked field.
   * True if this row has been locked (cannot be edited)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLocked();
  
  
  /**
   * Gets the value of the MostRecentModel field.
   * True if this branch is the most recent model (has the highest model number)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isMostRecentModel();
  
  
  /**
   * Gets the value of the Preempted field.
   * True if when bound this branch has been preempted
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPreempted();
  
  
  /**
   * Gets the value of the TemporaryBranch field.
   * True if this row has committed (if false branch is temporary)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTemporaryBranch();
  
  
  /**
   * Sets the value of the AllowGapsBefore field.
   */
  public void setAllowGapsBefore(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the BasedOnDate field.
   */
  public void setBasedOnDate(java.util.Date value);
  
  
  /**
   * Sets the value of the CancellationDate field.
   */
  public void setCancellationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the EditEffectiveDate field.
   */
  public void setEditEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the FuturePeriods field.
   */
  public void setFuturePeriods(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Locked field.
   */
  public void setLocked(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ModelDate field.
   */
  public void setModelDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ModelNumber field.
   */
  public void setModelNumber(java.lang.Integer value);
  
  
  /**
   * Sets the value of the ModelNumberIndex field.
   */
  public void setModelNumberIndex(java.lang.String value);
  
  
  /**
   * Sets the value of the MostRecentModel field.
   */
  public void setMostRecentModel(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the MostRecentModelIndex field.
   */
  public void setMostRecentModelIndex(java.lang.String value);
  
  
  /**
   * Sets the value of the PeriodEnd field.
   */
  public void setPeriodEnd(java.util.Date value);
  
  
  /**
   * Sets the value of the PeriodStart field.
   */
  public void setPeriodStart(java.util.Date value);
  
  
  /**
   * Sets the value of the Preempted field.
   */
  public void setPreempted(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the TemporaryBranch field.
   */
  public void setTemporaryBranch(java.lang.Boolean value);
  
  
  
}