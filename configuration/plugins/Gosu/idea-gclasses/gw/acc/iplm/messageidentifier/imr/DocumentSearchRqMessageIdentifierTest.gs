package gw.acc.iplm.messageidentifier.imr

uses gw.acc.iplm.messageidentifier.BaseTestMessageIdentifier
uses gw.acc.iplm.testutils.ECFMessageUtil

class DocumentSearchRqMessageIdentifierTest extends BaseTestMessageIdentifier {

  override function beforeMethod() {
    super.prepareTest()
        .forMessageIdentifier(new DocumentSearchRqMessageIdentifier())
        .withXmlContent(ECFMessageUtil.createNewDocumentSearchRq())
        .withExpectedMessageType(LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRQ_EXT)
  }
}