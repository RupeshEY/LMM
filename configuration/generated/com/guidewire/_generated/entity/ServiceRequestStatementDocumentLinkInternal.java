package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestStatementDocumentLink.eti;ServiceRequestStatementDocumentLink.eix;ServiceRequestStatementDocumentLink.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceRequestStatementDocumentLinkInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the ServiceRequestDocumentLink field.
   * Service Request Document Link the statement is linked to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestDocumentLink getServiceRequestDocumentLink();
  
  
  public gw.pl.persistence.core.Key getServiceRequestDocumentLinkID();
  
  
  /**
   * Gets the value of the ServiceRequestStatement field.
   * The associated statement for the document link.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestStatement getServiceRequestStatement();
  
  
  public gw.pl.persistence.core.Key getServiceRequestStatementID();
  
  
  /**
   * Sets the value of the ServiceRequestDocumentLink field.
   */
  public void setServiceRequestDocumentLink(entity.ServiceRequestDocumentLink value);
  
  
  public void setServiceRequestDocumentLinkID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ServiceRequestStatement field.
   */
  public void setServiceRequestStatement(entity.ServiceRequestStatement value);
  
  
  public void setServiceRequestStatementID(gw.pl.persistence.core.Key value);
  
  
  
}