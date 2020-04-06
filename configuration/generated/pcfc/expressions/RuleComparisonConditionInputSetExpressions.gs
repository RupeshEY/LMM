package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonConditionInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonConditionInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonConditionInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonConditionInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=RuleConditionSectionLabel) at RuleComparisonConditionInputSet.pcf: line 13, column 39
    function def_onEnter_0 (def :  pcf.RuleComparisonSectionLabelInputSet) : void {
      def.onEnter(controller, DisplayKey.get("BizRules.Import.Comparison.RuleCondition"))
    }
    
    // 'def' attribute on InputSetRef at RuleComparisonConditionInputSet.pcf: line 15, column 74
    function def_onEnter_2 (def :  pcf.RuleComparisonRowConditionInputSet) : void {
      def.onEnter(controller.ConditionRow)
    }
    
    // 'def' attribute on InputSetRef (id=RuleConditionSectionLabel) at RuleComparisonConditionInputSet.pcf: line 13, column 39
    function def_refreshVariables_1 (def :  pcf.RuleComparisonSectionLabelInputSet) : void {
      def.refreshVariables(controller, DisplayKey.get("BizRules.Import.Comparison.RuleCondition"))
    }
    
    // 'def' attribute on InputSetRef at RuleComparisonConditionInputSet.pcf: line 15, column 74
    function def_refreshVariables_3 (def :  pcf.RuleComparisonRowConditionInputSet) : void {
      def.refreshVariables(controller.ConditionRow)
    }
    
    property get controller () : gw.bizrules.pcf.RuleVersionComparisonController {
      return getRequireValue("controller", 0) as gw.bizrules.pcf.RuleVersionComparisonController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.RuleVersionComparisonController) {
      setRequireValue("controller", 0, $arg)
    }
    
    
  }
  
  
}