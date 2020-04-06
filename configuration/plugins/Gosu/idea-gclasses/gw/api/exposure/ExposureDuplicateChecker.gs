package gw.api.exposure

uses gw.api.locale.DisplayKey
uses gw.api.metric.FilteredArray
uses gw.api.util.CoreFilters
uses gw.api.util.DisplayableException

@Export
class ExposureDuplicateChecker {

  /**
   * Throws an exception if the Exposure passed in has the same Claimant, Coverage entity, and CoverageSubType of
   * an existing exposure. This is permitted for third-party losses provided the incident is different.
   */
  static function verifyExposureClaimantCoverageSubtypeUnique(exposure: Exposure, updateClaimant: boolean = true) {
    if (updateClaimant) {
      exposure.ClaimantDenorm = exposure.Claimant
    }
    var valid = true
    var thirdPartyLoss = exposure.LossParty == LossPartyType.TC_THIRD_PARTY

    if (    exposure.isFieldChanged(Exposure#ClaimantDenorm)
         or exposure.isFieldChanged(Exposure#CoverageSubType)
         or exposure.isFieldChanged(Exposure#Coverage)
       ) {

      if (    exposure.ClaimantDenorm != null
          and exposure.CoverageSubType != null
          and exposure.Coverage != null
         ) {
        if (exposure.Claim.ClaimantDenorm != null
            and exposure.Claim.ClaimantDenorm != exposure.ClaimantDenorm) {
          valid = false
        }
        else {
          var matchingExposures = new FilteredArray<Exposure>(exposure.Claim, "Exposures")
              .where("ClaimantDenorm", Equals, exposure.ClaimantDenorm)
              .and("Coverage", Equals, exposure.Coverage)
              .and("CoverageSubType", Equals, exposure.CoverageSubType)
          if (thirdPartyLoss) {
            matchingExposures.and("Incident", Equals, exposure.Incident)
          }
          valid = matchingExposures.Count == 1
        }
      }
    }
    if (not valid) {
      throw new DisplayableException(
          thirdPartyLoss
              ? DisplayKey.get('Web.Plugin.PreUpdate.ExposureClaimantCoverageSubtypeThirdPartyNotUnique')
              : DisplayKey.get('Web.Plugin.PreUpdate.ExposureClaimantCoverageSubtypeNotUnique')
      );
    }
  }
}
