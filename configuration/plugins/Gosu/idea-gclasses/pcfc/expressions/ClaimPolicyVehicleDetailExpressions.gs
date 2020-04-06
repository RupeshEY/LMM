package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyVehicleDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyVehicleDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, VehicleRU :  VehicleRU) : int {
      return 0
    }
    
    // 'canEdit' attribute on Page (id=ClaimPolicyVehicleDetail) at ClaimPolicyVehicleDetail.pcf: line 9, column 71
    function canEdit_4 () : java.lang.Boolean {
      return perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyVehicleDetail.pcf: line 25, column 55
    function def_onEnter_2 (def :  pcf.PolicyVehicleDetailPanelSet) : void {
      def.onEnter(VehicleRU)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyVehicleDetail.pcf: line 25, column 55
    function def_refreshVariables_3 (def :  pcf.PolicyVehicleDetailPanelSet) : void {
      def.refreshVariables(VehicleRU)
    }
    
    // EditButtons at ClaimPolicyVehicleDetail.pcf: line 22, column 49
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=ClaimPolicyVehicleDetail) at ClaimPolicyVehicleDetail.pcf: line 9, column 71
    static function parent_5 (Claim :  Claim, VehicleRU :  VehicleRU) : pcf.api.Destination {
      return pcf.ClaimPolicyVehicles.createDestination(Claim)
    }
    
    // 'editVisible' attribute on EditButtons at ClaimPolicyVehicleDetail.pcf: line 22, column 49
    function visible_0 () : java.lang.Boolean {
      return !Claim.Policy.Verified
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyVehicleDetail {
      return super.CurrentLocation as pcf.ClaimPolicyVehicleDetail
    }
    
    property get VehicleRU () : VehicleRU {
      return getVariableValue("VehicleRU", 0) as VehicleRU
    }
    
    property set VehicleRU ($arg :  VehicleRU) {
      setVariableValue("VehicleRU", 0, $arg)
    }
    
    
  }
  
  
}