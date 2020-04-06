package gw.financials

uses gw.api.financials.FinancialsCalculationUtil
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculator
uses gw.api.financials.FinancialsCalculations

@Export
public class CoverageLimitRulesUtil {

  /**
   * Essentially, Gross Incurred as if all Reserve and Payment transactions in the system were
   * approved and escalated.
   */
  static function getCommittedAndFutureAndPendingApprovalPaymentsAndReserves() : FinancialsCalculator {
    return FinancialsCalculations.getFinancialsCalculation(
               FinancialsCalculationUtil.getTotalPaymentsIncludingPendingExpression()
               .plus(FinancialsCalculationUtil.getAvailableReservesExpression())
               .plus(FinancialsCalculationUtil.getPendingApprovalReservesExpression()))
  }

  /**
   * If all Reservelines on the given exposures have the same ReservingCurrency which matches
   * limitCurrency, return true.
   */
  static function shouldCompareInReservingCurrency( exposures : Exposure[], costType : CostType, limitCurrency : Currency) : boolean {
    for (exp in exposures) {
      var reservingCurrencies = exp.getReservingCurrencies( costType, null)
      if ( reservingCurrencies.size() != 1 or reservingCurrencies.get(0) != limitCurrency ) {
        return false
      }
    }
    return true
  }

  /**
   * Gets the FinancialCalculator's total: if useReservingAmount == true, uses the reservingCurrency
   * to get the ReservingAmount of the calc. Otherwise, returns the ClaimAmount of the calc.
   */
  static function getCalcValueForCompare( calc : FinancialsCalculator, reservingCurrency : Currency, useReservingCurrency : boolean) : CurrencyAmount {
    var calcResult: CurrencyAmount = null
    if ( useReservingCurrency ) {
      var calcWithReserving = calc.withReservingCurrency( reservingCurrency )
      calcResult = calcWithReserving.noNulls().ReservingAmount
    } else {
      calcResult = calc.noNulls().ClaimAmount
    }
    return calcResult
  }
}