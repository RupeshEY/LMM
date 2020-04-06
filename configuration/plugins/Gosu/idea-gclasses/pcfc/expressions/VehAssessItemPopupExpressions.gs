package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VehAssessItemPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentItem/VehAssessItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehAssessItemPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (AssessmentItem :  AssessmentItem) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at VehAssessItemPopup.pcf: line 20, column 55
    function def_onEnter_1 (def :  pcf.VehAssessItemDetailsDV) : void {
      def.onEnter(AssessmentItem)
    }
    
    // 'def' attribute on PanelRef at VehAssessItemPopup.pcf: line 20, column 55
    function def_refreshVariables_2 (def :  pcf.VehAssessItemDetailsDV) : void {
      def.refreshVariables(AssessmentItem)
    }
    
    // EditButtons at VehAssessItemPopup.pcf: line 17, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'title' attribute on Popup (id=VehAssessItemPopup) at VehAssessItemPopup.pcf: line 8, column 114
    static function title_3 (AssessmentItem :  AssessmentItem) : java.lang.Object {
      return DisplayKey.get("NVV.Incident.Vehicle.AssessmentLine", AssessmentItem.Incident.DisplayName)
    }
    
    property get AssessmentItem () : AssessmentItem {
      return getVariableValue("AssessmentItem", 0) as AssessmentItem
    }
    
    property set AssessmentItem ($arg :  AssessmentItem) {
      setVariableValue("AssessmentItem", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.VehAssessItemPopup {
      return super.CurrentLocation as pcf.VehAssessItemPopup
    }
    
    
  }
  
  
}