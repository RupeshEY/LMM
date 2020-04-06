package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWizard_NewPolicyVehiclePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_NewPolicyVehiclePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Policy :  Policy) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewPolicyVehiclePopup.pcf: line 27, column 55
    function def_onEnter_3 (def :  pcf.PolicyVehicleDetailPanelSet) : void {
      def.onEnter(VehicleRU)
    }
    
    // 'def' attribute on PanelRef at NewClaimWizard_NewPolicyVehiclePopup.pcf: line 27, column 55
    function def_refreshVariables_4 (def :  pcf.PolicyVehicleDetailPanelSet) : void {
      def.refreshVariables(VehicleRU)
    }
    
    // 'initialValue' attribute on Variable at NewClaimWizard_NewPolicyVehiclePopup.pcf: line 19, column 25
    function initialValue_0 () : VehicleRU {
      return Policy.createVehicleRU()
    }
    
    // EditButtons at NewClaimWizard_NewPolicyVehiclePopup.pcf: line 24, column 34
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewClaimWizard_NewPolicyVehiclePopup.pcf: line 24, column 34
    function pickValue_1 () : VehicleRU {
      return VehicleRU
    }
    
    override property get CurrentLocation () : pcf.NewClaimWizard_NewPolicyVehiclePopup {
      return super.CurrentLocation as pcf.NewClaimWizard_NewPolicyVehiclePopup
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