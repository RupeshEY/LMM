package gw.claim.indicator
uses gw.api.locale.DisplayKey
uses gw.api.claim.indicator.ClaimIndicatorMethodsImpl
uses gw.api.financials.FinancialsCalculations
uses gw.api.util.CurrencyUtil

/**
 * Claim indicator that turns on if the claim total incurred exceeds a threshold
 */
@Export
class LargeLossClaimIndicatorMethodsImpl extends ClaimIndicatorMethodsImpl {

  /**
   * Constructor, called when an indicator is created or read from the database
   */
  construct(inIndicator : LargeLossClaimIndicator) {
    super(inIndicator, "indicator_icon_largeLoss.png")
  }

  /**
   * Override Indicator property with a more specific type, so can access fields
   * specific to LargeLossClaimIndicator
   */
  override property get Indicator() : LargeLossClaimIndicator {
    return super.Indicator as LargeLossClaimIndicator
  }

  /**
   * Update, checks the claim's total incurred against the appropriate threshold from
   * the LargeLossThreshold reference table, and sets the indicator on if it exceeds the
   * threshold
   */
  override function update() {
    var modifiedTransactionSets = Indicator.Bundle.getAllModifiedBeansOfType(TransactionSet)
    var modifiedTransactions = Indicator.Bundle.getAllModifiedBeansOfType(Payment)
    if (modifiedTransactions.Count > 0 or modifiedTransactionSets.Count > 0 or Indicator.New) {
      var claim = Indicator.Claim
      var claimPolicyType = claim.Policy.PolicyType
      var netTotalIncurred = FinancialsCalculations.getTotalIncurredNet().withClaim(claim).Amount
        
      var thresholdValue = LargeLossThreshold.getThreshold(claimPolicyType, LargeLossNotificationType.TC_CC).ThresholdValue  
      if (netTotalIncurred != null and thresholdValue != null) {
        var netTotalIncuredInReportingCurrency = netTotalIncurred.convert(CurrencyUtil.getDefaultCurrency(), CurrencyUtil.getRoundingMode())
        setOn(netTotalIncuredInReportingCurrency.Amount >= thresholdValue)
      }
      Indicator.NetTotalIncurred = netTotalIncurred
    }
  }
  
  /**
   * Text label, just has two values depending on whether indicator is on or off
   */
  override property get Text() : String {
    return Indicator.IsOn ? DisplayKey.get("Web.Claim.LargeLossClaimIndicator.LargeLoss.OnText")
            : DisplayKey.get("Web.Claim.LargeLossClaimIndicator.LargeLoss.OffText")
  }
  
  /**
   * This indicator does not have any hover text
   */
  override property get HoverText() : String {
    return null
  }
}
