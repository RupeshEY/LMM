package gw.acc.iplm.enhancements.entity

enhancement ECFMessageClaimNotifyRq_ExtMessageStateEnhancement: ECFMessageClaimNotifyRq_Ext {

  property get isMessageStateAwaiting(): boolean {
    return this.MessageState == ECFClaimMessageState_Ext.TC_AWAITINGRESPONSE
  }
}
