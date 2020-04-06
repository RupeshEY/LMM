package gw.acc.iplm.xmlmapper.repositoryoperation

uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.testharness.v3.GUnitTestClass

class PostRqMapperTest extends GUnitTestClass {

  private static var _mapper: PostRqMapper
  private static var _repositoryOperation: RepositoryOperationRq

  function beforeMethod() {
    super.beforeMethod()
    _repositoryOperation = ECFMessageUtil.createNewDocumentSearchRq()
    _mapper = new PostRqMapper(_repositoryOperation)
  }

  function testRepositoryOperationRqObjectCreated() {
    var result = _mapper.createPostRq()
    assertNotNull("PostRq not created", result)
  }

  function testSenderAddedToPostRq() {
    var result = _mapper.createPostRq()
    assertNotNull("No Sender in the XML object", result.Sender)
    assertEquals(_repositoryOperation.Sender.PartyId, result.Sender.PartyId)
    assertEquals(_repositoryOperation.Sender.PartyRoleCd, result.Sender.PartyRoleCd)
    assertEquals(_repositoryOperation.Sender.PartyName, result.Sender.PartyName)
  }

  function testreceiverAddedToPostRq() {
    var result = _mapper.createPostRq()
    assertNotNull("No Receiver in the XML object", result.Receiver)
    assertEquals(_repositoryOperation.Receiver.PartyId, result.Receiver.PartyId)
    assertEquals(_repositoryOperation.Receiver.PartyRoleCd, result.Receiver.PartyRoleCd)
    assertEquals(_repositoryOperation.Receiver.PartyName, result.Receiver.PartyName)
  }

  function testApplicationAddedToPostRq() {
    var result = _mapper.createPostRq()
    assertNotNull(result.Application)
    assertEquals("ACORD-Repository", result.Application.ApplicationCd)
    assertEquals("http://www.ACORD.org/standards/Jv-Ins-Reinsurance/2005-2", result.Application.SchemaVersion)
  }

  function testTimeStampAddedToPostRq() {
    var result = _mapper.createPostRq()
    assertNotNull("No TimeStamp in XML Object", result.TimeStamp)
    assertEquals(_repositoryOperation.CreationDtTime, result.TimeStamp.toString())
  }

  function testMsgItemAddedToPostRq() {
    var result = _mapper.createPostRq()
    assertNotNull("No MsgItem in XML Object", result.MsgItem)
    assertEquals(_repositoryOperation.MsgId, result.MsgItem.MsgId)
    assertEquals("RepositoryOperationRq", result.MsgItem.MsgTypeCd)
  }

  function testWorkFolderAddedToPostRq() {
    var result = _mapper.createPostRq()
    assertNotNull("No WorkFolder in XML Object", result.WorkFolder)
    assertNotNull("No MsgFile in XML Object", result.WorkFolder.MsgFile)
    assertEquals("FileId is not the correct length", 40, result.WorkFolder.MsgFile.FileId.length)
    assertEquals("FileId is missing cid prefix","cid:", result.WorkFolder.MsgFile.FileId.substring(0,4))
    assertEquals("text/xml", result.WorkFolder.MsgFile.FileFormatCd)
  }

  function testAttachmentPackagesAddedToPostRqForUpload(){
    _repositoryOperation = ECFMessageUtil.createNewDocumentUploadRq()
    _mapper = new PostRqMapper(_repositoryOperation)
    var result = _mapper.createPostRq()

    assertNotNull("No AttachmentPackages in XML Object", result.WorkFolder.AttachmentPackages)
    assertNotNull("No AttachmentPackages in XML Object", result.WorkFolder.AttachmentPackages.AttachmentPackage)
    assertEquals(1, result.WorkFolder.AttachmentPackages.AttachmentPackage.size())
    assertEquals("in_stream", result.WorkFolder.AttachmentPackages.AttachmentPackage.first().CommunicationChannelCd)
    assertEquals(_repositoryOperation.DocumentList.first().DocumentItem.first().Document.FileId, result.WorkFolder.AttachmentPackages.AttachmentPackage.first().FileId.substring(4))
    assertEquals("FileId is missing cid prefix","cid:", result.WorkFolder.AttachmentPackages.AttachmentPackage.first().FileId.substring(0,4))

    assertNotNull("No Attachments in XML Object", result.WorkFolder.AttachmentPackages.AttachmentPackage.first().Attachments)
    assertNotNull("No Attachment in XML Object", result.WorkFolder.AttachmentPackages.AttachmentPackage.first().Attachments.Attachment)
    assertNotNull("No Document in XML Object", result.WorkFolder.AttachmentPackages.AttachmentPackage.first().Attachments.Attachment.first().Document)
    assertEquals(_repositoryOperation.DocumentList.first().DocumentItem.first().Document.DocumentId, result.WorkFolder.AttachmentPackages.AttachmentPackage.first().Attachments.Attachment.first().Document.DocumentId)
  }
}