package gw.acc.iplm.xmlmapper.repositoryoperation

uses gw.acc.iplm.utils.ACORDMessageConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.utils.SOAPMessageConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.enums.RepositoryOperationTypeCdType
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Attachment
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.AttachmentPackage
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.AttachmentPackages
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.Attachments
uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRq
uses gw.xml.date.XmlDateTime

/**
 * Mapping from RepositoryOperationRq to PostRq for any request to IMR
 */
class PostRqMapper {

  protected var _repositoryOperation: RepositoryOperationRq
  protected var _postRq: PostRq

  /**
   *
   * @param repositoryOperation the RepositoryOperationRq to map from
   */
  construct(repositoryOperation: RepositoryOperationRq) {
    _repositoryOperation = repositoryOperation
    _postRq = new PostRq()
  }

  public function createPostRq(): PostRq {
    addSender()
    addReceiver()
    addApplication()
    addTimeStamp()
    addMsgItem()
    addWorkFolder()
    addAttachmentPackage()
    return _postRq
  }

  private function addSender() {
    _postRq.Sender.PartyId = _repositoryOperation.Sender.PartyId
    _postRq.Sender.PartyRoleCd = _repositoryOperation.Sender.PartyRoleCd
    _postRq.Sender.PartyName = _repositoryOperation.Sender.PartyName
  }

  private function addReceiver() {
    _postRq.Receiver.PartyId = _repositoryOperation.Receiver.PartyId
    _postRq.Receiver.PartyRoleCd = _repositoryOperation.Receiver.PartyRoleCd
    _postRq.Receiver.PartyName = _repositoryOperation.Receiver.PartyName
  }

  private function addTimeStamp() {
    _postRq.TimeStamp = new XmlDateTime(_repositoryOperation.CreationDtTime)
  }

  private function addMsgItem() {
    _postRq.MsgItem.MsgId = _repositoryOperation.MsgId
    _postRq.MsgItem.MsgTypeCd = ECFMessageConstants.POSTRQ_MESSAGE_TYPE
  }

  private function addApplication() {
    _postRq.Application.ApplicationCd = ACORDMessageConstants.ACORD_APPLICATION_TYPE
    _postRq.Application.SchemaVersion = ACORDMessageConstants.ACORD_SCHEMA_VERSION
  }

  private function addWorkFolder() {
    _postRq.WorkFolder.MsgFile.FileId = ECFMessageConstants.CID + UUID.randomUUID().toString()
    _postRq.WorkFolder.MsgFile.FileFormatCd = SOAPMessageConstants.ATTACHMENT_CONTENT_TYPE_TEXT_XML
  }

  private function addAttachmentPackage() {
    if (_repositoryOperation.RepositoryOperationTypeCd != RepositoryOperationTypeCdType.RepositoryUpload) {
      return
    }
    _postRq.WorkFolder.AttachmentPackages = new AttachmentPackages()
    _postRq.WorkFolder.AttachmentPackages.AttachmentPackage.add(new AttachmentPackage())

    var attachmentPackage = _postRq.WorkFolder.AttachmentPackages.AttachmentPackage.first()
    attachmentPackage.CommunicationChannelCd = SOAPMessageConstants.ATTACHMENT_COMMUNICATION_CHANNEL
    attachmentPackage.FileId = ECFMessageConstants.CID + _repositoryOperation.DocumentList.first().DocumentItem.first().Document.FileId
    attachmentPackage.Attachments = new Attachments()
    attachmentPackage.Attachments.Attachment.add(new Attachment())
    attachmentPackage.Attachments.Attachment.first().Document.DocumentId = _repositoryOperation.DocumentList.first().DocumentItem.first().Document.DocumentId
  }
}