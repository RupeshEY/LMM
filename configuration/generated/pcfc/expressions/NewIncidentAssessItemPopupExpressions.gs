package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/NewIncidentAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewIncidentAssessItemPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/NewIncidentAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewIncidentAssessItemPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (incident :  Incident) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewIncidentAssessItemPopup.pcf: line 26, column 60
    function def_onEnter_3 (def :  pcf.IncidentAssessItemDetailsDV) : void {
      def.onEnter(assessmentItem)
    }
    
    // 'def' attribute on PanelRef at NewIncidentAssessItemPopup.pcf: line 26, column 60
    function def_refreshVariables_4 (def :  pcf.IncidentAssessItemDetailsDV) : void {
      def.refreshVariables(assessmentItem)
    }
    
    // 'initialValue' attribute on Variable at NewIncidentAssessItemPopup.pcf: line 19, column 30
    function initialValue_0 () : AssessmentItem {
      return incident.createAssessmentItem()
    }
    
    // EditButtons at NewIncidentAssessItemPopup.pcf: line 23, column 39
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewIncidentAssessItemPopup.pcf: line 23, column 39
    function pickValue_1 () : AssessmentItem {
      return assessmentItem
    }
    
    // 'title' attribute on Popup (id=NewIncidentAssessItemPopup) at NewIncidentAssessItemPopup.pcf: line 10, column 99
    static function title_5 (incident :  Incident) : java.lang.Object {
      return DisplayKey.get("NVV.Incident.Vehicle.AssessmentLine", incident.DisplayName)
    }
    
    override property get CurrentLocation () : pcf.NewIncidentAssessItemPopup {
      return super.CurrentLocation as pcf.NewIncidentAssessItemPopup
    }
    
    property get assessmentItem () : AssessmentItem {
      return getVariableValue("assessmentItem", 0) as AssessmentItem
    }
    
    property set assessmentItem ($arg :  AssessmentItem) {
      setVariableValue("assessmentItem", 0, $arg)
    }
    
    property get incident () : Incident {
      return getVariableValue("incident", 0) as Incident
    }
    
    property set incident ($arg :  Incident) {
      setVariableValue("incident", 0, $arg)
    }
    
    
  }
  
  
}