package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SubrogationSummary.eti;SubrogationSummary.eix;SubrogationSummary.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SubrogationSummaryInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.SubrogationSummary {
  /**
   * Adds the given element to the StatuteLine array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToStatuteLine(entity.StatuteLimitationsLine element);
  
  
  /**
   * Adds the given element to the SubroAdverseParties array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSubroAdverseParties(entity.SubroAdverseParty element);
  
  
  /**
   * Adds the given element to the Subrogations array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSubrogations(entity.Subrogation element);
  
  
  /**
   * Gets the value of the Claim field.
   * Related Claim
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
   * Gets the value of the StatuteLine field.
   * A list of applicable Statute of Limitations for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.StatuteLimitationsLine[] getStatuteLine();
  
  
  /**
   * Gets the value of the SubroAdverseParties field.
   * A list of applicable Adverse Parties related to for this claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubroAdverseParty[] getSubroAdverseParties();
  
  
  /**
   * Gets the value of the SubroReferralComment field.
   * A Comment from the referer to the referee
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSubroReferralComment();
  
  
  /**
   * Gets the value of the SubroReferralDate field.
   * Date when when referral made to Subrogation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSubroReferralDate();
  
  
  /**
   * Gets the value of the Subrogations field.
   * The subrogations associated with this summary
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Subrogation[] getSubrogations();
  
  
  /**
   * Gets the value of the CalculateOSRecReserve field.
   * Whether to automatically calculate OS Recovery Reserves
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCalculateOSRecReserve();
  
  
  /**
   * Gets the value of the EscalateSubro field.
   * Escalate toSubro
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isEscalateSubro();
  
  
  /**
   * Gets the value of the ExtOwned field.
   * To indicate Subro for a claim as owned by an external owner
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isExtOwned();
  
  
  /**
   * Gets the value of the ProrateDeductible field.
   * Indicates whether deductible should be prorated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isProrateDeductible();
  
  
  /**
   * Removes the given element from the StatuteLine array. This is achieved by marking the element for removal.
   */
  public void removeFromStatuteLine(entity.StatuteLimitationsLine element);
  
  
  /**
   * Removes the given element from the StatuteLine array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromStatuteLine(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the SubroAdverseParties array. This is achieved by marking the element for removal.
   */
  public void removeFromSubroAdverseParties(entity.SubroAdverseParty element);
  
  
  /**
   * Removes the given element from the SubroAdverseParties array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSubroAdverseParties(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Subrogations array. This is achieved by marking the element for removal.
   */
  public void removeFromSubrogations(entity.Subrogation element);
  
  
  /**
   * Removes the given element from the Subrogations array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSubrogations(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CalculateOSRecReserve field.
   */
  public void setCalculateOSRecReserve(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the EscalateSubro field.
   */
  public void setEscalateSubro(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ExtOwned field.
   */
  public void setExtOwned(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ProrateDeductible field.
   */
  public void setProrateDeductible(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the StatuteLine field.
   */
  public void setStatuteLine(entity.StatuteLimitationsLine[] value);
  
  
  /**
   * Sets the value of the SubroAdverseParties field.
   */
  public void setSubroAdverseParties(entity.SubroAdverseParty[] value);
  
  
  /**
   * Sets the value of the SubroReferralComment field.
   */
  public void setSubroReferralComment(java.lang.String value);
  
  
  /**
   * Sets the value of the SubroReferralDate field.
   */
  public void setSubroReferralDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Subrogations field.
   */
  public void setSubrogations(entity.Subrogation[] value);
  
  
  
}