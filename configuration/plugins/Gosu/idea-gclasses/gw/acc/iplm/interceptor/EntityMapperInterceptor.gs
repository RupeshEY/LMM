package gw.acc.iplm.interceptor

uses entity.LMMessage_Ext
uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.api.locale.DisplayKey
uses gw.xml.XmlElement

uses javax.xml.soap.SOAPMessage

/**
 * This class is the interceptor for logging messages in the database that come from the ECF system.
 */
class EntityMapperInterceptor {

  private var _entityMapperService = new EntityMapperService()

  /**
   * This function logs the content of a London Market message to the database
   * and returns the new Entity.
   *
   * @param messageContent The message content to log
   * @return LMMessage_Ext
   */
  public function logMessage(messageContent: XmlElement): LMMessage_Ext {
    var lmMessage: LMMessage_Ext
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      lmMessage = _entityMapperService.createEntity(messageContent)
    }, ECFConstants.ECF_SUPER_USER)
    return lmMessage
  }

  /**
   * This function logs the content of a SOAPMessage to the database
   * and returns the new Entity. It throws Exception in case of unsupported message.
   * The full SOAPMessage must be passed in so that any attachments to the message can also be logged.
   *
   * @param soapMessage The SOAPMessage to log
   * @return LMMessage_Ext
   * @throws Exception in case of unsupported message.
   */
  public function logMessage(soapMessage: SOAPMessage): LMMessage_Ext {
    if (ECFUtils.isExpectedIMRMessage(soapMessage)) {
      var lmMessage: LMMessage_Ext
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        lmMessage = _entityMapperService.createEntity(soapMessage)
      }, ECFConstants.ECF_SUPER_USER)
      return lmMessage
    }
    throw new Exception(DisplayKey.get("Accelerator.IPLM.Exception.UnexpectedMessage"))
  }

}