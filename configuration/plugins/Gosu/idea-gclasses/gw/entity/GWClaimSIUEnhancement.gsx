package gw.entity

/**
 *Special Investigation utilities
 */
@Export
enhancement GWClaimSIUEnhancement: Claim {

  /**
   * Returns the Special Investigation Total Score for the claim
   */
  property get SIUTotalScore(): int {
    return util.SIUTotalScore.getSIUTotalScore(this)
  }

}
