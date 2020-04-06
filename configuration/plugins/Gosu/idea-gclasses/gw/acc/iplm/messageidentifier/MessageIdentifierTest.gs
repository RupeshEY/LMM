package gw.acc.iplm.messageidentifier

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.testharness.v3.GUnitTestClass

class MessageIdentifierTest extends GUnitTestClass {

  var _messageIdentifier : MessageIdentifier

  override function beforeMethod() {
    super.beforeMethod()
    _messageIdentifier = new MessageIdentifier()
  }

  function testIdentifyMessageClaimNotifyRq() {
    var message = ECFMessageUtil.createNewClaimNotifyRq()
    var expectedMessageType = LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageClaimResponseRq() {
    var message = ECFMessageUtil.createNewClaimResponseRq()
    var expectedMessageType = LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRESPONSERQ_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageClaimResponseRs() {
    var message = ECFMessageUtil.createNewClaimResponseRs()
    var expectedMessageType = LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRESPONSERS_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageClaimRetrieveRq() {
    var message = ECFMessageUtil.createNewClaimRetrieveRq()
    var expectedMessageType = LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRETRIEVERQ_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageClaimRetrieveRs() {
    var message = ECFMessageUtil.createNewClaimRetrieveRs()
    var expectedMessageType = LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRETRIEVERS_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageDocumentDownloadRq() {
    var message = ECFMessageUtil.createNewDocumentDownloadRq()
    var expectedMessageType = LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRQ_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageDocumentDownloadRs() {
    var message = ECFMessageUtil.createNewDocumentDownloadRs()
    var expectedMessageType = LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRS_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageDocumentUploadRq() {
    var message = ECFMessageUtil.createNewDocumentUploadRq()
    var expectedMessageType = LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRQ_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageDocumentUploadRs() {
    var message = ECFMessageUtil.createNewDocumentUploadRs()
    var expectedMessageType = LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRS_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageDocumentSearchRq() {
    var message = ECFMessageUtil.createNewDocumentSearchRq()
    var expectedMessageType = LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRQ_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageDocumentSearchRs() {
    var message = ECFMessageUtil.createNewDocumentSearchRs()
    var expectedMessageType = LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRS_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageLloydsSCM() {
    var message = ECFMessageUtil.createNewLloydsSyndicateClaimMessage()
    var expectedMessageType = LMMessageTypeString_Ext.TC_LMMESSAGELLOYDSSCM_EXT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyDocumentDownloadReceipt() {
    var message = ECFMessageUtil.createNewPostRs()
    message.MsgItems.MsgItem.first().MsgTypeCd = ECFMessageConstants.DocumentDownloadType
    var expectedMessageType = LMMessageTypeString_Ext.TC_REPOSITORYDOWNLOADRECEIPT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyDocumentUploadReceipt() {
    var message = ECFMessageUtil.createNewPostRs()
    message.MsgItems.MsgItem.first().MsgTypeCd = ECFMessageConstants.DocumentUploadType
    var expectedMessageType = LMMessageTypeString_Ext.TC_REPOSITORYUPLOADRECEIPT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyDocumentSearchReceipt() {
    var message = ECFMessageUtil.createNewPostRs()
    message.MsgItems.MsgItem.first().MsgTypeCd = ECFMessageConstants.DocumentSearchType
    var expectedMessageType = LMMessageTypeString_Ext.TC_REPOSITORYSEARCHRECEIPT

    assertEquals(expectedMessageType, _messageIdentifier.identifyMessageType(message))
  }

  function testIdentifyMessageUnsupportedMessage() {
    var message = ECFMessageUtil.createNewClaimNotifyRs()

    AssertUtils.assertCausesECFExceptionWithType(\-> _messageIdentifier.identifyMessageType(message), ECFErrorCodeType.ILLEGAL_MESSAGE_TYPE_ERROR)
  }
}