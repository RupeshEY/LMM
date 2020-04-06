package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleEditPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityRuleEditPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleEditPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityRuleEditPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (importEntry :  RuleImportTaskEntry, importHelper :  gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>, chosenSide :  RuleImportSide) : int {
      return 0
    }
    
    // 'canVisit' attribute on Popup (id=ActivityRuleEditPopup) at ActivityRuleEditPopup.pcf: line 11, column 117
    static function canVisit_8 (chosenSide :  RuleImportSide, importEntry :  RuleImportTaskEntry, importHelper :  gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>) : java.lang.Boolean {
      return perm.ActivityRule.edit
    }
    
    // 'def' attribute on PanelRef at ActivityRuleEditPopup.pcf: line 40, column 26
    function def_onEnter_6 (def :  pcf.ActivityRulePanelSet) : void {
      def.onEnter(ruleVersion, true, rulePageController)
    }
    
    // 'def' attribute on PanelRef at ActivityRuleEditPopup.pcf: line 40, column 26
    function def_refreshVariables_7 (def :  pcf.ActivityRulePanelSet) : void {
      def.refreshVariables(ruleVersion, true, rulePageController)
    }
    
    // 'initialValue' attribute on Variable at ActivityRuleEditPopup.pcf: line 26, column 35
    function initialValue_0 () : ActivityRuleVersion {
      return importHelper.getNewDraftVersionFrom(importEntry, chosenSide)
    }
    
    // 'initialValue' attribute on Variable at ActivityRuleEditPopup.pcf: line 30, column 50
    function initialValue_1 () : gw.bizrules.pcf.RulePageController {
      return new gw.bizrules.pcf.RulePageController(ruleVersion, gw.bizrules.ActivityRulePanelSetHelper.UIConfigs, CurrentLocation, gw.bizrules.pcf.RuleConditionLineHolder.SWITCHABLE_LINE_EXPRESSION_MODES_SUPERSET)
    }
    
    // 'title' attribute on Popup (id=ActivityRuleEditPopup) at ActivityRuleEditPopup.pcf: line 11, column 117
    static function title_9 (chosenSide :  RuleImportSide, importEntry :  RuleImportTaskEntry, importHelper :  gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>) : java.lang.Object {
      return DisplayKey.get("BizRules.Import.Comparison.Edit.Title", importEntry.NewHeadVersion.Rule.Name)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRuleEditPopup.pcf: line 34, column 63
    function toolbarButtonSet_onEnter_2 (def :  pcf.RuleEditPopupToolbarButtonSet) : void {
      def.onEnter()
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRuleEditPopup.pcf: line 36, column 87
    function toolbarButtonSet_onEnter_4 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.onEnter(rulePageController)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRuleEditPopup.pcf: line 34, column 63
    function toolbarButtonSet_refreshVariables_3 (def :  pcf.RuleEditPopupToolbarButtonSet) : void {
      def.refreshVariables()
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ActivityRuleEditPopup.pcf: line 36, column 87
    function toolbarButtonSet_refreshVariables_5 (def :  pcf.ConditionValidationToolbarButtonSet) : void {
      def.refreshVariables(rulePageController)
    }
    
    override property get CurrentLocation () : pcf.ActivityRuleEditPopup {
      return super.CurrentLocation as pcf.ActivityRuleEditPopup
    }
    
    property get chosenSide () : RuleImportSide {
      return getVariableValue("chosenSide", 0) as RuleImportSide
    }
    
    property set chosenSide ($arg :  RuleImportSide) {
      setVariableValue("chosenSide", 0, $arg)
    }
    
    property get importEntry () : RuleImportTaskEntry {
      return getVariableValue("importEntry", 0) as RuleImportTaskEntry
    }
    
    property set importEntry ($arg :  RuleImportTaskEntry) {
      setVariableValue("importEntry", 0, $arg)
    }
    
    property get importHelper () : gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion> {
      return getVariableValue("importHelper", 0) as gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>
    }
    
    property set importHelper ($arg :  gw.bizrules.pcf.RuleExportImportPageHelper<ActivityRuleVersion>) {
      setVariableValue("importHelper", 0, $arg)
    }
    
    property get rulePageController () : gw.bizrules.pcf.RulePageController {
      return getVariableValue("rulePageController", 0) as gw.bizrules.pcf.RulePageController
    }
    
    property set rulePageController ($arg :  gw.bizrules.pcf.RulePageController) {
      setVariableValue("rulePageController", 0, $arg)
    }
    
    property get ruleVersion () : ActivityRuleVersion {
      return getVariableValue("ruleVersion", 0) as ActivityRuleVersion
    }
    
    property set ruleVersion ($arg :  ActivityRuleVersion) {
      setVariableValue("ruleVersion", 0, $arg)
    }
    
    
  }
  
  
}