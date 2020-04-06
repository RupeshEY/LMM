package gw.acc.iplm.messageidentifier

uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.testharness.v3.GUnitTestClass
uses gw.xml.XmlElement


/**
 * Base test class for Message Identifiers.
 * This class can be extended by individual message identifier tests and will automatically include a few common tests.
 * To prepare each test the child test must first call the prepareTest() method, chained with forMessageIdentifier(), withXmlContent(), withExpectedMessageType().
 * E.g:
 *
 * prepareTest()
 *   .forMessageIdentifier(new SyndicateClaimMessageIdentifier())
 *   .withXmlContent(ECFMessageUtil.createNewLloydsSyndicateClaimMessage())
 *   .withExpectedMessageType(LMMessageTypeString_Ext.TC_LMMESSAGELLOYDSSCM_EXT)
 */
abstract class BaseTestMessageIdentifier extends GUnitTestClass {

  private var _messageIdentifier : BaseMessageIdentifier
  private var _xmlContent : XmlElement
  private var _expectedMessageType : LMMessageTypeString_Ext

  public function prepareTest() : BaseTestMessageIdentifier {
    return this
  }

  public function forMessageIdentifier(messageIdentifier: BaseMessageIdentifier) : BaseTestMessageIdentifier {
    _messageIdentifier = messageIdentifier
    return this
  }

  public function withXmlContent(xmlContent: XmlElement) : BaseTestMessageIdentifier {
    _xmlContent = xmlContent
    return this
  }

  public function withExpectedMessageType(messageType: LMMessageTypeString_Ext) : BaseTestMessageIdentifier {
    _expectedMessageType = messageType
    return this
  }

  function testCanHandleSuccessfully() {
    assertTrue(_messageIdentifier.canHandle(_xmlContent))
  }

  function testCanHandleFalseForOtherMessages() {
    // Claim Notifies Rs are not implemented by the MessageIdentifier so they will always return false for all message types
    var incorrectMessage = ECFMessageUtil.createNewClaimNotifyRs()

    assertFalse(_messageIdentifier.canHandle(incorrectMessage))
  }

  function testMessageTypeReturnsCorrectValue() {
    assertEquals(_expectedMessageType, _messageIdentifier.messageType())
  }

}