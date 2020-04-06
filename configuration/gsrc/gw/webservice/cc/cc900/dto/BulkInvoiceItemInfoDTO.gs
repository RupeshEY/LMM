package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link BulkInvoiceItemInfoDTO} is a DTO that represents an instance of {@link entity.BulkInvoiceItemInfo} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.BulkInvoiceItemInfo}.
 * <p>None of these methods constrain how an instance of BulkInvoiceItemInfoDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the BulkInvoiceItemInfoDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link BulkInvoiceItemInfoDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>CheckPublicID</td><td>BulkInvoiceItemInfo.Check.PublicID</td></tr><tr><td>CreateTime</td><td>BulkInvoiceItemInfo.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>BulkInvoiceItemInfo.CreateUser.PublicID</td></tr><tr><td>PublicID</td><td>BulkInvoiceItemInfo.PublicID</td></tr><tr><td>UpdateTime</td><td>BulkInvoiceItemInfo.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>BulkInvoiceItemInfo.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/BulkInvoiceItemInfoDTO")
final class BulkInvoiceItemInfoDTO {
  /** Derived from BulkInvoiceItemInfo#Check.PublicID */
  var _checkPublicID      : String as CheckPublicID
  var _createTime         : Date   as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID : String as CreateUserPublicID
  var _publicID           : String as PublicID
  var _reserveLineID      : String as ReserveLineID
  var _updateTime         : Date   as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID : String as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied BulkInvoiceItemInfo
   * @param that The BulkInvoiceItemInfo to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : BulkInvoiceItemInfo) {
    // if field is on base class
      _checkPublicID      = that.Check.PublicID
      _createTime         = that.CreateTime
      _createUserPublicID = that.CreateUser.PublicID
      _updateTime         = that.UpdateTime
      _updateUserPublicID = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied BulkInvoiceItemInfo
   * @param that The BulkInvoiceItemInfo to copy from.
   */
  final function readFrom(that : BulkInvoiceItemInfo) : BulkInvoiceItemInfoDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      PublicID            = that.PublicID
    //
    return this
  }

  /**
   * Update the supplied BulkInvoiceItemInfo using the field values stored in this DTO
   * @param that The BulkInvoiceItemInfo to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the BulkInvoiceItemInfo, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : BulkInvoiceItemInfo, ignoreNullValues = true) : BulkInvoiceItemInfo {
    // if field is on base class
      if (PublicID           != null or !ignoreNullValues) that.PublicID           = PublicID
    //
    return that
  }

  /**
   * Uses the createNew block to create a new BulkInvoiceItemInfo, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new BulkInvoiceItemInfo.
   * @param createNew (Optional) A block that returns a new instance of BulkInvoiceItemInfo. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the BulkInvoiceItemInfo, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : BulkInvoiceItemInfo = null, ignoreNullValues = true) : BulkInvoiceItemInfo {
    var instance : BulkInvoiceItemInfo
    if (createNew == null) {
      instance = bundle == null
          ? new BulkInvoiceItemInfo()
          : new BulkInvoiceItemInfo(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns the {@link Check} whose PublicID is {@code CheckPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Check()           : Check { return fetchByPublicID(CheckPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()      : User  { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()      : User  { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new BulkInvoiceItemInfoDTO that represents the current state of the supplied BulkInvoiceItemInfo.
   * @param that The BulkInvoiceItemInfo to be represented.
   */
  static function valueOf(that : BulkInvoiceItemInfo) : BulkInvoiceItemInfoDTO {
    return new BulkInvoiceItemInfoDTO().readFrom(that)
  }

  /**
   * Returns the BulkInvoiceItemInfo whose public ID is in the supplied list, or null if the publicID is null.
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