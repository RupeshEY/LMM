package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link ClaimContactDTO} is a DTO that represents an instance of {@link entity.ClaimContact} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.ClaimContact}.
 * <p>None of these methods constrain how an instance of ClaimContactDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the ClaimContactDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link ClaimContactDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>ClaimantFlag</td><td>ClaimContact.ClaimantFlag</td></tr><tr><td>ClaimPublicID</td><td>ClaimContact.Claim.PublicID</td></tr><tr><td>ContactNameDenorm</td><td>ClaimContact.ContactNameDenorm</td></tr><tr><td>ContactProhibited</td><td>ClaimContact.ContactProhibited</td></tr><tr><td>ContactPublicID</td><td>ClaimContact.Contact.PublicID</td></tr><tr><td>CreateTime</td><td>ClaimContact.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>ClaimContact.CreateUser.PublicID</td></tr><tr><td>PersonFirstNameDenorm</td><td>ClaimContact.PersonFirstNameDenorm</td></tr><tr><td>PersonLastNameDenorm</td><td>ClaimContact.PersonLastNameDenorm</td></tr><tr><td>PolicyPublicID</td><td>ClaimContact.Policy.PublicID</td></tr><tr><td>PublicID</td><td>ClaimContact.PublicID</td></tr><tr><td>RolePublicIDs</td><td>ClaimContact.Roles*.PublicID</td></tr><tr><td>UpdateTime</td><td>ClaimContact.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>ClaimContact.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/ClaimContactDTO")
final class ClaimContactDTO {
  var _claimantFlag          : Boolean               as ClaimantFlag
  /** Derived from ClaimContact#Claim.PublicID */
  var _claimPublicID         : String                as ClaimPublicID
  var _contactNameDenorm     : String                as ContactNameDenorm
  var _contactProhibited     : Boolean               as ContactProhibited
  /** Derived from ClaimContact#Contact.PublicID */
  var _contactPublicID       : String                as ContactPublicID
  var _createTime            : Date                  as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID    : String                as CreateUserPublicID
  var _newRoles              : ClaimContactRoleDTO[] as NewRoles = {}
  var _personFirstNameDenorm : String                as PersonFirstNameDenorm
  var _personLastNameDenorm  : String                as PersonLastNameDenorm
  /** Derived from ClaimContact#Policy.PublicID */
  var _policyPublicID        : String                as PolicyPublicID
  var _publicID              : String                as PublicID
  /** Derived from ClaimContact#Roles*.PublicID */
  var _rolePublicIDs         : String[]              as RolePublicIDs = {}
  var _updateTime            : Date                  as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID    : String                as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied ClaimContact
   * @param that The ClaimContact to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : ClaimContact) {
    // if field is on base class
      _contactNameDenorm     = that.ContactNameDenorm
      _createTime            = that.CreateTime
      _createUserPublicID    = that.CreateUser.PublicID
      _personFirstNameDenorm = that.PersonFirstNameDenorm
      _personLastNameDenorm  = that.PersonLastNameDenorm
      _rolePublicIDs         = that.Roles*.PublicID
      _updateTime            = that.UpdateTime
      _updateUserPublicID    = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied ClaimContact
   * @param that The ClaimContact to copy from.
   */
  final function readFrom(that : ClaimContact) : ClaimContactDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      ClaimPublicID          = that.Claim.PublicID
      ClaimantFlag           = that.ClaimantFlag
      ContactProhibited      = that.ContactProhibited
      ContactPublicID        = that.Contact.PublicID
      PolicyPublicID         = that.Policy.PublicID
      PublicID               = that.PublicID
    //
    return this
  }

  /**
   * Update the supplied ClaimContact using the field values stored in this DTO
   * @param that The ClaimContact to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the ClaimContact, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : ClaimContact, ignoreNullValues = true) : ClaimContact {
    // if field is on base class
      if (ClaimPublicID         != null or !ignoreNullValues) that.Claim                 = Claim
      if (ClaimantFlag          != null or !ignoreNullValues) that.ClaimantFlag          = ClaimantFlag
      if (ContactProhibited     != null or !ignoreNullValues) that.ContactProhibited     = ContactProhibited
      if (ContactPublicID       != null or !ignoreNullValues) that.Contact               = Contact
      if (PolicyPublicID        != null or !ignoreNullValues) that.Policy                = Policy
      if (PublicID              != null or !ignoreNullValues) that.PublicID              = PublicID
    //
    return that
  }

  /**
   * Uses the createNew block to create a new ClaimContact, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new ClaimContact.
   * @param createNew (Optional) A block that returns a new instance of ClaimContact. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the ClaimContact, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : ClaimContact = null, ignoreNullValues = true) : ClaimContact {
    var instance : ClaimContact
    if (createNew == null) {
      instance = bundle == null
          ? new ClaimContact()
          : new ClaimContact(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns the {@link Claim} whose PublicID is {@code ClaimPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claim()              : Claim                { return fetchByPublicID(ClaimPublicID) }
  
  /** Convenience property that returns the {@link Contact} whose PublicID is {@code ContactPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Contact()            : Contact              { return fetchByPublicID(ContactPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()         : User                 { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link Policy} whose PublicID is {@code PolicyPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Policy()             : Policy               { return fetchByPublicID(PolicyPublicID) }
  
  /** Convenience property that returns a {@link ClaimContactRole[]} of the objects whose PublicIDs are in {@code RolePublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Roles()              : ClaimContactRole[]   { return fetchByPublicID(RolePublicIDs) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()         : User                 { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new ClaimContactDTO that represents the current state of the supplied ClaimContact.
   * @param that The ClaimContact to be represented.
   */
  static function valueOf(that : ClaimContact) : ClaimContactDTO {
    return new ClaimContactDTO().readFrom(that)
  }

  /**
   * Returns all of the ClaimContact instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
   * @param publicIDs A list of the PublicIDs.
   */
  private static function fetchByPublicID<T extends KeyableBean>(publicIDs: String[]) : T[] {
    var results : T[] = {}
    if (publicIDs.HasElements) {
      results = Query.make(T)
          .compareIn(T#PublicID, publicIDs)
          .select()
          .toTypedArray()
      var badIDs = publicIDs.subtract(results*.PublicID)
      if (badIDs.HasElements) throw BadIdentifierException.badPublicId(T, "{" + badIDs.join(", ") + "}")
    }
    return results
  }

  /**
   * Returns the ClaimContact whose public ID is in the supplied list, or null if the publicID is null.
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