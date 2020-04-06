package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyLocationPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (PolicyLocation :  PolicyLocation, Claim :  Claim, EditMode :  Boolean) : int {
      return 0
    }
    
    // 'beforeCommit' attribute on Popup (id=PolicyLocationPopup) at PolicyLocationPopup.pcf: line 12, column 61
    function beforeCommit_3 (pickedValue :  PolicyLocation) : void {
      validateValidRiskUnits()
    }
    
    // 'canEdit' attribute on Popup (id=PolicyLocationPopup) at PolicyLocationPopup.pcf: line 12, column 61
    function canEdit_4 () : java.lang.Boolean {
      return (gw.api.policy.PolicyTabUtil.hasTab(Claim, "Properties") or gw.api.policy.PolicyTabUtil.hasTab(Claim, "Classcodes")) and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'canVisit' attribute on Popup (id=PolicyLocationPopup) at PolicyLocationPopup.pcf: line 12, column 61
    static function canVisit_5 (Claim :  Claim, EditMode :  Boolean, PolicyLocation :  PolicyLocation) : java.lang.Boolean {
      return (gw.api.policy.PolicyTabUtil.hasTab(Claim, "Properties") or gw.api.policy.PolicyTabUtil.hasTab(Claim, "Classcodes")) and perm.Claim.edit(Claim) and perm.Policy.view(Claim)
    }
    
    // 'def' attribute on ScreenRef at PolicyLocationPopup.pcf: line 29, column 68
    function def_onEnter_1 (def :  pcf.PolicyLocationScreen) : void {
      def.onEnter(PolicyLocation, Claim, EditMode)
    }
    
    // 'def' attribute on ScreenRef at PolicyLocationPopup.pcf: line 29, column 68
    function def_refreshVariables_2 (def :  pcf.PolicyLocationScreen) : void {
      def.refreshVariables(PolicyLocation, Claim, EditMode)
    }
    
    // 'initialValue' attribute on Variable at PolicyLocationPopup.pcf: line 27, column 45
    function initialValue_0 () : gw.api.address.CCAddressOwner {
      return new gw.api.address.PolicyLocationAddressOwner(PolicyLocation)
    }
    
    // 'startInEditMode' attribute on Popup (id=PolicyLocationPopup) at PolicyLocationPopup.pcf: line 12, column 61
    function startInEditMode_6 () : java.lang.Boolean {
      return EditMode and (!Claim.Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim))
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
    
    override property get CurrentLocation () : pcf.PolicyLocationPopup {
      return super.CurrentLocation as pcf.PolicyLocationPopup
    }
    
    property get EditMode () : Boolean {
      return getVariableValue("EditMode", 0) as Boolean
    }
    
    property set EditMode ($arg :  Boolean) {
      setVariableValue("EditMode", 0, $arg)
    }
    
    property get PolicyLocation () : PolicyLocation {
      return getVariableValue("PolicyLocation", 0) as PolicyLocation
    }
    
    property set PolicyLocation ($arg :  PolicyLocation) {
      setVariableValue("PolicyLocation", 0, $arg)
    }
    
    function validateValidRiskUnits() {
      if (Claim.Policy.hasValidRiskUnits()) return
      throw new gw.api.util.DisplayableException(DisplayKey.get("JSP.ClaimPolicy.Policy.CombinationMustBeUnique"))
    }
    
    
  }
  
  
}