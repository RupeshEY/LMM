package gw.entity
uses gw.api.locale.DisplayKey
uses java.util.Date
uses gw.api.financials.CurrencyAmount

@Export
enhancement GWTripExpenseDelegateEnhancement : entity.TripExpenseDelegate {

  /**
   * Sum of the PaidAmount, AgentFees and OtherFees fields, or zero if the Assessment field
   * does not have the given value.
   */
  function getBaseFinancialImpact(approvalStatus : AssessmentAction) : CurrencyAmount {
    return getSumIfMatchesAssessment(approvalStatus, {this.PaidAmount, this.AgentFees, this.OtherFees})
  }
  
  /**
   * Sums all the non null amounts in the given array, providing the Assessment field
   * has the given value. Otherwise returns zero.
   */
  function getSumIfMatchesAssessment(approvalStatus : AssessmentAction, amounts : CurrencyAmount[]) : CurrencyAmount {
    var zero = new CurrencyAmount(0.00, this.ClaimCurrency)
    var total = zero
    if (this.Assessment == approvalStatus) {
      for (amount in amounts) {
        if (amount != null) {
          total += amount
        }
      }
    }
    return total
  }

  /**
   * When the assessment field of a trip expense is updated we create history events and/or
   * activities as follows:
   * <ul>
   * <li>If the assessment field used to be "Deny" we create a "DataChange" history event
   * <li>If the assessment field is now "approve" we create a "DataChange" history event unless it used
   *     be "Deny"
   * <li>If the assessment field is "Review" we create a review activity, or add another note to the
   *     existing review activity if there is one
   * <li>If the assessment field is "Deny" we create a "DataChange" history event and a new note
   *     explaining the denial
   * <li>If the assessment field is cleared we create a "DataChange" history event unless it used to be
   *     "Deny"
   * </ul>
   */
  function onPreUpdate(claim : Claim, today : Date, typeToBeReviewed : String) {
    if (this.isFieldChanged("Assessment")) {
      var usedToBeDenied = createHistoryEventIfUsedToBeDenied(claim)
      switch (this.Assessment) {
        case TC_APPROVE: 
          if (not usedToBeDenied) { 
            claim.createCustomHistoryEvent(TC_DATACHANGE, DisplayKey.get("Rules.PreUpdate.Claim.TripExpenseApprovedHistoryEvent", this.Assessment.DisplayName, this.DisplayName))
          }
          break
        case TC_REVIEW:
          var actSubject = DisplayKey.get("Rules.PreUpdate.Claim.TripExpenseReviewActivitySubject", this.DisplayName)
          var actDescription = DisplayKey.get("Rules.PreUpdate.Claim.TripExpenseReviewActivityDescription", typeToBeReviewed)
          var existingActivity = claim.Activities.firstWhere(\ a -> a.Subject ==  actSubject and a.ActivityPattern.Code == "employee_review" and a.Status == TC_OPEN)
          if (existingActivity == null) {
            claim.createActivity(null, ActivityPattern.finder.getActivityPatternByCode("employee_review"), actSubject , actDescription, TC_NORMAL, false, today, today.addBusinessDays(5))
          } else {
            var newNote = claim.addNote(TC_INVESTIGATION, DisplayKey.get("Rules.PreUpdate.Claim.TripExpenseReviewAgainNote", this.DisplayName, typeToBeReviewed))
            newNote.Activity = existingActivity                  
          }
          break
        case TC_DENY:
          claim.createCustomHistoryEvent(TC_DATACHANGE, DisplayKey.get("Rules.PreUpdate.Claim.TripExpenseDeniedHistoryEvent", this.Assessment.DisplayName, this.DisplayName))          
          claim.addNote(TC_DENIAL,  DisplayKey.get("Rules.PreUpdate.Claim.TripExpenseDeniedNote", this.Assessment.DisplayName, this.DisplayName, this.ReasonForDenial))
          break
        // If cleared create a history event
        case null:
          if (not ((this as KeyableBean).New or usedToBeDenied)) {
            claim.createCustomHistoryEvent(TC_DATACHANGE, DisplayKey.get("Rules.PreUpdate.Claim.TripExpenseClearedHistoryEvent", this.DisplayName, this.getOriginalValue("Assessment")))
          }
          break
      }        
    }
  }
  
  private function createHistoryEventIfUsedToBeDenied(claim : Claim) : boolean {
    var usedToBeDenied = this.getOriginalValue("Assessment") == AssessmentAction.TC_DENY
    if (usedToBeDenied) {
      var status = this.Assessment == null ? DisplayKey.get("Rules.PreUpdate.Claim.TripExpenseAssessmentCleared") : this.Assessment.DisplayName  
      claim.createCustomHistoryEvent(TC_DATACHANGE, DisplayKey.get("Rules.PreUpdate.Claim.TripExpenseUsedToBeDeniedHistoryEvent", status, this.DisplayName, this.ReasonForDenial))      
      this.ReasonForDenial = null
    }
    return usedToBeDenied
  }

}
