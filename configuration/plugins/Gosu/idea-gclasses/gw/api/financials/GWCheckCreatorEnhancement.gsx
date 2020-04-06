package gw.api.financials

/**
 * Defines the main methods on CheckCreator. Customers may modify these methods to add their
 * own customizations, and then call them from Gosu code.
 */
@Export
enhancement GWCheckCreatorEnhancement : CheckCreator {
  /**
   * Sets Payee and related fields (recipient, payTo, mailingAddress) to payee's information.
   * @param payee  payee to set
   * @return modified CheckCreator
   */
  function withPayeeAndRelatedFields(payee : Contact) : CheckCreator {
    return this.withPayee(payee)
               .withRecipient(payee)
               .withPayTo(payee.getDisplayName())
               .withMailingAddress(payee.getPrimaryAddress())
  }

  /**
   * This method is here for backwards compatibility. Please call
   * createAndPrepareForCommit() instead.
   * 
   * @deprecated Call createAndPrepareForCommit() instead.
   */
  @Deprecated("Call createAndPrepareForCommit() instead.")
  function create() : Check {
    return this.createAndPrepareForCommit()
  }

}
