package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link DocumentDTO} is a DTO that represents an instance of {@link entity.Document} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.Document}.
 * <p>None of these methods constrain how an instance of DocumentDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the DocumentDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link DocumentDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>Author</td><td>Document.Author</td></tr><tr><td>ClaimContactPublicID</td><td>Document.ClaimContact.PublicID</td></tr><tr><td>ClaimPublicID</td><td>Document.Claim.PublicID</td></tr><tr><td>CreateTime</td><td>Document.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Document.CreateUser.PublicID</td></tr><tr><td>DateCreated</td><td>Document.DateCreated</td></tr><tr><td>DateModified</td><td>Document.DateModified</td></tr><tr><td>Description</td><td>Document.Description</td></tr><tr><td>DMS</td><td>Document.DMS</td></tr><tr><td>DocUID</td><td>Document.DocUID</td></tr><tr><td>DocumentIdentifier</td><td>Document.DocumentIdentifier</td></tr><tr><td>ExposurePublicID</td><td>Document.Exposure.PublicID</td></tr><tr><td>Inbound</td><td>Document.Inbound</td></tr><tr><td>Language</td><td>Document.Language</td></tr><tr><td>MatterPublicID</td><td>Document.Matter.PublicID</td></tr><tr><td>MimeType</td><td>Document.MimeType</td></tr><tr><td>Name</td><td>Document.Name</td></tr><tr><td>Obsolete</td><td>Document.Obsolete</td></tr><tr><td>PublicID</td><td>Document.PublicID</td></tr><tr><td>Recipient</td><td>Document.Recipient</td></tr><tr><td>Section</td><td>Document.Section</td></tr><tr><td>SecurityType</td><td>Document.SecurityType</td></tr><tr><td>Status</td><td>Document.Status</td></tr><tr><td>Type</td><td>Document.Type</td></tr><tr><td>UpdateTime</td><td>Document.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Document.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/DocumentDTO")
final class DocumentDTO {
  var _author               : String               as Author
  /** Derived from Document#ClaimContact.PublicID */
  var _claimContactPublicID : String               as ClaimContactPublicID
  /** Derived from Document#Claim.PublicID */
  var _claimPublicID        : String               as ClaimPublicID
  var _createTime           : Date                 as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID   : String               as CreateUserPublicID
  var _dateCreated          : Date                 as DateCreated
  var _dateModified         : Date                 as DateModified
  var _description          : String               as Description
  var _DMS                  : Boolean              as DMS
  var _docUID               : String               as DocUID
  var _documentIdentifier   : String               as DocumentIdentifier
  /** Derived from Document#Exposure.PublicID */
  var _exposurePublicID     : String               as ExposurePublicID
  var _inbound              : Boolean              as Inbound
  var _language             : LanguageType         as Language
  /** Derived from Document#Matter.PublicID */
  var _matterPublicID       : String               as MatterPublicID
  var _mimeType             : String               as MimeType
  var _name                 : String               as Name
  var _obsolete             : Boolean              as Obsolete
  var _publicID             : String               as PublicID
  var _recipient            : String               as Recipient
  var _section              : DocumentSection      as Section
  var _securityType         : DocumentSecurityType as SecurityType
  var _status               : DocumentStatusType   as Status
  var _type                 : DocumentType         as Type
  var _updateTime           : Date                 as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID   : String               as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Document
   * @param that The Document to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Document) {
    // if field is on base class
      _createTime           = that.CreateTime
      _createUserPublicID   = that.CreateUser.PublicID
      _updateTime           = that.UpdateTime
      _updateUserPublicID   = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied Document
   * @param that The Document to copy from.
   */
  final function readFrom(that : Document) : DocumentDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      Author                = that.Author
      ClaimContactPublicID  = that.ClaimContact.PublicID
      ClaimPublicID         = that.Claim.PublicID
      DMS                   = that.DMS
      DateCreated           = that.DateCreated
      DateModified          = that.DateModified
      Description           = that.Description
      DocUID                = that.DocUID
      DocumentIdentifier    = that.DocumentIdentifier
      ExposurePublicID      = that.Exposure.PublicID
      Inbound               = that.Inbound
      Language              = that.Language
      MatterPublicID        = that.Matter.PublicID
      MimeType              = that.MimeType
      Name                  = that.Name
      Obsolete              = that.Obsolete
      PublicID              = that.PublicID
      Recipient             = that.Recipient
      Section               = that.Section
      SecurityType          = that.SecurityType
      Status                = that.Status
      Type                  = that.Type
    //
    return this
  }

  /**
   * Update the supplied Document using the field values stored in this DTO
   * @param that The Document to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Document, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Document, ignoreNullValues = true) : Document {
    // if field is on base class
      if (Author               != null or !ignoreNullValues) that.Author               = Author
      if (ClaimContactPublicID != null or !ignoreNullValues) that.ClaimContact         = ClaimContact
      if (ClaimPublicID        != null or !ignoreNullValues) that.Claim                = Claim
      if (DMS                  != null or !ignoreNullValues) that.DMS                  = DMS
      if (DateCreated          != null or !ignoreNullValues) that.DateCreated          = DateCreated
      if (DateModified         != null or !ignoreNullValues) that.DateModified         = DateModified
      if (Description          != null or !ignoreNullValues) that.Description          = Description
      if (DocUID               != null or !ignoreNullValues) that.DocUID               = DocUID
      if (DocumentIdentifier   != null or !ignoreNullValues) that.DocumentIdentifier   = DocumentIdentifier
      if (ExposurePublicID     != null or !ignoreNullValues) that.Exposure             = Exposure
      if (Inbound              != null or !ignoreNullValues) that.Inbound              = Inbound
      if (Language             != null or !ignoreNullValues) that.Language             = Language
      if (MatterPublicID       != null or !ignoreNullValues) that.Matter               = Matter
      if (MimeType             != null or !ignoreNullValues) that.MimeType             = MimeType
      if (Name                 != null or !ignoreNullValues) that.Name                 = Name
      if (Obsolete             != null or !ignoreNullValues) that.Obsolete             = Obsolete
      if (PublicID             != null or !ignoreNullValues) that.PublicID             = PublicID
      if (Recipient            != null or !ignoreNullValues) that.Recipient            = Recipient
      if (Section              != null or !ignoreNullValues) that.Section              = Section
      if (SecurityType         != null or !ignoreNullValues) that.SecurityType         = SecurityType
      if (Status               != null or !ignoreNullValues) that.Status               = Status
      if (Type                 != null or !ignoreNullValues) that.Type                 = Type
    //
    return that
  }

  /**
   * Uses the createNew block to create a new Document, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Document.
   * @param createNew (Optional) A block that returns a new instance of Document. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Document, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Document = null, ignoreNullValues = true) : Document {
    var instance : Document
    if (createNew == null) {
      instance = bundle == null
          ? new Document()
          : new Document(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns the {@link ClaimContact} whose PublicID is {@code ClaimContactPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get ClaimContact()      : ClaimContact        { return fetchByPublicID(ClaimContactPublicID) }
  
  /** Convenience property that returns the {@link Claim} whose PublicID is {@code ClaimPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claim()             : Claim               { return fetchByPublicID(ClaimPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()        : User                { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link Exposure} whose PublicID is {@code ExposurePublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Exposure()          : Exposure            { return fetchByPublicID(ExposurePublicID) }
  
  /** Convenience property that returns the {@link Matter} whose PublicID is {@code MatterPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Matter()            : Matter              { return fetchByPublicID(MatterPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()        : User                { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new DocumentDTO that represents the current state of the supplied Document.
   * @param that The Document to be represented.
   */
  static function valueOf(that : Document) : DocumentDTO {
    return new DocumentDTO().readFrom(that)
  }

  /**
   * Returns the Document whose public ID is in the supplied list, or null if the publicID is null.
   * @param publicIDs A list of the PublicIDs.
   */
  private static function fetchByPublicID<T extends KeyableBean>(publicID: String) : T {
    var result : T
    if (publicID != null) {
      result = Query.make(T)
          .compare(T#PublicID, Equals, publicID)
          .select()
          .AtMostOneRow
      if (result == null) throw BadIdentifierException.badPublicId(T, publicID)
    }
    return result
  }

}