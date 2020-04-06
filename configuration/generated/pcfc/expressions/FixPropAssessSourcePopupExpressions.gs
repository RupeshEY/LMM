package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FixPropAssessSourcePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/FixPropAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropAssessSourcePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (AssessmentSource :  AssessmentSource) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at FixPropAssessSourcePopup.pcf: line 20, column 63
    function def_onEnter_1 (def :  pcf.FixPropAssessSourceDetailsDV) : void {
      def.onEnter(AssessmentSource)
    }
    
    // 'def' attribute on PanelRef at FixPropAssessSourcePopup.pcf: line 20, column 63
    function def_refreshVariables_2 (def :  pcf.FixPropAssessSourceDetailsDV) : void {
      def.refreshVariables(AssessmentSource)
    }
    
    // EditButtons at FixPropAssessSourcePopup.pcf: line 17, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'title' attribute on Popup (id=FixPropAssessSourcePopup) at FixPropAssessSourcePopup.pcf: line 8, column 124
    static function title_3 (AssessmentSource :  AssessmentSource) : java.lang.Object {
      return DisplayKey.get("NVV.Incident.FixedProperty.AssessmentSource", AssessmentSource.Incident.DisplayName)
    }
    
    property get AssessmentSource () : AssessmentSource {
      return getVariableValue("AssessmentSource", 0) as AssessmentSource
    }
    
    property set AssessmentSource ($arg :  AssessmentSource) {
      setVariableValue("AssessmentSource", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.FixPropAssessSourcePopup {
      return super.CurrentLocation as pcf.FixPropAssessSourcePopup
    }
    
    
  }
  
  
}