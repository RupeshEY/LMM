package gw.api.benefits
uses java.math.BigDecimal
uses java.util.Date

/**
 * Static utilities for workers comp benefit calculators. Utilities for a particular
 * type of benefit (for example just TTD or just PPD) should go in the appropriate
 * calculator class. But utilities that need to be shared across multiple benefit
 * types can be added here.
 */
@Export
class WorkersCompBenefitsExceptions {
  
  /** Never instantiated */
  private construct() {}
  
  /**
   * Minimum comp rate calculation for Pennsylvania (PA), used for both TTD
   * and TPD
   */
  public static function getPAMinCompRate(max: BigDecimal, baseRate: BigDecimal) : BigDecimal {
    var firstMethod = max / 2
    var secondMethod = baseRate * 0.90bd
    return firstMethod.min(secondMethod)
  }

  /**
   * Minimum comp rate calculation for Illinois (IL), used for both PPD
   * and TTD.
   * Note: This should be configured based on the wc_ref_data.xml
   */
  public static function getILMinCompRate(claim : Claim) : BigDecimal {
    if (claim.LossDate >= Date.createDateInstance(1, 1, 2013)
            and claim.LossDate < Date.createDateInstance(1, 1, 2026)) {
      switch(claim.getNumberOfDependents(null)) {
        case 0:
          return 200.00;
        case 1:
          return 230.00;         
        case 2:
          return 260.00;         
        case 3:
          return 290.00;         
        default:  // 4 or more
          return 300.00
      } 
    } else {
      return null
    }
  }  
}
