package gw.entity
uses gw.api.locale.DisplayKey
uses java.util.ArrayList
uses gw.api.metric.FilteredArray
uses gw.api.util.CurrencyUtil
uses java.util.List

@Export
enhancement GWClaimReinsuranceNotificationEnhancement : entity.Claim {
  
  function setReinsuranceNotificationIfGrossTotalIncurredOverThreshold() {
    var exceededAgreements = {} as List<RIAgreement>

    // check if the RIAgreements on the claim have exceeded the notification threshold
    this.RIAgreementGroups*.Agreements.each(\ agreement -> {
        agreement.ExceedsNotificationThreshold = false
        if (agreement.HasNotificationThreshold) {
          var grossTotalIncurredAmount = gw.api.financials.FinancialsCalculations.getTotalIncurredGross()
              .withClaim(this)
              .withRIAgreement(agreement)
              .Amount
          var notificationThresholdInClaimCurrency = agreement.NotificationThreshold.convert(this.Currency,
              CurrencyUtil.RoundingMode)

          if (grossTotalIncurredAmount != null and grossTotalIncurredAmount > notificationThresholdInClaimCurrency) {
            agreement.ExceedsNotificationThreshold = true
            exceededAgreements.add(agreement)
          }
        }
      })

    updateReinsuranceFields(exceededAgreements)
    
    if(this.isFieldChanged("ReinsuranceReportable")
      and this.ReinsuranceReportable == true
      and !this.Activities.hasMatch(\ a -> a.ActivityPattern.equals(ActivityPattern.finder.getActivityPatternByCode("claim_reinsurance_review")))) {
      this.createReinsuranceReviewActivity()
    }
  }
  
  private function updateReinsuranceFields(exceededAgreements : List<entity.RIAgreement>) {
    var userOverriddenRIReportable = this.isFieldChanged("ReinsuranceReportable")
    
    // clear the claim reinsurance fields if the GTI no longer exceeds any agreement notification thresholds
    if(exceededAgreements.Count == 0 and this.ReinsuranceFlaggedStatus == ReinsuranceFlaggedStatus.TC_SYSTEMFLAGGED) {
      this.ReinsuranceReportable = false
      this.ReinsuranceFlaggedStatus = ReinsuranceFlaggedStatus.TC_SYSTEMUNFLAGGED
      this.ReinsuranceReason = ""
      createNoteForNotReinsuranceReportable()
    } else {
      var newReason = DisplayKey.get("Rules.PreUpdate.Transaction.Reinsurance.Reason.GTIExceededAgreementThresholds", "")
      var numNewAgreementsExceedingThreshold = 0
      var delimiterCounter = 0
      for(agreement in exceededAgreements.sortBy(\ r -> r.AgreementName)) { 
        var notificationAmount = gw.api.util.CurrencyUtil.renderAsCurrency(agreement.NotificationThreshold)
        if(!hasNoteForAgreement(agreement.AgreementName) or hasAgreementExceededNotificationThreshold(agreement)) {
          this.markClaimForReinsurance()
          if (not bundleAlreadyHasNoteFor(agreement)) {
            createNoteForExceedingNotificationThreshold(agreement.AgreementName, notificationAmount)
            numNewAgreementsExceedingThreshold++
          }
        }
        newReason = newReason.concat((delimiterCounter == 0 ? "" : ", ")  + agreement.AgreementName + " - " + notificationAmount)
        delimiterCounter++
      }
      if((userOverriddenRIReportable and numNewAgreementsExceedingThreshold > 0)
          or (!userOverriddenRIReportable and exceededAgreements.Count > 0)) {
        this.ReinsuranceReason = newReason
      }
    }
  }
  
  private function bundleAlreadyHasNoteFor(agreement : RIAgreement) : boolean {
    var toBeInserted = this.Bundle.getInsertedBeansOfType(Note)
    if (toBeInserted.Empty) return false
    return toBeInserted
        .hasMatch(\ n -> n.Topic == NoteTopicType.TC_REINSURANCE
                      and n.Subject == getNoteSubjectWithAgreementNameForClaimMarkedForReinsurance(agreement.AgreementName))
  }
  
  private function createNoteForExceedingNotificationThreshold(agreementName : String, displayableNotificationAmount : String) {
    this.addNote(NoteTopicType.TC_REINSURANCE, 
                 getNoteSubjectWithAgreementNameForClaimMarkedForReinsurance(agreementName), 
                 DisplayKey.get("Rules.PreUpdate.Transaction.Reinsurance.Note.GTIExceededAgreementThreshold", agreementName, displayableNotificationAmount))
  }
  
  private function createNoteForNotReinsuranceReportable() {
    this.addNote(NoteTopicType.TC_REINSURANCE, 
                 DisplayKey.get("Rules.PreUpdate.Claim.Reinsurance.Note.ClaimUnmarkedForReinsurance"), 
                 DisplayKey.get("Rules.PreUpdate.Transaction.Reinsurance.Note.GTILessThanAgreementThreshold"))
  }
  
  private function hasNoteForAgreement(agreementName : String) : Boolean {
    return new FilteredArray<Note>(this, "Notes")
            .where("Topic", Equals, NoteTopicType.TC_REINSURANCE)
            .and("Subject", Equals, getNoteSubjectWithAgreementNameForClaimMarkedForReinsurance(agreementName))
            .Count > 0
  }
  
  private function hasAgreementExceededNotificationThreshold(agreement : RIAgreement) : Boolean {
    return (!this.isFieldChanged("ReinsuranceReportable") and
        agreement.getOriginalValue("ExceedsNotificationThreshold") == false)
  }
  
  private function getNoteSubjectWithAgreementNameForClaimMarkedForReinsurance(agreementName : String) : String {
    return DisplayKey.get("Rules.PreUpdate.Claim.Reinsurance.Note.ClaimMarkedForReinsurance") + " - " + agreementName
  }
}