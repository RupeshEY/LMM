package gw.subrogation.financials

/**
 * Contains the logic for determining whether subrogation should be automatically opened for a claim.
 * By default subrogation is opened for claims where the insured is not entirely at fault.
 * Subrogation may also be opened for claims depending on loss type, loss cause, and (for workers' comp claims) accident type.
 */
@Export
class SubrogationOpportunity {
  private construct() {}

  /**
   * Returns true if subrogation should be (or already is) open for the given claim.
   */
  static function determineEligibility(claim : Claim) : boolean {
    if (claim.SubrogationSummary != null) {
      return true
    }
    if (claim.FaultRating == TC_1 and (claim.Fault != null and claim.Fault != 100)) {
      return true
    }
    if (claim.FaultRating == TC_THIRDPARTY) {
      return true
    }

    switch (claim.LossType) {
      case TC_AUTO:
        switch (claim.LossCause) {
          case TC_REAREND:
          case TC_VANDALISM:
            return true
        }

      case TC_PR:
        switch (claim.LossCause) {
          case TC_STRUCTFAILURE:
          case TC_VANDALISM:
            return true
        }

      case TC_GL:
        switch (claim.LossCause) {
          case TC_PRODUCT:
          case TC_CONSTRUCTION:
            return true
        }

      case TC_WC:
        switch (claim.AccidentType) {
          case TC_10:
          case TC_16:
          case TC_18:
          case TC_26:
          case TC_28:
          case TC_32:
          case TC_40:
          case TC_41:
          case TC_45:
          case TC_46:
          case TC_47:
          case TC_48:
          case TC_50:
          case TC_59:
          case TC_65:
          case TC_75:
          case TC_76:
          case TC_77:
          case TC_78:
          case TC_86:
          case TC_82:
          case TC_89:
            return true
        }
    }
    return false
  }
}