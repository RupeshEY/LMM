package gw.acc.iplm.messageidentifier.ecfwriteback

uses gw.acc.iplm.messageidentifier.BaseTestMessageIdentifier
uses gw.acc.iplm.testutils.ECFMessageUtil

class ClaimRetrieveRsMessageIdentifierTest extends BaseTestMessageIdentifier {

  override function beforeMethod() {
    super.prepareTest()
        .forMessageIdentifier(new ClaimRetrieveRsMessageIdentifier())
        .withXmlContent(ECFMessageUtil.createNewClaimRetrieveRs())
        .withExpectedMessageType(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRETRIEVERS_EXT)
  }
}