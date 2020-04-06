package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.lang.reflect.ReflectUtil
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link IncidentDTO} is a DTO that represents an instance of {@link entity.Incident} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.Incident}.
 * <p>None of these methods constrain how an instance of IncidentDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the IncidentDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link IncidentDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>AmbulanceUsed</td><td>InjuryIncident.AmbulanceUsed</td></tr><tr><td>ClaimPublicID</td><td>Incident.Claim.PublicID</td></tr><tr><td>CreateTime</td><td>Incident.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Incident.CreateUser.PublicID</td></tr><tr><td>Description</td><td>Incident.Description</td></tr><tr><td>DetailedInjuryType</td><td>InjuryIncident.DetailedInjuryType</td></tr><tr><td>DisabledDueToAccident</td><td>InjuryIncident.DisabledDueToAccident</td></tr><tr><td>driverPublicID</td><td>Incident.driver.PublicID</td></tr><tr><td>ExposurePublicIDs</td><td>Incident.Exposures*.PublicID</td></tr><tr><td>GeneralInjuryType</td><td>InjuryIncident.GeneralInjuryType</td></tr><tr><td>injuredPublicID</td><td>Incident.injured.PublicID</td></tr><tr><td>LocationAddressPublicID</td><td>MobilePropertyIncident.LocationAddress.PublicID</td></tr><tr><td>LossDesc</td><td>MobilePropertyIncident.LossDesc</td></tr><tr><td>LossOccured</td><td>MobilePropertyIncident.LossOccured</td></tr><tr><td>LossofUse</td><td>PropertyIncident.LossofUse</td></tr><tr><td>MedicalTreatmentType</td><td>InjuryIncident.MedicalTreatmentType</td></tr><tr><td>PropertyDesc</td><td>PropertyIncident.PropertyDesc</td></tr><tr><td>PublicID</td><td>Incident.PublicID</td></tr><tr><td>Severity</td><td>Incident.Severity</td></tr><tr><td>Subtype</td><td>Incident.Subtype</td></tr><tr><td>TypeofPropertyPublicIDs</td><td>PropertyIncident.TypeofProperty*.PublicID</td></tr><tr><td>UpdateTime</td><td>Incident.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Incident.UpdateUser.PublicID</td></tr><tr><td>VehiclePublicID</td><td>VehicleIncident.Vehicle.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/IncidentDTO")
final class IncidentDTO {
  var _ambulanceUsed           : Boolean               as AmbulanceUsed
  /** Derived from Incident#Claim.PublicID */
  var _claimPublicID           : String                as ClaimPublicID
  var _createTime              : Date                  as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID      : String                as CreateUserPublicID
  var _description             : String                as Description
  var _detailedInjuryType      : DetailedInjuryType    as DetailedInjuryType
  var _disabledDueToAccident   : DisabledDueToAccident as DisabledDueToAccident
  /** Derived from gw.entity.GWVehicleIncidentEntityRoleConstraintsEnhancement#driver.PublicID */
  var _driverPublicID          : String                as driverPublicID
  /** Derived from Incident#Exposures*.PublicID */
  var _exposurePublicIDs       : String[]              as ExposurePublicIDs = {}
  var _generalInjuryType       : InjuryType            as GeneralInjuryType
  /** Derived from gw.entity.GWInjuryIncidentEntityRoleConstraintsEnhancement#injured.PublicID */
  var _injuredPublicID         : String                as injuredPublicID
  /** Derived from MobilePropertyIncident#LocationAddress.PublicID */
  var _locationAddressPublicID : String                as LocationAddressPublicID
  var _lossDesc                : String                as LossDesc
  var _lossOccured             : LossOccured           as LossOccured
  var _lossofUse               : Boolean               as LossofUse
  var _medicalTreatmentType    : MedicalTreatmentType  as MedicalTreatmentType
  var _newExposures            : ExposureDTO[]         as NewExposures = {}
  var _propertyDesc            : String                as PropertyDesc
  var _publicID                : String                as PublicID
  var _severity                : SeverityType          as Severity
  var _subtype                 : typekey.Incident      as Subtype
  /** Derived from PropertyIncident#TypeofProperty*.PublicID */
  var _typeofPropertyPublicIDs : String[]              as TypeofPropertyPublicIDs = {}
  var _updateTime              : Date                  as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID      : String                as UpdateUserPublicID
  /** Derived from VehicleIncident#Vehicle.PublicID */
  var _vehiclePublicID         : String                as VehiclePublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Incident
   * @param that The Incident to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Incident) {
    // if field is on base class
      _createTime              = that.CreateTime
      _createUserPublicID      = that.CreateUser.PublicID
      _exposurePublicIDs       = that.Exposures*.PublicID
      _subtype                 = that.Subtype
      _updateTime              = that.UpdateTime
      _updateUserPublicID      = that.UpdateUser.PublicID
    //
    if (that typeis PropertyIncident) {
      _typeofPropertyPublicIDs = that.TypeofProperty*.PublicID
    }
  }

  /**
   * Set the fields in this DTO using the supplied Incident
   * @param that The Incident to copy from.
   */
  final function readFrom(that : Incident) : IncidentDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      ClaimPublicID            = that.Claim.PublicID
      Description              = that.Description
      PublicID                 = that.PublicID
      Severity                 = that.Severity
    //
    if (that typeis InjuryIncident) {
      AmbulanceUsed            = that.AmbulanceUsed
      DetailedInjuryType       = that.DetailedInjuryType
      DisabledDueToAccident    = that.DisabledDueToAccident
      GeneralInjuryType        = that.GeneralInjuryType
      MedicalTreatmentType     = that.MedicalTreatmentType
      injuredPublicID          = that.injured.PublicID
    }
    if (that typeis MobilePropertyIncident) {
      LocationAddressPublicID  = that.LocationAddress.PublicID
      LossDesc                 = that.LossDesc
      LossOccured              = that.LossOccured
    }
    if (that typeis PropertyIncident) {
      LossofUse                = that.LossofUse
      PropertyDesc             = that.PropertyDesc
    }
    if (that typeis VehicleIncident) {
      VehiclePublicID          = that.Vehicle.PublicID
      driverPublicID           = that.driver.PublicID
    }
    return this
  }

  /**
   * Update the supplied Incident using the field values stored in this DTO
   * @param that The Incident to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Incident, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Incident, ignoreNullValues = true) : Incident {
    // if field is on base class
      if (ClaimPublicID           != null or !ignoreNullValues) that.Claim                   = Claim
      if (Description             != null or !ignoreNullValues) that.Description             = Description
      if (PublicID                != null or !ignoreNullValues) that.PublicID                = PublicID
      if (Severity                != null or !ignoreNullValues) that.Severity                = Severity
    //
    if (that typeis InjuryIncident) {
      if (AmbulanceUsed           != null or !ignoreNullValues) that.AmbulanceUsed           = AmbulanceUsed
      if (DetailedInjuryType      != null or !ignoreNullValues) that.DetailedInjuryType      = DetailedInjuryType
      if (DisabledDueToAccident   != null or !ignoreNullValues) that.DisabledDueToAccident   = DisabledDueToAccident
      if (GeneralInjuryType       != null or !ignoreNullValues) that.GeneralInjuryType       = GeneralInjuryType
      if (MedicalTreatmentType    != null or !ignoreNullValues) that.MedicalTreatmentType    = MedicalTreatmentType
      if (injuredPublicID         != null or !ignoreNullValues) that.injured                 = injured
    }
    if (that typeis MobilePropertyIncident) {
      if (LocationAddressPublicID != null or !ignoreNullValues) that.LocationAddress         = LocationAddress
      if (LossDesc                != null or !ignoreNullValues) that.LossDesc                = LossDesc
      if (LossOccured             != null or !ignoreNullValues) that.LossOccured             = LossOccured
    }
    if (that typeis PropertyIncident) {
      if (LossofUse               != null or !ignoreNullValues) that.LossofUse               = LossofUse
      if (PropertyDesc            != null or !ignoreNullValues) that.PropertyDesc            = PropertyDesc
    }
    if (that typeis VehicleIncident) {
      if (VehiclePublicID         != null or !ignoreNullValues) that.Vehicle                 = Vehicle
      if (driverPublicID          != null or !ignoreNullValues) that.driver                  = driver
    }
    return that
  }

  /**
   * Uses the createNew block to create a new Incident, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Incident.
   * @param createNew (Optional) A block that returns a new instance of Incident. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Incident, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Incident = null, ignoreNullValues = true) : Incident {
    var instance : Incident
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
   * Returns the name of the instantiable subclass referred to by the Subtype typekey, or the base class Incident if there is none.
   */
  final property get ConcreteSubtypeClassName() : String {
    return "entity." + (Subtype.Code ?: "Incident")
  }

  /** Convenience property that returns the {@link Claim} whose PublicID is {@code ClaimPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claim()                : Claim                { return fetchByPublicID(ClaimPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()           : User                 { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link Person} whose PublicID is {@code driverPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get driver()               : Person               { return fetchByPublicID(driverPublicID) }
  
  /** Convenience property that returns a {@link Exposure[]} of the objects whose PublicIDs are in {@code ExposurePublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Exposures()            : Exposure[]           { return fetchByPublicID(ExposurePublicIDs) }
  
  /** Convenience property that returns the {@link Person} whose PublicID is {@code injuredPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get injured()              : Person               { return fetchByPublicID(injuredPublicID) }
  
  /** Convenience property that returns the {@link Address} whose PublicID is {@code LocationAddressPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get LocationAddress()      : Address              { return fetchByPublicID(LocationAddressPublicID) }
  
  /** Convenience property that returns a {@link TypeofProperty[]} of the objects whose PublicIDs are in {@code TypeofPropertyPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get TypeofProperty()       : TypeofProperty[]     { return fetchByPublicID(TypeofPropertyPublicIDs) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()           : User                 { return fetchByPublicID(UpdateUserPublicID) }
  
  /** Convenience property that returns the {@link Vehicle} whose PublicID is {@code VehiclePublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Vehicle()              : Vehicle              { return fetchByPublicID(VehiclePublicID) }

  /**
   * return a new IncidentDTO that represents the current state of the supplied Incident.
   * @param that The Incident to be represented.
   */
  static function valueOf(that : Incident) : IncidentDTO {
    return new IncidentDTO().readFrom(that)
  }

  /**
   * Returns all of the Incident instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
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
   * Returns the Incident whose public ID is in the supplied list, or null if the publicID is null.
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