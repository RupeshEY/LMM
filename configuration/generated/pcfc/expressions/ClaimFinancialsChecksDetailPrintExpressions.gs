package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/print/ClaimFinancialsChecksDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimFinancialsChecksDetailPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/print/ClaimFinancialsChecksDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsChecksDetailPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, checkView :  CheckView) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ClaimFinancialsChecksDetailPrint) at ClaimFinancialsChecksDetailPrint.pcf: line 12, column 73
    static function canVisit_2 (checkView :  CheckView, claim :  Claim) : java.lang.Boolean {
      return perm.Check.view(checkView.Check)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsChecksDetailPrint.pcf: line 24, column 41
    function def_onEnter_0 (def :  pcf.CheckDV) : void {
      def.onEnter(checkView.Check)
    }
    
    // 'def' attribute on PanelRef at ClaimFinancialsChecksDetailPrint.pcf: line 24, column 41
    function def_refreshVariables_1 (def :  pcf.CheckDV) : void {
      def.refreshVariables(checkView.Check)
    }
    
    // 'parent' attribute on Page (id=ClaimFinancialsChecksDetailPrint) at ClaimFinancialsChecksDetailPrint.pcf: line 12, column 73
    static function parent_3 (checkView :  CheckView, claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimFinancialsChecksDetailPrint {
      return super.CurrentLocation as pcf.ClaimFinancialsChecksDetailPrint
    }
    
    property get checkView () : CheckView {
      return getVariableValue("checkView", 0) as CheckView
    }
    
    property set checkView ($arg :  CheckView) {
      setVariableValue("checkView", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}