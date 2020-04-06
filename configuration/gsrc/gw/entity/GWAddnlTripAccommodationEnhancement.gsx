package gw.entity
uses gw.api.financials.CurrencyAmount

@Export
enhancement GWAddnlTripAccommodationEnhancement : AddnlTripAccommodation {

  /**
   * The financial impact of this accommodation or zero if the Assessment field
   * does not have the given value
   */
  function getFinancialImpact(approvalStatus : AssessmentAction) : CurrencyAmount {
    return this.getBaseFinancialImpact(approvalStatus)
  }

}
