package gw.claim.indicator
uses gw.api.locale.DisplayKey
uses gw.api.claim.indicator.ClaimIndicatorMethodsImpl

/**
 * Claim indicator that turns on if the claim SIU status is "under investigation"
 */
@Export
class SIUClaimIndicatorMethodsImpl extends ClaimIndicatorMethodsImpl {

  /**
   * Constructor, called when an indicator is created or read from the database
   */
  construct(inIndicator : SIUClaimIndicator) {
    super(inIndicator, "indicator_icon_siu.png")
  }

  /**
   * Update, sets indicator on if the claim's SIU status is "under investigation"
   */
  override function update() {
    setOn(Indicator.Claim.SIUStatus == SIUStatus.TC_UNDER_INVESTIGATION)
  }
  
  /**
   * Label text, returns a description of the claim's SIU status, or a special
   * label if the status is null
   */
  override property get Text() : String {
    var status = Indicator.Claim.SIUStatus
    return status != null ? status.Description
            : DisplayKey.get("Web.Claim.SIUClaimIndicator.SIUStatus.OffText")
  }

  /**
   * This indicator does not have any hover text
   */
  override property get HoverText() : String {
    return null
  }
}
