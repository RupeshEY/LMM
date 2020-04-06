package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyVehiclesExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyVehiclesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyVehicles_AddMoreVehiclesButton) at ClaimPolicyVehicles.pcf: line 28, column 135
    function action_3 () : void {
      gw.api.policy.ClaimPolicyMakeEditableUtil.makePolicyEditable(CurrentLocation, Claim)
    }
    
    // 'canEdit' attribute on Page (id=ClaimPolicyVehicles) at ClaimPolicyVehicles.pcf: line 9, column 66
    function canEdit_17 () : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Vehicles") and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimPolicyVehicles) at ClaimPolicyVehicles.pcf: line 9, column 66
    static function canVisit_18 (Claim :  Claim) : java.lang.Boolean {
      return gw.api.policy.PolicyTabUtil.hasTab(Claim, "Vehicles") and perm.Policy.view(Claim) and perm.System.viewpolicy
    }
    
    // 'label' attribute on AlertBar (id=ClaimPolicyVehicles_PartialListAlertBar) at ClaimPolicyVehicles.pcf: line 33, column 148
    function label_5 () : java.lang.Object {
      return DisplayKey.get("Web.ClaimPolicy.Vehicles.PartialList", Claim.Policy.TotalVehicles)
    }
    
    // Page (id=ClaimPolicyVehicles) at ClaimPolicyVehicles.pcf: line 9, column 66
    static function parent_19 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPolicyGroup.createDestination(Claim)
    }
    
    // 'addVisible' attribute on IteratorButtons at ClaimPolicyVehicles.pcf: line 22, column 79
    function visible_0 () : java.lang.Boolean {
      return !Claim.Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'removeVisible' attribute on IteratorButtons at ClaimPolicyVehicles.pcf: line 22, column 79
    function visible_1 () : java.lang.Boolean {
      return perm.Claim.edit(Claim) and perm.Policy.edit(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyVehicles_AddMoreVehiclesButton) at ClaimPolicyVehicles.pcf: line 28, column 135
    function visible_2 () : java.lang.Boolean {
      return Claim.Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim) and perm.Policy.makeeditable(Claim)
    }
    
    // 'visible' attribute on AlertBar (id=ClaimPolicyVehicles_PartialListAlertBar) at ClaimPolicyVehicles.pcf: line 33, column 148
    function visible_4 () : java.lang.Boolean {
      return Claim.Policy.Verified and (Claim.Policy.TotalVehicles >= 0) and (Claim.Policy.TotalVehicles != Claim.Policy.Vehicles.length)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyVehicles {
      return super.CurrentLocation as pcf.ClaimPolicyVehicles
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimPolicyVehiclesExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyVehicles_EditButton) at ClaimPolicyVehicles.pcf: line 53, column 143
    function action_9 () : void {
      gw.api.policy.ClaimPolicyMakeEditableUtil.makePolicyEditable(CurrentLocation, Claim, true);
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyVehicles.pcf: line 46, column 49
    function def_onEnter_15 (def :  pcf.PolicyVehicleDetailPanelSet) : void {
      def.onEnter(VehicleRU)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyVehicles.pcf: line 39, column 59
    function def_onEnter_6 (def :  pcf.VehiclesLV) : void {
      def.onEnter(Claim.Policy.Vehicles, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyVehicles.pcf: line 46, column 49
    function def_refreshVariables_16 (def :  pcf.PolicyVehicleDetailPanelSet) : void {
      def.refreshVariables(VehicleRU)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyVehicles.pcf: line 39, column 59
    function def_refreshVariables_7 (def :  pcf.VehiclesLV) : void {
      def.refreshVariables(Claim.Policy.Vehicles, Claim)
    }
    
    // EditButtons at ClaimPolicyVehicles.pcf: line 57, column 59
    function label_13 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'cancelVisible' attribute on EditButtons at ClaimPolicyVehicles.pcf: line 57, column 59
    function visible_10 () : java.lang.Boolean {
      return !Claim.Policy.Verified
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyVehicles_EditButton) at ClaimPolicyVehicles.pcf: line 53, column 143
    function visible_8 () : java.lang.Boolean {
      return Claim.Policy.Verified and perm.Claim.edit(Claim) and perm.Policy.edit(Claim) and perm.Policy.makeeditable(Claim)
    }
    
    property get VehicleRU () : VehicleRU {
      return getCurrentSelection(1) as VehicleRU
    }
    
    property set VehicleRU ($arg :  VehicleRU) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}