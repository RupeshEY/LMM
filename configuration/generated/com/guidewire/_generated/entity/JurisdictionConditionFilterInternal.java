package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "JurisdictionConditionFilter.eti;JurisdictionConditionFilter.eix;JurisdictionConditionFilter.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface JurisdictionConditionFilterInternal extends com.guidewire._generated.entity.ConditionFilterInternal {
  /**
   * Gets the value of the Jurisdiction field.
   * Classification condition filter by Jurisdiction. The Jurisdiction must be associated with JurisdictionType.TC_INSURANCE.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Jurisdiction getJurisdiction();
  
  
  /**
   * Sets the value of the Jurisdiction field.
   */
  public void setJurisdiction(typekey.Jurisdiction value);
  
  
  
}