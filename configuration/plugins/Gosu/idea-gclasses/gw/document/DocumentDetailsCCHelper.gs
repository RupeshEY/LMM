package gw.document

uses gw.api.system.CCLoggerCategory
uses org.apache.commons.collections.CollectionUtils

uses java.util.Date

/**
 * DocumentDetailsCCHelper
 * A helper object used by PCFs to manipulate collections of Documents as a single group
 * Applications extend the PL base class {@link DocumentDetailsApplicationHelper}
 * Primary use is in Document Detail Views PCFs
 */
@Export
public class DocumentDetailsCCHelper extends DocumentDetailsApplicationHelper {
  private var _relatedToReadOnly : boolean
  private var _relatedToEditableDocLinkPredicate : block(docLInk : ServiceRequestDocumentLink) : boolean

  private var _nameEnabled : boolean
  private var _descriptionEnabled : boolean
  private var _mimeTypeEnabled : boolean
  private var _languageEnabled : boolean
  private var _sectionEnabled : boolean
  private var _relatedToEnabled : boolean
  private var _authorEnabled : boolean
  private var _recipientEnabled : boolean
  private var _inboundEnabled : boolean
  private var _statusEnabled : boolean
  private var _securityTypeEnabled : boolean
  private var _typeEnabled : boolean

  private var _savedRelatedBeans : gw.pl.persistence.core.Bean[]

  public construct(document : Document) {
    this({document}, false, null)
  }

  public construct(document : Document, relatedToReadOnly : boolean) {
    this({document}, relatedToReadOnly, null)
  }

  public construct(document : Document, relatedToReadOnly : boolean,
                   relatedToEditableDocLinkPredicate : block(docLink : ServiceRequestDocumentLink) : boolean) {
    this({document}, relatedToReadOnly, relatedToEditableDocLinkPredicate)
  }

  public construct(documents : Document[]) {
    this(documents, false, null)
  }

  public construct(documents : Document[], relatedToReadOnly : boolean) {
    this(documents, relatedToReadOnly, null)
  }

  /**
   * Creates a {@link DocumentDetailsCCHelper} for treating one or more {@link Document Documents} as an aggregate
   * for determining overall properties for use in PCFs
   * @param documents An array of {@link Document Documents} examined by the helper
   * @param relatedToReadOnly Some PCFs will set this flag overriding any specific predicates on
   *                          {@link ServiceRequestDocumentLink DocLinks} when determining if RelatedTo is editable or not
   * @param relatedToEditableDocLinkPredicate Most CC PCFs only require that {@link ServiceRequestDocumentLink#getDateSpecialistNotified() DocLink.DateSpecialistNotified}
   *                                          be null as a requirement for RelatedTo being editable. However,
   *                                          some are more restrictive, e.g., DocumentDetailsPopup requires
   *                                          that DocLink.Unlinkable be true, and override this predicate.
   */
  public construct(documents : Document[], relatedToReadOnly : boolean,
                   relatedToEditableDocLinkPredicate : block(docLink : ServiceRequestDocumentLink) : boolean) {
    super(documents);
    _relatedToReadOnly = relatedToReadOnly
    if (relatedToEditableDocLinkPredicate != null) {
      _relatedToEditableDocLinkPredicate = relatedToEditableDocLinkPredicate
    } else {
      _relatedToEditableDocLinkPredicate = \docLink -> { return docLink.DateSpecialistNotified == null }
    }
  }

  override public property set AllFieldsEnabled(allFieldsEnabled : Boolean) {
    super.AllFieldsEnabled = allFieldsEnabled
    NameEnabled = allFieldsEnabled
    DescriptionEnabled = allFieldsEnabled
    MimeTypeEnabled = allFieldsEnabled
    LanguageEnabled = allFieldsEnabled
    SectionEnabled = allFieldsEnabled
    RelatedToEnabled = allFieldsEnabled
    AuthorEnabled = allFieldsEnabled
    RecipientEnabled = allFieldsEnabled
    InboundEnabled = allFieldsEnabled
    StatusEnabled = allFieldsEnabled
    SecurityTypeEnabled = allFieldsEnabled
    TypeEnabled = allFieldsEnabled
  }

  /**
   * @return whether the Name property is enabled
   */
  public property get NameEnabled() : Boolean {
    return _nameEnabled
  }

  /**
   * Sets whether the Name property is enabled
   * If set to false, all edits to the Name property are reverted
   * @param nameEnabled whether the Name property is editable
   */
  public property set NameEnabled(nameEnabled : Boolean) {
    if (_nameEnabled && !nameEnabled) {
      restoreFields(Document.NAME_PROP.get())
    }
    _nameEnabled = nameEnabled
  }

  /**
   * Returns the value of the 'name' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'name'.
   */
  public property get Name() : String {
    return getFields(Document.NAME_PROP.get()) as String
  }

  /**
   * Sets the value of the 'name' property on all the documents.
   *
   * @param name Value to set for property 'name'.
   */
  public property set Name(name : String) {
    setFields(Document.NAME_PROP.get(), name)
  }

  /**
   * @return whether the Description property is enabled
   */
  public property get DescriptionEnabled() : Boolean {
    return _descriptionEnabled
  }

  /**
   * Sets whether the Description property is enabled
   * If set to false, all edits to the Description property are reverted
   * @param descriptionEnabled whether the Description property is editable
   */
  public property set DescriptionEnabled(descriptionEnabled : Boolean) {
    if (_descriptionEnabled && !descriptionEnabled) {
      restoreFields(Document.DESCRIPTION_PROP.get())
    }
    _descriptionEnabled = descriptionEnabled
  }

  /**
   * Returns the value of the 'description' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'description'.
   */
  public property get Description() : String {
    return getFields(Document.DESCRIPTION_PROP.get()) as String
  }

  /**
   * Sets the value of the 'description' property on all the documents.
   *
   * @param description Value to set for property 'description'.
   */
  public property set Description(description : String) {
    setFields(Document.DESCRIPTION_PROP.get(), description)
  }

  /**
   * Returns whether the MimeType field should be visible
   * This checks the DMS field on all of the current Documents,
   * if all of them are true, the MimeType field will be shown.
   * Otherwise, the MimeType field will be hidden.
   *
   * Since multiple documents only applies to the Multi-file
   * upload page, we should never have a mix of DMS == true and
   * DMS == false in one set.
   *
   * @Return whether the MimeType field should be visible
   */
  public property get ShowMimeType() : boolean {
    return getFields(Document.DMS_PROP.get()) as Boolean == Boolean.TRUE
  }

  /**
   * @return whether the MimeType property is enabled
   */
  public property get MimeTypeEnabled() : Boolean {
    return _mimeTypeEnabled
  }

  /**
   * Sets whether the MimeType property is enabled
   * If set to false, all edits to the MimeType property are reverted
   * @param mimeTypeEnabled whether the MimeType property is editable
   */
  public property set MimeTypeEnabled(mimeTypeEnabled : Boolean) {
    if (_mimeTypeEnabled && !mimeTypeEnabled) {
      restoreFields(Document.MIMETYPE_PROP.get())
    }
    _mimeTypeEnabled = mimeTypeEnabled
  }

  /**
   * Returns the value of the 'mimeType' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'mimeType'.
   */
  public property get MimeType() : String {
    return getFields(Document.MIMETYPE_PROP.get()) as String
  }

  /**
   * Sets the value of the 'mimeType' property on all the documents.
   *
   * @param mimeType Value to set for property 'mimeType'.
   */
  public property set MimeType(mimeType : String) {
    setFields(Document.MIMETYPE_PROP.get(), mimeType)
  }

  /**
   * @return whether the Language property is enabled
   */
  public property get LanguageEnabled() : Boolean {
    return _languageEnabled
  }

  /**
   * Sets whether the Language property is enabled
   * If set to false, all edits to the Language property are reverted
   * @param languageEnabled whether the Language property is editable
   */
  public property set LanguageEnabled(languageEnabled : Boolean) {
    if (_languageEnabled && !languageEnabled) {
      restoreFields(Document.LANGUAGE_PROP.get())
    }
    _languageEnabled = languageEnabled
  }

  /**
   * Returns the value of the 'language' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'language'.
   */
  public property get Language() : LanguageType {
    return (getFields(Document.LANGUAGE_PROP.get())) as LanguageType
  }

  /**
   * Sets the value of the 'language' property on all the documents.
   *
   * @param language Value to set for property 'language'.
   */
  public property set Language(language : LanguageType) {
    setFields(Document.LANGUAGE_PROP.get(), language)
  }

  /**
   * @return whether the Section property is enabled
   */
  public property get SectionEnabled() : Boolean {
    return _sectionEnabled
  }

  /**
   * Sets whether the Section property is enabled
   * If set to false, all edits to the Section property are reverted
   * @param sectionEnabled whether the Section property is editable
   */
  public property set SectionEnabled(sectionEnabled : Boolean) {
    if (_sectionEnabled && !sectionEnabled) {
      restoreFields(Document.SECTION_PROP.get())
    }
    _sectionEnabled = sectionEnabled
  }

  /**
   * Returns the value of the 'section' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'section'.
   */
  public property get Section() : DocumentSection {
    return getFields(Document.SECTION_PROP.get()) as DocumentSection
  }

  /**
   * Sets the value of the 'section' property on all the documents.
   *
   * @param section Value to set for property 'section'.
   */
  public property set Section(section : DocumentSection) {
    setFields(Document.SECTION_PROP.get(), section)
  }

  /**
   * @return whether the RelatedTo property is enabled
   */
  public property get RelatedToEnabled() : Boolean {
    return _relatedToEnabled
  }

  /**
   * Sets whether the RelatedTo property is enabled
   * If set to false, all edits to the RelatedTo property are reverted
   * @param relatedToEnabled whether the RelatedTo property is editable
   */
  public property set RelatedToEnabled(relatedToEnabled : Boolean) {
    if (_relatedToEnabled && !relatedToEnabled) {
      if (_savedRelatedBeans != null) {
        for (var i in 0..|_documents.length) {
          (_documents[i] as Document).RelatedTo = _savedRelatedBeans[i];
        }
      }
    }
    _relatedToEnabled = relatedToEnabled
  }

  /**
   * Returns the value of the 'relatedTo' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'relatedTo'.
   */
  public property get RelatedTo() : gw.pl.persistence.core.Bean {
    if (_documents == null || _documents.length == 0)
      return null;
    var commonRelatedTo = (_documents[0] as Document).RelatedTo
    for (var i in 1..|_documents.length) {
      if (commonRelatedTo != (_documents[i] as Document).RelatedTo)
        return null;
    }
    return commonRelatedTo;
  }

  /**
   * Sets the value of the 'relatedTo' property on all the documents.
   *
   * @param bean Value to set for property 'relatedTo'.
   */
  public property set RelatedTo(bean : gw.pl.persistence.core.Bean) {
    if (_documents != null) {
      var savedBeans : gw.pl.persistence.core.Bean[] = null;
      if (_savedRelatedBeans == null) {
        savedBeans = new gw.pl.persistence.core.Bean[_documents.length];
        _savedRelatedBeans = savedBeans
      }
      for (var i in 0..|_documents.length) {
        if (savedBeans != null) {
          savedBeans[i] = (_documents[i] as Document).RelatedTo
        }
        (_documents[i] as Document).RelatedTo = bean
      }
    }
  }

  /**
   * Returns the value of the 'relatedServiceRequests' property on all the documents.
   * If the values are not the same, null is returned.
   *
   * @return Value for property 'relatedServiceRequests'.
   */
  public property get RelatedServiceRequests() : ServiceRequest[] {
    if (_documents == null || _documents.length == 0)
      return null;
    var commonRelatedServiceRequests = (_documents[0] as Document).RelatedServiceRequests
    for (var i in 1..|_documents.length) {
      var cmpRelatedServiceRequests = (_documents[i] as Document).RelatedServiceRequests;
      if (commonRelatedServiceRequests == null ? cmpRelatedServiceRequests != null :
          cmpRelatedServiceRequests == null ||
              !CollectionUtils.isEqualCollection(commonRelatedServiceRequests,cmpRelatedServiceRequests))
        return null
    }
    return commonRelatedServiceRequests == null || commonRelatedServiceRequests.isEmpty() ? null :
        commonRelatedServiceRequests.toTypedArray()
  }

  /**
   * Whether the RelatedTo property is editable. Returns false
   * if the Document is related to more than one Service or
   * if the DocumentLink is not removable
   * @return whether the RelatedTo property is editable
   */
  public property get RelatedToEditable() : boolean {
    if (_relatedToReadOnly)
      return false;
    var relatedServiceRequests = RelatedServiceRequests
    if (relatedServiceRequests == null || relatedServiceRequests.Count == 0)
      return true
    if (relatedServiceRequests.Count != 1)
      return false
    var relatedServiceRequest = relatedServiceRequests.single();
    for (var document in _documents as Document[]) {
      var docLink = relatedServiceRequest.getMatchingServiceRequestDocumentLink(document)
      if (!_relatedToEditableDocLinkPredicate(docLink))
        return false
    }
    return true
  }

  /**
   * Whether the RelatedTo LV is visible. Returns true
   * if more than one Service is related to the Document
   * @return Whether the RelatedTo LV is visible
   */
  public property get RelatedToVisible() : boolean {
    var relatedServiceRequests = RelatedServiceRequests
    return relatedServiceRequests == null || relatedServiceRequests.Count <= 1
  }


  /**
   * Returns the value of the 'relatedToCandidates' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'relatedToCandidates'.
   */
  public property get RelatedToCandidates() : KeyableBean[] {
    if (_documents == null || _documents.length == 0)
      return null;
    var commonRelatedToCandidates = (_documents[0] as Document).Claim.RelatedToCandidates
    for (var i in 1..|_documents.length) {
      var cmpRelatedToCandidates = (_documents[i] as Document).Claim.RelatedToCandidates
      if (commonRelatedToCandidates == null ? cmpRelatedToCandidates != null :
          cmpRelatedToCandidates == null ||
              !CollectionUtils.isEqualCollection(commonRelatedToCandidates.toList(), cmpRelatedToCandidates.toList()))
        return null;
    }
    return commonRelatedToCandidates;
  }

  /**
   * @return whether the Author property is enabled
   */
  public property get AuthorEnabled() : Boolean {
    return _authorEnabled
  }

  /**
   * Sets whether the Author property is enabled
   * If set to false, all edits to the Author property are reverted
   * @param authorEnabled whether the Author property is editable
   */
  public property set AuthorEnabled(authorEnabled : Boolean) {
    if (_authorEnabled && !authorEnabled) {
      restoreFields(Document.AUTHOR_PROP.get())
    }
    _authorEnabled = authorEnabled
  }

  /**
   * Returns the value of the 'author' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'author'.
   */
  public property get Author() : String {
    return getFields(Document.AUTHOR_PROP.get()) as String
  }

  /**
   * Sets the value of the 'author' property on all the documents.
   *
   * @param author Value to set for property 'author'.
   */
  public property set Author(author : String) {
    setFields(Document.AUTHOR_PROP.get(), author)
  }

  /**
   * @return whether the Recipient property is enabled
   */
  public property get RecipientEnabled() : Boolean {
    return _recipientEnabled
  }

  /**
   * Sets whether the Recipient property is enabled
   * If set to false, all edits to the Recipient property are reverted
   * @param recipientEnabled whether the Recipient property is editable
   */
  public property set RecipientEnabled(recipientEnabled : Boolean) {
    if (_recipientEnabled && !recipientEnabled) {
      restoreFields(Document.RECIPIENT_PROP.get())
    }
    _recipientEnabled = recipientEnabled
  }

  /**
   * Returns the value of the 'recipient' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'recipient'.
   */
  public property get Recipient() : String {
    return getFields(Document.RECIPIENT_PROP.get()) as String
  }

  /**
   * Sets the value of the 'recipient' property on all the documents.
   *
   * @param recipient Value to set for property 'recipient'.
   */
  public property set Recipient(recipient : String) {
    setFields(Document.RECIPIENT_PROP.get(), recipient)
  }

  /**
   * @return whether the Inbound property is enabled
   */
  public property get InboundEnabled() : Boolean {
    return _inboundEnabled
  }

  /**
   * Sets whether the Inbound property is enabled
   * If set to false, all edits to the Inbound property are reverted
   * @param inboundEnabled whether the Inbound property is editable
   */
  public property set InboundEnabled(inboundEnabled : Boolean) {
    if (_inboundEnabled && !inboundEnabled) {
      restoreFields(Document.INBOUND_PROP.get())
    }
    _inboundEnabled = inboundEnabled
  }

  /**
   * Returns the value of the 'inbound' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'inbound'.
   */
  public property get Inbound() : Boolean {
    return getFields(Document.INBOUND_PROP.get()) as Boolean
  }

  /**
   * Sets the value of the 'inbound' property on all the documents.
   *
   * @param inbound Value to set for property 'inbound'.
   */
  public property set Inbound(inbound : Boolean) {
    setFields(Document.INBOUND_PROP.get(), inbound)
  }

  /**
   * @return whether the Status property is enabled
   */
  public property get StatusEnabled() : Boolean {
    return _statusEnabled
  }

  /**
   * Sets whether the Status property is enabled
   * If set to false, all edits to the Status property are reverted
   * @param statusEnabled whether the Status property is editable
   */
  public property set StatusEnabled(statusEnabled : Boolean) {
    if (_statusEnabled && !statusEnabled) {
      restoreFields(Document.STATUS_PROP.get())
    }
    _statusEnabled = statusEnabled
  }

  /**
   * Returns the value of the 'status' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'status'.
   */
  public property get Status() : DocumentStatusType {
    return getFields(Document.STATUS_PROP.get()) as DocumentStatusType
  }

  /**
   * Sets the value of the 'status' property on all the documents.
   *
   * @param status Value to set for property 'status'.
   */
  public property set Status(status : DocumentStatusType) {
    setFields(Document.STATUS_PROP.get(), status)
  }

  /**
   * @return whether the SecurityType property is enabled
   */
  public property get SecurityTypeEnabled() : Boolean {
    return _securityTypeEnabled
  }

  /**
   * Sets whether the SecurityType property is enabled
   * If set to false, all edits to the SecurityType property are reverted
   * @param securityTypeEnabled whether the SecurityType property is editable
   */
  public property set SecurityTypeEnabled(securityTypeEnabled : Boolean) {
    if (_securityTypeEnabled && !securityTypeEnabled) {
      restoreFields(Document.SECURITYTYPE_PROP.get())
    }
    _securityTypeEnabled = securityTypeEnabled
  }

  /**
   * Returns the value of the 'securityType' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'securityType'.
   */
  public property get SecurityType() : DocumentSecurityType {
    return getFields(Document.SECURITYTYPE_PROP.get()) as DocumentSecurityType
  }

  /**
   * Sets the value of the 'securityType' property on all the documents.
   *
   * @param securityType Value to set for property 'securityType'.
   */
  public property set SecurityType(securityType : DocumentSecurityType) {
    setFields(Document.SECURITYTYPE_PROP.get(), securityType)
  }

  /**
   * @return whether the Type property is enabled
   */
  public property get TypeEnabled() : Boolean {
    return _typeEnabled
  }

  /**
   * Sets whether the Type property is enabled
   * If set to false, all edits to the Type property are reverted
   * @param typeEnabled whether the Type property is editable
   */
  public property set TypeEnabled(typeEnabled : Boolean) {
    if (_typeEnabled && !typeEnabled) {
      restoreFields(Document.TYPE_PROP.get())
    }
    _typeEnabled = typeEnabled
  }

  /**
   * Returns the value of the 'type' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'type'.
   */
  public property get Type() : DocumentType {
    return getFields(Document.TYPE_PROP.get()) as DocumentType
  }

  /**
   * Sets the value of the 'type' property on all the documents.
   *
   * @param type Value to set for property 'type'.
   */
  public property set Type(type : DocumentType) {
    setFields(Document.TYPE_PROP.get(), type)
  }

  /**
   * Returns the value of the 'createTime' property on all the documents.
   * If the values are not the same, null is returned.
   * @return Value for property 'createTime'.
   */
  public property get CreateTime() : Date { return getFields(Document.CREATETIME_PROP.get()) as Date }

  /**
   * List of mimetypes configured in the mimetypemapping in config.xml. If the current
   * Document's MimeType is not mapped, the MimeType is added to the list and a message
   * is logged.
   * @return list of mimetypemapping's mimetypes
   */
  function getMimeTypeList(documentMimeType: String) : java.util.List {
    var originalList = gw.document.DocumentsUtilBase.getMimeTypes().copy()

    if (documentMimeType != null and !originalList.contains(documentMimeType)) {
      CCLoggerCategory.DOCUMENT.info("The uploaded document has a Mime Type '" + documentMimeType + "' that is not configured in the application. Please add the Mime Type to the mimetypemapping in the config.xml")
      originalList.add(documentMimeType)
    }

    return originalList

  }
}
