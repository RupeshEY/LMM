package gw.acc.iplm.xmlmapper.repositoryoperation

uses gw.acc.iplm.utils.ACORDMessageConstants
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentItem
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentList
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq

/**
 * Base class for mapping RepositoryOperationRq XML for any RepositoryOperation request to IMR
 * @param <T> an entity with super type ECFDocumentMessage_Ext
 */
abstract class RepositoryOperationRqMapper<T extends ECFDocumentMessage_Ext> {

  protected var _entity : T
  protected var _xml : RepositoryOperationRq
  protected var _documentItem : DocumentItem

  construct(entity: T){
    _entity = entity
    _xml = new RepositoryOperationRq()
  }

  /**
   * Creates the RepositoryOperationRq XML using the entity passed into the constructor
   * @return the mapped RepositoryOperationRq object
   */
  public function createRepositoryOperationRq(): RepositoryOperationRq {
    addMsgId()
    addCreationDtTime()
    addRepositoryOperationTypeCd()
    addApplication()
    addSender()
    addReceiver()
    initialiseDocumentList()
    addDocumentItemDetails()
    addOperationSpecificContent()
    addContentToEntity()
    return _xml
  }

  protected abstract function addRepositoryOperationTypeCd()

  protected abstract function addDocumentItemDetails()

  protected abstract function addOperationSpecificContent()

  private function addMsgId(){
    _xml.MsgId = _entity.UUID
  }

  private function addCreationDtTime(){
    _xml.CreationDtTime = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().format(_entity.OriginTimeStamp)
  }

  private function addApplication(){
    _xml.Application.ApplicationCd = ECFMessageConstants.APPLICATION_CD
    _xml.Application.SchemaVersion = ACORDMessageConstants.ACORD_SCHEMA_VERSION
  }

  private function addSender(){
    _xml.Sender.PartyId = _entity.SenderPartyId
    _xml.Sender.PartyName = _entity.SenderPartyName
    _xml.Sender.PartyRoleCd = _entity.SenderPartyRoleCd?.capitalize()?:ECFMessageConstants.INSURER_ROLE
  }

  private function addReceiver(){
    _xml.Receiver.PartyId = _entity.ReceiverPartyId
    _xml.Receiver.PartyName = _entity.ReceiverPartyName
    _xml.Receiver.PartyRoleCd = ECFMessageConstants.SERVICEPROVIDER_ROLE
  }

  private function initialiseDocumentList(){
    _xml.DocumentList.add(new DocumentList())
    _xml.DocumentList.first().HierarchySortIndicator = false
    _xml.DocumentList.first().DocumentItem.add(new DocumentItem())
    _documentItem = _xml.DocumentList.first().DocumentItem.first()
  }

  private function addContentToEntity(){
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      _entity = bundle.add(_entity)
      _entity.Content = new Blob(_xml.bytes())
    }, ECFConstants.ECF_SUPER_USER)
  }
}