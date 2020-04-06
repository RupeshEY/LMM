package gw.api.specialhandling
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculationUtil

/**
 * Implementation of the FinancialThresholdCalculator specific to the Net Total Incurred calculation 
 * (i.e., Open Reserves + Total Payments)
 */
@Export
class NetTotalIncurredFinancialThresholdCalculator extends FinancialThresholdCalculatorBase {

  public static var INSTANCE : NetTotalIncurredFinancialThresholdCalculator = new NetTotalIncurredFinancialThresholdCalculator()

  private construct() {
    super(FinancialThreshold.TC_NETTOTALINCURRED)
  }

  /**
   * Retrieves the calculated Net Total Incurred value for the passed in Claim.
   * 
   * @param claim the Claim for which to calculate current net total incurred.
   * @return the Net Total Incurred value for the passed in claim as a CurrencyAmount
   */
  override function calculate(claim : Claim) : CurrencyAmount {
    return FinancialsCalculationUtil.getTotalIncurredNet().getAmount(claim)
  }

}
