package gw.entity

uses gw.api.locale.DisplayKey
uses gw.api.util.CurrencyUtil
uses gw.api.util.LocaleUtil
uses gw.vendormanagement.servicerequeststate.ServiceRequestInvoiceOperationDefinition

uses java.lang.IllegalStateException
uses java.util.Date
uses gw.api.address.CheckAddressOwner
uses java.lang.SuppressWarnings

@Export
enhancement GWCheckEnhancement : Check {

  /**
   * Return service period display key for check if both the start and end period are non-null.
   */
  property get ServicePeriodString() : String {
    var shortFormat = LocaleUtil.CurrentLocale.getOutputDateFormat(SHORT, null)
    return (this.ServicePdStart == null or this.ServicePdEnd == null) ? "" :
            DisplayKey.get("Java.Financials.Check.ServicePeriod", shortFormat.format(this.ServicePdStart), shortFormat.format(this.ServicePdEnd))
  }  
  
  property set EFTData(contactEFT : EFTData) {
    this.AccountName = contactEFT.AccountName
    this.PayTo = contactEFT.AccountName
    this.BankAccountNumber = contactEFT.BankAccountNumber
    this.BankAccountType = contactEFT.BankAccountType
    this.BankName = contactEFT.BankName
    this.BankRoutingNumber = contactEFT.BankRoutingNumber
  }
  
  property get EFTData() : EFTData {
    if (this.FirstPayee.Payee.EFTRecords.Count > 0) {
      return this.FirstPayee.Payee.EFTRecords.where( \ e -> e.BankAccountNumber == this.BankAccountNumber ).first()    
    }
    return null
  }

  /**
   *  Format the Check#MailingAddress to show the same as if using the AddressSummary in the GlobalAddressInputSet
   *  or the DisplayName. If the MailingAddress is not set, it falls back to the OldMailToAddress string.
   *  @return string representation of the MailingAddress or OldMailToAddress
   */
  function FormatAddressSummary (formatAddress : boolean) : String {
    var mailingAddress = this.MailingAddress
    if (mailingAddress != null) {
      if (formatAddress) {
        return new gw.api.address.AddressFormatter().format(mailingAddress, "\n")
      } else {
        return mailingAddress.DisplayName
      }

    }
    return this.OldMailToAddress
  }

  /**
   *  Validates that all the CheckAddressOwner required fields are valid
   *  @return whether the required fields are completed or not
   */
  function addressRequiredFieldsValid() : boolean {
    if (this.CheckAddressOwner.Address == null) {
      return false
    }

    return !this.CheckAddressOwner.RequiredFields.hasMatch( \ field -> this.CheckAddressOwner.Address.getFieldValue(field.Name) == null)
  }

  /**
   * Adds a string to the beginning of this check's comments, separated by a ';', or sets the comment to be the given
   * string if the check previously had no comments.
   *
   * @param comment the string to prepend
   */
  public function prependComment(comment : String) {
    if (this.Comments == null || this.Comments.Empty) {
      this.Comments = comment
    } else if (comment != null && !comment.Empty) {
      this.Comments = comment + "; " + this.Comments
    }
  }
  
  /**
   * This method sets the MailTo, MailingAddress, and Reportability fields
   * based on the FirstPayee values.
   */
  private function setPrimaryPayeeRelatedFields() {
    var payee = this.FirstPayee
    this.MailTo = payee.Payee.DisplayName
    this.Reportability = typekey.ReportabilityType.get((payee.PayeeType == TC_VENDOR) ? "reportable" : "notreportable");
    updatePayeeAddress()
  }

  /**
   *  Set the Check#MailingAddress based on the selected Payee#PrimaryAddress.
   *  It synchronize the current fields with the selected Payee#PrimaryAddress, or
   *  it clones the Payee#PrimaryAddress if the Check#MailingAddress is not set.
   *  Note: if retired, it nulls out the Check#MailingAddress fields.
   */
  private function updatePayeeAddress() {

    if (this.MailingAddress == null) {
      this.MailingAddress = new Address()
    }

    var payeeAddress = this.FirstPayee.Payee.PrimaryAddress
    if (payeeAddress == null or payeeAddress.Retired) {
      this.MailingAddress.syncAddressFields(null)
    } else {
      this.MailingAddress.syncAddressFields(payeeAddress)
    }

    var addressOwner = CheckAddressOwner
    addressOwner.Address = this.MailingAddress
  }

  /**
   * This method sets the MailingAddress based on the PrimaryAddress of the payee.
   */
  public function cloneMailingAddress() {
    // Depending on the payment method the MailingAddress is not required
    if (this.PaymentMethod != PaymentMethod.TC_EFT) {
      var addressOwner = CheckAddressOwner
      if (this.MailingAddress == null) { // for updated checks that does not have a mailingaddress
        var payeePrimaryAddress = this.FirstPayee.Payee.PrimaryAddress
        if (payeePrimaryAddress == null) {
          this.MailingAddress = new Address()
        } else {
          this.MailingAddress = this.FirstPayee.Payee.PrimaryAddress.cloneAddress()
        }
      } else {
        addressOwner.Address = this.MailingAddress.cloneAddress()
        this.MailingAddress = addressOwner.Address
      }
    }
  }

  /**
   * Gets an address owner object for the payee MailingAddress
   */
  property get CheckAddressOwner() : CheckAddressOwner {
    return new CheckAddressOwner(this)
  }
  
  /**
   * If payment method is not EFT, resets PayTo field by joining all the payee displayNames with " & "
   */
  public function reconstructPayTo() {
    if (this.PaymentMethod != PaymentMethod.TC_EFT) {
      var joiner = com.google.common.base.Joiner.on(" & ").skipNulls()
      this.PayTo = joiner.join(this.Payees.map(\ c -> c.Payee.DisplayName))
    }
  }
  
  /**
   * Operates on a single check (e.g., each check in a group).
   */
  public function resetCloneFields( originalCheck : Check ) {
    this.ScheduledSendDate = Date.getTodayOrNextBusinessDay(this.BusinessCalendarAddress)
    this.IssueDate = null
    this.ServicePdStart = null
    this.ServicePdEnd = null

    // If CheckNumbers are set through the API by the downstream system, then this clone's CheckNumber will likely be
    // set again when it is requested.
    this.CheckNumber = null

    if( originalCheck.Status != TransactionStatus.TC_DENIED ) {
      this.Comments = null
      this.InvoiceNumber = null
    }
  }

  /**
   * Performs actions on a newly-cloned check and its group members before the user gets to edit it.
   */
  public function prepareClone( originalCheck : Check ) {
    this.removeClonedDeductibleLineItems()

    if( this.isGroupMember(false) ) {
      for( c in this.Group.Checks ) {
        c.resetCloneFields( originalCheck )
      }
    } else {
      this.resetCloneFields( originalCheck )
    }
  }

  /**
   * Returns a copy of this check for reissuance. This sets these fields:
   * <ul>
   * <li> CheckNumber = null
   * <li> IssueDate = null
   * <li> ScheduledSendDate = &lt;today&gt;
   * <li> Comments = null
   * <li> Status = {@link TransactionStatus#TC_AWAITINGSUBMISSION}
   * </ul>
   * If this is a primary check, the returned check will be a secondary check (since it won't have any payments yet);
   * when {@link #voidAndReissue} or {@link #stopAndReissue} is eventually called, the checks will swap roles:
   * the old check will become a secondary check, the new check will become the primary check, and the payments and
   * deductions will be moved to the new check.
   *
   * @return a new Check bean that is a copy of this check for purposes of reissuance.
   * @throws IllegalStateException if the check is not reissuable
   */
  public function createCheckForReissue() : Check {
    var newCheck = this.coreCreateCheckForReissue()
    newCheck.CheckNumber = null
    newCheck.IssueDate = null
    newCheck.ScheduledSendDate = Date.getTodayOrNextBusinessDay(this.BusinessCalendarAddress)
    newCheck.Comments = null
    return newCheck
  }

  /**
   * This method cleans up fields related to specific Payment Method
   * -for Check, it will null out bankAccountNumber, bankName, bankAccountType,
   *   and bankRoutingNumber
   * -for EFT, it will null out mailingAddress, mailTo, and DeliveryMethod.
   */
  public function removeUnusedPaymentMethodRelatedFields() {
    if (this.PaymentMethod == PaymentMethod.TC_CHECK) {
      this.BankAccountNumber = null
      this.BankName = null
      this.BankAccountType = null
      this.BankRoutingNumber = null
    } else if (this.PaymentMethod == PaymentMethod.TC_EFT) {
      this.MailingAddress = null // Removal of the attached Address happens in the BTC
      this.MailTo = null
      this.DeliveryMethod = null
    }
  }

  /**
   * This method handles payee changes.  
   * - set PayeeType
   * - populate PayTo field with the correct payTo if not EFT payment
   * - Sync up the EFT fields if payment method is EFT
   * - set/reset the primary payee fields
   */
  public function handleOnPickForPayee(checkPayee : CheckPayee) {
    if (checkPayee != null) {
      checkPayee.PayeeType = this.getSuggestedPayeeType(checkPayee.Payee);
    }
        
    reconstructPayTo()
    
    setPrimaryPayeeRelatedFields()
  }
  
  /*
    This method works with the legacy deductible feature, which was completely replaced by the new
    deductible support in ClaimCenter 6.0. To continue using this method and legacy deductibles,
    uncomment this method and make sure DeductibleSubtracted and the related properties are added
    to Payment.etx and Transaction.etx.

  function isDeductibleSubtracted() : Boolean {
    for (payment in this.Payments) {
      if (payment.DeductibleSubtracted) {
        return true
      }
    }
    return false;
  }
  */

  /**
   * Gets the specialist for the service requests linked to this check through service request invoices (they are
   * all expected to have the same specialist).
   * @throws IllegalStateException  if this check is not linked to any service request invoices (LinkedToServiceRequests
   *                                is false)
   */
  property get ServiceRequestSpecialist() : Contact {
    if (not this.LinkedToServiceRequests) {
      throw new IllegalStateException("this property may only be evaluated when the check is linked to service requests")
    }
    // All service request invoices linked to a check are expected to be on service requests with the same specialist,
    // so just get the specialist off the first
    return this.ServiceRequestInvoices.first().ServiceRequest.Specialist
  }

  /**
   * Gets the currency for the service requests linked to this check through service request invoices (they are
   * all expected to have the same currency).
   * @throws IllegalStateException  if this check is not linked to any service request invoices (LinkedToServiceRequests
   *                                is false)
   */
  property get ServiceRequestCurrency() : Currency {
    if (not this.LinkedToServiceRequests) {
      throw new IllegalStateException("this property may only be evaluated when the check is linked to service requests")
    }
    // All service request invoices linked to a check are expected to be on service requests with the same currency,
    // so just get the currency off the first
    return this.ServiceRequestInvoices.first().ServiceRequest.Currency
  }

  /**
   * Gets a string containing a bulleted list of invoices associated with this Service for use in warning messages
   * for when a check operations will affect the invoices
   * (e.g., {@link DisplayKey.get("Java.Financials.DeleteCheckWithInvoices.Tip.Payment")}).
   * Returns null if there aren't any invoices.
   */
  property get BulletedListOfServiceRequestInvoicesForWarning() : String {
    var orderedInvoices = this.ServiceRequestInvoices
        .orderBy(\ invoice -> invoice.ServiceRequest.ServiceRequestNumber)
        .thenBy(\ invoice -> invoice.ReferenceNumber ?: "")
    var bullets = orderedInvoices.map( \ invoice -> {
      var invoiceRefNum = invoice.ReferenceNumber.HasContent ? invoice.ReferenceNumber : DisplayKey.get("Java.Financials.Check.LinkedInvoiceWarningBullet.NoInvoiceRefNumber")
      return DisplayKey.get("Java.Financials.Check.LinkedInvoiceWarningBullet.Bullet", invoiceRefNum,invoice.ServiceRequest.ServiceRequestNumber)
    })
    return bullets.HasElements ? bullets.join("") : null
  }

  private function unlinkServiceRequestInvoice(changeDescription: String) {
    for (invoice in this.ServiceRequestInvoices) {
      invoice.performOperation(
          :operation         = ServiceRequestOperation.TC_UNPAYINVOICE,
          :context           = new ServiceRequestInvoiceOperationDefinition.OperationContext() { :Reason = changeDescription },
          :performedBySystem = true
      )
    }
  }

  /**
   * Finds all the service request invoices linked to this check, unlinks them, moves them back to Approved status,
   * and records a history event on the service request stating that the check was deleted.
   */
  public function unlinkServiceRequestInvoicesForDelete() {
    unlinkServiceRequestInvoice(DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceUnlinked.InvoiceCheckDeleted", this.DisplayName))
  }

  /**
   * Finds all the service request invoices linked to this check, unlinks them, moves them back to Approved status,
   * and records a history event on the service request stating that the check was voided.
   */
  public function unlinkServiceRequestInvoicesForVoid() {
    unlinkServiceRequestInvoice(DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceUnlinked.InvoiceCheckVoided", this.DisplayName))
  }

  /**
   * Finds all the service request invoices linked to this check, unlinks them, moves them back to Approved status,
   * and records a history event on the service request stating that the check was stopped.
   */
  public function unlinkServiceRequestInvoicesForStop() {
    unlinkServiceRequestInvoice(DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceUnlinked.InvoiceCheckStopped", this.DisplayName))
  }

  /**
   * Finds all the service request invoices linked to this check, unlinks them, moves them back to Approved status,
   * and records a history event on the service request stating that the check was transferred.
   */
  public function unlinkServiceRequestInvoicesForTransfer() {
    unlinkServiceRequestInvoice(DisplayKey.get("Web.ServiceRequest.StateTransition.Description.InvoiceUnlinked.InvoiceCheckTransferred", this.DisplayName))
  }

  /**
   * Retrieve the deprecated MailToAddress field previous versions.
   */
  @SuppressWarnings("deprecation")
  property get OldMailToAddress() : String {
    return this.MailToAddress
  }

  /**
   * Sets the deprecated MailToAddress field previous versions.
   */
  @SuppressWarnings("deprecation")
  property set OldMailToAddress(oldMailToAddress : String) {
    this.MailToAddress = oldMailToAddress
  }

  property get ShowAddressFields() : boolean {
    if (this.isGroupMember(false)) {
      return this.Group.Checks.hasMatch(\ check -> not check.addressRequiredFieldsValid() and check.FirstPayee.Payee != null)
    } else {
      return not this.addressRequiredFieldsValid() and this.FirstPayee.Payee != null
    }
  }

  /**
   * Returns the Net Amount as a String with the right currency code
   */
  property get NetAmountDisplayValue() : String {
    return CurrencyUtil.renderAsCurrency(this.NetAmount)
  }
}
