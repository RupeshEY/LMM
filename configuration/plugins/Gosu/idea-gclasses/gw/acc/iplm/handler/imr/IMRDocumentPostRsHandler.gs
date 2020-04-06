package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.imr.IMRDocumentPostRsService

class IMRDocumentPostRsHandler extends AbstractBaseHandler<ECFMessageDocumentPostRs_Ext> {
  construct() {
    super(new IMRDocumentPostRsService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTPOSTRS_EXT
  }
}