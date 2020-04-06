package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandSequenceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonCommandSequenceInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandSequenceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonCommandSequenceInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at RuleComparisonCommandSequenceInputSet.pcf: line 11, column 82
    function def_onEnter_0 (def :  pcf.RuleComparisonRowIntegerInputSet) : void {
      def.onEnter(commandDefinitionDiff.SequenceRow)
    }
    
    // 'def' attribute on InputSetRef at RuleComparisonCommandSequenceInputSet.pcf: line 11, column 82
    function def_refreshVariables_1 (def :  pcf.RuleComparisonRowIntegerInputSet) : void {
      def.refreshVariables(commandDefinitionDiff.SequenceRow)
    }
    
    property get commandDefinitionDiff () : gw.bizrules.diff.RuleMatchableDiffPair<RuleCommandDefinition> {
      return getRequireValue("commandDefinitionDiff", 0) as gw.bizrules.diff.RuleMatchableDiffPair<RuleCommandDefinition>
    }
    
    property set commandDefinitionDiff ($arg :  gw.bizrules.diff.RuleMatchableDiffPair<RuleCommandDefinition>) {
      setRequireValue("commandDefinitionDiff", 0, $arg)
    }
    
    
  }
  
  
}