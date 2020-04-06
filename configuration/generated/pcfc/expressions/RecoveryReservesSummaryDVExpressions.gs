package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/RecoveryReservesSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecoveryReservesSummaryDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/RecoveryReservesSummaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryReservesSummaryDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at RecoveryReservesSummaryDV.pcf: line 20, column 27
    function def_onEnter_0 (def :  pcf.EditableRecoveryReservesLV) : void {
      def.onEnter(NewRecoveryReserveSet)
    }
    
    // 'def' attribute on ListViewInput at RecoveryReservesSummaryDV.pcf: line 30, column 40
    function def_onEnter_3 (def :  pcf.TransactionSetDocumentsLV) : void {
      def.onEnter(NewRecoveryReserveSet.WorkingTransactionSet)
    }
    
    // 'def' attribute on ListViewInput at RecoveryReservesSummaryDV.pcf: line 20, column 27
    function def_refreshVariables_1 (def :  pcf.EditableRecoveryReservesLV) : void {
      def.refreshVariables(NewRecoveryReserveSet)
    }
    
    // 'def' attribute on ListViewInput at RecoveryReservesSummaryDV.pcf: line 30, column 40
    function def_refreshVariables_4 (def :  pcf.TransactionSetDocumentsLV) : void {
      def.refreshVariables(NewRecoveryReserveSet.WorkingTransactionSet)
    }
    
    // 'visible' attribute on ListViewInput at RecoveryReservesSummaryDV.pcf: line 30, column 40
    function visible_2 () : java.lang.Boolean {
      return perm.System.viewdocs
    }
    
    property get NewRecoveryReserveSet () : gw.api.financials.RecoveryReserveWizardHelper {
      return getRequireValue("NewRecoveryReserveSet", 0) as gw.api.financials.RecoveryReserveWizardHelper
    }
    
    property set NewRecoveryReserveSet ($arg :  gw.api.financials.RecoveryReserveWizardHelper) {
      setRequireValue("NewRecoveryReserveSet", 0, $arg)
    }
    
    
  }
  
  
}