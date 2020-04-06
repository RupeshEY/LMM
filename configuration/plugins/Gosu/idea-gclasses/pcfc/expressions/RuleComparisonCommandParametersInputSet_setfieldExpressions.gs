package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.setfield.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonCommandParametersInputSet_setfieldExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.setfield.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonCommandParametersInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=only_if_null) at RuleComparisonCommandParametersInputSet.setfield.pcf: line 16, column 183
    function def_onEnter_0 (def :  pcf.RuleComparisonRowBooleanInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsBoolean(gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterSet.Config.SET_ONLY_IF_NULL.Name))
    }
    
    // 'def' attribute on InputSetRef (id=property) at RuleComparisonCommandParametersInputSet.setfield.pcf: line 19, column 165
    function def_onEnter_2 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterSet.Config.PROPERTY.Name))
    }
    
    // 'def' attribute on InputSetRef (id=value) at RuleComparisonCommandParametersInputSet.setfield.pcf: line 22, column 162
    function def_onEnter_4 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterSet.Config.VALUE.Name))
    }
    
    // 'def' attribute on InputSetRef (id=only_if_null) at RuleComparisonCommandParametersInputSet.setfield.pcf: line 16, column 183
    function def_refreshVariables_1 (def :  pcf.RuleComparisonRowBooleanInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsBoolean(gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterSet.Config.SET_ONLY_IF_NULL.Name))
    }
    
    // 'def' attribute on InputSetRef (id=property) at RuleComparisonCommandParametersInputSet.setfield.pcf: line 19, column 165
    function def_refreshVariables_3 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterSet.Config.PROPERTY.Name))
    }
    
    // 'def' attribute on InputSetRef (id=value) at RuleComparisonCommandParametersInputSet.setfield.pcf: line 22, column 162
    function def_refreshVariables_5 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterSet.Config.VALUE.Name))
    }
    
    property get commandDefinitionDiff () : gw.bizrules.diff.RuleMatchableDiffPair<RuleCommandDefinition> {
      return getRequireValue("commandDefinitionDiff", 0) as gw.bizrules.diff.RuleMatchableDiffPair<RuleCommandDefinition>
    }
    
    property set commandDefinitionDiff ($arg :  gw.bizrules.diff.RuleMatchableDiffPair<RuleCommandDefinition>) {
      setRequireValue("commandDefinitionDiff", 0, $arg)
    }
    
    property get controller () : gw.bizrules.pcf.RuleVersionComparisonController {
      return getRequireValue("controller", 0) as gw.bizrules.pcf.RuleVersionComparisonController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.RuleVersionComparisonController) {
      setRequireValue("controller", 0, $arg)
    }
    
    
  }
  
  
}