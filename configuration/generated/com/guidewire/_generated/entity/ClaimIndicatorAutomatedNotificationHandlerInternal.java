package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimIndicatorAutomatedNotificationHandler.eti;ClaimIndicatorAutomatedNotificationHandler.eix;ClaimIndicatorAutomatedNotificationHandler.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimIndicatorAutomatedNotificationHandlerInternal extends com.guidewire._generated.entity.AutomatedNotificationHandlerInternal, gw.api.specialhandling.AutomatedHandlerMethods, gw.cc.specialhandling.entity.ClaimIndicatorAutomatedNotificationHandler {
  /**
   * Adds the given element to the ClaimIndicatorTriggerArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToClaimIndicatorTriggerArray(entity.ClaimIndicatorTrigger element);
  
  
  /**
   * Gets the value of the ClaimIndicatorTrigger field.
   * The associated ClaimIndicatorTrigger whose execution would result in an email being generated according to the specifications of this handler
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimIndicatorTrigger getClaimIndicatorTrigger();
  
  
  /**
   * Gets the value of the ClaimIndicatorTriggerArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimIndicatorTrigger[] getClaimIndicatorTriggerArray();
  
  
  public gw.pl.persistence.core.Key getClaimIndicatorTriggerID();
  
  
  /**
   * Removes the given element from the ClaimIndicatorTriggerArray array. This is achieved by marking the element for removal.
   */
  public void removeFromClaimIndicatorTriggerArray(entity.ClaimIndicatorTrigger element);
  
  
  /**
   * Removes the given element from the ClaimIndicatorTriggerArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromClaimIndicatorTriggerArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ClaimIndicatorTrigger field.
   */
  public void setClaimIndicatorTrigger(entity.ClaimIndicatorTrigger value);
  
  
  /**
   * Sets the value of the ClaimIndicatorTriggerArray field.
   */
  public void setClaimIndicatorTriggerArray(entity.ClaimIndicatorTrigger[] value);
  
  
  public void setClaimIndicatorTriggerID(gw.pl.persistence.core.Key value);
  
  
  
}