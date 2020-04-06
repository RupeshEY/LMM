package gw.acc.iplm.messageidentifier.ecfwriteback

uses gw.acc.iplm.messageidentifier.BaseTestMessageIdentifier
uses gw.acc.iplm.testutils.ECFMessageUtil

class ClaimRetrieveRqMessageIdentifierTest extends BaseTestMessageIdentifier {

  override function beforeMethod() {
    super.prepareTest()
        .forMessageIdentifier(new ClaimRetrieveRqMessageIdentifier())
        .withXmlContent(ECFMessageUtil.createNewClaimRetrieveRq())
        .withExpectedMessageType(LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRETRIEVERQ_EXT)
  }
}