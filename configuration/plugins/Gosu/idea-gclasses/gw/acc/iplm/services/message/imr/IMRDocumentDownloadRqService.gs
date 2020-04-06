package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.services.api.OutboundIMRService
uses gw.acc.iplm.utils.ECFConstants

uses javax.xml.soap.SOAPMessage

class IMRDocumentDownloadRqService extends OutboundIMRService<ECFMessageDocumentDownloadRq_Ext> {

  /**
   * Generates the SOAP payload for IMR Document Download requests.
   *
   * @param message
   * @return {@link javax.xml.soap.SOAPMessage}
   */
  protected override function generatePayload(message: ECFMessageDocumentDownloadRq_Ext): SOAPMessage {
    // Additional configurations for generating payloads are
    // intended to go here
    return super.generatePayload(message)
  }

  override function process(message: ECFMessageDocumentDownloadRq_Ext) {
    try {
      super.process(message)
    } catch (e: IMRException) {
      resetDocumentEntity(message)
      throw e
    } catch (e: Exception) {
      resetDocumentEntity(message)
      throw new IMRException(e.Message)
    }
  }

  private function resetDocumentEntity(message: ECFMessageDocumentDownloadRq_Ext) {
    message = message.refresh() as ECFMessageDocumentDownloadRq_Ext
    var doc = message.Document

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      doc = bundle.add(doc)
      message = bundle.add(message)
      doc.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR
      message.Status = ECFMessageStatus_Ext.TC_FAILURE
    }, ECFConstants.ECF_SUPER_USER)
  }

}