package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/FixPropAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FixPropAssessItemPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/FixPropAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropAssessItemPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (AssessmentItem :  AssessmentItem) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at FixPropAssessItemPopup.pcf: line 20, column 59
    function def_onEnter_1 (def :  pcf.FixPropAssessItemDetailsDV) : void {
      def.onEnter(AssessmentItem)
    }
    
    // 'def' attribute on PanelRef at FixPropAssessItemPopup.pcf: line 20, column 59
    function def_refreshVariables_2 (def :  pcf.FixPropAssessItemDetailsDV) : void {
      def.refreshVariables(AssessmentItem)
    }
    
    // EditButtons at FixPropAssessItemPopup.pcf: line 17, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'title' attribute on Popup (id=FixPropAssessItemPopup) at FixPropAssessItemPopup.pcf: line 8, column 120
    static function title_3 (AssessmentItem :  AssessmentItem) : java.lang.Object {
      return DisplayKey.get("NVV.Incident.FixedProperty.AssessmentLine", AssessmentItem.Incident.DisplayName)
    }
    
    property get AssessmentItem () : AssessmentItem {
      return getVariableValue("AssessmentItem", 0) as AssessmentItem
    }
    
    property set AssessmentItem ($arg :  AssessmentItem) {
      setVariableValue("AssessmentItem", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.FixPropAssessItemPopup {
      return super.CurrentLocation as pcf.FixPropAssessItemPopup
    }
    
    
  }
  
  
}