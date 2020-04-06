package gw.entity

uses gw.api.locale.DisplayKey
uses gw.api.financials.FinancialsUtil
uses gw.api.util.DisplayableException

@Export
enhancement GWPaymentEnhancement : Payment
{

  /**
   * Returns true if this payment contains a line item associated with a deductible,
   * false otherwise.
   */
  public function hasDeductibleLineItem() : Boolean {
    return SharedDeductible.TransactionLineItem.Transaction == this
  }

  /**
   * Returns true if this payment has a line item with former deductible line
   * category, false otherwise
   */
  public function hasFormerDeductibleLineItem() : boolean {
    return this.LineItems.hasMatch( \ t -> t.LineCategory == LineCategory.TC_FORMERDEDUCTIBLE )
  }

  /**
   * Returns this payment's exposure's coverage's deductible
   * (which will be identical for all payments that have the same exposure)
   * if it exists. Note that the deductible returned, if paid,
   * may not necessarily be paid by this payment. The returned value may be null.
   */
  property get SharedDeductible() : Deductible {
    return this.Exposure.Coverage.ClaimDeductible
  }

  /**
   * Returns the deductible applied to a line item on this payment, if one exists.
   * If a value would be returned, it is the same as SharedDeductible.
   * If no such deductible exists, a UserDisplayableException is thrown.
   */
  property get AppliedDeductible() : Deductible {
    if (!hasDeductibleLineItem()) {
      throw new DisplayableException(DisplayKey.get("Deductible.Error.PaymentDoesNotHaveDeductible"))
    }
    return SharedDeductible
  }

  /**
   * Applies a deductible to the this payment. If the payment's exposure's coverage has no deductible,
   * or if the deductible has already been paid, this method throws an exception. Otherwise,
   * a new line item in the negative amount of the deductible and with line category "deductible"
   * is created and added to the payment. Returns the newly created line item.
   */
  function addDeductibleLineItem() : TransactionLineItem {
    if (hasDeductibleLineItem()) {
      throw new DisplayableException(DisplayKey.get("Deductible.Error.DeductibleTLIAlreadyExists"))
    }
    if (SharedDeductible == null) {
      throw new DisplayableException(DisplayKey.get("Deductible.Error.NoApplicableDeductible"))
    }
    if (SharedDeductible.Paid) {
      throw new DisplayableException(DisplayKey.get("Deductible.Error.DeductibleAlreadyPaid"))
    }

    var tli = new TransactionLineItem()
    this.addToLineItems(tli)
    tli.setAmountMatchingCurrency(-SharedDeductible.Amount)

    tli.LineCategory = TC_DEDUCTIBLE
    SharedDeductible.linkItem(tli)
    return SharedDeductible.TransactionLineItem
  }

  /**
   * Unlinks a deductible entity from a transaction line item on this payment, if one exists.
   * This does NOT remove the line item from the payment.
   */
  public function unlinkDeductible() {
    if (!hasDeductibleLineItem()) {
      throw new DisplayableException(DisplayKey.get("Deductible.Error.NoDeductibleToUnlinkFromPayment"))
    }
    AppliedDeductible.TransactionLineItem.unlinkDeductible()
  }

  /**
   * Unlinks the given deductible entity from a transaction line item on this payment, if one exists.
   * Removes that line item from this payment. If the given deductible is null, or its linked
   * transaction line item does not belong to this payment, this method does nothing.
   */
  public function unapplyAndRemoveDeductibleLineItem(d : Deductible) {
    if (d == null) {
      return
    }
    var tli = d.TransactionLineItem
    if (tli.Transaction != this) {
      return
    }
    tli.unlinkDeductible()
    this.removeFromLineItemsIfEditable(tli)
  }

  /**
   * Unlinks the deductible pointing to the given line item. The given line item
   * must be a valid deductible line item, or an exception is thrown.
   * Removes the line item from this payment.
   */
  function removeDeductibleLineItem(tli : TransactionLineItem) {
    if (!tli.isDeductibleLineItem()) {
      throw new DisplayableException(DisplayKey.get("Deductible.Error.NonDeductibleTransactionLineItem"))
    }
    tli.unlinkDeductible()
    this.removeFromLineItemsIfEditable(tli)
  }

  /**
   * Links deductible line items in preparation for a transfer or recode if necessary. This method examines the
   * potential deductible line items on this payment, i.e. line items that have a line category of "Deductible" but are
   * not linked to a Deductible. For each such line item, links it to a Deductible if:
   *
   *   - the deductible exists, is unpaid and unwaived -AND-
   *   - The amount on the Deductible matches that on the line item. Since the two amounts could possibly be in
   *     different currencies, it looks at the Line Item's Transaction, Reserving and Claim Currencies (in that order)
   *     and check if any of them match the Deductible(Coverage) Currency. If a match is found, it uses the
   *     corresponding amount on the Line Item to compare against the Deductible Amount.
   *
   * Otherwise, no link is made, and the line item's category is changed to "Former Deductible".
   * NOTE : This method should only be called on the onset payment in a recode operation or on the NEW check in a
   * transfer operation, and none of its line items should be linked to deductibles prior to this call.
   */
  public function linkDeductible() {
    for (tli in this.LineItems.where( \ t -> t.LineCategory == TC_DEDUCTIBLE && !t.isDeductibleLineItem() )) {
      if (shouldTxLineItemBeLinkedToDeductible(tli)) {
        SharedDeductible.linkItem(tli)
      } else {
        tli.LineCategory = TC_FORMERDEDUCTIBLE
      }
    }
  }

  internal function shouldTxLineItemBeLinkedToDeductible(tli : TransactionLineItem) : boolean {
    if(SharedDeductible == null or SharedDeductible.Paid or SharedDeductible.Waived or
        not FinancialsUtil.isUseDeductibleHandling()) {
      return false
    }

    var tliAmount = tli.getAmountMatchingCurrency(SharedDeductible.Currency)

    return (tliAmount != null) and SharedDeductible.Amount == tliAmount.negate()
  }

  /**
   * Re-links former deductible line items to Deductible for resubmit, if necessary. This method examines the former
   * deductible line items on this payment, i.e. line items that have a line category of "Former Deductible". For each
   * such line item, updates it's Line Category from Former Deductible to Deductible and links it to the Deductible, if:
   *
   *   - the Deductible exists, is unpaid and unwaived -AND-
   *   - The amount on the Deductible matches that on the line item. Since the two amounts could possibly be in
   *     different currencies, it looks at the Line Item's Transaction, Reserving and Claim Currencies (in that order)
   *     and check if any of them match the Deductible(Coverage) Currency. If a match is found, it uses the
   *     corresponding amount on the Line Item to compare against the Deductible Amount.
   *
   *  Otherwise, no link is made.
   *
   * NOTE : This method should only be called before resubmit check operation, and none of its line items should be
   * linked to deductibles prior to this call.
   */
  public function relinkFormerDeductibleForResubmit() {
    for (tli in this.LineItems.where( \ t -> t.LineCategory == LineCategory.TC_FORMERDEDUCTIBLE )) {
      if (shouldFormerDeductibleTxLineItemBeReLinked(tli)) {
        tli.LineCategory = LineCategory.TC_DEDUCTIBLE
        SharedDeductible.linkItem(tli)
      }
    }
  }

  internal function shouldFormerDeductibleTxLineItemBeReLinked(tli : TransactionLineItem) : boolean {
    return shouldTxLineItemBeLinkedToDeductible(tli)
  }

  /**
   * Gets the validation messages for payments on the check wizard and quick check wizard
   * if payment is not valid, return DisplayKey.get("Java.Financials.CheckWizard.Error.Payment.PaymentExceedsReserves")
   * if payment line item has deductibles and the amount of deductibles is greater than the amount of
   *    other line items, return DisplayKey.get("Deductible.DeductibleAmountExceedsOtherLineItems")
   */
  function getCheckWizardPaymentValidationExpression() : String {
    if (!this.Valid) {
      return DisplayKey.get("Java.Financials.CheckWizard.Error.Payment.PaymentExceedsReserves")
    }

    var deductibleLineItems = this.LineItems.where( \ t -> t.LineCategory == TC_DEDUCTIBLE)
    if(deductibleLineItems.HasElements) {
      var deductibleLineItemsTxAmountSum = deductibleLineItems.sum(\t -> t.TransactionAmount.Amount).abs()
      var otherLineItemsTxAmountSum = this.LineItems.subtract(deductibleLineItems).sum(\t -> t.TransactionAmount)

      if (otherLineItemsTxAmountSum == null ||
          deductibleLineItemsTxAmountSum > otherLineItemsTxAmountSum.toNumber()) {
        return DisplayKey.get("Deductible.DeductibleAmountExceedsOtherLineItems")
      }
    }

    return null
  }
}
