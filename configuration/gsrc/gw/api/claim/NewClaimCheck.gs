package gw.api.claim

uses gw.api.locale.DisplayKey
uses gw.api.address.ClaimCheckAddressOwner

@Export
class NewClaimCheck extends NewClaimCheckBase {

  private var _EFTData : EFTData as EFTData = null 
  private var _bankName : String as BankName = null 
  private var _bankAccountType : BankAccountType as BankAccountType = null
  private var _bankAccountNumber : String as BankAccountNumber = null 
  private var _bankRoutingNumber : String as BankRoutingNumber = null 
  private var _paymentMethod : PaymentMethod as PaymentMethod = typekey.PaymentMethod.TC_CHECK
  
  /**
   * @param claim   Claim the check belongs to
   */
  construct(claim : Claim) {
    super(claim)
  }

  /**
   * This method is used to set additional fields during NewClaimCheckBase.create().
   * After check is created, this method is called to set some additional fields.
   * In this method, check's EFT related fields are set to the values stored.
   * @param check  Check to set fields on
   */
  override function populateAdditionalCheckFields(check : Check) {
    if (_paymentMethod == typekey.PaymentMethod.TC_EFT) {
      check.EFTData = _EFTData
      check.BankAccountNumber = _bankAccountNumber
      check.BankName = _bankName
      check.BankAccountType = _bankAccountType
      check.PaymentMethod = _paymentMethod
      check.BankRoutingNumber = _bankRoutingNumber
      check.PayTo = PayTo
      check.MailingAddress = null
      check.MailTo = null
      check.DeliveryMethod = null
    } 
  }

  function UseExchangeRate(claim: Claim) : boolean {
    return gw.api.util.CurrencyUtil.isMultiCurrencyMode() and this.TransactionCurrency != claim.Currency
  }

  property get IsEFT() : boolean {
    return this.PaymentMethod == typekey.PaymentMethod.TC_EFT
  }

  /**
   *  Validates that all the ClaimCheckAddressOwner required fields are valid
   *  @return whether the required fields are completed or not
   */
  function addressRequiredFieldsValid() : boolean {
    var addressOwner = this.ClaimCheckAddressOwner
    if (addressOwner.Address == null) {
      return false
    }
    return !addressOwner.RequiredFields.hasMatch( \ field -> addressOwner.Address.getFieldValue(field.Name) == null)
  }

  function checkMailingAddress() : String {
    var addressOwner = this.ClaimCheckAddressOwner

    if (_paymentMethod != typekey.PaymentMethod.TC_EFT) {
      if (addressOwner.Address == null or addressOwner.RequiredFields.hasMatch( \ field -> addressOwner.Address.getFieldValue(field.Name) == null )){
        return DisplayKey.get('Web.FNOLWizard.CheckReady.SendingErrorMessage')
      }
    }

    if (this.DeliveryMethod == typekey.DeliveryMethod.TC_SEND){
      if (this.ScheduledSendDate == null){
        return DisplayKey.get('Web.FNOLWizard.CheckReady.SendingErrorNoScheduledDate')
      }
    }
    return null
  }

  /**
   * Gets an address owner object for the payee MailingAddress
   */
  property get ClaimCheckAddressOwner() : ClaimCheckAddressOwner {
    if (this.MailingAddress == null) {
      if (this.Payee != null) {
        this.MailingAddress = this.Payee.PrimaryAddress.cloneAddress()
      } else {
        this.MailingAddress = new Address()
      }
    }
    return new ClaimCheckAddressOwner(this.MailingAddress)
  }

  function validateCheckAmount() : String {
    if (this.deductibleExceedsCheckAmount()) {
      return DisplayKey.get('Deductible.DeductibleAmountExccedsFNOLAmount')
    }

    return null
  }
}
