package gw.entity

uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculationUtil
uses gw.api.financials.FinancialsCalculations
uses gw.api.locale.DisplayKey
uses gw.pl.util.ArgCheck

uses java.math.BigDecimal

@Export
enhancement GWSubroReserveLineEnhancement : entity.ReserveLine {

  /**
   * Returns for this reserveline the total payments, minus recoveries where category is not subro, in the claim currency.
   */
  property get NetPaidExcludingSubroRecovery() : CurrencyAmount{
    var totalPaidForLossCosts = FinancialsCalculations.getTotalPayments().withReserveLine(this).Amount
    var allRecovery = FinancialsCalculations.getTotalRecoveries().withReserveLine(this).Amount

    var subroRecovery = FinancialsCalculations
        .getFinancialsCalculation(FinancialsCalculationUtil.getTotalRecoveriesExpression())
        .withReserveLine(this)
        .withRecoveryCategory(TC_SUBRO)
        .Amount
    
    if (totalPaidForLossCosts == null ){
      totalPaidForLossCosts = BigDecimal.ZERO.ofCurrency(this.Claim.Currency)
    }

    if (allRecovery == null ){
      allRecovery = BigDecimal.ZERO.ofCurrency(this.Claim.Currency)
    }

    if (subroRecovery == null ){
      subroRecovery = BigDecimal.ZERO.ofCurrency(this.Claim.Currency)
    }
   
    return (totalPaidForLossCosts - allRecovery + subroRecovery)
  }

  /**
   * Returns for this reserveline the total payments, minus recoveries where category is not subro, in the reserving currency.
   */
  property get NetPaidReservingAmountExcludingSubroRecovery() : CurrencyAmount{
    var totalPaidForLossCosts = FinancialsCalculations.getTotalPayments().withReserveLine(this).ReservingAmount
    var allRecovery = FinancialsCalculations.getTotalRecoveries().withReserveLine(this).ReservingAmount

    var subroRecovery = FinancialsCalculations
        .getFinancialsCalculation(FinancialsCalculationUtil.getTotalRecoveriesExpression())
        .withReserveLine(this)
        .withRecoveryCategory(TC_SUBRO)
        .ReservingAmount

    if (totalPaidForLossCosts == null ){
      totalPaidForLossCosts = BigDecimal.ZERO.ofCurrency(this.ReservingCurrency)
    }

    if (allRecovery == null ){
      allRecovery = BigDecimal.ZERO.ofCurrency(this.ReservingCurrency)
    }

    if (subroRecovery == null ){
      subroRecovery = BigDecimal.ZERO.ofCurrency(this.ReservingCurrency)
    }
   
    return (totalPaidForLossCosts - allRecovery + subroRecovery)
  }

  /**
   * Returns for this reserveline the total recoveries with category subro in the claim currency.
   */
  property get SubroRecovery() : CurrencyAmount {
    var subroRecovery = FinancialsCalculations
        .getFinancialsCalculation(FinancialsCalculationUtil.getTotalRecoveriesExpression())
        .withReserveLine(this)
        .withRecoveryCategory(TC_SUBRO)
        .Amount
    return (subroRecovery == null ) ? BigDecimal.ZERO.ofCurrency(this.Claim.Currency) : subroRecovery
  }

  /**
   * Returns for this reserveline the total recoveries with category subro in the reserving currency.
   */
  property get SubroRecoveryReservingAmount() : CurrencyAmount {
    var subroRecoveryReservingAmount = FinancialsCalculations
        .getFinancialsCalculation(FinancialsCalculationUtil.getTotalRecoveriesExpression())
        .withReserveLine(this)
        .withRecoveryCategory(TC_SUBRO)
        .ReservingAmount
    return (subroRecoveryReservingAmount == null ) ? BigDecimal.ZERO.ofCurrency(this.ReservingCurrency) :
        subroRecoveryReservingAmount
  }

  /**
   * Set Available Reserves for this reserveline to the specified amount.
   *
   * @param amount new available reserve amount in the reserving currency
   * @param submittingUser user by which the newly created transactionset will be submitted
   * @return the newly created reserve, or null if available reserves are already equal to the specified amount
   */
  function setAvailableReservesInReservingCurrency(amount : CurrencyAmount, submittingUser : User) : Reserve {
    ArgCheck.satisfiesCriteria(amount.Currency == this.ReservingCurrency, "amount.Currency must match ReservingCurrency")
    var currentAmount = FinancialsCalculations
        .getFinancialsCalculation(FinancialsCalculationUtil.getAvailableReservesExpression())
        .withReserveLine(this)
        .noNulls()
        .ReservingAmount
    var deltaAmount = amount.subtractStrict(currentAmount)
    if (deltaAmount.Amount.IsZero) {
      return null
    }

    var reserveSet = this.Claim.newReserveSet()
    reserveSet.RequestingUser = submittingUser
    var reserve = reserveSet.newReserve(this.Exposure, this.CostType, this.CostCategory, this.ReservingCurrency)
    var reserveComment = Reserve.Type.DisplayName + DisplayKey.get('Java.Financials.CreateDeltaTransaction.Comment')
    reserve.addNewLineItem(deltaAmount, reserveComment, null)
    reserveSet.prepareForCommit()
    return reserve
  }

  /**
   * Set Open Recovery Reserves for this reserveline on the given RecoveryCategory to the specified amount.
   *
   * @param category RecoveryCategory
   * @param amount new open recovery reserve amount in the reserving currency
   * @param submittingUser user by which the newly created transactionset will be submitted
   * @return the newly created recovery reserve, or null if open recovery reserves are already equal to the specified amount
   */
  function setOpenRecoveryReservesInReservingCurrency(category : RecoveryCategory, amount : CurrencyAmount, submittingUser : User) : RecoveryReserve {
    ArgCheck.satisfiesCriteria(amount.Currency == this.ReservingCurrency, "amount.Currency must match ReservingCurrency")
    var currentAmount = FinancialsCalculations
        .getFinancialsCalculation(FinancialsCalculationUtil.getOpenRecoveryReservesExpression())
        .withReserveLine(this)
        .withRecoveryCategory(category)
        .noNulls()
        .ReservingAmount
    var deltaAmount = amount.subtractStrict(currentAmount)
    if (deltaAmount.Amount.IsZero) {
      return null
    }

    var recoveryReserveSet = this.Claim.newRecoveryReserveSet()
    recoveryReserveSet.RequestingUser = submittingUser
    var recoveryReserve = recoveryReserveSet.newRecoveryReserve(this.Exposure, this.CostType, this.CostCategory, category, this.ReservingCurrency)
    var recoveryReserveComment = RecoveryReserve.Type.DisplayName + DisplayKey.get('Java.Financials.CreateDeltaTransaction.Comment')
    recoveryReserve.addNewLineItem(deltaAmount, recoveryReserveComment, null)
    recoveryReserveSet.prepareForCommit()
    return recoveryReserve
  }
}
