package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "AutomatedActivityHandler.eti;AutomatedActivityHandler.eix;AutomatedActivityHandler.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface AutomatedActivityHandlerInternal extends com.guidewire._generated.entity.AutomatedHandlerInternal, gw.api.specialhandling.AutomatedHandlerMethods, gw.cc.specialhandling.entity.AutomatedActivityHandler {
  /**
   * Gets the value of the ActivityPattern field.
   * Activity pattern to use for activity generation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityPattern getActivityPattern();
  
  
  public gw.pl.persistence.core.Key getActivityPatternID();
  
  
  /**
   * Gets the value of the EmailTemplateOverride field.
   * Optional alternate template to use for activity generation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailTemplateOverride();
  
  
  /**
   * Sets the value of the ActivityPattern field.
   */
  public void setActivityPattern(entity.ActivityPattern value);
  
  
  public void setActivityPatternID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the EmailTemplateOverride field.
   */
  public void setEmailTemplateOverride(java.lang.String value);
  
  
  
}