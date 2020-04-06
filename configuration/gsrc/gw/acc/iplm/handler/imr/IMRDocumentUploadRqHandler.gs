package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.imr.IMRDocumentUploadRqService

class IMRDocumentUploadRqHandler extends AbstractBaseHandler<ECFMessageDocumentUploadRq_Ext> {

  construct() {
    super(new IMRDocumentUploadRqService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRQ_EXT
  }
}