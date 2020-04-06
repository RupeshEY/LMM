package gw.entity
uses gw.api.financials.CurrencyAmount

@Export
enhancement GWTripExpenseCancellationDelegateEnhancement : entity.TripExpenseCancellationDelegate {
  
  /**
   * Sum of the PaidAmount, AgentFees, OtherFees and CancellationFees fields, or zero if the
   * Assessment field does not have the given value.
   */
  function getBaseCancellationFinancialImpact(approvalStatus : AssessmentAction) : CurrencyAmount {
    return this.getSumIfMatchesAssessment(approvalStatus, {this.PaidAmount, this.AgentFees, this.CancellationFees, this.OtherFees})
  }
  
}
