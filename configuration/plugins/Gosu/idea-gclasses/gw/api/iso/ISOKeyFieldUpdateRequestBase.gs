package gw.api.iso

/**
 * Constructs an ISO key field update request. ISO identifies claims/exposures by
 * the following key fields:
 * <ul>
 * <li>AgencyId (claim.AgencyId). An agency id identifies the insuring company.
 *     Large companies may have multiple agency ids
 * <li>PolicyNumber (claim.Policy.PolicyNumber)
 * <li>InsurerID (claim.ClaimNumber or, for exposure level messaging,
 *     claim.ClaimNumber + exposure number)
 * <li>LossDt (claim.LossDate)
 * If we have already sent a claim search request to ISO for a particular claim
 * or exposure then ISO knows our claim/exposure by the key fields we originally
 * sent. If any of the key fields change we need to send ISO a key field update
 * request to let them know that the claim/exposure they used to know by the
 * old set of key fields is now identified by a new set of key fields.
 */
@Export
class ISOKeyFieldUpdateRequestBase extends ISORequest {

  var _lobCode : String as readonly LobCode
  
  /** Use a block because we need to create insurer id for both current and old versions of insurer id */
  var _createInsurerId : block(claimNumber : String) : String as readonly CreateInsurerId
  
  /**
   * Create a new ISOKeyFieldUpdateRequest object, initialized from the given
   * claim or exposure.
   */
  construct(reportable : ISOReportable)  {
    super(reportable.ISOClaim)
    var exposure = reportable.ISOExposure
    if (exposure != null) {
      _lobCode = exposure.ISOCoverageCodes.PolicyType
      _createInsurerId = \ claimNumber : String -> exposure.getISOInsurerId(Properties, claimNumber)
    } else {
      // Assume there must be at least one exposure with a loss section, or we wouldn't have sent claim to ISO
      var firstExposureWithLossSection = Claim.ISOOrderedExposures.firstWhere(\ e -> e.ISOLossSectionType != null)
      _lobCode = firstExposureWithLossSection.ISOCoverageCodes.PolicyType
      _createInsurerId = \ claimNumber : String -> claimNumber
    }
  }
  
  /**
   * Populate the AcordRequest object. This adds in the standard Policy and
   * ClaimsOccurrence aggregates, but also calls createUpdate to add in the
   * key field update specific com.iso.Update aggregate.
   * <p>
   * Returns the populated request
   */
  public function populate() : xsd.iso.req.ACORD {
    createUpdate()
    createPolicy(null, null, null, LobCode)
    createClaimsOccurrence(Claim.LossDate, null, CreateInsurerId(Claim.ClaimNumber));
    return AcordRequest
  }
    
  /**
   * Populate the the com.iso.Update aggregate, which is specific to key field
   * update requests
   * <p>
   * Returns the populated request
   */
  protected function createUpdate() {
    var originalClaim = Claim.OriginalVersion as Claim
    AddRequest.ComIso_Update.ComIso_OriginalFields.ComIso_KeyFields.PolicyNumber = Claim.OriginalPolicyNumber
    AddRequest.ComIso_Update.ComIso_OriginalFields.ComIso_KeyFields.ItemIdInfo.AgencyId =
                        (originalClaim.AgencyId == null) ? Properties.getAgencyId() : originalClaim.AgencyId
    AddRequest.ComIso_Update.ComIso_OriginalFields.ComIso_KeyFields.ItemIdInfo.InsurerId = CreateInsurerId(originalClaim.ClaimNumber)
    if (originalClaim.LossDate != null){
      AddRequest.ComIso_Update.ComIso_OriginalFields.ComIso_KeyFields.LossDt = Translate.formatClaimDate(originalClaim.LossDate)
    }
    AddRequest.ComIso_Update.ComIso_UpdateInd = ISOConstants.UPDATE_KEY_FIELDS_INDICATOR
  }

}
