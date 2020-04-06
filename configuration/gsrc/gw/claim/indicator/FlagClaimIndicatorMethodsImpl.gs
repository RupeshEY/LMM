package gw.claim.indicator
uses gw.api.claim.indicator.ClaimIndicatorMethodsImpl

/**
 * Claim indicator that turns on if the claim is flagged
 */
@Export
class FlagClaimIndicatorMethodsImpl extends ClaimIndicatorMethodsImpl {

  /**
   * Constructor, called when an indicator is created or read from the database
   */
  construct(inIndicator : FlagClaimIndicator) {
    super(inIndicator, "claim_flag.png")
  }

  /**
   * Update, sets indicator on if the claim's Flagged field is "isflagged"
   */
  override function update() {
    setOn(Indicator.Claim.Flagged == FlaggedType.TC_ISFLAGGED)
  }
  
  /**
   * Text label, returns the description of the current claim Flagged state
   */
  override property get Text() : String {
    return Indicator.Claim.Flagged.Description
  }

  /**
   * Hover text is taken from the claim's flagged reason
   */
  override property get HoverText() : String {
    return Indicator.Claim.FlaggedReason
  }
}
