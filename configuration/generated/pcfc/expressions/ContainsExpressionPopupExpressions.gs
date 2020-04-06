package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ContainsExpressionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContainsExpressionPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ContainsExpressionPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContainsExpressionPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (fragHolder :  gw.bizrules.pcf.ContainsExpressionFragmentHolder) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Popup (id=ContainsExpressionPopup) at ContainsExpressionPopup.pcf: line 11, column 35
    function afterCancel_7 () : void {
      fragHolder.onCancel()
    }
    
    // 'afterCommit' attribute on Popup (id=ContainsExpressionPopup) at ContainsExpressionPopup.pcf: line 11, column 35
    function afterCommit_8 (TopLocation :  pcf.api.Location) : void {
      fragHolder.onCommit()
    }
    
    // 'def' attribute on PanelRef at ContainsExpressionPopup.pcf: line 31, column 64
    function def_onEnter_5 (def :  pcf.ConditionBuilderPanelSet) : void {
      def.onEnter(initializedController)
    }
    
    // 'def' attribute on PanelRef at ContainsExpressionPopup.pcf: line 31, column 64
    function def_refreshVariables_6 (def :  pcf.ConditionBuilderPanelSet) : void {
      def.refreshVariables(initializedController)
    }
    
    // 'initialValue' attribute on Variable at ContainsExpressionPopup.pcf: line 20, column 58
    function initialValue_0 () : gw.bizrules.pcf.ConditionBuilderController {
      return fragHolder.getInitializedNestedController(CurrentLocation)
    }
    
    // EditButtons at ContainsExpressionPopup.pcf: line 23, column 23
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'label' attribute on Verbatim (id=DescriptionText) at ContainsExpressionPopup.pcf: line 29, column 50
    function label_4 () : java.lang.String {
      return fragHolder.PopupDescriptionText
    }
    
    // 'title' attribute on Popup (id=ContainsExpressionPopup) at ContainsExpressionPopup.pcf: line 11, column 35
    static function title_9 (fragHolder :  gw.bizrules.pcf.ContainsExpressionFragmentHolder) : java.lang.Object {
      return fragHolder.PopupTitle
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContainsExpressionPopup.pcf: line 25, column 79
    function toolbarButtonSet_onEnter_2 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.onEnter(fragHolder)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContainsExpressionPopup.pcf: line 25, column 79
    function toolbarButtonSet_refreshVariables_3 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.refreshVariables(fragHolder)
    }
    
    override property get CurrentLocation () : pcf.ContainsExpressionPopup {
      return super.CurrentLocation as pcf.ContainsExpressionPopup
    }
    
    property get fragHolder () : gw.bizrules.pcf.ContainsExpressionFragmentHolder {
      return getVariableValue("fragHolder", 0) as gw.bizrules.pcf.ContainsExpressionFragmentHolder
    }
    
    property set fragHolder ($arg :  gw.bizrules.pcf.ContainsExpressionFragmentHolder) {
      setVariableValue("fragHolder", 0, $arg)
    }
    
    property get initializedController () : gw.bizrules.pcf.ConditionBuilderController {
      return getVariableValue("initializedController", 0) as gw.bizrules.pcf.ConditionBuilderController
    }
    
    property set initializedController ($arg :  gw.bizrules.pcf.ConditionBuilderController) {
      setVariableValue("initializedController", 0, $arg)
    }
    
    
  }
  
  
}