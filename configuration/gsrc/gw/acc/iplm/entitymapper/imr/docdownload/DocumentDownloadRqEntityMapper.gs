package gw.acc.iplm.entitymapper.imr.docdownload

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils

/**
 * This class creates a new entity of ECFMessageDocumentDownloadRq_Ext from Document Download request payload.
 */
class DocumentDownloadRqEntityMapper {

  /**
   *  Creates an IMR Document Download request message entity for a Document
   *  entity on a particular Claim.
   *
   * @param documentToDownload
   * @return {@link entity.ECFMessageDocumentDownloadRq_Ext}
   */
  public function createNewDocumentDownloadRq(documentToDownload: Document): ECFMessageDocumentDownloadRq_Ext {
    var message: ECFMessageDocumentDownloadRq_Ext
    var claim = documentToDownload.Claim
    var messageWithHighestRole = ECFUtils.getClaimDataMessageForTR(documentToDownload.TR, documentToDownload.Claim)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      documentToDownload = bundle.add(documentToDownload)
      message = new ECFMessageDocumentDownloadRq_Ext()

      message = setRequestInformation(message, documentToDownload)
      message = setSenderInformation(message, messageWithHighestRole)
      message = setReceiverInformation(message, messageWithHighestRole)
      documentToDownload = setDocumentStatus(documentToDownload)
    }, ECFConstants.ECF_SUPER_USER)
    return message
  }

  private function setRequestInformation(message : ECFMessageDocumentDownloadRq_Ext, documentToDownload : Document) : ECFMessageDocumentDownloadRq_Ext{
    message.UUID = UUID.randomUUID().toString()
    message.OriginTimeStamp = Date.Now
    message.Claim = documentToDownload.Claim
    message.TR = documentToDownload.TR
    message.UCR = documentToDownload.Claim.UCR_Ext
    message.UMR = documentToDownload.Claim.UMR_Ext
    message.Document = documentToDownload
    message.Status = ECFMessageStatus_Ext.TC_PENDING
    message.MessageType = ECFMessageType_Ext.TC_REPOSITORYDOWNLOAD
    message.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTDOWNLOAD
    message.MessageDirection = ECFMessageDirectionType_Ext.TC_OUTBOUND
    return message
  }

  private function setSenderInformation(message : ECFMessageDocumentDownloadRq_Ext, messageWithHighestRole: ECFMessageClaimData_Ext) : ECFMessageDocumentDownloadRq_Ext{
    message.SenderPartyId = messageWithHighestRole.ReceiverPartyId
    message.SenderPartyName = messageWithHighestRole.ReceiverPartyName
    message.SenderPartyRoleCd = messageWithHighestRole.ReceiverPartyRoleCd
    return message
  }

  private function setReceiverInformation(message : ECFMessageDocumentDownloadRq_Ext, messageWithHighestRole: ECFMessageClaimData_Ext) : ECFMessageDocumentDownloadRq_Ext{
    message.ReceiverPartyId = messageWithHighestRole.SenderPartyId
    message.ReceiverPartyName = messageWithHighestRole.SenderPartyName
    message.ReceiverPartyRoleCd = messageWithHighestRole.SenderPartyRoleCd
    return message
  }

  private function setDocumentStatus(document : Document) : Document{
    document.ECFStatus = ECFDocumentStatus_Ext.TC_PENDING_DOWNLOAD
    return document
  }
}