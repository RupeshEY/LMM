package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/NewVehAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewVehAssessItemPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/NewVehAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewVehAssessItemPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (VehicleIncident :  VehicleIncident) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewVehAssessItemPopup.pcf: line 27, column 55
    function def_onEnter_3 (def :  pcf.VehAssessItemDetailsDV) : void {
      def.onEnter(AssessmentItem)
    }
    
    // 'def' attribute on PanelRef at NewVehAssessItemPopup.pcf: line 27, column 55
    function def_refreshVariables_4 (def :  pcf.VehAssessItemDetailsDV) : void {
      def.refreshVariables(AssessmentItem)
    }
    
    // 'initialValue' attribute on Variable at NewVehAssessItemPopup.pcf: line 19, column 30
    function initialValue_0 () : AssessmentItem {
      return VehicleIncident.createAssessmentItem()
    }
    
    // EditButtons at NewVehAssessItemPopup.pcf: line 24, column 39
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewVehAssessItemPopup.pcf: line 24, column 39
    function pickValue_1 () : AssessmentItem {
      return AssessmentItem
    }
    
    // 'title' attribute on Popup (id=NewVehAssessItemPopup) at NewVehAssessItemPopup.pcf: line 10, column 106
    static function title_5 (VehicleIncident :  VehicleIncident) : java.lang.Object {
      return DisplayKey.get("NVV.Incident.Vehicle.AssessmentLine", VehicleIncident.DisplayName)
    }
    
    property get AssessmentItem () : AssessmentItem {
      return getVariableValue("AssessmentItem", 0) as AssessmentItem
    }
    
    property set AssessmentItem ($arg :  AssessmentItem) {
      setVariableValue("AssessmentItem", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewVehAssessItemPopup {
      return super.CurrentLocation as pcf.NewVehAssessItemPopup
    }
    
    property get VehicleIncident () : VehicleIncident {
      return getVariableValue("VehicleIncident", 0) as VehicleIncident
    }
    
    property set VehicleIncident ($arg :  VehicleIncident) {
      setVariableValue("VehicleIncident", 0, $arg)
    }
    
    
  }
  
  
}