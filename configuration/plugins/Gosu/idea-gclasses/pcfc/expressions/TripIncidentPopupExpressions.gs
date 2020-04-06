package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/trip/TripIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TripIncidentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/trip/TripIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripIncidentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (aClaim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (tripIncidentParam :  TripIncident, startInEditMode :  boolean) : int {
      return 1
    }
    
    // 'beforeCommit' attribute on Popup (id=TripIncidentPopup) at TripIncidentPopup.pcf: line 12, column 58
    function beforeCommit_3 (pickedValue :  TripIncident) : void {
      aTripIncident.Claim.instructNewServiceRequests()
    }
    
    // 'def' attribute on ScreenRef at TripIncidentPopup.pcf: line 35, column 72
    function def_onEnter_1 (def :  pcf.NewTripIncidentScreen) : void {
      def.onEnter(aTripIncident, checkedTripSegments)
    }
    
    // 'def' attribute on ScreenRef at TripIncidentPopup.pcf: line 35, column 72
    function def_refreshVariables_2 (def :  pcf.NewTripIncidentScreen) : void {
      def.refreshVariables(aTripIncident, checkedTripSegments)
    }
    
    // 'initialValue' attribute on Variable at TripIncidentPopup.pcf: line 26, column 28
    function initialValue_0 () : TripIncident {
      return tripIncidentParam == null ? aClaim.newIncident(entity.TripIncident) as TripIncident : tripIncidentParam
    }
    
    // 'startInEditMode' attribute on Popup (id=TripIncidentPopup) at TripIncidentPopup.pcf: line 12, column 58
    function startInEditMode_4 () : java.lang.Boolean {
      return startInEditMode
    }
    
    override property get CurrentLocation () : pcf.TripIncidentPopup {
      return super.CurrentLocation as pcf.TripIncidentPopup
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
    
    property get startInEditMode () : boolean {
      return getVariableValue("startInEditMode", 0) as java.lang.Boolean
    }
    
    property set startInEditMode ($arg :  boolean) {
      setVariableValue("startInEditMode", 0, $arg)
    }
    
    property get tripIncidentParam () : TripIncident {
      return getVariableValue("tripIncidentParam", 0) as TripIncident
    }
    
    property set tripIncidentParam ($arg :  TripIncident) {
      setVariableValue("tripIncidentParam", 0, $arg)
    }
    
    
  }
  
  
}