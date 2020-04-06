package gw.api.benefits
uses java.math.BigDecimal
uses java.util.Date
uses java.lang.Integer
uses gw.api.financials.CurrencyAmount
uses gw.api.util.Math
uses gw.api.upgrade.Coercions

/**
 * Benefits calculator for temporary partial disability (TPD). This example
 * implementation has customized calculators for Florida (FL), Pennsylvania (PA)
 * and New Jersey (NJ)
 */
@Export
class TPDBenefitsCalculator extends WorkersCompBenefitsCalculator {
  
  public static function create(claim : Claim, calculationTime : Date) : TPDBenefitsCalculator {
    switch (claim.JurisdictionState) {
      case TC_FL:
        return new TPDBenefitsCalculator(claim, calculationTime) {
          override property get CompRate() : BigDecimal {
            return getFLTTDCompRate(claim);
          }
        }
      case TC_PA:
        return new TPDBenefitsCalculator(claim, calculationTime) {
          override property get MinCompRate() : BigDecimal {
            return WorkersCompBenefitsExceptions.getPAMinCompRate(MaxCompRate, BaseRate);
          }
        }
      case TC_NJ:  // No TPD in NJ
        return new TPDBenefitsCalculator(claim, calculationTime) {
          override property get CompRate() : BigDecimal {
            return null;
          } 
          override property get MinCompRate() : BigDecimal {
            return null;
          }
          override property get MaxCompRate() : BigDecimal {
            return null;
          }
        }
      default:
        return new TPDBenefitsCalculator(claim, calculationTime); 
    }
  }
  
  private construct(claim : Claim, calculationTime : Date) {
    super(claim, calculationTime, claim.findWCBeneCalcRef())
  }
      
  override property get BaseRate() : BigDecimal {
    return gw.api.util.Math.Nz(_claim.EmploymentData.WageAmount as Integer) - gw.api.util.Math.Nz(_claim.EmploymentData.WageAmountPostInjury as Integer)
  }

  override property get MinCompRate() : BigDecimal {
    return _ref.TPDMin
  }

  override property get MaxCompRate() : BigDecimal {
    return _ref.TPDMax;
  }

  override property get MinAwwAdjustment() : Boolean {
    return _ref.TPDMinAdjToAWW // Should return value from ref table
  }

  override property get PercentOfWages() : BigDecimal {
    return (Math.Nz(_ref.TPDPercentOfWages) / 100)
  }

  override property get MaxWeeksToPay() : Integer {
    return null
  }

  /**
  * Note: this should be configured based on the wc_ref_data.xml
  */
  private static function getFLTTDCompRate(claim : Claim) : BigDecimal {
     //  TTD Rate Exception:  80% of the 80%  
    var flCompRate : BigDecimal = null;
    if (claim.EmploymentData.WageAmount != null and (claim.LossDate >= (Coercions.makeDateFrom("2013-01-01"))) and (claim.LossDate < (Coercions.makeDateFrom("2026-01-01")))) {
      var wageAmtPostInjury = claim.EmploymentData.WageAmountPostInjury == null ? new CurrencyAmount(0, claim.Currency) : claim.EmploymentData.WageAmountPostInjury
      flCompRate = 0.80 * ((0.80 * claim.EmploymentData.WageAmount) - wageAmtPostInjury)
      flCompRate = flCompRate.max(0).min(746)
    }
    return flCompRate
  }
}