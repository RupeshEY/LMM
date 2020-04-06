package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/activityassignee/AssigneeAdditionalInfoInputSet.queue.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssigneeAdditionalInfoInputSet_queueExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/activityassignee/AssigneeAdditionalInfoInputSet.queue.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssigneeAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on PickerInput (id=QueuePicker) at AssigneeAdditionalInfoInputSet.queue.pcf: line 25, column 35
    function action_1 () : void {
      AssigneePickerPopup.push(new gw.bizrules.ruleaction.generateactivity.GenerateActivityAssigneePicker(AssignmentSearchType.TC_QUEUE))
    }
    
    // 'pickLocation' attribute on PickerInput (id=QueuePicker) at AssigneeAdditionalInfoInputSet.queue.pcf: line 25, column 35
    function action_dest_2 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.bizrules.ruleaction.generateactivity.GenerateActivityAssigneePicker(AssignmentSearchType.TC_QUEUE))
    }
    
    // 'conversionExpression' attribute on PickerInput (id=QueuePicker) at AssigneeAdditionalInfoInputSet.queue.pcf: line 25, column 35
    function conversionExpression_3 (PickedValue :  gw.api.assignment.Assignee) : AssignableQueue {
      return PickedValue as AssignableQueue
    }
    
    // 'value' attribute on PickerInput (id=QueuePicker) at AssigneeAdditionalInfoInputSet.queue.pcf: line 25, column 35
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      state.Queue = (__VALUE_TO_SET as AssignableQueue)
    }
    
    // 'value' attribute on PickerInput (id=QueuePicker) at AssigneeAdditionalInfoInputSet.queue.pcf: line 25, column 35
    function valueRoot_6 () : java.lang.Object {
      return state
    }
    
    // 'value' attribute on PickerInput (id=QueuePicker) at AssigneeAdditionalInfoInputSet.queue.pcf: line 25, column 35
    function value_0 () : AssignableQueue {
      return state.Queue
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