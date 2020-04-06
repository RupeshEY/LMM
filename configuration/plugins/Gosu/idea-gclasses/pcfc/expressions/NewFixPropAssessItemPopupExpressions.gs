package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/NewFixPropAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewFixPropAssessItemPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/NewFixPropAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewFixPropAssessItemPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (FixedPropertyIncident :  FixedPropertyIncident) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewFixPropAssessItemPopup.pcf: line 27, column 59
    function def_onEnter_3 (def :  pcf.FixPropAssessItemDetailsDV) : void {
      def.onEnter(AssessmentItem)
    }
    
    // 'def' attribute on PanelRef at NewFixPropAssessItemPopup.pcf: line 27, column 59
    function def_refreshVariables_4 (def :  pcf.FixPropAssessItemDetailsDV) : void {
      def.refreshVariables(AssessmentItem)
    }
    
    // 'initialValue' attribute on Variable at NewFixPropAssessItemPopup.pcf: line 19, column 30
    function initialValue_0 () : AssessmentItem {
      return FixedPropertyIncident.createAssessmentItem()
    }
    
    // EditButtons at NewFixPropAssessItemPopup.pcf: line 24, column 39
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewFixPropAssessItemPopup.pcf: line 24, column 39
    function pickValue_1 () : AssessmentItem {
      return AssessmentItem
    }
    
    // 'title' attribute on Popup (id=NewFixPropAssessItemPopup) at NewFixPropAssessItemPopup.pcf: line 10, column 118
    static function title_5 (FixedPropertyIncident :  FixedPropertyIncident) : java.lang.Object {
      return DisplayKey.get("NVV.Incident.FixedProperty.AssessmentLine", FixedPropertyIncident.DisplayName)
    }
    
    property get AssessmentItem () : AssessmentItem {
      return getVariableValue("AssessmentItem", 0) as AssessmentItem
    }
    
    property set AssessmentItem ($arg :  AssessmentItem) {
      setVariableValue("AssessmentItem", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewFixPropAssessItemPopup {
      return super.CurrentLocation as pcf.NewFixPropAssessItemPopup
    }
    
    property get FixedPropertyIncident () : FixedPropertyIncident {
      return getVariableValue("FixedPropertyIncident", 0) as FixedPropertyIncident
    }
    
    property set FixedPropertyIncident ($arg :  FixedPropertyIncident) {
      setVariableValue("FixedPropertyIncident", 0, $arg)
    }
    
    
  }
  
  
}