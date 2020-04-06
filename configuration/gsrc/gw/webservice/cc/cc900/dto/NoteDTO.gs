package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link NoteDTO} is a DTO that represents an instance of {@link entity.Note} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.Note}.
 * <p>None of these methods constrain how an instance of NoteDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the NoteDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link NoteDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>ActivityPublicID</td><td>Note.Activity.PublicID</td></tr><tr><td>AuthoringDate</td><td>Note.AuthoringDate</td></tr><tr><td>Body</td><td>Note.Body</td></tr><tr><td>ClaimContactPublicID</td><td>Note.ClaimContact.PublicID</td></tr><tr><td>ClaimPublicID</td><td>Note.Claim.PublicID</td></tr><tr><td>Confidential</td><td>Note.Confidential</td></tr><tr><td>CreateTime</td><td>Note.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Note.CreateUser.PublicID</td></tr><tr><td>ExposurePublicID</td><td>Note.Exposure.PublicID</td></tr><tr><td>Language</td><td>Note.Language</td></tr><tr><td>MatterPublicID</td><td>Note.Matter.PublicID</td></tr><tr><td>PublicID</td><td>Note.PublicID</td></tr><tr><td>SecurityType</td><td>Note.SecurityType</td></tr><tr><td>Subject</td><td>Note.Subject</td></tr><tr><td>Topic</td><td>Note.Topic</td></tr><tr><td>UpdateTime</td><td>Note.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Note.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/NoteDTO")
final class NoteDTO {
  /** Derived from Note#Activity.PublicID */
  var _activityPublicID     : String           as ActivityPublicID
  var _authoringDate        : Date             as AuthoringDate
  var _body                 : String           as Body
  /** Derived from Note#ClaimContact.PublicID */
  var _claimContactPublicID : String           as ClaimContactPublicID
  /** Derived from Note#Claim.PublicID */
  var _claimPublicID        : String           as ClaimPublicID
  var _confidential         : Boolean          as Confidential
  var _createTime           : Date             as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID   : String           as CreateUserPublicID
  /** Derived from Note#Exposure.PublicID */
  var _exposurePublicID     : String           as ExposurePublicID
  var _language             : LanguageType     as Language
  /** Derived from Note#Matter.PublicID */
  var _matterPublicID       : String           as MatterPublicID
  var _publicID             : String           as PublicID
  var _securityType         : NoteSecurityType as SecurityType
  var _subject              : String           as Subject
  var _topic                : NoteTopicType    as Topic
  var _updateTime           : Date             as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID   : String           as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Note
   * @param that The Note to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Note) {
    // if field is on base class
      _createTime           = that.CreateTime
      _createUserPublicID   = that.CreateUser.PublicID
      _updateTime           = that.UpdateTime
      _updateUserPublicID   = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied Note
   * @param that The Note to copy from.
   */
  final function readFrom(that : Note) : NoteDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      ActivityPublicID      = that.Activity.PublicID
      AuthoringDate         = that.AuthoringDate
      Body                  = that.Body
      ClaimContactPublicID  = that.ClaimContact.PublicID
      ClaimPublicID         = that.Claim.PublicID
      Confidential          = that.Confidential
      ExposurePublicID      = that.Exposure.PublicID
      Language              = that.Language
      MatterPublicID        = that.Matter.PublicID
      PublicID              = that.PublicID
      SecurityType          = that.SecurityType
      Subject               = that.Subject
      Topic                 = that.Topic
    //
    return this
  }

  /**
   * Update the supplied Note using the field values stored in this DTO
   * @param that The Note to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Note, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Note, ignoreNullValues = true) : Note {
    // if field is on base class
      if (ActivityPublicID     != null or !ignoreNullValues) that.Activity             = Activity
      if (AuthoringDate        != null or !ignoreNullValues) that.AuthoringDate        = AuthoringDate
      if (Body                 != null or !ignoreNullValues) that.Body                 = Body
      if (ClaimContactPublicID != null or !ignoreNullValues) that.ClaimContact         = ClaimContact
      if (ClaimPublicID        != null or !ignoreNullValues) that.Claim                = Claim
      if (Confidential         != null or !ignoreNullValues) that.Confidential         = Confidential
      if (ExposurePublicID     != null or !ignoreNullValues) that.Exposure             = Exposure
      if (Language             != null or !ignoreNullValues) that.Language             = Language
      if (MatterPublicID       != null or !ignoreNullValues) that.Matter               = Matter
      if (PublicID             != null or !ignoreNullValues) that.PublicID             = PublicID
      if (SecurityType         != null or !ignoreNullValues) that.SecurityType         = SecurityType
      if (Subject              != null or !ignoreNullValues) that.Subject              = Subject
      if (Topic                != null or !ignoreNullValues) that.Topic                = Topic
    //
    return that
  }

  /**
   * Uses the createNew block to create a new Note, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Note.
   * @param createNew (Optional) A block that returns a new instance of Note. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Note, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Note = null, ignoreNullValues = true) : Note {
    var instance : Note
    if (createNew == null) {
      instance = bundle == null
          ? new Note()
          : new Note(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns the {@link Activity} whose PublicID is {@code ActivityPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Activity()          : Activity        { return fetchByPublicID(ActivityPublicID) }
  
  /** Convenience property that returns the {@link ClaimContact} whose PublicID is {@code ClaimContactPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get ClaimContact()      : ClaimContact    { return fetchByPublicID(ClaimContactPublicID) }
  
  /** Convenience property that returns the {@link Claim} whose PublicID is {@code ClaimPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claim()             : Claim           { return fetchByPublicID(ClaimPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()        : User            { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link Exposure} whose PublicID is {@code ExposurePublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Exposure()          : Exposure        { return fetchByPublicID(ExposurePublicID) }
  
  /** Convenience property that returns the {@link Matter} whose PublicID is {@code MatterPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Matter()            : Matter          { return fetchByPublicID(MatterPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()        : User            { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new NoteDTO that represents the current state of the supplied Note.
   * @param that The Note to be represented.
   */
  static function valueOf(that : Note) : NoteDTO {
    return new NoteDTO().readFrom(that)
  }

  /**
   * Returns the Note whose public ID is in the supplied list, or null if the publicID is null.
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