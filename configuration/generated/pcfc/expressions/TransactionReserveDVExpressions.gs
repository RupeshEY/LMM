package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionReserveDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionReserveDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionReserveDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionReserveDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at TransactionReserveDV.pcf: line 13, column 51
    function def_onEnter_0 (def :  pcf.TransactionBasicsInputSet) : void {
      def.onEnter(Reserve)
    }
    
    // 'def' attribute on InputSetRef at TransactionReserveDV.pcf: line 17, column 53
    function def_onEnter_2 (def :  pcf.TransactionTrackingInputSet) : void {
      def.onEnter(Reserve)
    }
    
    // 'def' attribute on InputSetRef at TransactionReserveDV.pcf: line 21, column 60
    function def_onEnter_4 (def :  pcf.TransactionApprovalHistoryInputSet) : void {
      def.onEnter(Reserve)
    }
    
    // 'def' attribute on ListViewInput at TransactionReserveDV.pcf: line 26, column 27
    function def_onEnter_6 (def :  pcf.ReserveSetLV) : void {
      def.onEnter(gw.api.financials.FinancialsUtil.getReservesFromTransactionSet(Reserve.TransactionSet))
    }
    
    // 'def' attribute on ListViewInput at TransactionReserveDV.pcf: line 34, column 40
    function def_onEnter_9 (def :  pcf.UnmodifiableTransactionSetDocumentsLV) : void {
      def.onEnter(Reserve.TransactionSet.LinkedDocuments)
    }
    
    // 'def' attribute on InputSetRef at TransactionReserveDV.pcf: line 13, column 51
    function def_refreshVariables_1 (def :  pcf.TransactionBasicsInputSet) : void {
      def.refreshVariables(Reserve)
    }
    
    // 'def' attribute on ListViewInput at TransactionReserveDV.pcf: line 34, column 40
    function def_refreshVariables_10 (def :  pcf.UnmodifiableTransactionSetDocumentsLV) : void {
      def.refreshVariables(Reserve.TransactionSet.LinkedDocuments)
    }
    
    // 'def' attribute on InputSetRef at TransactionReserveDV.pcf: line 17, column 53
    function def_refreshVariables_3 (def :  pcf.TransactionTrackingInputSet) : void {
      def.refreshVariables(Reserve)
    }
    
    // 'def' attribute on InputSetRef at TransactionReserveDV.pcf: line 21, column 60
    function def_refreshVariables_5 (def :  pcf.TransactionApprovalHistoryInputSet) : void {
      def.refreshVariables(Reserve)
    }
    
    // 'def' attribute on ListViewInput at TransactionReserveDV.pcf: line 26, column 27
    function def_refreshVariables_7 (def :  pcf.ReserveSetLV) : void {
      def.refreshVariables(gw.api.financials.FinancialsUtil.getReservesFromTransactionSet(Reserve.TransactionSet))
    }
    
    // 'visible' attribute on ListViewInput at TransactionReserveDV.pcf: line 34, column 40
    function visible_8 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    property get Reserve () : Reserve {
      return getRequireValue("Reserve", 0) as Reserve
    }
    
    property set Reserve ($arg :  Reserve) {
      setRequireValue("Reserve", 0, $arg)
    }
    
    
  }
  
  
}