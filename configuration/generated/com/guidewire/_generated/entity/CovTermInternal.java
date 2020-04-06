package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CovTerm.eti;CovTerm.eix;CovTerm.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CovTermInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.policy.entity.CovTerm {
  /**
   * Gets the value of the CovTermOrder field.
   * Ordering for the cov term
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getCovTermOrder();
  
  
  /**
   * Gets the value of the CovTermPattern field.
   * Coverage term pattern
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CovTermPattern getCovTermPattern();
  
  
  /**
   * Gets the value of the Coverage field.
   * Coverage to which the coverage term belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Coverage getCoverage();
  
  
  public gw.pl.persistence.core.Key getCoverageID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ModelAggregation field.
   * Indicates that the CovTerm is applicable to a subset or a subtype of the coverage
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CovTermModelAgg getModelAggregation();
  
  
  /**
   * Gets the value of the ModelRestriction field.
   * Indicates at what level of an event that the CovTerm is applicable to such as per claimant or per accident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CovTermModelRest getModelRestriction();
  
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the coverage term in an external policy system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySystemId();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CovTerm getSubtype();
  
  
  /**
   * Sets the value of the CovTermOrder field.
   */
  public void setCovTermOrder(java.lang.Integer value);
  
  
  /**
   * Sets the value of the CovTermPattern field.
   */
  public void setCovTermPattern(typekey.CovTermPattern value);
  
  
  /**
   * Sets the value of the Coverage field.
   */
  public void setCoverage(entity.Coverage value);
  
  
  public void setCoverageID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ModelAggregation field.
   */
  public void setModelAggregation(typekey.CovTermModelAgg value);
  
  
  /**
   * Sets the value of the ModelRestriction field.
   */
  public void setModelRestriction(typekey.CovTermModelRest value);
  
  
  /**
   * Sets the value of the PolicySystemId field.
   */
  public void setPolicySystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.CovTerm value);
  
  
  
}