package gw.entity
uses gw.api.financials.CurrencyAmount

@Export
enhancement GWTripAccommodationEnhancement : TripAccommodation {

  /**
   * The financial impact of this accommodation and any included additional accommodation.
   * Financial amounts on the accommodation and additional accommodation are ignored if their
   * Assessment field does not equal the given value.
   */
  function getFinancialImpact(approvalStatus : AssessmentAction) : CurrencyAmount {
    var total = this.getBaseCancellationFinancialImpact(approvalStatus)
    for(eachAddnlAccommodation in this.AddnlTripAccommodations) {
      total += eachAddnlAccommodation.getFinancialImpact(approvalStatus)  
    }
    return total
  }

}
