package gw.acc.iplm.handler.ecfwriteback

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.ecfwriteback.ClaimResponseRsService

class ClaimResponseRsHandler extends AbstractBaseHandler<ECFMessageClaimResponseRs_Ext> {

  construct() {
    super(new ClaimResponseRsService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGECLAIMRESPONSERS_EXT
  }
}