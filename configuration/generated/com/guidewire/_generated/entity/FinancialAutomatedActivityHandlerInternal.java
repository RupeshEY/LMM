package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FinancialAutomatedActivityHandler.eti;FinancialAutomatedActivityHandler.eix;FinancialAutomatedActivityHandler.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface FinancialAutomatedActivityHandlerInternal extends com.guidewire._generated.entity.AutomatedActivityHandlerInternal, gw.api.specialhandling.AutomatedHandlerMethods, gw.cc.specialhandling.entity.FinancialAutomatedActivityHandler {
  /**
   * Adds the given element to the FinancialThresholdTriggerArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToFinancialThresholdTriggerArray(entity.FinancialThresholdTrigger element);
  
  
  /**
   * Gets the value of the FinancialThresholdTrigger field.
   * The associated FinancialThresholdTrigger whose execution would result in an email being generated according to the specifications of this handler
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FinancialThresholdTrigger getFinancialThresholdTrigger();
  
  
  /**
   * Gets the value of the FinancialThresholdTriggerArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FinancialThresholdTrigger[] getFinancialThresholdTriggerArray();
  
  
  public gw.pl.persistence.core.Key getFinancialThresholdTriggerID();
  
  
  /**
   * Removes the given element from the FinancialThresholdTriggerArray array. This is achieved by marking the element for removal.
   */
  public void removeFromFinancialThresholdTriggerArray(entity.FinancialThresholdTrigger element);
  
  
  /**
   * Removes the given element from the FinancialThresholdTriggerArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromFinancialThresholdTriggerArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the FinancialThresholdTrigger field.
   */
  public void setFinancialThresholdTrigger(entity.FinancialThresholdTrigger value);
  
  
  /**
   * Sets the value of the FinancialThresholdTriggerArray field.
   */
  public void setFinancialThresholdTriggerArray(entity.FinancialThresholdTrigger[] value);
  
  
  public void setFinancialThresholdTriggerID(gw.pl.persistence.core.Key value);
  
  
  
}