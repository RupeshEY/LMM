package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonCommandParametersInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends RuleComparisonCommandParametersInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at RuleComparisonCommandParametersInputSet.default.pcf: line 20, column 53
    function def_onEnter_0 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.onEnter(row)
    }
    
    // 'def' attribute on InputSetRef at RuleComparisonCommandParametersInputSet.default.pcf: line 20, column 53
    function def_refreshVariables_1 (def :  pcf.RuleComparisonRowStringInputSet) : void {
      def.refreshVariables(row)
    }
    
    property get row () : gw.bizrules.pcf.RuleComparisonRow<String> {
      return getIteratedValue(1) as gw.bizrules.pcf.RuleComparisonRow<String>
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonCommandParametersInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on InputIterator at RuleComparisonCommandParametersInputSet.default.pcf: line 18, column 65
    function value_2 () : List<gw.bizrules.pcf.RuleComparisonRow> {
      return commandDefinitionDiff.Rows
    }
    
    // 'valueType' attribute on InputIterator at RuleComparisonCommandParametersInputSet.default.pcf: line 18, column 65
    function verifyValueTypeIsAllowedType_3 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator at RuleComparisonCommandParametersInputSet.default.pcf: line 18, column 65
    function verifyValueTypeIsAllowedType_3 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueType' attribute on InputIterator at RuleComparisonCommandParametersInputSet.default.pcf: line 18, column 65
    function verifyValueType_4 () : void {
      var __valueTypeArg : List<gw.bizrules.pcf.RuleComparisonRow>
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the valueType is not a valid type for use with an iterator
      // The valueType for an iterator must be an array or extend from List or IQueryBeanResult
      verifyValueTypeIsAllowedType_3(__valueTypeArg)
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