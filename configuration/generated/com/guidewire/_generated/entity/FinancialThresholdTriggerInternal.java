package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FinancialThresholdTrigger.eti;FinancialThresholdTrigger.eix;FinancialThresholdTrigger.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface FinancialThresholdTriggerInternal extends com.guidewire._generated.entity.RetireableInternal, gw.api.specialhandling.AutomatedHandlerTrigger, gw.cc.specialhandling.entity.FinancialThresholdTrigger {
  /**
   * Gets the value of the AutomatedHandler field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AutomatedHandler getAutomatedHandler();
  
  
  public gw.pl.persistence.core.Key getAutomatedHandlerID();
  
  
  /**
   * Gets the value of the Currency field.
   * The Currency of ThresholdAmount; this value must equal a Claim's Currency for that Claim to match this trigger.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the FinancialThreshold field.
   * The financial threshold that can cause this trigger to execute
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FinancialThreshold getFinancialThreshold();
  
  
  /**
   * Gets the value of the ThresholdAmount field.
   * Monetary amount for the threshold that must be exceeded to trigger the event
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getThresholdAmount();
  
  
  /**
   * Gets the value of the TriggeringCause field.
   * Specifies which exact occurrence takes place to cause this Trigger to fire
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FinancialTriggerCause getTriggeringCause();
  
  
  /**
   * Sets the value of the AutomatedHandler field.
   */
  public void setAutomatedHandler(entity.AutomatedHandler value);
  
  
  public void setAutomatedHandlerID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the FinancialThreshold field.
   */
  public void setFinancialThreshold(typekey.FinancialThreshold value);
  
  
  /**
   * Sets the value of the ThresholdAmount field.
   */
  public void setThresholdAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the TriggeringCause field.
   */
  public void setTriggeringCause(typekey.FinancialTriggerCause value);
  
  
  
}