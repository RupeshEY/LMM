package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Official.eti;Official.eix;Official.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface OfficialInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.Official {
  /**
   * Gets the value of the Claim field.
   * The foreign key to the claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * Name of official.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the OfficialType field.
   * Type of official (fire, police etc).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OfficialType getOfficialType();
  
  
  /**
   * Gets the value of the ReportNumber field.
   * Official report number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReportNumber();
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the OfficialType field.
   */
  public void setOfficialType(typekey.OfficialType value);
  
  
  /**
   * Sets the value of the ReportNumber field.
   */
  public void setReportNumber(java.lang.String value);
  
  
  
}