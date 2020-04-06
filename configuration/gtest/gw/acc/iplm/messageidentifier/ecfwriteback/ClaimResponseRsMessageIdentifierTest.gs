package gw.acc.iplm.messageidentifier.ecfwriteback

uses gw.acc.iplm.messageidentifier.BaseTestMessageIdentifier
uses gw.acc.iplm.testutils.ECFMessageUtil

class ClaimResponseRsMessageIdentifierTest extends BaseTestMessageIdentifier {

  override function beforeMethod() {
    super.prepareTest()
        .forMessageIdentifier(new ClaimResponseRsMessageIdentifier())
        .withXmlContent(ECFMessageUtil.createNewClaimResponseRs())
        .withExpectedMessageType(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRESPONSERS_EXT)
  }
}