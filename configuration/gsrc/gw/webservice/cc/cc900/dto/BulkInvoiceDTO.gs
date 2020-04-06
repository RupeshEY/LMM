package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link BulkInvoiceDTO} is a DTO that represents an instance of {@link entity.BulkInvoice} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.BulkInvoice}.
 * <p>None of these methods constrain how an instance of BulkInvoiceDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the BulkInvoiceDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link BulkInvoiceDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>AccountName</td><td>BulkInvoice.AccountName</td></tr><tr><td>ApprovalDate</td><td>BulkInvoice.ApprovalDate</td></tr><tr><td>ApprovalStatus</td><td>BulkInvoice.ApprovalStatus</td></tr><tr><td>ApprovedReportingAmount</td><td>BulkInvoice.ApprovedReportingAmount</td></tr><tr><td>ApprovedTransactionAmount</td><td>BulkInvoice.ApprovedTransactionAmount</td></tr><tr><td>BankAccountNumber</td><td>BulkInvoice.BankAccountNumber</td></tr><tr><td>BankAccountType</td><td>BulkInvoice.BankAccountType</td></tr><tr><td>BankName</td><td>BulkInvoice.BankName</td></tr><tr><td>BankRoutingNumber</td><td>BulkInvoice.BankRoutingNumber</td></tr><tr><td>BulkInvoiceTotal</td><td>BulkInvoice.BulkInvoiceTotal</td></tr><tr><td>CheckInstructions</td><td>BulkInvoice.CheckInstructions</td></tr><tr><td>CheckNumber</td><td>BulkInvoice.CheckNumber</td></tr><tr><td>Comments</td><td>BulkInvoice.Comments</td></tr><tr><td>CreateTime</td><td>BulkInvoice.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>BulkInvoice.CreateUser.PublicID</td></tr><tr><td>Currency</td><td>BulkInvoice.Currency</td></tr><tr><td>DefaultCostCategory</td><td>BulkInvoice.DefaultCostCategory</td></tr><tr><td>DefaultCostType</td><td>BulkInvoice.DefaultCostType</td></tr><tr><td>DefaultPaymentType</td><td>BulkInvoice.DefaultPaymentType</td></tr><tr><td>Deletable</td><td>BulkInvoice.Deletable</td></tr><tr><td>DeliveryMethod</td><td>BulkInvoice.DeliveryMethod</td></tr><tr><td>Editable</td><td>BulkInvoice.Editable</td></tr><tr><td>InvoiceItemPublicIDs</td><td>BulkInvoice.InvoiceItems*.PublicID</td></tr><tr><td>InvoiceNumber</td><td>BulkInvoice.InvoiceNumber</td></tr><tr><td>IsPrimary</td><td>BulkInvoice.IsPrimary</td></tr><tr><td>IssueDate</td><td>BulkInvoice.IssueDate</td></tr><tr><td>LastValidatedDate</td><td>BulkInvoice.LastValidatedDate</td></tr><tr><td>MailingAddressPublicID</td><td>BulkInvoice.MailingAddress.PublicID</td></tr><tr><td>MailTo</td><td>BulkInvoice.MailTo</td></tr><tr><td>Memo</td><td>BulkInvoice.Memo</td></tr><tr><td>PayeeChangeable</td><td>BulkInvoice.PayeeChangeable</td></tr><tr><td>PayeePublicID</td><td>BulkInvoice.Payee.PublicID</td></tr><tr><td>PaymentMethod</td><td>BulkInvoice.PaymentMethod</td></tr><tr><td>PayTo</td><td>BulkInvoice.PayTo</td></tr><tr><td>PendingItemValidation</td><td>BulkInvoice.PendingItemValidation</td></tr><tr><td>PublicID</td><td>BulkInvoice.PublicID</td></tr><tr><td>ReceivedDate</td><td>BulkInvoice.ReceivedDate</td></tr><tr><td>Reportability</td><td>BulkInvoice.Reportability</td></tr><tr><td>RequestingUserPublicID</td><td>BulkInvoice.RequestingUser.PublicID</td></tr><tr><td>ScheduledSendDate</td><td>BulkInvoice.ScheduledSendDate</td></tr><tr><td>SplitEqually</td><td>BulkInvoice.SplitEqually</td></tr><tr><td>Status</td><td>BulkInvoice.Status</td></tr><tr><td>Stoppable</td><td>BulkInvoice.Stoppable</td></tr><tr><td>Submittable</td><td>BulkInvoice.Submittable</td></tr><tr><td>TotalReportingAmount</td><td>BulkInvoice.TotalReportingAmount</td></tr><tr><td>TotalTransactionAmount</td><td>BulkInvoice.TotalTransactionAmount</td></tr><tr><td>UpdateTime</td><td>BulkInvoice.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>BulkInvoice.UpdateUser.PublicID</td></tr><tr><td>Valid</td><td>BulkInvoice.Valid</td></tr><tr><td>Validateable</td><td>BulkInvoice.Validateable</td></tr><tr><td>Voidable</td><td>BulkInvoice.Voidable</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/BulkInvoiceDTO")
final class BulkInvoiceDTO {
  var _accountName                   : String                           as AccountName
  var _approvalDate                  : Date                             as ApprovalDate
  var _approvalStatus                : ApprovalStatus                   as ApprovalStatus
  var _approvedReportingAmount       : gw.api.financials.CurrencyAmount as ApprovedReportingAmount
  var _approvedTransactionAmount     : gw.api.financials.CurrencyAmount as ApprovedTransactionAmount
  var _bankAccountNumber             : String                           as BankAccountNumber
  var _bankAccountType               : BankAccountType                  as BankAccountType
  var _bankName                      : String                           as BankName
  var _bankRoutingNumber             : String                           as BankRoutingNumber
  var _bulkInvoiceTotal              : gw.api.financials.CurrencyAmount as BulkInvoiceTotal
  var _checkInstructions             : CheckHandlingInstructions        as CheckInstructions
  var _checkNumber                   : String                           as CheckNumber
  var _comments                      : String                           as Comments
  var _createTime                    : Date                             as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID            : String                           as CreateUserPublicID
  var _currency                      : Currency                         as Currency
  var _customExchangeRate            : java.math.BigDecimal             as CustomExchangeRate
  var _customExchangeRateDescription : String                           as CustomExchangeRateDescription
  var _defaultCostCategory           : CostCategory                     as DefaultCostCategory
  var _defaultCostType               : CostType                         as DefaultCostType
  var _defaultPaymentType            : PaymentType                      as DefaultPaymentType
  var _deletable                     : boolean                          as Deletable
  var _deliveryMethod                : DeliveryMethod                   as DeliveryMethod
  var _editable                      : boolean                          as Editable
  /** Derived from BulkInvoice#InvoiceItems*.PublicID */
  var _invoiceItemPublicIDs          : String[]                         as InvoiceItemPublicIDs = {}
  var _invoiceNumber                 : String                           as InvoiceNumber
  var _isPrimary                     : Boolean                          as IsPrimary
  var _issueDate                     : Date                             as IssueDate
  var _lastValidatedDate             : Date                             as LastValidatedDate
  /** Derived from BulkInvoice#MailingAddress.PublicID */
  var _mailingAddress                : AddressDTO                       as MailingAddress
  var _mailTo                        : String                           as MailTo
  var _memo                          : String                           as Memo
  var _newInvoiceItems               : BulkInvoiceItemDTO[]             as NewInvoiceItems = {}
  var _payeeChangeable               : boolean                          as PayeeChangeable
  /** Derived from BulkInvoice#Payee.PublicID */
  var _payeePublicID                 : String                           as PayeePublicID
  var _paymentMethod                 : PaymentMethod                    as PaymentMethod
  var _payTo                         : String                           as PayTo
  var _pendingItemValidation         : boolean                          as PendingItemValidation
  var _publicID                      : String                           as PublicID
  var _receivedDate                  : Date                             as ReceivedDate
  var _reportability                 : ReportabilityType                as Reportability
  /** Derived from BulkInvoice#RequestingUser.PublicID */
  var _requestingUserPublicID        : String                           as RequestingUserPublicID
  var _scheduledSendDate             : Date                             as ScheduledSendDate
  var _splitEqually                  : Boolean                          as SplitEqually
  var _status                        : BulkInvoiceStatus                as Status
  var _stoppable                     : boolean                          as Stoppable
  var _submittable                   : boolean                          as Submittable
  var _totalReportingAmount          : gw.api.financials.CurrencyAmount as TotalReportingAmount
  var _totalTransactionAmount        : gw.api.financials.CurrencyAmount as TotalTransactionAmount
  var _updateTime                    : Date                             as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID            : String                           as UpdateUserPublicID
  var _valid                         : Boolean                          as Valid
  var _validateable                  : boolean                          as Validateable
  var _validationAlerts              : BIValidationAlertDTO[]           as ValidationAlerts = {}
  var _voidable                      : boolean                          as Voidable

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied BulkInvoice
   * @param that The BulkInvoice to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : BulkInvoice) {
    // if field is on base class
      _approvedReportingAmount       = that.ApprovedReportingAmount
      _approvedTransactionAmount     = that.ApprovedTransactionAmount
      _createTime                    = that.CreateTime
      _createUserPublicID            = that.CreateUser.PublicID
      _deletable                     = that.Deletable
      _editable                      = that.Editable
      _invoiceItemPublicIDs          = that.InvoiceItems*.PublicID
      _lastValidatedDate             = that.LastValidatedDate
      _payeeChangeable               = that.PayeeChangeable
      _pendingItemValidation         = that.PendingItemValidation
      _stoppable                     = that.Stoppable
      _submittable                   = that.Submittable
      _totalReportingAmount          = that.TotalReportingAmount
      _totalTransactionAmount        = that.TotalTransactionAmount
      _updateTime                    = that.UpdateTime
      _updateUserPublicID            = that.UpdateUser.PublicID
      _valid                         = that.Valid
      _validateable                  = that.Validateable
      _voidable                      = that.Voidable
    //
  }

  /**
   * Set the fields in this DTO using the supplied BulkInvoice
   * @param that The BulkInvoice to copy from.
   */
  final function readFrom(that : BulkInvoice) : BulkInvoiceDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      AccountName                    = that.AccountName
      ApprovalDate                   = that.ApprovalDate
      ApprovalStatus                 = that.ApprovalStatus
      BankAccountNumber              = that.BankAccountNumber
      BankAccountType                = that.BankAccountType
      BankName                       = that.BankName
      BankRoutingNumber              = that.BankRoutingNumber
      BulkInvoiceTotal               = that.BulkInvoiceTotal
      CheckInstructions              = that.CheckInstructions
      CheckNumber                    = that.CheckNumber
      Comments                       = that.Comments
      Currency                       = that.Currency
      DefaultCostCategory            = that.DefaultCostCategory
      DefaultCostType                = that.DefaultCostType
      DefaultPaymentType             = that.DefaultPaymentType
      DeliveryMethod                 = that.DeliveryMethod
      InvoiceNumber                  = that.InvoiceNumber
      IsPrimary                      = that.IsPrimary
      IssueDate                      = that.IssueDate
      MailTo                         = that.MailTo
      Memo                           = that.Memo
      PayTo                          = that.PayTo
      PayeePublicID                  = that.Payee.PublicID
      PaymentMethod                  = that.PaymentMethod
      PublicID                       = that.PublicID
      ReceivedDate                   = that.ReceivedDate
      Reportability                  = that.Reportability
      RequestingUserPublicID         = that.RequestingUser.PublicID
      ScheduledSendDate              = that.ScheduledSendDate
      SplitEqually                   = that.SplitEqually
      Status                         = that.Status
    //
    return this
  }

  /**
   * Update the supplied BulkInvoice using the field values stored in this DTO
   * @param that The BulkInvoice to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the BulkInvoice, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : BulkInvoice, ignoreNullValues = true) : BulkInvoice {
    // if field is on base class
      if (AccountName                   != null or !ignoreNullValues) that.AccountName                   = AccountName
      if (ApprovalDate                  != null or !ignoreNullValues) that.ApprovalDate                  = ApprovalDate
      if (ApprovalStatus                != null or !ignoreNullValues) that.ApprovalStatus                = ApprovalStatus
      if (BankAccountNumber             != null or !ignoreNullValues) that.BankAccountNumber             = BankAccountNumber
      if (BankAccountType               != null or !ignoreNullValues) that.BankAccountType               = BankAccountType
      if (BankName                      != null or !ignoreNullValues) that.BankName                      = BankName
      if (BankRoutingNumber             != null or !ignoreNullValues) that.BankRoutingNumber             = BankRoutingNumber
      if (BulkInvoiceTotal              != null or !ignoreNullValues) that.BulkInvoiceTotal              = BulkInvoiceTotal
      if (CheckInstructions             != null or !ignoreNullValues) that.CheckInstructions             = CheckInstructions
      if (CheckNumber                   != null or !ignoreNullValues) that.CheckNumber                   = CheckNumber
      if (Comments                      != null or !ignoreNullValues) that.Comments                      = Comments
      if (Currency                      != null or !ignoreNullValues) that.Currency                      = Currency
      if (DefaultCostCategory           != null or !ignoreNullValues) that.DefaultCostCategory           = DefaultCostCategory
      if (DefaultCostType               != null or !ignoreNullValues) that.DefaultCostType               = DefaultCostType
      if (DefaultPaymentType            != null or !ignoreNullValues) that.DefaultPaymentType            = DefaultPaymentType
      if (DeliveryMethod                != null or !ignoreNullValues) that.DeliveryMethod                = DeliveryMethod
      if (InvoiceNumber                 != null or !ignoreNullValues) that.InvoiceNumber                 = InvoiceNumber
      if (IsPrimary                     != null or !ignoreNullValues) that.IsPrimary                     = IsPrimary
      if (IssueDate                     != null or !ignoreNullValues) that.IssueDate                     = IssueDate
      if (MailTo                        != null or !ignoreNullValues) that.MailTo                        = MailTo
      if (Memo                          != null or !ignoreNullValues) that.Memo                          = Memo
      if (PayTo                         != null or !ignoreNullValues) that.PayTo                         = PayTo
      if (PayeePublicID                 != null or !ignoreNullValues) that.Payee                         = Payee
      if (PaymentMethod                 != null or !ignoreNullValues) that.PaymentMethod                 = PaymentMethod
      if (PublicID                      != null or !ignoreNullValues) that.PublicID                      = PublicID
      if (ReceivedDate                  != null or !ignoreNullValues) that.ReceivedDate                  = ReceivedDate
      if (Reportability                 != null or !ignoreNullValues) that.Reportability                 = Reportability
      if (RequestingUserPublicID        != null or !ignoreNullValues) that.RequestingUser                = RequestingUser
      if (ScheduledSendDate             != null or !ignoreNullValues) that.ScheduledSendDate             = ScheduledSendDate
      if (SplitEqually                  != null or !ignoreNullValues) that.SplitEqually                  = SplitEqually
      if (Status                        != null or !ignoreNullValues) that.Status                        = Status
    //
    if (MailingAddress != null) {
      that.MailingAddress = MailingAddress.writeToNewEntityIn(that.Bundle)
    }
    return that
  }

  /**
   * Uses the createNew block to create a new BulkInvoice, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new BulkInvoice.
   * @param createNew (Optional) A block that returns a new instance of BulkInvoice. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the BulkInvoice, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : BulkInvoice = null, ignoreNullValues = true) : BulkInvoice {
    var instance : BulkInvoice
    if (createNew == null) {
      instance = bundle == null
          ? new BulkInvoice()
          : new BulkInvoice(bundle)
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
  property get CreateUser()                 : User                            { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns a {@link BulkInvoiceItem[]} of the objects whose PublicIDs are in {@code InvoiceItemPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get InvoiceItems()               : BulkInvoiceItem[]               { return fetchByPublicID(InvoiceItemPublicIDs) }
  
  /** Convenience property that returns the {@link Contact} whose PublicID is {@code PayeePublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Payee()                      : Contact                         { return fetchByPublicID(PayeePublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code RequestingUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get RequestingUser()             : User                            { return fetchByPublicID(RequestingUserPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()                 : User                            { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new BulkInvoiceDTO that represents the current state of the supplied BulkInvoice.
   * @param that The BulkInvoice to be represented.
   */
  static function valueOf(that : BulkInvoice) : BulkInvoiceDTO {
    return new BulkInvoiceDTO().readFrom(that)
  }

  /**
   * Returns all of the BulkInvoice instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
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
   * Returns the BulkInvoice whose public ID is in the supplied list, or null if the publicID is null.
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