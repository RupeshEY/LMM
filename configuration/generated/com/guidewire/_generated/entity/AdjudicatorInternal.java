package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Adjudicator.eti;Adjudicator.eix;Adjudicator.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AdjudicatorInternal extends com.guidewire._generated.entity.PersonInternal {
  /**
   * Gets the value of the AdjudicativeDomain field.
   * Adjudicative Domain
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AdjudicativeDomain getAdjudicativeDomain();
  
  
  /**
   * Gets the value of the AdjudicatorLicense field.
   * Adjudicator's business license number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAdjudicatorLicense();
  
  
  /**
   * Sets the value of the AdjudicativeDomain field.
   */
  public void setAdjudicativeDomain(typekey.AdjudicativeDomain value);
  
  
  /**
   * Sets the value of the AdjudicatorLicense field.
   */
  public void setAdjudicatorLicense(java.lang.String value);
  
  
  
}