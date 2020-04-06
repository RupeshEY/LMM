package gw.acc.iplm.handler.ecfwriteback

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.ecfwriteback.ClaimRetrieveRqService

class ClaimRetrieveRqHandler extends AbstractBaseHandler<ECFMessageClaimRetrieveRq_Ext> {

  construct() {
    super(new ClaimRetrieveRqService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGECLAIMRETRIEVERQ_EXT
  }
}