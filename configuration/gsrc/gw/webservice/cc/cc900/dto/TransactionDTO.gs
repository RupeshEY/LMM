package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.lang.reflect.ReflectUtil
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.lang.IllegalArgumentException
uses java.lang.Long
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link TransactionDTO} is a DTO that represents an instance of {@link entity.Transaction} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.Transaction}.
 * <p>None of these methods constrain how an instance of TransactionDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the TransactionDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link TransactionDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>Amount</td><td>Transaction.Amount</td></tr><tr><td>Category</td><td>Transaction.Category</td></tr><tr><td>CheckPublicID</td><td>Payment.Check.PublicID</td></tr><tr><td>ClaimContactPublicID</td><td>Recovery.ClaimContact.PublicID</td></tr><tr><td>ClaimPublicID</td><td>Transaction.Claim.PublicID</td></tr><tr><td>Comments</td><td>Transaction.Comments</td></tr><tr><td>CostCategory</td><td>Transaction.CostCategory</td></tr><tr><td>CostType</td><td>Transaction.CostType</td></tr><tr><td>CreateTime</td><td>Transaction.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Transaction.CreateUser.PublicID</td></tr><tr><td>Currency</td><td>Transaction.Currency</td></tr><tr><td>Deletable</td><td>Transaction.Deletable</td></tr><tr><td>DoesNotErodeReserves</td><td>Payment.DoesNotErodeReserves</td></tr><tr><td>Editable</td><td>Transaction.Editable</td></tr><tr><td>ExposurePublicID</td><td>Transaction.Exposure.PublicID</td></tr><tr><td>LineItemPublicIDs</td><td>Transaction.LineItems*.PublicID</td></tr><tr><td>LoadCommandID</td><td>Transaction.LoadCommandID</td></tr><tr><td>MatterPublicID</td><td>Payment.Matter.PublicID</td></tr><tr><td>NotApproved</td><td>Transaction.NotApproved</td></tr><tr><td>OffsetPublicIDs</td><td>Transaction.Offsets*.PublicID</td></tr><tr><td>OnsetPublicIDs</td><td>Transaction.Onsets*.PublicID</td></tr><tr><td>PaymentType</td><td>Payment.PaymentType</td></tr><tr><td>PublicID</td><td>Transaction.PublicID</td></tr><tr><td>RecoveryCategory</td><td>RecoveryReserve.RecoveryCategory</td></tr><tr><td>ReserveLinePublicID</td><td>Transaction.ReserveLine.PublicID</td></tr><tr><td>ReservingCurrency</td><td>Transaction.ReservingCurrency</td></tr><tr><td>Status</td><td>Transaction.Status</td></tr><tr><td>SubmitDate</td><td>Transaction.SubmitDate</td></tr><tr><td>Subtype</td><td>Transaction.Subtype</td></tr><tr><td>TAccountTransactionPublicIDs</td><td>Transaction.TAccountTransactions*.PublicID</td></tr><tr><td>TransactionDate</td><td>Transaction.TransactionDate</td></tr><tr><td>TransactionSetPublicID</td><td>Transaction.TransactionSet.PublicID</td></tr><tr><td>TransactionTypeName</td><td>Transaction.TransactionTypeName</td></tr><tr><td>UpdateTime</td><td>Transaction.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Transaction.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/TransactionDTO")
final class TransactionDTO {
  var _amount                       : java.math.BigDecimal     as Amount
  /** Derived from Payment#Check.PublicID */
  var _checkPublicID                : String                   as CheckPublicID
  /** Derived from Recovery#ClaimContact.PublicID */
  var _claimContactPublicID         : String                   as ClaimContactPublicID
  /** Derived from Transaction#Claim.PublicID */
  var _claimPublicID                : String                   as ClaimPublicID
  var _comments                     : String                   as Comments
  var _costCategory                 : CostCategory             as CostCategory
  var _costType                     : CostType                 as CostType
  var _createTime                   : Date                     as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID           : String                   as CreateUserPublicID
  var _currency                     : Currency                 as Currency
  var _deletable                    : boolean                  as Deletable
  var _doesNotErodeReserves         : Boolean                  as DoesNotErodeReserves
  var _editable                     : boolean                  as Editable
  /** Derived from Transaction#Exposure.PublicID */
  var _exposurePublicID             : String                   as ExposurePublicID
  /** Derived from Transaction#LineItems*.PublicID */
  var _lineItemPublicIDs            : String[]                 as LineItemPublicIDs = {}
  var _loadCommandID                : Long                     as LoadCommandID
  /** Derived from Payment#Matter.PublicID */
  var _matterPublicID               : String                   as MatterPublicID
  var _newLineItems                 : TransactionLineItemDTO[] as NewLineItems = {}
  var _notApproved                  : boolean                  as NotApproved
  /** Derived from Transaction#Offsets*.PublicID */
  var _offsetPublicIDs              : String[]                 as OffsetPublicIDs = {}
  /** Derived from Transaction#Onsets*.PublicID */
  var _onsetPublicIDs               : String[]                 as OnsetPublicIDs = {}
  var _paymentType                  : PaymentType              as PaymentType
  var _publicID                     : String                   as PublicID
  var _recoveryCategory             : RecoveryCategory         as RecoveryCategory
  /** Derived from Transaction#ReserveLine.PublicID */
  var _reserveLinePublicID          : String                   as ReserveLinePublicID
  var _reservingCurrency            : Currency                 as ReservingCurrency
  var _status                       : TransactionStatus        as Status
  var _submitDate                   : Date                     as SubmitDate
  var _subtype                      : typekey.Transaction      as Subtype
  /** Derived from Transaction#TAccountTransactions*.PublicID */
  var _tAccountTransactionPublicIDs : String[]                 as TAccountTransactionPublicIDs = {}
  var _transactionDate              : Date                     as TransactionDate
  /** Derived from Transaction#TransactionSet.PublicID */
  var _transactionSetPublicID       : String                   as TransactionSetPublicID
  var _transactionTypeName          : String                   as TransactionTypeName
  var _updateTime                   : Date                     as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID           : String                   as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Transaction
   * @param that The Transaction to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Transaction) {
    // if field is on base class
      _amount                       = that.Amount
      _createTime                   = that.CreateTime
      _createUserPublicID           = that.CreateUser.PublicID
      _deletable                    = that.Deletable
      _editable                     = that.Editable
      _lineItemPublicIDs            = that.LineItems*.PublicID
      _loadCommandID                = that.LoadCommandID
      _notApproved                  = that.NotApproved
      _offsetPublicIDs              = that.Offsets*.PublicID
      _onsetPublicIDs               = that.Onsets*.PublicID
      _subtype                      = that.Subtype
      _tAccountTransactionPublicIDs = that.TAccountTransactions*.PublicID
      _transactionDate              = that.TransactionDate
      _transactionTypeName          = that.TransactionTypeName
      _updateTime                   = that.UpdateTime
      _updateUserPublicID           = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied Transaction
   * @param that The Transaction to copy from.
   */
  final function readFrom(that : Transaction) : TransactionDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      ClaimPublicID                 = that.Claim.PublicID
      Comments                      = that.Comments
      CostCategory                  = that.CostCategory
      CostType                      = that.CostType
      Currency                      = that.Currency
      ExposurePublicID              = that.Exposure.PublicID
      PublicID                      = that.PublicID
      ReserveLinePublicID           = that.ReserveLine.PublicID
      ReservingCurrency             = that.ReservingCurrency
      Status                        = that.Status
      SubmitDate                    = that.SubmitDate
      TransactionSetPublicID        = that.TransactionSet.PublicID
    //
    if (that typeis Payment) {
      CheckPublicID                 = that.Check.PublicID
      DoesNotErodeReserves          = that.DoesNotErodeReserves
      MatterPublicID                = that.Matter.PublicID
      PaymentType                   = that.PaymentType
    }
    if (that typeis Recovery) {
      RecoveryCategory              = that.RecoveryCategory
      ClaimContactPublicID          = that.ClaimContact.PublicID
    }
    if (that typeis RecoveryReserve) {
      RecoveryCategory              = that.RecoveryCategory
    }
    return this
  }

  /**
   * Update the supplied Transaction using the field values stored in this DTO
   * @param that The Transaction to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Transaction, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Transaction, ignoreNullValues = true) : Transaction {
    // if field is on base class
      if (ClaimPublicID                != null or !ignoreNullValues) that.Claim                        = Claim
      if (Comments                     != null or !ignoreNullValues) that.Comments                     = Comments
      if (CostCategory                 != null or !ignoreNullValues) that.CostCategory                 = CostCategory
      if (CostType                     != null or !ignoreNullValues) that.CostType                     = CostType
      if (Currency                     != null or !ignoreNullValues) that.Currency                     = Currency
      if (ExposurePublicID             != null or !ignoreNullValues) that.Exposure                     = Exposure
      if (PublicID                     != null or !ignoreNullValues) that.PublicID                     = PublicID
      if (ReserveLinePublicID          != null or !ignoreNullValues) that.ReserveLine                  = ReserveLine
      if (ReservingCurrency            != null or !ignoreNullValues) that.ReservingCurrency            = ReservingCurrency
      if (Status                       != null or !ignoreNullValues) that.Status                       = Status
      if (SubmitDate                   != null or !ignoreNullValues) that.SubmitDate                   = SubmitDate
      if (TransactionSetPublicID       != null or !ignoreNullValues) that.TransactionSet               = TransactionSet
    //
    if (that typeis Payment) {
      if (CheckPublicID                != null or !ignoreNullValues) that.Check                        = Check
      if (DoesNotErodeReserves         != null or !ignoreNullValues) that.DoesNotErodeReserves         = DoesNotErodeReserves
      if (MatterPublicID               != null or !ignoreNullValues) that.Matter                       = Matter
      if (PaymentType                  != null or !ignoreNullValues) that.PaymentType                  = PaymentType
    }
    if (that typeis Recovery) {
      if (RecoveryCategory             != null or !ignoreNullValues) that.RecoveryCategory             = RecoveryCategory
      if (ClaimContactPublicID         != null or !ignoreNullValues) that.ClaimContact                 = ClaimContact
    }
    if (that typeis RecoveryReserve) {
      if (RecoveryCategory             != null or !ignoreNullValues) that.RecoveryCategory             = RecoveryCategory
    }
    return that
  }

  /**
   * Uses the createNew block to create a new Transaction, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Transaction.
   * @param createNew (Optional) A block that returns a new instance of Transaction. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Transaction, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Transaction = null, ignoreNullValues = true) : Transaction {
    var instance : Transaction
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
   * @throws IllegalArgumentException if Subclass is null, since the base class (Transaction) is abstract.
   */
  final property get ConcreteSubtypeClassName() : String {
    if (Subtype == null) {
      throw new IllegalArgumentException("The subtype field must be set since Transaction is abstract and cannot be instantiated!")
    }
    return "entity." + Subtype.Code
  }

  /** Convenience property that returns the {@link Check} whose PublicID is {@code CheckPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Check()                     : Check                   { return fetchByPublicID(CheckPublicID) }
  
  /** Convenience property that returns the {@link ClaimContact} whose PublicID is {@code ClaimContactPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get ClaimContact()              : ClaimContact            { return fetchByPublicID(ClaimContactPublicID) }
  
  /** Convenience property that returns the {@link Claim} whose PublicID is {@code ClaimPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claim()                     : Claim                   { return fetchByPublicID(ClaimPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()                : User                    { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns the {@link Exposure} whose PublicID is {@code ExposurePublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Exposure()                  : Exposure                { return fetchByPublicID(ExposurePublicID) }
  
  /** Convenience property that returns a {@link TransactionLineItem[]} of the objects whose PublicIDs are in {@code LineItemPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get LineItems()                 : TransactionLineItem[]   { return fetchByPublicID(LineItemPublicIDs) }
  
  /** Convenience property that returns the {@link Matter} whose PublicID is {@code MatterPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Matter()                    : Matter                  { return fetchByPublicID(MatterPublicID) }
  
  /** Convenience property that returns a {@link TransactionOffset[]} of the objects whose PublicIDs are in {@code OffsetPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Offsets()                   : TransactionOffset[]     { return fetchByPublicID(OffsetPublicIDs) }
  
  /** Convenience property that returns a {@link TransactionOnset[]} of the objects whose PublicIDs are in {@code OnsetPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Onsets()                    : TransactionOnset[]      { return fetchByPublicID(OnsetPublicIDs) }
  
  /** Convenience property that returns the {@link ReserveLine} whose PublicID is {@code ReserveLinePublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get ReserveLine()               : ReserveLine             { return fetchByPublicID(ReserveLinePublicID) }
  
  /** Convenience property that returns a {@link TAccountTransaction[]} of the objects whose PublicIDs are in {@code TAccountTransactionPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get TAccountTransactions()      : TAccountTransaction[]   { return fetchByPublicID(TAccountTransactionPublicIDs) }
  
  /** Convenience property that returns the {@link TransactionSet} whose PublicID is {@code TransactionSetPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get TransactionSet()            : TransactionSet          { return fetchByPublicID(TransactionSetPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()                : User                    { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new TransactionDTO that represents the current state of the supplied Transaction.
   * @param that The Transaction to be represented.
   */
  static function valueOf(that : Transaction) : TransactionDTO {
    return new TransactionDTO().readFrom(that)
  }

  /**
   * Returns all of the Transaction instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
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
   * Returns the Transaction whose public ID is in the supplied list, or null if the publicID is null.
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