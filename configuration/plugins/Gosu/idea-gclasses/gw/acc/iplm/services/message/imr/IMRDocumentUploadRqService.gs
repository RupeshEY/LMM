package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.services.api.OutboundIMRService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xmlmapper.repositoryoperation.imrupload.RepositoryUploadFileId

uses javax.xml.soap.SOAPMessage


class IMRDocumentUploadRqService extends OutboundIMRService<ECFMessageDocumentUploadRq_Ext> {

  private static final var FILE_SIZE_LIMIT_KB = 20000

  /**
   * Generates the SOAP payload for IMR Document Upload requests.
   *
   * @param message
   * @return {@link javax.xml.soap.SOAPMessage}
   */
  protected override function generatePayload(message: ECFMessageDocumentUploadRq_Ext): SOAPMessage {
    var payload = super.generatePayload(message)
    payload = _soapAttachmentBuilder.addDocumentAttachment(message.Document, RepositoryUploadFileId.generate(message.Document))
    return payload
  }

  override function process(message: ECFMessageDocumentUploadRq_Ext) {
    try {
      checkFileSize(message)
      super.process(message)
    } catch (e: IMRException) {
      resetDocumentEntity(message)
      throw e
    } catch (e: Exception) {
      resetDocumentEntity(message)
      throw new IMRException(e.Message)
    }
  }

  private function resetDocumentEntity(message: ECFMessageDocumentUploadRq_Ext) {
    message = message.refresh() as ECFMessageDocumentUploadRq_Ext
    var doc = message.Document

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      doc = bundle.add(doc)
      message = bundle.add(message)
      doc.ECFStatus = ECFDocumentStatus_Ext.TC_ON_DMS
      message.Status = ECFMessageStatus_Ext.TC_FAILURE
    }, ECFConstants.ECF_SUPER_USER)
  }

  private function checkFileSize(message: ECFMessageDocumentUploadRq_Ext) {
    if (message.Document.IMRFileSizeNum > FILE_SIZE_LIMIT_KB) {
      throw new IMRException(IMR_UPLOADED_DOCUMENT_EXCEEDS_SIZE_LIMIT)
    }
  }
}