package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RelatedToInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RelatedToInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RelatedToInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedToInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=ValidationErrorsRelatedTo) at RelatedToInputSet.pcf: line 29, column 39
    function def_onEnter_8 (def :  pcf.ValidationErrorsInputSet) : void {
      def.onEnter(commandDefinition.getParameterHolder(relatedToConfig.Name).validate(),false)
    }
    
    // 'def' attribute on InputSetRef (id=ValidationErrorsRelatedTo) at RelatedToInputSet.pcf: line 29, column 39
    function def_refreshVariables_9 (def :  pcf.ValidationErrorsInputSet) : void {
      def.refreshVariables(commandDefinition.getParameterHolder(relatedToConfig.Name).validate(),false)
    }
    
    // 'value' attribute on RangeInput (id=RelatedToInput) at RelatedToInputSet.pcf: line 24, column 98
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      state.RelatedTo = (__VALUE_TO_SET as gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ActivityRulesRelatedTo)
    }
    
    // 'optionLabel' attribute on RangeInput (id=RelatedToInput) at RelatedToInputSet.pcf: line 24, column 98
    function optionLabel_4 (VALUE :  gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ActivityRulesRelatedTo) : java.lang.String {
      return VALUE.UIDisplayName
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToInput) at RelatedToInputSet.pcf: line 24, column 98
    function valueRange_5 () : java.lang.Object {
      return state.getValueRange(relatedToConfig, commandDefinition, gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ActivityRulesRelatedTo)
    }
    
    // 'value' attribute on RangeInput (id=RelatedToInput) at RelatedToInputSet.pcf: line 24, column 98
    function valueRoot_3 () : java.lang.Object {
      return state
    }
    
    // 'value' attribute on RangeInput (id=RelatedToInput) at RelatedToInputSet.pcf: line 24, column 98
    function value_0 () : gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ActivityRulesRelatedTo {
      return state.RelatedTo
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToInput) at RelatedToInputSet.pcf: line 24, column 98
    function verifyValueRangeIsAllowedType_6 ($$arg :  gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ActivityRulesRelatedTo[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToInput) at RelatedToInputSet.pcf: line 24, column 98
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=RelatedToInput) at RelatedToInputSet.pcf: line 24, column 98
    function verifyValueRange_7 () : void {
      var __valueRangeArg = state.getValueRange(relatedToConfig, commandDefinition, gw.bizrules.ruleaction.behavioralcommandparam.relatedto.ActivityRulesRelatedTo)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    property get commandDefinition () : gw.bizrules.pcf.RuleCommandDefinitionHolder {
      return getRequireValue("commandDefinition", 0) as gw.bizrules.pcf.RuleCommandDefinitionHolder
    }
    
    property set commandDefinition ($arg :  gw.bizrules.pcf.RuleCommandDefinitionHolder) {
      setRequireValue("commandDefinition", 0, $arg)
    }
    
    property get relatedToConfig () : gw.bizrules.ruleaction.config.CCCommandParameterDefinition {
      return getRequireValue("relatedToConfig", 0) as gw.bizrules.ruleaction.config.CCCommandParameterDefinition
    }
    
    property set relatedToConfig ($arg :  gw.bizrules.ruleaction.config.CCCommandParameterDefinition) {
      setRequireValue("relatedToConfig", 0, $arg)
    }
    
    property get state () : gw.bizrules.ruleaction.behavioralcommandparam.relatedto.HasRelatedToRuleActionCommandDefinitionState {
      return getRequireValue("state", 0) as gw.bizrules.ruleaction.behavioralcommandparam.relatedto.HasRelatedToRuleActionCommandDefinitionState
    }
    
    property set state ($arg :  gw.bizrules.ruleaction.behavioralcommandparam.relatedto.HasRelatedToRuleActionCommandDefinitionState) {
      setRequireValue("state", 0, $arg)
    }
    
    
  }
  
  
}