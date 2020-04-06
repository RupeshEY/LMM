package gw.entity

uses gw.api.financials.CurrencyAmount

@Export
enhancement GWSubrogationViewEnhancement: entity.SubrogationView {
  /**
   * Returns the Total Recoveries with Recovery Category Subrogation for the claim or exposure.
   *
   * @return the total recoveries with Subrogation Recovery Category
   */
  property get TotalRecoveriesWithSubrogationRecoveryCategory(): CurrencyAmount {
    var exposure = this.Exposure
    var financialCalculator = gw.api.financials.FinancialsCalculations.getTotalRecoveries().withRecoveryCategory(RecoveryCategory.TC_SUBRO)
    if (exposure != null) {
      return financialCalculator.withExposure(exposure).Amount
    } else {
      return financialCalculator.withClaim(this.SubrogationClaim).Amount
    }
  }
}
