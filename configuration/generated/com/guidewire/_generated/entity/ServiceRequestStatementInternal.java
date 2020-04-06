package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestStatement.eti;ServiceRequestStatement.eix;ServiceRequestStatement.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceRequestStatementInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.EventAwareInternal, gw.cc.vendormanagement.entity.ServiceRequestStatement {
  java.lang.String SERVICEREQUESTSTATEMENTADDED_EVENT = "ServiceRequestStatementAdded";
  
  java.lang.String SERVICEREQUESTSTATEMENTCHANGED_EVENT = "ServiceRequestStatementChanged";
  
  java.lang.String SERVICEREQUESTSTATEMENTREMOVED_EVENT = "ServiceRequestStatementRemoved";
  
  /**
   * Adds the given element to the LineItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLineItems(entity.ServiceRequestStatementLineItem element);
  
  
  /**
   * Adds the given element to the StatementDocumentLinks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToStatementDocumentLinks(entity.ServiceRequestStatementDocumentLink element);
  
  
  /**
   * Gets the value of the ApprovalDate field.
   * The time at which this statement was approved.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getApprovalDate();
  
  
  /**
   * Gets the value of the ApprovedBy field.
   * The user who approved this statement.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getApprovedBy();
  
  
  public gw.pl.persistence.core.Key getApprovedByID();
  
  
  /**
   * Gets the value of the DeclinedReason field.
   * The reason the statement was declined. When the state changes this value is recalculated, as the previous value not longer makes sense.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDeclinedReason();
  
  
  /**
   * Gets the value of the Description field.
   * The description for the statement
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the LineItems field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestStatementLineItem[] getLineItems();
  
  
  /**
   * Gets the value of the ReferenceNumber field.
   * A string identifier assigned to this ServiceRequestStatement by the specialist. The value of this field may only be meaningful to the specialist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReferenceNumber();
  
  
  /**
   * Gets the value of the ServiceRequest field.
   * Service Request the statement is linked to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getServiceRequest();
  
  
  public gw.pl.persistence.core.Key getServiceRequestID();
  
  
  /**
   * Gets the value of the Source field.
   * The external system from which this data comes 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.StatementSource getSource();
  
  
  /**
   * Gets the value of the StatementCreationTime field.
   * The time at which this statement was created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStatementCreationTime();
  
  
  /**
   * Gets the value of the StatementDocumentLinks field.
   * The join entity that holds the information for documents associated with this statement
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestStatementDocumentLink[] getStatementDocumentLinks();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestStatement getSubtype();
  
  
  /**
   * Removes the given element from the LineItems array. This is achieved by marking the element for removal.
   */
  public void removeFromLineItems(entity.ServiceRequestStatementLineItem element);
  
  
  /**
   * Removes the given element from the LineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLineItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the StatementDocumentLinks array. This is achieved by marking the element for removal.
   */
  public void removeFromStatementDocumentLinks(entity.ServiceRequestStatementDocumentLink element);
  
  
  /**
   * Removes the given element from the StatementDocumentLinks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromStatementDocumentLinks(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ApprovalDate field.
   */
  public void setApprovalDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ApprovedBy field.
   */
  public void setApprovedBy(entity.User value);
  
  
  public void setApprovedByID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DeclinedReason field.
   */
  public void setDeclinedReason(java.lang.String value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the LineItems field.
   */
  public void setLineItems(entity.ServiceRequestStatementLineItem[] value);
  
  
  /**
   * Sets the value of the ReferenceNumber field.
   */
  public void setReferenceNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ServiceRequest field.
   */
  public void setServiceRequest(entity.ServiceRequest value);
  
  
  public void setServiceRequestID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Source field.
   */
  public void setSource(typekey.StatementSource value);
  
  
  /**
   * Sets the value of the StatementCreationTime field.
   */
  public void setStatementCreationTime(java.util.Date value);
  
  
  /**
   * Sets the value of the StatementDocumentLinks field.
   */
  public void setStatementDocumentLinks(entity.ServiceRequestStatementDocumentLink[] value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ServiceRequestStatement value);
  
  
  
}