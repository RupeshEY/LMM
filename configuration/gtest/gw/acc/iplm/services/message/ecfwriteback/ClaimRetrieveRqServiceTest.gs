package gw.acc.iplm.services.message.ecfwriteback

uses gw.acc.iplm.jms.producer.ProducerService
uses gw.acc.iplm.security.MessageOutboundAuthentication
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq
uses gw.acc.iplm.xsd.wb_header_1_0.Xchangingheader
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.ArgumentCaptor
uses org.mockito.Mockito

uses javax.xml.soap.SOAPMessage

class ClaimRetrieveRqServiceTest extends GUnitTestClass {

  var _service : ClaimRetrieveRqService
  var _entity: ECFMessageClaimRetrieveRq_Ext

  override function beforeMethod() {
    super.beforeMethod()
    _service = new ClaimRetrieveRqService()
    _entity = ECFMessageEntityUtil.createClaimRetrieveRq()
  }

  function testSOAPHeaderMessageType() {
    assertEquals(_service.SOAPHeaderMessageType, ECFMessageConstants.CLAIMRETRIEVE_HEADER_TYPE)
  }

  function testGeneratePayloadBody() {
    var payload = _service.generatePayloadBody(_entity)

    assertNotNull(payload)
  }

  function testGeneratePayload_CallsBody() {
    var expectedBody = _service.generatePayloadBody(_entity).asUTFString()
    var soapMessage = _service.generatePayload(_entity)

    var soapBodyPayload = RetrieveClaimRq.parse(ECFUtils.convertNodeToString(soapMessage.SOAPBody.ChildNodes.item(0))).asUTFString()

    assertEquals(expectedBody, soapBodyPayload)
  }

  function testGeneratePayload_HasXchangingHeader() {
    var expectedHeader = _service.createXchangingHeader(_entity).asUTFString()
    var soapMessage = _service.generatePayload(_entity)

    var soapHeaderPayload = Xchangingheader.parse(ECFUtils.convertNodeToString(soapMessage.SOAPHeader.ChildNodes.item(0))).asUTFString()

    assertEquals(expectedHeader, soapHeaderPayload)
  }

  function testSignPayload() {
    _service._messageOutboundAuthentication = Mockito.mock(MessageOutboundAuthentication)

    var soapMessage = _service.generatePayload(_entity)
    _service.signPayload(soapMessage)

    Mockito.verify(_service._messageOutboundAuthentication, Mockito.times(1)).signSoapMessage(soapMessage)
  }

  function testProcess() {
    var messageCaptor = ArgumentCaptor.forClass(SOAPMessage)
    var expectedBody = _service.generatePayloadBody(_entity).asUTFString()

    _service._messageOutboundAuthentication = Mockito.spy(new MessageOutboundAuthentication())
    _service._producerService = Mockito.mock(ProducerService)

    _service.process(_entity)

    Mockito.verify(_service._producerService, Mockito.times(1)).queueMessage(messageCaptor.capture())
    Mockito.verify(_service._messageOutboundAuthentication, Mockito.times(1)).signSoapMessage(Mockito.any())

    var soapMessage = messageCaptor.getValue()
    var soapBodyPayload = RetrieveClaimRq.parse(ECFUtils.convertNodeToString(soapMessage.SOAPBody.ChildNodes.item(0))).asUTFString()
    assertEquals(expectedBody, soapBodyPayload)
  }
}