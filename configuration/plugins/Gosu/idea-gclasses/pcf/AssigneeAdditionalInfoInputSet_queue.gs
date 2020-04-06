package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/activityassignee/AssigneeAdditionalInfoInputSet.queue.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AssigneeAdditionalInfoInputSet_queue extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($commandDefinition :  gw.bizrules.pcf.RuleCommandDefinitionHolder, $state :  gw.bizrules.ruleaction.generateactivity.GenerateActivityCommandDefinitionState, $config :  gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterConfig) : void {
    __widgetOf(this, pcf.AssigneeAdditionalInfoInputSet_queue, SECTION_WIDGET_CLASS).setVariables(false, {$commandDefinition, $state, $config})
  }
  
  function refreshVariables ($commandDefinition :  gw.bizrules.pcf.RuleCommandDefinitionHolder, $state :  gw.bizrules.ruleaction.generateactivity.GenerateActivityCommandDefinitionState, $config :  gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterConfig) : void {
    __widgetOf(this, pcf.AssigneeAdditionalInfoInputSet_queue, SECTION_WIDGET_CLASS).setVariables(true, {$commandDefinition, $state, $config})
  }
  
  
}