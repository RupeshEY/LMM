package gw.acc.iplm.handler.ecfwriteback

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.ecfwriteback.ClaimRetrieveRsService

class ClaimRetrieveRsHandler extends AbstractBaseHandler<ECFMessageClaimRetrieveRs_Ext> {

  construct() {
    super(new ClaimRetrieveRsService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGECLAIMRETRIEVERS_EXT
  }
}