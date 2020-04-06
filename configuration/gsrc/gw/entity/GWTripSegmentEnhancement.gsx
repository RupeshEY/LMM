package gw.entity
uses gw.api.financials.CurrencyAmount


@Export
enhancement GWTripSegmentEnhancement : TripSegment {

  /**
   * The financial impact of this trip segment and any included additional segments.
   * Financial amounts on the segment and additional segments are ignored if their
   * Assessment field does not equal the given value.
   */
  function getFinancialImpact(approvalStatus : AssessmentAction) : CurrencyAmount {
    var total = this.getBaseCancellationFinancialImpact(approvalStatus)
    for(eachAddnlSegment in this.AddnlTripSegments) {
      total += eachAddnlSegment.getFinancialImpact(approvalStatus)  
    }
    return total   
  }

}