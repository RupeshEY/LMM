package gw.acc.iplm.entitymapper

uses gw.acc.iplm.dao.impl.ClaimDAO
uses gw.acc.iplm.utils.ECFConstants
uses gw.xml.XmlElement
uses entity.LMMessage_Ext
uses org.slf4j.Logger

/**
 * A super abstract class for all mapper classes.
 */
abstract class LMMessageMapperAbstract implements LMMessageMapper {
  protected static final var LOGGER: Logger = ECFConstants.LOGGER_BLOCK()
  protected var _claimDAO: ClaimDAO

  construct() {
    _claimDAO = new ClaimDAO()
  }

  protected function initalizeCommonMapping(newLMMessage: LMMessage_Ext, xmlPayloadObject: XmlElement){
    newLMMessage.Content = new Blob(xmlPayloadObject.asUTFString().Bytes)
    newLMMessage.Status = ECFMessageStatus_Ext.TC_PENDING
    newLMMessage.Suspended = false
    if (newLMMessage.UCR != null) {
      newLMMessage.Claim = _claimDAO.findClaim(newLMMessage.UCR)
    }
  }
}