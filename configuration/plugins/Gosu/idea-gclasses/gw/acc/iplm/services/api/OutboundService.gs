package gw.acc.iplm.services.api

uses entity.LMMessage_Ext
uses gw.acc.iplm.jms.producer.ProducerService
uses gw.acc.iplm.security.MessageOutboundAuthentication

uses javax.xml.soap.SOAPMessage

abstract class OutboundService<T extends LMMessage_Ext> extends AbstractService<T> {

  protected var _producerService: ProducerService
  protected var _messageOutboundAuthentication: MessageOutboundAuthentication

  construct() {
    _messageOutboundAuthentication = new MessageOutboundAuthentication()
  }

  override function process(message: T) {
    var payload = generatePayload(message)
    payload = signPayload(payload)
    sendOutboundMessage(payload)
  }

  /**
   * Generates a payload for an outbound message
   *
   * @param message : ECFMessage_Ext   Message to generate the Payload for
   * @return payload   : SOAPMessage       Generated SOAP payload
   */
  abstract protected function generatePayload(message: T): SOAPMessage

  /**
   * Signs the message payload
   *
   * @param payload : SOAPMessage       Outbound payload
   */
  protected function signPayload(payload: SOAPMessage): SOAPMessage {
    return _messageOutboundAuthentication.signSoapMessage(payload)
  }

  /**
   * Outbounds the message with a given payload
   *
   * @param payload : SOAPMessage       Outbound payload
   */
  abstract protected function sendOutboundMessage(payload: SOAPMessage)
}