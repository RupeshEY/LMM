package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/NewVehAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewVehAssessSourcePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/NewVehAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewVehAssessSourcePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (VehicleIncident :  VehicleIncident) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewVehAssessSourcePopup.pcf: line 27, column 59
    function def_onEnter_3 (def :  pcf.VehAssessSourceDetailsDV) : void {
      def.onEnter(AssessmentSource)
    }
    
    // 'def' attribute on PanelRef at NewVehAssessSourcePopup.pcf: line 27, column 59
    function def_refreshVariables_4 (def :  pcf.VehAssessSourceDetailsDV) : void {
      def.refreshVariables(AssessmentSource)
    }
    
    // 'initialValue' attribute on Variable at NewVehAssessSourcePopup.pcf: line 19, column 32
    function initialValue_0 () : AssessmentSource {
      return VehicleIncident.createAssessmentSource()
    }
    
    // EditButtons at NewVehAssessSourcePopup.pcf: line 24, column 41
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewVehAssessSourcePopup.pcf: line 24, column 41
    function pickValue_1 () : AssessmentSource {
      return AssessmentSource
    }
    
    // 'title' attribute on Popup (id=NewVehAssessSourcePopup) at NewVehAssessSourcePopup.pcf: line 10, column 108
    static function title_5 (VehicleIncident :  VehicleIncident) : java.lang.Object {
      return DisplayKey.get("NVV.Incident.Vehicle.AssessmentSource", VehicleIncident.DisplayName)
    }
    
    property get AssessmentSource () : AssessmentSource {
      return getVariableValue("AssessmentSource", 0) as AssessmentSource
    }
    
    property set AssessmentSource ($arg :  AssessmentSource) {
      setVariableValue("AssessmentSource", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewVehAssessSourcePopup {
      return super.CurrentLocation as pcf.NewVehAssessSourcePopup
    }
    
    property get VehicleIncident () : VehicleIncident {
      return getVariableValue("VehicleIncident", 0) as VehicleIncident
    }
    
    property set VehicleIncident ($arg :  VehicleIncident) {
      setVariableValue("VehicleIncident", 0, $arg)
    }
    
    
  }
  
  
}