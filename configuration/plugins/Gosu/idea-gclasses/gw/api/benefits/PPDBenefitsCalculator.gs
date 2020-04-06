package gw.api.benefits
uses java.math.BigDecimal
uses java.lang.Integer
uses java.util.Date
uses gw.api.util.Math

/**
 * Benefits calculator for permanent partial disability (PPD). This is an
 * example implementation and the only piece that is fully fleshed out is
 * the calculator for California (CA). The other calculators are not currently
 * valid - there is a property called CompRateImplementationComplete which is
 * currently false except for the California calculator. This property should be
 * removed (and any missing logic and reference table entries added) in a
 * production implementation
 * <p>
 * This implementation does show how to vary the minimum comp rate per state and
 * also how a particular state (California, in this case) can use a separate
 * calculator from the other states.
 */
@Export
class PPDBenefitsCalculator extends WorkersCompBenefitsCalculator {
    
  public static function create(claim : Claim, calculationTime : Date) : PPDBenefitsCalculator {
    switch (claim.JurisdictionState) {
      case TC_IL:
        return new PPDBenefitsCalculator(claim, calculationTime) {
          override property get MinCompRate() : BigDecimal {
            return WorkersCompBenefitsExceptions.getILMinCompRate(claim);
          }
        }
      case TC_PA:
        return new PPDBenefitsCalculator(claim, calculationTime) {
          override property get MinCompRate() : BigDecimal {
            return WorkersCompBenefitsExceptions.getPAMinCompRate(MaxCompRate, BaseRate);
          }
        }
      case TC_CA:
        return new PPDBenefitsCalculatorForCA(claim, calculationTime)
      default:
        return new PPDBenefitsCalculator(claim, calculationTime)
    }
  }

  protected construct(claim : Claim, calculationTime : Date) {
    super(claim, calculationTime, claim.findWCBeneCalcRef())
  }

  override property get BaseRate() : BigDecimal {
    return _claim.EmploymentData.WageAmount
  }

  override property get IsValid() : boolean {
    return super.IsValid and CompRateImplementationComplete
  }
  
  /**
   * This property should be removed in a production implementation. At the
   * moment it is only used to cause IsValid to return false for all
   * calculators except the PPDBenefitsCalculatorForCA implementation.
   */
  property get CompRateImplementationComplete() : boolean {
    return false
  }

  override property get MinCompRate() : BigDecimal {
    return _ref.PPDMin
  }

  override property get MaxCompRate() : BigDecimal {
    return _ref.PPDMax
  }
  
  override property get MaxWeeksToPay() : Integer {
    return null
  }
 
  override property get MinAwwAdjustment() : Boolean {
    return _ref.PPDMinAdjToAWW // Should return value from ref table
  }

  override property get PercentOfWages() : BigDecimal {
    return (Math.Nz(_ref.PPDPercentOfWages) / 100)
  }
}
