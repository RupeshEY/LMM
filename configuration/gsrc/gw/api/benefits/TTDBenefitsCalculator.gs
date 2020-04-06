package gw.api.benefits
uses java.math.BigDecimal
uses java.util.Date
uses java.lang.Integer
uses gw.api.util.Math

/**
 * Benefits calculator for temporary total disability (TTD). This example
 * implementation has customized calculators for Illinois (IL) and Pennsylvania (PA)
 */
@Export
class TTDBenefitsCalculator extends WorkersCompBenefitsCalculator {
  
  public static function create(claim : Claim, calculationTime : Date) : TTDBenefitsCalculator {
    switch (claim.JurisdictionState) {
      case TC_IL:
        return new TTDBenefitsCalculator(claim, calculationTime) {
          override property get MinCompRate() : BigDecimal {
            return WorkersCompBenefitsExceptions.getILMinCompRate(claim);
          }
        }
      case TC_PA:
        return new TTDBenefitsCalculator(claim, calculationTime) {
          override property get MinCompRate() : BigDecimal {
            return WorkersCompBenefitsExceptions.getPAMinCompRate(MaxCompRate, BaseRate);
          }
        }
      default:
        return new TTDBenefitsCalculator(claim, calculationTime); 
    }
  }
  
  private construct(claim : Claim, calculationTime : Date) {
    super(claim, calculationTime, claim.findWCBeneCalcRef())
  }

  override property get BaseRate() : BigDecimal {
    return _claim.EmploymentData.WageAmount
  }

  override property get MinCompRate() : BigDecimal {
    return _ref.TTDMin
  }
  
  override property get MaxCompRate() : BigDecimal {
    return _ref.TTDMax
  }

  override property get MinAwwAdjustment() : Boolean {
    return _ref.TTDMinAdjToAWW 
  }
  
  override property get PercentOfWages() : BigDecimal {
    return (Math.Nz(_ref.TTDPercentOfWages) / 100)
  }

  override property get MaxWeeksToPay() : Integer {
    return null
  }
}
