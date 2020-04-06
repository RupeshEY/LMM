package gw.acc.iplm.entitymapper

uses entity.LMMessage_Ext
uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.ecfwb.claimnotify.ClaimNotifyRqEntityMapper
uses gw.acc.iplm.entitymapper.ecfwb.claimresponse.ClaimResponseRsEntityMapper
uses gw.acc.iplm.entitymapper.ecfwb.claimretrieve.ClaimRetrieveRsEntityMapper
uses gw.acc.iplm.entitymapper.imr.DocumentPostRsEntityMapper
uses gw.acc.iplm.entitymapper.imr.docdownload.DocumentDownloadRsEntityMapper
uses gw.acc.iplm.entitymapper.imr.docsearch.DocumentSearchRsEntityMapper
uses gw.acc.iplm.entitymapper.imr.docupload.DocumentUploadRsEntityMapper
uses gw.acc.iplm.entitymapper.lloyds.SyndicateClaimMessageEntityMapper

/**
 * It is a context class for strategy pattern, which holds all information for different types of available entity mappers.
 * It is used by client classes to find correct mapper for the right type of message.
 */
class LMMessageMapperContext {

  private var _message: LMMessageMapperAbstract

  public final static var LMMessageMapperHashMap: HashMap<LMMessageTypeString_Ext, LMMessageMapperAbstract> = new HashMap<LMMessageTypeString_Ext, LMMessageMapperAbstract>() {
      LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT->new ClaimNotifyRqEntityMapper(),

      LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRESPONSERS_EXT->new ClaimResponseRsEntityMapper(),

      LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRETRIEVERS_EXT->new ClaimRetrieveRsEntityMapper(),

      LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRS_EXT->new DocumentSearchRsEntityMapper(),
      LMMessageTypeString_Ext.TC_REPOSITORYSEARCHRECEIPT->new DocumentPostRsEntityMapper(),

      LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRS_EXT->new DocumentDownloadRsEntityMapper(),
      LMMessageTypeString_Ext.TC_REPOSITORYDOWNLOADRECEIPT->new DocumentPostRsEntityMapper(),

      LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRS_EXT->new DocumentUploadRsEntityMapper(),
      LMMessageTypeString_Ext.TC_REPOSITORYUPLOADRECEIPT->new DocumentPostRsEntityMapper(),

      LMMessageTypeString_Ext.TC_LMMESSAGELLOYDSSCM_EXT->new SyndicateClaimMessageEntityMapper()
  }

  construct(messageKey: LMMessageTypeString_Ext) {
    _message = LMMessageMapperHashMap.get(messageKey)
  }

  /**
   * This method create a new entity for particular message type.
   * Also call parent class to update common mapping between all message types
   *
   * @param messageDTO
   * @return
   */
  public function getAppropriateEntity(messageDTO: LMMessageDTO): LMMessage_Ext {
    var messageEntity = _message?.createNewLMMessage(messageDTO)
    if (messageEntity != null) {
      _message.initalizeCommonMapping(messageEntity, messageDTO.XMLPayLoad)
    }
    return messageEntity
  }
}