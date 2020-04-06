package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/IncidentAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IncidentAssessItemPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/IncidentAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentAssessItemPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (assessmentItem :  AssessmentItem) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at IncidentAssessItemPopup.pcf: line 20, column 60
    function def_onEnter_1 (def :  pcf.IncidentAssessItemDetailsDV) : void {
      def.onEnter(assessmentItem)
    }
    
    // 'def' attribute on PanelRef at IncidentAssessItemPopup.pcf: line 20, column 60
    function def_refreshVariables_2 (def :  pcf.IncidentAssessItemDetailsDV) : void {
      def.refreshVariables(assessmentItem)
    }
    
    // EditButtons at IncidentAssessItemPopup.pcf: line 17, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'title' attribute on Popup (id=IncidentAssessItemPopup) at IncidentAssessItemPopup.pcf: line 8, column 49
    static function title_3 (assessmentItem :  AssessmentItem) : java.lang.Object {
      return assessmentItem.Incident.DisplayName
    }
    
    override property get CurrentLocation () : pcf.IncidentAssessItemPopup {
      return super.CurrentLocation as pcf.IncidentAssessItemPopup
    }
    
    property get assessmentItem () : AssessmentItem {
      return getVariableValue("assessmentItem", 0) as AssessmentItem
    }
    
    property set assessmentItem ($arg :  AssessmentItem) {
      setVariableValue("assessmentItem", 0, $arg)
    }
    
    
  }
  
  
}