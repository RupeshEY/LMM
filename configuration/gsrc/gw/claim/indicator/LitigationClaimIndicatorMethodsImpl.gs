package gw.claim.indicator
uses gw.api.locale.DisplayKey
uses gw.api.claim.indicator.ClaimIndicatorMethodsImpl

/**
 * Claim indicator that turns on if the claim litigation status is "litigated" or
 * "complete"
 */
@Export
class LitigationClaimIndicatorMethodsImpl extends ClaimIndicatorMethodsImpl {

  /**
   * Constructor, called when an indicator is created or read from the database
   */
  construct(inIndicator : LitigationClaimIndicator) {
    super(inIndicator, "indicator_icon_litigation.png")
  }

  /**
   * Update, sets the indicator on if the the claim litigation status is "litigated"
   * or "complete"
   */
  override function update() {
    var status = Indicator.Claim.LitigationStatus
    setOn(status == TC_LITIGATED or status == TC_COMPLETE) 
  }

  /**
   * Text label, returns the description of the current claim litigation status
   */  
  override property get Text() : String {
    return Indicator.Claim.LitigationStatus.Description
  }

  /**
   * Hover text, returns the names of any open matters or a special label if there
   * are none
   */
  override property get HoverText() : String {
    var openMatters = Indicator.Claim.Matters.where(\ m -> not m.Closed).orderBy(\ m -> m.CreateTime)
    return openMatters.Count > 0
      ? openMatters.map(\ m -> m.Name).join(DisplayKey.get("Web.LitigationClaimIndicator.MatterNameSeparator"))
      : Indicator.Claim.LitigationStatus.DisplayName
  }
  
}
