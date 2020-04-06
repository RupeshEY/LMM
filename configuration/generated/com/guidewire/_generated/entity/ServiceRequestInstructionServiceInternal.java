package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestInstructionService.eti;ServiceRequestInstructionService.eix;ServiceRequestInstructionService.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceRequestInstructionServiceInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the Instruction field.
   * The instruction as part of which the linked service should be performed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestInstruction getInstruction();
  
  
  public gw.pl.persistence.core.Key getInstructionID();
  
  
  /**
   * Gets the value of the Service field.
   * The service to be performed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistService getService();
  
  
  public gw.pl.persistence.core.Key getServiceID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestInstructionService getSubtype();
  
  
  /**
   * Sets the value of the Instruction field.
   */
  public void setInstruction(entity.ServiceRequestInstruction value);
  
  
  public void setInstructionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Service field.
   */
  public void setService(entity.SpecialistService value);
  
  
  public void setServiceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ServiceRequestInstructionService value);
  
  
  
}