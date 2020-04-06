package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPolicyStatCodesPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyStatCodesPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/printing/ClaimPolicyStatCodesPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodesPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=ClaimPolicyStatCodesPrint) at ClaimPolicyStatCodesPrint.pcf: line 11, column 85
    function canEdit_3 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Statcodes") and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimPolicyStatCodesPrint) at ClaimPolicyStatCodesPrint.pcf: line 11, column 85
    static function canVisit_4 (Claim :  Claim) : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Statcodes") and perm.Policy.view(Claim) and perm.System.viewpolicy
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodesPrint.pcf: line 25, column 52
    function def_onEnter_1 (def :  pcf.StatCodesLV) : void {
      def.onEnter(Policy.StatCodes, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodesPrint.pcf: line 25, column 52
    function def_refreshVariables_2 (def :  pcf.StatCodesLV) : void {
      def.refreshVariables(Policy.StatCodes, Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimPolicyStatCodesPrint.pcf: line 21, column 29
    function initialValue_0 () : entity.Policy {
      return Claim.Policy
    }
    
    // 'parent' attribute on Page (id=ClaimPolicyStatCodesPrint) at ClaimPolicyStatCodesPrint.pcf: line 11, column 85
    static function parent_5 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPolicyGroup.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyStatCodesPrint {
      return super.CurrentLocation as pcf.ClaimPolicyStatCodesPrint
    }
    
    property get Policy () : entity.Policy {
      return getVariableValue("Policy", 0) as entity.Policy
    }
    
    property set Policy ($arg :  entity.Policy) {
      setVariableValue("Policy", 0, $arg)
    }
    
    
  }
  
  
}