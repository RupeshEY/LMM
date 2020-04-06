package gw.webservice.cc.cc901.dto

uses entity.Contact
uses entity.Incident
uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link ClaimContactRoleDTO} is a DTO that represents an instance of {@link ClaimContactRole} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link ClaimContactRole}.
 * <p>None of these methods constrain how an instance of ClaimContactRoleDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the ClaimContactRoleDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link ClaimContactRoleDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>Active</td><td>ClaimContactRole.Active</td></tr><tr><td>ClaimContactPublicID</td><td>ClaimContactRole.ClaimContact.PublicID</td></tr><tr><td>Comments</td><td>ClaimContactRole.Comments</td></tr><tr><td>ContactPublicID</td><td>ClaimContactRole.Contact.PublicID</td></tr><tr><td>CoveredPartyType</td><td>ClaimContactRole.CoveredPartyType</td></tr><tr><td>CreateTime</td><td>ClaimContactRole.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>ClaimContactRole.CreateUser.PublicID</td></tr><tr><td>EvaluationPublicID</td><td>ClaimContactRole.Evaluation.PublicID</td></tr><tr><td>ExposurePublicID</td><td>ClaimContactRole.Exposure.PublicID</td></tr><tr><td>IncidentPublicID</td><td>ClaimContactRole.Incident.PublicID</td></tr><tr><td>MatterPublicID</td><td>ClaimContactRole.Matter.PublicID</td></tr><tr><td>NegotiationPublicID</td><td>ClaimContactRole.Negotiation.PublicID</td></tr><tr><td>PartyNumber</td><td>ClaimContactRole.PartyNumber</td></tr><tr><td>PolicyPublicID</td><td>ClaimContactRole.Policy.PublicID</td></tr><tr><td>PublicID</td><td>ClaimContactRole.PublicID</td></tr><tr><td>Role</td><td>ClaimContactRole.Role</td></tr><tr><td>UpdateTime</td><td>ClaimContactRole.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>ClaimContactRole.UpdateUser.PublicID</td></tr><tr><td>WitnessPerspective</td><td>ClaimContactRole.WitnessPerspective</td></tr><tr><td>WitnessPosition</td><td>ClaimContactRole.WitnessPosition</td></tr><tr><td>WitnessStatementInd</td><td>ClaimContactRole.WitnessStatementInd</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ClaimContactRoleDTO")
final class ClaimContactRoleDTO {
  var _active               : Boolean          as Active
  /** Derived from ClaimContactRole#ClaimContact.PublicID */
  var _claimContactPublicID : String           as ClaimContactPublicID
  var _comments             : String           as Comments
  /** Derived from ClaimContactRole#Contact.PublicID */
  var _contactPublicID      : String           as ContactPublicID
  var _coveredPartyType     : CoveredPartyType as CoveredPartyType
  var _createTime           : Date             as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID   : String           as CreateUserPublicID
  /** Derived from ClaimContactRole#Evaluation.PublicID */
  var _evaluationPublicID   : String           as EvaluationPublicID
  /** Derived from ClaimContactRole#Exposure.PublicID */
  var _exposurePublicID     : String           as ExposurePublicID
  /** Derived from ClaimContactRole#Incident.PublicID */
  var _incidentPublicID     : String           as IncidentPublicID
  /** Derived from ClaimContactRole#Matter.PublicID */
  var _matterPublicID       : String           as MatterPublicID
  /** Derived from ClaimContactRole#Negotiation.PublicID */
  var _negotiationPublicID  : String           as NegotiationPublicID
  var _partyNumber          : Integer          as PartyNumber
  /** Derived from ClaimContactRole#Policy.PublicID */
  var _policyPublicID       : String           as PolicyPublicID
  var _publicID             : String           as PublicID
  var _role                 : ContactRole      as Role
  var _updateTime           : Date             as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID   : String           as UpdateUserPublicID
  var _witnessPerspective   : String           as WitnessPerspective
  var _witnessPosition      : WitnessPosition  as WitnessPosition
  var _witnessStatementInd  : YesNo            as WitnessStatementInd

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied ClaimContactRole
   * @param that The ClaimContactRole to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : ClaimContactRole) {
    // if field is on base class
      _createTime           = that.CreateTime
      _createUserPublicID   = that.CreateUser.PublicID
      _updateTime           = that.UpdateTime
      _updateUserPublicID   = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied ClaimContactRole
   * @param that The ClaimContactRole to copy from.
   */
  final function readFrom(that : ClaimContactRole) : ClaimContactRoleDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      Active                = that.Active
      ClaimContactPublicID  = that.ClaimContact.PublicID
      Comments              = that.Comments
      ContactPublicID       = that.Contact.PublicID
      CoveredPartyType      = that.CoveredPartyType
      EvaluationPublicID    = that.Evaluation.PublicID
      ExposurePublicID      = that.Exposure.PublicID
      IncidentPublicID      = that.Incident.PublicID
      MatterPublicID        = that.Matter.PublicID
      NegotiationPublicID   = that.Negotiation.PublicID
      PartyNumber           = that.PartyNumber
      PolicyPublicID        = that.Policy.PublicID
      PublicID              = that.PublicID
      Role                  = that.Role
      WitnessPerspective    = that.WitnessPerspective
      WitnessPosition       = that.WitnessPosition
      WitnessStatementInd   = that.WitnessStatementInd
    //
    return this
  }

  /**
   * Update the supplied ClaimContactRole using the field values stored in this DTO
   * @param that The ClaimContactRole to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the ClaimContactRole, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : ClaimContactRole, ignoreNullValues = true) : ClaimContactRole {
    // if field is on base class
      if (Active               != null or !ignoreNullValues) that.Active               = Active
      if (ClaimContactPublicID != null or !ignoreNullValues) that.ClaimContact         = ClaimContact
      if (Comments             != null or !ignoreNullValues) that.Comments             = Comments
      if (ContactPublicID      != null or !ignoreNullValues) that.Contact              = Contact
      if (CoveredPartyType     != null or !ignoreNullValues) that.CoveredPartyType     = CoveredPartyType
      if (EvaluationPublicID   != null or !ignoreNullValues) that.Evaluation           = Evaluation
      if (ExposurePublicID     != null or !ignoreNullValues) that.Exposure             = Exposure
      if (IncidentPublicID     != null or !ignoreNullValues) that.Incident             = Incident
      if (MatterPublicID       != null or !ignoreNullValues) that.Matter               = Matter
      if (NegotiationPublicID  != null or !ignoreNullValues) that.Negotiation          = Negotiation
      if (PartyNumber          != null or !ignoreNullValues) that.PartyNumber          = PartyNumber
      if (PolicyPublicID       != null or !ignoreNullValues) that.Policy               = Policy
      if (PublicID             != null or !ignoreNullValues) that.PublicID             = PublicID
      if (Role                 != null or !ignoreNullValues) that.Role                 = Role
      if (WitnessPerspective   != null or !ignoreNullValues) that.WitnessPerspective   = WitnessPerspective
      if (WitnessPosition      != null or !ignoreNullValues) that.WitnessPosition      = WitnessPosition
      if (WitnessStatementInd  != null or !ignoreNullValues) that.WitnessStatementInd  = WitnessStatementInd
    //
    return that
  }

  /**
   * Uses the createNew block to create a new ClaimContactRole, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new ClaimContactRole.
   * @param createNew (Optional) A block that returns a new instance of ClaimContactRole. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the ClaimContactRole, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : ClaimContactRole = null, ignoreNullValues = true) : ClaimContactRole {
    var instance : ClaimContactRole
    if (createNew == null) {
      instance = bundle == null
          ? new ClaimContactRole()
          : new ClaimContactRole(bundle)
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
  property get ClaimContact()      : ClaimContact    { return fetchByPublicID(ClaimContactPublicID) }
  
  /** Convenience property that returns the {@link Contact} whose PublicID is {@code ContactPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Contact()           : Contact         { return fetchByPublicID(ContactPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()        : User            { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link Evaluation} whose PublicID is {@code EvaluationPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Evaluation()        : Evaluation      { return fetchByPublicID(EvaluationPublicID) }
  
  /** Convenience property that returns the {@link Exposure} whose PublicID is {@code ExposurePublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Exposure()          : Exposure        { return fetchByPublicID(ExposurePublicID) }
  
  /** Convenience property that returns the {@link Incident} whose PublicID is {@code IncidentPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Incident()          : Incident        { return fetchByPublicID(IncidentPublicID) }
  
  /** Convenience property that returns the {@link Matter} whose PublicID is {@code MatterPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Matter()            : Matter          { return fetchByPublicID(MatterPublicID) }
  
  /** Convenience property that returns the {@link Negotiation} whose PublicID is {@code NegotiationPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Negotiation()       : Negotiation     { return fetchByPublicID(NegotiationPublicID) }
  
  /** Convenience property that returns the {@link Policy} whose PublicID is {@code PolicyPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Policy()            : Policy          { return fetchByPublicID(PolicyPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()        : User            { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new ClaimContactRoleDTO that represents the current state of the supplied ClaimContactRole.
   * @param that The ClaimContactRole to be represented.
   */
  static function valueOf(that : ClaimContactRole) : ClaimContactRoleDTO {
    return new ClaimContactRoleDTO().readFrom(that)
  }

  /**
   * Returns the ClaimContactRole whose public ID is in the supplied list, or null if the publicID is null.
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