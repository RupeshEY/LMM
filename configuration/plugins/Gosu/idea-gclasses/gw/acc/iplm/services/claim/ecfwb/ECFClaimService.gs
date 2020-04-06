package gw.acc.iplm.services.claim.ecfwb

uses entity.Address
uses entity.LMMessage_Ext
uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.services.claim.contacts.ECFContactFactory
uses gw.acc.iplm.services.policy.ECFPolicyService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses org.apache.commons.lang3.StringUtils
uses org.slf4j.Logger

class ECFClaimService {

  protected static final var LOGGER: Logger = ECFConstants.LOGGER_BLOCK()

  private var _claimDAO: ClaimDAO
  private var _policyService: ECFPolicyService as PolicyService

  construct() {
    this(new ClaimDAO(), new ECFPolicyService())
  }

  construct(claimDAO: ClaimDAO, policyService: ECFPolicyService) {
    _claimDAO = claimDAO
    _policyService = policyService
  }


  /**
   * Creates a new Claim and attaches it to a policy.
   * To save the claim, <code>persistClaim()</code> needs to be called after this method
   * Assumes this method is called inside a bundle.
   *
   * @param policyNumber Policy Number
   * @return Claim
   * @throws ECFException POLICY_NUMBER_BLANK - No policy number was provided (or it's blank)
   */
  public function initializeClaim(policyNumber: String): Claim {

    if (StringUtils.isBlank(policyNumber)) {
      throw new ECFException(ECFErrorCodeType.POLICY_NUMBER_BLANK)
    }
    LOGGER.info("Initializing Claim Creation")
    var claim = new Claim()
    var policy = _policyService.findPolicy(policyNumber)
    claim = mapClaimPolicy(claim, policy)
    return claim
  }

  /**
   * Saves a previously created claim in the database.
   * To initialize a claim call <code>initializeClaim()</code>
   * Assumes this method is called inside a bundle.
   *
   * @param claim Initialized Claim we intend to save
   * @return Claim
   */
  public function persistClaim(claim: Claim): Claim {
    claim = _claimDAO.createClaim(claim)
    LOGGER.info("Claim created: ${claim.ClaimNumber}")
    return claim
  }

  private function mapClaimPolicy(claim: Claim, policy: Policy): Claim {
    var lossType = gw.api.policy.PolicyTypeUtil.getLossTypeForPolicyType(policy.PolicyType)
    var lob = typekey.LOBCode.getTypeKeys(false).firstWhere(\l -> l.hasCategory(lossType) and l.hasCategory(policy.PolicyType))
    claim.LOBCode = lob
    claim.LossType = lossType
    claim.Policy = policy
    return claim
  }

  /**
   * Maps the Claim information in a ECFMessageClaimData_Ext entity to the relevant fields on the Claim entity
   *
   * @param ecfData The ECFMessageClaimData_Ext entity
   * @param claim   The Claim entity to update
   * @return the updated Claim
   */
  public function updateClaimData(ecfData: ECFMessageClaimData_Ext, claim: Claim): Claim {
    claim = setUpClaim(ecfData, claim)
    claim = updateDescription(ecfData, claim)
    claim = updateLossLocation(ecfData, claim)
    claim = updateLossDate(ecfData, claim)
    claim = updateClaimType(ecfData, claim)
    claim = updateClaimLineNumber(ecfData, claim)
    claim = updateParties(ecfData, claim)
    claim = setEEventIfNeeded(ecfData, claim)
    claim = setVCSIndicator(ecfData, claim)
    claim = setUberPrecautionaryFlag(ecfData, claim)
    claim = updateCatastrophes(ecfData, claim)
    return claim
  }

  public function setUpClaim(ecfData: LMMessage_Ext, claim: Claim): Claim {
    if (claim.New) {
      claim.ReportedDate = Date.CurrentDate
      claim.UMR_Ext = ecfData.UMR
      claim.UCR_Ext = ecfData.UCR
    }
    return claim
  }

  private function updateDescription(ecfData: ECFMessageClaimData_Ext, claim: Claim): Claim {
    claim.Description = ecfData.LossDetails
    return claim
  }

  private function updateLossLocation(ecfData: ECFMessageClaimData_Ext, claim: Claim): Claim {
    if (claim.LossLocation == null) {
      claim.LossLocation = new Address(claim)
    }
    claim.LossLocation.Description = ecfData.LossLocation
    claim.LossLocation.Country = Country.get(ecfData.LossLocation)

    return claim
  }

  private function updateLossDate(ecfData: ECFMessageClaimData_Ext, claim: Claim): Claim {
    claim.LossDate = ecfData.LossStartDate
    claim.LossEndDate_Ext = ecfData.LossEndDate
    return claim
  }

  private function updateClaimType(ecfData: ECFMessageClaimData_Ext, claim: Claim): Claim {
    claim.ClaimTypeCode_Ext = ecfData.ClaimType
    return claim
  }

  private function updateClaimLineNumber(ecfData: ECFMessageClaimData_Ext, claim: Claim): Claim {
    claim.ClaimLineNumber_Ext = ecfData.ClaimLineNumber
    return claim
  }

  private function updateParties(ecfData: ECFMessageClaimData_Ext, claim: Claim): Claim {
    if (ecfData.ECFContactData.InsurerAgency != null) {
      ECFContactFactory.createContacts(TC_ECFINSURER_EXT, claim, ecfData)
    } else {
      ECFContactFactory.createContacts(TC_ECFREINSURER_EXT, claim, ecfData)
    }

    ECFMessageConstants.DEFAULT_CONTACT_ROLES.each(\contactRole ->
        ECFContactFactory.createContacts(contactRole, claim, ecfData)
    )
    return claim
  }

  private function setEEventIfNeeded(ecfData: ECFMessageClaimData_Ext, claim: Claim): Claim {
    if (isActionCodeResponse(ecfData)) {
      return claim
    }

    claim.ECFLocked = isActionCodeEEvent(ecfData) or isTransactionCodeEEvent(ecfData)

    return claim
  }

  private function isActionCodeResponse(ecfData: ECFMessageClaimData_Ext): boolean {
    return ecfData.ActionCode == ECFActionCode_Ext.TC_R
  }

  private function isActionCodeEEvent(ecfData: ECFMessageClaimData_Ext): boolean {
    return ecfData.ActionCode == ECFActionCode_Ext.TC_E
  }

  private function isTransactionCodeEEvent(ecfData: ECFMessageClaimData_Ext): boolean {
    return ecfData.TransactionStatus == null
        or ecfData.TransactionStatus == ECFTransactionStatus_Ext.TC_3
        or ecfData.TransactionStatus == ECFTransactionStatus_Ext.TC_4
  }

  /**
   * If the TriageCategory indicates that this Claim is in VCS,
   * then the flag is set on the claim. Otherwise it is set to false.
   */
  private function setVCSIndicator(ecfData: ECFMessageClaimData_Ext, claim: Claim): Claim {
    claim.VCSIndicator_Ext = ecfData.TriageCategory == TC_VCS_CRAWFORD
        or ecfData.TriageCategory == TC_VCS_XCS

    return claim
  }

  /**
   * If the OutstandingAmountQualifier is U, it means that Claim is Uber Precautionary.
   * So we update the UberPrecautionaryFlag_Ext flag to true, otherwise set it to false.
   */
  private function setUberPrecautionaryFlag(ecfData: ECFMessageClaimData_Ext, claim: Claim): Claim {
    claim.UberPrecautionaryFlag_Ext = (ecfData.OutstandingAmountQualifier == ECFOutstandingQualifierCode_Ext.TC_U)
    return claim
  }

  /**
   * This method associates an existing LCO or PCS Catastrophes codes with a claim.
   * It is possible (but very unlikely) that a message could contain both an LCO and a PCS code.
   * If so, use the LCO code only.
   */
  private function updateCatastrophes(ecfData: ECFMessageClaimData_Ext, claim: Claim): Claim {
    var catastrophe = ecfData.CatastropheByLcoOrPcsCode
    LOGGER.debug("A claim is associated with catastrophe: ${catastrophe?.Name}")
    claim.Catastrophe = catastrophe
    return claim
  }
}