package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicyLocationScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/policylocations/PolicyLocationScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at PolicyLocationScreen.pcf: line 38, column 50
    function def_onEnter_10 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at PolicyLocationScreen.pcf: line 47, column 31
    function def_onEnter_12 (def :  pcf.EditablePropertyLienholdersLV) : void {
      def.onEnter(PolicyLocation, PolicyLocation.Policy.Claim)
    }
    
    // 'def' attribute on ListViewInput at PolicyLocationScreen.pcf: line 58, column 31
    function def_onEnter_14 (def :  pcf.EditableLocationItemsLV) : void {
      def.onEnter(PolicyLocation)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationScreen.pcf: line 68, column 76
    function def_onEnter_17 (def :  pcf.PolicyLocationRiskDetailPanelSet) : void {
      def.onEnter(PolicyLocation, Claim.Policy)
    }
    
    // 'def' attribute on InputSetRef at PolicyLocationScreen.pcf: line 38, column 50
    function def_refreshVariables_11 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(AddressOwner)
    }
    
    // 'def' attribute on ListViewInput at PolicyLocationScreen.pcf: line 47, column 31
    function def_refreshVariables_13 (def :  pcf.EditablePropertyLienholdersLV) : void {
      def.refreshVariables(PolicyLocation, PolicyLocation.Policy.Claim)
    }
    
    // 'def' attribute on ListViewInput at PolicyLocationScreen.pcf: line 58, column 31
    function def_refreshVariables_15 (def :  pcf.EditableLocationItemsLV) : void {
      def.refreshVariables(PolicyLocation)
    }
    
    // 'def' attribute on PanelRef at PolicyLocationScreen.pcf: line 68, column 76
    function def_refreshVariables_18 (def :  pcf.PolicyLocationRiskDetailPanelSet) : void {
      def.refreshVariables(PolicyLocation, Claim.Policy)
    }
    
    // 'value' attribute on TextInput (id=LocationNumber) at PolicyLocationScreen.pcf: line 36, column 50
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicyLocation.LocationNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at PolicyLocationScreen.pcf: line 19, column 30
    function initialValue_0 () : PolicyLocation {
      return PolicyLocationParam == null ? Claim.Policy.createNewPolicyLocation() : PolicyLocationParam
    }
    
    // 'initialValue' attribute on Variable at PolicyLocationScreen.pcf: line 23, column 45
    function initialValue_1 () : gw.api.address.CCAddressOwner {
      return new gw.api.address.PolicyLocationAddressOwner(PolicyLocation)
    }
    
    // EditButtons at PolicyLocationScreen.pcf: line 28, column 37
    function label_5 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at PolicyLocationScreen.pcf: line 28, column 37
    function pickValue_2 () : PolicyLocation {
      return PolicyLocation
    }
    
    // 'value' attribute on TextInput (id=LocationNumber) at PolicyLocationScreen.pcf: line 36, column 50
    function valueRoot_9 () : java.lang.Object {
      return PolicyLocation
    }
    
    // 'value' attribute on TextInput (id=LocationNumber) at PolicyLocationScreen.pcf: line 36, column 50
    function value_6 () : java.lang.String {
      return PolicyLocation.LocationNumber
    }
    
    // 'visible' attribute on InputSet at PolicyLocationScreen.pcf: line 42, column 76
    function visible_16 () : java.lang.Boolean {
      return PolicyLocation.Policy.Claim.LossType != LossType.TC_WC
    }
    
    // 'cancelVisible' attribute on EditButtons at PolicyLocationScreen.pcf: line 28, column 37
    function visible_3 () : java.lang.Boolean {
      return !Claim.Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    property get AddressOwner () : gw.api.address.CCAddressOwner {
      return getVariableValue("AddressOwner", 0) as gw.api.address.CCAddressOwner
    }
    
    property set AddressOwner ($arg :  gw.api.address.CCAddressOwner) {
      setVariableValue("AddressOwner", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get EditMode () : Boolean {
      return getRequireValue("EditMode", 0) as Boolean
    }
    
    property set EditMode ($arg :  Boolean) {
      setRequireValue("EditMode", 0, $arg)
    }
    
    property get PolicyLocation () : PolicyLocation {
      return getVariableValue("PolicyLocation", 0) as PolicyLocation
    }
    
    property set PolicyLocation ($arg :  PolicyLocation) {
      setVariableValue("PolicyLocation", 0, $arg)
    }
    
    property get PolicyLocationParam () : PolicyLocation {
      return getRequireValue("PolicyLocationParam", 0) as PolicyLocation
    }
    
    property set PolicyLocationParam ($arg :  PolicyLocation) {
      setRequireValue("PolicyLocationParam", 0, $arg)
    }
    
    
  }
  
  
}