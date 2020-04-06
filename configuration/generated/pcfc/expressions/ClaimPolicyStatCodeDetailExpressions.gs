package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyStatCodeDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyStatCodeDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyStatCodeDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodeDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, StatCode :  StatCode) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodeDetail.pcf: line 21, column 43
    function def_onEnter_0 (def :  pcf.StatCodeDetailDV) : void {
      def.onEnter(StatCode)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyStatCodeDetail.pcf: line 21, column 43
    function def_refreshVariables_1 (def :  pcf.StatCodeDetailDV) : void {
      def.refreshVariables(StatCode)
    }
    
    // 'parent' attribute on Page (id=ClaimPolicyStatCodeDetail) at ClaimPolicyStatCodeDetail.pcf: line 8, column 72
    static function parent_2 (Claim :  Claim, StatCode :  StatCode) : pcf.api.Destination {
      return pcf.ClaimPolicyStatCodes.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyStatCodeDetail {
      return super.CurrentLocation as pcf.ClaimPolicyStatCodeDetail
    }
    
    property get StatCode () : StatCode {
      return getVariableValue("StatCode", 0) as StatCode
    }
    
    property set StatCode ($arg :  StatCode) {
      setVariableValue("StatCode", 0, $arg)
    }
    
    
  }
  
  
}