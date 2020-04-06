package gw.webservice.cc.cc901.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link PolicySummaryDTO} is a DTO that represents an instance of {@link PolicySummary} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link PolicySummary}.
 * <p>None of these methods constrain how an instance of PolicySummaryDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the PolicySummaryDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link PolicySummaryDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>CanSelectProperties</td><td>PolicySummary.CanSelectProperties</td></tr><tr><td>CanSelectRiskUnits</td><td>PolicySummary.CanSelectRiskUnits</td></tr><tr><td>CanSelectVehicles</td><td>PolicySummary.CanSelectVehicles</td></tr><tr><td>City</td><td>PolicySummary.City</td></tr><tr><td>EffectiveDate</td><td>PolicySummary.EffectiveDate</td></tr><tr><td>ExpirationDate</td><td>PolicySummary.ExpirationDate</td></tr><tr><td>InsuredName</td><td>PolicySummary.InsuredName</td></tr><tr><td>LossDate</td><td>PolicySummary.LossDate</td></tr><tr><td>PolicyNumber</td><td>PolicySummary.PolicyNumber</td></tr><tr><td>PolicyType</td><td>PolicySummary.PolicyType</td></tr><tr><td>PostalCode</td><td>PolicySummary.PostalCode</td></tr><tr><td>ProducerCode</td><td>PolicySummary.ProducerCode</td></tr><tr><td>PropertyInvolvedPublicID</td><td>PolicySummary.PropertyInvolved.PublicID</td></tr><tr><td>PropertyPolicyType</td><td>PolicySummary.PropertyPolicyType</td></tr><tr><td>PublicID</td><td>PolicySummary.PublicID</td></tr><tr><td>State</td><td>PolicySummary.State</td></tr><tr><td>Status</td><td>PolicySummary.Status</td></tr><tr><td>VehicleInvolvedPublicID</td><td>PolicySummary.VehicleInvolved.PublicID</td></tr><tr><td>VehiclePolicyType</td><td>PolicySummary.VehiclePolicyType</td></tr><tr><td>VehiclePublicIDs</td><td>PolicySummary.Vehicles*.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/PolicySummaryDTO")
final class PolicySummaryDTO {
  var _canSelectProperties      : boolean      as CanSelectProperties
  var _canSelectRiskUnits       : boolean      as CanSelectRiskUnits
  var _canSelectVehicles        : boolean      as CanSelectVehicles
  var _city                     : String       as City
  var _effectiveDate            : Date         as EffectiveDate
  var _expirationDate           : Date         as ExpirationDate
  var _insuredName              : String       as InsuredName
  var _lossDate                 : Date         as LossDate
  var _policyNumber             : String       as PolicyNumber
  var _policyType               : PolicyType   as PolicyType
  var _postalCode               : String       as PostalCode
  var _producerCode             : String       as ProducerCode
  /** Derived from PolicySummary#PropertyInvolved.PublicID */
  var _propertyInvolvedPublicID : String       as PropertyInvolvedPublicID
  var _propertyPolicyType       : boolean      as PropertyPolicyType
  var _publicID                 : String       as PublicID
  var _state                    : State        as State
  var _status                   : PolicyStatus as Status
  /** Derived from PolicySummary#VehicleInvolved.PublicID */
  var _vehicleInvolvedPublicID  : String       as VehicleInvolvedPublicID
  var _vehiclePolicyType        : boolean      as VehiclePolicyType
  /** Derived from PolicySummary#Vehicles*.PublicID */
  var _vehiclePublicIDs         : String[]     as VehiclePublicIDs = {}

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied PolicySummary
   * @param that The PolicySummary to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : PolicySummary) {
    // if field is on base class
      _canSelectProperties      = that.CanSelectProperties
      _canSelectRiskUnits       = that.CanSelectRiskUnits
      _canSelectVehicles        = that.CanSelectVehicles
      _propertyPolicyType       = that.PropertyPolicyType
      _vehiclePolicyType        = that.VehiclePolicyType
      _vehiclePublicIDs         = that.Vehicles*.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied PolicySummary
   * @param that The PolicySummary to copy from.
   */
  final function readFrom(that : PolicySummary) : PolicySummaryDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      City                      = that.City
      EffectiveDate             = that.EffectiveDate
      ExpirationDate            = that.ExpirationDate
      InsuredName               = that.InsuredName
      LossDate                  = that.LossDate
      PolicyNumber              = that.PolicyNumber
      PolicyType                = that.PolicyType
      PostalCode                = that.PostalCode
      ProducerCode              = that.ProducerCode
      PropertyInvolvedPublicID  = that.PropertyInvolved.PublicID
      PublicID                  = that.PublicID
      State                     = that.State
      Status                    = that.Status
      VehicleInvolvedPublicID   = that.VehicleInvolved.PublicID
    //
    return this
  }

  /**
   * Update the supplied PolicySummary using the field values stored in this DTO
   * @param that The PolicySummary to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the PolicySummary, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : PolicySummary, ignoreNullValues = true) : PolicySummary {
    // if field is on base class
      if (City                     != null or !ignoreNullValues) that.City                     = City
      if (EffectiveDate            != null or !ignoreNullValues) that.EffectiveDate            = EffectiveDate
      if (ExpirationDate           != null or !ignoreNullValues) that.ExpirationDate           = ExpirationDate
      if (InsuredName              != null or !ignoreNullValues) that.InsuredName              = InsuredName
      if (LossDate                 != null or !ignoreNullValues) that.LossDate                 = LossDate
      if (PolicyNumber             != null or !ignoreNullValues) that.PolicyNumber             = PolicyNumber
      if (PolicyType               != null or !ignoreNullValues) that.PolicyType               = PolicyType
      if (PostalCode               != null or !ignoreNullValues) that.PostalCode               = PostalCode
      if (ProducerCode             != null or !ignoreNullValues) that.ProducerCode             = ProducerCode
      if (PropertyInvolvedPublicID != null or !ignoreNullValues) that.PropertyInvolved         = PropertyInvolved
      if (PublicID                 != null or !ignoreNullValues) that.PublicID                 = PublicID
      if (State                    != null or !ignoreNullValues) that.State                    = State
      if (Status                   != null or !ignoreNullValues) that.Status                   = Status
      if (VehicleInvolvedPublicID  != null or !ignoreNullValues) that.VehicleInvolved          = VehicleInvolved
    //
    return that
  }

  /**
   * Uses the createNew block to create a new PolicySummary, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new PolicySummary.
   * @param createNew (Optional) A block that returns a new instance of PolicySummary. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the PolicySummary, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : PolicySummary = null, ignoreNullValues = true) : PolicySummary {
    var instance : PolicySummary
    if (createNew == null) {
      instance = bundle == null
          ? new PolicySummary()
          : new PolicySummary(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns the {@link PolicySummaryProperty} whose PublicID is {@code PropertyInvolvedPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get PropertyInvolved()      : PolicySummaryProperty{ return fetchByPublicID(PropertyInvolvedPublicID) }
  
  /** Convenience property that returns the {@link PolicySummaryVehicle} whose PublicID is {@code VehicleInvolvedPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get VehicleInvolved()       : PolicySummaryVehicle{ return fetchByPublicID(VehicleInvolvedPublicID) }
  
  /** Convenience property that returns a {@link PolicySummaryVehicle[]} of the objects whose PublicIDs are in {@code VehiclePublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Vehicles()              : PolicySummaryVehicle[]{ return fetchByPublicID(VehiclePublicIDs) }

  /**
   * return a new PolicySummaryDTO that represents the current state of the supplied PolicySummary.
   * @param that The PolicySummary to be represented.
   */
  static function valueOf(that : PolicySummary) : PolicySummaryDTO {
    return new PolicySummaryDTO().readFrom(that)
  }

  /**
   * Returns all of the PolicySummary instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
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
   * Returns the PolicySummary whose public ID is in the supplied list, or null if the publicID is null.
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