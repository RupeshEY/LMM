package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyLocationPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (PolicyLocation :  PolicyLocation, Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=PolicyLocationPrint) at PolicyLocationPrint.pcf: line 9, column 61
    static function canVisit_3 (Claim :  Claim, PolicyLocation :  PolicyLocation) : java.lang.Boolean {
      return (gw.api.policy.PolicyTabUtil.hasTab(Claim, "Properties") or gw.api.policy.PolicyTabUtil.hasTab(Claim, "Classcodes")) and perm.Policy.view(Claim) and perm.System.viewpolicy
    }
    
    // 'def' attribute on ScreenRef at PolicyLocationPrint.pcf: line 23, column 65
    function def_onEnter_1 (def :  pcf.PolicyLocationScreen) : void {
      def.onEnter(PolicyLocation, Claim, false)
    }
    
    // 'def' attribute on ScreenRef at PolicyLocationPrint.pcf: line 23, column 65
    function def_refreshVariables_2 (def :  pcf.PolicyLocationScreen) : void {
      def.refreshVariables(PolicyLocation, Claim, false)
    }
    
    // 'initialValue' attribute on Variable at PolicyLocationPrint.pcf: line 21, column 45
    function initialValue_0 () : gw.api.address.CCAddressOwner {
      return new gw.api.address.PolicyLocationAddressOwner(PolicyLocation)
    }
    
    // 'parent' attribute on Page (id=PolicyLocationPrint) at PolicyLocationPrint.pcf: line 9, column 61
    static function parent_4 (Claim :  Claim, PolicyLocation :  PolicyLocation) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(Claim)
    }
    
    property get AddressOwner () : gw.api.address.CCAddressOwner {
      return getVariableValue("AddressOwner", 0) as gw.api.address.CCAddressOwner
    }
    
    property set AddressOwner ($arg :  gw.api.address.CCAddressOwner) {
      setVariableValue("AddressOwner", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.PolicyLocationPrint {
      return super.CurrentLocation as pcf.PolicyLocationPrint
    }
    
    property get PolicyLocation () : PolicyLocation {
      return getVariableValue("PolicyLocation", 0) as PolicyLocation
    }
    
    property set PolicyLocation ($arg :  PolicyLocation) {
      setVariableValue("PolicyLocation", 0, $arg)
    }
    
    
  }
  
  
}