package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SpecialHandling.eti;SpecialHandling.eix;SpecialHandling.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SpecialHandlingInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.specialhandling.entity.SpecialHandling {
  /**
   * Adds the given element to the AutomatedHandlers array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToAutomatedHandlers(entity.AutomatedHandler element);
  
  
  /**
   * Adds the given element to the OtherInstructions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOtherInstructions(entity.OtherInstruction element);
  
  
  /**
   * Gets the value of the AutomatedHandlers field.
   * An associative array of AutomatedHandlers, segmented by the AutomatedHandler subtype (i.e., AutomatedActivityHandler and AutomatedNotificationHandler
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AutomatedHandler[] getAutomatedHandlers();
  
  
  /**
   * Array association for partition AutomatedHandlersBySubtypes on array AutomatedHandlers
   */
  public entity.AutomatedHandler[] getAutomatedHandlersBySubtypes(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the OtherInstructions field.
   * Related other instructions
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OtherInstruction[] getOtherInstructions();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SpecialHandling getSubtype();
  
  
  /**
   * Removes the given element from the AutomatedHandlers array. This is achieved by marking the element for removal.
   */
  public void removeFromAutomatedHandlers(entity.AutomatedHandler element);
  
  
  /**
   * Removes the given element from the AutomatedHandlers array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromAutomatedHandlers(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the OtherInstructions array. This is achieved by marking the element for removal.
   */
  public void removeFromOtherInstructions(entity.OtherInstruction element);
  
  
  /**
   * Removes the given element from the OtherInstructions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOtherInstructions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AutomatedHandlers field.
   */
  public void setAutomatedHandlers(entity.AutomatedHandler[] value);
  
  
  /**
   * Sets the value of the OtherInstructions field.
   */
  public void setOtherInstructions(entity.OtherInstruction[] value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.SpecialHandling value);
  
  
  
}