package gw.acc.iplm.handler.lloyds

uses gw.acc.iplm.handler.AbstractBaseHandler
uses gw.acc.iplm.services.message.lloyds.SyndicateClaimMessageService

class SyndicateClaimMessageHandler extends AbstractBaseHandler<LMMessageLloydsSCM_Ext> {

  construct() {
    super(new SyndicateClaimMessageService())
  }

  override function canHandle(messageType: typekey.LMMessage_Ext): boolean {
    return messageType == typekey.LMMessage_Ext.TC_LMMESSAGELLOYDSSCM_EXT
  }
}