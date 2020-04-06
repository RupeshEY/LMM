package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CreateActivityRule.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CreateActivityRuleExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/CreateActivityRule.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateActivityRuleExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ruleToClone :  ActivityRule, token :  String) : int {
      return 1
    }
    
    static function __constructorIndex (token :  String) : int {
      return 0
    }
    
    // 'action' attribute on AlertBar (id=DuplicatedNameAlertBar) at CreateActivityRule.pcf: line 47, column 74
    function action_6 () : void {
      versionController.pushRulesWithSameNamePopup(head.HeadVersion)
    }
    
    // 'afterCancel' attribute on Page (id=CreateActivityRule) at CreateActivityRule.pcf: line 13, column 157
    function afterCancel_9 () : void {
      ActivityRules.go()
    }
    
    // 'afterCancel' attribute on Page (id=CreateActivityRule) at CreateActivityRule.pcf: line 13, column 157
    function afterCancel_dest_10 () : pcf.api.Destination {
      return pcf.ActivityRules.createDestination()
    }
    
    // 'afterCommit' attribute on Page (id=CreateActivityRule) at CreateActivityRule.pcf: line 13, column 157
    function afterCommit_11 (TopLocation :  pcf.api.Location) : void {
      ActivityRuleDetail.go(head, head.HeadVersion)
    }
    
    // 'def' attribute on PanelRef at CreateActivityRule.pcf: line 49, column 78
    function def_onEnter_7 (def :  pcf.ActivityRulePanelSet) : void {
      def.onEnter(head.HeadVersion, false, ruleController)
    }
    
    // 'def' attribute on PanelRef at CreateActivityRule.pcf: line 49, column 78
    function def_refreshVariables_8 (def :  pcf.ActivityRulePanelSet) : void {
      def.refreshVariables(head.HeadVersion, false, ruleController)
    }
    
    // 'initialValue' attribute on Variable at CreateActivityRule.pcf: line 27, column 135
    function initialValue_0 () : ActivityRuleHead {
      return new gw.bizrules.ActivityRuleFactory().createRuleHead(com.google.common.base.Optional.fromNullable(ruleToClone))
    }
    
    // 'initialValue' attribute on Variable at CreateActivityRule.pcf: line 31, column 145
    function initialValue_1 () : gw.bizrules.pcf.RuleVersionController<ActivityRuleVersion> {
      return new gw.bizrules.pcf.RuleVersionController<ActivityRuleVersion>(gw.bizrules.ActivityRulesNavigationSupport.Instance)
    }
    
    // 'initialValue' attribute on Variable at CreateActivityRule.pcf: line 35, column 207
    function initialValue_2 () : gw.bizrules.pcf.RulePageController {
      return new gw.bizrules.pcf.RulePageController(head.HeadVersion, gw.bizrules.ActivityRulePanelSetHelper.UIConfigs, CurrentLocation, gw.bizrules.ActivityRuleDetailsStateHolder.SwitchableModes)
    }
    
    // 'parent' attribute on Page (id=CreateActivityRule) at CreateActivityRule.pcf: line 13, column 157
    static function parent_12 (ruleToClone :  ActivityRule, token :  String) : pcf.api.Destination {
      return pcf.ActivityRules.createDestination()
    }
    
    // 'title' attribute on Page (id=CreateActivityRule) at CreateActivityRule.pcf: line 13, column 157
    static function title_13 (ruleToClone :  ActivityRule, token :  String) : java.lang.Object {
      return ruleToClone == null ? DisplayKey.get('Web.ActivityRules.Rule.CreateNewRule') : DisplayKey.get('Web.ActivityRules.Rule.Clone', ruleToClone.Name)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at CreateActivityRule.pcf: line 40, column 102
    function toolbarButtonSet_onEnter_3 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.onEnter(ruleController)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at CreateActivityRule.pcf: line 40, column 102
    function toolbarButtonSet_refreshVariables_4 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.refreshVariables(ruleController)
    }
    
    // 'visible' attribute on AlertBar (id=DuplicatedNameAlertBar) at CreateActivityRule.pcf: line 47, column 74
    function visible_5 () : java.lang.Boolean {
      return !versionController.isRuleNameUnique(head.HeadVersion)
    }
    
    override property get CurrentLocation () : pcf.CreateActivityRule {
      return super.CurrentLocation as pcf.CreateActivityRule
    }
    
    property get head () : ActivityRuleHead {
      return getVariableValue("head", 0) as ActivityRuleHead
    }
    
    property set head ($arg :  ActivityRuleHead) {
      setVariableValue("head", 0, $arg)
    }
    
    property get ruleController () : gw.bizrules.pcf.RulePageController {
      return getVariableValue("ruleController", 0) as gw.bizrules.pcf.RulePageController
    }
    
    property set ruleController ($arg :  gw.bizrules.pcf.RulePageController) {
      setVariableValue("ruleController", 0, $arg)
    }
    
    property get ruleToClone () : ActivityRule {
      return getVariableValue("ruleToClone", 0) as ActivityRule
    }
    
    property set ruleToClone ($arg :  ActivityRule) {
      setVariableValue("ruleToClone", 0, $arg)
    }
    
    property get token () : String {
      return getVariableValue("token", 0) as String
    }
    
    property set token ($arg :  String) {
      setVariableValue("token", 0, $arg)
    }
    
    property get versionController () : gw.bizrules.pcf.RuleVersionController<ActivityRuleVersion> {
      return getVariableValue("versionController", 0) as gw.bizrules.pcf.RuleVersionController<ActivityRuleVersion>
    }
    
    property set versionController ($arg :  gw.bizrules.pcf.RuleVersionController<ActivityRuleVersion>) {
      setVariableValue("versionController", 0, $arg)
    }
    
    
  }
  
  
}