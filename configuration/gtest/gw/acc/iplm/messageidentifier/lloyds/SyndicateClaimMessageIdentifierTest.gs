package gw.acc.iplm.messageidentifier.lloyds

uses gw.acc.iplm.messageidentifier.BaseTestMessageIdentifier
uses gw.acc.iplm.testutils.ECFMessageUtil

class SyndicateClaimMessageIdentifierTest extends BaseTestMessageIdentifier {

  override function beforeMethod() {
    super.prepareTest()
        .forMessageIdentifier(new SyndicateClaimMessageIdentifier())
        .withXmlContent(ECFMessageUtil.createNewLloydsSyndicateClaimMessage())
        .withExpectedMessageType(LMMessageTypeString_Ext.TC_LMMESSAGELLOYDSSCM_EXT)
  }
}