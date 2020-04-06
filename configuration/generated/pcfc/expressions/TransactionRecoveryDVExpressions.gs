package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionRecoveryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TransactionRecoveryDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/TransactionRecoveryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionRecoveryDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryDV.pcf: line 13, column 49
    function def_onEnter_0 (def :  pcf.RecoveryBasicsInputSet) : void {
      def.onEnter(Recovery)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryDV.pcf: line 17, column 54
    function def_onEnter_2 (def :  pcf.TransactionTrackingInputSet) : void {
      def.onEnter(Recovery)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryDV.pcf: line 21, column 61
    function def_onEnter_4 (def :  pcf.TransactionApprovalHistoryInputSet) : void {
      def.onEnter(Recovery)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryDV.pcf: line 13, column 49
    function def_refreshVariables_1 (def :  pcf.RecoveryBasicsInputSet) : void {
      def.refreshVariables(Recovery)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryDV.pcf: line 17, column 54
    function def_refreshVariables_3 (def :  pcf.TransactionTrackingInputSet) : void {
      def.refreshVariables(Recovery)
    }
    
    // 'def' attribute on InputSetRef at TransactionRecoveryDV.pcf: line 21, column 61
    function def_refreshVariables_5 (def :  pcf.TransactionApprovalHistoryInputSet) : void {
      def.refreshVariables(Recovery)
    }
    
    property get Recovery () : Recovery {
      return getRequireValue("Recovery", 0) as Recovery
    }
    
    property set Recovery ($arg :  Recovery) {
      setRequireValue("Recovery", 0, $arg)
    }
    
    
  }
  
  
}