package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/VehicleIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehicleIncidentPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/print/VehicleIncidentPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleIncidentPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=VehicleIncidentPrint) at VehicleIncidentPrint.pcf: line 9, column 90
    static function canVisit_2 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimbasics
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentPrint.pcf: line 19, column 50
    function def_onEnter_0 (def :  pcf.EditableVehicleIncidentsLV) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at VehicleIncidentPrint.pcf: line 19, column 50
    function def_refreshVariables_1 (def :  pcf.EditableVehicleIncidentsLV) : void {
      def.refreshVariables(Claim)
    }
    
    // 'parent' attribute on Page (id=VehicleIncidentPrint) at VehicleIncidentPrint.pcf: line 9, column 90
    static function parent_3 (Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimLossDetails.createDestination(Claim)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.VehicleIncidentPrint {
      return super.CurrentLocation as pcf.VehicleIncidentPrint
    }
    
    
  }
  
  
}