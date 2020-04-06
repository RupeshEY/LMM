package gw.api.financials

/**
 * Code for maintaining consistency of payment method-related fields. Currently
 * only implemented for BulkInvoice.
 */
@Export
class PaymentMethodHelper {

  var _owner : BulkInvoice
  
  construct(owner : BulkInvoice) {
    _owner = owner
  }

  function onPayeeChange(payee : Contact) {
    // Fields for PaymentMethod == CHECK (except CheckNumber and DeliveryMethod are left alone)
    _owner.PayTo = payee.DisplayName
    _owner.MailTo = payee.DisplayName
    if (_owner.MailingAddress == null) {
      if (payee.PrimaryAddress == null) {
        _owner.MailingAddress = new Address()
      } else {
        _owner.MailingAddress = payee.PrimaryAddress.cloneAddress()
      }
    } else {
      _owner.MailingAddress.syncAddressFields(payee.PrimaryAddress)
    }

    // Fields for PaymentMethod == EFT
    _owner.AccountName = payee.DisplayName
    _owner.BankName = null
    _owner.BankAccountType = null
    _owner.BankAccountNumber = null
    _owner.BankRoutingNumber = null
  }

  /**
   * Set the MailingAddress when the MailingAddress is null.
   * It returns whether the MailingAddress required fields are invalid.
   */
  function setupMailingAddress() : boolean {
    if (_owner.PaymentMethod != TC_CHECK) {
      return false
    }
    if (_owner.MailingAddress == null) {
      if (_owner.Payee.PrimaryAddress != null){
        _owner.MailingAddress = _owner.Payee.PrimaryAddress.cloneAddress()
      } else {
        _owner.MailingAddress = new Address()
      }
    }

    return not _owner.AddressOwner.AddressComplete
  }


  property get SelectedEFTData() : EFTData {
    var accountNumber = _owner.BankAccountNumber
    if (accountNumber != null && accountNumber != "") {
      var records = _owner.Payee.EFTRecords
      if (records != null) {
        return records.firstWhere(\ eft -> eft.BankAccountNumber == accountNumber)
      }
    }
    return null
  }

  function onEFTDataChange(eft : EFTData) {
    if (eft != null) {
      _owner.AccountName = eft.AccountName
      _owner.BankName = eft.BankName
      _owner.BankAccountType = eft.BankAccountType
      _owner.BankAccountNumber = eft.BankAccountNumber
      _owner.BankRoutingNumber = eft.BankRoutingNumber
    }
  }
  
  function cleanUpBeforeCommit() {
    if (_owner.PaymentMethod == TC_CHECK) {
      _owner.AccountName = null
      _owner.BankName = null
      _owner.BankAccountType = null
      _owner.BankAccountNumber = null
      _owner.BankRoutingNumber = null
    } else {
      _owner.PayTo = _owner.AccountName
      _owner.CheckNumber = null
      _owner.DeliveryMethod = null
      _owner.MailTo = null
      _owner.MailingAddress = null
    }
  }

}
