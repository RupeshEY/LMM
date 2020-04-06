package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimIndicatorTrigger.eti;ClaimIndicatorTrigger.eix;ClaimIndicatorTrigger.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimIndicatorTriggerInternal extends com.guidewire._generated.entity.RetireableInternal, gw.api.specialhandling.AutomatedHandlerTrigger, gw.cc.specialhandling.entity.ClaimIndicatorTrigger {
  /**
   * Gets the value of the AutomatedHandler field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AutomatedHandler getAutomatedHandler();
  
  
  public gw.pl.persistence.core.Key getAutomatedHandlerID();
  
  
  /**
   * Gets the value of the ClaimIndicator field.
   * The Claim Indicator that can cause this trigger to execute
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimIndicator getClaimIndicator();
  
  
  /**
   * Gets the value of the TriggeringValue field.
   * The value on which to execute this trigger.  If the specified ClaimIndicator changes to this value for a given Claim then this trigger should execute
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isTriggeringValue();
  
  
  /**
   * Sets the value of the AutomatedHandler field.
   */
  public void setAutomatedHandler(entity.AutomatedHandler value);
  
  
  public void setAutomatedHandlerID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimIndicator field.
   */
  public void setClaimIndicator(typekey.ClaimIndicator value);
  
  
  /**
   * Sets the value of the TriggeringValue field.
   */
  public void setTriggeringValue(java.lang.Boolean value);
  
  
  
}