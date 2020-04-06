package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/CommandDefinitionDV.generatehistoryevent.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CommandDefinitionDV_generatehistoryeventExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/CommandDefinitionDV.generatehistoryevent.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommandDefinitionDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=RelatedToRef) at CommandDefinitionDV.generatehistoryevent.pcf: line 36, column 28
    function def_onEnter_11 (def :  pcf.RelatedToInputSet) : void {
      def.onEnter(state,commandDefinition, config.RELATED_TO)
    }
    
    // 'def' attribute on InputSetRef (id=Description) at CommandDefinitionDV.generatehistoryevent.pcf: line 39, column 27
    function def_onEnter_13 (def :  pcf.ValidatingCommandParameterInputSet) : void {
      def.onEnter(commandDefinition.getParameterHolder(config.DESCRIPTION.Name))
    }
    
    // 'def' attribute on InputSetRef (id=ValidationErrorsType) at CommandDefinitionDV.generatehistoryevent.pcf: line 33, column 36
    function def_onEnter_9 (def :  pcf.ValidationErrorsInputSet) : void {
      def.onEnter(state.validateTypeField(), true)
    }
    
    // 'def' attribute on InputSetRef (id=ValidationErrorsType) at CommandDefinitionDV.generatehistoryevent.pcf: line 33, column 36
    function def_refreshVariables_10 (def :  pcf.ValidationErrorsInputSet) : void {
      def.refreshVariables(state.validateTypeField(), true)
    }
    
    // 'def' attribute on InputSetRef (id=RelatedToRef) at CommandDefinitionDV.generatehistoryevent.pcf: line 36, column 28
    function def_refreshVariables_12 (def :  pcf.RelatedToInputSet) : void {
      def.refreshVariables(state,commandDefinition, config.RELATED_TO)
    }
    
    // 'def' attribute on InputSetRef (id=Description) at CommandDefinitionDV.generatehistoryevent.pcf: line 39, column 27
    function def_refreshVariables_14 (def :  pcf.ValidatingCommandParameterInputSet) : void {
      def.refreshVariables(commandDefinition.getParameterHolder(config.DESCRIPTION.Name))
    }
    
    // 'value' attribute on RangeInput (id=TypeInput) at CommandDefinitionDV.generatehistoryevent.pcf: line 27, column 84
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      state.TypeField = (__VALUE_TO_SET as gw.bizrules.ruleaction.generatehistoryevent.HistoryTypeWrapper)
    }
    
    // 'initialValue' attribute on Variable at CommandDefinitionDV.generatehistoryevent.pcf: line 15, column 102
    function initialValue_0 () : gw.bizrules.ruleaction.generatehistoryevent.GenerateHistoryEventCommandDefinitionState {
      return new gw.bizrules.ruleaction.generatehistoryevent.GenerateHistoryEventCommandDefinitionState(commandDefinition)
    }
    
    // 'initialValue' attribute on Variable at CommandDefinitionDV.generatehistoryevent.pcf: line 19, column 109
    function initialValue_1 () : gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterConfig {
      return gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterSet.Config
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeInput) at CommandDefinitionDV.generatehistoryevent.pcf: line 27, column 84
    function valueRange_6 () : java.lang.Object {
      return gw.bizrules.ruleaction.generatehistoryevent.HistoryTypeWrapper.PossibleValues
    }
    
    // 'value' attribute on RangeInput (id=TypeInput) at CommandDefinitionDV.generatehistoryevent.pcf: line 27, column 84
    function valueRoot_5 () : java.lang.Object {
      return state
    }
    
    // 'value' attribute on RangeInput (id=TypeInput) at CommandDefinitionDV.generatehistoryevent.pcf: line 27, column 84
    function value_2 () : gw.bizrules.ruleaction.generatehistoryevent.HistoryTypeWrapper {
      return state.TypeField
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeInput) at CommandDefinitionDV.generatehistoryevent.pcf: line 27, column 84
    function verifyValueRangeIsAllowedType_7 ($$arg :  gw.bizrules.ruleaction.generatehistoryevent.HistoryTypeWrapper[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeInput) at CommandDefinitionDV.generatehistoryevent.pcf: line 27, column 84
    function verifyValueRangeIsAllowedType_7 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeInput) at CommandDefinitionDV.generatehistoryevent.pcf: line 27, column 84
    function verifyValueRange_8 () : void {
      var __valueRangeArg = gw.bizrules.ruleaction.generatehistoryevent.HistoryTypeWrapper.PossibleValues
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_7(__valueRangeArg)
    }
    
    property get commandDefinition () : gw.bizrules.pcf.RuleCommandDefinitionHolder {
      return getRequireValue("commandDefinition", 0) as gw.bizrules.pcf.RuleCommandDefinitionHolder
    }
    
    property set commandDefinition ($arg :  gw.bizrules.pcf.RuleCommandDefinitionHolder) {
      setRequireValue("commandDefinition", 0, $arg)
    }
    
    property get config () : gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterConfig {
      return getVariableValue("config", 0) as gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterConfig
    }
    
    property set config ($arg :  gw.bizrules.ruleaction.generatehistoryevent.config.GenerateHistoryEventCommandParameterConfig) {
      setVariableValue("config", 0, $arg)
    }
    
    property get state () : gw.bizrules.ruleaction.generatehistoryevent.GenerateHistoryEventCommandDefinitionState {
      return getVariableValue("state", 0) as gw.bizrules.ruleaction.generatehistoryevent.GenerateHistoryEventCommandDefinitionState
    }
    
    property set state ($arg :  gw.bizrules.ruleaction.generatehistoryevent.GenerateHistoryEventCommandDefinitionState) {
      setVariableValue("state", 0, $arg)
    }
    
    
  }
  
  
}