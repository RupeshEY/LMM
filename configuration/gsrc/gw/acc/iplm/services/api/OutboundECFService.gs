package gw.acc.iplm.services.api

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.jms.producer.ECFProducerService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xmlmapper.soap.SoapMessageBuilder
uses gw.acc.iplm.xmlmapper.xchanging.XchangingheaderMapper
uses gw.acc.iplm.xsd.wb_header_1_0.Xchangingheader
uses gw.xml.XmlElement

uses javax.xml.soap.SOAPMessage

abstract class OutboundECFService<T extends ECFMessage_Ext> extends OutboundService<T> {

  construct() {
    super()
    _producerService = new ECFProducerService()
  }

  protected override function generatePayload(message: T): SOAPMessage {
    var envelope : SOAPMessage

    try {
      var payloadBody = generatePayloadBody(message)
      var xchangingHeader = createXchangingHeader(message)
      envelope = new SoapMessageBuilder(payloadBody, xchangingHeader).createSoapMessage()

    } catch (ex: Exception) {
      LOGGER.error("There was an error generating the payload for the ECF request. Error: ", ex)
      throw new ECFException(ECFErrorCodeType.UNABLE_TO_GENERATE_PAYLOAD, ex)
    }

    return envelope
  }

  protected function createXchangingHeader(message: T): Xchangingheader {
    var headerMapper = new XchangingheaderMapper(message.SenderPartyId,
        message.ReceiverPartyId,
        ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().format(message.OriginTimeStamp),
        this.SOAPHeaderMessageType,
        message.UUID)

    return headerMapper.createXchangingheader()
  }

  protected override function sendOutboundMessage(payload: SOAPMessage) {
    try {
      _producerService.queueMessage(payload)
    } catch (ex: Exception) {
      LOGGER.error("There was an error connecting to the ECF Service for an ECF message request. Error: ", ex)
      throw new ECFException(ECFErrorCodeType.UNABLE_TO_CONNECT, ex)
    }
  }

  /**
   * Returns the Message Type that should be included in the SOAP message's header
   * @return SOAP Header Message Type
   */
  abstract protected property get SOAPHeaderMessageType() :  String

  /**
   * Generates and returns the XmlElement to be used as the SOAP Payload Body.
   * @param message Entity that stores the message
   * @return XmlElement - Payload Body
   */
  abstract protected function generatePayloadBody(message: T) : XmlElement
}