package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestInstruction.eti;ServiceRequestInstruction.eix;ServiceRequestInstruction.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceRequestInstructionInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.vendormanagement.entity.ServiceRequestInstruction {
  /**
   * Adds the given element to the ChangeWhereIntroducedArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToChangeWhereIntroducedArray(entity.ServiceRequestChange element);
  
  
  /**
   * Adds the given element to the Services array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServices(entity.ServiceRequestInstructionService element);
  
  
  /**
   * Gets the value of the ChangeWhereIntroduced field.
   * Refers to the change where this instruction was added to the service request.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestChange getChangeWhereIntroduced();
  
  
  /**
   * Gets the value of the ChangeWhereIntroducedArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestChange[] getChangeWhereIntroducedArray();
  
  
  public gw.pl.persistence.core.Key getChangeWhereIntroducedID();
  
  
  /**
   * Gets the value of the CustomerContact field.
   * The contact with whom the specialist should coordinate to perform the work. In many cases, this will be the claimant.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getCustomerContact();
  
  
  public gw.pl.persistence.core.Key getCustomerContactID();
  
  
  /**
   * Gets the value of the InstructionText field.
   * Text instructions to be provided to the specialist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInstructionText();
  
  
  /**
   * Gets the value of the ServiceAddress field.
   * The location at which the service is to be performed; may be null if the location is implied by the specialist, such as if it will be performed at the specialist's place of business.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getServiceAddress();
  
  
  public gw.pl.persistence.core.Key getServiceAddressID();
  
  
  /**
   * Gets the value of the ServiceRequest field.
   * The service request for which the specialist is being instructed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getServiceRequest();
  
  
  public gw.pl.persistence.core.Key getServiceRequestID();
  
  
  /**
   * Gets the value of the Services field.
   * The services to be performed for this set of instructions.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestInstructionService[] getServices();
  
  
  /**
   * Removes the given element from the ChangeWhereIntroducedArray array. This is achieved by marking the element for removal.
   */
  public void removeFromChangeWhereIntroducedArray(entity.ServiceRequestChange element);
  
  
  /**
   * Removes the given element from the ChangeWhereIntroducedArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromChangeWhereIntroducedArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Services array. This is achieved by marking the element for removal.
   */
  public void removeFromServices(entity.ServiceRequestInstructionService element);
  
  
  /**
   * Removes the given element from the Services array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServices(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ChangeWhereIntroduced field.
   */
  public void setChangeWhereIntroduced(entity.ServiceRequestChange value);
  
  
  /**
   * Sets the value of the ChangeWhereIntroducedArray field.
   */
  public void setChangeWhereIntroducedArray(entity.ServiceRequestChange[] value);
  
  
  public void setChangeWhereIntroducedID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CustomerContact field.
   */
  public void setCustomerContact(entity.Contact value);
  
  
  public void setCustomerContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InstructionText field.
   */
  public void setInstructionText(java.lang.String value);
  
  
  /**
   * Sets the value of the ServiceAddress field.
   */
  public void setServiceAddress(entity.Address value);
  
  
  public void setServiceAddressID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ServiceRequest field.
   */
  public void setServiceRequest(entity.ServiceRequest value);
  
  
  public void setServiceRequestID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Services field.
   */
  public void setServices(entity.ServiceRequestInstructionService[] value);
  
  
  
}