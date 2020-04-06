package gw.entity
uses gw.api.locale.DisplayKey
uses gw.util.DeductibleCalculator
uses gw.api.util.CurrencyUtil
uses gw.api.util.DisplayableException

@Export
enhancement GWDeductibleEnhancement : Deductible
{
  /**
   * Recalculates the amount that this deductible should use to apply to a payment.
   * Assumes that this deductible is already linked to a coverage.
   */
  public function recalculateAmount() {
    this.Currency = this.Coverage.Currency
    this.Amount = DeductibleCalculator.calculateDeductibleAmountForCoverage(this.Coverage)
  }

  /**
   * This should only be called by TLI.unlinkDeductible(), since it's half the operation.
   * See also DeductibleUnlinkMethods.unlinkTransactionLineItems().
   * <p>
   * Sets this Deductible's transaction line item to null and Paid to false.
   * Does not modify the line item itself at all.
   * If its line item is already null, throws a UserDisplayableException.
   */
  public function unlink() {
    if (this.TransactionLineItem == null) {
      throw new DisplayableException(DisplayKey.get("Deductible.Error.CannotUnlinkNonDeductibleTLI"))
    }
    this.TransactionLineItem = null
    this.Paid = false
  }

  /**
   * Sets this deductible's transaction line item to the given line item and Paid to true.
   * Does not modify the line item itself at all.
   * If the given line item's line category is not "Deductible", this method throws an exception.
   */
  public function linkItem(tli : TransactionLineItem) {
    if (tli.LineCategory != TC_DEDUCTIBLE) {
      throw new DisplayableException(DisplayKey.get("Deductible.Error.CannotLinkDeductibleToNonDeductibleTLI"))
    }
    this.TransactionLineItem = tli
    this.Paid = true
  }

  /**
   * Returns the single transaction line item for which this deductible is applied, if any,
   * or null if none.
   *
   * This property assumes that deductibles are only ever paid on a single TLI.
   * It should not be used if deductibles can be paid across multiple TLIs (which does not occur OOB)
   * and will throw an exception if it is in fact linked to multiple TLIs.
   */
  property get TransactionLineItem() : TransactionLineItem {
    if (this.TransactionLineItems.length > 1) {
      throw new DisplayableException(DisplayKey.get("Deductible.Error.DeductiblePaidAcrossMultipleTLIs"))
    }
    if (this.TransactionLineItems == null || this.TransactionLineItems.length == 0) {
      return null
    }
    return this.TransactionLineItems[0]
  }
  
  /**
   * Sets the single transaction line item for which this deductible is applied.
   * If this deductible is already linked to a TLI, that TLI is unlinked.
   * If the given TLI is already linked to a deductible, using this property will
   * overwrite its existing deductible link.
   *
   * This property assumes that deductibles are only ever paid on a single TLI.
   * It should not be used if deductibles can be paid across multiple TLIs (which does not occur OOB)
   * and will throw an exception if it is in fact linked to mulitple TLIs.
   */
  property set TransactionLineItem(tli : TransactionLineItem) {
    if (this.TransactionLineItems.length > 1) {
      throw new DisplayableException(DisplayKey.get("Deductible.Error.DeductiblePaidAcrossMultipleTLIs"))
    }
    if (this.TransactionLineItems.length == 1) {
      this.TransactionLineItems[0].Deductible = null
    }
    if (tli != null) {
      tli.Deductible = this
    }
  }
  
  /**
   * generate a string which represents "coverage coverageType" or "coverageType"
   */
  function getDisplayLabel(withCoverage : boolean) : String {
    var coverage = this.Coverage
    var coverageNamePrefix = withCoverage ? "${coverage.DisplayName} " : ""
    return "${coverageNamePrefix} ${coverage.Type.DisplayName}"
  }

  /**
   * generate a string for "amount paid/unpaid/waived" to display on the DeductibleInputSet
   */
  property get DisplayAmount() : String {
    return "${CurrencyUtil.renderAsCurrency(this.Amount)} ${StatusString}"
  }
  
  //generate the status of deductible for the full and short description
  internal property get StatusString() : String {
    return this.Waived ? DisplayKey.get("Deductible.Waived") : this.Paid ? DisplayKey.get("Deductible.Paid") : DisplayKey.get("Deductible.Unpaid")
  }
}
