package gw.acc.iplm.messageidentifier.ecfwriteback

uses gw.acc.iplm.messageidentifier.BaseTestMessageIdentifier
uses gw.acc.iplm.testutils.ECFMessageUtil

class ClaimNotifyRqMessageIdentifierTest extends BaseTestMessageIdentifier {

  override function beforeMethod() {
    super.prepareTest()
        .forMessageIdentifier(new ClaimNotifyRqMessageIdentifier())
        .withXmlContent(ECFMessageUtil.createNewClaimNotifyRq())
        .withExpectedMessageType(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT)
  }
}