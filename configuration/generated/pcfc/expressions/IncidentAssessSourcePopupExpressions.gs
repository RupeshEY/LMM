package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IncidentAssessSourcePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/IncidentAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentAssessSourcePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (assessmentSource :  AssessmentSource) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at IncidentAssessSourcePopup.pcf: line 20, column 64
    function def_onEnter_1 (def :  pcf.IncidentAssessSourceDetailsDV) : void {
      def.onEnter(assessmentSource)
    }
    
    // 'def' attribute on PanelRef at IncidentAssessSourcePopup.pcf: line 20, column 64
    function def_refreshVariables_2 (def :  pcf.IncidentAssessSourceDetailsDV) : void {
      def.refreshVariables(assessmentSource)
    }
    
    // EditButtons at IncidentAssessSourcePopup.pcf: line 17, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'title' attribute on Popup (id=IncidentAssessSourcePopup) at IncidentAssessSourcePopup.pcf: line 8, column 127
    static function title_3 (assessmentSource :  AssessmentSource) : java.lang.Object {
      return DisplayKey.get("Web.Incident.Assessment.AssessmentSource.Title", assessmentSource.Incident.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.IncidentAssessSourcePopup {
      return super.CurrentLocation as pcf.IncidentAssessSourcePopup
    }
    
    property get assessmentSource () : AssessmentSource {
      return getVariableValue("assessmentSource", 0) as AssessmentSource
    }
    
    property set assessmentSource ($arg :  AssessmentSource) {
      setVariableValue("assessmentSource", 0, $arg)
    }
    
    
  }
  
  
}