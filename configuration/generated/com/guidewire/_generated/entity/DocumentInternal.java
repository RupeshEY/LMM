package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Document.eti;Document.eix;Document.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DocumentInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.document.impl.DocumentCoreExtInternalMethods, com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods, com.guidewire.pl.domain.document.DocumentPublicMethods, com.guidewire.pl.domain.document.impl.DocumentInternalMethods, com.guidewire.pl.system.bundle.CommitCallback, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback {
  java.lang.String DOCUMENTADDED_EVENT = "DocumentAdded";
  
  java.lang.String DOCUMENTCHANGED_EVENT = "DocumentChanged";
  
  java.lang.String DOCUMENTREMOVED_EVENT = "DocumentRemoved";
  
  java.lang.String DOCUMENTSTORE_EVENT = "DocumentStore";
  
  /**
   * Adds the given element to the ServiceRequestDocumentLinks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToServiceRequestDocumentLinks(entity.ServiceRequestDocumentLink element);
  
  
  /**
   * Gets the value of the Author field.
   * Name of the person who created the document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAuthor();
  
  
  /**
   * Gets the value of the AuthorDenorm field.
   * denorm field for Author
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAuthorDenorm();
  
  
  /**
   * Gets the value of the Claim field.
   * Associated claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimContact field.
   * Associated claim contact. Note that only one of Exposure, Matter, and ClaimContact may be set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact();
  
  
  public gw.pl.persistence.core.Key getClaimContactID();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the DateCreated field.
   * Date and time the document was created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateCreated();
  
  
  /**
   * Gets the value of the DateModified field.
   * Date and time the document was last modified.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateModified();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the DocUID field.
   * The Unique Identifier (UID) for this document.     The format of this UID is specific to the deployed Document Management System (DMS), and is passed to the configured IDocumentContentSource implementation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocUID();
  
  
  /**
   * Gets the value of the DocumentIdentifier field.
   * Short human-readable identifier for the document, often used as an extra storage location for form codes, when name and documenttype are inadequate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocumentIdentifier();
  
  
  /**
   * Gets the value of the DocumentIdentifierDenorm field.
   * denorm field for DocumentIdentifier
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocumentIdentifierDenorm();
  
  
  /**
   * Gets the value of the ECFStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFDocumentStatus_Ext getECFStatus();
  
  
  /**
   * Gets the value of the Exposure field.
   * Associated exposure. Note that only one of Exposure, Matter, and ClaimContact may be set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the IMRDocumentId field.
   * The UUID provided by the IMR Service
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIMRDocumentId();
  
  
  /**
   * Gets the value of the IMRDocumentType field.
   * The IMR Document Type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIMRDocumentType();
  
  
  /**
   * Gets the value of the IMRDocumentVersion field.
   * The IMR Document Version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIMRDocumentVersion();
  
  
  /**
   * Gets the value of the IMRDocumentVersionDtTime field.
   * The DateTime of the IMR Document Version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getIMRDocumentVersionDtTime();
  
  
  /**
   * Gets the value of the IMRFileSizeNum field.
   * The File Size Number of the IMR Document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getIMRFileSizeNum();
  
  
  /**
   * Gets the value of the IMRFileSizeUnit field.
   * The File Size Unit of the IMR Document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIMRFileSizeUnit();
  
  
  /**
   * Gets the value of the Language field.
   * The language in which this document is created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Matter field.
   * Associated matter. Note that only one of Exposure, Matter, and ClaimContact may be set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter();
  
  
  public gw.pl.persistence.core.Key getMatterID();
  
  
  /**
   * Gets the value of the MimeType field.
   * The MIME type of this document; for example, application/msword for a Microsoft Word document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMimeType();
  
  
  /**
   * Gets the value of the Name field.
   * Human-readable name of the document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the NameDenorm field.
   * denorm field for Name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameDenorm();
  
  
  /**
   * Gets the value of the PendingDocUID field.
   * The document is pending, and it's pending storage has Unique Identifier (UID).     The format of this UID is specific to the IDCS implementation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPendingDocUID();
  
  
  /**
   * Gets the value of the Recipient field.
   * Name of the intended recipient of the document (if any).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRecipient();
  
  
  /**
   * Gets the value of the Section field.
   * The section to which this document belongs, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentSection getSection();
  
  
  /**
   * Gets the value of the SecurityType field.
   * Type of document used for access-restriction purposes, in conjunction with the information in security-config.xml.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentSecurityType getSecurityType();
  
  
  /**
   * Gets the value of the ServiceRequestDocumentLinks field.
   * The ServiceRequestDocumentLinks linking ServiceRequests to this Document. This must be empty if any of the other 'related to' fields are set
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestDocumentLink[] getServiceRequestDocumentLinks();
  
  
  /**
   * Gets the value of the Status field.
   * The current status of the document, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentStatusType getStatus();
  
  
  /**
   * Gets the value of the TR field.
   * The Latest Transaction Reference related to this document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTR();
  
  
  /**
   * Gets the value of the Type field.
   * The specific type of the document, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentType getType();
  
  
  /**
   * Gets the value of the DMS field.
   * Whether this document has content stored in a Document Management System.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDMS();
  
  
  /**
   * Gets the value of the IMRInheritIndicator field.
   * The IMR Document Inherit Indicator.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIMRInheritIndicator();
  
  
  /**
   * Gets the value of the Inbound field.
   * Whether the document is an inbound, outbound, or stationary (null) document
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInbound();
  
  
  /**
   * Gets the value of the Obsolete field.
   * If true, the information in the document can no longer be relied upon to be up-to-date and relevant. This is often used instead of deletion to preserve history.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isObsolete();
  
  
  /**
   * Removes the given element from the ServiceRequestDocumentLinks array. This is achieved by marking the element for removal.
   */
  public void removeFromServiceRequestDocumentLinks(entity.ServiceRequestDocumentLink element);
  
  
  /**
   * Removes the given element from the ServiceRequestDocumentLinks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromServiceRequestDocumentLinks(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Author field.
   */
  public void setAuthor(java.lang.String value);
  
  
  /**
   * Sets the value of the AuthorDenorm field.
   */
  public void setAuthorDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value);
  
  
  public void setClaimContactID(gw.pl.persistence.core.Key value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DMS field.
   */
  public void setDMS(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the DateCreated field.
   */
  public void setDateCreated(java.util.Date value);
  
  
  /**
   * Sets the value of the DateModified field.
   */
  public void setDateModified(java.util.Date value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the DocUID field.
   */
  public void setDocUID(java.lang.String value);
  
  
  /**
   * Sets the value of the DocumentIdentifier field.
   */
  public void setDocumentIdentifier(java.lang.String value);
  
  
  /**
   * Sets the value of the DocumentIdentifierDenorm field.
   */
  public void setDocumentIdentifierDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the ECFStatus field.
   */
  public void setECFStatus(typekey.ECFDocumentStatus_Ext value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the IMRDocumentId field.
   */
  public void setIMRDocumentId(java.lang.String value);
  
  
  /**
   * Sets the value of the IMRDocumentType field.
   */
  public void setIMRDocumentType(java.lang.String value);
  
  
  /**
   * Sets the value of the IMRDocumentVersion field.
   */
  public void setIMRDocumentVersion(java.lang.String value);
  
  
  /**
   * Sets the value of the IMRDocumentVersionDtTime field.
   */
  public void setIMRDocumentVersionDtTime(java.util.Date value);
  
  
  /**
   * Sets the value of the IMRFileSizeNum field.
   */
  public void setIMRFileSizeNum(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the IMRFileSizeUnit field.
   */
  public void setIMRFileSizeUnit(java.lang.String value);
  
  
  /**
   * Sets the value of the IMRInheritIndicator field.
   */
  public void setIMRInheritIndicator(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Inbound field.
   */
  public void setInbound(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Language field.
   */
  public void setLanguage(typekey.LanguageType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value);
  
  
  public void setMatterID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the MimeType field.
   */
  public void setMimeType(java.lang.String value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the NameDenorm field.
   */
  public void setNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the Obsolete field.
   */
  public void setObsolete(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PendingDocUID field.
   */
  public void setPendingDocUID(java.lang.String value);
  
  
  /**
   * Sets the value of the Recipient field.
   */
  public void setRecipient(java.lang.String value);
  
  
  /**
   * Sets the value of the Section field.
   */
  public void setSection(typekey.DocumentSection value);
  
  
  /**
   * Sets the value of the SecurityType field.
   */
  public void setSecurityType(typekey.DocumentSecurityType value);
  
  
  /**
   * Sets the value of the ServiceRequestDocumentLinks field.
   */
  public void setServiceRequestDocumentLinks(entity.ServiceRequestDocumentLink[] value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.DocumentStatusType value);
  
  
  /**
   * Sets the value of the TR field.
   */
  public void setTR(java.lang.String value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.DocumentType value);
  
  
  
}