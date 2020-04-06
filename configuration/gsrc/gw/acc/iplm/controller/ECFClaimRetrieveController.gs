package gw.acc.iplm.controller

uses gw.acc.iplm.InterceptorManagerWrapper
uses gw.acc.iplm.config.LMCompaniesDataLoader
uses gw.acc.iplm.dto.PartyDto
uses gw.acc.iplm.entitymapper.ecfwb.claimretrieve.ClaimRetrieveRqEntityMapper
uses gw.pl.persistence.core.Bundle

/**
 * Controller for ECF Claim Retrieve Request messages
 */
class ECFClaimRetrieveController {

  private var _interceptorManager: InterceptorManagerWrapper as InterceptorManager = new InterceptorManagerWrapper()
  private var _sender: PartyDto as Sender
  private var _companies: List<PartyDto> as AllCompanies = retrieveCompanies()

  /**
   * Creates a List of PartyDTO objects, populated from the list of ECF Companies in the system
   * @return ECF Companies as a list of PartyDTO objects
   */
  private function retrieveCompanies() : List<PartyDto> {
    return new LMCompaniesDataLoader().AllCompanies.map(\elt -> new PartyDto(elt))
  }

  /**
   * Initializes a new Claim Retrieve.
   * Will reset the Sender field and returns a new Claim Retrieve Rq entity.
   * @param claim Claim, to initialize the new Entity's claim fields (UCR & UMR)
   * @param bundle Bundle
   * @return New Claim Retrieve Rq Entity
   */
  public function initializeNewClaimRetrieve(claim: Claim, bundle: Bundle) : ECFMessageClaimRetrieveRq_Ext {
    _sender = null
    return ClaimRetrieveRqEntityMapper.createClaimRetrieveRqEntity(claim, bundle)
  }

  /**
   * Executed after changing the Bureau field.
   * Populates the sender fields in the Claim Retrieve entity and resets the Claim Type
   * @param claimRetrieveRq
   * @return
   */
  public function onBureauChanged(claimRetrieveRq: ECFMessageClaimRetrieveRq_Ext) : ECFMessageClaimRetrieveRq_Ext {
    claimRetrieveRq = populateSender(claimRetrieveRq, _sender)
    claimRetrieveRq.ClaimType = null

    return claimRetrieveRq
  }

  /**
   * Populates the Claim Retrieve Rq entity's sender fields based on a PartyDTO object
   * @param claimRetrieveRq Claim Retrieve Rq Entity
   * @param sender Party DTO object
   * @return Claim Retrieve Rq entity with populated sender fields
   */
  private function populateSender(claimRetrieveRq: ECFMessageClaimRetrieveRq_Ext, sender: PartyDto): ECFMessageClaimRetrieveRq_Ext {
    claimRetrieveRq.SenderPartyId = sender?.Id
    claimRetrieveRq.SenderPartyName = sender?.Name
    claimRetrieveRq.SenderPartyAgency = sender?.Agency

    return claimRetrieveRq
  }

  /**
   * This function will return ClaimTypeCodes depending on the Sender Agency
   *
   * @param sender Party Object for the sender
   * @return java.util.List<typekey.ECFClaimTypeCode>
   */
  public function getClaimTypeForSender(sender: PartyDto): List<ECFClaimTypeCode_Ext> {
    final var bureauTypeToClaimTypeMapper = {ECFBureauType_Ext.TC_LLOYDS.Code -> ECFClaimTypeCode_Ext.TF_LLOYDS.TypeKeys,
                                             ECFBureauType_Ext.TC_LIRMA.Code  -> ECFClaimTypeCode_Ext.TF_LIRMA.TypeKeys,
                                             ECFBureauType_Ext.TC_ILU.Code    -> ECFClaimTypeCode_Ext.TF_ILU.TypeKeys}

    return bureauTypeToClaimTypeMapper.get(sender?.Agency?.toLowerCase())
  }

  /**
   * Sends the Claim Retrieve Request
   * @param claimRetrieveRq Claim Retrieve Rq Entity
   */
  public function sendRequest(claimRetrieveRq: ECFMessageClaimRetrieveRq_Ext) {
    _interceptorManager.intercept(claimRetrieveRq)
  }
}