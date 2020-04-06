package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/printing/TripIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TripIncidentDetailPrintExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/printing/TripIncidentDetailPrint.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentDetailPrintExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (aClaim :  Claim, aTripIncident :  TripIncident) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at TripIncidentDetailPrint.pcf: line 23, column 72
    function def_onEnter_0 (def :  pcf.NewTripIncidentScreen) : void {
      def.onEnter(aTripIncident, checkedTripSegments)
    }
    
    // 'def' attribute on ScreenRef at TripIncidentDetailPrint.pcf: line 23, column 72
    function def_refreshVariables_1 (def :  pcf.NewTripIncidentScreen) : void {
      def.refreshVariables(aTripIncident, checkedTripSegments)
    }
    
    // 'parent' attribute on Page (id=TripIncidentDetailPrint) at TripIncidentDetailPrint.pcf: line 10, column 58
    static function parent_2 (aClaim :  Claim, aTripIncident :  TripIncident) : pcf.api.Destination {
      return pcf.ClaimPrintout.createDestination(aClaim)
    }
    
    override property get CurrentLocation () : pcf.TripIncidentDetailPrint {
      return super.CurrentLocation as pcf.TripIncidentDetailPrint
    }
    
    property get aClaim () : Claim {
      return getVariableValue("aClaim", 0) as Claim
    }
    
    property set aClaim ($arg :  Claim) {
      setVariableValue("aClaim", 0, $arg)
    }
    
    property get aTripIncident () : TripIncident {
      return getVariableValue("aTripIncident", 0) as TripIncident
    }
    
    property set aTripIncident ($arg :  TripIncident) {
      setVariableValue("aTripIncident", 0, $arg)
    }
    
    property get checkedTripSegments () : TripSegment[] {
      return getVariableValue("checkedTripSegments", 0) as TripSegment[]
    }
    
    property set checkedTripSegments ($arg :  TripSegment[]) {
      setVariableValue("checkedTripSegments", 0, $arg)
    }
    
    
  }
  
  
}