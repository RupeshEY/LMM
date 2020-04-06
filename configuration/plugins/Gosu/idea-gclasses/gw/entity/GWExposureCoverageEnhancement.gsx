package gw.entity
uses gw.financials.ExposureCoverageUpdateResult

@Export
enhancement GWExposureCoverageEnhancement : entity.Exposure {
  
  public property get HasCoverageLimit() : boolean {
    return this.Coverage != null and
           this.Coverage.HasExposureLimit
  }

  /**
   * updateCoverage will help a pcf to change the coverage on an exposure.
   * Specifically, there may be a need to remove and/or create a new deductible
   */
  public function updateCoverage(coverage : Coverage) : ExposureCoverageUpdateResult {
    var result = new ExposureCoverageUpdateResult(this.Coverage.ClaimDeductible)

    if (this.Coverage.ClaimDeductible != null and 
        !areExposuresLinkedTo(this.Coverage)) {
      this.Coverage.ClaimDeductible.remove()
    }

    this.Coverage = coverage

    if (this.Coverage.HasDeductibleAmount
        and gw.api.financials.FinancialsUtil.isUseDeductibleHandling()) {
      this.Coverage.ensureDeductible(this.Claim)
    }

    return result
  }

  private function areExposuresLinkedTo(cov : Coverage) : boolean {
    return this.Claim.Exposures.hasMatch(\ e -> e.Coverage == cov and not this.equals(e))
  }

  function updateCoverage(riskUnit : VehicleRU) {
    removeOldClaimDeductible()

    for (var coverage in riskUnit.Coverages) {
      //match the coverage type
      if (coverage.Type == this.PrimaryCoverage) {
        this.Coverage = coverage
        createClaimDeductible()
      }
    }
  }
  
  function removeOldClaimDeductible() {
    if (this.Coverage.ClaimDeductible != null) {
      this.Coverage.ClaimDeductible.remove()
    }
  }

  function createClaimDeductible() {
    if (this.Coverage.HasDeductibleAmount and gw.api.financials.FinancialsUtil.isUseDeductibleHandling()) {
      this.Coverage.createDeductible(this.Claim)
    }
  }

}
