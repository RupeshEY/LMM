package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/DeleteReserveSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DeleteReserveSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/DeleteReserveSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteReserveSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Reserve :  Reserve) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=DeleteReserveSet_DeleteButton) at DeleteReserveSet.pcf: line 26, column 62
    function action_0 () : void {
      gw.api.financials.FinancialsUtil.deleteReserve(Reserve); gw.api.financials.ClaimFinancialsTransactionsOption.RESERVE.saveOption(Claim); ClaimFinancialsTransactions.go(Claim)
    }
    
    // 'action' attribute on ToolbarButton (id=DeleteReserveSet_CancelButton) at DeleteReserveSet.pcf: line 32, column 27
    function action_1 () : void {
      ClaimFinancialsTransactionsDetail.go(Claim, Reserve)
    }
    
    // 'action' attribute on ToolbarButton (id=DeleteReserveSet_CancelButton) at DeleteReserveSet.pcf: line 32, column 27
    function action_dest_2 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(Claim, Reserve)
    }
    
    // 'canVisit' attribute on Page (id=DeleteReserveSet) at DeleteReserveSet.pcf: line 11, column 76
    static function canVisit_5 (Claim :  Claim, Reserve :  Reserve) : java.lang.Boolean {
      return perm.Reserve.delete(Reserve)
    }
    
    // 'def' attribute on PanelRef at DeleteReserveSet.pcf: line 37, column 59
    function def_onEnter_3 (def :  pcf.DeleteReserveSetDV) : void {
      def.onEnter(Reserve.TransactionSet)
    }
    
    // 'def' attribute on PanelRef at DeleteReserveSet.pcf: line 37, column 59
    function def_refreshVariables_4 (def :  pcf.DeleteReserveSetDV) : void {
      def.refreshVariables(Reserve.TransactionSet)
    }
    
    // 'parent' attribute on Page (id=DeleteReserveSet) at DeleteReserveSet.pcf: line 11, column 76
    static function parent_6 (Claim :  Claim, Reserve :  Reserve) : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactions.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.DeleteReserveSet {
      return super.CurrentLocation as pcf.DeleteReserveSet
    }
    
    property get Reserve () : Reserve {
      return getVariableValue("Reserve", 0) as Reserve
    }
    
    property set Reserve ($arg :  Reserve) {
      setVariableValue("Reserve", 0, $arg)
    }
    
    
  }
  
  
}