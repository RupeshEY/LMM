package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CoverageLine.eti;CoverageLine.eix;CoverageLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CoverageLineInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.cc.domain.aggregatelimit.CoverageSpecification, com.guidewire.cc.domain.aggregatelimit.impl.CoverageLineInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.aggregatelimit.entity.CoverageLine {
  /**
   * Adds the given element to the CoverageLineLimits array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCoverageLineLimits(entity.CoverageLineLimit element);
  
  
  /**
   * Gets the value of the CoverageLineLimits field.
   * Coverage line limits that join this coverage line to an aggregate limit. A single coverage line can be shared by more than one aggregate limit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CoverageLineLimit[] getCoverageLineLimits();
  
  
  /**
   * Gets the value of the CoverageSubtype field.
   * The subclass type of the Coverage, e.g., PolicyCoverage, VehicleCoverage, or PropertyCoverage. This is unrelated to the CoverageSubtype typelist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Coverage getCoverageSubtype();
  
  
  /**
   * Gets the value of the CoverageType field.
   * Coverage type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getCoverageType();
  
  
  /**
   * Gets the value of the ExposureUnitNumber field.
   * Number of the risk unit for the coverage on the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getExposureUnitNumber();
  
  
  /**
   * Gets the value of the LOBCoverageSubtype field.
   * The CoverageSubtype (from the LOB) that an exposure must have in order to match this CoverageLine
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageSubtype getLOBCoverageSubtype();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PolicyPeriod field.
   * PolicyPeriod with which this CoverageLine is associated. It should be the same PolicyPeriod that is referred to by the AggregateLimits that are linked to this CoverageLine (through CoverageLineLimit entities).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyPeriod getPolicyPeriod();
  
  
  public gw.pl.persistence.core.Key getPolicyPeriodID();
  
  
  /**
   * Gets the value of the RUPolicySystemId field.
   * Identifier for the covered risk unit in an external policy system.  Only applies to those CoverageLines which point to a VehicleCoverage, or PropertyCoverage, or any coverage which extends from RUCoverage and therefore has a RiskUnit with (possibly) a policySystemID.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRUPolicySystemId();
  
  
  /**
   * Removes the given element from the CoverageLineLimits array. This is achieved by marking the element for removal.
   */
  public void removeFromCoverageLineLimits(entity.CoverageLineLimit element);
  
  
  /**
   * Removes the given element from the CoverageLineLimits array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverageLineLimits(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CoverageLineLimits field.
   */
  public void setCoverageLineLimits(entity.CoverageLineLimit[] value);
  
  
  /**
   * Sets the value of the CoverageSubtype field.
   */
  public void setCoverageSubtype(typekey.Coverage value);
  
  
  /**
   * Sets the value of the CoverageType field.
   */
  public void setCoverageType(typekey.CoverageType value);
  
  
  /**
   * Sets the value of the ExposureUnitNumber field.
   */
  public void setExposureUnitNumber(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LOBCoverageSubtype field.
   */
  public void setLOBCoverageSubtype(typekey.CoverageSubtype value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PolicyPeriod field.
   */
  public void setPolicyPeriod(entity.PolicyPeriod value);
  
  
  public void setPolicyPeriodID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RUPolicySystemId field.
   */
  public void setRUPolicySystemId(java.lang.String value);
  
  
  
}