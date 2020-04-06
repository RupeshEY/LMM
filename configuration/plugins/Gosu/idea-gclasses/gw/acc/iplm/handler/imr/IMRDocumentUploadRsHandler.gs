package gw.acc.iplm.handler.imr

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.imr.IMRDocumentUploadRsService

class IMRDocumentUploadRsHandler extends AbstractBaseHandler<ECFMessageDocumentUploadRs_Ext> {

  construct() {
    super(new IMRDocumentUploadRsService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRS_EXT
  }
}