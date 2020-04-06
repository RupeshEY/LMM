package libraries;
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.FinancialsCalculations

@Export
enhancement totalForCoverageTypeExt : entity.Exposure {

  function totalForCoverageType(coverageType : CoverageType) : CurrencyAmount {
     var total : CurrencyAmount = null
     if (this.Coverage.Type == coverageType) {
       // By the time they reach Validation rules, the new payments will be included in this calculation
       total = FinancialsCalculations.getTotalPaymentsIncludingPending().withExposure(this).withCostType(CostType.TC_CLAIMCOST).Amount
     }
     return total != null ? total : new CurrencyAmount(0, this.Claim.Currency);
  }

  function totalForCoverageTypeAndClaimant(coverageType : CoverageType, claimant : Contact) : CurrencyAmount {
    return this.Claimant == claimant
            ? totalForCoverageType(coverageType)
            : new CurrencyAmount(0, this.Claim.Currency)
  }
}