package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewIncidentAssessSourcePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/NewIncidentAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewIncidentAssessSourcePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (incident :  Incident) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewIncidentAssessSourcePopup.pcf: line 27, column 64
    function def_onEnter_3 (def :  pcf.IncidentAssessSourceDetailsDV) : void {
      def.onEnter(assessmentSource)
    }
    
    // 'def' attribute on PanelRef at NewIncidentAssessSourcePopup.pcf: line 27, column 64
    function def_refreshVariables_4 (def :  pcf.IncidentAssessSourceDetailsDV) : void {
      def.refreshVariables(assessmentSource)
    }
    
    // 'initialValue' attribute on Variable at NewIncidentAssessSourcePopup.pcf: line 19, column 32
    function initialValue_0 () : AssessmentSource {
      return incident.createAssessmentSource()
    }
    
    // EditButtons at NewIncidentAssessSourcePopup.pcf: line 24, column 41
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewIncidentAssessSourcePopup.pcf: line 24, column 41
    function pickValue_1 () : AssessmentSource {
      return assessmentSource
    }
    
    // 'title' attribute on Popup (id=NewIncidentAssessSourcePopup) at NewIncidentAssessSourcePopup.pcf: line 10, column 101
    static function title_5 (incident :  Incident) : java.lang.Object {
      return DisplayKey.get("NVV.Incident.Vehicle.AssessmentSource", incident.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.NewIncidentAssessSourcePopup {
      return super.CurrentLocation as pcf.NewIncidentAssessSourcePopup
    }
    
    property get assessmentSource () : AssessmentSource {
      return getVariableValue("assessmentSource", 0) as AssessmentSource
    }
    
    property set assessmentSource ($arg :  AssessmentSource) {
      setVariableValue("assessmentSource", 0, $arg)
    }
    
    property get incident () : Incident {
      return getVariableValue("incident", 0) as Incident
    }
    
    property set incident ($arg :  Incident) {
      setVariableValue("incident", 0, $arg)
    }
    
    
  }
  
  
}