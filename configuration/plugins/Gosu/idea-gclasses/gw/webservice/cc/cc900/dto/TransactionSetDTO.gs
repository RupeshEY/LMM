package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.lang.reflect.ReflectUtil
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.lang.IllegalArgumentException
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link TransactionSetDTO} is a DTO that represents an instance of {@link entity.TransactionSet} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.TransactionSet}.
 * <p>None of these methods constrain how an instance of TransactionSetDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the TransactionSetDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link TransactionSetDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>ActivityPublicIDs</td><td>TransactionSet.Activities*.PublicID</td></tr><tr><td>ApprovalDate</td><td>TransactionSet.ApprovalDate</td></tr><tr><td>ApprovalStatus</td><td>TransactionSet.ApprovalStatus</td></tr><tr><td>Approved</td><td>TransactionSet.Approved</td></tr><tr><td>CheckGroupPublicIDs</td><td>CheckSet.CheckGroups*.PublicID</td></tr><tr><td>CheckPublicIDs</td><td>CheckSet.Checks*.PublicID</td></tr><tr><td>CheckSetReservePublicIDs</td><td>TransactionSet.CheckSetReserves*.PublicID</td></tr><tr><td>ClaimPublicID</td><td>TransactionSet.Claim.PublicID</td></tr><tr><td>CreateTime</td><td>TransactionSet.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>TransactionSet.CreateUser.PublicID</td></tr><tr><td>DocumentPublicIDs</td><td>TransactionSet.Documents*.PublicID</td></tr><tr><td>Editable</td><td>TransactionSet.Editable</td></tr><tr><td>ExceedsApplicableLimit</td><td>TransactionSet.ExceedsApplicableLimit</td></tr><tr><td>ExceedsApplicableLimitIgnoringStatus</td><td>TransactionSet.ExceedsApplicableLimitIgnoringStatus</td></tr><tr><td>ExceedsLimit</td><td>TransactionSet.ExceedsLimit</td></tr><tr><td>ExceedsLimitIgnoringStatus</td><td>TransactionSet.ExceedsLimitIgnoringStatus</td></tr><tr><td>ExposurePublicIDs</td><td>TransactionSet.Exposures*.PublicID</td></tr><tr><td>LastApprovingUserPublicID</td><td>TransactionSet.LastApprovingUser.PublicID</td></tr><tr><td>PublicID</td><td>TransactionSet.PublicID</td></tr><tr><td>RecoveryPublicIDs</td><td>RecoverySet.Recoveries*.PublicID</td></tr><tr><td>RecoveryReservePublicIDs</td><td>RecoveryReserveSet.RecoveryReserves*.PublicID</td></tr><tr><td>RequestingUserPublicID</td><td>TransactionSet.RequestingUser.PublicID</td></tr><tr><td>ReservePublicIDs</td><td>ReserveSet.Reserves*.PublicID</td></tr><tr><td>Subtype</td><td>TransactionSet.Subtype</td></tr><tr><td>UpdateTime</td><td>TransactionSet.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>TransactionSet.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/TransactionSetDTO")
final class TransactionSetDTO {
  /** Derived from TransactionSet#Activities*.PublicID */
  var _activityPublicIDs                    : String[]               as ActivityPublicIDs = {}
  var _approvalDate                         : Date                   as ApprovalDate
  var _approvalStatus                       : ApprovalStatus         as ApprovalStatus
  var _approved                             : boolean                as Approved
  /** Derived from CheckSet#CheckGroups*.PublicID */
  var _checkGroupPublicIDs                  : String[]               as CheckGroupPublicIDs = {}
  /** Derived from CheckSet#Checks*.PublicID */
  var _checkPublicIDs                       : String[]               as CheckPublicIDs = {}
  /** Derived from TransactionSet#Claim.PublicID */
  var _claimPublicID                        : String                 as ClaimPublicID
  var _createTime                           : Date                   as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID                   : String                 as CreateUserPublicID
  /** Derived from TransactionSet#Documents*.PublicID */
  var _documentPublicIDs                    : String[]               as DocumentPublicIDs = {}
  var _editable                             : boolean                as Editable
  var _exceedsApplicableLimit               : boolean                as ExceedsApplicableLimit
  var _exceedsApplicableLimitIgnoringStatus : boolean                as ExceedsApplicableLimitIgnoringStatus
  var _exceedsLimit                         : boolean                as ExceedsLimit
  var _exceedsLimitIgnoringStatus           : boolean                as ExceedsLimitIgnoringStatus
  /** Derived from TransactionSet#Exposures*.PublicID */
  var _exposurePublicIDs                    : String[]               as ExposurePublicIDs = {}
  /** Derived from TransactionSet#LastApprovingUser.PublicID */
  var _lastApprovingUserPublicID            : String                 as LastApprovingUserPublicID
  var _newActivities                        : ActivityDTO[]          as NewActivities = {}
  var _newChecks                            : CheckDTO[]             as NewChecks = {}
  var _newDocuments                         : DocumentDTO[]          as NewDocuments = {}
  var _newExchangeRate                      : java.math.BigDecimal   as NewExchangeRate
  var _newExchangeRateDescription           : String                 as NewExchangeRateDescription
  var _newExposures                         : ExposureDTO[]          as NewExposures = {}
  var _newRecoveries                        : TransactionDTO[]       as NewRecoveries = {}
  var _newRecoveryReserves                  : TransactionDTO[]       as NewRecoveryReserves = {}
  var _newReserves                          : TransactionDTO[]       as NewReserves = {}
  var _publicID                             : String                 as PublicID
  /** Derived from RecoverySet#Recoveries*.PublicID */
  var _recoveryPublicIDs                    : String[]               as RecoveryPublicIDs = {}
  /** Derived from RecoveryReserveSet#RecoveryReserves*.PublicID */
  var _recoveryReservePublicIDs             : String[]               as RecoveryReservePublicIDs = {}
  /** Derived from TransactionSet#RequestingUser.PublicID */
  var _requestingUserPublicID               : String                 as RequestingUserPublicID
  /** Derived from ReserveSet#Reserves*.PublicID */
  var _reservePublicIDs                     : String[]               as ReservePublicIDs = {}
  var _subtype                              : typekey.TransactionSet as Subtype
  var _updateTime                           : Date                   as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID                   : String                 as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied TransactionSet
   * @param that The TransactionSet to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : TransactionSet) {
    // if field is on base class
      _activityPublicIDs                    = that.Activities*.PublicID
      _approved                             = that.Approved
      _createTime                           = that.CreateTime
      _createUserPublicID                   = that.CreateUser.PublicID
      _documentPublicIDs                    = that.Documents*.PublicID
      _editable                             = that.Editable
      _exceedsApplicableLimit               = that.ExceedsApplicableLimit
      _exceedsApplicableLimitIgnoringStatus = that.ExceedsApplicableLimitIgnoringStatus
      _exceedsLimit                         = that.ExceedsLimit
      _exceedsLimitIgnoringStatus           = that.ExceedsLimitIgnoringStatus
      _exposurePublicIDs                    = that.Exposures*.PublicID
      _lastApprovingUserPublicID            = that.LastApprovingUser.PublicID
      _subtype                              = that.Subtype
      _updateTime                           = that.UpdateTime
      _updateUserPublicID                   = that.UpdateUser.PublicID
    //
    if (that typeis CheckSet) {
      _checkGroupPublicIDs                  = that.CheckGroups*.PublicID
      _checkPublicIDs                       = that.Checks*.PublicID
    }
    if (that typeis RecoveryReserveSet) {
      _recoveryReservePublicIDs             = that.RecoveryReserves*.PublicID
    }
    if (that typeis RecoverySet) {
      _recoveryPublicIDs                    = that.Recoveries*.PublicID
    }
    if (that typeis ReserveSet) {
      _reservePublicIDs                     = that.Reserves*.PublicID
    }
  }

  /**
   * Set the fields in this DTO using the supplied TransactionSet
   * @param that The TransactionSet to copy from.
   */
  final function readFrom(that : TransactionSet) : TransactionSetDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      ApprovalDate                          = that.ApprovalDate
      ApprovalStatus                        = that.ApprovalStatus
      ClaimPublicID                         = that.Claim.PublicID
      PublicID                              = that.PublicID
      RequestingUserPublicID                = that.RequestingUser.PublicID
    //
    return this
  }

  /**
   * Update the supplied TransactionSet using the field values stored in this DTO
   * @param that The TransactionSet to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the TransactionSet, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : TransactionSet, ignoreNullValues = true) : TransactionSet {
    // if field is on base class
      if (ApprovalDate                         != null or !ignoreNullValues) that.ApprovalDate                         = ApprovalDate
      if (ApprovalStatus                       != null or !ignoreNullValues) that.ApprovalStatus                       = ApprovalStatus
      if (ClaimPublicID                        != null or !ignoreNullValues) that.Claim                                = Claim
      if (PublicID                             != null or !ignoreNullValues) that.PublicID                             = PublicID
      if (RequestingUserPublicID               != null or !ignoreNullValues) that.RequestingUser                       = RequestingUser
    //
    return that
  }

  /**
   * Uses the createNew block to create a new TransactionSet, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new TransactionSet.
   * @param createNew (Optional) A block that returns a new instance of TransactionSet. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the TransactionSet, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : TransactionSet = null, ignoreNullValues = true) : TransactionSet {
    var instance : TransactionSet
    if (createNew == null) {
      instance = bundle == null
          ? ReflectUtil.construct(ConcreteSubtypeClassName, {})
          : ReflectUtil.construct(ConcreteSubtypeClassName, {bundle})
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /**
   * Returns the name of the instantiable subclass referred to by the Subtype typekey.
   * @throws IllegalArgumentException if Subclass is null, since the base class (TransactionSet) is abstract.
   */
  final property get ConcreteSubtypeClassName() : String {
    if (Subtype == null) {
      throw new IllegalArgumentException("The subtype field must be set since TransactionSet is abstract and cannot be instantiated!")
    }
    return "entity." + Subtype.Code
  }

  /** Convenience property that returns a {@link Activity[]} of the objects whose PublicIDs are in {@code ActivityPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Activities()                        : Activity[]            { return fetchByPublicID(ActivityPublicIDs) }
  
  /** Convenience property that returns a {@link CheckGroup[]} of the objects whose PublicIDs are in {@code CheckGroupPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CheckGroups()                       : CheckGroup[]          { return fetchByPublicID(CheckGroupPublicIDs) }
  
  /** Convenience property that returns a {@link Check[]} of the objects whose PublicIDs are in {@code CheckPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Checks()                            : Check[]               { return fetchByPublicID(CheckPublicIDs) }
  
  /** Convenience property that returns the {@link Claim} whose PublicID is {@code ClaimPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claim()                             : Claim                 { return fetchByPublicID(ClaimPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()                        : User                  { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns a {@link TransactionSetDocument[]} of the objects whose PublicIDs are in {@code DocumentPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Documents()                         : TransactionSetDocument[]{ return fetchByPublicID(DocumentPublicIDs) }
  
  /** Convenience property that returns a {@link Exposure[]} of the objects whose PublicIDs are in {@code ExposurePublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Exposures()                         : Exposure[]            { return fetchByPublicID(ExposurePublicIDs) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code LastApprovingUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get LastApprovingUser()                 : User                  { return fetchByPublicID(LastApprovingUserPublicID) }
  
  /** Convenience property that returns a {@link Recovery[]} of the objects whose PublicIDs are in {@code RecoveryPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Recoveries()                        : Recovery[]            { return fetchByPublicID(RecoveryPublicIDs) }
  
  /** Convenience property that returns a {@link RecoveryReserve[]} of the objects whose PublicIDs are in {@code RecoveryReservePublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get RecoveryReserves()                  : RecoveryReserve[]     { return fetchByPublicID(RecoveryReservePublicIDs) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code RequestingUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get RequestingUser()                    : User                  { return fetchByPublicID(RequestingUserPublicID) }
  
  /** Convenience property that returns a {@link Reserve[]} of the objects whose PublicIDs are in {@code ReservePublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Reserves()                          : Reserve[]             { return fetchByPublicID(ReservePublicIDs) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()                        : User                  { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new TransactionSetDTO that represents the current state of the supplied TransactionSet.
   * @param that The TransactionSet to be represented.
   */
  static function valueOf(that : TransactionSet) : TransactionSetDTO {
    return new TransactionSetDTO().readFrom(that)
  }

  /**
   * Returns all of the TransactionSet instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
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
   * Returns the TransactionSet whose public ID is in the supplied list, or null if the publicID is null.
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