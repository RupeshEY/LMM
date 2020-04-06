package gw.entity

uses gw.api.locale.DisplayKey
uses com.google.common.base.Joiner

@Export
enhancement GWClaimFinancialsHoldsEnhancement : entity.Claim {
  /**
   * Check factors to determine if financial holds should apply.
   * This method is called from the TransactionSet Validation & Initial Reserve Rules
   */
  function applyFinancialHolds() : Boolean {
    return this.CoverageInQuestion
           or this.IncidentReport
           or not this.Policy.Verified
  }
  
  /**
   * 
   */
  function createNoteIfInitialReservesNotCreated(){
    var msg : String
    if(this.CoverageInQuestion == true) {
      msg = DisplayKey.get("Rules.InitialReserves.CannotCreateDueToCovInQuestion")
    }
    if(this.IncidentReport == true) {
      msg =  DisplayKey.get("Rules.InitialReserves.CannotCreateDueToIncidentOnly")
    }
    if(msg != null) {
      this.addNote( NoteTopicType.TC_COVERAGE, msg)
    }
  }
  
  /**
   * Factors to check if the coverage for this claim could be in question
   */
  function isCoverageInQuestionFactorsNotEmpty() : Boolean {
    return !getCoverageInQuestionFactors().Empty
  }
  
  /**
   * Get a list of factors that affect coverage
   */
  function getCoverageInQuestionFactors() : java.util.HashMap<Object, Object> {
    var validPolicyStatuses = {PolicyStatus.TC_ARCHIVED, PolicyStatus.TC_INFORCE}
    var coverageInQuestionMap = new java.util.HashMap()

    if(this.LossDate > this.Policy.ExpirationDate) {
      coverageInQuestionMap.put(DisplayKey.get("Web.Claim.CoverageInQuestionClaimIndicator.LossDate"), DisplayKey.get("Web.Claim.CoverageInQuestionClaimIndicator.Messages.AfterPolEffDates"))
    } else if( this.LossDate < this.Policy.EffectiveDate) {
      coverageInQuestionMap.put(DisplayKey.get("Web.Claim.CoverageInQuestionClaimIndicator.LossDate"), DisplayKey.get("Web.Claim.CoverageInQuestionClaimIndicator.Messages.BeforePolEffDates"))
    }
    
    if(this.Policy.Status != null) {
      if(!validPolicyStatuses.contains(this.Policy.Status)){
        coverageInQuestionMap.put(DisplayKey.get("Web.Claim.CoverageInQuestionClaimIndicator.PolicyStatus"), this.Policy.Status.toString())
      }
    }    
    return coverageInQuestionMap
  }

  property get CoverageInQuestionDescription() : String {
    var desc = Joiner.on(", ").withKeyValueSeparator(": ").join(this.getCoverageInQuestionFactors())
    return DisplayKey.get("Web.Claim.CoverageInQuestionClaimIndicator.Description", desc)
  }
}
