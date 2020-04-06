package gw.acc.iplm.respondrules

uses gw.acc.iplm.respondrules.ilu.IluTransactionStateRulesDispatcher
uses gw.acc.iplm.respondrules.lirma.LirmaTransactionStateRulesDispatcher
uses gw.acc.iplm.respondrules.lloyds.LloydsTransactionStateRulesDispatcher

class RespondRulesContext {

  //Map which shall hold the bureau type and the responsible dispatcher class for handling it.
  public final static var CN_STATE_RULES_DISPATCHER_MAP: HashMap<ECFBureauType_Ext, TransactionStateRulesDispatcher> = new HashMap<ECFBureauType_Ext, TransactionStateRulesDispatcher>(){
      ECFBureauType_Ext.TC_LLOYDS->new LloydsTransactionStateRulesDispatcher(),
      ECFBureauType_Ext.TC_ILU->new IluTransactionStateRulesDispatcher(),
      ECFBureauType_Ext.TC_LIRMA->new LirmaTransactionStateRulesDispatcher()
  }

  /**
   * This method will call the correct update TransactionState function according to the dispatcher for the bureau.
   *
   * @param ecfMessage ECFMessageClaimData_Ext
   */
  public static function updateState(ecfMessage: ECFMessageClaimData_Ext) {
    switch (ecfMessage.MessageType) {
      case ECFMessageType_Ext.TC_CLAIMNOTIFY:
        CN_STATE_RULES_DISPATCHER_MAP.get(ecfMessage.BureauType)?.updateTransactionState(ecfMessage)
        break
      case ECFMessageType_Ext.TC_RETRIEVECLAIM:
        new ClaimRetrieveTransactionStateRulesDispatcher().updateTransactionState(ecfMessage)
        break
    }
  }
}