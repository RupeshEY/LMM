package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicyPeriod.eti;PolicyPeriod.eix;PolicyPeriod.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicyPeriodInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.cc.domain.aggregatelimit.impl.PolicyPeriodInternal, com.guidewire.pl.system.bundle.RemoveCallback, gw.cc.aggregatelimit.entity.PolicyPeriod {
  /**
   * Adds the given element to the AggregateLimitRpts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAggregateLimitRpts(entity.AggregateLimitRpt element);
  
  
  /**
   * Adds the given element to the AggregateLimits array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAggregateLimits(entity.AggregateLimit element);
  
  
  /**
   * Adds the given element to the ClaimAggregateLimitRpts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element);
  
  
  /**
   * Adds the given element to the CoverageLines array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCoverageLines(entity.CoverageLine element);
  
  
  /**
   * Adds the given element to the Policies array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPolicies(entity.PeriodPolicy element);
  
  
  /**
   * Gets the value of the AccountNumber field.
   * Account number that the policies of this PolicyPeriod belong to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAccountNumber();
  
  
  /**
   * Gets the value of the AggregateLimitRpts field.
   * Denormalized data for this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AggregateLimitRpt[] getAggregateLimitRpts();
  
  
  /**
   * Gets the value of the AggregateLimits field.
   * Aggregate limits for the policies in this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AggregateLimit[] getAggregateLimits();
  
  
  /**
   * Gets the value of the ClaimAggregateLimitRpts field.
   * Denormalized data for this period per claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimAggregateLimitRpt[] getClaimAggregateLimitRpts();
  
  
  /**
   * Gets the value of the CoverageLines field.
   * Coverage lines associated with this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLine[] getCoverageLines();
  
  
  /**
   * Gets the value of the EffectiveDate field.
   * Date on which the policy is effective.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEffectiveDate();
  
  
  /**
   * Gets the value of the ExpirationDate field.
   * Date on which the policy expires.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getExpirationDate();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Policies field.
   * Policies that belong to this period.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PeriodPolicy[] getPolicies();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   * Number of the policy (generally a string).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Gets the value of the PolicyPeriodType field.
   * Type of policy period: account or policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyPeriodType getPolicyPeriodType();
  
  
  /**
   * Gets the value of the PolicySuffix field.
   * Indicates each unique period that a policy has been in effect.  (Sometimes called 'Mod' or 'Module.')
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySuffix();
  
  
  /**
   * Gets the value of the PolicyType field.
   * Type of policy to which this period applies.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Removes the given element from the AggregateLimitRpts array. This is achieved by marking the element for removal.
   */
  public void removeFromAggregateLimitRpts(entity.AggregateLimitRpt element);
  
  
  /**
   * Removes the given element from the AggregateLimitRpts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAggregateLimitRpts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the AggregateLimits array. This is achieved by marking the element for removal.
   */
  public void removeFromAggregateLimits(entity.AggregateLimit element);
  
  
  /**
   * Removes the given element from the AggregateLimits array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAggregateLimits(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt element);
  
  
  /**
   * Removes the given element from the ClaimAggregateLimitRpts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimAggregateLimitRpts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
   */
  public void removeFromCoverageLines(entity.CoverageLine element);
  
  
  /**
   * Removes the given element from the CoverageLines array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverageLines(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Policies array. This is achieved by marking the element for removal.
   */
  public void removeFromPolicies(entity.PeriodPolicy element);
  
  
  /**
   * Removes the given element from the Policies array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPolicies(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AccountNumber field.
   */
  public void setAccountNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the AggregateLimitRpts field.
   */
  public void setAggregateLimitRpts(entity.AggregateLimitRpt[] value);
  
  
  /**
   * Sets the value of the AggregateLimits field.
   */
  public void setAggregateLimits(entity.AggregateLimit[] value);
  
  
  /**
   * Sets the value of the ClaimAggregateLimitRpts field.
   */
  public void setClaimAggregateLimitRpts(entity.ClaimAggregateLimitRpt[] value);
  
  
  /**
   * Sets the value of the CoverageLines field.
   */
  public void setCoverageLines(entity.CoverageLine[] value);
  
  
  /**
   * Sets the value of the EffectiveDate field.
   */
  public void setEffectiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ExpirationDate field.
   */
  public void setExpirationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Policies field.
   */
  public void setPolicies(entity.PeriodPolicy[] value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyPeriodType field.
   */
  public void setPolicyPeriodType(typekey.PolicyPeriodType value);
  
  
  /**
   * Sets the value of the PolicySuffix field.
   */
  public void setPolicySuffix(java.lang.String value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  
}