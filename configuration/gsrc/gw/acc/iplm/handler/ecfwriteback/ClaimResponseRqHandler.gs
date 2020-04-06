package gw.acc.iplm.handler.ecfwriteback

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.ecfwriteback.ClaimResponseRqService

class ClaimResponseRqHandler extends AbstractBaseHandler<ECFMessageClaimResponseRq_Ext> {

  construct() {
    super(new ClaimResponseRqService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_ECFMESSAGECLAIMRESPONSERQ_EXT
  }
}