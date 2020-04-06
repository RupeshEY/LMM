package gw.entity
uses gw.api.financials.CurrencyAmount
uses java.math.BigDecimal

@Export
enhancement GWTripIncidentEnhancement : TripIncident {

  /**
   * The total financial impact of all expenses (trip segments, accomodations and
   * additional segments and accommodations) on this incident. If any expense's
   * Assessment field does not equal the given value then its values are ignored.
   */
  function getTotalFinancialImpact(approvalStatus : AssessmentAction) : CurrencyAmount {
    return getSegmentsFinancialImpact(approvalStatus)
            + getAccommodationsFinancialImpact(approvalStatus)
  }

  /**
   * The total financial impact of all trip segments and additional segments on
   * this incident. If any segment's Assessment field does not equal the given
   * value then its values are ignored.
   */
  function getSegmentsFinancialImpact(approvalStatus : AssessmentAction) : CurrencyAmount {
    var totalCosts = new CurrencyAmount(BigDecimal.ZERO, this.ClaimCurrency)
    for (eachSegment in this.TripSegments) {
      totalCosts = totalCosts + eachSegment.getFinancialImpact(approvalStatus)
    }    
    return totalCosts
  }

  /**
   * The total financial impact of all accommodations and additional accommodations
   * on this incident. If any accommodation's Assessment field does not equal the
   * given value then its values are ignored.
   */
  function getAccommodationsFinancialImpact(approvalStatus : AssessmentAction) : CurrencyAmount {
    var totalCosts = new CurrencyAmount(BigDecimal.ZERO, this.ClaimCurrency)
    for (eachAccommodation in this.TripAccommodations) {
      totalCosts = totalCosts + eachAccommodation.getFinancialImpact(approvalStatus)
    }    
    return totalCosts
  }
}
