package gw.api.specialhandling
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculationUtil

/**
 * Implementation of the FinancialThresholdCalculator specific to the Net Total Paid 
 * calculation (i.e., Total Payments - Total Recoveries)
 */
@Export
class NetTotalPaidFinancialThresholdCalculator extends FinancialThresholdCalculatorBase {

  public static var INSTANCE : NetTotalPaidFinancialThresholdCalculator = new NetTotalPaidFinancialThresholdCalculator()

  private construct() {
    super(FinancialThreshold.TC_NETTOTALPAID)
  }

  /**
   * Retrieves the calculated Net Total Paid value for the passed in Claim.
   * 
   * @param claim the Claim for which to calculate current net total paid
   * @return the Net Total Paid value for the passed in claim as a CurrencyAmount
   */
  override function calculate(claim : Claim) : CurrencyAmount {
    return FinancialsCalculationUtil.getNetPayments().getAmount(claim)
  }
}
