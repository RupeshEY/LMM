package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CommandDefinitionDV.setfield.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CommandDefinitionDV_setfieldExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/CommandDefinitionDV.setfield.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommandDefinitionDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=NonNull) at CommandDefinitionDV.setfield.pcf: line 23, column 23
    function def_onEnter_2 (def :  pcf.ValidatingCommandParameterInputSet) : void {
      def.onEnter(commandDefinition.getParameterHolder(config.SET_ONLY_IF_NULL.Name))
    }
    
    // 'def' attribute on InputSetRef (id=Field) at CommandDefinitionDV.setfield.pcf: line 26, column 21
    function def_onEnter_4 (def :  pcf.ValidatingCommandParameterInputSet) : void {
      def.onEnter(commandDefinition.getParameterHolder(config.PROPERTY.Name))
    }
    
    // 'def' attribute on InputSetRef (id=Value) at CommandDefinitionDV.setfield.pcf: line 29, column 21
    function def_onEnter_6 (def :  pcf.ValidatingCommandParameterInputSet) : void {
      def.onEnter(commandDefinition.getParameterHolder(config.VALUE.Name))
    }
    
    // 'def' attribute on InputSetRef (id=ObjectFieldToSetWarnings) at CommandDefinitionDV.setfield.pcf: line 33, column 41
    function def_onEnter_9 (def :  pcf.ValidationWarningsInputSet) : void {
      def.onEnter(state.getWarnings(), false)
    }
    
    // 'def' attribute on InputSetRef (id=ObjectFieldToSetWarnings) at CommandDefinitionDV.setfield.pcf: line 33, column 41
    function def_refreshVariables_10 (def :  pcf.ValidationWarningsInputSet) : void {
      def.refreshVariables(state.getWarnings(), false)
    }
    
    // 'def' attribute on InputSetRef (id=NonNull) at CommandDefinitionDV.setfield.pcf: line 23, column 23
    function def_refreshVariables_3 (def :  pcf.ValidatingCommandParameterInputSet) : void {
      def.refreshVariables(commandDefinition.getParameterHolder(config.SET_ONLY_IF_NULL.Name))
    }
    
    // 'def' attribute on InputSetRef (id=Field) at CommandDefinitionDV.setfield.pcf: line 26, column 21
    function def_refreshVariables_5 (def :  pcf.ValidatingCommandParameterInputSet) : void {
      def.refreshVariables(commandDefinition.getParameterHolder(config.PROPERTY.Name))
    }
    
    // 'def' attribute on InputSetRef (id=Value) at CommandDefinitionDV.setfield.pcf: line 29, column 21
    function def_refreshVariables_7 (def :  pcf.ValidatingCommandParameterInputSet) : void {
      def.refreshVariables(commandDefinition.getParameterHolder(config.VALUE.Name))
    }
    
    // 'initialValue' attribute on Variable at CommandDefinitionDV.setfield.pcf: line 14, column 85
    function initialValue_0 () : gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterConfig {
      return gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterSet.Config
    }
    
    // 'initialValue' attribute on Variable at CommandDefinitionDV.setfield.pcf: line 19, column 78
    function initialValue_1 () : gw.bizrules.ruleaction.setfield.SetFieldCommandDefinitionState {
      return new gw.bizrules.ruleaction.setfield.SetFieldCommandDefinitionState(commandDefinition)
    }
    
    // 'visible' attribute on InputSetRef (id=ObjectFieldToSetWarnings) at CommandDefinitionDV.setfield.pcf: line 33, column 41
    function visible_8 () : java.lang.Boolean {
      return state.showWarnings()
    }
    
    property get commandDefinition () : gw.bizrules.pcf.RuleCommandDefinitionHolder {
      return getRequireValue("commandDefinition", 0) as gw.bizrules.pcf.RuleCommandDefinitionHolder
    }
    
    property set commandDefinition ($arg :  gw.bizrules.pcf.RuleCommandDefinitionHolder) {
      setRequireValue("commandDefinition", 0, $arg)
    }
    
    property get config () : gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterConfig {
      return getVariableValue("config", 0) as gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterConfig
    }
    
    property set config ($arg :  gw.bizrules.ruleaction.setfield.config.SetFieldCommandParameterConfig) {
      setVariableValue("config", 0, $arg)
    }
    
    property get state () : gw.bizrules.ruleaction.setfield.SetFieldCommandDefinitionState {
      return getVariableValue("state", 0) as gw.bizrules.ruleaction.setfield.SetFieldCommandDefinitionState
    }
    
    property set state ($arg :  gw.bizrules.ruleaction.setfield.SetFieldCommandDefinitionState) {
      setVariableValue("state", 0, $arg)
    }
    
    
  }
  
  
}