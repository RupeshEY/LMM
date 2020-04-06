package gw.webservice.cc.cc901.dto

uses entity.Contact
uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses typekey.Currency

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link PolicyDTO} is a DTO that represents an instance of {@link Policy} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link Policy}.
 * <p>None of these methods constrain how an instance of PolicyDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the PolicyDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link PolicyDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>CreateTime</td><td>Policy.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Policy.CreateUser.PublicID</td></tr><tr><td>Currency</td><td>Policy.Currency</td></tr><tr><td>EffectiveDate</td><td>Policy.EffectiveDate</td></tr><tr><td>ExpirationDate</td><td>Policy.ExpirationDate</td></tr><tr><td>insuredPublicID</td><td>Policy.insured.PublicID</td></tr><tr><td>PolicyNumber</td><td>Policy.PolicyNumber</td></tr><tr><td>PolicyType</td><td>Policy.PolicyType</td></tr><tr><td>ProducerCode</td><td>Policy.ProducerCode</td></tr><tr><td>PublicID</td><td>Policy.PublicID</td></tr><tr><td>Status</td><td>Policy.Status</td></tr><tr><td>TotalVehicles</td><td>Policy.TotalVehicles</td></tr><tr><td>UpdateTime</td><td>Policy.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Policy.UpdateUser.PublicID</td></tr><tr><td>VehiclePublicIDs</td><td>Policy.Vehicles*.PublicID</td></tr><tr><td>Verified</td><td>Policy.Verified</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/PolicyDTO")
final class PolicyDTO {
  var _createTime         : Date         as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID : String       as CreateUserPublicID
  var _currency           : Currency     as Currency
  var _effectiveDate      : Date         as EffectiveDate
  var _expirationDate     : Date         as ExpirationDate
  /** Derived from gw.entity.GWPolicyEntityRoleConstraintsEnhancement#insured.PublicID */
  var _insuredPublicID    : String       as insuredPublicID
  var _policyNumber       : String       as PolicyNumber
  var _policyType         : PolicyType   as PolicyType
  var _producerCode       : String       as ProducerCode
  var _publicID           : String       as PublicID
  var _status             : PolicyStatus as Status
  var _totalVehicles      : Integer      as TotalVehicles
  var _updateTime         : Date         as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID : String       as UpdateUserPublicID
  /** Derived from Policy#Vehicles*.PublicID */
  var _vehiclePublicIDs   : String[]     as VehiclePublicIDs = {}
  var _verified           : Boolean      as Verified
  var _newinsured         : gw.webservice.cc.cc901.dto.ContactDTO as Newinsured

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Policy
   * @param that The Policy to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Policy) {
    // if field is on base class
      _createTime         = that.CreateTime
      _createUserPublicID = that.CreateUser.PublicID
      _updateTime         = that.UpdateTime
      _updateUserPublicID = that.UpdateUser.PublicID
      _vehiclePublicIDs   = that.Vehicles*.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied Policy
   * @param that The Policy to copy from.
   */
  final function readFrom(that : Policy) : PolicyDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      Currency            = that.Currency
      EffectiveDate       = that.EffectiveDate
      ExpirationDate      = that.ExpirationDate
      PolicyNumber        = that.PolicyNumber
      PolicyType          = that.PolicyType
      ProducerCode        = that.ProducerCode
      PublicID            = that.PublicID
      Status              = that.Status
      TotalVehicles       = that.TotalVehicles
      Verified            = that.Verified
      insuredPublicID     = that.insured.PublicID
    //
    return this
  }

  /**
   * Update the supplied Policy using the field values stored in this DTO
   * @param that The Policy to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Policy, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Policy, ignoreNullValues = true) : Policy {
    // if field is on base class
      if (Currency           != null or !ignoreNullValues) that.Currency           = Currency
      if (EffectiveDate      != null or !ignoreNullValues) that.EffectiveDate      = EffectiveDate
      if (ExpirationDate     != null or !ignoreNullValues) that.ExpirationDate     = ExpirationDate
      if (PolicyNumber       != null or !ignoreNullValues) that.PolicyNumber       = PolicyNumber
      if (PolicyType         != null or !ignoreNullValues) that.PolicyType         = PolicyType
      if (ProducerCode       != null or !ignoreNullValues) that.ProducerCode       = ProducerCode
      if (PublicID           != null or !ignoreNullValues) that.PublicID           = PublicID
      if (Status             != null or !ignoreNullValues) that.Status             = Status
      if (TotalVehicles      != null or !ignoreNullValues) that.TotalVehicles      = TotalVehicles
      if (Verified           != null or !ignoreNullValues) that.Verified           = Verified
      if (insuredPublicID    != null or !ignoreNullValues) that.insured            = insured
    //
    return that
  }

  /**
   * Uses the createNew block to create a new Policy, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Policy.
   * @param createNew (Optional) A block that returns a new instance of Policy. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Policy, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Policy = null, ignoreNullValues = true) : Policy {
    var instance : Policy
    if (createNew == null) {
      instance = bundle == null
          ? new Policy()
          : new Policy(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()      : User        { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link Contact} whose PublicID is {@code insuredPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get insured()         : Contact     { return fetchByPublicID(insuredPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()      : User        { return fetchByPublicID(UpdateUserPublicID) }
  
  /** Convenience property that returns a {@link VehicleRU[]} of the objects whose PublicIDs are in {@code VehiclePublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Vehicles()        : VehicleRU[] { return fetchByPublicID(VehiclePublicIDs) }

  /**
   * return a new PolicyDTO that represents the current state of the supplied Policy.
   * @param that The Policy to be represented.
   */
  static function valueOf(that : Policy) : PolicyDTO {
    return new PolicyDTO().readFrom(that)
  }

  /**
   * Returns all of the Policy instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
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
   * Returns the Policy whose public ID is in the supplied list, or null if the publicID is null.
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
