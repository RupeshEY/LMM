package gw.acc.iplm.entitymapper.imr

uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.interceptor.EntityMapperInterceptor
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRs
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.enums.MsgStatusCdType
uses gw.api.database.Query
uses gw.testharness.v3.GUnitTestClass

class DocumentPostRsEntityMapperTest extends GUnitTestClass {

  var _xmlContent: PostRs
  var _messageDTO: LMMessageDTO
  var _entityMapper : DocumentPostRsEntityMapper
  var _message: ECFMessageDocumentPostRs_Ext

  override function beforeMethod() {
    super.beforeMethod()
    _entityMapper = new DocumentPostRsEntityMapper()
    _xmlContent = ECFMessageUtil.createNewPostRs()

    createEntityForMessageType(ECFMessageConstants.DocumentDownloadType, LMMessageTypeString_Ext.TC_REPOSITORYDOWNLOADRECEIPT)
  }

  override function afterMethod(error: Throwable) {
    ECFMessageEntityUtil.deleteAllECFMessagesFromDB()
    deleteAllDocuments()
  }

  function testIsCorrectMessageType() {
    assertTrue(_entityMapper.isCorrectMessageType(_xmlContent))
  }

  function testIsCorrectMessageType_IncorrectMessage() {
    assertFalse(_entityMapper.isCorrectMessageType(ECFMessageUtil.createNewPostRq()))
  }

  function testSenderPartyId() {
    assertEquals(_xmlContent.Sender.PartyId, _message.SenderPartyId)
  }

  function testSenderPartyName() {
    assertEquals(_xmlContent.Sender.PartyName, _message.SenderPartyName)
  }

  function testSenderPartyRoleCd() {
    assertEquals(_xmlContent.Sender.PartyRoleCd, _message.SenderPartyRoleCd)
  }

  function testReceiverPartyId() {
    assertEquals(_xmlContent.Sender.PartyId, _message.SenderPartyId)
  }

  function testReceiverPartyName() {
    assertEquals(_xmlContent.Sender.PartyName, _message.SenderPartyName)
  }

  function testReceiverPartyRoleCd() {
    assertEquals(_xmlContent.Sender.PartyRoleCd, _message.SenderPartyRoleCd)
  }

  function testOriginTimestamp() {
    assertEquals(ECFUtils.parseFlexibleDateType(_xmlContent.TimeStamp.toString()), _message.OriginTimeStamp)
  }

  function testReferredUUID() {
    assertEquals(_xmlContent.MsgItems.MsgItem.first().MsgId, _message.ReferredUUID)
  }

  function testMessageType_DocumentDownload() {
    createEntityForMessageType(ECFMessageConstants.DocumentDownloadType, LMMessageTypeString_Ext.TC_REPOSITORYDOWNLOADRECEIPT)
    assertEquals(ECFMessageType_Ext.TC_REPOSITORYDOWNLOADRECEIPT, _message.MessageType)
  }

  function testMessageType_DocumentUpload() {
    createEntityForMessageType(ECFMessageConstants.DocumentUploadType, LMMessageTypeString_Ext.TC_REPOSITORYUPLOADRECEIPT)
    assertEquals(ECFMessageType_Ext.TC_REPOSITORYUPLOADRECEIPT, _message.MessageType)
  }

  function testMessageType_DocumentSearch() {
    createEntityForMessageType(ECFMessageConstants.DocumentSearchType, LMMessageTypeString_Ext.TC_REPOSITORYSEARCHRECEIPT)
    assertEquals(ECFMessageType_Ext.TC_REPOSITORYSEARCHRECEIPT, _message.MessageType)
  }

  function testMessageStatus_Received() {
    _xmlContent.MsgItems.MsgItem.first().MsgStatusCd = MsgStatusCdType.Received
    createEntityForMessageType(ECFMessageConstants.DocumentDownloadType, LMMessageTypeString_Ext.TC_REPOSITORYDOWNLOADRECEIPT)

    assertEquals(ECFDocumentMsgStatus_Ext.TC_RECEIVED, _message.OperationStatus)
  }

  function testClaim() {
      var downloadEntity = ECFMessageEntityUtil.createDocumentDownloadRq()

      var postRsXml = ECFMessageUtil.createNewPostRs()
      postRsXml.MsgItems.MsgItem.first().MsgId = downloadEntity.UUID

      var postRsEntity = new EntityMapperInterceptor().logMessage(postRsXml)

      assertEquals(downloadEntity.Claim, postRsEntity.Claim)
  }

  private function createEntityForMessageType(xmlMessageType: String, messageTypeString: LMMessageTypeString_Ext) {
    _xmlContent.MsgItems.MsgItem.first().MsgTypeCd = xmlMessageType
    _messageDTO = new LMMessageDTO(messageTypeString, _xmlContent, null)

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _message = _entityMapper.createNewLMMessage(_messageDTO) as ECFMessageDocumentPostRs_Ext
    })
  }

  private function deleteAllDocuments() {
    var allDocs = Query.make(Document).select().toList()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      allDocs.each(\elt -> {
        bundle.delete(elt.Claim.Policy)
        bundle.delete(elt.Claim)
        bundle.delete(elt)
      })
    }, User.util.UnrestrictedUser)
  }
}