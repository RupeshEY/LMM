package gw.api.specialhandling
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculationUtil

/**
 * Implementation of the FinancialThresholdCalculator specific to the Total Paid calculation
 */
@Export
class TotalPaidFinancialThresholdCalculator extends FinancialThresholdCalculatorBase {

  public static var INSTANCE : TotalPaidFinancialThresholdCalculator = new TotalPaidFinancialThresholdCalculator()

  private construct() {
    super(FinancialThreshold.TC_TOTALPAID)
  }

  /**
   * Retrieves the calculated Total Paments value for the passed in Claim.
   * 
   * @param claim the Claim for which to calculate current total payments
   * @return the Total Payments value for the passed in claim as a CurrencyAmount
   */
  override function calculate(claim : Claim) : CurrencyAmount {
    return FinancialsCalculationUtil.getTotalPayments().getAmount(claim)
  }
}
