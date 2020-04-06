package gw.entity

@Export
enhancement GWClaimFraudEnhancement: entity.Claim {

  property get FraudIndicator() : boolean {
    if (this.ClosedOutcome == ClaimClosedOutcomeType.TC_FRAUD) {
      return true
    }
    var siuClaimIndicator = this.ClaimIndicators.firstWhere( \ ci -> ci typeis SIUClaimIndicator) as SIUClaimIndicator
    if (siuClaimIndicator.IsOn) {
      return true
    }
    return this.Exposures.hasMatch( \ exp -> exp.LossParty == LossPartyType.TC_INSURED
                                             and exp.ClosedOutcome == ExposureClosedOutcomeType.TC_FRAUD)
  }
}