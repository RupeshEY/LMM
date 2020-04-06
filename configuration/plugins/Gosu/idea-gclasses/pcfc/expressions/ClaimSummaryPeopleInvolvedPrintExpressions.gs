package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/ClaimSummaryPeopleInvolvedPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryPeopleInvolvedPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimSummaryPeopleInvolvedPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryPeopleInvolvedPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ClaimSummaryPeopleInvolvedPrint) at ClaimSummaryPeopleInvolvedPrint.pcf: line 11, column 26
    static function canVisit_2 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimsummary
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPeopleInvolvedPrint.pcf: line 20, column 71
    function def_onEnter_0 (def :  pcf.PeopleInvolvedLV) : void {
      def.onEnter(Claim, Claim.getContactsWithPreload())
    }
    
    // 'def' attribute on PanelRef at ClaimSummaryPeopleInvolvedPrint.pcf: line 20, column 71
    function def_refreshVariables_1 (def :  pcf.PeopleInvolvedLV) : void {
      def.refreshVariables(Claim, Claim.getContactsWithPreload())
    }
    
    // 'parent' attribute on Page (id=ClaimSummaryPeopleInvolvedPrint) at ClaimSummaryPeopleInvolvedPrint.pcf: line 11, column 26
    static function parent_3 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSummaryPeopleInvolvedPrint {
      return super.CurrentLocation as pcf.ClaimSummaryPeopleInvolvedPrint
    }
    
    
  }
  
  
}