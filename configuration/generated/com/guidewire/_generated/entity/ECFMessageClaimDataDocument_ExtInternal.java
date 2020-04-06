package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageClaimDataDocument_Ext.eti;ECFMessageClaimDataDocument_Ext.eix;ECFMessageClaimDataDocument_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageClaimDataDocument_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the Description field.
   * Description
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the DocType field.
   * Coded indication of the business purpose of the document
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.IMRDocumentType_Ext getDocType();
  
  
  /**
   * Gets the value of the DocumentId field.
   * Document Id
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocumentId();
  
  
  /**
   * Gets the value of the ECFMsg field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimData_Ext getECFMsg();
  
  
  public gw.pl.persistence.core.Key getECFMsgID();
  
  
  /**
   * Gets the value of the FileFormat field.
   * Code that specifies the type and subtype of document format
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFFileFormat_Ext getFileFormat();
  
  
  /**
   * Gets the value of the FileSize field.
   * The size of the document file, in units specified by SupportingDocumentFileSizeMeasurementUnit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFileSize();
  
  
  /**
   * Gets the value of the FileSizeUnit field.
   * The unit of measure for the document size
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFMsgNotifRqDocSizeUnit_Ext getFileSizeUnit();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Reference field.
   * The unique reference of a document in the message owners repository
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getReference();
  
  
  /**
   * Gets the value of the Version field.
   * The version number of the document. Version can be given in combination to any document identification
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVersion();
  
  
  /**
   * Gets the value of the VersionDate field.
   * Document version date and time
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getVersionDate();
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the DocType field.
   */
  public void setDocType(typekey.IMRDocumentType_Ext value);
  
  
  /**
   * Sets the value of the DocumentId field.
   */
  public void setDocumentId(java.lang.String value);
  
  
  /**
   * Sets the value of the ECFMsg field.
   */
  public void setECFMsg(entity.ECFMessageClaimData_Ext value);
  
  
  public void setECFMsgID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FileFormat field.
   */
  public void setFileFormat(typekey.ECFFileFormat_Ext value);
  
  
  /**
   * Sets the value of the FileSize field.
   */
  public void setFileSize(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the FileSizeUnit field.
   */
  public void setFileSizeUnit(typekey.ECFMsgNotifRqDocSizeUnit_Ext value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Reference field.
   */
  public void setReference(java.lang.String value);
  
  
  /**
   * Sets the value of the Version field.
   */
  public void setVersion(java.lang.String value);
  
  
  /**
   * Sets the value of the VersionDate field.
   */
  public void setVersionDate(java.util.Date value);
  
  
  
}