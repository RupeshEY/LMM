package gw.webservice.cc.cc901.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses typekey.Currency

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link ClaimInfoDTO} is a DTO that represents an instance of {@link ClaimInfo} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link ClaimInfo}.
 * <p>None of these methods constrain how an instance of ClaimInfoDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the ClaimInfoDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link ClaimInfoDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>AccessPublicIDs</td><td>ClaimInfo.Access*.PublicID</td></tr><tr><td>AdjusterPublicID</td><td>ClaimInfo.Adjuster.PublicID</td></tr><tr><td>AssignedGroupPublicID</td><td>ClaimInfo.AssignedGroup.PublicID</td></tr><tr><td>AssigneeDisplayName</td><td>ClaimInfo.AssigneeDisplayName</td></tr><tr><td>ClaimAggregateLimitRptPublicIDs</td><td>ClaimInfo.ClaimAggregateLimitRpts*.PublicID</td></tr><tr><td>ClaimantNames</td><td>ClaimInfo.ClaimantNames</td></tr><tr><td>ClaimCurrency</td><td>ClaimInfo.ClaimCurrency</td></tr><tr><td>ClaimInAssociationPublicIDs</td><td>ClaimInfo.ClaimInAssociations*.PublicID</td></tr><tr><td>ClaimNumber</td><td>ClaimInfo.ClaimNumber</td></tr><tr><td>ClaimPublicID</td><td>ClaimInfo.Claim.PublicID</td></tr><tr><td>ContactPublicIDs</td><td>ClaimInfo.Contacts*.PublicID</td></tr><tr><td>CoverageLineMatchDataInfoValid</td><td>ClaimInfo.CoverageLineMatchDataInfoValid</td></tr><tr><td>CoverageLineMatchDataPublicIDs</td><td>ClaimInfo.CoverageLineMatchData*.PublicID</td></tr><tr><td>CreateTime</td><td>ClaimInfo.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>ClaimInfo.CreateUser.PublicID</td></tr><tr><td>Currency</td><td>ClaimInfo.Currency</td></tr><tr><td>InsuredPublicID</td><td>ClaimInfo.Insured.PublicID</td></tr><tr><td>JurisdictionState</td><td>ClaimInfo.JurisdictionState</td></tr><tr><td>LoadCommandID</td><td>ClaimInfo.LoadCommandID</td></tr><tr><td>LossDate</td><td>ClaimInfo.LossDate</td></tr><tr><td>LossLocationCode</td><td>ClaimInfo.LossLocationCode</td></tr><tr><td>LossLocationPublicID</td><td>ClaimInfo.LossLocation.PublicID</td></tr><tr><td>NoticeDate</td><td>ClaimInfo.NoticeDate</td></tr><tr><td>PolicyNumber</td><td>ClaimInfo.PolicyNumber</td></tr><tr><td>PolicyPeriodPublicIDs</td><td>ClaimInfo.PolicyPeriods*.PublicID</td></tr><tr><td>PublicID</td><td>ClaimInfo.PublicID</td></tr><tr><td>PurgeDate</td><td>ClaimInfo.PurgeDate</td></tr><tr><td>UpdateTime</td><td>ClaimInfo.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>ClaimInfo.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/ClaimInfoDTO")
final class ClaimInfoDTO {
  /** Derived from ClaimInfo#Access*.PublicID */
  var _accessPublicIDs                 : String[]           as AccessPublicIDs = {}
  /** Derived from ClaimInfo#Adjuster.PublicID */
  var _adjusterPublicID                : String             as AdjusterPublicID
  /** Derived from ClaimInfo#AssignedGroup.PublicID */
  var _assignedGroupPublicID           : String             as AssignedGroupPublicID
  var _assigneeDisplayName             : String             as AssigneeDisplayName
  /** Derived from ClaimInfo#ClaimAggregateLimitRpts*.PublicID */
  var _claimAggregateLimitRptPublicIDs : String[]           as ClaimAggregateLimitRptPublicIDs = {}
  var _claimantNames                   : String[]           as ClaimantNames = {}
  var _claimCurrency                   : Currency           as ClaimCurrency
  /** Derived from ClaimInfo#ClaimInAssociations*.PublicID */
  var _claimInAssociationPublicIDs     : String[]           as ClaimInAssociationPublicIDs = {}
  var _claimNumber                     : String             as ClaimNumber
  /** Derived from ClaimInfo#Claim.PublicID */
  var _claimPublicID                   : String             as ClaimPublicID
  /** Derived from ClaimInfo#Contacts*.PublicID */
  var _contactPublicIDs                : String[]           as ContactPublicIDs = {}
  var _coverageLineMatchDataInfoValid  : Boolean            as CoverageLineMatchDataInfoValid
  /** Derived from ClaimInfo#CoverageLineMatchData*.PublicID */
  var _coverageLineMatchDataPublicIDs  : String[]           as CoverageLineMatchDataPublicIDs = {}
  var _createTime                      : Date               as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID              : String             as CreateUserPublicID
  var _currency                        : Currency           as Currency
  /** Derived from ClaimInfo#Insured.PublicID */
  var _insuredPublicID                 : String             as InsuredPublicID
  var _jurisdictionState               : Jurisdiction       as JurisdictionState
  var _loadCommandID                   : Long               as LoadCommandID
  var _lossDate                        : Date               as LossDate
  var _lossLocationCode                : String             as LossLocationCode
  /** Derived from ClaimInfo#LossLocation.PublicID */
  var _lossLocationPublicID            : String             as LossLocationPublicID
  var _noticeDate                      : Date               as NoticeDate
  var _policyNumber                    : String             as PolicyNumber
  /** Derived from ClaimInfo#PolicyPeriods*.PublicID */
  var _policyPeriodPublicIDs           : String[] as PolicyPeriodPublicIDs = {}
  var _publicID                        : String             as PublicID
  var _purgeDate                       : Date               as PurgeDate
  var _updateTime                      : Date               as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID              : String             as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied ClaimInfo
   * @param that The ClaimInfo to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : ClaimInfo) {
    // if field is on base class
      _accessPublicIDs                 = that.Access*.PublicID
      _adjusterPublicID                = that.Adjuster.PublicID
      _assignedGroupPublicID           = that.AssignedGroup.PublicID
      _assigneeDisplayName             = that.AssigneeDisplayName
      _claimAggregateLimitRptPublicIDs = that.ClaimAggregateLimitRpts*.PublicID
      _claimCurrency                   = that.ClaimCurrency
      _claimInAssociationPublicIDs     = that.ClaimInAssociations*.PublicID
      _claimPublicID                   = that.Claim.PublicID
      _claimantNames                   = that.ClaimantNames
      _contactPublicIDs                = that.Contacts*.PublicID
      _coverageLineMatchDataInfoValid  = that.CoverageLineMatchDataInfoValid
      _coverageLineMatchDataPublicIDs  = that.CoverageLineMatchData*.PublicID
      _createTime                      = that.CreateTime
      _createUserPublicID              = that.CreateUser.PublicID
      _currency                        = that.Currency
      _insuredPublicID                 = that.Insured.PublicID
      _loadCommandID                   = that.LoadCommandID
      _lossDate                        = that.LossDate
      _lossLocationPublicID            = that.LossLocation.PublicID
      _noticeDate                      = that.NoticeDate
      _policyPeriodPublicIDs           = that.PolicyPeriods*.PublicID
      _updateTime                      = that.UpdateTime
      _updateUserPublicID              = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied ClaimInfo
   * @param that The ClaimInfo to copy from.
   */
  final function readFrom(that : ClaimInfo) : ClaimInfoDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      ClaimNumber                      = that.ClaimNumber
      JurisdictionState                = that.JurisdictionState
      LossLocationCode                 = that.LossLocationCode
      PolicyNumber                     = that.PolicyNumber
      PublicID                         = that.PublicID
      PurgeDate                        = that.PurgeDate
    //
    return this
  }

  /**
   * Update the supplied ClaimInfo using the field values stored in this DTO
   * @param that The ClaimInfo to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the ClaimInfo, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : ClaimInfo, ignoreNullValues = true) : ClaimInfo {
    // if field is on base class
      if (ClaimNumber                     != null or !ignoreNullValues) that.ClaimNumber                     = ClaimNumber
      if (JurisdictionState               != null or !ignoreNullValues) that.JurisdictionState               = JurisdictionState
      if (LossLocationCode                != null or !ignoreNullValues) that.LossLocationCode                = LossLocationCode
      if (PolicyNumber                    != null or !ignoreNullValues) that.PolicyNumber                    = PolicyNumber
      if (PublicID                        != null or !ignoreNullValues) that.PublicID                        = PublicID
      if (PurgeDate                       != null or !ignoreNullValues) that.PurgeDate                       = PurgeDate
    //
    return that
  }

  /**
   * Uses the createNew block to create a new ClaimInfo, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new ClaimInfo.
   * @param createNew (Optional) A block that returns a new instance of ClaimInfo. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the ClaimInfo, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : ClaimInfo = null, ignoreNullValues = true) : ClaimInfo {
    var instance : ClaimInfo
    if (createNew == null) {
      instance = bundle == null
          ? new ClaimInfo()
          : new ClaimInfo(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns a {@link ClaimInfoAccess[]} of the objects whose PublicIDs are in {@code AccessPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Access()                       : ClaimInfoAccess[] { return fetchByPublicID(AccessPublicIDs) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code AdjusterPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Adjuster()                     : User              { return fetchByPublicID(AdjusterPublicID) }
  
  /** Convenience property that returns the {@link Group} whose PublicID is {@code AssignedGroupPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get AssignedGroup()                : Group             { return fetchByPublicID(AssignedGroupPublicID) }
  
  /** Convenience property that returns a {@link ClaimAggregateLimitRpt[]} of the objects whose PublicIDs are in {@code ClaimAggregateLimitRptPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get ClaimAggregateLimitRpts()      : ClaimAggregateLimitRpt[]{ return fetchByPublicID(ClaimAggregateLimitRptPublicIDs) }
  
  /** Convenience property that returns a {@link ClaimInAssociation[]} of the objects whose PublicIDs are in {@code ClaimInAssociationPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get ClaimInAssociations()          : ClaimInAssociation[]{ return fetchByPublicID(ClaimInAssociationPublicIDs) }
  
  /** Convenience property that returns the {@link Claim} whose PublicID is {@code ClaimPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claim()                        : Claim             { return fetchByPublicID(ClaimPublicID) }
  
  /** Convenience property that returns a {@link ContactInfo[]} of the objects whose PublicIDs are in {@code ContactPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Contacts()                     : ContactInfo[]     { return fetchByPublicID(ContactPublicIDs) }
  
  /** Convenience property that returns a {@link CoverageLineMatchDataInfo[]} of the objects whose PublicIDs are in {@code CoverageLineMatchDataPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CoverageLineMatchData()        : CoverageLineMatchDataInfo[]{ return fetchByPublicID(CoverageLineMatchDataPublicIDs) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()                   : User              { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link ContactInfo} whose PublicID is {@code InsuredPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Insured()                      : ContactInfo       { return fetchByPublicID(InsuredPublicID) }
  
  /** Convenience property that returns the {@link LocationInfo} whose PublicID is {@code LossLocationPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get LossLocation()                 : LocationInfo      { return fetchByPublicID(LossLocationPublicID) }
  
  /** Convenience property that returns a {@link List<PolicyPeriod>} of the objects whose PublicIDs are in {@code PolicyPeriodPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get PolicyPeriods()                : PolicyPeriod[]    { return fetchByPublicID(PolicyPeriodPublicIDs) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()                   : User              { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new ClaimInfoDTO that represents the current state of the supplied ClaimInfo.
   * @param that The ClaimInfo to be represented.
   */
  static function valueOf(that : ClaimInfo) : ClaimInfoDTO {
    return new ClaimInfoDTO().readFrom(that)
  }

  /**
   * Returns all of the ClaimInfo instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
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
   * Returns the ClaimInfo whose public ID is in the supplied list, or null if the publicID is null.
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