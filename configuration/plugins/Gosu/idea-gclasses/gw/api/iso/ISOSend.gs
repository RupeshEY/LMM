package gw.api.iso

@Export
class ISOSend implements IISOSend {
  
  construct() {}
  
  @Throws(ISOBadReceiptException, "If receipt does not contain valid status code.")
  @Throws(ISOCommunicationException, "if communication with the ISO server fails")
  override public function send(messageId : long, xml : String, properties : ISOProperties) {
    properties.getMessageLogger().logRequest(messageId, xml)
    if (properties.shouldSendMessages()) {
        var receiptXML = sendToISO(xml, properties)
        parseReceipt(messageId, receiptXML, properties)
    }
  }
  
  @Throws(ISOCommunicationException,  "if communication with the ISO server fails")
  private function sendToISO(xml : String, properties : ISOProperties) : String { 
    return ISOPayloadHelper.sendToISO(xml, properties)
  }

 
  private function parseReceipt(messageId : long, receiptXML : String, properties : ISOProperties) {
    properties.getMessageLogger().logReceipt(messageId, receiptXML)
    var receipt = new ISOReceipt(receiptXML)
    receipt.ensureAccepted()
  }
}
