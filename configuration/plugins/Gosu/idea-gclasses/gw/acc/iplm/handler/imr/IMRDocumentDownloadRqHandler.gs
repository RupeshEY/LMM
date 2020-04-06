package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.imr.IMRDocumentDownloadRqService

class IMRDocumentDownloadRqHandler extends AbstractBaseHandler<ECFMessageDocumentDownloadRq_Ext> {

  construct() {
    super(new IMRDocumentDownloadRqService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRQ_EXT
  }
}