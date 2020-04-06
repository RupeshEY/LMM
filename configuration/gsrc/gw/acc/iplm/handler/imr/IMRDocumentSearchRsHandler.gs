package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.imr.IMRDocumentSearchRsService

class IMRDocumentSearchRsHandler extends AbstractBaseHandler<ECFMessageDocumentSearchRs_Ext> {

  construct() {
    super(new IMRDocumentSearchRsService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRS_EXT
  }
}