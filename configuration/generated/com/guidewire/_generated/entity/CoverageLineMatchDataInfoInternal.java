package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CoverageLineMatchDataInfo.eti;CoverageLineMatchDataInfo.eix;CoverageLineMatchDataInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CoverageLineMatchDataInfoInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire.cc.domain.aggregatelimit.CoverageLineMatchData, com.guidewire.cc.domain.claim.archiving.impl.CoverageLineMatchDataInfoInternal, gw.cc.claim.archiving.entity.CoverageLineMatchDataInfo {
  /**
   * Gets the value of the ClaimInfo field.
   * The archived claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo();
  
  
  public gw.pl.persistence.core.Key getClaimInfoID();
  
  
  /**
   * Gets the value of the CoverageIntSubtype field.
   * The subclass type of the Coverage, e.g., PolicyCoverage, VehicleCoverage, or PropertyCoverage. This is unrelated to the CoverageSubtype typelist.  Also known as CoverageIntSubtype
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Coverage getCoverageIntSubtype();
  
  
  /**
   * Gets the value of the CoverageType field.
   * Coverage type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageType getCoverageType();
  
  
  /**
   * Gets the value of the LOBCoverageSubtype field.
   * The CoverageSubtype; This is drawn from the CoverageSubtype typelist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CoverageSubtype getLOBCoverageSubtype();
  
  
  /**
   * Gets the value of the RUPolicySystemId field.
   * Identifier for the covered risk unit in an external policy system.  Only applies to those CoverageLines which point to a VehicleCoverage, or PropertyCoverage, or any coverage which extends from RUCoverage and therefore has a RiskUnit with (possibly) a policySystemID.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRUPolicySystemId();
  
  
  /**
   * Gets the value of the RiskUnitNumber field.
   * Number of the risk unit for the coverage on the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRiskUnitNumber();
  
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  public void setClaimInfo(entity.ClaimInfo value);
  
  
  public void setClaimInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CoverageIntSubtype field.
   */
  public void setCoverageIntSubtype(typekey.Coverage value);
  
  
  /**
   * Sets the value of the CoverageType field.
   */
  public void setCoverageType(typekey.CoverageType value);
  
  
  /**
   * Sets the value of the LOBCoverageSubtype field.
   */
  public void setLOBCoverageSubtype(typekey.CoverageSubtype value);
  
  
  /**
   * Sets the value of the RUPolicySystemId field.
   */
  public void setRUPolicySystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the RiskUnitNumber field.
   */
  public void setRiskUnitNumber(java.lang.Integer value);
  
  
  
}