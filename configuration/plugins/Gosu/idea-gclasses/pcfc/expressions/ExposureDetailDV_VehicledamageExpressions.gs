package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.Vehicledamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ExposureDetailDV_VehicledamageExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/ExposureDetailDV.Vehicledamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Vehicledamage.pcf: line 18, column 42
    function def_onEnter_0 (def :  pcf.VehicleDamageDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Vehicledamage.pcf: line 24, column 48
    function def_onEnter_2 (def :  pcf.TotalLossCalculatorDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Vehicledamage.pcf: line 31, column 43
    function def_onEnter_4 (def :  pcf.VehicleSalvageDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Vehicledamage.pcf: line 38, column 39
    function def_onEnter_7 (def :  pcf.ISODetailsDV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Vehicledamage.pcf: line 18, column 42
    function def_refreshVariables_1 (def :  pcf.VehicleDamageDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Vehicledamage.pcf: line 24, column 48
    function def_refreshVariables_3 (def :  pcf.TotalLossCalculatorDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Vehicledamage.pcf: line 31, column 43
    function def_refreshVariables_5 (def :  pcf.VehicleSalvageDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on PanelRef at ExposureDetailDV.Vehicledamage.pcf: line 38, column 39
    function def_refreshVariables_8 (def :  pcf.ISODetailsDV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'visible' attribute on Card (id=VehicleDamage_VehicleSalvageCard) at ExposureDetailDV.Vehicledamage.pcf: line 29, column 60
    function visible_6 () : java.lang.Boolean {
      return Exposure.VehicleIncident.TotalLoss == true
    }
    
    // 'visible' attribute on Card (id=Exposure_ISOCard) at ExposureDetailDV.Vehicledamage.pcf: line 36, column 56
    function visible_9 () : java.lang.Boolean {
      return !Exposure.Claim.ISOClaimLevelMessaging
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get unusedServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("unusedServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set unusedServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("unusedServiceRequests", 0, $arg)
    }
    
    
  }
  
  
}