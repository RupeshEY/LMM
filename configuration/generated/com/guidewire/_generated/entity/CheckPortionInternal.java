package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CheckPortion.eti;CheckPortion.eix;CheckPortion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CheckPortionInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.check.impl.CheckPortionInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.check.entity.CheckPortion {
  /**
   * Adds the given element to the Checks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToChecks(entity.Check element);
  
  
  /**
   * Gets the value of the Checks field.
   * Checks whose amounts are defined by this CheckPortion. If there are multiple checks in this array, all of them must belong to the same CheckRecurrence.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Check[] getChecks();
  
  
  /**
   * Gets the value of the FixedClaimAmount field.
   * The fixed amount (in the claim currency) to allocate towards the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFixedClaimAmount();
  
  
  /**
   * Gets the value of the FixedReportingAmount field.
   * The fixed amount (in the reporting currency) to allocate towards the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFixedReportingAmount();
  
  
  /**
   * Gets the value of the FixedReservingAmount field.
   * The fixed amount (in the reserving currency) to allocate towards the check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFixedReservingAmount();
  
  
  /**
   * Gets the value of the FixedTransactionAmount field.
   * The fixed amount (in the transaction currency) to allocate towards the check. Setting this clears Percentage and updates FixedClaimAmount and FixedReportingAmount. At least one check must be added to this CheckPortion before setting this.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getFixedTransactionAmount();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Percentage field.
   * The percentage to allocate towards the check. Setting this clears the fixed amount properties
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPercentage();
  
  
  /**
   * Gets the value of the Reissued field.
   * Flag indicating whether this portion was created for a reissued check.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isReissued();
  
  
  /**
   * Removes the given element from the Checks array. This is achieved by marking the element for removal.
   */
  public void removeFromChecks(entity.Check element);
  
  
  /**
   * Removes the given element from the Checks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromChecks(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Checks field.
   */
  public void setChecks(entity.Check[] value);
  
  
  /**
   * Sets the value of the FixedClaimAmount field.
   */
  public void setFixedClaimAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the FixedReportingAmount field.
   */
  public void setFixedReportingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the FixedReservingAmount field.
   */
  public void setFixedReservingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the FixedTransactionAmount field.
   */
  public void setFixedTransactionAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Percentage field.
   */
  public void setPercentage(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Reissued field.
   */
  public void setReissued(java.lang.Boolean value);
  
  
  
}