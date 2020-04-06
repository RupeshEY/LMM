package gw.acc.iplm.messageidentifier.imr

uses gw.acc.iplm.messageidentifier.BaseTestMessageIdentifier
uses gw.acc.iplm.testutils.ECFMessageUtil

class DocumentUploadRsMessageIdentifierTest extends BaseTestMessageIdentifier {

  override function beforeMethod() {
    super.prepareTest()
        .forMessageIdentifier(new DocumentUploadRsMessageIdentifier())
        .withXmlContent(ECFMessageUtil.createNewDocumentUploadRs())
        .withExpectedMessageType(LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRS_EXT)
  }
}