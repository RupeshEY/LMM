package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/ClaimSummaryMattersPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryMattersPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimSummaryMattersPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryMattersPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ClaimSummaryMattersPrint) at ClaimSummaryMattersPrint.pcf: line 11, column 26
    static function canVisit_3 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimsummary
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryMattersPrint.pcf: line 21, column 71
    function def_onEnter_1 (def :  pcf.ClaimSummaryMattersLV) : void {
      def.onEnter(Claim.Matters, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryMattersPrint.pcf: line 21, column 71
    function def_refreshVariables_2 (def :  pcf.ClaimSummaryMattersLV) : void {
      def.refreshVariables(Claim.Matters, Claim)
    }
    
    // 'parent' attribute on Page (id=ClaimSummaryMattersPrint) at ClaimSummaryMattersPrint.pcf: line 11, column 26
    static function parent_4 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(Claim)
    }
    
    // 'visible' attribute on PanelRef at ClaimSummaryMattersPrint.pcf: line 21, column 71
    function visible_0 () : java.lang.Boolean {
      return perm.Matter.view(Claim) and perm.System.viewmatters
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSummaryMattersPrint {
      return super.CurrentLocation as pcf.ClaimSummaryMattersPrint
    }
    
    
  }
  
  
}