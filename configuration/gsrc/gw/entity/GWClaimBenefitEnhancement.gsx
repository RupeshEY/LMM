package gw.entity
uses gw.api.locale.DisplayKey
uses gw.api.benefits.WorkersCompBenefitsCalculator
uses gw.api.benefits.TTDBenefitsCalculator
uses gw.api.benefits.TPDBenefitsCalculator
uses gw.api.benefits.PPDBenefitsCalculator
uses gw.api.benefits.PTDBenefitsCalculator
uses java.util.Date
uses gw.api.util.DateUtil
uses gw.api.database.Query
uses java.lang.Double

@Export
enhancement GWClaimBenefitEnhancement : Claim {

  function getTPDBenefitsCalculator() : WorkersCompBenefitsCalculator {
    return TPDBenefitsCalculator.create( this, null)
  }
  
  function getTPDBenefitsCalculatorWithTime(calculationTime : Date) : WorkersCompBenefitsCalculator {
    return TPDBenefitsCalculator.create( this, calculationTime)
  }
  
  function getTTDBenefitsCalculator() : WorkersCompBenefitsCalculator {
    return TTDBenefitsCalculator.create( this, null)
  }

  function getPPDBenefitsCalculator() : WorkersCompBenefitsCalculator {
    return PPDBenefitsCalculator.create( this, null)
  }

  function getPTDBenefitsCalculator() : WorkersCompBenefitsCalculator {
    return PTDBenefitsCalculator.create( this, null)
  }
 
  function getLossTimeExposure() : Exposure {
    var LTExp : Exposure = null;
    for (exp in this.Exposures) {
      if (exp.CoverageSubType== TC_WCWORKERSCOMPWAGES) 
        {LTExp = exp;}
      } 
    return LTExp;
  }

  function getNumberOfDependents(ValuationDate : Date) : Double {
    var ActiveDependents : Double = 0
    if (ValuationDate == null) {
      ValuationDate = DateUtil.currentDate()
    }  
    var AllDependents = this.getLossTimeExposure().getClaimContactsByRole(TC_CLAIMANTDEP)
    for (dep in AllDependents) {
      if (dep.BenefitEndDate == null or dep.BenefitEndDate > gw.api.util.DateUtil.currentDate()) {
        ActiveDependents = ActiveDependents + 1
      }
    }
    return ActiveDependents;
  }
 
  function findWCBeneCalcRef() : WCBenefitParameterSet {    
    //Date logic is to ensure that Find is based upon date not time and date
    return Query.make(entity.WCBenefitParameterSet).compare("JurisdictionState", Equals, this.JurisdictionState)
        .compare("StartDate", LessThanOrEquals, this.LossDate.moveToEndOfDay())
        .compare("EndDate", GreaterThanOrEquals, this.LossDate.trimToMidnight()).select().AtMostOneRow
  }
 
  function getWCWaitingDays(BenefitType : LostWagesBenefitType) : Double {
   var WaitDays = findWCBeneCalcRef().WaitingPeriodDays
   if (WaitDays != null and BenefitType != null) {
     if (BenefitType == TC_PPD and findWCBeneCalcRef().WPNotAppliedToPPD){
       WaitDays = 0
     }
     else if (BenefitType == TC_PTD and findWCBeneCalcRef().WPNotAppliedToPTD){
       WaitDays = 0
     } 
   }
   return WaitDays
 }
 
 function getWCRetroactiveDays(BenefitType: LostWagesBenefitType): Double {
   var RetroDays = findWCBeneCalcRef().RetroactivePeriod
   if (RetroDays != null) {
     if (BenefitType == TC_PPD and findWCBeneCalcRef().WPNotAppliedToPPD){
       RetroDays = 0
     }
     else if (BenefitType == TC_PTD and findWCBeneCalcRef().WPNotAppliedToPTD){
       RetroDays = 0
     }
   }    
   return RetroDays
 }
  
  function getWCWaitingDaysApplied() : Double {
    var wda : Double = 0.0
    for (eachperiod in this.ClaimWorkComp.WaitingPeriodDetails) {
      if (eachperiod.WaitingDaysApplied != null) {
        wda = wda + eachperiod.WaitingDaysApplied as java.lang.Double
      } 
    }
    return wda
  }
 
  function getWCRetroDaysRepaid(): Double {
    var daysrepaid  : Double = 0.0;
    for (eachperiod in this.ClaimWorkComp.WaitingPeriodDetails) {
      if (eachperiod.WaitingDaysRepaid != null) {
        daysrepaid = daysrepaid + eachperiod.WaitingDaysRepaid as java.lang.Double
      } 
    }
    return daysrepaid
  }
 
  function getWorkStatusMessage() : String {
    var currentWorkStatusMessage : String = DisplayKey.get("Claim.Benefit.WorkStatus.Unknown")
    if (this.EmploymentData != null) {
      var currentWorkStatus = this.EmploymentData.WorkStatusChanges.sortBy(\s -> s.StatusDate ).last()
      if (currentWorkStatus.StatusDate <= DateUtil.currentDate() and currentWorkStatus.StatusEndDate == null) {
        currentWorkStatusMessage = DisplayKey.get("Claim.Benefit.WorkStatus.Known", currentWorkStatus.Status.Description, currentWorkStatus.StatusDate.DaysSince)
      }
    }
    return currentWorkStatusMessage
  }
}