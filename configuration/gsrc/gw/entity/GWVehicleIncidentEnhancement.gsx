package gw.entity
uses gw.api.financials.CurrencyAmount
uses gw.api.util.CurrencyUtil
uses gw.vendormanagement.SpecialistServiceCodeConstants

@Export
enhancement GWVehicleIncidentEnhancement : entity.VehicleIncident {
  
  function recalculateSalvageNet() {
    var netRecovery = this.SalvageProceeds.Amount ?: 0
    netRecovery -= this.SalvageTow.Amount ?: 0
    netRecovery -= this.SalvageStorage.Amount ?: 0
    netRecovery -= this.SalvageTitle.Amount ?: 0
    netRecovery -= this.SalvagePrep.Amount ?: 0
    var roundedValue = roundForCurrency( netRecovery.ofCurrency(ClaimOrDefaultCurrency) )
    this.SalvageNet = roundForCurrency(new CurrencyAmount((roundedValue as int), ClaimOrDefaultCurrency))
  }

  /**
   * Round the BigDecimal amount to the proper number of decimal places for a currency value.  The currency
   * is either the Claim's currency if set or the system default currency.
   */
  public function roundForCurrency(value : CurrencyAmount) : CurrencyAmount {
    return CurrencyUtil.roundToCurrencyScale( value, ClaimOrDefaultCurrency, CurrencyUtil.getRoundingMode() )
  }
  
  /**
   * Gets the ClaimCurrency or, if it is null, the DefaultCurrency.
   */
  public property get ClaimOrDefaultCurrency() : Currency {
    var c = this.ClaimCurrency
    if( c != null ) {
      return c
    } else {
      return CurrencyUtil.getDefaultCurrency()
    }
  }  

  property get HasTowingServices() : boolean {
    return this.ServiceRequests.hasMatch( \ sr -> sr.Instruction.Services.hasMatch( \ service -> service.Service.Code == SpecialistServiceCodeConstants.AUTOTOWING))
  }

  function getCoverageDescription(coverageType : CoverageType) : String {
    var coverages = this.Claim.Policy.getCoveragesByCoverageType(coverageType);
    if (coverages.length > 0) {
      var policyCoverage : PolicyCoverage
      for(coverage in coverages) {
        if(coverage typeis RUCoverage
            and coverage.RiskUnit typeis VehicleRU
            and coverage.RiskUnit.Vehicle == this.Vehicle) {
          return coverage.DetailsSummary
        }
        //Keep the first policy-level coverage incase no RU-level coverages are found
        else if(coverage typeis PolicyCoverage and policyCoverage == null) {
          policyCoverage = coverage
        }
      }
      if(policyCoverage != null) {
        //Didn't find a vehicle coverage, return the first policy coverage found
        return policyCoverage.DetailsSummary
      }
    }

    //Found no coverages
    return null
  }

}
