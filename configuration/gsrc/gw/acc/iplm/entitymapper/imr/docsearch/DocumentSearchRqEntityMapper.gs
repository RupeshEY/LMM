package gw.acc.iplm.entitymapper.imr.docsearch

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils

/**
 * This class creates a new entity of ECFMessageDocumentSearchRq_Ext from Document Search request payload.
 */
class DocumentSearchRqEntityMapper {

  public function createNewDocumentSearchRq(claim: Claim, transactionReference: String): ECFMessageDocumentSearchRq_Ext {
    var message: ECFMessageDocumentSearchRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message = new ECFMessageDocumentSearchRq_Ext()
      message.UUID = UUID.randomUUID().toString()
      message.OriginTimeStamp = Date.Now
      message.Claim = claim
      message.TR = transactionReference
      message.UCR = claim.UCR_Ext
      message.UMR = claim.UMR_Ext
      message.Status = ECFMessageStatus_Ext.TC_PENDING
      message.MessageType = ECFMessageType_Ext.TC_REPOSITORYSEARCH
      message.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTSEARCH
      message.MessageDirection = ECFMessageDirectionType_Ext.TC_OUTBOUND
      var messageWithHighestRole = ECFUtils.getClaimDataMessageForTR(transactionReference, claim)
      message.SenderPartyId = messageWithHighestRole.ReceiverPartyId
      message.SenderPartyName = messageWithHighestRole.ReceiverPartyName
      message.SenderPartyRoleCd = messageWithHighestRole.ReceiverPartyRoleCd
      message.ReceiverPartyId = messageWithHighestRole.SenderPartyId
      message.ReceiverPartyName = messageWithHighestRole.SenderPartyName
      message.ReceiverPartyRoleCd = messageWithHighestRole.SenderPartyRoleCd

    }, ECFConstants.ECF_SUPER_USER)
    return message
  }
}