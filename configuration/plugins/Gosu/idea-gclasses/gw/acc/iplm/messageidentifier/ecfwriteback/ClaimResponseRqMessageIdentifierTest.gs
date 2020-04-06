package gw.acc.iplm.messageidentifier.ecfwriteback

uses gw.acc.iplm.messageidentifier.BaseTestMessageIdentifier
uses gw.acc.iplm.testutils.ECFMessageUtil

class ClaimResponseRqMessageIdentifierTest extends BaseTestMessageIdentifier {

  override function beforeMethod() {
    super.prepareTest()
        .forMessageIdentifier(new ClaimResponseRqMessageIdentifier())
        .withXmlContent(ECFMessageUtil.createNewClaimResponseRq())
        .withExpectedMessageType(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRESPONSERQ_EXT)
  }
}