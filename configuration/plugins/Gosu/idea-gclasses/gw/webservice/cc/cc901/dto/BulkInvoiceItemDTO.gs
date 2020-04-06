package gw.webservice.cc.cc901.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses typekey.Currency

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link gw.webservice.cc.cc901.dto.BulkInvoiceItemDTO} is a DTO that represents an instance of {@link BulkInvoiceItem} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link BulkInvoiceItem}.
 * <p>None of these methods constrain how an instance of BulkInvoiceItemDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the BulkInvoiceItemDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link gw.webservice.cc.cc901.dto.BulkInvoiceItemDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>Amount</td><td>BulkInvoiceItem.Amount</td></tr><tr><td>BulkInvoiceOrder</td><td>BulkInvoiceItem.BulkInvoiceOrder</td></tr><tr><td>BulkInvoicePublicID</td><td>BulkInvoiceItem.BulkInvoice.PublicID</td></tr><tr><td>ClaimPublicID</td><td>BulkInvoiceItem.Claim.PublicID</td></tr><tr><td>CostCategory</td><td>BulkInvoiceItem.CostCategory</td></tr><tr><td>CostType</td><td>BulkInvoiceItem.CostType</td></tr><tr><td>CreateTime</td><td>BulkInvoiceItem.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>BulkInvoiceItem.CreateUser.PublicID</td></tr><tr><td>DateOfService</td><td>BulkInvoiceItem.DateOfService</td></tr><tr><td>DeductionsAmount</td><td>BulkInvoiceItem.DeductionsAmount</td></tr><tr><td>Description</td><td>BulkInvoiceItem.Description</td></tr><tr><td>Explanation</td><td>BulkInvoiceItem.Explanation</td></tr><tr><td>ExposurePublicID</td><td>BulkInvoiceItem.Exposure.PublicID</td></tr><tr><td>NonEroding</td><td>BulkInvoiceItem.NonEroding</td></tr><tr><td>PaymentType</td><td>BulkInvoiceItem.PaymentType</td></tr><tr><td>PublicID</td><td>BulkInvoiceItem.PublicID</td></tr><tr><td>ReservingCurrency</td><td>BulkInvoiceItem.ReservingCurrency</td></tr><tr><td>ServicePdEnd</td><td>BulkInvoiceItem.ServicePdEnd</td></tr><tr><td>ServicePdStart</td><td>BulkInvoiceItem.ServicePdStart</td></tr><tr><td>Status</td><td>BulkInvoiceItem.Status</td></tr><tr><td>UpdateTime</td><td>BulkInvoiceItem.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>BulkInvoiceItem.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc901/dto/BulkInvoiceItemDTO")
final class BulkInvoiceItemDTO {
  var _amount              : gw.api.financials.CurrencyAmount as Amount
  var _bulkInvoiceItemInfo : gw.webservice.cc.cc901.dto.BulkInvoiceItemInfoDTO as BulkInvoiceItemInfo
  var _bulkInvoiceOrder    : Integer                          as BulkInvoiceOrder
  /** Derived from BulkInvoiceItem#BulkInvoice.PublicID */
  var _bulkInvoicePublicID : String                           as BulkInvoicePublicID
  /** Derived from BulkInvoiceItem#Claim.PublicID */
  var _claimPublicID       : String                           as ClaimPublicID
  var _costCategory        : CostCategory                     as CostCategory
  var _costType            : CostType                         as CostType
  var _createTime          : Date                             as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID  : String                           as CreateUserPublicID
  var _dateOfService       : Date                             as DateOfService
  var _deductionsAmount    : gw.api.financials.CurrencyAmount as DeductionsAmount
  var _description         : String                           as Description
  var _explanation         : String                           as Explanation
  /** Derived from BulkInvoiceItem#Exposure.PublicID */
  var _exposurePublicID    : String                           as ExposurePublicID
  var _nonEroding          : Boolean                          as NonEroding
  var _paymentType         : PaymentType                      as PaymentType
  var _publicID            : String                           as PublicID
  var _reservingCurrency   : Currency                         as ReservingCurrency
  var _servicePdEnd        : Date                             as ServicePdEnd
  var _servicePdStart      : Date                             as ServicePdStart
  var _status              : BulkInvoiceItemStatus            as Status
  var _updateTime          : Date                             as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID  : String                           as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied BulkInvoiceItem
   * @param that The BulkInvoiceItem to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : BulkInvoiceItem) {
    // if field is on base class
      _createTime          = that.CreateTime
      _createUserPublicID  = that.CreateUser.PublicID
      _deductionsAmount    = that.DeductionsAmount
      _updateTime          = that.UpdateTime
      _updateUserPublicID  = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied BulkInvoiceItem
   * @param that The BulkInvoiceItem to copy from.
   */
  final function readFrom(that : BulkInvoiceItem) : gw.webservice.cc.cc901.dto.BulkInvoiceItemDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      Amount               = that.Amount
      BulkInvoiceOrder     = that.BulkInvoiceOrder
      BulkInvoicePublicID  = that.BulkInvoice.PublicID
      ClaimPublicID        = that.Claim.PublicID
      CostCategory         = that.CostCategory
      CostType             = that.CostType
      DateOfService        = that.DateOfService
      Description          = that.Description
      Explanation          = that.Explanation
      ExposurePublicID     = that.Exposure.PublicID
      NonEroding           = that.NonEroding
      PaymentType          = that.PaymentType
      PublicID             = that.PublicID
      ReservingCurrency    = that.ReservingCurrency
      ServicePdEnd         = that.ServicePdEnd
      ServicePdStart       = that.ServicePdStart
      Status               = that.Status
    //
    return this
  }

  /**
   * Update the supplied BulkInvoiceItem using the field values stored in this DTO
   * @param that The BulkInvoiceItem to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the BulkInvoiceItem, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : BulkInvoiceItem, ignoreNullValues = true) : BulkInvoiceItem {
    // if field is on base class
      if (Amount              != null or !ignoreNullValues) that.Amount              = Amount
      if (BulkInvoiceOrder    != null or !ignoreNullValues) that.BulkInvoiceOrder    = BulkInvoiceOrder
      if (BulkInvoicePublicID != null or !ignoreNullValues) that.BulkInvoice         = BulkInvoice
      if (ClaimPublicID       != null or !ignoreNullValues) that.Claim               = Claim
      if (CostCategory        != null or !ignoreNullValues) that.CostCategory        = CostCategory
      if (CostType            != null or !ignoreNullValues) that.CostType            = CostType
      if (DateOfService       != null or !ignoreNullValues) that.DateOfService       = DateOfService
      if (Description         != null or !ignoreNullValues) that.Description         = Description
      if (Explanation         != null or !ignoreNullValues) that.Explanation         = Explanation
      if (ExposurePublicID    != null or !ignoreNullValues) that.Exposure            = Exposure
      if (NonEroding          != null or !ignoreNullValues) that.NonEroding          = NonEroding
      if (PaymentType         != null or !ignoreNullValues) that.PaymentType         = PaymentType
      if (PublicID            != null or !ignoreNullValues) that.PublicID            = PublicID
      if (ReservingCurrency   != null or !ignoreNullValues) that.ReservingCurrency   = ReservingCurrency
      if (ServicePdEnd        != null or !ignoreNullValues) that.ServicePdEnd        = ServicePdEnd
      if (ServicePdStart      != null or !ignoreNullValues) that.ServicePdStart      = ServicePdStart
      if (Status              != null or !ignoreNullValues) that.Status              = Status
    //
    return that
  }

  /**
   * Uses the createNew block to create a new BulkInvoiceItem, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new BulkInvoiceItem.
   * @param createNew (Optional) A block that returns a new instance of BulkInvoiceItem. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the BulkInvoiceItem, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : BulkInvoiceItem = null, ignoreNullValues = true) : BulkInvoiceItem {
    var instance : BulkInvoiceItem
    if (createNew == null) {
      instance = bundle == null
          ? new BulkInvoiceItem()
          : new BulkInvoiceItem(bundle)
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
  property get BulkInvoice()      : BulkInvoice                     { return fetchByPublicID(BulkInvoicePublicID) }

  /** Convenience property that returns the {@link Claim} whose PublicID is {@code ClaimPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claim()            : Claim                           { return fetchByPublicID(ClaimPublicID) }

  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()       : User                            { return fetchByPublicID(CreateUserPublicID) }

  /** Convenience property that returns the {@link Exposure} whose PublicID is {@code ExposurePublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Exposure()         : Exposure                        { return fetchByPublicID(ExposurePublicID) }

  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()       : User                            { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new BulkInvoiceItemDTO that represents the current state of the supplied BulkInvoiceItem.
   * @param that The BulkInvoiceItem to be represented.
   */
  static function valueOf(that : BulkInvoiceItem) : gw.webservice.cc.cc901.dto.BulkInvoiceItemDTO {
    return new gw.webservice.cc.cc901.dto.BulkInvoiceItemDTO().readFrom(that)
  }

  /**
   * Returns the BulkInvoiceItem whose public ID is in the supplied list, or null if the publicID is null.
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