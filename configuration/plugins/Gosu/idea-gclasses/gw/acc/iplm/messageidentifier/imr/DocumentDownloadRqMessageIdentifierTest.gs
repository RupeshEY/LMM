package gw.acc.iplm.messageidentifier.imr

uses gw.acc.iplm.messageidentifier.BaseTestMessageIdentifier
uses gw.acc.iplm.testutils.ECFMessageUtil

class DocumentDownloadRqMessageIdentifierTest extends BaseTestMessageIdentifier {

  override function beforeMethod() {
    super.prepareTest()
        .forMessageIdentifier(new DocumentDownloadRqMessageIdentifier())
        .withXmlContent(ECFMessageUtil.createNewDocumentDownloadRq())
        .withExpectedMessageType(LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRQ_EXT)
  }
}