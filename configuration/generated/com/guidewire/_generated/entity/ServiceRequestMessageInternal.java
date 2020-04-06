package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestMessage.eti;ServiceRequestMessage.eix;ServiceRequestMessage.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceRequestMessageInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.EventAwareInternal, gw.cc.vendormanagement.entity.ServiceRequestMessage {
  java.lang.String SERVICEREQUESTMESSAGEADDED_EVENT = "ServiceRequestMessageAdded";
  
  java.lang.String SERVICEREQUESTMESSAGECHANGED_EVENT = "ServiceRequestMessageChanged";
  
  java.lang.String SERVICEREQUESTMESSAGEREMOVED_EVENT = "ServiceRequestMessageRemoved";
  
  java.lang.String SERVICEREQUESTMESSAGETOVENDORADDED_EVENT = "ServiceRequestMessageToVendorAdded";
  
  /**
   * Gets the value of the Author field.
   * The author of the message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getAuthor();
  
  
  public gw.pl.persistence.core.Key getAuthorID();
  
  
  /**
   * Gets the value of the Body field.
   * The body of the service request message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBody();
  
  
  /**
   * Gets the value of the LockingColumn field.
   * Meaningless column for locking
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLockingColumn();
  
  
  /**
   * Gets the value of the SendDate field.
   * The date the message was sent
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSendDate();
  
  
  /**
   * Gets the value of the ServiceRequest field.
   * The Service Request related to this message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getServiceRequest();
  
  
  public gw.pl.persistence.core.Key getServiceRequestID();
  
  
  /**
   * Gets the value of the Title field.
   * The title of the service request message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTitle();
  
  
  /**
   * Gets the value of the Type field.
   * The message type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestMessageType getType();
  
  
  /**
   * Gets the value of the SentFromPortal field.
   * If the message is sent from an external portal
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSentFromPortal();
  
  
  /**
   * Sets the value of the Author field.
   */
  public void setAuthor(entity.Contact value);
  
  
  public void setAuthorID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Body field.
   */
  public void setBody(java.lang.String value);
  
  
  /**
   * Sets the value of the LockingColumn field.
   */
  public void setLockingColumn(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SendDate field.
   */
  public void setSendDate(java.util.Date value);
  
  
  /**
   * Sets the value of the SentFromPortal field.
   */
  public void setSentFromPortal(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ServiceRequest field.
   */
  public void setServiceRequest(entity.ServiceRequest value);
  
  
  public void setServiceRequestID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Title field.
   */
  public void setTitle(java.lang.String value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.ServiceRequestMessageType value);
  
  
  
}