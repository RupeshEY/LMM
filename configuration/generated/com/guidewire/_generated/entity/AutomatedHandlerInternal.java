package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AutomatedHandler.eti;AutomatedHandler.eix;AutomatedHandler.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AutomatedHandlerInternal extends com.guidewire._generated.entity.RetireableInternal, gw.api.specialhandling.AutomatedHandlerMethods, gw.cc.specialhandling.entity.AutomatedHandler {
  /**
   * Gets the value of the PolicyType field.
   * If non-null, then this handler will only apply to Claims created for Policies that have this particular Policy Type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PolicyType getPolicyType();
  
  
  /**
   * Gets the value of the SpecialHandling field.
   * The instance of Special Handling that owns this Automated Handler
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialHandling getSpecialHandling();
  
  
  public gw.pl.persistence.core.Key getSpecialHandlingID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AutomatedHandler getSubtype();
  
  
  /**
   * Sets the value of the PolicyType field.
   */
  public void setPolicyType(typekey.PolicyType value);
  
  
  /**
   * Sets the value of the SpecialHandling field.
   */
  public void setSpecialHandling(entity.SpecialHandling value);
  
  
  public void setSpecialHandlingID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.AutomatedHandler value);
  
  
  
}