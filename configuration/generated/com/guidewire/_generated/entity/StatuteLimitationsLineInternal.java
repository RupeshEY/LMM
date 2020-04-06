package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "StatuteLimitationsLine.eti;StatuteLimitationsLine.eix;StatuteLimitationsLine.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface StatuteLimitationsLineInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.StatuteLimitationsLine {
  /**
   * Gets the value of the Description field.
   * Additional Description of statute of Limitation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the JurisdictionState field.
   * Jurisdiction State. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdictionState();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the StatuteDate field.
   * Last Date prior before claim is expired due to statute of limitations
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStatuteDate();
  
  
  /**
   * Gets the value of the StatuteLimitType field.
   * The type of statute of limitations - e.g. Medical, Indemnity, etc.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.StatuteLimitationsType getStatuteLimitType();
  
  
  /**
   * Gets the value of the SubrogationSummary field.
   * Related Subrogation Summary
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubrogationSummary getSubrogationSummary();
  
  
  public gw.pl.persistence.core.Key getSubrogationSummaryID();
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the JurisdictionState field.
   */
  public void setJurisdictionState(typekey.Jurisdiction value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the StatuteDate field.
   */
  public void setStatuteDate(java.util.Date value);
  
  
  /**
   * Sets the value of the StatuteLimitType field.
   */
  public void setStatuteLimitType(typekey.StatuteLimitationsType value);
  
  
  /**
   * Sets the value of the SubrogationSummary field.
   */
  public void setSubrogationSummary(entity.SubrogationSummary value);
  
  
  public void setSubrogationSummaryID(gw.pl.persistence.core.Key value);
  
  
  
}