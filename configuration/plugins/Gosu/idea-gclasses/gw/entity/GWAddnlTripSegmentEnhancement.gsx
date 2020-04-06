package gw.entity
uses gw.api.financials.CurrencyAmount

@Export
enhancement GWAddnlTripSegmentEnhancement : AddnlTripSegment {

  /**
   * The financial impact of this trip segment or zero if the segment's Assessment
   * field does not have the given value
   */
  function getFinancialImpact(approvalStatus : AssessmentAction) : CurrencyAmount {
    return this.getBaseFinancialImpact(approvalStatus)
  }

}
