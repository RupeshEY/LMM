package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestDocumentLink.eti;ServiceRequestDocumentLink.eix;ServiceRequestDocumentLink.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceRequestDocumentLinkInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.vendormanagement.impl.ServiceRequestDocumentLinkInternal, com.guidewire.pl.domain.document.DocumentJoiningBean, com.guidewire.pl.system.bundle.CommitCallback, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.vendormanagement.entity.ServiceRequestDocumentLink {
  java.lang.String SERVICEREQUESTDOCUMENTLINKADDED_EVENT = "ServiceRequestDocumentLinkAdded";
  
  java.lang.String SERVICEREQUESTDOCUMENTLINKCHANGED_EVENT = "ServiceRequestDocumentLinkChanged";
  
  java.lang.String SERVICEREQUESTDOCUMENTLINKREMOVED_EVENT = "ServiceRequestDocumentLinkRemoved";
  
  java.lang.String SERVICEREQUESTDOCUMENTTOVENDORADDED_EVENT = "ServiceRequestDocumentToVendorAdded";
  
  /**
   * Adds the given element to the StatementDocumentLinks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToStatementDocumentLinks(entity.ServiceRequestStatementDocumentLink element);
  
  
  /**
   * Gets the value of the DateSpecialistNotified field.
   * The date that the specialist was notified about the linked document, or null if the specialist has not been notified.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateSpecialistNotified();
  
  
  /**
   * Gets the value of the Document field.
   * Associated Document. Warning: even though there is always a Document associated with this entity, this field may be null when the IDocumentMetadataSource plugin is enabled. To reliably get the associated Document, use the LinkedDocument property.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Document getDocument();
  
  
  public gw.pl.persistence.core.Key getDocumentID();
  
  
  /**
   * Gets the value of the ServiceRequest field.
   * Service Request the document is linked to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequest getServiceRequest();
  
  
  public gw.pl.persistence.core.Key getServiceRequestID();
  
  
  /**
   * Gets the value of the StatementDocumentLinks field.
   * The join entity that holds the information for statements associated with this document
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestStatementDocumentLink[] getStatementDocumentLinks();
  
  
  /**
   * Gets the value of the VisibleToSpecialist field.
   * Whether this document should be visible to the specialist.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isVisibleToSpecialist();
  
  
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
   * Sets the value of the DateSpecialistNotified field.
   */
  public void setDateSpecialistNotified(java.util.Date value);
  
  
  /**
   * Sets the value of the Document field.
   */
  public void setDocument(entity.Document value);
  
  
  public void setDocumentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ServiceRequest field.
   */
  public void setServiceRequest(entity.ServiceRequest value);
  
  
  public void setServiceRequestID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the StatementDocumentLinks field.
   */
  public void setStatementDocumentLinks(entity.ServiceRequestStatementDocumentLink[] value);
  
  
  /**
   * Sets the value of the VisibleToSpecialist field.
   */
  public void setVisibleToSpecialist(java.lang.Boolean value);
  
  
  
}