package gw.webservice.cc.cc901.dto

uses entity.Contact
uses entity.Coverage
uses entity.Incident
uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link gw.webservice.cc.cc901.dto.ExposureDTO} is a DTO that represents an instance of {@link Exposure} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link Exposure}.
 * <p>None of these methods constrain how an instance of ExposureDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the ExposureDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link gw.webservice.cc.cc901.dto.ExposureDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>AssignedGroupPublicID</td><td>Exposure.AssignedGroup.PublicID</td></tr><tr><td>AssignedUserPublicID</td><td>Exposure.AssignedUser.PublicID</td></tr><tr><td>ClaimantPublicID</td><td>Exposure.Claimant.PublicID</td></tr><tr><td>ClaimOrder</td><td>Exposure.ClaimOrder</td></tr><tr><td>ClaimPublicID</td><td>Exposure.Claim.PublicID</td></tr><tr><td>CloseDate</td><td>Exposure.CloseDate</td></tr><tr><td>CoveragePublicID</td><td>Exposure.Coverage.PublicID</td></tr><tr><td>CoverageSubType</td><td>Exposure.CoverageSubType</td></tr><tr><td>CreateTime</td><td>Exposure.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Exposure.CreateUser.PublicID</td></tr><tr><td>doctorPublicIDs</td><td>Exposure.doctor*.PublicID</td></tr><tr><td>ExposureType</td><td>Exposure.ExposureType</td></tr><tr><td>IncidentPublicID</td><td>Exposure.Incident.PublicID</td></tr><tr><td>LossCategory</td><td>Exposure.LossCategory</td></tr><tr><td>LossParty</td><td>Exposure.LossParty</td></tr><tr><td>PrimaryCoverage</td><td>Exposure.PrimaryCoverage</td></tr><tr><td>PrimaryDoctorPublicID</td><td>Exposure.PrimaryDoctor.PublicID</td></tr><tr><td>PublicID</td><td>Exposure.PublicID</td></tr><tr><td>Segment</td><td>Exposure.Segment</td></tr><tr><td>State</td><td>Exposure.State</td></tr><tr><td>Strategy</td><td>Exposure.Strategy</td></tr><tr><td>UpdateTime</td><td>Exposure.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Exposure.UpdateUser.PublicID</td></tr><tr><td>ValidationLevel</td><td>Exposure.ValidationLevel</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ExposureDTO")
final class ExposureDTO {
  /** Derived from Exposure#AssignedGroup.PublicID */
  var _assignedGroupPublicID : String          as AssignedGroupPublicID
  /** Derived from Exposure#AssignedUser.PublicID */
  var _assignedUserPublicID  : String          as AssignedUserPublicID
  /** Derived from Exposure#Claimant.PublicID */
  var _claimantPublicID      : String          as ClaimantPublicID
  var _claimOrder            : Integer         as ClaimOrder
  /** Derived from Exposure#Claim.PublicID */
  var _claimPublicID         : String          as ClaimPublicID
  var _closeDate             : Date            as CloseDate
  /** Derived from Exposure#Coverage.PublicID */
  var _coveragePublicID      : String          as CoveragePublicID
  var _coverageSubType       : CoverageSubtype as CoverageSubType
  var _createTime            : Date            as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID    : String          as CreateUserPublicID
  /** Derived from gw.entity.GWExposureEntityRoleConstraintsEnhancement#doctor*.PublicID */
  var _doctorPublicIDs       : String[]        as doctorPublicIDs = {}
  var _exposureType          : ExposureType    as ExposureType
  /** Derived from Exposure#Incident.PublicID */
  var _incidentPublicID      : String          as IncidentPublicID
  var _lossCategory          : LossCategory    as LossCategory
  var _lossParty             : LossPartyType   as LossParty
  var _newActivities         : ActivityDTO[]   as NewActivities = {}
  var _newdoctor             : ContactDTO[]    as Newdoctor = {}
  var _newDocuments          : gw.webservice.cc.cc901.dto.DocumentDTO[]   as NewDocuments = {}
  var _newNotes              : gw.webservice.cc.cc901.dto.NoteDTO[]       as NewNotes = {}
  var _primaryCoverage       : CoverageType    as PrimaryCoverage
  /** Derived from gw.entity.GWExposureEntityRoleConstraintsEnhancement#PrimaryDoctor.PublicID */
  var _primaryDoctorPublicID : String          as PrimaryDoctorPublicID
  var _publicID              : String          as PublicID
  var _segment               : ClaimSegment    as Segment
  var _state                 : ExposureState   as State
  var _strategy              : ClaimStrategy   as Strategy
  var _updateTime            : Date            as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID    : String          as UpdateUserPublicID
  var _validationLevel       : ValidationLevel as ValidationLevel

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Exposure
   * @param that The Exposure to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Exposure) {
    // if field is on base class
      _createTime            = that.CreateTime
      _createUserPublicID    = that.CreateUser.PublicID
      _updateTime            = that.UpdateTime
      _updateUserPublicID    = that.UpdateUser.PublicID
      _doctorPublicIDs       = that.doctor*.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied Exposure
   * @param that The Exposure to copy from.
   */
  final function readFrom(that : Exposure) : gw.webservice.cc.cc901.dto.ExposureDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      AssignedGroupPublicID  = that.AssignedGroup.PublicID
      AssignedUserPublicID   = that.AssignedUser.PublicID
      ClaimOrder             = that.ClaimOrder
      ClaimPublicID          = that.Claim.PublicID
      ClaimantPublicID       = that.Claimant.PublicID
      CloseDate              = that.CloseDate
      CoveragePublicID       = that.Coverage.PublicID
      CoverageSubType        = that.CoverageSubType
      ExposureType           = that.ExposureType
      IncidentPublicID       = that.Incident.PublicID
      LossCategory           = that.LossCategory
      LossParty              = that.LossParty
      PrimaryCoverage        = that.PrimaryCoverage
      PrimaryDoctorPublicID  = that.PrimaryDoctor.PublicID
      PublicID               = that.PublicID
      Segment                = that.Segment
      State                  = that.State
      Strategy               = that.Strategy
      ValidationLevel        = that.ValidationLevel
    //
    return this
  }

  /**
   * Update the supplied Exposure using the field values stored in this DTO
   * @param that The Exposure to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Exposure, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Exposure, ignoreNullValues = true) : Exposure {
    // if field is on base class
      if (AssignedGroupPublicID != null or !ignoreNullValues) that.AssignedGroup         = AssignedGroup
      if (AssignedUserPublicID  != null or !ignoreNullValues) that.AssignedUser          = AssignedUser
      if (ClaimOrder            != null or !ignoreNullValues) that.ClaimOrder            = ClaimOrder
      if (ClaimPublicID         != null or !ignoreNullValues) that.Claim                 = Claim
      if (ClaimantPublicID      != null or !ignoreNullValues) that.Claimant              = Claimant
      if (CloseDate             != null or !ignoreNullValues) that.CloseDate             = CloseDate
      if (CoveragePublicID      != null or !ignoreNullValues) that.Coverage              = Coverage
      if (CoverageSubType       != null or !ignoreNullValues) that.CoverageSubType       = CoverageSubType
      if (ExposureType          != null or !ignoreNullValues) that.ExposureType          = ExposureType
      if (IncidentPublicID      != null or !ignoreNullValues) that.Incident              = Incident
      if (LossCategory          != null or !ignoreNullValues) that.LossCategory          = LossCategory
      if (LossParty             != null or !ignoreNullValues) that.LossParty             = LossParty
      if (PrimaryCoverage       != null or !ignoreNullValues) that.PrimaryCoverage       = PrimaryCoverage
      if (PrimaryDoctorPublicID != null or !ignoreNullValues) that.PrimaryDoctor         = PrimaryDoctor
      if (PublicID              != null or !ignoreNullValues) that.PublicID              = PublicID
      if (Segment               != null or !ignoreNullValues) that.Segment               = Segment
      if (State                 != null or !ignoreNullValues) that.State                 = State
      if (Strategy              != null or !ignoreNullValues) that.Strategy              = Strategy
      if (ValidationLevel       != null or !ignoreNullValues) that.ValidationLevel       = ValidationLevel
    //
    return that
  }

  /**
   * Uses the createNew block to create a new Exposure, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Exposure.
   * @param createNew (Optional) A block that returns a new instance of Exposure. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Exposure, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Exposure = null, ignoreNullValues = true) : Exposure {
    var instance : Exposure
    if (createNew == null) {
      instance = bundle == null
          ? new Exposure()
          : new Exposure(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns the {@link Group} whose PublicID is {@code AssignedGroupPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get AssignedGroup()      : Group          { return fetchByPublicID(AssignedGroupPublicID) }

  /** Convenience property that returns the {@link User} whose PublicID is {@code AssignedUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get AssignedUser()       : User           { return fetchByPublicID(AssignedUserPublicID) }

  /** Convenience property that returns the {@link entity.Contact} whose PublicID is {@code ClaimantPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claimant()           : Contact        { return fetchByPublicID(ClaimantPublicID) }

  /** Convenience property that returns the {@link Claim} whose PublicID is {@code ClaimPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claim()              : Claim          { return fetchByPublicID(ClaimPublicID) }

  /** Convenience property that returns the {@link entity.Coverage} whose PublicID is {@code CoveragePublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Coverage()           : Coverage       { return fetchByPublicID(CoveragePublicID) }

  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()         : User           { return fetchByPublicID(CreateUserPublicID) }

  /** Convenience property that returns a {@link Doctor[]} of the objects whose PublicIDs are in {@code doctorPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get doctor()             : Doctor[]       { return fetchByPublicID(doctorPublicIDs) }

  /** Convenience property that returns the {@link entity.Incident} whose PublicID is {@code IncidentPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Incident()           : Incident       { return fetchByPublicID(IncidentPublicID) }

  /** Convenience property that returns the {@link Doctor} whose PublicID is {@code PrimaryDoctorPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get PrimaryDoctor()      : Doctor         { return fetchByPublicID(PrimaryDoctorPublicID) }

  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()         : User           { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new ExposureDTO that represents the current state of the supplied Exposure.
   * @param that The Exposure to be represented.
   */
  static function valueOf(that : Exposure) : gw.webservice.cc.cc901.dto.ExposureDTO {
    return new gw.webservice.cc.cc901.dto.ExposureDTO().readFrom(that)
  }

  /**
   * Returns all of the Exposure instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
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
   * Returns the Exposure whose public ID is in the supplied list, or null if the publicID is null.
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