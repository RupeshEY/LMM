package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentContentItem/NewFixPropContentItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewFixPropContentItemPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/assessment/AssessmentContentItem/NewFixPropContentItemPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewFixPropContentItemPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (FixedPropertyIncident :  FixedPropertyIncident) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at NewFixPropContentItemPopup.pcf: line 27, column 67
    function def_onEnter_3 (def :  pcf.FixPropContentItemDetailsDV) : void {
      def.onEnter(AssessmentContentItem)
    }
    
    // 'def' attribute on PanelRef at NewFixPropContentItemPopup.pcf: line 27, column 67
    function def_refreshVariables_4 (def :  pcf.FixPropContentItemDetailsDV) : void {
      def.refreshVariables(AssessmentContentItem)
    }
    
    // 'initialValue' attribute on Variable at NewFixPropContentItemPopup.pcf: line 19, column 37
    function initialValue_0 () : AssessmentContentItem {
      return FixedPropertyIncident.createAssessmentContentItem()
    }
    
    // EditButtons at NewFixPropContentItemPopup.pcf: line 24, column 46
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at NewFixPropContentItemPopup.pcf: line 24, column 46
    function pickValue_1 () : AssessmentContentItem {
      return AssessmentContentItem
    }
    
    // 'title' attribute on Popup (id=NewFixPropContentItemPopup) at NewFixPropContentItemPopup.pcf: line 10, column 118
    static function title_5 (FixedPropertyIncident :  FixedPropertyIncident) : java.lang.Object {
      return DisplayKey.get("NVV.Incident.FixedProperty.AssessmentLine", FixedPropertyIncident.DisplayName)
    }
    
    property get AssessmentContentItem () : AssessmentContentItem {
      return getVariableValue("AssessmentContentItem", 0) as AssessmentContentItem
    }
    
    property set AssessmentContentItem ($arg :  AssessmentContentItem) {
      setVariableValue("AssessmentContentItem", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.NewFixPropContentItemPopup {
      return super.CurrentLocation as pcf.NewFixPropContentItemPopup
    }
    
    property get FixedPropertyIncident () : FixedPropertyIncident {
      return getVariableValue("FixedPropertyIncident", 0) as FixedPropertyIncident
    }
    
    property set FixedPropertyIncident ($arg :  FixedPropertyIncident) {
      setVariableValue("FixedPropertyIncident", 0, $arg)
    }
    
    
  }
  
  
}