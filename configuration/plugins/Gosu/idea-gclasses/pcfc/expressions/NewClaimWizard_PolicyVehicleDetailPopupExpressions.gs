package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_PolicyVehicleDetailPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_PolicyVehicleDetailPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (VehicleRU :  VehicleRU, Policy :  Policy) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyVehicleDetailPopup.pcf: line 27, column 38
    function def_onEnter_4 (def :  pcf.PolicyVehicleDetailPanelSet) : void {
      def.onEnter(VehicleRU)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_PolicyVehicleDetailPopup.pcf: line 27, column 38
    function def_refreshVariables_5 (def :  pcf.PolicyVehicleDetailPanelSet) : void {
      def.refreshVariables(VehicleRU)
    }
    
    // EditButtons at NewClaimWizard_PolicyVehicleDetailPopup.pcf: line 23, column 43
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'startInEditMode' attribute on Popup (id=NewClaimWizard_PolicyVehicleDetailPopup) at NewClaimWizard_PolicyVehicleDetailPopup.pcf: line 9, column 90
    function startInEditMode_7 () : java.lang.Boolean {
      return !Policy.Verified && VehicleRU != null
    }
    
    // 'editVisible' attribute on EditButtons at NewClaimWizard_PolicyVehicleDetailPopup.pcf: line 23, column 43
    function visible_0 () : java.lang.Boolean {
      return !Policy.Verified
    }
    
    // 'visible' attribute on Toolbar at NewClaimWizard_PolicyVehicleDetailPopup.pcf: line 21, column 37
    function visible_2 () : java.lang.Boolean {
      return VehicleRU != null
    }
    
    // 'visible' attribute on DetailViewPanel (id=NotOnPolicyDV) at NewClaimWizard_PolicyVehicleDetailPopup.pcf: line 31, column 37
    function visible_6 () : java.lang.Boolean {
      return VehicleRU == null
    }
    
    override property get CurrentLocation () : pcf.NewClaimWizard_PolicyVehicleDetailPopup {
      return super.CurrentLocation as pcf.NewClaimWizard_PolicyVehicleDetailPopup
    }
    
    property get Policy () : Policy {
      return getVariableValue("Policy", 0) as Policy
    }
    
    property set Policy ($arg :  Policy) {
      setVariableValue("Policy", 0, $arg)
    }
    
    property get VehicleRU () : VehicleRU {
      return getVariableValue("VehicleRU", 0) as VehicleRU
    }
    
    property set VehicleRU ($arg :  VehicleRU) {
      setVariableValue("VehicleRU", 0, $arg)
    }
    
    
  }
  
  
}