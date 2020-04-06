package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.lang.Integer
uses java.lang.Long
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link AddressDTO} is a DTO that represents an instance of {@link entity.Address} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.Address}.
 * <p>None of these methods constrain how an instance of AddressDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the AddressDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link AddressDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>AddressBookUID</td><td>Address.AddressBookUID</td></tr><tr><td>AddressLine1</td><td>Address.AddressLine1</td></tr><tr><td>AddressLine1Kanji</td><td>Address.AddressLine1Kanji</td></tr><tr><td>AddressLine2</td><td>Address.AddressLine2</td></tr><tr><td>AddressLine2Kanji</td><td>Address.AddressLine2Kanji</td></tr><tr><td>AddressLine3</td><td>Address.AddressLine3</td></tr><tr><td>AddressType</td><td>Address.AddressType</td></tr><tr><td>BatchGeocode</td><td>Address.BatchGeocode</td></tr><tr><td>BeanVersion</td><td>Address.BeanVersion</td></tr><tr><td>CEDEX</td><td>Address.CEDEX</td></tr><tr><td>CEDEXBureau</td><td>Address.CEDEXBureau</td></tr><tr><td>City</td><td>Address.City</td></tr><tr><td>CityKanji</td><td>Address.CityKanji</td></tr><tr><td>CityStateZip</td><td>Address.CityStateZip</td></tr><tr><td>Country</td><td>Address.Country</td></tr><tr><td>County</td><td>Address.County</td></tr><tr><td>CreateTime</td><td>Address.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Address.CreateUser.PublicID</td></tr><tr><td>Description</td><td>Address.Description</td></tr><tr><td>FailureGeocoding</td><td>Address.FailureGeocoding</td></tr><tr><td>GeocodeStatus</td><td>Address.GeocodeStatus</td></tr><tr><td>Latitude</td><td>Address.Latitude</td></tr><tr><td>LoadCommandID</td><td>Address.LoadCommandID</td></tr><tr><td>Longitude</td><td>Address.Longitude</td></tr><tr><td>NeverGeocoded</td><td>Address.NeverGeocoded</td></tr><tr><td>PostalCode</td><td>Address.PostalCode</td></tr><tr><td>PublicID</td><td>Address.PublicID</td></tr><tr><td>State</td><td>Address.State</td></tr><tr><td>SuccessfullyGeocoded</td><td>Address.SuccessfullyGeocoded</td></tr><tr><td>UpdateTime</td><td>Address.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Address.UpdateUser.PublicID</td></tr><tr><td>ValidUntil</td><td>Address.ValidUntil</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/AddressDTO")
final class AddressDTO {
  var _addressBookUID       : String               as AddressBookUID
  var _addressLine1         : String               as AddressLine1
  var _addressLine1Kanji    : String               as AddressLine1Kanji
  var _addressLine2         : String               as AddressLine2
  var _addressLine2Kanji    : String               as AddressLine2Kanji
  var _addressLine3         : String               as AddressLine3
  var _addressType          : AddressType          as AddressType
  var _batchGeocode         : Boolean              as BatchGeocode
  var _beanVersion          : Integer              as BeanVersion
  var _CEDEX                : Boolean              as CEDEX
  var _cEDEXBureau          : String               as CEDEXBureau
  var _city                 : String               as City
  var _cityKanji            : String               as CityKanji
  var _cityStateZip         : String               as CityStateZip
  var _country              : Country              as Country
  var _county               : String               as County
  var _createTime           : Date                 as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID   : String               as CreateUserPublicID
  var _description          : String               as Description
  var _failureGeocoding     : boolean              as FailureGeocoding
  var _geocodeStatus        : GeocodeStatus        as GeocodeStatus
  var _latitude             : java.math.BigDecimal as Latitude
  var _loadCommandID        : Long                 as LoadCommandID
  var _longitude            : java.math.BigDecimal as Longitude
  var _neverGeocoded        : boolean              as NeverGeocoded
  var _postalCode           : String               as PostalCode
  var _publicID             : String               as PublicID
  var _state                : State                as State
  var _successfullyGeocoded : boolean              as SuccessfullyGeocoded
  var _updateTime           : Date                 as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID   : String               as UpdateUserPublicID
  var _validUntil           : Date                 as ValidUntil

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Address
   * @param that The Address to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Address) {
    // if field is on base class
      _beanVersion          = that.BeanVersion
      _cityStateZip         = that.CityStateZip
      _createTime           = that.CreateTime
      _createUserPublicID   = that.CreateUser.PublicID
      _failureGeocoding     = that.FailureGeocoding
      _latitude             = that.Latitude
      _loadCommandID        = that.LoadCommandID
      _longitude            = that.Longitude
      _neverGeocoded        = that.NeverGeocoded
      _successfullyGeocoded = that.SuccessfullyGeocoded
      _updateTime           = that.UpdateTime
      _updateUserPublicID   = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied Address
   * @param that The Address to copy from.
   */
  final function readFrom(that : Address) : AddressDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      AddressBookUID        = that.AddressBookUID
      AddressLine1          = that.AddressLine1
      AddressLine1Kanji     = that.AddressLine1Kanji
      AddressLine2          = that.AddressLine2
      AddressLine2Kanji     = that.AddressLine2Kanji
      AddressLine3          = that.AddressLine3
      AddressType           = that.AddressType
      BatchGeocode          = that.BatchGeocode
      CEDEX                 = that.CEDEX
      CEDEXBureau           = that.CEDEXBureau
      City                  = that.City
      CityKanji             = that.CityKanji
      Country               = that.Country
      County                = that.County
      Description           = that.Description
      GeocodeStatus         = that.GeocodeStatus
      PostalCode            = that.PostalCode
      PublicID              = that.PublicID
      State                 = that.State
      ValidUntil            = that.ValidUntil
    //
    return this
  }

  /**
   * Update the supplied Address using the field values stored in this DTO
   * @param that The Address to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Address, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Address, ignoreNullValues = true) : Address {
    // if field is on base class
      if (AddressBookUID       != null or !ignoreNullValues) that.AddressBookUID       = AddressBookUID
      if (AddressLine1         != null or !ignoreNullValues) that.AddressLine1         = AddressLine1
      if (AddressLine1Kanji    != null or !ignoreNullValues) that.AddressLine1Kanji    = AddressLine1Kanji
      if (AddressLine2         != null or !ignoreNullValues) that.AddressLine2         = AddressLine2
      if (AddressLine2Kanji    != null or !ignoreNullValues) that.AddressLine2Kanji    = AddressLine2Kanji
      if (AddressLine3         != null or !ignoreNullValues) that.AddressLine3         = AddressLine3
      if (AddressType          != null or !ignoreNullValues) that.AddressType          = AddressType
      if (BatchGeocode         != null or !ignoreNullValues) that.BatchGeocode         = BatchGeocode
      if (CEDEX                != null or !ignoreNullValues) that.CEDEX                = CEDEX
      if (CEDEXBureau          != null or !ignoreNullValues) that.CEDEXBureau          = CEDEXBureau
      if (City                 != null or !ignoreNullValues) that.City                 = City
      if (CityKanji            != null or !ignoreNullValues) that.CityKanji            = CityKanji
      if (Country              != null or !ignoreNullValues) that.Country              = Country
      if (County               != null or !ignoreNullValues) that.County               = County
      if (Description          != null or !ignoreNullValues) that.Description          = Description
      if (GeocodeStatus        != null or !ignoreNullValues) that.GeocodeStatus        = GeocodeStatus
      if (PostalCode           != null or !ignoreNullValues) that.PostalCode           = PostalCode
      if (PublicID             != null or !ignoreNullValues) that.PublicID             = PublicID
      if (State                != null or !ignoreNullValues) that.State                = State
      if (ValidUntil           != null or !ignoreNullValues) that.ValidUntil           = ValidUntil
    //
    return that
  }

  /**
   * Uses the createNew block to create a new Address, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Address.
   * @param createNew (Optional) A block that returns a new instance of Address. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Address, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Address = null, ignoreNullValues = true) : Address {
    var instance : Address
    if (createNew == null) {
      instance = bundle == null
          ? new Address()
          : new Address(bundle)
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
  property get CreateUser()        : User                { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()        : User                { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new AddressDTO that represents the current state of the supplied Address.
   * @param that The Address to be represented.
   */
  static function valueOf(that : Address) : AddressDTO {
    return new AddressDTO().readFrom(that)
  }

  /**
   * Returns the Address whose public ID is in the supplied list, or null if the publicID is null.
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