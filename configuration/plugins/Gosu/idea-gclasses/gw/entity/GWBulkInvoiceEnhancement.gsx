package gw.entity

uses gw.api.address.BulkInvoiceAddressOwner
uses gw.api.financials.PaymentMethodHelper
uses java.lang.SuppressWarnings

@Export
enhancement GWBulkInvoiceEnhancement : entity.BulkInvoice {
  property get AddressOwner() : BulkInvoiceAddressOwner {
    return new BulkInvoiceAddressOwner(this)
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
   * Update the payee related fields when the payee is picked. It returns true if the invoice's payee
   * or any of its mailing address's required fields are null, false otherwise.
   */
  function updatePayeeFields(helper: PaymentMethodHelper) : boolean {
    var payee = this.Payee
    if (null != payee) {
      helper.onPayeeChange(payee)
      if (gw.api.util.CurrencyUtil.isMultiCurrencyMode() and null != payee.PreferredCurrency and this.InvoiceItems.length == 0) {
        this.Currency = payee.PreferredCurrency
      }
      return not this.AddressOwner.AddressComplete
    }
    return true
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
}
