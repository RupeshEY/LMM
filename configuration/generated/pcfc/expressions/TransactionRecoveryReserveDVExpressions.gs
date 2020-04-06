package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionRecoveryReserveDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionRecoveryReserveDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionRecoveryReserveDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionRecoveryReserveDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryReserveDV.pcf: line 13, column 63
    function def_onEnter_0 (def :  pcf.RecoveryReserveBasicsInputSet) : void {
      def.onEnter(RecoveryReserve)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryReserveDV.pcf: line 17, column 61
    function def_onEnter_2 (def :  pcf.TransactionTrackingInputSet) : void {
      def.onEnter(RecoveryReserve)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryReserveDV.pcf: line 21, column 68
    function def_onEnter_4 (def :  pcf.TransactionApprovalHistoryInputSet) : void {
      def.onEnter(RecoveryReserve)
    }
    
    // 'def' attribute on ListViewInput at TransactionRecoveryReserveDV.pcf: line 26, column 27
    function def_onEnter_6 (def :  pcf.RecoveryReserveSetLV) : void {
      def.onEnter((RecoveryReserve.TransactionSet typeis RecoveryReserveSet) ? RecoveryReserve.TransactionSet.RecoveryReserves : null)
    }
    
    // 'def' attribute on ListViewInput at TransactionRecoveryReserveDV.pcf: line 34, column 40
    function def_onEnter_9 (def :  pcf.UnmodifiableTransactionSetDocumentsLV) : void {
      def.onEnter(RecoveryReserve.TransactionSet.LinkedDocuments)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryReserveDV.pcf: line 13, column 63
    function def_refreshVariables_1 (def :  pcf.RecoveryReserveBasicsInputSet) : void {
      def.refreshVariables(RecoveryReserve)
    }
    
    // 'def' attribute on ListViewInput at TransactionRecoveryReserveDV.pcf: line 34, column 40
    function def_refreshVariables_10 (def :  pcf.UnmodifiableTransactionSetDocumentsLV) : void {
      def.refreshVariables(RecoveryReserve.TransactionSet.LinkedDocuments)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryReserveDV.pcf: line 17, column 61
    function def_refreshVariables_3 (def :  pcf.TransactionTrackingInputSet) : void {
      def.refreshVariables(RecoveryReserve)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryReserveDV.pcf: line 21, column 68
    function def_refreshVariables_5 (def :  pcf.TransactionApprovalHistoryInputSet) : void {
      def.refreshVariables(RecoveryReserve)
    }
    
    // 'def' attribute on ListViewInput at TransactionRecoveryReserveDV.pcf: line 26, column 27
    function def_refreshVariables_7 (def :  pcf.RecoveryReserveSetLV) : void {
      def.refreshVariables((RecoveryReserve.TransactionSet typeis RecoveryReserveSet) ? RecoveryReserve.TransactionSet.RecoveryReserves : null)
    }
    
    // 'visible' attribute on ListViewInput at TransactionRecoveryReserveDV.pcf: line 34, column 40
    function visible_8 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    property get RecoveryReserve () : RecoveryReserve {
      return getRequireValue("RecoveryReserve", 0) as RecoveryReserve
    }
    
    property set RecoveryReserve ($arg :  RecoveryReserve) {
      setRequireValue("RecoveryReserve", 0, $arg)
    }
    
    
  }
  
  
}