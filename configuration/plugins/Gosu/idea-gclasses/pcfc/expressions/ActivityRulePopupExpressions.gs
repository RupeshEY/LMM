package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRulePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityRulePopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ActivityRulePopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityRulePopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ruleVersion :  ActivityRuleVersion, importing :  boolean) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at ActivityRulePopup.pcf: line 22, column 73
    function def_onEnter_1 (def :  pcf.ActivityRulePanelSet) : void {
      def.onEnter(ruleVersion, importing, controller)
    }
    
    // 'def' attribute on PanelRef at ActivityRulePopup.pcf: line 22, column 73
    function def_refreshVariables_2 (def :  pcf.ActivityRulePanelSet) : void {
      def.refreshVariables(ruleVersion, importing, controller)
    }
    
    // 'initialValue' attribute on Variable at ActivityRulePopup.pcf: line 19, column 50
    function initialValue_0 () : gw.bizrules.pcf.RulePageController {
      return new gw.bizrules.pcf.RulePageController(ruleVersion, gw.bizrules.ActivityRulePanelSetHelper.UIConfigs, CurrentLocation, gw.bizrules.ActivityRuleDetailsStateHolder.SwitchableModes)
    }
    
    // 'title' attribute on Popup (id=ActivityRulePopup) at ActivityRulePopup.pcf: line 7, column 82
    static function title_3 (importing :  boolean, ruleVersion :  ActivityRuleVersion) : java.lang.Object {
      return DisplayKey.get('Web.ActivityRules.Rule.Title',ruleVersion.Rule.Name)
    }
    
    override property get CurrentLocation () : pcf.ActivityRulePopup {
      return super.CurrentLocation as pcf.ActivityRulePopup
    }
    
    property get controller () : gw.bizrules.pcf.RulePageController {
      return getVariableValue("controller", 0) as gw.bizrules.pcf.RulePageController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.RulePageController) {
      setVariableValue("controller", 0, $arg)
    }
    
    property get importing () : boolean {
      return getVariableValue("importing", 0) as java.lang.Boolean
    }
    
    property set importing ($arg :  boolean) {
      setVariableValue("importing", 0, $arg)
    }
    
    property get ruleVersion () : ActivityRuleVersion {
      return getVariableValue("ruleVersion", 0) as ActivityRuleVersion
    }
    
    property set ruleVersion ($arg :  ActivityRuleVersion) {
      setVariableValue("ruleVersion", 0, $arg)
    }
    
    
  }
  
  
}