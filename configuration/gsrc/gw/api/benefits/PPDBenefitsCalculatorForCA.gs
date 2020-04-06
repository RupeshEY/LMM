package gw.api.benefits
uses java.util.Date
uses java.math.BigDecimal
uses java.lang.Integer
uses gw.api.database.Query

/**
 * Benefits calculator for permanent partial disability (PPD) in California
 */
@Export
class PPDBenefitsCalculatorForCA extends PPDBenefitsCalculator {

  var _statePDRates : ref_WC_PD_benefits = null
  var _pdWeeksAndLimits : ref_WC_PD_WeeksAndLimits = null
              
  construct(claim : Claim, calculationTime : Date) {
    super(claim, calculationTime)
  
    var dayOfLoss = claim.LossDate.trimToMidnight()
    var impairment = claim.getLossTimeExposure().InjuryIncident.Impairment
    if (impairment != null) {
  
      _statePDRates = Query.make(entity.ref_WC_PD_benefits)
                                           .compare("JurisdictionState", Equals, claim.JurisdictionState)
                                           .compare("PD_BenefitStartDate", LessThanOrEquals, dayOfLoss)
                                           .compare("PD_BenefitEndDate", GreaterThanOrEquals, dayOfLoss)
                                           .compare("Min_DisabilityPercent", LessThanOrEquals, impairment)
                                           .compare("Max_DisabilityPercent", GreaterThanOrEquals, BigDecimal.valueOf(impairment.intValue()))
                                           .select().AtMostOneRow

      _pdWeeksAndLimits = Query.make(entity.ref_WC_PD_WeeksAndLimits)
                                           .compare("JurisdictionState", Equals, claim.JurisdictionState)
                                           .compare("PD_BenefitStartDate", LessThanOrEquals, dayOfLoss)
                                           .compare("PD_BenefitEndDate", GreaterThanOrEquals, dayOfLoss)
                                           .compare("DisabilityPercent", Equals, BigDecimal.valueOf(gw.api.util.Math.roundDown(impairment as double)))
                                           .select().AtMostOneRow
                                                                                                                                 
    }
  }
  
  /** Should be removed in production implementation - see superclass */
  override property get CompRateImplementationComplete() : boolean {
    return true
  }

  override property get MinCompRate() : BigDecimal {
    return _statePDRates.PD_MinBenefit
  }

  override property get MaxCompRate() : BigDecimal {
    return _statePDRates.PD_MaxBenefit
  }

  override property get MaxWeeksToPay() : Integer {
    return _pdWeeksAndLimits.PD_NumWeeks as java.lang.Integer;
  }  

}
