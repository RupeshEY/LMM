package gw.acc.iplm.messageidentifier.imr

uses gw.acc.iplm.messageidentifier.BaseTestMessageIdentifier
uses gw.acc.iplm.testutils.ECFMessageUtil

class DocumentDownloadRsMessageIdentifierTest extends BaseTestMessageIdentifier {

  override function beforeMethod() {
    super.prepareTest()
        .forMessageIdentifier(new DocumentDownloadRsMessageIdentifier())
        .withXmlContent(ECFMessageUtil.createNewDocumentDownloadRs())
        .withExpectedMessageType(LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRS_EXT)
  }
}