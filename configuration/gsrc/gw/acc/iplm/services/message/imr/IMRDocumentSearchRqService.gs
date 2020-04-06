package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.services.api.OutboundIMRService

uses javax.xml.soap.SOAPMessage

class IMRDocumentSearchRqService extends OutboundIMRService<ECFMessageDocumentSearchRq_Ext> {

  /**
   * Generates the SOAP payload for IMR Document Search requests.
   *
   * @param message
   * @return {@link javax.xml.soap.SOAPMessage}
   */
  protected override function generatePayload(message: ECFMessageDocumentSearchRq_Ext): SOAPMessage {
    // Additional configurations for generating payloads are
    // intended to go here
    return super.generatePayload(message)
  }
}