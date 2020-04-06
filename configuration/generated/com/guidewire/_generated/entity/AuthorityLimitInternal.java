package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AuthorityLimit.eti;AuthorityLimit.eix;AuthorityLimit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AuthorityLimitInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.cc.domain.community.impl.AuthorityLimitInternal, gw.cc.community.entity.AuthorityLimit {
  /**
   * Gets the value of the CostType field.
   * If non-null, the limit applies only to this cost type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostType getCostType();
  
  
  /**
   * Gets the value of the CoverageType field.
   * If non-null, the limit applies only to this coverage type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getCoverageType();
  
  
  /**
   * Gets the value of the LimitAmount field.
   * The amount of the limit, in whole dollars.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLimitAmount();
  
  
  /**
   * Gets the value of the LimitType field.
   * The limit type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AuthorityLimitType getLimitType();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PolicyType field.
   * If non-null, the limit applies only to this policy type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Gets the value of the Profile field.
   * The authority limit profile this limit is a part of.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AuthorityLimitProfile getProfile();
  
  
  public gw.pl.persistence.core.Key getProfileID();
  
  
  /**
   * Sets the value of the CostType field.
   */
  public void setCostType(typekey.CostType value);
  
  
  /**
   * Sets the value of the CoverageType field.
   */
  public void setCoverageType(typekey.CoverageType value);
  
  
  /**
   * Sets the value of the LimitAmount field.
   */
  public void setLimitAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the LimitType field.
   */
  public void setLimitType(typekey.AuthorityLimitType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the Profile field.
   */
  public void setProfile(entity.AuthorityLimitProfile value);
  
  
  public void setProfileID(gw.pl.persistence.core.Key value);
  
  
  
}