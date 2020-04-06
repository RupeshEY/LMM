package gw.webservice.cc.cc901.dto

uses entity.Address
uses entity.Contact
uses entity.Incident
uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses typekey.Currency

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link gw.webservice.cc.cc901.dto.ClaimDTO} is a DTO that represents an instance of {@link Claim} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link Claim}.
 * <p>None of these methods constrain how an instance of ClaimDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the ClaimDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link gw.webservice.cc.cc901.dto.ClaimDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>AssignedGroupPublicID</td><td>Claim.AssignedGroup.PublicID</td></tr><tr><td>AssignedUserPublicID</td><td>Claim.AssignedUser.PublicID</td></tr><tr><td>claimantPublicID</td><td>Claim.claimant.PublicID</td></tr><tr><td>ClaimNumber</td><td>Claim.ClaimNumber</td></tr><tr><td>Closed</td><td>Claim.Closed</td></tr><tr><td>CloseDate</td><td>Claim.CloseDate</td></tr><tr><td>ContactPublicIDs</td><td>Claim.Contacts*.PublicID</td></tr><tr><td>CreateTime</td><td>Claim.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Claim.CreateUser.PublicID</td></tr><tr><td>Currency</td><td>Claim.Currency</td></tr><tr><td>Description</td><td>Claim.Description</td></tr><tr><td>doctorPublicIDs</td><td>Claim.doctor*.PublicID</td></tr><tr><td>ExposurePublicIDs</td><td>Claim.Exposures*.PublicID</td></tr><tr><td>Fault</td><td>Claim.Fault</td></tr><tr><td>FaultRating</td><td>Claim.FaultRating</td></tr><tr><td>FirstIntakeDoctorPublicID</td><td>Claim.FirstIntakeDoctor.PublicID</td></tr><tr><td>hospitalPublicID</td><td>Claim.hospital.PublicID</td></tr><tr><td>IncidentPublicIDs</td><td>Claim.Incidents*.PublicID</td></tr><tr><td>LossCause</td><td>Claim.LossCause</td></tr><tr><td>LossDate</td><td>Claim.LossDate</td></tr><tr><td>LossLocationPublicID</td><td>Claim.LossLocation.PublicID</td></tr><tr><td>LossType</td><td>Claim.LossType</td></tr><tr><td>maincontactPublicID</td><td>Claim.maincontact.PublicID</td></tr><tr><td>nursecasemgrPublicID</td><td>Claim.nursecasemgr.PublicID</td></tr><tr><td>PolicyPublicID</td><td>Claim.Policy.PublicID</td></tr><tr><td>PreviousUserPublicID</td><td>Claim.PreviousUser.PublicID</td></tr><tr><td>PrimaryDoctorPublicID</td><td>Claim.PrimaryDoctor.PublicID</td></tr><tr><td>PublicID</td><td>Claim.PublicID</td></tr><tr><td>ReportedByType</td><td>Claim.ReportedByType</td></tr><tr><td>ReportedDate</td><td>Claim.ReportedDate</td></tr><tr><td>reporterPublicID</td><td>Claim.reporter.PublicID</td></tr><tr><td>State</td><td>Claim.State</td></tr><tr><td>subrogatorPublicID</td><td>Claim.subrogator.PublicID</td></tr><tr><td>supervisorPublicID</td><td>Claim.supervisor.PublicID</td></tr><tr><td>UpdateTime</td><td>Claim.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Claim.UpdateUser.PublicID</td></tr><tr><td>witnessPublicIDs</td><td>Claim.witness*.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ClaimDTO")
final class ClaimDTO {
  /** Derived from Claim#AssignedGroup.PublicID */
  var _assignedGroupPublicID     : String               as AssignedGroupPublicID
  /** Derived from Claim#AssignedUser.PublicID */
  var _assignedUserPublicID      : String               as AssignedUserPublicID
  /** Derived from gw.entity.GWClaimEntityRoleConstraintsEnhancement#claimant.PublicID */
  var _claimantPublicID          : String               as claimantPublicID
  var _claimNumber               : String               as ClaimNumber
  var _closed                    : boolean              as Closed
  var _closeDate                 : Date                 as CloseDate
  /** Derived from Claim#Contacts*.PublicID */
  var _contactPublicIDs          : String[]             as ContactPublicIDs = {}
  var _createTime                : Date                 as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID        : String               as CreateUserPublicID
  var _currency                  : Currency             as Currency
  var _description               : String               as Description
  /** Derived from gw.entity.GWClaimEntityRoleConstraintsEnhancement#doctor*.PublicID */
  var _doctorPublicIDs           : String[]             as doctorPublicIDs = {}
  /** Derived from Claim#Exposures*.PublicID */
  var _exposurePublicIDs         : String[]             as ExposurePublicIDs = {}
  var _fault                     : java.math.BigDecimal as Fault
  var _faultRating               : FaultRating          as FaultRating
  /** Derived from gw.entity.GWClaimEntityRoleConstraintsEnhancement#FirstIntakeDoctor.PublicID */
  var _firstIntakeDoctorPublicID : String               as FirstIntakeDoctorPublicID
  /** Derived from gw.entity.GWClaimEntityRoleConstraintsEnhancement#hospital.PublicID */
  var _hospitalPublicID          : String               as hospitalPublicID
  /** Derived from Claim#Incidents*.PublicID */
  var _incidentPublicIDs         : String[]             as IncidentPublicIDs = {}
  var _lossCause                 : LossCause            as LossCause
  var _lossDate                  : Date                 as LossDate
  /** Derived from Claim#LossLocation.PublicID
   *  Use the LossLocationPublicID if dto's loss location is referencing an existing address.
   *  Will throw an IllegalArgumentException if NewLossLocation is specified in the dto as well */
  var _lossLocationPublicID      : String               as LossLocationPublicID
  var _lossType                  : LossType             as LossType
  /** Derived from gw.entity.GWClaimEntityRoleConstraintsEnhancement#maincontact.PublicID */
  var _maincontactPublicID       : String               as maincontactPublicID
  var _newActivities             : gw.webservice.cc.cc901.dto.ActivityDTO[]        as NewActivities = {}
  var _newContacts               : gw.webservice.cc.cc901.dto.ClaimContactDTO[]    as NewContacts = {}
  var _newdoctor                 : gw.webservice.cc.cc901.dto.ContactDTO[]         as Newdoctor = {}
  var _newDocuments              : gw.webservice.cc.cc901.dto.DocumentDTO[]        as NewDocuments = {}
  var _newExposures              : gw.webservice.cc.cc901.dto.ExposureDTO[]        as NewExposures = {}
  var _newIncidents              : gw.webservice.cc.cc901.dto.IncidentDTO[]        as NewIncidents = {}
  /** Use the NewLossLocation if a new address will be created and passed in.
   *  Will throw an IllegalArgumentException if LossLocationPublicID is specified in the dto as well  */
  var _newLossLocation           : gw.webservice.cc.cc901.dto.AddressDTO as NewLossLocation
  var _newNotes                  : gw.webservice.cc.cc901.dto.NoteDTO[]            as NewNotes = {}
  var _newwitness                : gw.webservice.cc.cc901.dto.ContactDTO[]         as Newwitness = {}
  /** Derived from gw.entity.GWClaimEntityRoleConstraintsEnhancement#nursecasemgr.PublicID */
  var _nursecasemgrPublicID      : String               as nursecasemgrPublicID
  /** Derived from Claim#Policy.PublicID */
  var _policyPublicID            : String               as PolicyPublicID
  /** Derived from Claim#PreviousUser.PublicID */
  var _previousUserPublicID      : String               as PreviousUserPublicID
  /** Derived from gw.entity.GWClaimEntityRoleConstraintsEnhancement#PrimaryDoctor.PublicID */
  var _primaryDoctorPublicID     : String               as PrimaryDoctorPublicID
  var _publicID                  : String               as PublicID
  var _reportedByType            : PersonRelationType   as ReportedByType
  var _reportedDate              : Date                 as ReportedDate
  /** Derived from gw.entity.GWClaimEntityRoleConstraintsEnhancement#reporter.PublicID */
  var _reporterPublicID          : String               as reporterPublicID
  var _state                     : ClaimState           as State
  /** Derived from gw.entity.GWClaimEntityRoleConstraintsEnhancement#subrogator.PublicID */
  var _subrogatorPublicID        : String               as subrogatorPublicID
  /** Derived from gw.entity.GWClaimEntityRoleConstraintsEnhancement#supervisor.PublicID */
  var _supervisorPublicID        : String               as supervisorPublicID
  var _updateTime                : Date                 as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID        : String               as UpdateUserPublicID
  /** Derived from gw.entity.GWClaimEntityRoleConstraintsEnhancement#witness*.PublicID */
  var _witnessPublicIDs          : String[]             as witnessPublicIDs = {}
  var _newclaimant               : gw.webservice.cc.cc901.dto.ContactDTO as Newclaimant

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Claim
   * @param that The Claim to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Claim) {
    // if field is on base class
      _closed                    = that.Closed
      _contactPublicIDs          = that.Contacts*.PublicID
      _createTime                = that.CreateTime
      _createUserPublicID        = that.CreateUser.PublicID
      _currency                  = that.Currency
      _exposurePublicIDs         = that.Exposures*.PublicID
      _incidentPublicIDs         = that.Incidents*.PublicID
      _previousUserPublicID      = that.PreviousUser.PublicID
      _state                     = that.State
      _updateTime                = that.UpdateTime
      _updateUserPublicID        = that.UpdateUser.PublicID
      _doctorPublicIDs           = that.doctor*.PublicID
      _witnessPublicIDs          = that.witness*.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied Claim
   * @param that The Claim to copy from.
   */
  final function readFrom(that : Claim) : gw.webservice.cc.cc901.dto.ClaimDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      AssignedGroupPublicID      = that.AssignedGroup.PublicID
      AssignedUserPublicID       = that.AssignedUser.PublicID
      ClaimNumber                = that.ClaimNumber
      CloseDate                  = that.CloseDate
      Description                = that.Description
      Fault                      = that.Fault
      FaultRating                = that.FaultRating
      FirstIntakeDoctorPublicID  = that.FirstIntakeDoctor.PublicID
      LossCause                  = that.LossCause
      LossDate                   = that.LossDate
      LossLocationPublicID       = that.LossLocation.PublicID
      LossType                   = that.LossType
      PolicyPublicID             = that.Policy.PublicID
      PrimaryDoctorPublicID      = that.PrimaryDoctor.PublicID
      PublicID                   = that.PublicID
      ReportedByType             = that.ReportedByType
      ReportedDate               = that.ReportedDate
      claimantPublicID           = that.claimant.PublicID
      hospitalPublicID           = that.hospital.PublicID
      maincontactPublicID        = that.maincontact.PublicID
      nursecasemgrPublicID       = that.nursecasemgr.PublicID
      reporterPublicID           = that.reporter.PublicID
      subrogatorPublicID         = that.subrogator.PublicID
      supervisorPublicID         = that.supervisor.PublicID
    //
    return this
  }

  /**
   * Update the supplied Claim using the field values stored in this DTO
   * @param that The Claim to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Claim, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Claim, ignoreNullValues = true) : Claim {
    // if field is on base class
      if (AssignedGroupPublicID     != null or !ignoreNullValues) that.AssignedGroup             = AssignedGroup
      if (AssignedUserPublicID      != null or !ignoreNullValues) that.AssignedUser              = AssignedUser
      if (ClaimNumber               != null or !ignoreNullValues) that.ClaimNumber               = ClaimNumber
      if (CloseDate                 != null or !ignoreNullValues) that.CloseDate                 = CloseDate
      if (Description               != null or !ignoreNullValues) that.Description               = Description
      if (Fault                     != null or !ignoreNullValues) that.Fault                     = Fault
      if (FaultRating               != null or !ignoreNullValues) that.FaultRating               = FaultRating
      if (FirstIntakeDoctorPublicID != null or !ignoreNullValues) that.FirstIntakeDoctor         = FirstIntakeDoctor
      if (LossCause                 != null or !ignoreNullValues) that.LossCause                 = LossCause
      if (LossDate                  != null or !ignoreNullValues) that.LossDate                  = LossDate
      if (LossLocationPublicID      != null or !ignoreNullValues) that.LossLocation              = LossLocation
      if (LossType                  != null or !ignoreNullValues) that.LossType                  = LossType
      if (PolicyPublicID            != null or !ignoreNullValues) that.Policy                    = Policy
      if (PrimaryDoctorPublicID     != null or !ignoreNullValues) that.PrimaryDoctor             = PrimaryDoctor
      if (PublicID                  != null or !ignoreNullValues) that.PublicID                  = PublicID
      if (ReportedByType            != null or !ignoreNullValues) that.ReportedByType            = ReportedByType
      if (ReportedDate              != null or !ignoreNullValues) that.ReportedDate              = ReportedDate
      if (claimantPublicID          != null or !ignoreNullValues) that.claimant                  = claimant
      if (hospitalPublicID          != null or !ignoreNullValues) that.hospital                  = hospital
      if (maincontactPublicID       != null or !ignoreNullValues) that.maincontact               = maincontact
      if (nursecasemgrPublicID      != null or !ignoreNullValues) that.nursecasemgr              = nursecasemgr
      if (reporterPublicID          != null or !ignoreNullValues) that.reporter                  = reporter
      if (subrogatorPublicID        != null or !ignoreNullValues) that.subrogator                = subrogator
      if (supervisorPublicID        != null or !ignoreNullValues) that.supervisor                = supervisor
    //
    return that
  }

  /**
   * Uses the createNew block to create a new Claim, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Claim.
   * @param createNew (Optional) A block that returns a new instance of Claim. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Claim, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Claim = null, ignoreNullValues = true) : Claim {
    var instance : Claim
    if (createNew == null) {
      instance = bundle == null
          ? new Claim()
          : new Claim(bundle)
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
  property get AssignedGroup()          : Group               { return fetchByPublicID(AssignedGroupPublicID) }

  /** Convenience property that returns the {@link User} whose PublicID is {@code AssignedUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get AssignedUser()           : User                { return fetchByPublicID(AssignedUserPublicID) }

  /** Convenience property that returns the {@link Person} whose PublicID is {@code claimantPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get claimant()               : Person              { return fetchByPublicID(claimantPublicID) }

  /** Convenience property that returns a {@link ClaimContact[]} of the objects whose PublicIDs are in {@code ContactPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Contacts()               : ClaimContact[]      { return fetchByPublicID(ContactPublicIDs) }

  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()             : User                { return fetchByPublicID(CreateUserPublicID) }

  /** Convenience property that returns a {@link Doctor[]} of the objects whose PublicIDs are in {@code doctorPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get doctor()                 : Doctor[]            { return fetchByPublicID(doctorPublicIDs) }

  /** Convenience property that returns a {@link Exposure[]} of the objects whose PublicIDs are in {@code ExposurePublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Exposures()              : Exposure[]          { return fetchByPublicID(ExposurePublicIDs) }

  /** Convenience property that returns the {@link Doctor} whose PublicID is {@code FirstIntakeDoctorPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get FirstIntakeDoctor()      : Doctor              { return fetchByPublicID(FirstIntakeDoctorPublicID) }

  /** Convenience property that returns the {@link MedicalCareOrg} whose PublicID is {@code hospitalPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get hospital()               : MedicalCareOrg      { return fetchByPublicID(hospitalPublicID) }

  /** Convenience property that returns a {@link entity.Incident[]} of the objects whose PublicIDs are in {@code IncidentPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Incidents()              : Incident[]          { return fetchByPublicID(IncidentPublicIDs) }

  /** Convenience property that returns the {@link entity.Address} whose PublicID is {@code LossLocationPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get LossLocation()           : Address             { return fetchByPublicID(LossLocationPublicID) }

  /** Convenience property that returns the {@link Person} whose PublicID is {@code maincontactPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get maincontact()            : Person              { return fetchByPublicID(maincontactPublicID) }

  /** Convenience property that returns the {@link Person} whose PublicID is {@code nursecasemgrPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get nursecasemgr()           : Person              { return fetchByPublicID(nursecasemgrPublicID) }

  /** Convenience property that returns the {@link Policy} whose PublicID is {@code PolicyPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Policy()                 : Policy              { return fetchByPublicID(PolicyPublicID) }

  /** Convenience property that returns the {@link User} whose PublicID is {@code PreviousUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get PreviousUser()           : User                { return fetchByPublicID(PreviousUserPublicID) }

  /** Convenience property that returns the {@link Doctor} whose PublicID is {@code PrimaryDoctorPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get PrimaryDoctor()          : Doctor              { return fetchByPublicID(PrimaryDoctorPublicID) }

  /** Convenience property that returns the {@link entity.Contact} whose PublicID is {@code reporterPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get reporter()               : Contact             { return fetchByPublicID(reporterPublicID) }

  /** Convenience property that returns the {@link entity.Contact} whose PublicID is {@code subrogatorPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get subrogator()             : Contact             { return fetchByPublicID(subrogatorPublicID) }

  /** Convenience property that returns the {@link Person} whose PublicID is {@code supervisorPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get supervisor()             : Person              { return fetchByPublicID(supervisorPublicID) }

  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()             : User                { return fetchByPublicID(UpdateUserPublicID) }

  /** Convenience property that returns a {@link Person[]} of the objects whose PublicIDs are in {@code witnessPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get witness()                : Person[]            { return fetchByPublicID(witnessPublicIDs) }

  /**
   * return a new ClaimDTO that represents the current state of the supplied Claim.
   * @param that The Claim to be represented.
   */
  static function valueOf(that : Claim) : gw.webservice.cc.cc901.dto.ClaimDTO {
    return new gw.webservice.cc.cc901.dto.ClaimDTO().readFrom(that)
  }

  /**
   * Returns all of the Claim instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
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
   * Returns the Claim whose public ID is in the supplied list, or null if the publicID is null.
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
