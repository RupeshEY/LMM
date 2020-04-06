package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/activityassignee/AssigneeAdditionalInfoInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssigneeAdditionalInfoInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/activityassignee/AssigneeAdditionalInfoInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssigneeAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get commandDefinition () : gw.bizrules.pcf.RuleCommandDefinitionHolder {
      return getRequireValue("commandDefinition", 0) as gw.bizrules.pcf.RuleCommandDefinitionHolder
    }
    
    property set commandDefinition ($arg :  gw.bizrules.pcf.RuleCommandDefinitionHolder) {
      setRequireValue("commandDefinition", 0, $arg)
    }
    
    property get config () : gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterConfig {
      return getRequireValue("config", 0) as gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterConfig
    }
    
    property set config ($arg :  gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterConfig) {
      setRequireValue("config", 0, $arg)
    }
    
    property get state () : gw.bizrules.ruleaction.generateactivity.GenerateActivityCommandDefinitionState {
      return getRequireValue("state", 0) as gw.bizrules.ruleaction.generateactivity.GenerateActivityCommandDefinitionState
    }
    
    property set state ($arg :  gw.bizrules.ruleaction.generateactivity.GenerateActivityCommandDefinitionState) {
      setRequireValue("state", 0, $arg)
    }
    
    
  }
  
  
}