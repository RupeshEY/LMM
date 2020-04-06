package gw.claim.indicator

uses gw.api.claim.indicator.ClaimIndicatorMethodsImpl
uses gw.api.locale.DisplayKey

/**
 * Claim indicator that turns on if there is subrogation on the claim
 */
@Export
class SubrogationClaimIndicatorMethodsImpl extends ClaimIndicatorMethodsImpl {

  /**
   * Constructor, called when an indicator is created or read from the database
   */
  construct(inIndicator : SubrogationClaimIndicator) {
    super(inIndicator, "indicator_icon_subrogation_16.png")
  }

  /**
   * Update, sets the indicator on if there is subrogation on the claim
   */
  override function update() {
    var subrogationSummary = Indicator.Claim.SubrogationSummary
    if (subrogationSummary == null) {
      setOn(false)
    } else {
      setOn(true)
    }
  }

  /**
   * Text label, returns the description of the current claim subrogation status
   */  
  override property get Text() : String {
    if (Indicator.IsOn) {
      var subrogationSummary = Indicator.Claim.SubrogationSummary
      var subrogationStatus = subrogationSummary.Status
      return DisplayKey.get("Web.Claim.SubrogationClaimIndicator.OnText", subrogationSummary.Status.DisplayName)
    }
    return DisplayKey.get("Web.Claim.SubrogationClaimIndicator.OffText")
  }

  /**
   * Hover text, returns the description of the current claim subrogation status
   */
  override property get HoverText() : String {
    return Indicator.IsOn ? DisplayKey.get("Web.Claim.SubrogationClaimIndicator.HelpText", Indicator.Claim.SubrogationSummary.Status.DisplayName) : null
  }
  
}
