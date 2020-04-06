package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FixPropContentItemPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentContentItem/FixPropContentItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FixPropContentItemPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (AssessmentContentItem :  AssessmentContentItem) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at FixPropContentItemPopup.pcf: line 20, column 67
    function def_onEnter_1 (def :  pcf.FixPropContentItemDetailsDV) : void {
      def.onEnter(AssessmentContentItem)
    }
    
    // 'def' attribute on PanelRef at FixPropContentItemPopup.pcf: line 20, column 67
    function def_refreshVariables_2 (def :  pcf.FixPropContentItemDetailsDV) : void {
      def.refreshVariables(AssessmentContentItem)
    }
    
    // EditButtons at FixPropContentItemPopup.pcf: line 17, column 23
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'title' attribute on Popup (id=FixPropContentItemPopup) at FixPropContentItemPopup.pcf: line 8, column 127
    static function title_3 (AssessmentContentItem :  AssessmentContentItem) : java.lang.Object {
      return DisplayKey.get("NVV.Incident.FixedProperty.AssessmentLine", AssessmentContentItem.Incident.DisplayName)
    }
    
    property get AssessmentContentItem () : AssessmentContentItem {
      return getVariableValue("AssessmentContentItem", 0) as AssessmentContentItem
    }
    
    property set AssessmentContentItem ($arg :  AssessmentContentItem) {
      setVariableValue("AssessmentContentItem", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.FixPropContentItemPopup {
      return super.CurrentLocation as pcf.FixPropContentItemPopup
    }
    
    
  }
  
  
}