package gw.acc.iplm.entitymapper.imr.docupload

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSourceBase

uses java.io.FileInputStream
uses java.math.BigDecimal
uses java.math.RoundingMode

/**
 * This class creates a new entity of ECFMessageDocumentUploadRq_Ext from Document Upload request payload.
 */
class DocumentUploadRqEntityMapper {

  private static final var KB_SIZE = 1024
  private static final var DEFAULT_DOCUMENT_VERSION = "1"

  public function createNewDocumentUploadRq(document: Document, accessParties: List<ECFMessageDocumentUploadAccessParty_Ext>): ECFMessageDocumentUploadRq_Ext {
    var message: ECFMessageDocumentUploadRq_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message = new ECFMessageDocumentUploadRq_Ext()
      message.UUID = UUID.randomUUID().toString()
      message.OriginTimeStamp = Date.Now
      message.Claim = document.Claim

      document = bundle.add(document)
      document.IMRFileSizeNum = document.IMRFileSizeNum?:getDocumentFileSize(document)
      document.IMRFileSizeUnit = document.IMRFileSizeUnit?:ECFMessageConstants.FILE_SIZE_UNIT
      document.IMRDocumentId = document.IMRDocumentId?:UUID.randomUUID().toString()
      document.IMRDocumentVersion = document.IMRDocumentVersion?:DEFAULT_DOCUMENT_VERSION
      document.IMRDocumentVersionDtTime = document.IMRDocumentVersionDtTime?:Date.Now
      document.ECFStatus = ECFDocumentStatus_Ext.TC_PENDING_UPLOAD
      message.Document = document

      message.UCR = document.Claim.UCR_Ext
      message.UMR = document.Claim.UMR_Ext
      message.MessageType = ECFMessageType_Ext.TC_REPOSITORYUPLOAD
      message.MessageCategory = LMMessageCategory_Ext.TC_IMRDOCUMENTUPLOAD
      message.MessageDirection = ECFMessageDirectionType_Ext.TC_OUTBOUND
      message.Status = ECFMessageStatus_Ext.TC_PENDING

      var messageWithHighestRole = ECFUtils.getClaimDataMessageForTR(document.TR, document.Claim)
      message.SenderPartyId = messageWithHighestRole.ReceiverPartyId
      message.SenderPartyName = messageWithHighestRole.ReceiverPartyName
      message.SenderPartyRoleCd = messageWithHighestRole.ReceiverPartyRoleCd
      message.ReceiverPartyId = messageWithHighestRole.SenderPartyId
      message.ReceiverPartyName = messageWithHighestRole.SenderPartyName
      message.ReceiverPartyRoleCd = messageWithHighestRole.SenderPartyRoleCd

      accessParties?.each(\accessParty -> {
        message.addToAccessParties(accessParty)
      })

    }, ECFConstants.ECF_SUPER_USER)
    return message
  }

  protected function getDocumentFileSize(document: Document): BigDecimal {
    var is = getDocumentInputStream(document)
    var sizeInBytes = is.Channel.size()
    is.close()
    var sizeInKiloBytes = getFileSizeInKB(sizeInBytes)
    return sizeInKiloBytes
    }

  /**
   * This method returns the input stream for a particular Document.
   *
   * @param document
   * @return InputStream
   */
  private function getDocumentInputStream(document: Document): FileInputStream {
    var _dmsPlugin = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
    var docContentsInfo = _dmsPlugin.getDocumentContentsInfo(document, true)
    return docContentsInfo.InputStream as FileInputStream
  }

  /**
   * This function will take file size in bytes and return it in kilobytes.
   *
   * @param size file size in bytes.
   * @return BigDecimal
   */
  protected function getFileSizeInKB(size: BigDecimal): BigDecimal {
    return (size / KB_SIZE).setScale(0, RoundingMode.UP)
  }
}