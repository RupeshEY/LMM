package gw.acc.iplm.entitymapper.ecfwb.claimretrieve

uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ECFMessageClaimDataMapper
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs
uses gw.xml.XmlElement

/**
 * This class creates a new entity of ECFMessageClaimRetrieveRs_Ext from Retrieve Claim response payload.
 */
class ClaimRetrieveRsEntityMapper extends ECFMessageClaimDataMapper {

  override function isCorrectMessageType(xmlPayload: XmlElement): boolean {
    return xmlPayload.$QName.LocalPart == ECFMessageConstants.CLAIM_RETRIEVE_RS_QNAME_LP
  }

  override function createNewLMMessage(lmMessageDTO: LMMessageDTO): ECFMessage_Ext {
    if (not isCorrectMessageType(lmMessageDTO.XMLPayLoad)) {
      return null
    }

    final var claimRetrieveRs = RetrieveClaimRs.parse(lmMessageDTO.XMLPayLoad.asUTFString())
    var message = new ECFMessageClaimRetrieveRs_Ext()
    var claimMessageDTO = new ClaimMessageDTO(claimRetrieveRs)
    message = createCommonMessageClaimData(claimMessageDTO, message) as ECFMessageClaimRetrieveRs_Ext
    message.ClaimRetrieveReqReferredUUId = claimRetrieveRs.ReferredUUId
    mapResponseDescription(message, claimRetrieveRs)
    mapDataFromReferredUUId(message)
    mapAdminLogData(message)
    return message
  }

  private function mapAdminLogData(retrieveRs: ECFMessageClaimRetrieveRs_Ext) {
    retrieveRs.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    retrieveRs.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMRETRIEVE
  }

  private function mapResponseDescription(retrieveRs: ECFMessageClaimRetrieveRs_Ext, claimRetrieveRs: RetrieveClaimRs) {
    retrieveRs.ResponseAcknowledgement.AcknowledgementStatus = ECFAcknowledgementStatus_Ext.get(claimRetrieveRs.Response.AcknowledgementStatus)
    retrieveRs.ResponseAcknowledgement.AcknowledgementLevelIndicator = claimRetrieveRs.Response.AcknowledgementLevelIndicator
    retrieveRs.ResponseAcknowledgement.ResponseDescription = claimRetrieveRs.Response.ResponseDescription
    retrieveRs.ResponseAcknowledgement.AckLevel = ECFAckLevelCode_Ext.getByName(claimRetrieveRs.Response.ResponseDescription)
    retrieveRs.ResponseAcknowledgement.ErrorCode = ECFAckLevelCode_Ext.getByName(claimRetrieveRs.Response.ResponseDescription).ECFErrorCode?.ErrorCode
  }

  /**
   * In the case where CLASS is down or this ClaimRetrieveRs does not contain Broker Reference data,
   * we can get this from the associated ClaimRetrieveRq
   *
   * @param retrieveRs
   */
  private function mapDataFromReferredUUId(retrieveRs: ECFMessageClaimRetrieveRs_Ext) {
    if (retrieveRs.ResponseAcknowledgement.IsRejected or retrieveRs.ResponseAcknowledgement.HasNoClaimData) {
      var claimRetrieveRq = ECFUtils.findMessageByUUID(retrieveRs.ClaimRetrieveReqReferredUUId)
      retrieveRs.UMR = claimRetrieveRq.UMR
      retrieveRs.UCR = claimRetrieveRq.UCR
      retrieveRs.TR = claimRetrieveRq.TR
      retrieveRs.Claim = claimRetrieveRq.Claim
    }
  }
}