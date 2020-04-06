package gw.entity
uses gw.api.locale.DisplayKey
uses gw.api.financials.FinancialsCalculations
uses java.math.BigDecimal
uses java.util.Date
uses gw.api.util.CurrencyUtil
uses gw.policy.notification.LargeLossPolicySystemNotification
uses gw.api.database.Query
uses gw.api.upgrade.Coercions

@Export
enhancement GWClaimReinsuranceEnhancement : entity.Claim {
  function createReinsuranceReviewActivity() {
    var activityPattern = ActivityPattern.finder.getActivityPatternByCode( "claim_reinsurance_review" )
    this.createActivityFromPattern( null, activityPattern)
  }
  
  function createReinsuranceReviewActivityForWCPaymentsExceeding12Months() {
    var activityPattern = ActivityPattern.finder.getActivityPatternByCode( "claim_reinsurance_review" )
    this.createActivity( null, activityPattern, null, DisplayKey.get("Rules.PreUpdate.Transaction.Reinsurance.Review.PaymentsExceeds12Months"), null, null, null, null ).assign( this.AssignedGroup, this.AssignedUser )
  }
  
  function markClaimForReinsurance() {
    this.ReinsuranceReportable = true
    this.ReinsuranceFlaggedStatus = ReinsuranceFlaggedStatus.TC_SYSTEMFLAGGED
  }

  function isReinsuranceFieldSet() : Boolean {
    return (this.ReinsuranceReportable != true) && (this.ReinsuranceFlaggedStatus != ReinsuranceFlaggedStatus.TC_USERUNFLAGGED)    
  }
  
  function setReinsuranceIfTotalIncurredOverThreshold() {
    var hasMatchingCoverage : boolean = false

    var policyThresholds = Query.make(entity.ReinsuranceThreshold)
           .compare("PolicyType", Equals, this.Policy.PolicyType)
           .or(\ orRes -> orRes.and(\ andSubRes -> andSubRes.compare("StartDate", Equals, null).compare("EndDate", Equals, null))
                                  .and(\ orRes1 -> orRes1.compare("StartDate", LessThanOrEquals, this.LossDate).compare("EndDate", GreaterThanOrEquals, this.LossDate))
                                  .and(\ orRes2 -> orRes2.compare("StartDate", Equals, null).compare("EndDate", GreaterThanOrEquals, this.LossDate))
                                  .and(\ orRes3 -> orRes3.compare("EndDate", Equals, null).compare("StartDate", LessThanOrEquals, this.LossDate))).select()

    for (threshold in policyThresholds) {
      var currentTotal : BigDecimal = 0
      var actualThreshold = threshold.ThresholdValue * (threshold.ReportingThreshold / 100.00)

      if (threshold.TreatyType == ReinsuranceTreatyType.TC_WC) {
        currentTotal = FinancialsCalculations.getTotalIncurredNet().withClaim(this).Amount;
      } else { 
        if (threshold.LossCauses.hasMatch( \ r -> r.LossCause == this.LossCause ) || threshold.LossCauses.length == 0) {
          for (exposure in this.Exposures) {
            if (threshold.CoverageTypes.hasMatch( \ c -> c.Coverage == exposure.PrimaryCoverage)) {
              hasMatchingCoverage = true
              var grossTotalIncurred = FinancialsCalculations.getTotalIncurredGross().withExposure(exposure).Amount
              if (grossTotalIncurred != null) { 
                currentTotal = currentTotal + grossTotalIncurred.Amount
              }
            }
          }
        }

        if ( hasMatchingCoverage ) {
          var grossTotalIncurred = FinancialsCalculations.getTotalIncurredGross().withClaim(this).useClaimLevelReserves().Amount
          if (grossTotalIncurred != null) {
            currentTotal = currentTotal + grossTotalIncurred.Amount
          }
        }
      }

      // support for multicurrency, convert the total to the currency in which the reinsurance threshold was created
      if(this.Policy.Currency != CurrencyUtil.getDefaultCurrency()) {
        currentTotal = CurrencyUtil.convertAmount(currentTotal, this.Policy.Currency, CurrencyUtil.getDefaultCurrency(), null )
      }
      
      if(currentTotal >= actualThreshold && this.isReinsuranceFieldSet()) {
        this.markClaimForReinsurance()
        this.createReinsuranceReviewActivity()
        this.ReinsuranceReason = DisplayKey.get("Rules.PreUpdate.Transaction.Reinsurance.Note.GTIExceededThreshold",  CurrencyUtil.renderAsCurrency( actualThreshold, CurrencyUtil.getDefaultCurrency()) )
        this.addNote( NoteTopicType.TC_REINSURANCE, DisplayKey.get("Rules.PreUpdate.Claim.Reinsurance.Note.ClaimMarkedForReinsurance"), DisplayKey.get("Rules.PreUpdate.Transaction.Reinsurance.Note.GTIExceededThreshold",  CurrencyUtil.renderAsCurrency( actualThreshold, CurrencyUtil.getDefaultCurrency()) ) )
      }
    }
  }

  function setReinsuranceIfContinuousWCInjuryPaymentsExceed12Months() {
    var lastSendDate : Date
    var firstSendDate : Date
    var hasBIClaimCost : boolean

    for (check in this.getChecksIterator( false )) {
      // only claim cost bodily injury payments are counted
      for (payment in check.Payments) {
        if (payment.Exposure.ExposureType == ExposureType.TC_WCINJURYDAMAGE and
            payment.CostType == CostType.TC_CLAIMCOST) {
          hasBIClaimCost = true
        }
      }
  
      if (hasBIClaimCost) {
        var sendDate = check.ScheduledSendDate
        if (lastSendDate == null && firstSendDate == null) {
          firstSendDate = sendDate
          lastSendDate = sendDate
        } else {
          if (sendDate.before( firstSendDate )) {
            firstSendDate = sendDate
          }
    
          if (sendDate.after(lastSendDate)) {
            lastSendDate = sendDate
          }
        } 
      }
    }

    if (firstSendDate != null && lastSendDate != null) {
      if (lastSendDate.trimToMidnight().after(firstSendDate.addYears(1))) {
        this.createReinsuranceReviewActivityForWCPaymentsExceeding12Months()
      }
    }
  }

  // -------------------------------------------------- large loss notification methods

  function exceedsLargeLossThreshold() : boolean {
    var totalIncurred = FinancialsCalculations.getTotalIncurredGross().withClaim(this).Amount
    var thresholdValue = LargeLossThreshold.getThreshold(this.Policy.PolicyType, LargeLossNotificationType.TC_PS).ThresholdValue
    if (totalIncurred != null and thresholdValue != null) {
      totalIncurred = totalIncurred.convert( CurrencyUtil.getDefaultCurrency(),  CurrencyUtil.getRoundingMode() )
      return (totalIncurred >= Coercions.makeCurrencyAmountFrom(thresholdValue))
    }
    return false
  }
  
  function addLargeLossEvent() {
    this.addEvent(LargeLossPolicySystemNotification.EVENT_NAME)
  }
}
