package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link ActivityDTO} is a DTO that represents an instance of {@link entity.Activity} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.Activity}.
 * <p>None of these methods constrain how an instance of ActivityDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the ActivityDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link ActivityDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>ActivityClass</td><td>Activity.ActivityClass</td></tr><tr><td>ActivityPatternPublicID</td><td>Activity.ActivityPattern.PublicID</td></tr><tr><td>ActivityStatus</td><td>Activity.ActivityStatus</td></tr><tr><td>ApprovalIssue</td><td>Activity.ApprovalIssue</td></tr><tr><td>AssignedGroupPublicID</td><td>Activity.AssignedGroup.PublicID</td></tr><tr><td>AssignedUserPublicID</td><td>Activity.AssignedUser.PublicID</td></tr><tr><td>ClaimantPublicID</td><td>Activity.Claimant.PublicID</td></tr><tr><td>ClaimPublicID</td><td>Activity.Claim.PublicID</td></tr><tr><td>CreateTime</td><td>Activity.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Activity.CreateUser.PublicID</td></tr><tr><td>Description</td><td>Activity.Description</td></tr><tr><td>ExposurePublicID</td><td>Activity.Exposure.PublicID</td></tr><tr><td>PublicID</td><td>Activity.PublicID</td></tr><tr><td>Subject</td><td>Activity.Subject</td></tr><tr><td>Type</td><td>Activity.Type</td></tr><tr><td>UpdateTime</td><td>Activity.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Activity.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/ActivityDTO")
final class ActivityDTO {
  var _activityClass           : ActivityClass as ActivityClass
  /** Derived from Activity#ActivityPattern.PublicID */
  var _activityPatternPublicID : String        as ActivityPatternPublicID
  var _activityStatus          : String        as ActivityStatus
  var _approvalIssue           : String        as ApprovalIssue
  /** Derived from Activity#AssignedGroup.PublicID */
  var _assignedGroupPublicID   : String        as AssignedGroupPublicID
  /** Derived from Activity#AssignedUser.PublicID */
  var _assignedUserPublicID    : String        as AssignedUserPublicID
  /** Derived from Activity#Claimant.PublicID */
  var _claimantPublicID        : String        as ClaimantPublicID
  /** Derived from Activity#Claim.PublicID */
  var _claimPublicID           : String        as ClaimPublicID
  var _createTime              : Date          as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID      : String        as CreateUserPublicID
  var _description             : String        as Description
  /** Derived from Activity#Exposure.PublicID */
  var _exposurePublicID        : String        as ExposurePublicID
  var _newNotes                : NoteDTO[]     as NewNotes = {}
  var _publicID                : String        as PublicID
  var _subject                 : String        as Subject
  var _type                    : ActivityType  as Type
  var _updateTime              : Date          as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID      : String        as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Activity
   * @param that The Activity to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Activity) {
    // if field is on base class
      _activityStatus          = that.ActivityStatus
      _createTime              = that.CreateTime
      _createUserPublicID      = that.CreateUser.PublicID
      _updateTime              = that.UpdateTime
      _updateUserPublicID      = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied Activity
   * @param that The Activity to copy from.
   */
  final function readFrom(that : Activity) : ActivityDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      ActivityClass            = that.ActivityClass
      ActivityPatternPublicID  = that.ActivityPattern.PublicID
      ApprovalIssue            = that.ApprovalIssue
      AssignedGroupPublicID    = that.AssignedGroup.PublicID
      AssignedUserPublicID     = that.AssignedUser.PublicID
      ClaimPublicID            = that.Claim.PublicID
      ClaimantPublicID         = that.Claimant.PublicID
      Description              = that.Description
      ExposurePublicID         = that.Exposure.PublicID
      PublicID                 = that.PublicID
      Subject                  = that.Subject
      Type                     = that.Type
    //
    return this
  }

  /**
   * Update the supplied Activity using the field values stored in this DTO
   * @param that The Activity to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Activity, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Activity, ignoreNullValues = true) : Activity {
    // if field is on base class
      if (ActivityClass           != null or !ignoreNullValues) that.ActivityClass           = ActivityClass
      if (ActivityPatternPublicID != null or !ignoreNullValues) that.ActivityPattern         = ActivityPattern
      if (ApprovalIssue           != null or !ignoreNullValues) that.ApprovalIssue           = ApprovalIssue
      if (AssignedGroupPublicID   != null or !ignoreNullValues) that.AssignedGroup           = AssignedGroup
      if (AssignedUserPublicID    != null or !ignoreNullValues) that.AssignedUser            = AssignedUser
      if (ClaimPublicID           != null or !ignoreNullValues) that.Claim                   = Claim
      if (ClaimantPublicID        != null or !ignoreNullValues) that.Claimant                = Claimant
      if (Description             != null or !ignoreNullValues) that.Description             = Description
      if (ExposurePublicID        != null or !ignoreNullValues) that.Exposure                = Exposure
      if (PublicID                != null or !ignoreNullValues) that.PublicID                = PublicID
      if (Subject                 != null or !ignoreNullValues) that.Subject                 = Subject
      if (Type                    != null or !ignoreNullValues) that.Type                    = Type
    //
    return that
  }

  /**
   * Uses the createNew block to create a new Activity, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Activity.
   * @param createNew (Optional) A block that returns a new instance of Activity. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Activity, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Activity = null, ignoreNullValues = true) : Activity {
    var instance : Activity
    if (createNew == null) {
      instance = bundle == null
          ? new Activity()
          : new Activity(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns the {@link ActivityPattern} whose PublicID is {@code ActivityPatternPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get ActivityPattern()      : ActivityPattern{ return fetchByPublicID(ActivityPatternPublicID) }
  
  /** Convenience property that returns the {@link Group} whose PublicID is {@code AssignedGroupPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get AssignedGroup()        : Group        { return fetchByPublicID(AssignedGroupPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code AssignedUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get AssignedUser()         : User         { return fetchByPublicID(AssignedUserPublicID) }
  
  /** Convenience property that returns the {@link Contact} whose PublicID is {@code ClaimantPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claimant()             : Contact      { return fetchByPublicID(ClaimantPublicID) }
  
  /** Convenience property that returns the {@link Claim} whose PublicID is {@code ClaimPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claim()                : Claim        { return fetchByPublicID(ClaimPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()           : User         { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link Exposure} whose PublicID is {@code ExposurePublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Exposure()             : Exposure     { return fetchByPublicID(ExposurePublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()           : User         { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new ActivityDTO that represents the current state of the supplied Activity.
   * @param that The Activity to be represented.
   */
  static function valueOf(that : Activity) : ActivityDTO {
    return new ActivityDTO().readFrom(that)
  }

  /**
   * Returns the Activity whose public ID is in the supplied list, or null if the publicID is null.
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