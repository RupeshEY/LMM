package gw.acc.iplm.messageidentifier.imr

uses gw.acc.iplm.messageidentifier.BaseTestMessageIdentifier
uses gw.acc.iplm.testutils.ECFMessageUtil

class DocumentUploadRqMessageIdentifierTest extends BaseTestMessageIdentifier {

  override function beforeMethod() {
    super.prepareTest()
        .forMessageIdentifier(new DocumentUploadRqMessageIdentifier())
        .withXmlContent(ECFMessageUtil.createNewDocumentUploadRq())
        .withExpectedMessageType(LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRQ_EXT)
  }
}