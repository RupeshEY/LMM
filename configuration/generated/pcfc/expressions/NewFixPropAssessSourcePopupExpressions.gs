package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/NewFixPropAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewFixPropAssessSourcePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentSource/NewFixPropAssessSourcePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewFixPropAssessSourcePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (FixedPropertyIncident :  FixedPropertyIncident) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewFixPropAssessSourcePopup.pcf: line 27, column 63
    function def_onEnter_3 (def :  pcf.FixPropAssessSourceDetailsDV) : void {
      def.onEnter(AssessmentSource)
    }
    
    // 'def' attribute on PanelRef at NewFixPropAssessSourcePopup.pcf: line 27, column 63
    function def_refreshVariables_4 (def :  pcf.FixPropAssessSourceDetailsDV) : void {
      def.refreshVariables(AssessmentSource)
    }
    
    // 'initialValue' attribute on Variable at NewFixPropAssessSourcePopup.pcf: line 19, column 32
    function initialValue_0 () : AssessmentSource {
      return FixedPropertyIncident.createAssessmentSource()
    }
    
    // EditButtons at NewFixPropAssessSourcePopup.pcf: line 24, column 41
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewFixPropAssessSourcePopup.pcf: line 24, column 41
    function pickValue_1 () : AssessmentSource {
      return AssessmentSource
    }
    
    // 'title' attribute on Popup (id=NewFixPropAssessSourcePopup) at NewFixPropAssessSourcePopup.pcf: line 10, column 120
    static function title_5 (FixedPropertyIncident :  FixedPropertyIncident) : java.lang.Object {
      return DisplayKey.get("NVV.Incident.FixedProperty.AssessmentSource", FixedPropertyIncident.DisplayName)
    }
    
    property get AssessmentSource () : AssessmentSource {
      return getVariableValue("AssessmentSource", 0) as AssessmentSource
    }
    
    property set AssessmentSource ($arg :  AssessmentSource) {
      setVariableValue("AssessmentSource", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewFixPropAssessSourcePopup {
      return super.CurrentLocation as pcf.NewFixPropAssessSourcePopup
    }
    
    property get FixedPropertyIncident () : FixedPropertyIncident {
      return getVariableValue("FixedPropertyIncident", 0) as FixedPropertyIncident
    }
    
    property set FixedPropertyIncident ($arg :  FixedPropertyIncident) {
      setVariableValue("FixedPropertyIncident", 0, $arg)
    }
    
    
  }
  
  
}