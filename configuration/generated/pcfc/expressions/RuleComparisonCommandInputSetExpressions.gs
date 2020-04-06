package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonCommandInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonCommandInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at RuleComparisonCommandInputSet.pcf: line 14, column 90
    function def_onEnter_0 (def :  pcf.RuleComparisonCommandLabelInputSet) : void {
      def.onEnter(controller, commandDefinitionDiff.Title)
    }
    
    // 'def' attribute on InputSetRef (id=RuleActionParameters) at RuleComparisonCommandInputSet.pcf: line 20, column 34
    function def_onEnter_10 (def :  pcf.RuleComparisonCommandParametersInputSet_setfield) : void {
      def.onEnter(controller, commandDefinitionDiff)
    }
    
    // 'def' attribute on InputSetRef at RuleComparisonCommandInputSet.pcf: line 16, column 75
    function def_onEnter_2 (def :  pcf.RuleComparisonCommandSequenceInputSet) : void {
      def.onEnter(commandDefinitionDiff)
    }
    
    // 'def' attribute on InputSetRef (id=RuleActionParameters) at RuleComparisonCommandInputSet.pcf: line 20, column 34
    function def_onEnter_4 (def :  pcf.RuleComparisonCommandParametersInputSet_default) : void {
      def.onEnter(controller, commandDefinitionDiff)
    }
    
    // 'def' attribute on InputSetRef (id=RuleActionParameters) at RuleComparisonCommandInputSet.pcf: line 20, column 34
    function def_onEnter_6 (def :  pcf.RuleComparisonCommandParametersInputSet_generateactivity) : void {
      def.onEnter(controller, commandDefinitionDiff)
    }
    
    // 'def' attribute on InputSetRef (id=RuleActionParameters) at RuleComparisonCommandInputSet.pcf: line 20, column 34
    function def_onEnter_8 (def :  pcf.RuleComparisonCommandParametersInputSet_generatehistoryevent) : void {
      def.onEnter(controller, commandDefinitionDiff)
    }
    
    // 'def' attribute on InputSetRef at RuleComparisonCommandInputSet.pcf: line 14, column 90
    function def_refreshVariables_1 (def :  pcf.RuleComparisonCommandLabelInputSet) : void {
      def.refreshVariables(controller, commandDefinitionDiff.Title)
    }
    
    // 'def' attribute on InputSetRef (id=RuleActionParameters) at RuleComparisonCommandInputSet.pcf: line 20, column 34
    function def_refreshVariables_11 (def :  pcf.RuleComparisonCommandParametersInputSet_setfield) : void {
      def.refreshVariables(controller, commandDefinitionDiff)
    }
    
    // 'def' attribute on InputSetRef at RuleComparisonCommandInputSet.pcf: line 16, column 75
    function def_refreshVariables_3 (def :  pcf.RuleComparisonCommandSequenceInputSet) : void {
      def.refreshVariables(commandDefinitionDiff)
    }
    
    // 'def' attribute on InputSetRef (id=RuleActionParameters) at RuleComparisonCommandInputSet.pcf: line 20, column 34
    function def_refreshVariables_5 (def :  pcf.RuleComparisonCommandParametersInputSet_default) : void {
      def.refreshVariables(controller, commandDefinitionDiff)
    }
    
    // 'def' attribute on InputSetRef (id=RuleActionParameters) at RuleComparisonCommandInputSet.pcf: line 20, column 34
    function def_refreshVariables_7 (def :  pcf.RuleComparisonCommandParametersInputSet_generateactivity) : void {
      def.refreshVariables(controller, commandDefinitionDiff)
    }
    
    // 'def' attribute on InputSetRef (id=RuleActionParameters) at RuleComparisonCommandInputSet.pcf: line 20, column 34
    function def_refreshVariables_9 (def :  pcf.RuleComparisonCommandParametersInputSet_generatehistoryevent) : void {
      def.refreshVariables(controller, commandDefinitionDiff)
    }
    
    // 'mode' attribute on InputSetRef (id=RuleActionParameters) at RuleComparisonCommandInputSet.pcf: line 20, column 34
    function mode_12 () : java.lang.Object {
      return (commandDefinitionDiff.Left ?: commandDefinitionDiff.Right).RuleActionKey
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