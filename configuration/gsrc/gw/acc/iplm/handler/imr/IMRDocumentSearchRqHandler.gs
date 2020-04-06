package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.imr.IMRDocumentSearchRqService

class IMRDocumentSearchRqHandler extends AbstractBaseHandler<ECFMessageDocumentSearchRq_Ext> {

  construct() {
    super(new IMRDocumentSearchRqService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRQ_EXT
  }
}