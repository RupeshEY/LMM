package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CommandDefinitionDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CommandDefinitionDV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/CommandDefinitionDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommandDefinitionDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on InputIterator (id=RuleCommandParameters) at CommandDefinitionDV.default.pcf: line 17, column 66
    function value_2 () : gw.bizrules.pcf.RuleCommandParameterHolder[] {
      return commandDefinition.ParameterHolders.where(\elt -> elt.UIConfig.isVisible())
    }
    
    property get commandDefinition () : gw.bizrules.pcf.RuleCommandDefinitionHolder {
      return getRequireValue("commandDefinition", 0) as gw.bizrules.pcf.RuleCommandDefinitionHolder
    }
    
    property set commandDefinition ($arg :  gw.bizrules.pcf.RuleCommandDefinitionHolder) {
      setRequireValue("commandDefinition", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/bizrules/CommandDefinitionDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CommandDefinitionDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=RuleCommandParameter) at CommandDefinitionDV.default.pcf: line 20, column 38
    function def_onEnter_0 (def :  pcf.ValidatingCommandParameterInputSet) : void {
      def.onEnter(commandParameterHolder)
    }
    
    // 'def' attribute on InputSetRef (id=RuleCommandParameter) at CommandDefinitionDV.default.pcf: line 20, column 38
    function def_refreshVariables_1 (def :  pcf.ValidatingCommandParameterInputSet) : void {
      def.refreshVariables(commandParameterHolder)
    }
    
    property get commandParameterHolder () : gw.bizrules.pcf.RuleCommandParameterHolder {
      return getIteratedValue(1) as gw.bizrules.pcf.RuleCommandParameterHolder
    }
    
    
  }
  
  
}