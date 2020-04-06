package libraries
uses gw.api.financials.CurrencyAmount

@Export
enhancement sumforPIPAgg : entity.Claim {

  function sumForPIPClaimAgg() : CurrencyAmount {
    var total = new CurrencyAmount(0, this.Claim.Currency)
    for (expo in this.Exposures) {
      if (this.Policy.isPIPCoverageType(expo.Coverage.Type)) {
        total += expo.totalForCoverageType(expo.Coverage.Type)
      }     
    }
    return total;
  }

  function sumForPIPNonmedAgg(claimant : Contact) : CurrencyAmount {
    var total = new CurrencyAmount(0, this.Claim.Currency)
    for (expo in this.Exposures) {
      var covType = expo.Coverage.Type
      var policy = this.Claim.Policy
      if (policy.coversPIPDeathBenefits(covType)
          || policy.coversPIPFuneralExpenses(covType)    
          || policy.coversPIPWageLoss(covType)) {
       total += expo.totalForCoverageTypeAndClaimant(expo.Coverage.Type, claimant)
      }     
    }
    return total;
  }

  function sumForPIPPersonAgg(claimant : Contact) : CurrencyAmount {
    var total = new CurrencyAmount(0, this.Claim.Currency)
    for (expo in this.Exposures) {
      var covType = expo.Coverage.Type
      var policy = this.Claim.Policy
      if (policy.coversPIPDeathBenefits(covType)
          || policy.coversPIPFuneralExpenses(covType)    
          || policy.coversPIPWageLoss(covType)
          || policy.coversPIPExtraMedical(covType)) {
        total += expo.totalForCoverageTypeAndClaimant(expo.Coverage.Type, claimant)
      }     
    }
    return total;
  }

  function sumForPIPReplaceAgg(claimant : Contact) : CurrencyAmount {
    var total = new CurrencyAmount(0, this.Claim.Currency)
    for (expo in this.Exposures) {
      var covType = expo.Coverage.Type
      var policy = this.Claim.Policy
      if (policy.coversPIPWageLoss(covType)) {
        total += expo.totalForCoverageTypeAndClaimant(expo.Coverage.Type, claimant)
      }     
    }
    return total;
  }

}