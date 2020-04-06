package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyLocationLDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationLDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationLDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationLDV.pcf: line 20, column 30
    function def_onEnter_0 (def :  pcf.PolicyLocationsLV) : void {
      def.onEnter(Claim.Policy.PolicyLocations, Claim)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationLDV.pcf: line 27, column 80
    function def_onEnter_3 (def :  pcf.PolicyLocationRiskDetailPanelSet) : void {
      def.onEnter(PolicyLocation, Claim.Policy)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationLDV.pcf: line 20, column 30
    function def_refreshVariables_1 (def :  pcf.PolicyLocationsLV) : void {
      def.refreshVariables(Claim.Policy.PolicyLocations, Claim)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationLDV.pcf: line 27, column 80
    function def_refreshVariables_4 (def :  pcf.PolicyLocationRiskDetailPanelSet) : void {
      def.refreshVariables(PolicyLocation, Claim.Policy)
    }
    
    // 'mode' attribute on PanelRef at PolicyLocationLDV.pcf: line 20, column 30
    function mode_2 () : java.lang.Object {
      return Claim.LossType
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get PolicyLocation () : PolicyLocation {
      return getCurrentSelection(0) as PolicyLocation
    }
    
    property set PolicyLocation ($arg :  PolicyLocation) {
      setCurrentSelection(0, $arg)
    }
    
    
  }
  
  
}