package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonCommandParametersInputSet_generatehistoryeventExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonCommandParametersInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=type) at RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf: line 16, column 193
    function def_onEnter_0 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterSet.Config.TYPE.Name))
    }
    
    // 'def' attribute on InputSetRef (id=description) at RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf: line 19, column 192
    function def_onEnter_2 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterSet.Config.DESCRIPTION.Name))
    }
    
    // 'def' attribute on InputSetRef (id=related_to) at RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf: line 22, column 191
    function def_onEnter_4 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterSet.Config.RELATED_TO.Name))
    }
    
    // 'def' attribute on InputSetRef (id=type) at RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf: line 16, column 193
    function def_refreshVariables_1 (def :  pcf.RuleComparisonRowTypeKeyInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRowAsTypeKey(gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterSet.Config.TYPE.Name))
    }
    
    // 'def' attribute on InputSetRef (id=description) at RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf: line 19, column 192
    function def_refreshVariables_3 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterSet.Config.DESCRIPTION.Name))
    }
    
    // 'def' attribute on InputSetRef (id=related_to) at RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf: line 22, column 191
    function def_refreshVariables_5 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.getRow(gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterSet.Config.RELATED_TO.Name))
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