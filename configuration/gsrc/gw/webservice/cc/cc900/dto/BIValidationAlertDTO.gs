package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link BIValidationAlertDTO} is a DTO that represents an instance of {@link entity.BIValidationAlert} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.BIValidationAlert}.
 * <p>None of these methods constrain how an instance of BIValidationAlertDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the BIValidationAlertDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link BIValidationAlertDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>AlertMsg</td><td>BIValidationAlert.AlertMsg</td></tr><tr><td>AlertType</td><td>BIValidationAlert.AlertType</td></tr><tr><td>BulkInvoicePublicID</td><td>BIValidationAlert.BulkInvoice.PublicID</td></tr><tr><td>CreateTime</td><td>BIValidationAlert.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>BIValidationAlert.CreateUser.PublicID</td></tr><tr><td>PublicID</td><td>BIValidationAlert.PublicID</td></tr><tr><td>UpdateTime</td><td>BIValidationAlert.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>BIValidationAlert.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/BIValidationAlertDTO")
final class BIValidationAlertDTO {
  var _alertMsg            : String                as AlertMsg
  var _alertType           : BIValidationAlertType as AlertType
  /** Derived from BIValidationAlert#BulkInvoice.PublicID */
  var _bulkInvoicePublicID : String                as BulkInvoicePublicID
  var _createTime          : Date                  as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID  : String                as CreateUserPublicID
  var _publicID            : String                as PublicID
  var _updateTime          : Date                  as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID  : String                as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied BIValidationAlert
   * @param that The BIValidationAlert to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : BIValidationAlert) {
    // if field is on base class
      _createTime          = that.CreateTime
      _createUserPublicID  = that.CreateUser.PublicID
      _updateTime          = that.UpdateTime
      _updateUserPublicID  = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied BIValidationAlert
   * @param that The BIValidationAlert to copy from.
   */
  final function readFrom(that : BIValidationAlert) : BIValidationAlertDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      AlertMsg             = that.AlertMsg
      AlertType            = that.AlertType
      BulkInvoicePublicID  = that.BulkInvoice.PublicID
      PublicID             = that.PublicID
    //
    return this
  }

  /**
   * Update the supplied BIValidationAlert using the field values stored in this DTO
   * @param that The BIValidationAlert to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the BIValidationAlert, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : BIValidationAlert, ignoreNullValues = true) : BIValidationAlert {
    // if field is on base class
      if (AlertMsg            != null or !ignoreNullValues) that.AlertMsg            = AlertMsg
      if (AlertType           != null or !ignoreNullValues) that.AlertType           = AlertType
      if (BulkInvoicePublicID != null or !ignoreNullValues) that.BulkInvoice         = BulkInvoice
      if (PublicID            != null or !ignoreNullValues) that.PublicID            = PublicID
    //
    return that
  }

  /**
   * Uses the createNew block to create a new BIValidationAlert, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new BIValidationAlert.
   * @param createNew (Optional) A block that returns a new instance of BIValidationAlert. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the BIValidationAlert, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : BIValidationAlert = null, ignoreNullValues = true) : BIValidationAlert {
    var instance : BIValidationAlert
    if (createNew == null) {
      instance = bundle == null
          ? new BIValidationAlert()
          : new BIValidationAlert(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns the {@link BulkInvoice} whose PublicID is {@code BulkInvoicePublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get BulkInvoice()      : BulkInvoice          { return fetchByPublicID(BulkInvoicePublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()       : User                 { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()       : User                 { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new BIValidationAlertDTO that represents the current state of the supplied BIValidationAlert.
   * @param that The BIValidationAlert to be represented.
   */
  static function valueOf(that : BIValidationAlert) : BIValidationAlertDTO {
    return new BIValidationAlertDTO().readFrom(that)
  }

  /**
   * Returns the BIValidationAlert whose public ID is in the supplied list, or null if the publicID is null.
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