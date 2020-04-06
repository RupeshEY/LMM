package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactDocumentInfo.eti;ContactDocumentInfo.eix;ContactDocumentInfo.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactDocumentInfoInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Author field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAuthor();
  
  
  /**
   * Gets the value of the DateCreated field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateCreated();
  
  
  /**
   * Gets the value of the DateModified field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateModified();
  
  
  /**
   * Gets the value of the Description field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the DocUID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocUID();
  
  
  /**
   * Gets the value of the DocumentIdentifier field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocumentIdentifier();
  
  
  /**
   * Gets the value of the Language field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage();
  
  
  /**
   * Gets the value of the MimeType field.
   * Document file type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMimeType();
  
  
  /**
   * Gets the value of the Name field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the PendingDocUID field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPendingDocUID();
  
  
  /**
   * Gets the value of the Recipient field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRecipient();
  
  
  /**
   * Gets the value of the Section field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentSection getSection();
  
  
  /**
   * Gets the value of the SecurityType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentSecurityType getSecurityType();
  
  
  /**
   * Gets the value of the Status field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentStatusType getStatus();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactDocumentInfo getSubtype();
  
  
  /**
   * Gets the value of the Type field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentType getType();
  
  
  /**
   * Gets the value of the URL field.
   * URL to access the document content
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getURL();
  
  
  /**
   * Gets the value of the DMS field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDMS();
  
  
  /**
   * Gets the value of the Inbound field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInbound();
  
  
  /**
   * Gets the value of the Obsolete field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isObsolete();
  
  
  /**
   * Sets the value of the Author field.
   */
  public void setAuthor(java.lang.String value);
  
  
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
   * Sets the value of the Inbound field.
   */
  public void setInbound(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Language field.
   */
  public void setLanguage(typekey.LanguageType value);
  
  
  /**
   * Sets the value of the MimeType field.
   */
  public void setMimeType(java.lang.String value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
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
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.DocumentStatusType value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ContactDocumentInfo value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.DocumentType value);
  
  
  /**
   * Sets the value of the URL field.
   */
  public void setURL(java.lang.String value);
  
  
  
}