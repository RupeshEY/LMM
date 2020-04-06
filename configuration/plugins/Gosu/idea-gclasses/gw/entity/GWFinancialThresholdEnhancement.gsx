package gw.entity
uses gw.api.locale.DisplayKey
uses gw.api.specialhandling.FinancialThresholdCalculator
uses gw.api.specialhandling.TotalPaidFinancialThresholdCalculator
uses gw.api.util.DisplayableException
uses gw.api.specialhandling.NetTotalPaidFinancialThresholdCalculator
uses gw.api.specialhandling.NetTotalIncurredFinancialThresholdCalculator

/**
 * This enhancement to the FinancialThreshold typelist provides a central extension point for 
 * ClaimCenter installations that wish to add an additional type of financial threshold calculation
 * other than the ones supplied out of the box (Net Total Incurred, Total Paid and Net Total Paid)
 */
@Export
enhancement GWFinancialThresholdEnhancement : typekey.FinancialThreshold {
  
  /**
   * This function supplies the threshold specific calculator that is needed for various
   * operations used when determining whether a Financial Threshold based special handler should be 
   * triggered.  These operations include getting the current value for a calculation, getting the previously saved
   * value, if any, and setting the saved value.
   * 
   * @return an instance of FinancialThresholdCalculator specific to this specific type of FinancialThreshold
   */
  public function calculator() : FinancialThresholdCalculator {
    switch(this) {
      case TC_TOTALPAID:
        return TotalPaidFinancialThresholdCalculator.INSTANCE
    
      case TC_NETTOTALPAID:
        return NetTotalPaidFinancialThresholdCalculator.INSTANCE
    
      case TC_NETTOTALINCURRED:
        return NetTotalIncurredFinancialThresholdCalculator.INSTANCE
    
      default:
        throw new DisplayableException(DisplayKey.get("Web.Admin.SpecialHandling.Error.FinancialThreshold.MissingCalculator"))
    }
  }
}
