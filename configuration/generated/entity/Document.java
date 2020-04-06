package entity;

/**
 * Document
 * <p>
 *         Represents a physical or electronic document. This entity only contains information about the referenced document,
 *         known as metadata, not the actual document contents. Use <code>IDocumentContentSource</code> to retrieve and store
 *         document contents.  Multiple <code>Document</code> entities may have the same value for the <code>docUID</code>
 *         field. This means simply that the <code>Document</code> entities represent the same physical document, for example,
 *         a document that applies to multiple claims.
 *         </p><p>
 *         Note that <code>Document</code> entities may or may not be stored in the database. You can implement a plugin
 *         interface, {@link com.guidewire.pl.plugin.document.IDocumentMetadataSource}, to retrieve document metadata from
 *         an external document management system (DMS). If you do not implement and register this interface, the system stores
 *         the <code>Document</code> entities in the database in the normal manner.
 *         </p><p>
 *         It is important to coordinate customizations of this entity with those of the <code>DocumentSearchCriteria</code>
 *         and <code>DocumentSearchResult</code> entities, so that users will be able to search for documents based on the
 *         most appropriate fields and select from the results.
 *         </p><p>
 *         The system retrieves the documents' contents (as referenced by <code>Document</code> entities) through the
 *         {@link com.guidewire.pl.plugin.document.IDocumentContentSource} plugin interface. This interface connects a Guidewire
 *         application to a DMS. The DMS property on the <code>Document</code> entity indicates whether the contents of the
 *         document are stored in the document management system; if not, then the entity merely denotes the existence of a
 *         physical document and no electronic access is available. If the contents do exist in the DMS, then the <code>DocUID</code>
 *         property must be a key that uniquely identifies the contents which should be displayed for a particular
 *         <code>Document</code> entity.
 *         </p><p>
 *         You can control access to particular <code>Document</code> entities through the <code>SecurityType</code> property.
 *         Use this property in conjunction with the security settings in <code>security-config.xml</code>. See the
 *         Administration Guide for more details.
 *         </p>
 *       
 *     
 */
@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Document.eti;Document.eix;Document.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
@gw.internal.gosu.parser.ExtendedType
@gw.lang.SimplePropertyProcessing
@gw.entity.EntityName(value = "Document")
public class Document extends com.guidewire.pl.persistence.code.BeanBase implements entity.Retireable, entity.Extractable, entity.EventAware {
  public static final gw.pl.persistence.type.EntityTypeReference<entity.Document> TYPE = new com.guidewire.commons.metadata.types.EntityIntrinsicTypeReference<entity.Document>("entity.Document");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ARCHIVEPARTITION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ArchivePartition");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AUTHOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Author");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> AUTHORDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "AuthorDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> BEANVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "BeanVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIM_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Claim");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CLAIMCONTACT_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "ClaimContact");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> CREATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "CreateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> CREATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "CreateUser");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DMS_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DMS");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATECREATED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateCreated");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DATEMODIFIED_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DateModified");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DESCRIPTION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Description");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DOCUID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DocUID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DOCUMENTIDENTIFIER_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DocumentIdentifier");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> DOCUMENTIDENTIFIERDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "DocumentIdentifierDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> ECFSTATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "ECFStatus");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> EXPOSURE_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Exposure");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> ID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "ID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMRDOCUMENTID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IMRDocumentId");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMRDOCUMENTTYPE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IMRDocumentType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMRDOCUMENTVERSION_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IMRDocumentVersion");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMRDOCUMENTVERSIONDTTIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IMRDocumentVersionDtTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMRFILESIZENUM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IMRFileSizeNum");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMRFILESIZEUNIT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IMRFileSizeUnit");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> IMRINHERITINDICATOR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "IMRInheritIndicator");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> INBOUND_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Inbound");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> LANGUAGE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Language");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> LOADCOMMANDID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "LoadCommandID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> MATTER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "Matter");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> MIMETYPE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "MimeType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Name");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> NAMEDENORM_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "NameDenorm");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> OBSOLETE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Obsolete");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PENDINGDOCUID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PendingDocUID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> PUBLICID_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "PublicID");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RECIPIENT_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "Recipient");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIREDVALUE_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "RetiredValue");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SECTION_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Section");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> SECURITYTYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "SecurityType");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IArrayPropertyInfo> SERVICEREQUESTDOCUMENTLINKS_PROP = new com.guidewire.commons.metadata.types.ArrayPropertyInfoCache(TYPE, "ServiceRequestDocumentLinks");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> STATUS_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Status");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> TR_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "TR");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ITypekeyPropertyInfo> TYPE_PROP = new com.guidewire.commons.metadata.types.TypekeyPropertyInfoCache(TYPE, "Type");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> UPDATETIME_PROP = new com.guidewire.commons.metadata.types.ColumnPropertyInfoCache(TYPE, "UpdateTime");
  
  public static final gw.pl.persistence.type.EntityPropertyInfoReference<gw.entity.ILinkPropertyInfo> UPDATEUSER_PROP = new com.guidewire.commons.metadata.types.LinkPropertyInfoCache(TYPE, "UpdateUser");
  
  private com.guidewire.pl.persistence.code.DelegateLoader _delegateManager;
  
  private com.guidewire._generated.entity.DocumentInternal _internal;
  
  private static final com.guidewire.pl.persistence.code.DelegateMap DELEGATE_MAP;
  
  public static final gw.pl.persistence.type.DynamicEntityPropertyInfoReference<gw.entity.IColumnPropertyInfo> RETIRED_DYNPROP = com.guidewire.pl.domain.persistence.core.RetireablePublicMethods.RETIRED_DYNPROP;
  
  /**
   * Constructs a new instance of this entity in the {@link gw.transaction.Transaction#getCurrent() current} bundle.
   * @throws java.lang.NullPointerException if there is no current bundle defined
   */
  public Document()  {
    this(gw.transaction.Transaction.getCurrent());
  }
  
  /**
   * Constructs a new instance of this entity in the bundle supplied by the given bundle provider.
   */
  public Document(gw.pl.persistence.core.BundleProvider bundleProvider)  {
    this((java.lang.Void)null);
    com.guidewire.pl.system.entity.proxy.BeanProxy.initNewBeanInstance(this, bundleProvider.getBundle(), java.util.Arrays.asList());
  }
  
  protected Document(java.lang.Void ignored)  {
    
  }
  
  protected com.guidewire._generated.entity.DocumentInternal __createInternalInterface() {
    return new _Internal();
  }
  
  protected final com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
    if(_delegateManager == null) {
      _delegateManager  =  com.guidewire.pl.persistence.code.DelegateLoader.newInstance(this, __getDelegateMap());
    };
    return _delegateManager;
  }
  
  protected com.guidewire.pl.persistence.code.DelegateMap __getDelegateMap() {
    return DELEGATE_MAP;
  }
  
  protected com.guidewire._generated.entity.DocumentInternal __getInternalInterface() {
    if(_internal == null) {
      _internal  =  __createInternalInterface();
    };
    return _internal;
  }
  
  /**
   * Associates an event with the bean, which will be fired when the bean is
   * committed. A bean with an event is considered changed.
   * @param strEventId The event id.
   */
  public void addEvent(java.lang.String strEventId) {
    ((com.guidewire.pl.domain.messaging.EventAwarePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.EventAwarePublicMethods")).addEvent(strEventId);
  }
  
  public void beforeInsert() {
    ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
  }
  
  public void beforeRemove() {
    ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
  }
  
  public void beforeUpdate() {
    ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
  }
  
  /**
   * If true, the document will be persisted
   * @return true if the document will be persisted
   */
  public boolean doesNotRequirePersistence() {
    return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).doesNotRequirePersistence();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getArchivePartition() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
  }
  
  /**
   * Gets the value of the Author field.
   * Name of the person who created the document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAuthor() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AUTHOR_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getAuthorDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AUTHORDENORM_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getBeanVersion() {
    return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
  }
  
  /**
   * Gets the value of the Claim field.
   * Associated claim.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim() {
    return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
  }
  
  /**
   * Gets the value of the ClaimContact field.
   * Associated claim contact. Note that only one of Exposure, Matter, and ClaimContact may be set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContact getClaimContact() {
    return (entity.ClaimContact)__getInternalInterface().getFieldValue(CLAIMCONTACT_PROP.get());
  }
  
  public entity.Contact getClaimant() {
    return ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).getClaimant();
  }
  
  public gw.pl.persistence.core.Key getClaimantID() {
    return ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).getClaimantID();
  }
  
  /**
   * Gets the value of the CreateTime field.
   * Timestamp when the object was created
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the CreateUser field.
   * User who created the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
  }
  
  /**
   * Gets the value of the DateCreated field.
   * Date and time the document was created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateCreated() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATECREATED_PROP.get());
  }
  
  /**
   * Gets the value of the DateModified field.
   * Date and time the document was last modified.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateModified() {
    return (java.util.Date)__getInternalInterface().getFieldValue(DATEMODIFIED_PROP.get());
  }
  
  /**
   * Gets the value of the Description field.
   * Description of the document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
  }
  
  /**
   * Gets the value of the DocUID field.
   * The Unique Identifier (UID) for this document.     The format of this UID is specific to the deployed Document Management System (DMS), and is passed to the configured IDocumentContentSource implementation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocUID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUID_PROP.get());
  }
  
  /**
   * Gets the value of the DocumentIdentifier field.
   * Short human-readable identifier for the document, often used as an extra storage location for form codes, when name and documenttype are inadequate.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocumentIdentifier() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUMENTIDENTIFIER_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDocumentIdentifierDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUMENTIDENTIFIERDENORM_PROP.get());
  }
  
  /**
   * Gets the language in which the document was created in.  A null value means
   * that it is not clear which language the document was created in.  Most possibly,
   * it is the default locale of the application.
   * @return language
   */
  public gw.i18n.ILocale getDocumentLanguage() {
    return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).getDocumentLanguage();
  }
  
  /**
   * Gets the value of the ECFStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFDocumentStatus_Ext getECFStatus() {
    return (typekey.ECFDocumentStatus_Ext)__getInternalInterface().getFieldValue(ECFSTATUS_PROP.get());
  }
  
  /**
   * Gets the value of the Exposure field.
   * Associated exposure. Note that only one of Exposure, Matter, and ClaimContact may be set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure() {
    return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.persistence.core.Key getID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
  }
  
  /**
   * Gets the value of the IMRDocumentId field.
   * The UUID provided by the IMR Service
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIMRDocumentId() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMRDOCUMENTID_PROP.get());
  }
  
  /**
   * Gets the value of the IMRDocumentType field.
   * The IMR Document Type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIMRDocumentType() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMRDOCUMENTTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the IMRDocumentVersion field.
   * The IMR Document Version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIMRDocumentVersion() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMRDOCUMENTVERSION_PROP.get());
  }
  
  /**
   * Gets the value of the IMRDocumentVersionDtTime field.
   * The DateTime of the IMR Document Version.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getIMRDocumentVersionDtTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(IMRDOCUMENTVERSIONDTTIME_PROP.get());
  }
  
  /**
   * Gets the value of the IMRFileSizeNum field.
   * The File Size Number of the IMR Document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getIMRFileSizeNum() {
    return (java.math.BigDecimal)__getInternalInterface().getFieldValue(IMRFILESIZENUM_PROP.get());
  }
  
  /**
   * Gets the value of the IMRFileSizeUnit field.
   * The File Size Unit of the IMR Document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getIMRFileSizeUnit() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMRFILESIZEUNIT_PROP.get());
  }
  
  /**
   * Returns the name of an icon image to represent this document. The result is based on the document's mime type.
   * @return a string identifying an icon for this document
   */
  public java.lang.String getIcon() {
    return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).getIcon();
  }
  
  /**
   * Gets the value of the Language field.
   * The language in which this document is created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getLanguage() {
    return (typekey.LanguageType)__getInternalInterface().getFieldValue(LANGUAGE_PROP.get());
  }
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
  }
  
  /**
   * Gets the locale in which the document was created in.  A null value means
   * that it is not clear which language the document was created in.  Most possibly,
   * it is the default locale of the application.
   * @return locale
   * @deprecated see getDocumentLanguage() instead
   */
  public gw.i18n.ILocale getLocale() {
    return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).getLocale();
  }
  
  /**
   * Gets the value of the Matter field.
   * Associated matter. Note that only one of Exposure, Matter, and ClaimContact may be set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Matter getMatter() {
    return (entity.Matter)__getInternalInterface().getFieldValue(MATTER_PROP.get());
  }
  
  /**
   * Gets the value of the MimeType field.
   * The MIME type of this document; for example, application/msword for a Microsoft Word document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMimeType() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MIMETYPE_PROP.get());
  }
  
  /**
   * Gets the value of the Name field.
   * Human-readable name of the document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameDenorm() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEDENORM_PROP.get());
  }
  
  /**
   * Gets the value of the PendingDocUID field.
   * The document is pending, and it's pending storage has Unique Identifier (UID).     The format of this UID is specific to the IDCS implementation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPendingDocUID() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PENDINGDOCUID_PROP.get());
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPublicID() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
  }
  
  /**
   * Gets the value of the Recipient field.
   * Name of the intended recipient of the document (if any).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getRecipient() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RECIPIENT_PROP.get());
  }
  
  public java.util.Set<entity.ServiceRequestDocumentLink> getRelatedServiceRequestDocumentLinks() {
    return ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).getRelatedServiceRequestDocumentLinks();
  }
  
  public java.util.Set<entity.ServiceRequest> getRelatedServiceRequests() {
    return ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).getRelatedServiceRequests();
  }
  
  public gw.pl.persistence.core.Bean getRelatedTo() {
    return ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).getRelatedTo();
  }
  
  /**
   * 
   * @deprecated This field is not intended to be accessed directly. This method may be removed in a future release.
   */
  @java.lang.Deprecated
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getRetiredValue() {
    return (java.lang.Long)__getInternalInterface().getFieldValue(RETIREDVALUE_PROP.get());
  }
  
  /**
   * Gets the value of the Section field.
   * The section to which this document belongs, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentSection getSection() {
    return (typekey.DocumentSection)__getInternalInterface().getFieldValue(SECTION_PROP.get());
  }
  
  /**
   * Gets the value of the SecurityType field.
   * Type of document used for access-restriction purposes, in conjunction with the information in security-config.xml.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentSecurityType getSecurityType() {
    return (typekey.DocumentSecurityType)__getInternalInterface().getFieldValue(SECURITYTYPE_PROP.get());
  }
  
  /**
   * Gets the value of the ServiceRequestDocumentLinks field.
   * The ServiceRequestDocumentLinks linking ServiceRequests to this Document. This must be empty if any of the other 'related to' fields are set
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestDocumentLink[] getServiceRequestDocumentLinks() {
    return (entity.ServiceRequestDocumentLink[])__getInternalInterface().getFieldValue(SERVICEREQUESTDOCUMENTLINKS_PROP.get());
  }
  
  /**
   * Gets the value of the Status field.
   * The current status of the document, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentStatusType getStatus() {
    return (typekey.DocumentStatusType)__getInternalInterface().getFieldValue(STATUS_PROP.get());
  }
  
  /**
   * Gets the value of the TR field.
   * The Latest Transaction Reference related to this document.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTR() {
    return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TR_PROP.get());
  }
  
  /**
   * Gets the value of the Type field.
   * The specific type of the document, if any.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DocumentType getType() {
    return (typekey.DocumentType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateTime field.
   * Timestamp when the object was last updated
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getUpdateTime() {
    return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
  }
  
  /**
   * Gets the value of the UpdateUser field.
   * User who last updated the object
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getUpdateUser() {
    return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
  }
  
  /**
   * Returns the the cached status about whether the document content exists in the document content source.
   * On the first call on the entity instance, it will call into document content source plugin to get the status
   * and cache the result for future calls
   * @throws com.guidewire.pl.system.integration.plugins.PluginException if any exception occurs during call to the plugin
   * @return true if the document content exists in the document content source
   */
  public boolean isCachedContentExists() throws com.guidewire.pl.system.integration.plugins.PluginException {
    return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).isCachedContentExists();
  }
  
  /**
   * Gets the value of the DMS field.
   * Whether this document has content stored in a Document Management System.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDMS() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(DMS_PROP.get());
  }
  
  /**
   * Gets the value of the IMRInheritIndicator field.
   * The IMR Document Inherit Indicator.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIMRInheritIndicator() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(IMRINHERITINDICATOR_PROP.get());
  }
  
  /**
   * Gets the value of the Inbound field.
   * Whether the document is an inbound, outbound, or stationary (null) document
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isInbound() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(INBOUND_PROP.get());
  }
  
  /**
   * 
   * @return true if this bean is to be inserted into the database when the bundle is committed.
   */
  public boolean isNew() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
  }
  
  /**
   * 
   * @return True if the object was created by importation from an external system,
   *         False if it was created internally. Note that this refers to the currently
   *         instantiated object, not the data it represents
   */
  public boolean isNewlyImported() {
    return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
  }
  
  /**
   * Gets the value of the Obsolete field.
   * If true, the information in the document can no longer be relied upon to be up-to-date and relevant. This is often used instead of deletion to preserve history.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isObsolete() {
    return (java.lang.Boolean)__getInternalInterface().getFieldValue(OBSOLETE_PROP.get());
  }
  
  /**
   * 
   * @return True if the object has been retired from active use, false if the
   *         object is active.  Retireable objects are never deleted from a
   *         database table, instead they are retired by setting the retired
   *         column to the same value as the ID of the object.
   */
  public java.lang.Boolean isRetired() {
    return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
  }
  
  /**
   * If true, the document metadata is stored in an IDMS
   * @return true if the document metadata came from an IDMS
   */
  public boolean isRetrievedFromIDMS() {
    return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).isRetrievedFromIDMS();
  }
  
  /**
   * Refreshes this bean with the latest database version.
   * <p/>
   * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
   * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
   * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
   * updated.
   */
  public entity.KeyableBean refresh() {
    return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
  }
  
  /**
   * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
   * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
   * <p>
   * WARNING: This method is designed for simple custom entities which are normally not
   * associated with other entities. Undesirable results may occur when used on out-of-box entities.
   */
  public void remove() {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
  }
  
  /**
   * Whether this document has been flagged to require saving.  I.e., the document was
   * retrieved from the DMS, but was changed so needs to be written out.  Note that when retrieved
   * it will be flagged as non persisting, and as far as the entity system is concerned initial save.
   * @return requires persisting only to DMS
   */
  public boolean requiresSavingToDMS() {
    return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).requiresSavingToDMS();
  }
  
  /**
   * Sets the value of the ArchivePartition field.
   */
  private void setArchivePartition(java.lang.Long value) {
    __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Author field.
   */
  public void setAuthor(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(AUTHOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the AuthorDenorm field.
   */
  private void setAuthorDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(AUTHORDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the BeanVersion field.
   */
  private void setBeanVersion(java.lang.Integer value) {
    __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value) {
    __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ClaimContact field.
   */
  public void setClaimContact(entity.ClaimContact value) {
    __getInternalInterface().setFieldValue(CLAIMCONTACT_PROP.get(), value);
  }
  
  public void setClaimant(entity.Contact value) {
    ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).setClaimant(value);
  }
  
  public void setClaimantID(gw.pl.persistence.core.Key value) {
    ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).setClaimantID(value);
  }
  
  /**
   * Sets the value of the CreateTime field.
   */
  private void setCreateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the CreateUser field.
   */
  private void setCreateUser(entity.User value) {
    __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DMS field.
   */
  public void setDMS(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(DMS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateCreated field.
   */
  public void setDateCreated(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATECREATED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DateModified field.
   */
  public void setDateModified(java.util.Date value) {
    __getInternalInterface().setFieldValue(DATEMODIFIED_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DocUID field.
   */
  public void setDocUID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DOCUID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DocumentIdentifier field.
   */
  public void setDocumentIdentifier(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DOCUMENTIDENTIFIER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the DocumentIdentifierDenorm field.
   */
  private void setDocumentIdentifierDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(DOCUMENTIDENTIFIERDENORM_PROP.get(), value);
  }
  
  /**
   * Sets the language in which the document is created in.  This should not be changed once the
   * document is stored
   * @param language the the language
   */
  public void setDocumentLanguage(gw.i18n.ILocale language) {
    ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setDocumentLanguage(language);
  }
  
  /**
   * Sets the value of the ECFStatus field.
   */
  public void setECFStatus(typekey.ECFDocumentStatus_Ext value) {
    __getInternalInterface().setFieldValue(ECFSTATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value) {
    __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the ID field.
   */
  private void setID(gw.pl.persistence.core.Key value) {
    __getInternalInterface().setFieldValue(ID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IMRDocumentId field.
   */
  public void setIMRDocumentId(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(IMRDOCUMENTID_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IMRDocumentType field.
   */
  public void setIMRDocumentType(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(IMRDOCUMENTTYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IMRDocumentVersion field.
   */
  public void setIMRDocumentVersion(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(IMRDOCUMENTVERSION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IMRDocumentVersionDtTime field.
   */
  public void setIMRDocumentVersionDtTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(IMRDOCUMENTVERSIONDTTIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IMRFileSizeNum field.
   */
  public void setIMRFileSizeNum(java.math.BigDecimal value) {
    __getInternalInterface().setFieldValue(IMRFILESIZENUM_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IMRFileSizeUnit field.
   */
  public void setIMRFileSizeUnit(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(IMRFILESIZEUNIT_PROP.get(), value);
  }
  
  /**
   * Sets the value of the IMRInheritIndicator field.
   */
  public void setIMRInheritIndicator(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(IMRINHERITINDICATOR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Inbound field.
   */
  public void setInbound(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(INBOUND_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Language field.
   */
  public void setLanguage(typekey.LanguageType value) {
    __getInternalInterface().setFieldValue(LANGUAGE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  private void setLoadCommandID(java.lang.Long value) {
    __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
  }
  
  /**
   * Sets the locale in which the document is created in.  This should not be changed once the
   * document is stored
   * @param locale the locale
   * @deprecated use set language instead
   */
  public void setLocale(gw.i18n.ILocale locale) {
    ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setLocale(locale);
  }
  
  /**
   * Sets the value of the Matter field.
   */
  public void setMatter(entity.Matter value) {
    __getInternalInterface().setFieldValue(MATTER_PROP.get(), value);
  }
  
  /**
   * Sets the value of the MimeType field.
   */
  public void setMimeType(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(MIMETYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the NameDenorm field.
   */
  private void setNameDenorm(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(NAMEDENORM_PROP.get(), value);
  }
  
  /**
   * Set a flag denoting that the currently instantiated object has been newly imported from
   * an external source
   * @param newlyImported 
   */
  public void setNewlyImported(boolean newlyImported) {
    ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
  }
  
  /**
   * Sets the value of the Obsolete field.
   */
  public void setObsolete(java.lang.Boolean value) {
    __getInternalInterface().setFieldValue(OBSOLETE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the PendingDocUID field.
   */
  public void setPendingDocUID(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(PENDINGDOCUID_PROP.get(), value);
  }
  
  /**
   * 
   * @param persisted when false (default is true), the document will not be persisted
   * This needs to be visible to rules so that certain utilities which interact with
   * IDocumentProduction implementations can set it so that things work correctly
   */
  public void setPersistenceRequired(boolean persisted) {
    ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setPersistenceRequired(persisted);
  }
  
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setPublicID(java.lang.String id) {
    ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
  }
  
  /**
   * Sets the value of the Recipient field.
   */
  public void setRecipient(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(RECIPIENT_PROP.get(), value);
  }
  
  public void setRelatedTo(gw.pl.persistence.core.Bean relatedTo) {
    ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).setRelatedTo(relatedTo);
  }
  
  /**
   * Whether this document has been flagged to require saving.  I.e., the document was
   * retrieved from the DMS, but was changed so needs to be written out.  Note that when retrieved
   * it will be flagged as non persisting, and as far as the entity system is concerned initial save.
   * @param value whether this document requires persisting to DMS
   */
  public void setRequiresSavingToDMS(boolean value) {
    ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setRequiresSavingToDMS(value);
  }
  
  /**
   * Sets the value of the RetiredValue field.
   */
  private void setRetiredValue(java.lang.Long value) {
    __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
  }
  
  /**
   * Marks the document as having its metadata retrieved from an IDMS
   * Also marks the document as initially not requiring persistence.
   */
  public void setRetrievedFromIDMS() {
    ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setRetrievedFromIDMS();
  }
  
  /**
   * Sets the value of the Section field.
   */
  public void setSection(typekey.DocumentSection value) {
    __getInternalInterface().setFieldValue(SECTION_PROP.get(), value);
  }
  
  /**
   * Sets the value of the SecurityType field.
   * @param value 
   */
  @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
  public void setSecurityType(typekey.DocumentSecurityType value) {
    ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setSecurityType(value);
  }
  
  /**
   * Sets the value of the ServiceRequestDocumentLinks field.
   */
  private void setServiceRequestDocumentLinks(entity.ServiceRequestDocumentLink[] value) {
    __getInternalInterface().setFieldValue(SERVICEREQUESTDOCUMENTLINKS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.DocumentStatusType value) {
    __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
  }
  
  /**
   * Sets the value of the TR field.
   */
  public void setTR(java.lang.String value) {
    __getInternalInterface().setFieldValueForCodegen(TR_PROP.get(), value);
  }
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.DocumentType value) {
    __getInternalInterface().setFieldValue(TYPE_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateTime field.
   */
  private void setUpdateTime(java.util.Date value) {
    __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
  }
  
  /**
   * Sets the value of the UpdateUser field.
   */
  private void setUpdateUser(entity.User value) {
    __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
  }
  
  /**
   * Set's the version of the bean to the next value (i.e. the bean version original value+1)
   * Multiple calls to this method on the same bean will result in the same value being used
   * for the version (i.e. it is idempotent).
   * 
   * Calling this method will force the bean to be written to the database and participate fully
   * in the commit cycle e.g. pre-update rules will be run, etc.
   */
  public void touch() {
    ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
  }
  
  private class _Internal extends com.guidewire.pl.persistence.code.BeanInternalBase implements com.guidewire._generated.entity.DocumentInternal {
    protected com.guidewire.pl.persistence.code.DelegateLoader __getDelegateManager() {
      return entity.Document.this.__getDelegateManager();
    }
    
    public boolean addDocumentToDocumentSource(java.io.InputStream inputStream) throws com.guidewire.pl.system.integration.plugins.PluginException {
      return ((com.guidewire.pl.domain.document.impl.DocumentInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.impl.DocumentInternalMethods")).addDocumentToDocumentSource(inputStream);
    }
    
    public void addEvent(com.guidewire.pl.system.entity.BeanEvent event) {
      ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).addEvent(event);
    }
    
    /**
     * Associates an event with the bean, which will be fired when the bean is
     * committed. A bean with an event is considered changed.
     * @param strEventId The event id.
     */
    public void addEvent(java.lang.String strEventId) {
      ((com.guidewire.pl.domain.messaging.EventAwarePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.EventAwarePublicMethods")).addEvent(strEventId);
    }
    
    /**
     * Adds the given element to the ServiceRequestDocumentLinks array. This is achieved by setting the parent foreign key to this entity instance.
     */
    public void addToServiceRequestDocumentLinks(entity.ServiceRequestDocumentLink element) {
      __getInternalInterface().addArrayElement(SERVICEREQUESTDOCUMENTLINKS_PROP.get(), element);
    }
    
    public void afterDatabaseWrite() {
      ((com.guidewire.pl.system.bundle.CommitCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.CommitCallback")).afterDatabaseWrite();
    }
    
    public boolean alwaysReserveID() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).alwaysReserveID();
    }
    
    public void assignPermanentId(gw.pl.persistence.core.Key id) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).assignPermanentId(id);
    }
    
    public void beforeInsert() {
      ((com.guidewire.pl.system.bundle.InsertCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.InsertCallback")).beforeInsert();
    }
    
    public void beforeRemove() {
      ((com.guidewire.pl.system.bundle.RemoveCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.RemoveCallback")).beforeRemove();
    }
    
    public void beforeUpdate() {
      ((com.guidewire.pl.system.bundle.UpdateCallback)__getDelegateManager().getImplementation("com.guidewire.pl.system.bundle.UpdateCallback")).beforeUpdate();
    }
    
    public java.lang.Integer calculateNextVersion() {
      return ((com.guidewire.pl.domain.persistence.core.impl.VersionableInternal)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal")).calculateNextVersion();
    }
    
    public java.util.List<entity.KeyableBean> cascadeDelete() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cascadeDelete();
    }
    
    public void clearRelatedToFields() {
      ((com.guidewire.cc.domain.document.impl.DocumentCoreExtInternalMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtInternalMethods")).clearRelatedToFields();
    }
    
    public entity.KeyableBean cloneBeanForBundleTransfer() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).cloneBeanForBundleTransfer();
    }
    
    public void displayErrorMessageHack(java.lang.Exception e) {
      ((com.guidewire.cc.domain.document.impl.DocumentCoreExtInternalMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtInternalMethods")).displayErrorMessageHack(e);
    }
    
    /**
     * If true, the document will be persisted
     * @return true if the document will be persisted
     */
    public boolean doesNotRequirePersistence() {
      return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).doesNotRequirePersistence();
    }
    
    public entity.KeyableBean downcast(gw.entity.IEntityType newSubtype) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).downcast(newSubtype);
    }
    
    public java.util.List generateInsertEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateInsertEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateInsertEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateInsertEventsInternal();
    }
    
    public java.util.List generateRemoveEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateRemoveEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateRemoveEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateRemoveEventsInternal();
    }
    
    public java.util.List generateUpdateEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).generateUpdateEvents();
    }
    
    public java.util.List<com.guidewire.pl.system.integration.messaging.events.EventDescriptor> generateUpdateEventsInternal() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).generateUpdateEventsInternal();
    }
    
    /**
     * Gets the value of the ArchivePartition field.
     * Unique number to partition the data so that the multiple workers can work independently
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getArchivePartition() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(ARCHIVEPARTITION_PROP.get());
    }
    
    /**
     * Gets the value of the Author field.
     * Name of the person who created the document.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAuthor() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AUTHOR_PROP.get());
    }
    
    /**
     * Gets the value of the AuthorDenorm field.
     * denorm field for Author
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getAuthorDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(AUTHORDENORM_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Integer getBeanVersion() {
      return ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).getBeanVersion();
    }
    
    /**
     * Gets the value of the Claim field.
     * Associated claim.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Claim getClaim() {
      return (entity.Claim)__getInternalInterface().getFieldValue(CLAIM_PROP.get());
    }
    
    /**
     * Gets the value of the ClaimContact field.
     * Associated claim contact. Note that only one of Exposure, Matter, and ClaimContact may be set.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ClaimContact getClaimContact() {
      return (entity.ClaimContact)__getInternalInterface().getFieldValue(CLAIMCONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimContactID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIMCONTACT_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getClaimID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CLAIM_PROP.get());
    }
    
    public entity.Contact getClaimant() {
      return ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).getClaimant();
    }
    
    public gw.pl.persistence.core.Key getClaimantID() {
      return ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).getClaimantID();
    }
    
    /**
     * Gets the value of the CreateTime field.
     * Timestamp when the object was created
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getCreateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(CREATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the CreateUser field.
     * User who created the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getCreateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(CREATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getCreateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(CREATEUSER_PROP.get());
    }
    
    /**
     * Gets the value of the DateCreated field.
     * Date and time the document was created.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateCreated() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATECREATED_PROP.get());
    }
    
    /**
     * Gets the value of the DateModified field.
     * Date and time the document was last modified.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getDateModified() {
      return (java.util.Date)__getInternalInterface().getFieldValue(DATEMODIFIED_PROP.get());
    }
    
    /**
     * Gets the value of the Description field.
     * Description of the document.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDescription() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DESCRIPTION_PROP.get());
    }
    
    /**
     * Gets the value of the DocUID field.
     * The Unique Identifier (UID) for this document.     The format of this UID is specific to the deployed Document Management System (DMS), and is passed to the configured IDocumentContentSource implementation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDocUID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUID_PROP.get());
    }
    
    /**
     * Gets the value of the DocumentIdentifier field.
     * Short human-readable identifier for the document, often used as an extra storage location for form codes, when name and documenttype are inadequate.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDocumentIdentifier() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUMENTIDENTIFIER_PROP.get());
    }
    
    /**
     * Gets the value of the DocumentIdentifierDenorm field.
     * denorm field for DocumentIdentifier
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getDocumentIdentifierDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(DOCUMENTIDENTIFIERDENORM_PROP.get());
    }
    
    /**
     * Gets the language in which the document was created in.  A null value means
     * that it is not clear which language the document was created in.  Most possibly,
     * it is the default locale of the application.
     * @return language
     */
    public gw.i18n.ILocale getDocumentLanguage() {
      return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).getDocumentLanguage();
    }
    
    /**
     * Gets the value of the ECFStatus field.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.ECFDocumentStatus_Ext getECFStatus() {
      return (typekey.ECFDocumentStatus_Ext)__getInternalInterface().getFieldValue(ECFSTATUS_PROP.get());
    }
    
    public com.guidewire.pl.system.entity.BeanEvent[] getEvents() {
      return ((com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods")).getEvents();
    }
    
    /**
     * Gets the value of the Exposure field.
     * Associated exposure. Note that only one of Exposure, Matter, and ClaimContact may be set.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Exposure getExposure() {
      return (entity.Exposure)__getInternalInterface().getFieldValue(EXPOSURE_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getExposureID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(EXPOSURE_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public gw.pl.persistence.core.Key getID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getID();
    }
    
    /**
     * Gets the value of the IMRDocumentId field.
     * The UUID provided by the IMR Service
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getIMRDocumentId() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMRDOCUMENTID_PROP.get());
    }
    
    /**
     * Gets the value of the IMRDocumentType field.
     * The IMR Document Type.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getIMRDocumentType() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMRDOCUMENTTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the IMRDocumentVersion field.
     * The IMR Document Version.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getIMRDocumentVersion() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMRDOCUMENTVERSION_PROP.get());
    }
    
    /**
     * Gets the value of the IMRDocumentVersionDtTime field.
     * The DateTime of the IMR Document Version.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getIMRDocumentVersionDtTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(IMRDOCUMENTVERSIONDTTIME_PROP.get());
    }
    
    /**
     * Gets the value of the IMRFileSizeNum field.
     * The File Size Number of the IMR Document.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.math.BigDecimal getIMRFileSizeNum() {
      return (java.math.BigDecimal)__getInternalInterface().getFieldValue(IMRFILESIZENUM_PROP.get());
    }
    
    /**
     * Gets the value of the IMRFileSizeUnit field.
     * The File Size Unit of the IMR Document.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getIMRFileSizeUnit() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(IMRFILESIZEUNIT_PROP.get());
    }
    
    /**
     * Returns the name of an icon image to represent this document. The result is based on the document's mime type.
     * @return a string identifying an icon for this document
     */
    public java.lang.String getIcon() {
      return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).getIcon();
    }
    
    public gw.pl.persistence.core.Key getIdToSetForForeignKey(gw.entity.ILinkPropertyInfo link) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).getIdToSetForForeignKey(link);
    }
    
    /**
     * Gets the value of the Language field.
     * The language in which this document is created.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.LanguageType getLanguage() {
      return (typekey.LanguageType)__getInternalInterface().getFieldValue(LANGUAGE_PROP.get());
    }
    
    /**
     * Gets the value of the LoadCommandID field.
     * LoadCommand for load where row was created. If not null this object was loaded via the loader.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getLoadCommandID() {
      return (java.lang.Long)__getInternalInterface().getFieldValue(LOADCOMMANDID_PROP.get());
    }
    
    /**
     * Gets the locale in which the document was created in.  A null value means
     * that it is not clear which language the document was created in.  Most possibly,
     * it is the default locale of the application.
     * @return locale
     * @deprecated see getDocumentLanguage() instead
     */
    public gw.i18n.ILocale getLocale() {
      return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).getLocale();
    }
    
    /**
     * Gets the value of the Matter field.
     * Associated matter. Note that only one of Exposure, Matter, and ClaimContact may be set.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.Matter getMatter() {
      return (entity.Matter)__getInternalInterface().getFieldValue(MATTER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getMatterID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(MATTER_PROP.get());
    }
    
    /**
     * Gets the value of the MimeType field.
     * The MIME type of this document; for example, application/msword for a Microsoft Word document.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getMimeType() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(MIMETYPE_PROP.get());
    }
    
    /**
     * Gets the value of the Name field.
     * Human-readable name of the document.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getName() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAME_PROP.get());
    }
    
    /**
     * Gets the value of the NameDenorm field.
     * denorm field for Name
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getNameDenorm() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(NAMEDENORM_PROP.get());
    }
    
    /**
     * Gets the value of the PendingDocUID field.
     * The document is pending, and it's pending storage has Unique Identifier (UID).     The format of this UID is specific to the IDCS implementation.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPendingDocUID() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(PENDINGDOCUID_PROP.get());
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getPublicID() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).getPublicID();
    }
    
    /**
     * Gets the value of the Recipient field.
     * Name of the intended recipient of the document (if any).
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getRecipient() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(RECIPIENT_PROP.get());
    }
    
    public java.util.Set<entity.ServiceRequestDocumentLink> getRelatedServiceRequestDocumentLinks() {
      return ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).getRelatedServiceRequestDocumentLinks();
    }
    
    public java.util.Set<entity.ServiceRequest> getRelatedServiceRequests() {
      return ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).getRelatedServiceRequests();
    }
    
    public gw.pl.persistence.core.Bean getRelatedTo() {
      return ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).getRelatedTo();
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Long getRetiredValue() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).getRetiredValue();
    }
    
    /**
     * Gets the value of the Section field.
     * The section to which this document belongs, if any.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DocumentSection getSection() {
      return (typekey.DocumentSection)__getInternalInterface().getFieldValue(SECTION_PROP.get());
    }
    
    /**
     * Gets the value of the SecurityType field.
     * Type of document used for access-restriction purposes, in conjunction with the information in security-config.xml.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DocumentSecurityType getSecurityType() {
      return (typekey.DocumentSecurityType)__getInternalInterface().getFieldValue(SECURITYTYPE_PROP.get());
    }
    
    /**
     * Gets the value of the ServiceRequestDocumentLinks field.
     * The ServiceRequestDocumentLinks linking ServiceRequests to this Document. This must be empty if any of the other 'related to' fields are set
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.ServiceRequestDocumentLink[] getServiceRequestDocumentLinks() {
      return (entity.ServiceRequestDocumentLink[])__getInternalInterface().getFieldValue(SERVICEREQUESTDOCUMENTLINKS_PROP.get());
    }
    
    /**
     * Gets the value of the Status field.
     * The current status of the document, if any.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DocumentStatusType getStatus() {
      return (typekey.DocumentStatusType)__getInternalInterface().getFieldValue(STATUS_PROP.get());
    }
    
    /**
     * Gets the value of the TR field.
     * The Latest Transaction Reference related to this document.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.String getTR() {
      return (java.lang.String)__getInternalInterface().getFieldValueForCodegen(TR_PROP.get());
    }
    
    /**
     * Gets the value of the Type field.
     * The specific type of the document, if any.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public typekey.DocumentType getType() {
      return (typekey.DocumentType)__getInternalInterface().getFieldValue(TYPE_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateTime field.
     * Timestamp when the object was last updated
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.util.Date getUpdateTime() {
      return (java.util.Date)__getInternalInterface().getFieldValue(UPDATETIME_PROP.get());
    }
    
    /**
     * Gets the value of the UpdateUser field.
     * User who last updated the object
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public entity.User getUpdateUser() {
      return (entity.User)__getInternalInterface().getFieldValue(UPDATEUSER_PROP.get());
    }
    
    public gw.pl.persistence.core.Key getUpdateUserID() {
      return (gw.pl.persistence.core.Key)getRawFieldValue(UPDATEUSER_PROP.get());
    }
    
    public void initInBundle(gw.pl.persistence.core.Key id, gw.pl.persistence.core.Bundle bundle) {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).initInBundle(id, bundle);
    }
    
    /**
     * Returns the the cached status about whether the document content exists in the document content source.
     * On the first call on the entity instance, it will call into document content source plugin to get the status
     * and cache the result for future calls
     * @throws com.guidewire.pl.system.integration.plugins.PluginException if any exception occurs during call to the plugin
     * @return true if the document content exists in the document content source
     */
    public boolean isCachedContentExists() throws com.guidewire.pl.system.integration.plugins.PluginException {
      return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).isCachedContentExists();
    }
    
    /**
     * Gets the value of the DMS field.
     * Whether this document has content stored in a Document Management System.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isDMS() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(DMS_PROP.get());
    }
    
    /**
     * Gets the value of the IMRInheritIndicator field.
     * The IMR Document Inherit Indicator.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isIMRInheritIndicator() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(IMRINHERITINDICATOR_PROP.get());
    }
    
    /**
     * Gets the value of the Inbound field.
     * Whether the document is an inbound, outbound, or stationary (null) document
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isInbound() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(INBOUND_PROP.get());
    }
    
    /**
     * 
     * @return true if this bean is to be inserted into the database when the bundle is committed.
     */
    public boolean isNew() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).isNew();
    }
    
    /**
     * 
     * @return True if the object was created by importation from an external system,
     *         False if it was created internally. Note that this refers to the currently
     *         instantiated object, not the data it represents
     */
    public boolean isNewlyImported() {
      return ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).isNewlyImported();
    }
    
    /**
     * Gets the value of the Obsolete field.
     * If true, the information in the document can no longer be relied upon to be up-to-date and relevant. This is often used instead of deletion to preserve history.
     */
    @gw.internal.gosu.parser.ExtendedProperty
    public java.lang.Boolean isObsolete() {
      return (java.lang.Boolean)__getInternalInterface().getFieldValue(OBSOLETE_PROP.get());
    }
    
    public boolean isOkToRetire() {
      return ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).isOkToRetire();
    }
    
    /**
     * 
     * @return True if the object has been retired from active use, false if the
     *         object is active.  Retireable objects are never deleted from a
     *         database table, instead they are retired by setting the retired
     *         column to the same value as the ID of the object.
     */
    public java.lang.Boolean isRetired() {
      return ((com.guidewire.pl.domain.persistence.core.RetireablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods")).isRetired();
    }
    
    /**
     * If true, the document metadata is stored in an IDMS
     * @return true if the document metadata came from an IDMS
     */
    public boolean isRetrievedFromIDMS() {
      return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).isRetrievedFromIDMS();
    }
    
    public boolean isTemporary() {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).isTemporary();
    }
    
    public entity.KeyableBean overrideBundleAdd(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleAdd(bundle);
    }
    
    public entity.KeyableBean overrideBundleRemove(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).overrideBundleRemove(bundle);
    }
    
    public void putInBundle() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).putInBundle();
    }
    
    /**
     * Refreshes this bean with the latest database version.
     * <p/>
     * This method does nothing if the bean is edited or inserted in its current bundle. If the bean
     * no longer exists in the database, then <tt>null</tt> is returned. If the bean has been
     * evicted from its bundle, then <tt>null</tt> is returned. Otherwise, this bean is returned, with its contents
     * updated.
     */
    public entity.KeyableBean refresh() {
      return ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).refresh();
    }
    
    public entity.KeyableBean reload(gw.pl.persistence.core.Bundle bundle) {
      return ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).reload(bundle);
    }
    
    /**
     * Marks this bean for remove. A bean marked for remove will be deleted or retired when the transaction
     * is committed. Once a bean is marked for remove, it cannot be switched to update, edit, or read.
     * <p>
     * WARNING: This method is designed for simple custom entities which are normally not
     * associated with other entities. Undesirable results may occur when used on out-of-box entities.
     */
    public void remove() {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).remove();
    }
    
    /**
     * Removes the given element from the ServiceRequestDocumentLinks array. This is achieved by marking the element for removal.
     */
    public void removeFromServiceRequestDocumentLinks(entity.ServiceRequestDocumentLink element) {
      __getInternalInterface().removeArrayElement(SERVICEREQUESTDOCUMENTLINKS_PROP.get(), element);
    }
    
    /**
     * Removes the given element from the ServiceRequestDocumentLinks array. This is achieved by marking the element for removal.
     * @deprecated Please use the version that takes an entity instead.
     */
    @java.lang.Deprecated
    public void removeFromServiceRequestDocumentLinks(gw.pl.persistence.core.Key elementID) {
      __getInternalInterface().removeArrayElement(SERVICEREQUESTDOCUMENTLINKS_PROP.get(), elementID);
    }
    
    public void removeOrphanedDocumentFromDocumentSource() throws com.guidewire.pl.system.integration.plugins.PluginException {
      ((com.guidewire.pl.domain.document.impl.DocumentInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.impl.DocumentInternalMethods")).removeOrphanedDocumentFromDocumentSource();
    }
    
    public void removed() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).removed();
    }
    
    /**
     * Whether this document has been flagged to require saving.  I.e., the document was
     * retrieved from the DMS, but was changed so needs to be written out.  Note that when retrieved
     * it will be flagged as non persisting, and as far as the entity system is concerned initial save.
     * @return requires persisting only to DMS
     */
    public boolean requiresSavingToDMS() {
      return ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).requiresSavingToDMS();
    }
    
    /**
     * Sets the value of the ArchivePartition field.
     */
    public void setArchivePartition(java.lang.Long value) {
      __getInternalInterface().setFieldValue(ARCHIVEPARTITION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Author field.
     */
    public void setAuthor(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(AUTHOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the AuthorDenorm field.
     */
    public void setAuthorDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(AUTHORDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the BeanVersion field.
     */
    public void setBeanVersion(java.lang.Integer value) {
      __getInternalInterface().setFieldValue(BEANVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Claim field.
     */
    public void setClaim(entity.Claim value) {
      __getInternalInterface().setFieldValue(CLAIM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ClaimContact field.
     */
    public void setClaimContact(entity.ClaimContact value) {
      __getInternalInterface().setFieldValue(CLAIMCONTACT_PROP.get(), value);
    }
    
    public void setClaimContactID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIMCONTACT_PROP.get(), value);
    }
    
    public void setClaimID(gw.pl.persistence.core.Key value) {
      setFieldValue(CLAIM_PROP.get(), value);
    }
    
    public void setClaimant(entity.Contact value) {
      ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).setClaimant(value);
    }
    
    public void setClaimantID(gw.pl.persistence.core.Key value) {
      ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).setClaimantID(value);
    }
    
    /**
     * Sets the value of the CreateTime field.
     */
    public void setCreateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(CREATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the CreateUser field.
     */
    public void setCreateUser(entity.User value) {
      __getInternalInterface().setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    public void setCreateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(CREATEUSER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DMS field.
     */
    public void setDMS(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(DMS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateCreated field.
     */
    public void setDateCreated(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATECREATED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DateModified field.
     */
    public void setDateModified(java.util.Date value) {
      __getInternalInterface().setFieldValue(DATEMODIFIED_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Description field.
     */
    public void setDescription(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DESCRIPTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DocUID field.
     */
    public void setDocUID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DOCUID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DocumentIdentifier field.
     */
    public void setDocumentIdentifier(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DOCUMENTIDENTIFIER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the DocumentIdentifierDenorm field.
     */
    public void setDocumentIdentifierDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(DOCUMENTIDENTIFIERDENORM_PROP.get(), value);
    }
    
    /**
     * Sets the language in which the document is created in.  This should not be changed once the
     * document is stored
     * @param language the the language
     */
    public void setDocumentLanguage(gw.i18n.ILocale language) {
      ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setDocumentLanguage(language);
    }
    
    public void setDocumentWebFileInfo(com.guidewire.pl.web.document.DocumentWebFileInfo fileInfo) {
      ((com.guidewire.pl.domain.document.impl.DocumentInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.impl.DocumentInternalMethods")).setDocumentWebFileInfo(fileInfo);
    }
    
    /**
     * Sets the value of the ECFStatus field.
     */
    public void setECFStatus(typekey.ECFDocumentStatus_Ext value) {
      __getInternalInterface().setFieldValue(ECFSTATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Exposure field.
     */
    public void setExposure(entity.Exposure value) {
      __getInternalInterface().setFieldValue(EXPOSURE_PROP.get(), value);
    }
    
    public void setExposureID(gw.pl.persistence.core.Key value) {
      setFieldValue(EXPOSURE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the ID field.
     */
    public void setID(gw.pl.persistence.core.Key value) {
      __getInternalInterface().setFieldValue(ID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IMRDocumentId field.
     */
    public void setIMRDocumentId(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(IMRDOCUMENTID_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IMRDocumentType field.
     */
    public void setIMRDocumentType(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(IMRDOCUMENTTYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IMRDocumentVersion field.
     */
    public void setIMRDocumentVersion(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(IMRDOCUMENTVERSION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IMRDocumentVersionDtTime field.
     */
    public void setIMRDocumentVersionDtTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(IMRDOCUMENTVERSIONDTTIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IMRFileSizeNum field.
     */
    public void setIMRFileSizeNum(java.math.BigDecimal value) {
      __getInternalInterface().setFieldValue(IMRFILESIZENUM_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IMRFileSizeUnit field.
     */
    public void setIMRFileSizeUnit(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(IMRFILESIZEUNIT_PROP.get(), value);
    }
    
    /**
     * Sets the value of the IMRInheritIndicator field.
     */
    public void setIMRInheritIndicator(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(IMRINHERITINDICATOR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Inbound field.
     */
    public void setInbound(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(INBOUND_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Language field.
     */
    public void setLanguage(typekey.LanguageType value) {
      __getInternalInterface().setFieldValue(LANGUAGE_PROP.get(), value);
    }
    
    public void setLazyLoadedRow() {
      ((com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods")).setLazyLoadedRow();
    }
    
    /**
     * Sets the value of the LoadCommandID field.
     */
    public void setLoadCommandID(java.lang.Long value) {
      __getInternalInterface().setFieldValue(LOADCOMMANDID_PROP.get(), value);
    }
    
    /**
     * Sets the locale in which the document is created in.  This should not be changed once the
     * document is stored
     * @param locale the locale
     * @deprecated use set language instead
     */
    public void setLocale(gw.i18n.ILocale locale) {
      ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setLocale(locale);
    }
    
    /**
     * Sets the value of the Matter field.
     */
    public void setMatter(entity.Matter value) {
      __getInternalInterface().setFieldValue(MATTER_PROP.get(), value);
    }
    
    public void setMatterID(gw.pl.persistence.core.Key value) {
      setFieldValue(MATTER_PROP.get(), value);
    }
    
    /**
     * Sets the value of the MimeType field.
     */
    public void setMimeType(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(MIMETYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Name field.
     */
    public void setName(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the NameDenorm field.
     */
    public void setNameDenorm(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(NAMEDENORM_PROP.get(), value);
    }
    
    /**
     * Set a flag denoting that the currently instantiated object has been newly imported from
     * an external source
     * @param newlyImported 
     */
    public void setNewlyImported(boolean newlyImported) {
      ((com.guidewire.commons.entity.Sourceable)__getDelegateManager().getImplementation("com.guidewire.commons.entity.Sourceable")).setNewlyImported(newlyImported);
    }
    
    /**
     * Sets the value of the Obsolete field.
     */
    public void setObsolete(java.lang.Boolean value) {
      __getInternalInterface().setFieldValue(OBSOLETE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the PendingDocUID field.
     */
    public void setPendingDocUID(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(PENDINGDOCUID_PROP.get(), value);
    }
    
    public void setPersistedByDocumentSource(boolean persisted) {
      ((com.guidewire.pl.domain.document.impl.DocumentInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.impl.DocumentInternalMethods")).setPersistedByDocumentSource(persisted);
    }
    
    /**
     * 
     * @param persisted when false (default is true), the document will not be persisted
     * This needs to be visible to rules so that certain utilities which interact with
     * IDocumentProduction implementations can set it so that things work correctly
     */
    public void setPersistenceRequired(boolean persisted) {
      ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setPersistenceRequired(persisted);
    }
    
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setPublicID(java.lang.String id) {
      ((com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods")).setPublicID(id);
    }
    
    /**
     * Sets the value of the Recipient field.
     */
    public void setRecipient(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(RECIPIENT_PROP.get(), value);
    }
    
    public void setRelatedTo(gw.pl.persistence.core.Bean relatedTo) {
      ((com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods)__getDelegateManager().getImplementation("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods")).setRelatedTo(relatedTo);
    }
    
    /**
     * Whether this document has been flagged to require saving.  I.e., the document was
     * retrieved from the DMS, but was changed so needs to be written out.  Note that when retrieved
     * it will be flagged as non persisting, and as far as the entity system is concerned initial save.
     * @param value whether this document requires persisting to DMS
     */
    public void setRequiresSavingToDMS(boolean value) {
      ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setRequiresSavingToDMS(value);
    }
    
    public void setRetired() {
      ((com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods")).setRetired();
    }
    
    /**
     * Sets the value of the RetiredValue field.
     */
    public void setRetiredValue(java.lang.Long value) {
      __getInternalInterface().setFieldValue(RETIREDVALUE_PROP.get(), value);
    }
    
    /**
     * Marks the document as having its metadata retrieved from an IDMS
     * Also marks the document as initially not requiring persistence.
     */
    public void setRetrievedFromIDMS() {
      ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setRetrievedFromIDMS();
    }
    
    /**
     * Sets the value of the Section field.
     */
    public void setSection(typekey.DocumentSection value) {
      __getInternalInterface().setFieldValue(SECTION_PROP.get(), value);
    }
    
    /**
     * Sets the value of the SecurityType field.
     * @param value 
     */
    @com.guidewire.pl.persistence.codegen.annotation.OverridesAccessor
    public void setSecurityType(typekey.DocumentSecurityType value) {
      ((com.guidewire.pl.domain.document.DocumentPublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.DocumentPublicMethods")).setSecurityType(value);
    }
    
    /**
     * Sets the value of the ServiceRequestDocumentLinks field.
     */
    public void setServiceRequestDocumentLinks(entity.ServiceRequestDocumentLink[] value) {
      __getInternalInterface().setFieldValue(SERVICEREQUESTDOCUMENTLINKS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Status field.
     */
    public void setStatus(typekey.DocumentStatusType value) {
      __getInternalInterface().setFieldValue(STATUS_PROP.get(), value);
    }
    
    /**
     * Sets the value of the TR field.
     */
    public void setTR(java.lang.String value) {
      __getInternalInterface().setFieldValueForCodegen(TR_PROP.get(), value);
    }
    
    /**
     * Sets the value of the Type field.
     */
    public void setType(typekey.DocumentType value) {
      __getInternalInterface().setFieldValue(TYPE_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateTime field.
     */
    public void setUpdateTime(java.util.Date value) {
      __getInternalInterface().setFieldValue(UPDATETIME_PROP.get(), value);
    }
    
    /**
     * Sets the value of the UpdateUser field.
     */
    public void setUpdateUser(entity.User value) {
      __getInternalInterface().setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    public void setUpdateUserID(gw.pl.persistence.core.Key value) {
      setFieldValue(UPDATEUSER_PROP.get(), value);
    }
    
    /**
     * Set's the version of the bean to the next value (i.e. the bean version original value+1)
     * Multiple calls to this method on the same bean will result in the same value being used
     * for the version (i.e. it is idempotent).
     * 
     * Calling this method will force the bean to be written to the database and participate fully
     * in the commit cycle e.g. pre-update rules will be run, etc.
     */
    public void touch() {
      ((com.guidewire.pl.domain.persistence.core.VersionablePublicMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods")).touch();
    }
    
    public boolean updateDocumentInDocumentSource(java.io.InputStream inputStream) throws com.guidewire.pl.system.integration.plugins.PluginException {
      return ((com.guidewire.pl.domain.document.impl.DocumentInternalMethods)__getDelegateManager().getImplementation("com.guidewire.pl.domain.document.impl.DocumentInternalMethods")).updateDocumentInDocumentSource(inputStream);
    }
    
    
  }
  
  static {
    java.util.HashMap<java.lang.String, java.lang.String> config = new java.util.HashMap<java.lang.String, java.lang.String>();
    config.put("com.guidewire.cc.domain.document.impl.DocumentCoreExtInternalMethods", "com.guidewire.cc.domain.document.impl.DocumentCoreExtMethodsImpl");
    config.put("com.guidewire.cc.domain.document.impl.DocumentCoreExtMethods", "com.guidewire.cc.domain.document.impl.DocumentCoreExtMethodsImpl");
    config.put("com.guidewire.commons.entity.Keyable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.commons.entity.Sourceable", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.document.DocumentPublicMethods", "com.guidewire.pl.domain.document.impl.DocumentImpl");
    config.put("com.guidewire.pl.domain.document.impl.DocumentInternalMethods", "com.guidewire.pl.domain.document.impl.DocumentImpl");
    config.put("com.guidewire.pl.domain.messaging.EventAwarePublicMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.messaging.impl.EventAwareInternalMethods", "com.guidewire.pl.domain.messaging.impl.EventAwareImpl");
    config.put("com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.RetireablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.VersionablePublicMethods", "com.guidewire.pl.system.entity.proxy.AbstractVersionableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.BeanInternal", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.KeyableBeanInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractKeyableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.RetireableInternalMethods", "com.guidewire.pl.system.entity.proxy.AbstractEditableRetireableBeanProxy");
    config.put("com.guidewire.pl.domain.persistence.core.impl.VersionableInternal", "com.guidewire.pl.system.entity.proxy.AbstractEditableBeanProxy");
    config.put("com.guidewire.pl.persistence.core.BeanMethods", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("com.guidewire.pl.system.bundle.CommitCallback", "com.guidewire.pl.domain.document.impl.DocumentImpl");
    config.put("com.guidewire.pl.system.bundle.InsertCallback", "com.guidewire.pl.domain.document.impl.DocumentImpl");
    config.put("com.guidewire.pl.system.bundle.RemoveCallback", "com.guidewire.pl.domain.document.impl.DocumentImpl");
    config.put("com.guidewire.pl.system.bundle.UpdateCallback", "com.guidewire.pl.domain.document.impl.DocumentImpl");
    config.put("gw.pl.persistence.core.Bean", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("gw.pl.persistence.core.BundleProvider", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    config.put("java.lang.Comparable", "com.guidewire.pl.system.entity.proxy.BeanProxy");
    DELEGATE_MAP  =  com.guidewire.pl.persistence.code.DelegateMap.newInstance(entity.Document.class, config);
    com.guidewire._generated.entity.DocumentInternalAccess.FRIEND_ACCESSOR.init(new com.guidewire.pl.persistence.code.InstantiableEntityFriendAccess<entity.Document, com.guidewire._generated.entity.DocumentInternal>() {
      public java.lang.Object getImplementation(entity.Document bean, java.lang.String interfaceName) {
        return bean.__getDelegateManager().getImplementation(interfaceName);
      }
      
      public com.guidewire._generated.entity.DocumentInternal getInternalInterface(entity.Document bean) {
        if(bean == null) {
          return null;
        };
        return bean.__getInternalInterface();
      }
      
      public entity.Document newEmptyInstance() {
        return new entity.Document((java.lang.Void)null);
      }
      
      public void validateImplementations() {
        DELEGATE_MAP.validateImplementations();
      }
      
      
    });
  }
}