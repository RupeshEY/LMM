package gw.webservice.cc.cc900.dto

uses gw.api.database.Query
uses gw.api.webservice.exception.BadIdentifierException
uses gw.pl.persistence.core.Bundle
uses gw.xml.ws.annotation.WsiExportable
uses java.util.Date
uses java.util.List

/**
 * <p style="border: 1px solid black; padding: 10px">This Data Transfer Object ("DTO") class is used to generate a WSDL to serialize and deserialize information across the network. Any change to the public properties of this DTO class will change the WSDL, thus breaking any existing clients. So once the corresponding WSDL is in use this DTO should only be changed with extreme caution, as it will require existing clients to be rebuilt and redeployed.<br/><br/>
 * A(n) {@link CheckDTO} is a DTO that represents an instance of {@link entity.Check} for use by certain WS-I Web Services in the base product. This file is composed of basic getters and setters, plus members that make it easier for server-side code to work with DTOs, like virtual getters that query for entities by PublicID, and methods to copy fields to or from an instance of {@link entity.Check}.
 * <p>None of these methods constrain how an instance of CheckDTO is created, initialized or used (beyond the normal Gosu type checking): this is consistent with the <a href="http://en.wikipedia.org/wiki/Data_transfer_object">DTO Design Pattern</a>, which states that "DTOs are simple objects that should not contain any business logic that would require testing". Validation logic that considers whether a DTO field can have a <i>particular</i> value (based on things like effective dates, jurisdictions, line of business, user permissions, the values of other fields, etc.) should not be handled here, but rather by the API that manipulates the CheckDTO.
 * <p>Please read the documentation in the accelerator before reusing this class in any additional WS-I Web Services.</p>
 * <p>Fields are mapped according to the following rules:
 * <ul><li>Primitive values are copied directly</li><li>Typekey fields are copied directly (the WS-I layer translates them to/from WS-I enums)</li><li>Foreign keys fields are represented by the target object's PublicID</li><li>Arraykey fields are represented by an array of the PublicIDs of the elements in the array</li></ul></p>
 * <p>The specific mappings for {@link CheckDTO} are as follows:
 * <table border="1"><tr><th>Field</th><th>Maps to</th></tr><tr><td>AccountName</td><td>Check.AccountName</td></tr><tr><td>BankAccount</td><td>Check.BankAccount</td></tr><tr><td>BankAccountNumber</td><td>Check.BankAccountNumber</td></tr><tr><td>BankAccountType</td><td>Check.BankAccountType</td></tr><tr><td>BankName</td><td>Check.BankName</td></tr><tr><td>BankRoutingNumber</td><td>Check.BankRoutingNumber</td></tr><tr><td>CheckBatching</td><td>Check.CheckBatching</td></tr><tr><td>CheckInstructions</td><td>Check.CheckInstructions</td></tr><tr><td>CheckNumber</td><td>Check.CheckNumber</td></tr><tr><td>CheckSetPublicID</td><td>Check.CheckSet.PublicID</td></tr><tr><td>CheckType</td><td>Check.CheckType</td></tr><tr><td>ClaimContactPublicID</td><td>Check.ClaimContact.PublicID</td></tr><tr><td>ClaimPublicID</td><td>Check.Claim.PublicID</td></tr><tr><td>Comments</td><td>Check.Comments</td></tr><tr><td>CreateTime</td><td>Check.CreateTime</td></tr><tr><td>CreateUserPublicID</td><td>Check.CreateUser.PublicID</td></tr><tr><td>DateOfService</td><td>Check.DateOfService</td></tr><tr><td>DeductionPublicIDs</td><td>Check.Deductions*.PublicID</td></tr><tr><td>DeductionType</td><td>Check.DeductionType</td></tr><tr><td>DeliveryMethod</td><td>Check.DeliveryMethod</td></tr><tr><td>EnteredTime</td><td>Check.EnteredTime</td></tr><tr><td>GroupPublicID</td><td>Check.Group.PublicID</td></tr><tr><td>InvoiceNumber</td><td>Check.InvoiceNumber</td></tr><tr><td>IsPrimary</td><td>Check.IsPrimary</td></tr><tr><td>IssueDate</td><td>Check.IssueDate</td></tr><tr><td>MailingAddressPublicID</td><td>Check.MailingAddress.PublicID</td></tr><tr><td>MailTo</td><td>Check.MailTo</td></tr><tr><td>Memo</td><td>Check.Memo</td></tr><tr><td>PayeePublicIDs</td><td>Check.Payees*.PublicID</td></tr><tr><td>PaymentMethod</td><td>Check.PaymentMethod</td></tr><tr><td>PaymentPublicIDs</td><td>Check.Payments*.PublicID</td></tr><tr><td>PayTo</td><td>Check.PayTo</td></tr><tr><td>PendEscalationForBulk</td><td>Check.PendEscalationForBulk</td></tr><tr><td>PortionPublicID</td><td>Check.Portion.PublicID</td></tr><tr><td>PublicID</td><td>Check.PublicID</td></tr><tr><td>RecurringCheckPublicID</td><td>Check.RecurringCheck.PublicID</td></tr><tr><td>Reportability</td><td>Check.Reportability</td></tr><tr><td>ReportableAmount</td><td>Check.ReportableAmount</td></tr><tr><td>ScheduledSendDate</td><td>Check.ScheduledSendDate</td></tr><tr><td>ServicePdEnd</td><td>Check.ServicePdEnd</td></tr><tr><td>ServicePdStart</td><td>Check.ServicePdStart</td></tr><tr><td>ServiceRequestInvoicePublicIDs</td><td>Check.ServiceRequestInvoices*.PublicID</td></tr><tr><td>Status</td><td>Check.Status</td></tr><tr><td>UpdateTime</td><td>Check.UpdateTime</td></tr><tr><td>UpdateUserPublicID</td><td>Check.UpdateUser.PublicID</td></tr></table></p>
 */
@Export
@WsiExportable("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/dto/CheckDTO")
final class CheckDTO {
  var _accountName                    : String                           as AccountName
  var _bankAccount                    : BankAccount                      as BankAccount
  var _bankAccountNumber              : String                           as BankAccountNumber
  var _bankAccountType                : BankAccountType                  as BankAccountType
  var _bankName                       : String                           as BankName
  var _bankRoutingNumber              : String                           as BankRoutingNumber
  var _checkBatching                  : CheckBatching                    as CheckBatching
  var _checkInstructions              : CheckHandlingInstructions        as CheckInstructions
  var _checkNumber                    : String                           as CheckNumber
  /** Derived from Check#CheckSet.PublicID */
  var _checkSetPublicID               : String                           as CheckSetPublicID
  var _checkType                      : CheckType                        as CheckType
  /** Derived from Check#ClaimContact.PublicID */
  var _claimContactPublicID           : String                           as ClaimContactPublicID
  /** Derived from Check#Claim.PublicID */
  var _claimPublicID                  : String                           as ClaimPublicID
  var _comments                       : String                           as Comments
  var _createTime                     : Date                             as CreateTime
  /** Derived from Editable#CreateUser.PublicID */
  var _createUserPublicID             : String                           as CreateUserPublicID
  var _dateOfService                  : Date                             as DateOfService
  /** Derived from Check#Deductions*.PublicID */
  var _deductionPublicIDs             : String[]                         as DeductionPublicIDs = {}
  var _deductionType                  : DeductionType                    as DeductionType
  var _deliveryMethod                 : DeliveryMethod                   as DeliveryMethod
  var _enteredTime                    : Date                             as EnteredTime
  /** Derived from Check#Group.PublicID */
  var _groupPublicID                  : String                           as GroupPublicID
  var _invoiceNumber                  : String                           as InvoiceNumber
  var _isPrimary                      : Boolean                          as IsPrimary
  var _issueDate                      : Date                             as IssueDate
  /** Derived from Check#MailingAddress.PublicID */
  var _mailingAddress                 : AddressDTO                       as MailingAddress
  var _mailTo                         : String                           as MailTo
  var _memo                           : String                           as Memo
  var _newAdditionalPayees            : CheckPayeeDTO[]                  as NewAdditionalPayees = {}
  var _newJointPayees                 : CheckPayeeDTO[]                  as NewJointPayees = {}
  var _newPayees                      : CheckPayeeDTO[]                  as NewPayees = {}
  var _newPayments                    : TransactionDTO[]                 as NewPayments = {}
  var _newPrimaryPayee                : CheckPayeeDTO                    as NewPrimaryPayee
  /** Derived from Check#Payees*.PublicID */
  var _payeePublicIDs                 : String[]                         as PayeePublicIDs = {}
  var _paymentMethod                  : PaymentMethod                    as PaymentMethod
  /** Derived from Check#Payments*.PublicID */
  var _paymentPublicIDs               : String[]                         as PaymentPublicIDs = {}
  var _payTo                          : String                           as PayTo
  var _pendEscalationForBulk          : Boolean                          as PendEscalationForBulk
  /** Derived from Check#Portion.PublicID */
  var _portionPublicID                : String                           as PortionPublicID
  var _publicID                       : String                           as PublicID
  /** Derived from Check#RecurringCheck.PublicID */
  var _recurringCheckPublicID         : String                           as RecurringCheckPublicID
  var _reportability                  : ReportabilityType                as Reportability
  var _reportableAmount               : gw.api.financials.CurrencyAmount as ReportableAmount
  var _scheduledSendDate              : Date                             as ScheduledSendDate
  var _servicePdEnd                   : Date                             as ServicePdEnd
  var _servicePdStart                 : Date                             as ServicePdStart
  /** Derived from Check#ServiceRequestInvoices*.PublicID */
  var _serviceRequestInvoicePublicIDs : String[]                         as ServiceRequestInvoicePublicIDs = {}
  var _status                         : TransactionStatus                as Status
  var _updateTime                     : Date                             as UpdateTime
  /** Derived from Editable#UpdateUser.PublicID */
  var _updateUserPublicID             : String                           as UpdateUserPublicID

  construct() { }

  /**
   * Copies the platform-managed fields from the supplied Check
   * @param that The Check to copy from.
   */
  protected function _copyReadOnlyFieldsFrom(that : Check) {
    // if field is on base class
      _createTime                     = that.CreateTime
      _createUserPublicID             = that.CreateUser.PublicID
      _deductionPublicIDs             = that.Deductions*.PublicID
      _payeePublicIDs                 = that.Payees*.PublicID
      _paymentPublicIDs               = that.Payments*.PublicID
      _serviceRequestInvoicePublicIDs = that.ServiceRequestInvoices*.PublicID
      _updateTime                     = that.UpdateTime
      _updateUserPublicID             = that.UpdateUser.PublicID
    //
  }

  /**
   * Set the fields in this DTO using the supplied Check
   * @param that The Check to copy from.
   */
  final function readFrom(that : Check) : CheckDTO {
    _copyReadOnlyFieldsFrom(that)

    // if field is on base class
      AccountName                     = that.AccountName
      BankAccount                     = that.BankAccount
      BankAccountNumber               = that.BankAccountNumber
      BankAccountType                 = that.BankAccountType
      BankName                        = that.BankName
      BankRoutingNumber               = that.BankRoutingNumber
      CheckBatching                   = that.CheckBatching
      CheckInstructions               = that.CheckInstructions
      CheckNumber                     = that.CheckNumber
      CheckSetPublicID                = that.CheckSet.PublicID
      CheckType                       = that.CheckType
      ClaimContactPublicID            = that.ClaimContact.PublicID
      ClaimPublicID                   = that.Claim.PublicID
      Comments                        = that.Comments
      DateOfService                   = that.DateOfService
      DeductionType                   = that.DeductionType
      DeliveryMethod                  = that.DeliveryMethod
      EnteredTime                     = that.EnteredTime
      GroupPublicID                   = that.Group.PublicID
      InvoiceNumber                   = that.InvoiceNumber
      IsPrimary                       = that.IsPrimary
      IssueDate                       = that.IssueDate
      MailTo                          = that.MailTo
      Memo                            = that.Memo
      PayTo                           = that.PayTo
      PaymentMethod                   = that.PaymentMethod
      PendEscalationForBulk           = that.PendEscalationForBulk
      PortionPublicID                 = that.Portion.PublicID
      PublicID                        = that.PublicID
      RecurringCheckPublicID          = that.RecurringCheck.PublicID
      Reportability                   = that.Reportability
      ReportableAmount                = that.ReportableAmount
      ScheduledSendDate               = that.ScheduledSendDate
      ServicePdEnd                    = that.ServicePdEnd
      ServicePdStart                  = that.ServicePdStart
      Status                          = that.Status
    //
    return this
  }

  /**
   * Update the supplied Check using the field values stored in this DTO
   * @param that The Check to update.
   * @param (Optional) ignoreNullValues If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Check, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeTo(that : Check, ignoreNullValues = true) : Check {
    // if field is on base class
      if (AccountName                    != null or !ignoreNullValues) that.AccountName                    = AccountName
      if (BankAccount                    != null or !ignoreNullValues) that.BankAccount                    = BankAccount
      if (BankAccountNumber              != null or !ignoreNullValues) that.BankAccountNumber              = BankAccountNumber
      if (BankAccountType                != null or !ignoreNullValues) that.BankAccountType                = BankAccountType
      if (BankName                       != null or !ignoreNullValues) that.BankName                       = BankName
      if (BankRoutingNumber              != null or !ignoreNullValues) that.BankRoutingNumber              = BankRoutingNumber
      if (CheckBatching                  != null or !ignoreNullValues) that.CheckBatching                  = CheckBatching
      if (CheckInstructions              != null or !ignoreNullValues) that.CheckInstructions              = CheckInstructions
      if (CheckNumber                    != null or !ignoreNullValues) that.CheckNumber                    = CheckNumber
      if (CheckSetPublicID               != null or !ignoreNullValues) that.CheckSet                       = CheckSet
      if (CheckType                      != null or !ignoreNullValues) that.CheckType                      = CheckType
      if (ClaimContactPublicID           != null or !ignoreNullValues) that.ClaimContact                   = ClaimContact
      if (ClaimPublicID                  != null or !ignoreNullValues) that.Claim                          = Claim
      if (Comments                       != null or !ignoreNullValues) that.Comments                       = Comments
      if (DateOfService                  != null or !ignoreNullValues) that.DateOfService                  = DateOfService
      if (DeductionType                  != null or !ignoreNullValues) that.DeductionType                  = DeductionType
      if (DeliveryMethod                 != null or !ignoreNullValues) that.DeliveryMethod                 = DeliveryMethod
      if (EnteredTime                    != null or !ignoreNullValues) that.EnteredTime                    = EnteredTime
      if (GroupPublicID                  != null or !ignoreNullValues) that.Group                          = Group
      if (InvoiceNumber                  != null or !ignoreNullValues) that.InvoiceNumber                  = InvoiceNumber
      if (IsPrimary                      != null or !ignoreNullValues) that.IsPrimary                      = IsPrimary
      if (IssueDate                      != null or !ignoreNullValues) that.IssueDate                      = IssueDate
      if (MailTo                         != null or !ignoreNullValues) that.MailTo                         = MailTo
      if (Memo                           != null or !ignoreNullValues) that.Memo                           = Memo
      if (PayTo                          != null or !ignoreNullValues) that.PayTo                          = PayTo
      if (PaymentMethod                  != null or !ignoreNullValues) that.PaymentMethod                  = PaymentMethod
      if (PendEscalationForBulk          != null or !ignoreNullValues) that.PendEscalationForBulk          = PendEscalationForBulk
      if (PortionPublicID                != null or !ignoreNullValues) that.Portion                        = Portion
      if (PublicID                       != null or !ignoreNullValues) that.PublicID                       = PublicID
      if (RecurringCheckPublicID         != null or !ignoreNullValues) that.RecurringCheck                 = RecurringCheck
      if (Reportability                  != null or !ignoreNullValues) that.Reportability                  = Reportability
      if (ReportableAmount               != null or !ignoreNullValues) that.ReportableAmount               = ReportableAmount
      if (ScheduledSendDate              != null or !ignoreNullValues) that.ScheduledSendDate              = ScheduledSendDate
      if (ServicePdEnd                   != null or !ignoreNullValues) that.ServicePdEnd                   = ServicePdEnd
      if (ServicePdStart                 != null or !ignoreNullValues) that.ServicePdStart                 = ServicePdStart
      if (Status                         != null or !ignoreNullValues) that.Status                         = Status
    //
    if (MailingAddress != null) {
      that.MailingAddress = MailingAddress.writeToNewEntityIn(that.Bundle)
    }
    return that
  }

  /**
   * Uses the createNew block to create a new Check, adds it to the supplied bundle, then updates it using the field values stored in this DTO. The ignoreNullValues parameter controls how the fields that are null are treated.
   * @param bundle The bundle in which to create the new Check.
   * @param createNew (Optional) A block that returns a new instance of Check. If this is null, the default constructor will be used.
   * @param ignoreNullValues (Optional) If {@code true}, only those fields that are non-null are used (i.e. the null-valued fields are treated as if they were unspecified). If {@code false}, every DTO field will be used to update the Check, even those that are null. Usually you will want this to be {@code true}.
   */
  final function writeToNewEntityIn(bundle : Bundle, createNew : block() : Check = null, ignoreNullValues = true) : Check {
    var instance : Check
    if (createNew == null) {
      instance = bundle == null
          ? new Check()
          : new Check(bundle)
    }
    else {
      instance = createNew()

      if (bundle != null) {
        instance = bundle.add(instance)
      }
    }
    return writeTo(instance, ignoreNullValues)
  }

  /** Convenience property that returns the {@link CheckSet} whose PublicID is {@code CheckSetPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CheckSet()                    : CheckSet                        { return fetchByPublicID(CheckSetPublicID) }
  
  /** Convenience property that returns the {@link ClaimContact} whose PublicID is {@code ClaimContactPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get ClaimContact()                : ClaimContact                    { return fetchByPublicID(ClaimContactPublicID) }
  
  /** Convenience property that returns the {@link Claim} whose PublicID is {@code ClaimPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Claim()                       : Claim                           { return fetchByPublicID(ClaimPublicID) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code CreateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get CreateUser()                  : User                            { return fetchByPublicID(CreateUserPublicID) }
  
  /** Convenience property that returns a {@link Deduction[]} of the objects whose PublicIDs are in {@code DeductionPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Deductions()                  : Deduction[]                     { return fetchByPublicID(DeductionPublicIDs) }
  
  /** Convenience property that returns the {@link CheckGroup} whose PublicID is {@code GroupPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Group()                       : CheckGroup                      { return fetchByPublicID(GroupPublicID) }
  
  /** Convenience property that returns a {@link CheckPayee[]} of the objects whose PublicIDs are in {@code PayeePublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Payees()                      : CheckPayee[]                    { return fetchByPublicID(PayeePublicIDs) }
  
  /** Convenience property that returns a {@link Payment[]} of the objects whose PublicIDs are in {@code PaymentPublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Payments()                    : Payment[]                       { return fetchByPublicID(PaymentPublicIDs) }
  
  /** Convenience property that returns the {@link CheckPortion} whose PublicID is {@code PortionPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get Portion()                     : CheckPortion                    { return fetchByPublicID(PortionPublicID) }
  
  /** Convenience property that returns the {@link RecurringCheck} whose PublicID is {@code RecurringCheckPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get RecurringCheck()              : RecurringCheck                  { return fetchByPublicID(RecurringCheckPublicID) }
  
  /** Convenience property that returns a {@link ServiceRequestInvoice[]} of the objects whose PublicIDs are in {@code ServiceRequestInvoicePublicIDs}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get ServiceRequestInvoices()      : ServiceRequestInvoice[]         { return fetchByPublicID(ServiceRequestInvoicePublicIDs) }
  
  /** Convenience property that returns the {@link User} whose PublicID is {@code UpdateUserPublicID}, or {@code null} if PublicID is {@code null}. This property is only available on the server--it is not exposed through the WS-I layer. */
  property get UpdateUser()                  : User                            { return fetchByPublicID(UpdateUserPublicID) }

  /**
   * return a new CheckDTO that represents the current state of the supplied Check.
   * @param that The Check to be represented.
   */
  static function valueOf(that : Check) : CheckDTO {
    return new CheckDTO().readFrom(that)
  }

  /**
   * Returns all of the Check instances whose public IDs are in the supplied list, or an empty array if the supplied list is null or empty.
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
   * Returns the Check whose public ID is in the supplied list, or null if the publicID is null.
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