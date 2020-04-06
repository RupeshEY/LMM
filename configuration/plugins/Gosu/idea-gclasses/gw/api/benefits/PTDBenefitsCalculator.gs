package gw.api.benefits
uses java.math.BigDecimal
uses java.util.Date
uses java.lang.Integer
uses gw.api.util.Math

/**
 * Benefits calculator for permanent total disability (PTD). This example
 * implementation includes a custom calculator for Pennsylvania (PA), taking into
 * account Pennsylvania's special minimum comp rate.
 */
@Export
class PTDBenefitsCalculator extends WorkersCompBenefitsCalculator {
  
  public static function create(claim : Claim, calculationTime : Date) : PTDBenefitsCalculator {
    switch (claim.JurisdictionState) {
      case TC_PA:
        return new PTDBenefitsCalculator(claim, calculationTime) {
          override property get MinCompRate() : BigDecimal {
            return WorkersCompBenefitsExceptions.getPAMinCompRate(MaxCompRate, BaseRate);
          }
        }
      default:
        return new PTDBenefitsCalculator(claim, calculationTime); 
    }
  }

  private construct(claim : Claim, calculationTime : Date) {
    super(claim, calculationTime, claim.findWCBeneCalcRef())
  }

  override property get BaseRate() : BigDecimal {
    return _claim.EmploymentData.WageAmount
  }

  override property get MinCompRate() : BigDecimal {
    return _ref.PTDMin
  }
  
  override property get MaxCompRate() : BigDecimal {
    return _ref.PTDMax
  }

  override property get MinAwwAdjustment() : Boolean {
    return _ref.PTDMinAdjToAWW // Should return value from ref table
  }
  
  override property get PercentOfWages() : BigDecimal {
    return (Math.Nz(_ref.PTDPercentOfWages) / 100)
  }

  override property get MaxWeeksToPay() : Integer {
    return null   
  }
}
