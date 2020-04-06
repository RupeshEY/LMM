package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimOtherInstructionWorksheetExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimOtherInstructionWorksheetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=Close) at ClaimOtherInstructionWorksheet.pcf: line 26, column 63
    function action_1 () : void {
      CurrentLocation.cancel()
    }
    
    // 'def' attribute on PanelRef at ClaimOtherInstructionWorksheet.pcf: line 21, column 98
    function def_onEnter_2 (def :  pcf.OtherInstructionsPanelSet) : void {
      def.onEnter(claim.OtherInstructions, claim.Policy.PolicyType, false)
    }
    
    // 'def' attribute on PanelRef at ClaimOtherInstructionWorksheet.pcf: line 21, column 98
    function def_refreshVariables_3 (def :  pcf.OtherInstructionsPanelSet) : void {
      def.refreshVariables(claim.OtherInstructions, claim.Policy.PolicyType, false)
    }
    
    // 'location' attribute on Scope at ClaimOtherInstructionWorksheet.pcf: line 15, column 32
    function location_0 () : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimOtherInstructionWorksheet {
      return super.CurrentLocation as pcf.ClaimOtherInstructionWorksheet
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}