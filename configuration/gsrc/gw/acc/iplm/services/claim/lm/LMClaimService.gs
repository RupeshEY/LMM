package gw.acc.iplm.services.claim.lm

uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.services.claim.contacts.LMContactFactory
uses gw.acc.iplm.services.claim.lm.mapper.SCMReserveMapper
uses gw.acc.iplm.services.policy.ECFPolicyService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.LMMessageConstants
uses gw.api.policy.PolicyTypeUtil
uses org.apache.commons.lang3.StringUtils
uses org.slf4j.Logger

class LMClaimService {

  protected static final var LOGGER : Logger = ECFConstants.LOGGER_BLOCK()
  private var _claimDAO : ClaimDAO as ClaimDAO = new ClaimDAO()
  private var _policyService : ECFPolicyService as PolicyService = new ECFPolicyService()
  private var _scmReserveMapper = new SCMReserveMapper()

  /**
   * Creates a new Claim. This Claim will include mapped details from the message so they are included in the FNOL.
   *
   * @param message
   * @return Claim
   */
  public function createClaim(message : LMMessageLloydsSCM_Ext) : Claim {
    LOGGER.info("Creating new Claim for UCR ${message.UCR}")

    var claim = createNewClaimFromLMMessage(message)
    claim = mapPolicyToClaim(message, claim)
    // This is so the information is there for the FNOL
    claim = mapClaimDetails(message, claim)
    claim = _claimDAO.createClaim(claim)

    return claim
  }

  private function createNewClaimFromLMMessage(message : LMMessageLloydsSCM_Ext) : Claim {
    var newClaim = new Claim()
    newClaim.UMR_Ext = message.UMR
    newClaim.UCR_Ext = message.UCR
    newClaim.ReportedDate = Date.CurrentDate
    return newClaim
  }

  private function mapPolicyToClaim(message : LMMessageLloydsSCM_Ext, claim : Claim) : Claim {
    if (StringUtils.isBlank(message.PolicyNumber)) {
      throw new ECFException(ECFErrorCodeType.POLICY_NUMBER_BLANK)
    }

    var policy = _policyService.findPolicy(message.PolicyNumber)
    var lossType = PolicyTypeUtil.getLossTypeForPolicyType(policy.PolicyType)
    var lob = typekey.LOBCode.getTypeKeys(false).firstWhere(\lobCode -> lobCode.hasCategory(lossType) and lobCode.hasCategory(policy.PolicyType))

    claim.LOBCode = lob
    claim.LossType = lossType

    // Assigning a Policy to a Claim requires the claim to first have an assigned LOB otherwise it throws an Exception
    claim.Policy = policy

    return claim
  }

  /**
   * Performs the mapping of business related fields in the message to the claim
   *
   * @param message Message containing the data
   * @param claim   Original Claim
   * @return Claim
   */
  public function mapClaimDetails(message : LMMessageLloydsSCM_Ext, claim : Claim) : Claim {
    claim = mapLossDetailsToClaim(message, claim)
    claim = mapContactDetailsToClaim(message, claim)
    claim = mapExposure(message, claim)
    claim = mapReserve(message, claim)
    return claim
  }

  private function mapLossDetailsToClaim(message : LMMessageLloydsSCM_Ext, claim : Claim) : Claim {
    claim.LossDate = message.LossStartDate?:claim.LossDate
    claim.LossEndDate_Ext = message.LossEndDate?:claim.LossEndDate_Ext
    claim.Description = message.LossDescription?:claim.Description
    claim.LossLocation.Description = message.LossLocation?:claim.LossLocation.Description
    return claim
  }

  private function mapContactDetailsToClaim(message : LMMessageLloydsSCM_Ext, claim : Claim) : Claim {
    if (message.ContactData.InsurerAgency != null) {
      LMContactFactory.createContacts(ContactRole.TC_ECFINSURER_EXT, claim, message)
    } else {
      LMContactFactory.createContacts(ContactRole.TC_ECFREINSURER_EXT, claim, message)
    }

    LMMessageConstants.DEFAULT_CONTACT_ROLES.each(\contactRole ->
        LMContactFactory.createContacts(contactRole, claim, message)
    )
    return claim
  }

  private function mapReserve(message : LMMessageLloydsSCM_Ext, claim : Claim) : Claim {
    return _scmReserveMapper.mapReserve(message, claim)
  }

  /**
   * Maps exposure information from a Lloyds SCM Message to a claim.
   *
   * @param message
   * @param claim   The Claim to modify exposure information.
   * @return {@link Claim} The modified Claim
   */
  private function mapExposure(message : LMMessageLloydsSCM_Ext, claim : Claim) : Claim {
    LOGGER.debug("Mapping exposures for Claim {}", claim.ClaimNumber)
    var exposureToUpdate = claim.Exposures.firstWhere(\elt -> elt.OCR_Ext == message.OCR)

    if (exposureToUpdate == null) {
      LOGGER.debug("No existing exposure found for OCR: {}.", message.OCR)
      LOGGER.debug("Creating new exposure for OCR: {}.", message.OCR)
      var exposureType = typekey.ExposureType.TC_IPLM_EXT
      exposureToUpdate = claim.newExposure(exposureType, true)
      exposureToUpdate.OCR_Ext = message.OCR
      exposureToUpdate.PrimaryCoverage = typekey.CoverageType.TC_IPLM_EXT
      exposureToUpdate.CoverageSubType = typekey.CoverageSubtype.TC_IPLM_EXT
      exposureToUpdate.State = ExposureState.TC_OPEN
      exposureToUpdate.autoAssign()
    } else {
      LOGGER.debug("Existing exposure found for OCR {}", message.OCR)
    }

    LOGGER.debug("Finished mapping exposures for Claim {}", claim.ClaimNumber)
    return claim
  }
}