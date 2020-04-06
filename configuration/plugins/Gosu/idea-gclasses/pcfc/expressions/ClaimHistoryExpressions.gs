package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/history/ClaimHistory.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimHistoryExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/history/ClaimHistory.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimHistoryExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimHistory_RefreshButton) at ClaimHistory.pcf: line 26, column 25
    function action_0 () : void {
      
    }
    
    // 'canVisit' attribute on Page (id=ClaimHistory) at ClaimHistory.pcf: line 9, column 64
    static function canVisit_3 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimhistory and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'def' attribute on PanelRef at ClaimHistory.pcf: line 29, column 50
    function def_onEnter_1 (def :  pcf.HistoryLV) : void {
      def.onEnter(Claim.AllHistoryEvents)
    }
    
    // 'def' attribute on PanelRef at ClaimHistory.pcf: line 29, column 50
    function def_refreshVariables_2 (def :  pcf.HistoryLV) : void {
      def.refreshVariables(Claim.AllHistoryEvents)
    }
    
    // Page (id=ClaimHistory) at ClaimHistory.pcf: line 9, column 64
    static function parent_4 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimHistory {
      return super.CurrentLocation as pcf.ClaimHistory
    }
    
    
  }
  
  
}