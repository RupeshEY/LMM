package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CreateRuleToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CreateRuleToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/CreateRuleToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateRuleToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=Add) at CreateRuleToolbarButtonSet.pcf: line 19, column 88
    function action_1 () : void {
      navigationSupport.goToCreateRulePage()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=Clone) at CreateRuleToolbarButtonSet.pcf: line 27, column 88
    function allCheckedRowsAction_5 (CheckedValues :  RuleVersion[], CheckedValuesErrors :  java.util.Map) : void {
      navigationSupport.goToCloneRulePage(CheckedValues.single().Rule)
    }
    
    // 'available' attribute on ToolbarButton (id=Add) at CreateRuleToolbarButtonSet.pcf: line 19, column 88
    function available_0 () : java.lang.Boolean {
      return gw.bizrules.pcf.RulePermissionUIHelper.canEditRule()
    }
    
    // 'tooltip' attribute on ToolbarButton (id=Add) at CreateRuleToolbarButtonSet.pcf: line 19, column 88
    function tooltip_2 () : java.lang.String {
      return gw.bizrules.pcf.RulePermissionUIHelper.checkAndGetEditPermissionMsg()
    }
    
    property get navigationSupport () : gw.bizrules.pcf.BizRulesPageNavigationSupport {
      return getRequireValue("navigationSupport", 0) as gw.bizrules.pcf.BizRulesPageNavigationSupport
    }
    
    property set navigationSupport ($arg :  gw.bizrules.pcf.BizRulesPageNavigationSupport) {
      setRequireValue("navigationSupport", 0, $arg)
    }
    
    
  }
  
  
}