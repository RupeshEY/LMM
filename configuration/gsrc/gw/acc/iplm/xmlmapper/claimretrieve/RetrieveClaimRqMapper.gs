package gw.acc.iplm.xmlmapper.claimretrieve

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq

/**
 * Mapping from ECFMessageClaimRetrieveRq_Ext to RetrieveClaimRq for Claim retrieve request to CLASS
 */
class RetrieveClaimRqMapper {

  protected var _entity: ECFMessageClaimRetrieveRq_Ext
  protected var _xml: RetrieveClaimRq

  construct(entity: ECFMessageClaimRetrieveRq_Ext) {
    _entity = entity
    _xml = new RetrieveClaimRq()
  }

  /**
   * Creates the RetrieveClaimRq XML using the entity passed into the constructor
   *
   * @return the mapped RetrieveClaimRq object
   */
  public function createRetrieveClaimRq(): RetrieveClaimRq {
    addSender()
    addReceiver()
    addMsgId()
    addCreationDtTime()
    addInsurer()
    addServiceProvider()
    addReferredObjects()
    addContentToEntity()
    return _xml
  }

  private function addSender() {
    _xml.Sender = _entity.SenderPartyRoleCd
  }

  private function addReceiver() {
    _xml.Receiver = _entity.ReceiverPartyRoleCd
  }

  private function addMsgId() {
    _xml.UUId = _entity.UUID
  }

  private function addCreationDtTime() {
    _xml.CreationDate = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().format(_entity.OriginTimeStamp)
  }

  private function addInsurer() {
    _xml.Insurer.Party.FirstId = _entity.SenderPartyId
    _xml.Insurer.Party.Name = _entity.SenderPartyName
    _xml.Insurer.Party.FirstAgency = _entity.SenderPartyAgency
  }

  private function addServiceProvider() {
    _xml.ServiceProvider.Party.FirstId = _entity.ReceiverPartyId
    _xml.ServiceProvider.Party.Name = _entity.ReceiverPartyName
    _xml.ServiceProvider.Party.FirstAgency = _entity.ReceiverPartyAgency
  }

  protected function addReferredObjects() {
    _xml.ReferredObjects.Contract.BrokerReference = _entity.UMR
    _xml.ReferredObjects.Claim.BrokerReference = _entity.UCR
    _xml.ReferredObjects.Claim.ClaimLineNumber = _entity.ClaimLineNumber
    _xml.ReferredObjects.Claim.ClaimType = _entity.ClaimType.Code
    _xml.ReferredObjects.ClaimEntry.BrokerReference = _entity.TR
  }

  protected function addContentToEntity() {
    _entity.Content = new Blob(_xml.asUTFString().Bytes)
  }
}