package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/DeleteReserveSetDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DeleteReserveSetDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/DeleteReserveSetDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteReserveSetDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at DeleteReserveSetDV.pcf: line 15, column 97
    function def_onEnter_0 (def :  pcf.ReserveSetLV) : void {
      def.onEnter((TransactionSet as ReserveSet).Reserves)
    }
    
    // 'def' attribute on InputSetRef at DeleteReserveSetDV.pcf: line 20, column 62
    function def_onEnter_2 (def :  pcf.TransactionSetSummaryInputSet) : void {
      def.onEnter(TransactionSet)
    }
    
    // 'def' attribute on ListViewInput at DeleteReserveSetDV.pcf: line 15, column 97
    function def_refreshVariables_1 (def :  pcf.ReserveSetLV) : void {
      def.refreshVariables((TransactionSet as ReserveSet).Reserves)
    }
    
    // 'def' attribute on InputSetRef at DeleteReserveSetDV.pcf: line 20, column 62
    function def_refreshVariables_3 (def :  pcf.TransactionSetSummaryInputSet) : void {
      def.refreshVariables(TransactionSet)
    }
    
    property get TransactionSet () : TransactionSet {
      return getRequireValue("TransactionSet", 0) as TransactionSet
    }
    
    property set TransactionSet ($arg :  TransactionSet) {
      setRequireValue("TransactionSet", 0, $arg)
    }
    
    
  }
  
  
}