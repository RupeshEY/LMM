package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.imr.IMRDocumentDownloadRsService

class IMRDocumentDownloadRsHandler extends AbstractBaseHandler<ECFMessageDocumentDownloadRs_Ext> {

  construct() {
    super(new IMRDocumentDownloadRsService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRS_EXT
  }
}